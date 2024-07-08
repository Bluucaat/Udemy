public class NumberInWord {
    public static void printNumberInWord(int number){
    String[] numberWords = new String[]{"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE",
                                        "SIX", "SEVEN", "EIGHT", "NINE", "TEN"};
        if(number >= 0 && number < 10) {
            System.out.println(numberWords[number]);
        }else{
            System.out.println("OTHER");
        }
    }
}
