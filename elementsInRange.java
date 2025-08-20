package Arrays;

import java.util.Scanner;
public class elementsInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements in sorted manner: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the first num: ");
        int A =sc.nextInt();
        System.out.print("Enter the second num: ");
        int B =sc.nextInt();

        calculate(arr, A, B, n);
    }

    static void calculate(int[] arr, int A, int B, int n) {
        for(int i = A; i< B; i++) {
            boolean isFound=false;
            for(int j=0;j<n;j++) {
                if(arr[j]==i) {
                    isFound=true;
                    break;
                }
            }
            if(isFound==false) {
                System.out.println("All elements are not present");
                return;
            }
            System.out.print(i+" ");
        }
        System.out.println("-> All elements are found");
    }
}
