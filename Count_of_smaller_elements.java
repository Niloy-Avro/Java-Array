package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Count_of_smaller_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            int count = 0;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }
            list.add(count);
        }
        System.out.println("Ans: "+list);
    }
}