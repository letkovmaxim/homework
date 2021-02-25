import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int n = 100;
        boolean[] primes = new boolean[101];
        Arrays.fill(primes, Boolean.TRUE);

        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i+" ");
            }
        }
    }
}