package Arrays;

import java.util.Scanner;

public class MajorityElement_MooreAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        checkMajority(arr, n);
    }
    static void checkMajority(int[] arr, int n) {
        int freq = 0, num = -1;
        for(int i=0;i<n;i++) {
            if(freq==0) {
                num=arr[i];
            }
            if(num==arr[i]) freq++;
            else freq--;
        }
        freq=0;
        for(int i : arr) {
            if(i == num) freq++;
        }
        if(freq>n/2) System.out.println("Majority element is: "+num);
        else System.out.println("Majority element is: -1");
    }
}
