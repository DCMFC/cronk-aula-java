FROM gcr.io/oss-fuzz-base/base-builder-jvm:latest@sha256:45ce27788a3a28516cf299c335e03c2570e2407e50df03f3dc7bb25a21151b9e

COPY . $SRC
WORKDIR $SRC
COPY .clusterfuzzlite/build.sh .clusterfuzzlite/*.java $SRC/

RUN apt-get update && apt-get install -y maven && mvn -B dependency:go-offline && mvn package
