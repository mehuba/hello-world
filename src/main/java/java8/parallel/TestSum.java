package java8.parallel;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by zhaoyibin on 10:50 09/10/2017
 */
public class TestSum {

    public static void main(String[] args) {
        int n = 10_000_000;
        System.out.println("Sequential sum done in:" + measureSumPerf(TestSum::sequentialSum, n) + " msecs");
        System.out.println("Iterative sum done in:" + measureSumPerf(TestSum::iterativeSum, n) + " msecs");
        System.out.println("Parallel sum done in:" + measureSumPerf(TestSum::parallelSum, n) + " msecs");
    }

    public static long measureSumPerf(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            System.out.println("Result: " + sum);
            if (duration < fastest) {
                fastest = duration;
            }
        }
        return fastest;
    }

    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
            .limit(n)
            .reduce(0L, Long::sum);
    }

    public static long iterativeSum(long n) {
        long result = 0;
        for (long i = 1L; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
            .limit(n)
            .parallel()
            .reduce(0L, Long::sum);
    }
}
