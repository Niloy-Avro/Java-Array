package Arrays;

import java.util.Scanner;
public class indexSearch {
    static int index(int[] arr, int size, int start, int element) {
        if(start==size) return -1;
        if(arr[start]==element) return start;
        else return index(arr, size, start+1, element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element: ");
        int element=sc.nextInt();

        
        int start=0;
        System.out.println("The first occurrence of "+element+" at index: "+index(arr, size, start, element));
    }
}