package Arrays;

import java.util.Scanner;

public class missingElement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        missingElement(arr, n);
    }
    static void missingElement(int[] arr, int n) {
        for(int i=0;i<n;i++) {
            if(arr[i]>=1 && arr[i]<=n && arr[i]!=arr[arr[i]-1]) {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }
        }
        for (int i = 1; i <=n; i++) {
            if(i!=arr[i-1]) {
                System.out.println("Missing is: "+i);
                return;
            }
        }
        System.out.println("Missing is: "+(n+1));
    }
}
