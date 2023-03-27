package palindrome;

public class PalindromeExercise {

//      SNIPPET 1
//      By using StringBuilder
    public boolean isPalindrome(String text) {

        if (text == null)
            return false;

        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        String result = sb.toString();
        return result.equalsIgnoreCase(text);
    }



//                SNIPPET 2
//        By using for loop
//    public boolean isPalindrome(String text){
//        if (text == null)
//            return false;
//
//        String result = "";
//
//        for (int i = text.length() - 1; i >= 0; i--) {
//            result += text.charAt(i) + "";
//        }
//        return result.equalsIgnoreCase(text);
//    }

}


