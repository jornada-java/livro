package benchmark;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class BenchmarkParalelismo {

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(BenchmarkParalelismo.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }

    @Benchmark
    public Map<Double, Double> benchmarkSemParalelismo() {
        Map<Double, Double> mapa = new HashMap<>();
        IntStream.range(1, 10000000)
                .mapToDouble(numero -> Math.pow(numero, 5))
                .filter(numero -> numero % 2 == 0)
                .forEach(numero -> mapa.put(numero, Math.pow(numero, 5)));
        return mapa;
    }

    @Benchmark
    public Map<Double, Double> benchmarkComParalelismo() {
        Map<Double, Double> mapa = new ConcurrentHashMap<>();
        IntStream.range(1, 10000000)
                .parallel()
                .mapToDouble(numero -> Math.pow(numero, 5))
                .filter(numero -> numero % 2 == 0)
                .forEach(numero -> mapa.put(numero, Math.pow(numero, 5)));
        return mapa;
    }


}
