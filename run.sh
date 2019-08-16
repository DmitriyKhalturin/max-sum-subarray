#!/usr/bin/env bash

JAR=out/production/max-sum-subarray/Main.jar

[[ ! -f "$JAR" ]] && ./build.sh

java -cp $JAR Main
