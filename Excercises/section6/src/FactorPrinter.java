public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) System.out.println("Invalid Value");
        else {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) sb.append(i).append(" ");
            }
            System.out.println(sb);
        }
    }
}
