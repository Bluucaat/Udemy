public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sum = 0, digit = 0;
        for (; number > 0; number /= 10)
            if ((digit = number % 10) % 2 == 0) sum += digit;
        return sum;
    }
}
