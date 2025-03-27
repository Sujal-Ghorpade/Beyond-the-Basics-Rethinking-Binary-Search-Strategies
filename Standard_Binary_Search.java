import java.util.Scanner;

public class Standard_Binary_Search {
    public static int binarySearch(int[] A, int n, int T) {
        int L = 0;
        int R = n - 1;
        
        while (L <= R) {
            int m = (L + R) / 2;
            
            if (A[m] < T) {
                L = m + 1;
            } else if (A[m] > T) {
                R = m - 1;
            } else {
                return m; // Target found
            }
        }
        
        return -1; // Unsuccessful search
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
        
        int result = binarySearch(arr, n, target);
        
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
        
        scanner.close();
    }
}
