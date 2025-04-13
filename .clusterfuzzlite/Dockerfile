FROM gcr.io/oss-fuzz-base/base-builder-jvm

RUN apt-get update && apt-get install -y maven

COPY build.sh $SRC/
COPY ConversionFuzzer.java ConversionFuzzTest.java $SRC/

WORKDIR $SRC/
