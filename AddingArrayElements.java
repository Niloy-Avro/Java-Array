package Arrays;

import java.util.PriorityQueue;
import java.util.Scanner;

public class AddingArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number to add elements of an array until every element becomes greater than or equal to the number: ");
        int k = sc.nextInt();
        add(arr, k);
    }

    static void add(int[] arr, int k) {
        try {
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
            for(int i: arr) {
                pq.add(i);
            }
            int step=0;
            while(pq.size()>=2 && pq.peek()<k) {
                int first = pq.poll();
                int second = pq.poll();

                int sum = first+second;
                pq.add(sum);
                step++;
            }
            if(pq.peek()<k) {
                System.out.println("Not possible");
                return;
            }
            System.out.println("Steps needed: "+step);
            System.out.println(pq);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("the Array can't not contain null value");
        }
    }
}
