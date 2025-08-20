package Arrays;

import java.util.Scanner;
public class countZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int result = firstIndex(arr, n);
        if(result==-1) System.out.println("number of zeros: Empty");
        else System.out.println("number of zeros: "+(n-result));
    }
    
    static int firstIndex(int[] arr, int n) {
        for(int i=0;i<n;i++) {
            if(arr[i]==0) {
                return i;
            }
        }
        return -1;
    }
}