package Arrays;

import java.util.*;

public class missingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();

        int[] arr = new int[n-1];
        System.out.println("Enter "+(n - 1)+" elements: ");
        for(int i=0;i<n-1;i++) {
            arr[i]=sc.nextInt();
        }
        missing(arr, n);
    }
    static void missing(int[] arr, int n) {
        int sum=0;
        for(int i=0;i<n-1;i++) {
            sum+=arr[i];
        }

        int first_ele = arr[0];
        int last_ele = first_ele + n - 1;

        int expectedSum=(n* (first_ele + last_ele)) /2;

        System.out.println("Missing value is: "+(expectedSum-sum));
    }
}