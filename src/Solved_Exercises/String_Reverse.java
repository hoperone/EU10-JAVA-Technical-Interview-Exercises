package Solved_Exercises;

public class String_Reverse {

    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder(str.length());

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    //Here's how the method works:
    //
    //First, the method checks if the input string is null or empty. If so, it just returns the input string as-is, since there's nothing to reverse.
    //Next, it creates a StringBuilder object, which is a mutable sequence of characters. We'll use this object to build up the reversed string.
    //Then, the method loops through the characters in the input string from back to front, appending each character to the StringBuilder.
    //Finally, the method returns the reversed string by converting the StringBuilder to a String.

}
