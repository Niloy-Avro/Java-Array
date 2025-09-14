package Arrays;

import java.util.Scanner;

public class StockBuyandSell_MultipleTransactionAllowed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter prices:");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        maxProfit(arr, n);
    }
    static void maxProfit(int[] arr, int n) {
        int maxProfit=Integer.MIN_VALUE;
        for(int i=1;i<n;i++) {
            if(arr[i]>arr[i-1]) {
                maxProfit=maxProfit+(arr[i]-arr[i-1]);
            }
        }
        System.out.println("Maximum Profit is: "+maxProfit);
    }
}
