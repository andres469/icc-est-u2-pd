import java.util.Arrays;

public class EjerciciosPD {

    private long[] memo;

    public EjerciciosPD() {
        memo = new long[101];
        clearCache();
    }

    public void clearCache() {
        Arrays.fill(memo, -1);
    }

    public long getFibonaci(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonaci(n - 1) + getFibonaci(n - 2);
    }

    public long getFibonaciPD(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número de Fibonacci no puede ser negativo.");
        }
        if (n <= 1) {
            return n;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = getFibonaciPD(n - 1) + getFibonaciPD(n - 2);
        return memo[n];
    }

        
}
