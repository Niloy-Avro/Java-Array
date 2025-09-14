package Arrays;

import java.util.Scanner;

public class MaximumSubarraySum_KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        maxSubarraySum(arr, n);
    }
    static void maxSubarraySum(int[] arr,int n) {
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for(int i=0;i<n;i++) {
            currSum = currSum+arr[i];
            maxSum = Math.max(maxSum,currSum);
            if(currSum<0) {
                currSum = 0;
            }
        }
        System.out.println("Maximum sum of Subarray is: "+maxSum);
    }
}