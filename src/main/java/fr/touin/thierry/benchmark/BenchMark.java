package fr.touin.thierry.benchmark;

import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

public class BenchMark {

    final static Logger logger = LoggerFactory.getLogger(BenchMark.class);


    @Fork(value = 1, warmups = 1)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Warmup(iterations = 5)
    public void logger1() {
        logger.debug("logger1");
    }

    /*
    @Fork(value = 1, warmups = 1)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Warmup(iterations = 5)
    public void logger2() {
        if (logger.isDebugEnabled()) logger.debug("logger2");
    }
    */

    /*
    @Fork(value = 1, warmups = 1)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Warmup(iterations = 5)
    public void logger3(ExecutionPlan plan) {
        if (logger.isDebugEnabled()) logger.debug("logger3" + plan.password);
    }
    */

    @Fork(value = 1, warmups = 1)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Warmup(iterations = 5)
    public void logger4(ExecutionPlan plan) {
        if (logger.isDebugEnabled()) logger.debug("logger4" + Math.random());
    }

    @Fork(value = 1, warmups = 1)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Warmup(iterations = 5)
    public void logger5(ExecutionPlan plan) {
        logger.debug("logger5" + Math.random());
    }

    @State(Scope.Benchmark)
    public static class ExecutionPlan {
        public String password = "4v3rys3kur3p455w0rd";
    }

}
