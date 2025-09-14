package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class medianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter 2nd array size: ");
        int n1= sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n1;i++) {
            arr1[i]=sc.nextInt();
        }
        median(arr, arr1, n, n1);
    }
    static void median(int[] arr, int[] arr1, int n, int n1) {
        ArrayList<Integer> list = new ArrayList<>();
        int right = 0 , left = 0;
        while(right<n && left<n1) {
            if(arr[right] <= arr1[left]) {
                list.add(arr[right]);
                right++;
            }
            else {
                list.add(arr1[left]);
                left++;
            }
        }
        while(right<n) {
            list.add(arr[right]);
            right++;
        }
        while(left<n1) {
            list.add(arr1[left]);
            left++;
        }

        int size = list.size();
        double median;

        if (size % 2 == 1) {
            median = list.get(size / 2);
        } else {
            median = (list.get(size / 2 - 1) + list.get(size / 2)) / 2.0;
        }

        System.out.println("Median is: "+median);
    }
}
