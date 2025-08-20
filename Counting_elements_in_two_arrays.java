package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Counting_elements_in_two_arrays {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st array size: " );
        int n =sc.nextInt();
        System.out.println("Enter 2nd array size: " );
        int m = sc.nextInt();

        int[] arr1=new int[n];
        int[] arr2=new int[m];
        System.out.println("Enter elements for 1st array: ");
        for(int i=0;i<n;i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements for 2nd array: ");
        for(int i=0;i<m;i++) {
            arr2[i]=sc.nextInt();
        }
        
        check(arr1, arr2, n, m);
    }

    static void check(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
            int count=0;
            for(int j=0;j<m;j++) {
                if(arr2[j]<=arr1[i]) {
                    count++;
                }
            }
            list.add(count);
        }  
        System.out.println("Ans is: "+list);
    }
}
