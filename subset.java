package Arrays;

import java.util.Scanner;

public class subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements: ");
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size for second array: ");
        int m = sc.nextInt();
        System.out.println("Enter the Elements for second array: ");
        int[] arr2 = new int[n];
        for(int i=0;i<m;i++) {
            arr2[i]=sc.nextInt();
        }
        findSubset(arr1, arr2, n, m);
    }
    static void findSubset(int[] arr1, int[] arr2, int size1, int size2) {
        for(int i=0;i<size2;i++) {
            boolean isFound = false;
            for(int j=0;j<size1;j++) {
                if(arr2[i]==arr1[j]) {
                    isFound = true;
                    break;
                }
            }
            if(isFound==false) {
                System.out.println("Not a subset");
                return;
            }
        }
        System.out.println("is a subset");
    }
}
