public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        if (firstNumber == secondNumber) return true;
        if (Math.abs(firstNumber - secondNumber) >= 0.001) return false;
        String firstString = String.valueOf(Math.abs(firstNumber));
        String secondString = String.valueOf(Math.abs(secondNumber));

        return (firstString.substring(0, 5).equals(secondString.substring(0, 5)));
    }
}
