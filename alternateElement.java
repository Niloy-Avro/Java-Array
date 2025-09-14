package Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class alternateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        alternate(arr, n);
    }

    static void alternate(int[] arr, int n) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int i=0;i<n;i=i+2) {
            list.add(arr[i]);
        }
        System.out.println("The alternate elements of the array are: "+list);
    }
}
