import java.util.Arrays;
import java.util.HashSet;

public class VampireNumbers {
    private static int digits(long num) {
        return Long.toString(num).length();
    }

    private static boolean factorCheck(long orig, long factor1, long factor2) {
        if (Long.toString(factor1).endsWith("0") && Long.toString(factor2).endsWith("0")) return false;

        int origLen = digits(orig);
        if (digits(factor1) != origLen / 2 || digits(factor2) != origLen / 2) return false;

        byte[] origBytes = Long.toString(orig).getBytes();
        byte[] fangBytes = (Long.toString(factor1) + Long.toString(factor2)).getBytes();
        Arrays.sort(origBytes);
        Arrays.sort(fangBytes);
        return Arrays.equals(origBytes, fangBytes);
    }

    public static void main(String[] args) {
        HashSet<Long> numbers = new HashSet<Long>();
        for (long i = 10; numbers.size() <= 100; i++) {
            if ((digits(i) % 2) != 0) {
                i = i * 10 - 1;
                continue;
            }
            for (long factor1 = 2; factor1 <= Math.sqrt(i) + 1; factor1++) {
                if (i % factor1 == 0) {
                    long factor2 = i / factor1;
                    if (factorCheck(i, factor1, factor2) && factor1 <= factor2) {
                        numbers.add(i);
                        System.out.println(i);
                    }
                }
            }
        }
    }
}