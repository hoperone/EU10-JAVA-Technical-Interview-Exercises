package Practice_Area;

import java.util.Arrays;

public class Array_Reverse {
    public static void main(String[] args) {

        int[] ar = {1, 2, 4};

        System.out.println("Arrays.toString(arrayReverse(ar)) = " + Arrays.toString(arrayReverse(ar)));


    }

    ////Array reverse. Write a method that will take an array as an argument and reverse it
    public static int[] arrayReverse(int[] arr) {

        int[] reversedArray = new int[arr.length];

        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[j] = arr[i];
            j++;
        }
        return reversedArray;
    }

}
