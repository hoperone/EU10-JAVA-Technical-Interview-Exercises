package Solved_Exercises;

public class Array_Reverse {

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    //It takes an array arr as an argument.
    //It initializes two variables: left and right. left is set to 0, which is the index of the first element in the array. right is set to arr.length - 1, which is the index of the last element in the array.
    //It enters a while loop that continues as long as left < right.
    //Within the loop, it swaps the element at index left with the element at index right. It does this by storing the value of arr[left] in a temporary variable temp, assigning arr[right] to arr[left], and assigning temp to arr[right].
    //After the swap, it increments left and decrements right, so that the loop will eventually terminate.
    //Once the loop terminates, the array will be reversed in place.

}
