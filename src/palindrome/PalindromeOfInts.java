package palindrome;

public class PalindromeOfInts {

    public static boolean isPalindrome(int num) {
        if ((num < 0)) {
            return false;
        }
        int rem, sum = 0, temp;
        temp = num;

        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num /= 10;
        }

        return temp == sum;
    }

}
