package Arrays;

import java.util.Scanner;

public class sumOfArray {
    static int Sum(int[] arr, int n) {
        int sum=0;

        for(int i=0;i<n;i++) {
            sum+=arr[i];
        }
        return sum;
    }

//    static int sum(int[] arr, int n)
//    {
             // base or terminating condition
//        if (n <= 0) {
//            return 0;
//        }
            // Calling method recursively
//        return sum(arr, n - 1) + arr[n - 1];
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The sum of numbers: "+Sum(arr, n));
    }

}
