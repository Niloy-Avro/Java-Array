package Arrays;

import java.util.Scanner;
public class palindromicArray {
    static int isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

       if(original==reversed) return 1;
       else return 0;
    }

    static int array(int[] arr, int n) {
        int count=0;
        for(int i=0;i<n;i++) {
            if(isPalindrome(arr[i])==1) {
                count++;
            }
            else {
                count=0;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        if(array(arr, n)>0)
            System.out.println("Palindromic Array");
        else
            System.out.println("Not palindromic Array");

    }
}
