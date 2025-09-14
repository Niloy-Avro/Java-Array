package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

class Missing_and_Repeating_in_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        find(arr, n);
    }
    static void find(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] freq = new int[n+1];
        for(int i=0;i<n;i++) {
            freq[arr[i]]++;
        }
        int repeating = -1, missing = -1;
        for(int i=1;i<=n;i++) { //ei loop ta freq array freq[n+1] er respect a cholche...
            if(freq[i]==2) repeating = i;
            if(freq[i]==0) missing = i;
        }
        list.add(repeating);
        list.add(missing);
        System.out.println("[repeating, missing]:"+list);
    }
}
