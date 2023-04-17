package Array;

import java.util.Scanner;
public class ThirdLargestNumber {

    /*
    Question:
    There going to be 5-digit numbers,
    and the result will be the product of 3rd largest digit
    & 2nd smallest digit
    */

//    Main method starts here...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 integer value: ");
        int[] fiveIntegerNumber = new int[5];
        for (int i = 0; i <fiveIntegerNumber.length; i++) {
            fiveIntegerNumber[i] = sc.nextInt();
        }
        int multi = largestValue(fiveIntegerNumber);
        System.out.println("Third Largest & Second Smallest element is: "+multi);
    }

    /*
    --------------------------------------
          Driver code starts here...
    --------------------------------------
    */

    public static int largestValue(int[] arr) {
//     Sorting here the largest element in an Array
        int largestElement = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i=0; i < arr.length; i++ ) {
            if (arr[i] > largestElement) {
                thirdLargest = secondLargest;
                secondLargest = largestElement;
                largestElement = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largestElement) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if (arr[i] > thirdLargest && arr[i] != secondLargest && arr[i] != largestElement) {
                thirdLargest = arr[i];
            }
        }

//      Sorting here the second-smallest element in an Array
        int small = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < small) {
                secondSmallest = small;
                small = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != small) {
                secondSmallest = arr[i];
            }
        }
        return (thirdLargest*secondSmallest);
    }
}
