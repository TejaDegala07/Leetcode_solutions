class Solution {
    public long sumAndMultiply(int n) {

        if (n == 0) return 0;

        int[] digits = new int[10];
        int idx = 0;

        while (n > 0) {
            if (n % 10 != 0) {
                digits[idx++] = n % 10;
            }
            n /= 10;
        }

        long x = 0;
        int sum = 0;

        for (int i = idx - 1; i >= 0; i--) {
            x = x * 10 + digits[i];
            sum += digits[i];
        }

        return x * sum;
        
    }
}