


```
Benchmark           Mode  Cnt           Score           Error  Units
BenchMark.logger1  thrpt   20  1694391217,660 ± 139666784,819  ops/s
BenchMark.logger4  thrpt   20  1852705211,811 ±  32736055,083  ops/s
BenchMark.logger5  thrpt   20     1948098,566 ±     70950,668  ops/s
```


| Test      |  Score (ops/s)  | Result 
| ------------- | ------------- | ------------- |
| ```logger.debug("logger1");``` | 1694391217,660 |  | 
| ```if (logger.isDebugEnabled()) logger.debug("logger4" + Math.random());```  | 1852705211,811 |  | 
| ```logger.debug("logger5" + Math.random());```  | 1948098,566 |  | 
