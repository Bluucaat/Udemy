public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        String numString = Integer.toString(Math.abs(number));
        int left = 0, right = numString.length() - 1;

        while (left < right) {
            if (numString.charAt(left) != numString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
