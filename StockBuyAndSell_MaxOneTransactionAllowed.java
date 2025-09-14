package Arrays;

import java.util.Scanner;

public class StockBuyAndSell_MaxOneTransactionAllowed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        result(arr, n);
    }
    static void result(int[] arr, int n) {
        int mini = arr[0];
        int maxProfit = 0;
        for(int i=1;i<n;i++) {
            int profit=arr[i]-mini;
            maxProfit = Math.max(profit, maxProfit);
            mini = Math.min(arr[i], mini);
        }
        System.out.println("Max Profit: "+maxProfit);
    }
}
