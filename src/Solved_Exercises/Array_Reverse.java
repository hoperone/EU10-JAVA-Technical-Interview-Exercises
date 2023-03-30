package Solved_Exercises;

public class Array_Reverse {

    public static void reverseArray(int[] arr) {
        // initialize left pointer to the first element
        int left = 0;
        // initialize right pointer to the last element
        int right = arr.length - 1;

        // loop until left and right pointers meet or cross
        while (left < right) {
            // swap the elements at the left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            // move the left pointer to the right
            left++;
            // move the right pointer to the left
            right--;
        }
    }

}
