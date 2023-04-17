package Array;

public class SortedArray {
    public static boolean sortedArray(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
           for (int j = (i+1); j < arr.length; j++) {
               if (arr[j] < arr[i]) {
                   System.out.print("Array is not sorted, so return value: ");
                   return false;
               }
           }
       }
        System.out.print("Array is sorted, so return value: ");
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        boolean sortedOrNot = sortedArray(arr);
        System.out.println(sortedOrNot);
    }
}
