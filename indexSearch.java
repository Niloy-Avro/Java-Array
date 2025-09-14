package Arrays;

import java.util.Scanner;
public class indexSearch {

    //Using Linear Search
    static int index(int[] arr, int size, int start, int element) {
//        if(start==size) return -1;
//        if(arr[start]==element) return start;
//        else return index(arr, size, start+1, element);
        for(int i=0;i<size;i++) {
            if(element==arr[i]) return i;
        }
        return -1;
    }

    //Using Binary Search
    static int bIndex(int[] arr, int start, int end, int el) {
        if (start > end) return -1;
        int mid = (start+end)/2;
        if(arr[mid]==el) {
            return mid;
        }
        else if(el>arr[mid]) {
            return bIndex(arr, mid+1, end, el);
        }
        else {
            return bIndex(arr, start, mid-1, el);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element: ");
        int element=sc.nextInt();

        
        int start=0;
        System.out.println("The first occurrence of "+element+" at index (using linear Search): "+index(arr, size, start, element));
        System.out.println("The first occurrence of "+element+" at index (using binary Search): "+bIndex(arr, start, size, element));
    }
}