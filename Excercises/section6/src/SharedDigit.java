import java.util.*;
public class SharedDigit {
    public static boolean hasSharedDigit(int n1, int n2) {
        if (n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99) return false;
        Set<Integer> checkerSet = new HashSet<>(Arrays.asList(n1 % 10, n1 / 10));
        while(n2>0) if (checkerSet.contains(n2 % 10)) return true; else n2/= 10;
        return false;
    }
}