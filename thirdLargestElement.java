package Arrays;

import java.util.Scanner;

public class thirdLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        thirdLarge(arr, n);
    }
    static void thirdLarge(int[] arr, int n) {
        int first = Integer.MIN_VALUE,
            second = Integer.MIN_VALUE,
            third = Integer.MIN_VALUE;
        for(int i=1;i<n;i++) {
            if(arr[i]>first) {
                third = second;
                second = first;
                first = arr[i];
            } else if(arr[i]<first && arr[i]> second) {
                third = second;
                second = arr[i];
            } else if(arr[i]< second && arr[i]> third) {
                third = arr[i];
            }
        }
        System.out.println("First Largest number is: "+first);
        System.out.println("Second Largest number is: "+second);
        System.out.println("Third Largest Number is: "+ third);
    }
}
