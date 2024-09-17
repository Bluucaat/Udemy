import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;


public class LambdaChallenge {

    private record Person(String first){
        public String last(String s){
            return first + " " + s.substring(0, s.indexof(" "));
        }
    }
    public static void main(String[] args) {
        Person tim = new Person("Tim");
        String[] names = new String[]{"HaNA", "MaNDy", "CHris"};
        List<UnaryOperator<String>> stringFunc = new ArrayList<>(List.of(
                String::toLowerCase,
                s -> s.concat(" " + getRandomLetter() + ". "),
                s -> s.concat(new StringBuilder(s.substring(0, s.indexOf(" "))).reverse().toString()),
                String::new,
                String::valueOf,
                s -> new String("Howdy" + s),
                LambdaChallenge::reverse,
                tim::last, //bounded reciever
                (new Person("MARY"))::last
        ));
        applyChanges(names, stringFunc);

    }

    public static void applyChanges(String[] names, List<UnaryOperator<String>> stringFunctions){
        List<String> backedByArray = Arrays.asList(names);
        for(var function : stringFunctions){
            backedByArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }

    public static char getRandomLetter(){
        return (char) new Random().nextInt(65, 90);
    }
    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
