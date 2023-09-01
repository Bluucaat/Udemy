import java.util.Arrays;
import java.util.Random;

public class ChallengeOne
{
    public static void main(String[] args) {


        int[] originalArray = getRandomArray(10);
        Arrays.sort(originalArray);
        int[] sortedArray = new int[originalArray.length];
        int j = 0;
        for(int i = originalArray.length; i>0; i--){
            sortedArray[j] = originalArray[i-1];
            j++;
        }
        System.out.println(Arrays.toString(sortedArray));

    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i<len; i++){
            newInt[i] = random.nextInt();
        }

        return newInt;
    }

}
