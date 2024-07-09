public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int first = number;
        int last = number % 10;

        while (first >= 10) {
            first /= 10;
        }
        return first + last;
    }
}
