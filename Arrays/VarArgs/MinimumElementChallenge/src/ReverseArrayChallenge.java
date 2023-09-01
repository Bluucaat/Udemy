import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void reverse(int[] array){
        int j = 0;
        int temp = 0;
        System.out.print("Array = " + Arrays.toString(array));
        for(int i=(array.length-1); i>array.length/2; i--){
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            j++;
        }
        System.out.print("Reversed array = " + Arrays.toString(array));
    }
}
