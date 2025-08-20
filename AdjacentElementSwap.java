package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class AdjacentElementSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        swap(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int size) {
        for(int i=0;i<size-1;i=i+2) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
}