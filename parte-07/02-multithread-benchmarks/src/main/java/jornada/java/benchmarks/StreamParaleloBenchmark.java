package jornada.java.benchmarks;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * Benchmark simples do uso de Streams Paralelos.
 * <br><br>
 * Exemplo feito para o livro Jornada Java.
 *
 * @author RinaldoDev
 */
/*
 * Para executar esta classe é necessário possuir o Java 14 configurado, e executar o comando "mvn clean install".
 * Depois disso, o JAR deve ser executado diretamente com o comando "java -jar target/multithread-benchmarks.jar".
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
public class StreamParaleloBenchmark {

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(StreamParaleloBenchmark.class.getSimpleName())
                .forks(1)
                .threads(1)
                .warmupIterations(1)
                .measurementIterations(1)
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
