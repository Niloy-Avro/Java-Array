package Arrays;

import java.util.Scanner;

public class rightRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter rotation position: ");
        int k = sc.nextInt();
        System.out.println("After "+k+" right rotation");
        rotate(arr,n,k);
        for (int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
    static void rotate(int[] arr, int size, int rotation) {
        rotation = rotation % size;
        Arrays.arrayRotate.reverse(arr, size-rotation, size-1);
        Arrays.arrayRotate.reverse(arr, 0, size-rotation-1);
        Arrays.arrayRotate.reverse(arr, 0, size-1);
    }
}
