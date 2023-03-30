package Practice_Area;

public class String_Palindrome {
    public static void main(String[] args) {

        System.out.println("isPalindrome(\"kayak\") = " + isPalindrome("Kayak"));

    }

    //String palindrome. Write a method that checks if a String is a palindrome
    //kayak
    public static boolean isPalindrome(String str) {

        StringBuilder sb = new StringBuilder(str.length());

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString().equalsIgnoreCase(str);
    }

    public static boolean isPalindromeSolution2(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }


}
