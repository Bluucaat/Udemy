import java.util.Arrays;
import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args) {
        int[] array = getIntegers(5);
        printArray(array);
        System.out.println(Arrays.toString(sortIntegers(array)));
    }
    public static int[] getIntegers(int len) {
        int[] newInt = new int[len];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < len; i++) {

            System.out.println("Element number " + i);
            newInt[i] = sc.nextInt();
        }
        printArray(newInt);
        return newInt;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int[] sortedArray = new int[unsortedArray.length];
        Arrays.sort(unsortedArray);
        int j = 0;
        for (int i = unsortedArray.length-1; i >= 0; i--) {
            sortedArray[j] = unsortedArray[i];
            j++;
        }
        return sortedArray;
    }

}


