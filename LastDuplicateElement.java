package Arrays;

import java.util.Scanner;

public class LastDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        dpele(arr,n);
    }
    public static void dpele(int[] arr, int n) {
        for(int i=n-1;i>0;i--) {
            if(arr[i]==arr[i-1]) {
                System.out.println("Last duplicate element is: "+arr[i]+" and the index is: "+i);
                return;
            }
        }
        System.out.println("No duplicate elements");
    }
}
