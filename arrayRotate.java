package Arrays;

import java.util.Scanner;
public class arrayRotate {
    static void rotate(int[] arr, int rotation, int size) {
        rotation= rotation % size;
        reverse(arr,0,rotation-1);
        reverse(arr, rotation,size-1);
        reverse(arr,0,size-1);
    }

    static void reverse(int arr[], int start, int end) {
        while(start<end) {
            int temp =  arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter rotation: ");
        int a = sc.nextInt();

        rotate(arr, a, n);
        System.out.println("After "+a+" rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

