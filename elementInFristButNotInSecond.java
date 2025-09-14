package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class elementInFristButNotInSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arr1 size: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements: ");
        for(int i=0;i<n1;i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter arr2 size: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements: ");
        for(int i=0;i<n2;i++) {
            arr2[i]=sc.nextInt();
        }
        check(arr1, arr2);
    }
    static void check(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++) {
            boolean isFound = false;
            for(int j=0;j<arr2.length;j++) {
                if(arr1[i]==arr2[j]) {
                    isFound = true;
                    break;
                }
            }
            if(isFound==false) {
                list.add(arr1[i]);
            }
        }
        System.out.println(list);
    }
}
