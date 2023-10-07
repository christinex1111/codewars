public class BitCounting {
    public static int countBits(int n) {
        String binResult = Integer.toBinaryString(n);

        int count = 0;
        for (int i = 0; i < binResult.length(); i++) {
            if (binResult.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}
