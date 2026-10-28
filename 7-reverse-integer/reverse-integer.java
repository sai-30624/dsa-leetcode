
class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;

            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && rem > 7))
                return 0;

            rev = rev * 10 + rem;
            n /= 10;
        }

        if (x < 0) return -rev;
        return rev;
    }
}
