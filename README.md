# Gradle profiling/benchmarking sample

Check out Medium articles for more insights:
[Speed Up Android Builds](https://medium.com/@nikachapidze01/speed-up-android-builds-60714fc38178)
and [Profile & Benchmark Android Builds](https://medium.com/@nikachapidze01/profile-benchmark-android-builds-b572948c5be5)




Different scenarios.txt in different branches:
  #### scenarios/1-gradle-jvm-args
  #### scenarios/2-caching
  #### scenarios/3-changing-files
  #### scenarios/4-kapt-vs-ksp
  #### scenarios/5-parallel-execution
  #### scenarios/6-fork-java-compiler
  #### scenarios/7-jetifier

  You can run scenarios using https://github.com/gradle/gradle-profiler

```text
gradle-profiler --benchmark --project-dir ./ --output-dir ./build --scenario-file scenarios.txt --gradle-user-home=./build/gradle
```
Use ./build directory not to add generated classes in root project

Additionally you can put other measurement params:
```text
--measure-build-op 
--measure-config-time 
--measure-gc 
--measure-local-build-cache
```
