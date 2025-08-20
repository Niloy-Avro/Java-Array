package Arrays;

import java.util.Scanner;

public class secondLargestElement {
        static int max(int[] arr, int size) {
            int max= Integer.MIN_VALUE;
            int smax = Integer.MIN_VALUE;
            for(int i=0;i<size;i++) {
                if (arr[i]>max) {
                    smax=max;
                    max=arr[i];
                }
                else if(arr[i]<max && arr[i]>smax) {
                    smax=arr[i];
                }
            }

            if(smax==Integer.MIN_VALUE) {
                System.out.println("No 2nd max value");
                return -1;
            }
            return smax;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size: ");
            int size = sc.nextInt();

            int[] arr=new int[size];
            System.out.println("Enter elements: ");
            for(int i=0;i<size;i++) {
                arr[i]=sc.nextInt();
            }

            System.out.println("2nd Largest Element is: "+max(arr,size));
        }
    }

