package Array;
public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        int j = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int cal = removeDuplicates(arr);
        System.out.println(cal);
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}