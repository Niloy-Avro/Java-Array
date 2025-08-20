package Arrays;

import java.util.Scanner;

public class AvgOfArrayElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the avg of elements: " + avg(arr, n));
    }

    static int avg(int[] arr, int n) {
        int sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            count++;
        }
        int avg = sum / count;
        return avg;
    }
}
