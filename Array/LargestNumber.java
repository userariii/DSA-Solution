package Array;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();
        int largestValue = sort(inVal(size));
        System.out.println("The Largest value is: "+ largestValue);

    }

//    Driver code starting here
//    This set of code will return the largest value of an Array
    public static int sort(int[] arr) {
        int longestValue = 0;
        for (int i = 0; i<arr.length; i++) {
           if (arr[i] > longestValue) {
               longestValue = arr[i];
           }
        }
        return longestValue;
    }

//    This set of code will take the size of an Array & the values
    public static int[] inVal(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.print("Enter "+ size +" integer values: ");
        for (int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

}