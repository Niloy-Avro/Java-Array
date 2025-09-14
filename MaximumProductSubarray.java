package Arrays;

import java.util.Scanner;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        maxProduct(arr, n);
    }
    static void maxProduct(int[] arr, int n) {
        int maxPro = arr[0];
        for (int i = 0; i < n; i++) {
            int mul=1;
            for (int j = i; j < n; j++) {
                mul=mul*arr[j];
                maxPro=Math.max(mul, maxPro);
            }
        }
        System.out.println("Maximum Product of the subarray is: "+maxPro);
    }
}
