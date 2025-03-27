import java.util.Scanner;

public class Alternative_Binary_Search {
    public static int binarySearchAlternative(int[] A, int n, int T) {
        int L = 0;
        int R = n - 1;
        
        while (L != R) {
            int m = (int) Math.ceil((L + R) / 2.0);
            
            if (A[m] > T) {
                R = m - 1;
            } else {
                L = m;
            }
        }
        
        return (A[L] == T) ? L : -1; // Check final position
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the target element: ");
        int target = scanner.nextInt();
        
        int result = binarySearchAlternative(arr, n, target);
        
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
        
        scanner.close();
    }
}
