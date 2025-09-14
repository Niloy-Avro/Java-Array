package Arrays;

import java.util.Scanner;

//! For Sorted Array
public class RemoveDuplicatesinSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        removeDuplicate(arr, n);
    }
    static void removeDuplicate(int[] arr, int n) {

        int index = 1;
        for(int i=1;i<n;i++) {
            if(arr[i-1]!=arr[i]) {
                arr[index]=arr[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}