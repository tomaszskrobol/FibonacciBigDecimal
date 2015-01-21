import java.math.BigInteger;

public class BigFibb {
    private final static int NUMBER_COUNT = 100001;

    private BigInteger[] fibCache = new BigInteger[NUMBER_COUNT];

    public static void main(String[] args) {
        new BigFibb().run();
    }

    private void run() {
        init();
        for (int i = 2; i < NUMBER_COUNT; i++) {
            fibCache[i] = fibCache[i - 1].add(fibCache[i - 2]);
            if(i%1000==0)
                System.out.println("liczba " + i + ": " + fibCache[i]);
        }
    }

    private void init() {
        fibCache[0] = BigInteger.ZERO;
        fibCache[1] = BigInteger.ONE;
    }
}
