#!/usr/bin/env bash

mkdir -p out/production/max-sum-subarray/
cd out/production/max-sum-subarray/ || exit

kotlinc ../../../src/data/IntegersArray.kt
kotlinc ../../../src/data/MaxSumIntoRange.kt
kotlinc ../../../src/algorithm/GetMaxSumSubarray.kt -cp .
kotlinc ../../../src/Main.kt -cp . ../../../src/data/ ../../../src/algorithm/ -include-runtime -d Main.jar
