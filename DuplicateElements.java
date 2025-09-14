package Arrays;

import java.util.ArrayList;
import java.util.Scanner;
public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        check(arr, n);
    }

    static void check(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]==arr[j] && !list.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }
        }
        System.out.println(list);
    }
}
