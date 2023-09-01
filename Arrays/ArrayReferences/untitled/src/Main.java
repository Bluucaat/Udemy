import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] intArray = new int[5];
        int[] anotherIntArray = intArray;

        intArray[0] = 5;
        modifyArray(intArray);

        System.out.println(Arrays.toString(anotherIntArray));
        System.out.println(Arrays.toString(intArray));

    }
    private static void modifyArray(int[] array){

        array[1] = 2;
    }
}