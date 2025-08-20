package Arrays;

import java.util.Scanner;

public class SortArrayOf_012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements (0, 1, 2): ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        SortArrayOf_012 obj = new SortArrayOf_012();
        obj.swap(arr, n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    void swap(int arr[], int n) {
        int start = 0, mid = 0, end = n - 1;
        while (mid <= end) {
            if (arr[mid] == 0) {
                // swap arr[start] and arr[mid]
                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                start++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                // swap arr[mid] and arr[end]
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
    }

}
