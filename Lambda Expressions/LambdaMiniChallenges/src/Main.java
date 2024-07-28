import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for(String part : parts){
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part: parts){
                System.out.println(part);
            }
        };

        Consumer<String> printWordsForEach = sentence ->{
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        Consumer<String> printWordsConscise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i< source.length(); i++){
                if(i % 2 == 1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        String secondCharWord = everySecondChar.apply("1234567890");
        System.out.println(secondCharWord);


        System.out.println(everySecondCharacter(everySecondChar, "1234567890"));
    }

    Supplier<String> iLoveJava = () -> "I love Java!";
    Supplier<String> iLoveJava2 = () ->  {return "I love Java!";};

    String supplierResult = iLoveJava.get();


    public static String everySecondCharacter(UnaryOperator<String> operator, String source){
        return operator.apply(source);
    }


}
