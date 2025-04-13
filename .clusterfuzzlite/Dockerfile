FROM gcr.io/oss-fuzz-base/base-builder-jvm:latest@sha256:45ce27788a3a28516cf299c335e03c2570e2407e50df03f3dc7bb25a21151b9e

RUN apt-get update && apt-get install -y maven

COPY . $SRC/conversion/example
WORKDIR /conversion/example
COPY .clusterfuzzlite/build.sh .clusterfuzzlite/*.dict $SRC/conversion/example
