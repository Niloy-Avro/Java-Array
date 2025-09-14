package Arrays;

import java.util.Scanner;

public class maximumOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        findOccurence(arr, n);
    }
    static void findOccurence(int[] arr, int n) {
        int freq = 0, num =-1;
        for(int i=0;i<n;i++) {
            if(freq==0) {
                num = arr[i];
            }
            if(num==arr[i]) freq++;
            else freq--;
        }
        freq = 0;
        for(int i=0;i<n;i++) {
            if(num==arr[i]) freq++;
        }
        System.out.println("Most occurence: "+num+" and the frequency is: "+freq);
    }
}
