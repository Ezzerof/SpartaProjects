package Palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {

    public static boolean isPalindrome(int num) {

        int rem, sum = 0, temp;
        temp = num;

        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num /= 10;
        }

        return temp == sum;
    }



//      SNIPPET 1
//      By using StringBuilder
//    public static boolean isPalindrome(String text) {
//
//        if (text == null)
//            return false;
//
//        StringBuilder sb = new StringBuilder(text);
//        sb.reverse();
//        String result = sb.toString();
//        return result.equalsIgnoreCase(text);
//    }



//                SNIPPET 2
//        By using for loop
    public static boolean isPalindrome(String text){
        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i) + "";
        }
        return result.equalsIgnoreCase(text);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Hannah"));
        System.out.println(isPalindrome(18331));
    }

}


