import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] myNumArray = readIntegers();
        System.out.println("The min is: " + findMin(myNumArray));

    }

    public static int[] readIntegers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = in.nextLine();
        String[] splits = input.split(",");
        int[] numArray = new int[splits.length];

        for(int i = 0; i<splits.length; i++){
            numArray[i] = Integer.parseInt(splits[i]);
    }

        return numArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int el:array){
            if(min > el){
                min = el;
            }
        }
        return min;
    }

}