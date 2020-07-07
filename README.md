
## Test result : analyze logger

| Test number | Tested code      |  Score (ops/s)  | Perf Result 
| :--: | ------------- | ------------- | :-------------: |
| 1| ```logger.debug("logger1");``` | 1694391217,660 | **2** | 
| 2| ```if (logger.isDebugEnabled()) logger.debug("logger4" + Math.random());```  | 1852705211,811 | **1** | 
| 3| ```logger.debug("logger5" + Math.random());```  | 1948098,566 | **3** | 


> The best performance corresponds to the code with the condition in front of it (Result 1).

> This condition does not change the ranking much if the displayed string is always the same. 

> This is not true if there is a method call ex: Random method.


## Console output

```
Benchmark           Mode  Cnt           Score           Error  Units
BenchMark.logger1  thrpt   20  1694391217,660 ± 139666784,819  ops/s
BenchMark.logger4  thrpt   20  1852705211,811 ±  32736055,083  ops/s
BenchMark.logger5  thrpt   20     1948098,566 ±     70950,668  ops/s
```