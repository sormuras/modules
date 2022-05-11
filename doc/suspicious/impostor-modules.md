# Impostor Modules

An impostor module is a Maven artifact that contains the `module-info.class` file from a different Maven artifact.
Some well known modules that were packaged as Maven artifacts by their authors, have been repackaged into dozens of other Maven artifacts by the maintainers of those other artifacts.
This makes it look like there are dozens of modules with the same name in Maven Central -- all but one are impostor modules.

1. `org.apache.logging.log4j` x190
1. `com.fasterxml.jackson.databind` x133
1. `com.google.gson` x105
1. `com.fasterxml.jackson.core` x102
1. `kotlin.stdlib.jdk8` x79
1. `org.bouncycastle.provider` x75
1. `java.xml.bind` x70
1. `kotlin.stdlib` x68
1. `net.bytebuddy` x68
1. `info.picocli` x65
1. `org.objectweb.asm` x57
1. `io.github.classgraph` x50
1. `com.fasterxml.jackson.annotation` x46
1. `com.fasterxml.jackson.module.jaxb` x42
1. `org.bouncycastle.pkix` x36
1. `org.slf4j` x36
1. `lombok` x34
1. `com.fasterxml.jackson.dataformat.yaml` x28
1. `com.zaxxer.hikari` x25
1. `org.objectweb.asm.commons` x24
1. `com.fasterxml.jackson.jaxrs.json` x23
1. `org.jetbrains.annotations` x20
1. `java.ws.rs` x15
1. `com.fasterxml.jackson.datatype.jdk8` x14
1. `net.bytebuddy.agent` x14
1. _... and some more._

## org.apache.logging.log4j

For example, at least 190 artifacts on Maven Central claim to be the module `org.apache.logging.log4j`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.apache.logging.log4j;`.

1. `au.org.consumerdatastandards:codegen`  -> [`0.9.6`, `1.0.0-RC1`, `1.0.0-RC2`, `1.0.0-RC3`, `1.0.0-RC4`, `1.0.0-RC5`, `1.0.0-RC6`, `1.0.0`, `1.1.1`]
1. `cn.net.mugui:spring`  -> [`1.00`, `1.01`, `1.02`, `1.03`, `1.05`, `1.06`, `1.08`, `1.10`, `1.11`, `1.12`, `1.13`, `1.15`, `1.16`, `1.17`, `1.18`]
1. `co.actioniq:vault-utilities`  -> [`1.2.1`]
1. `co.elastic.apm:apm-agent`  -> [`1.29.0`, `1.30.0`, `1.30.1`]
1. `co.elastic.apm:elastic-apm-agent`  -> [`1.29.0`, `1.30.0`, `1.30.1`]
1. `com.alertavert:jwt-opa`  -> [`0.6.4.4`, `0.6.4.4-11`, `0.6.5`, `0.6.5-11`, `0.7.0-jdk11`, `0.7.1-jdk15`]
1. `com.alibaba.lindorm:lindorm-search-shaded-test-framework`  -> [`8.9.1`, `8.10.2`]
1. `com.alibaba.ververica:flink-connector-test-util`  -> [`1.0.0`, `1.1.0`, `1.1.1`, `1.2.0`, `1.3.0`, `1.4.0`]
1. `com.alibaba.ververica:ververica-connector-elasticsearch`  -> [`1.13-vvr-4.0.7`]
1. `com.ardikars.jxnet:jxnet-example`  -> [`1.5.5.RC5`]
1. `com.arpitos:arpitos-fw`  -> [`0.0.2`]
1. `com.arpitos:artos`  -> [`0.0.1`]
1. `com.baidu.hugegraph:computer-algorithm`  -> [`0.1.1`, `0.1.2`, `0.1.3`]
1. `com.baidu.hugegraph:computer-k8s-operator`  -> [`0.1.0`, `0.1.1`, `0.1.2`, `0.1.3`]
1. `com.criteo.java:garmadon-readers-elasticsearch`  -> [`0.0.1`, `1.0.0`, `1.2.0`, `1.3.0`, `1.3.1`, `1.4.0`]
1. `com.databricks:databricks-jdbc`  -> [`2.6.25-1`]
1. `com.datarobot:datarobot-mlops`  -> [`5.3.0`, `5.3.0.1`, `6.0.0`, `6.1.3`]
1. `com.datarobot:mlops-utils-for-spark_3.2.0`  -> [`8.0.7`]
1. `com.dlsc.workbenchfx:workbenchfx-core`  -> [`1.0.0`, `11.0.0`]
1. `com.github.answerail:dingtalk-spring-boot-starter`  -> [`1.0.1-RELEASE`, `1.0.2-RELEASE`]
1. `com.github.code-cubic:elasticsearch-tool`  -> [`6.5.4.20201101-RELEASE`, `6.5.4.20201110-RELEASE`, `6.5.4.20210101-RELEASE`, `6.5.4.20210220-RELEASE`, `6.5.4.20210310-RELEASE`, `6.5.4.20210702-RELEASE`]
1. `com.github.containersolutions:mysql-schema-sample`  -> [`1.2.3`, `1.3.0`]
1. `com.github.containersolutions:webserver-sample`  -> [`1.2.3`, `1.3.0`]
1. `com.github.daggerok.sonar:sonar-breaker`  -> [`0.1.4`, `0.1.5`, `1.0.0`, `1.0.1`]
1. `com.github.joselion:lion-spring-security`  -> [`1.0.1`]
1. `com.github.onbass-naga:schema2json`  -> [`1.0.0`, `1.0.1`]
1. `com.github.pellierd:pddl4j`  -> [`3.7.2`, `3.7.3`, `3.8`, `3.8.1`, `3.8.2`, `3.8.3`]
1. `com.github.quickstart-nt-996:data-generator-hive`  -> [`0.0.2-RELEASE`]
1. `com.github.skapral.poetryclub:poetryclub-app`  -> [`0.0.0`, `0.0.1`]
1. `com.github.transbankdevelopers:transbank-sdk-pos-java`  -> [`2.0.0`, `3.0.0`, `3.1.0`]
1. `com.github.vzakharchenko:radius-plugin`  -> [`0.1`, `1.0.0`, `1.0.1`, `1.0.2`, `1.1.0`, `1.2.0`, `1.2.2`, `1.2.3`, `1.2.4`, `1.2.5`, `1.2.6`, `1.2.9`, `1.3.0`, `1.3.1`, `1.3.2`, `1.3.3`, `1.3.4`, `1.3.5`, `1.3.6`, `1.3.7`, `1.3.8`, `1.3.9`, `1.3.10`, `1.3.11`, `1.3.12`, `1.3.13`, `1.3.14`]
1. `com.github.xincao9:jsonrpc-benchmark`  -> [`1.2.1`, `1.2.2`, `1.2.3`, `1.2.4`, `1.2.5`]
1. `com.github.xincao9:jsonrpc-ui`  -> [`1.2.5`]
1. `com.github.xincao9:jswitcher-sample`  -> [`1.2.1`, `1.2.2`]
1. `com.github.xincao9:jswitcher-ui`  -> [`1.2`, `1.2.1`, `1.2.2`]
1. `com.groupbyinc:common-flux-nologgers-stage`  -> [`129`]
1. `com.groupbyinc:common-flux-nologgers`  -> [`129`]
1. `com.groupbyinc:common-flux-stage`  -> [`129`]
1. `com.guicedee.services:log4j-core`  -> [`1.0.8.12-jre14`, `1.0.8.16-jre14`, `1.0.8.18-jre14`, `1.0.9.0-jre14`, `1.0.9.1-jre14`, `1.0.9.2-jre14`, `1.0.9.3-jre14`, `1.0.9.4-jre14`, `1.0.9.5-jre14`, `1.0.9.7-jre14`, `1.0.9.10-jre14`, `1.0.9.11-jre14`, `1.0.9.13-jre14`, `1.0.9.14-jre14`, `1.0.10.0-jre14`, `1.0.10.1-jre14`, `1.0.10.3-jre14`, `1.0.10.4-jre14`, `1.0.11.0-jre14`, `1.0.11.2-jre14`, `1.0.11.5-jre14`, `1.0.11.6-jre14`, `1.0.11.7-jre14`, `1.0.12.0-jre14`, `1.0.12.1-jre14`, `1.0.12.2-jre14`, `1.0.12.3-jre14`, `1.0.12.4-jre14`, `1.0.12.5-jre14`, `1.0.13.0-jre14`, `1.0.13.1-jre14`, `1.0.13.2-jre14`, `1.0.13.3-jre14`, `1.0.13.4-jre14`, `1.0.13.5-jre14`]
1. `com.hedera.hashgraph:java-sdk`  -> [`0.2.0`]
1. `com.hpe.adm.octane.ciplugins:bamboo-ci-plugin`  -> [`1.10.1`, `1.12.8`]
1. `com.ibm.ta.sdk:ta-sdk-sample`  -> [`0.5.2`, `0.5.2-1`, `0.5.2-2`, `0.5.3`, `0.5.4`, `0.5.5`, `0.6.0`, `0.6.1`]
1. `com.jpaulmorrison:javafbp-websockets`  -> [`1.2.7`, `1.3.0`]
1. `com.khubla.olmreader:olmreader`  -> [`1.8.0`, `1.9.0`]
1. `com.labs64.netlicensing:netlicensing-client-demo`  -> [`2.9.2`, `2.9.3`]
1. `com.macasaet.fernet:fernet-aws-secrets-manager-rotator`  -> [`1.5.0`]
1. `com.melahn:archive-extract`  -> [`1.0.0`]
1. `com.melahn:helm-chartmap`  -> [`1.1.0`, `1.1.1`]
1. `com.melahn:java-trace-visualizer`  -> [`1.0.0`]
1. `com.microsoft.azure:azure-cosmos-cassandra-uploader`  -> [`1.0.9`, `1.0.10`, `1.0.12`, `1.0.13`, `1.0.14`, `1.0.15`, `1.0.16`]
1. `com.navercorp.pinpoint:pinpoint-tools`  -> [`2.3.0`, `2.3.1`, `2.3.2`, `2.3.3`]
1. `com.netflix.conductor:conductor-es6-persistence`  -> [`2.27.0-beta.2`, `2.27.0`, `2.27.1`, `2.27.2`, `2.27.3`, `2.27.4`, `2.27.5`, `2.27.6`, `2.28.0`, `2.28.1`, `2.28.2`, `2.28.3`, `2.28.4-alpha`, `2.29.0`, `2.29.1`, `2.29.2`, `2.29.3`, `2.30.1`, `2.30.2`, `2.30.3`, `2.30.4`, `2.31.0`, `2.31.1`, `2.31.2`, `2.31.3`]
1. `com.netflix.conductor:conductor-es7-persistence`  -> [`2.31.1`, `2.31.2`, `2.31.3`, `2.31.4`, `2.31.5`]
1. `com.nimblygames.packr:packr-all`  -> [`2.3.0`, `2.4.2`, `2.5.0`, `2.6.0`, `2.6.2`, `2.6.3`, `2.6.4`, `2.7.0`]
1. `com.oceanprotocol:secret-store-client`  -> [`0.0.3`]
1. `com.opkloud:kloudminions-api`  -> [`1.0.6`]
1. `com.rovio.ingest:rovio-ingest`  -> [`1.0.2_spark_3.0.1`]
1. `com.sagframe:sqltoy-quickvo`  -> [`4.9.9`, `4.9.13`, `4.10.0`, `4.10.1`, `4.10.8`, `4.10.9`, `4.11.0`, `4.11.1`, `4.11.5`, `4.11.7`, `4.11.8`, `4.11.9`]
1. `com.snowflake:snowflake-kafka-connector`  -> [`1.1.0`]
1. `com.spotify.ffwd:ffwd-agent`  -> [`0.4.1`, `0.4.2`, `0.4.3`, `0.4.4`, `0.4.5`, `0.4.6`]
1. `com.theartos:artos`  -> [`0.0.1`, `0.0.2`, `0.0.3`, `0.0.4`, `0.0.5-beta-1`, `0.0.5-beta-2`, `0.0.6`, `0.0.7`, `0.0.8`, `0.0.9`, `0.0.10`, `0.0.11`, `0.0.12`, `0.0.13-beta-1`, `0.0.13-beta-2`, `0.0.13`, `0.0.14-beta-1`, `0.0.15`, `0.0.16`, `0.0.17-beta-1`]
1. `com.ververica:flink-connector-test-util`  -> [`2.0.0`, `2.0.1`, `2.0.2`]
1. `com.weblyzard.sparql:streaming-client`  -> [`0.0.7.2`]
1. `com.weicoder.extend:core-extend`  -> [`3.3.2`, `3.3.3`, `3.3.4`]
1. `com.weicoder.extend:log-extend`  -> [`3.3.5`]
1. `com.yandex.ydb:ydb-sdk-jdbc-uberjar`  -> [`1.8.0`, `1.8.1`, `1.8.2`, `1.9.2`, `1.10.3`, `1.10.5`, `1.10.8`, `1.11.5`]
1. `cz.o2.proxima:proxima-direct-io-elasticsearch`  -> [`0.9.0`, `0.9.0-jdk11`]
1. `de.charite.compbio:jannovar-cli`  -> [`0.32`]
1. `de.sfuhrm:logwebconfig-example`  -> [`0.8.2`]
1. `de.wenzlaff.twbibel:de.wenzlaff.twbibel`  -> [`0.0.3`]
1. `es.us.isa:idl-reasoner`  -> [`0.0.1`, `0.0.2`]
1. `es.us.isa:json-mutator`  -> [`0.0.1`]
1. `eu.europa.ec.eurostat:searoute-jar`  -> [`3.1`, `3.3`]
1. `eu.fthevenet:binjr`  -> [`1.4.0`, `1.4.1`, `1.4.2`, `1.4.3`]
1. `eu.stamp-project:botsing-reproduction`  -> [`1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`]
1. `fr.inrae.toulouse.metexplore:met4j-toolbox`  -> [`0.9.0`, `0.9.1`]
1. `io.arenadata.hive:hive-jdbc`  -> [`3.1.1-arenadata`]
1. `io.bluebank.braid:braid-server`  -> [`4.1.2-RC06`, `4.1.2-RC07`, `4.1.2-RC08`, `4.1.2-RC10`, `4.1.2-RC11`, `4.1.2-RC12`, `4.1.2-RC13`]
1. `io.cellery.distribution:io.cellery.cell.api.publisher`  -> [`0.4.0`]
1. `io.cellery.distribution:io.cellery.cell.gateway.initializer`  -> [`0.1.0`, `0.4.0`]
1. `io.cellery.security:io.cellery.security.cell.sts.server`  -> [`0.2.1`, `0.4.0`, `0.6.0`]
1. `io.contek.morphling:hdf5-lib`  -> [`1.0.4`]
1. `io.contek.morphling:morphling-hdf5-lib`  -> [`1.0.5`, `1.0.6`]
1. `io.etcd:jetcd-ctl`  -> [`0.6.0`, `0.6.1`, `0.7.0`, `0.7.1`]
1. `io.github.basilapi:basil-server`  -> [`0.8.0`]
1. `io.github.jas34:scheduledwf-server`  -> [`1.0.0-rc1`, `1.0.0`]
1. `io.github.lxgaming:reconstruct-cli`  -> [`1.3.10`, `1.3.11`, `1.3.12`, `1.3.13`, `1.3.14`, `1.3.15`, `1.3.16`, `1.3.17`, `1.3.18`, `1.3.19`]
1. `io.github.mathieusoysal:codingame-puzzles-stats-history`  -> [`1.0.0`, `1.2.0`]
1. `io.github.protobuf-x:protoc-gen-spring-webflux`  -> [`0.2.0`, `0.2.1`]
1. `io.github.rsv-code:lc19`  -> [`1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`]
1. `io.github.shiruka:api`  -> [`1.8.0`, `1.9.0`]
1. `io.github.shiruka:common`  -> [`3.2.0`, `3.3.0`, `3.4.0`]
1. `io.github.shiruka:fragment`  -> [`1.6.0`, `1.6.1`]
1. `io.github.shiruka:world-fragment`  -> [`3.2.10`, `3.2.11`]
1. `io.github.warnotte:waxlib3`  -> [`0.0.1.2`]
1. `io.javaoperatorsdk:mysql-schema-sample`  -> [`1.3.0`, `1.4.0`, `1.5.0`, `1.6.1`, `1.6.2`, `1.7.0`, `1.7.1`]
1. `io.javaoperatorsdk:tomcat-sample`  -> [`1.3.0`, `1.4.0`, `1.5.0`]
1. `io.javaoperatorsdk:webserver-sample`  -> [`1.3.0`, `1.4.0`, `1.5.0`, `1.6.1`, `1.6.2`, `1.7.0`, `1.7.1`]
1. `io.michaelrocks.pablo:pablo`  -> [`1.1.0`, `1.1.1`, `1.1.3`, `1.2.0`, `1.3.0`, `1.3.1`]
1. `io.microservices.tools.canvas:microservice-canvas-cli`  -> [`0.7.0.TEST.RELEASE`]
1. `io.mosip.kernel:kernel-auth-adapter`  -> [`1.1.3-rc1`, `1.1.3-rc2`, `1.1.3`, `1.1.4-rc1`, `1.1.4`, `1.1.5-rc1`, `1.1.5`, `1.1.5.1`, `1.1.5.2`, `1.1.5.3`, `1.2.0-rc1`, `1.2.0-prerel`]
1. `io.mosip.kernel:kernel-virusscanner-clamav`  -> [`1.2.0-rc1`, `1.2.0`]
1. `io.mosip.registrationprocessor:registration-processor-common-camel-bridge`  -> [`1.1.2-rc2`, `1.1.2-rc3`, `1.1.2`, `1.1.3-rc1`, `1.1.3-rc2`, `1.1.3`, `1.1.4-rc1`, `1.1.4`, `1.1.5-rc1`, `1.1.5`, `1.1.5.2`, `1.2.0-rc1`, `1.2.0-prerel`]
1. `io.nosqlbench:driver-cql-shaded`  -> [`3.12.103`, `3.12.104`, `3.12.106`, `3.12.109`, `3.12.110`, `3.12.111`, `3.12.113`, `3.12.114`, `3.12.115`, `3.12.116`, `3.12.117`, `3.12.119`, `3.12.120`, `3.12.121`, `3.12.122`, `3.12.123`, `3.12.124`, `3.12.125`, `3.12.126`, `3.12.127`, `3.12.128`, `3.12.129`, `3.12.130`, `3.12.131`, `3.12.132`, `3.12.133`, `3.12.134`, `3.12.135`, `3.12.136`, `3.12.137`, `3.12.138`, `3.12.139`, `3.12.140`, `3.12.141`, `3.12.142`, `3.12.143`, `3.12.144`, `3.12.146`, `3.12.147`, `3.12.148`, `3.12.149`, `3.12.150`, `3.12.151`, `3.12.152`, `3.12.153`, `3.12.154`, `3.12.155`, `3.12.200`, `3.12.201`, `3.12.202`]
1. `io.nosqlbench:driver-dsegraph-shaded`  -> [`3.12.155`, `3.12.200`, `3.12.201`, `3.12.202`]
1. `io.nosqlbench:nb`  -> [`3.12.86`, `3.12.87`, `3.12.88`, `3.12.89`, `3.12.90`, `3.12.91`, `3.12.92`, `3.12.93`, `3.12.94`, `3.12.95`, `3.12.96`, `3.12.97`, `3.12.98`, `3.12.99`]
1. `io.nosqlbench:virtdata-lib-curves4`  -> [`3.12.1`, `3.12.2`, `3.12.17`, `3.12.19`, `3.12.20`, `3.12.21`, `3.12.22`, `3.12.23`, `3.12.24`, `3.12.25`, `3.12.26`, `3.12.27`, `3.12.28`, `3.12.29`, `3.12.30`, `3.12.31`, `3.12.32`, `3.12.34`, `3.12.35`, `3.12.36`, `3.12.37`, `3.12.38`, `3.12.39`, `3.12.41`, `3.12.43`, `3.12.44`, `3.12.45`, `3.12.46`, `3.12.47`, `3.12.48`, `3.12.52`, `3.12.53`, `3.12.54`, `3.12.55`, `3.12.60`, `3.12.61`, `3.12.62`, `3.12.66`, `3.12.67`, `3.12.70`, `3.12.71`, `3.12.72`, `3.12.73`, `3.12.75`, `3.12.76`, `3.12.77`, `3.12.78`, `3.12.79`, `3.12.81`, `3.12.82`, `3.12.83`, `3.12.84`, `3.12.85`, `3.12.86`, `3.12.87`, `3.12.88`, `3.12.89`, `3.12.90`, `3.12.91`, `3.12.92`, `3.12.93`, `3.12.94`, `3.12.95`, `3.12.96`, `3.12.97`, `3.12.98`, `3.12.99`]
1. `io.nosqlbench:virtdata-lib-random`  -> [`3.12.1`, `3.12.2`, `3.12.17`, `3.12.19`, `3.12.20`, `3.12.21`, `3.12.22`, `3.12.23`, `3.12.24`, `3.12.25`, `3.12.26`, `3.12.27`, `3.12.28`, `3.12.29`, `3.12.30`, `3.12.31`, `3.12.32`, `3.12.34`, `3.12.35`, `3.12.36`, `3.12.37`, `3.12.38`, `3.12.39`, `3.12.41`, `3.12.43`, `3.12.44`, `3.12.45`, `3.12.46`, `3.12.47`, `3.12.48`]
1. `io.nosqlbench:virtdata-lib-realer`  -> [`3.12.1`, `3.12.2`, `3.12.17`, `3.12.19`, `3.12.20`, `3.12.21`, `3.12.22`, `3.12.23`, `3.12.24`, `3.12.25`, `3.12.26`, `3.12.27`, `3.12.28`, `3.12.29`, `3.12.30`, `3.12.31`, `3.12.32`, `3.12.34`, `3.12.35`, `3.12.36`, `3.12.37`, `3.12.38`, `3.12.39`, `3.12.41`, `3.12.43`, `3.12.44`, `3.12.45`, `3.12.46`, `3.12.47`, `3.12.48`]
1. `io.nosqlbench:virtdata-realdata`  -> [`3.12.1`, `3.12.2`, `3.12.17`, `3.12.19`, `3.12.20`, `3.12.21`, `3.12.22`, `3.12.23`, `3.12.24`, `3.12.25`, `3.12.26`, `3.12.27`, `3.12.28`, `3.12.29`, `3.12.30`, `3.12.31`, `3.12.32`, `3.12.34`, `3.12.35`, `3.12.36`, `3.12.37`, `3.12.38`, `3.12.39`, `3.12.41`, `3.12.43`, `3.12.44`, `3.12.45`, `3.12.46`, `3.12.47`, `3.12.48`]
1. `io.shiftleft:ghidra`  -> [`10.1_PUBLIC_20211210`, `10.1_PUBLIC_20211210a`]
1. `io.siddhi:siddhi-service`  -> [`5.1.21`]
1. `io.streamnative.pulsar.handlers:kafka-0-10`  -> [`2.8.0.14`, `2.8.0.15`, `2.8.0.16`, `2.8.1.0`, `2.8.1.1`, `2.8.1.2`, `2.8.1.3`, `2.8.1.4`, `2.8.1.5`, `2.8.1.6`, `2.8.1.7`, `2.8.1.8`, `2.8.1.9`, `2.8.1.10`, `2.8.1.11`, `2.8.1.12`, `2.8.1.13`, `2.8.1.14`, `2.8.1.15`, `2.8.1.16`, `2.8.1.17`, `2.9.0.0-rc-1`, `2.9.0.0-rc-2`, `2.9.0.0-rc-3`, `2.9.0.0-rc-4`, `2.9.0.0-rc-6`]
1. `io.streamnative.pulsar.handlers:kafka-0-9`  -> [`2.8.1.20`, `2.8.1.21`, `2.9.0.0-rc-3`, `2.9.0.0-rc-4`, `2.9.0.0-rc-6`]
1. `io.streamnative.pulsar.handlers:kafka-1-0`  -> [`2.8.0.5`, `2.8.0.6`, `2.8.0.8`, `2.8.0.9`, `2.8.0.10`, `2.8.0.11`, `2.8.0.12`, `2.9.0-rc-202108131436`]
1. `io.streamnative.pulsar.handlers:kafka-2-8`  -> [`2.8.1.4`, `2.8.1.5`, `2.8.1.6`, `2.8.1.7`, `2.8.1.8`, `2.8.1.9`, `2.8.1.10`, `2.8.1.11`, `2.8.1.12`, `2.8.1.13`, `2.8.1.14`, `2.8.1.15`, `2.8.1.16`, `2.8.1.17`, `2.9.0.0-rc-1`, `2.9.0.0-rc-2`, `2.9.0.0-rc-3`, `2.9.0.0-rc-4`, `2.9.0.0-rc-6`]
1. `io.streamnative.pulsar.handlers:kafka-3-0`  -> [`2.8.1.4`, `2.8.1.5`, `2.8.1.6`, `2.8.1.7`, `2.8.1.8`, `2.8.1.9`, `2.8.1.10`, `2.8.1.11`, `2.8.1.12`, `2.8.1.13`, `2.8.1.14`, `2.8.1.15`, `2.8.1.16`, `2.8.1.17`, `2.9.0.0-rc-1`, `2.9.0.0-rc-2`, `2.9.0.0-rc-3`, `2.9.0.0-rc-4`, `2.9.0.0-rc-6`]
1. `io.streamnative:pulsar-functions-runtime-all`  -> [`2.7.1.4`, `2.7.1.5-rc-202104301334`, `2.7.1.5-rc-202105051501`, `2.7.1.5-rc-202105062307`, `2.7.1.5-rc-202105072323`, `2.7.2.0-rc-202105080004`, `2.7.2.0-rc-202105080044`, `2.7.2.0-rc-202105080149`, `2.9.0-rc-202106122205`, `2.9.0-rc-202106132205`, `2.9.0-rc-202106142205`, `2.9.0-rc-202106161005`, `2.9.0-rc-202106162205`, `2.9.0-rc-202106191455`, `2.9.0-rc-202106192205`, `2.9.0-rc-202106201258`, `2.9.0-rc-202106202206`, `2.9.0-rc-202106222205`, `2.9.0-rc-202106232205`, `2.9.0-rc-202106242205`, `2.9.0-rc-202106262205`, `2.9.0-rc-202106282205`, `2.9.0-rc-202106292205`, `2.9.0-rc-202106302205`, `2.9.0-rc-202107022206`, `2.9.0-rc-202107030819`, `2.9.0-rc-202107072205`, `2.9.0-rc-202107102205`, `2.9.0-rc-202107112205`, `2.9.0-rc-202107152205`, `2.9.0-rc-202107162205`, `2.9.0-rc-202107172205`, `2.9.0-rc-202107192205`]
1. `io.thundra.agent:thundra-agent-maven-test-instrumentation`  -> [`0.0.3`, `0.0.4`]
1. `io.thundra.plugin:thundra-agent-maven-test-instrumentation`  -> [`0.0.6`, `0.0.7`, `0.1.0`, `0.1.1`]
1. `io.wizzie.enricher:service`  -> [`0.6.1`]
1. `io.wizzie:enricher-extensions`  -> [`0.5.1`, `0.5.1.1`]
1. `io.wizzie:enricher-service`  -> [`0.5.1`, `0.5.1.1`]
1. `io.zeebe:zeebe-dmn-worker`  -> [`0.2.0`, `0.3.0`, `0.4.0`]
1. `io.zeebe:zeebe-http-worker`  -> [`0.2.0`]
1. `io.zeebe:zeebe-kafka-exporter-samples`  -> [`1.0.0`, `1.1.0`]
1. `io.zeebe:zeebe-script-worker`  -> [`0.4.0`, `0.5.0`, `0.6.0`, `0.6.1`]
1. `me.escoffier.fluid:review-example`  -> [`0.8`]
1. `net.corda:corda-standalone-shell`  -> [`4.9`, `4.9.1`]
1. `net.corda:corda-tools-blob-inspector`  -> [`4.3`, `4.4`, `4.5`, `4.6`, `4.8`]
1. `nl.basjes.parse.useragent:yauaa-commandline`  -> [`5.18`, `5.19`, `5.20`, `5.21`, `5.22`, `5.23`]
1. `org.apache.calcite.avatica:avatica-tck`  -> [`1.20.0`, `1.21.0`]
1. `org.apache.flink:statefun-ridesharing-example-simulator`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`]
1. `org.apache.hadoop:hadoop-ozone-filesystem-shaded`  -> [`1.0.0`]
1. `org.apache.hbase.operator.tools:hbase-hbck2`  -> [`1.0.0`, `1.1.0`, `1.2.0`]
1. `org.apache.hbase.operator.tools:hbase-tools`  -> [`1.1.0`, `1.2.0`]
1. `org.apache.jena:jena-fuseki-fulljar`  -> [`3.15.0`, `3.16.0`, `3.17.0`, `4.0.0`, `4.1.0`, `4.2.0`]
1. `org.apache.jena:jena-fuseki-geosparql`  -> [`3.15.0`, `3.16.0`, `3.17.0`, `4.0.0`, `4.1.0`, `4.2.0`]
1. `org.apache.jena:jena-fuseki-server`  -> [`3.15.0`, `3.16.0`, `3.17.0`, `4.0.0`, `4.1.0`, `4.2.0`]
1. `org.apache.jena:jena-jdbc-driver-bundle`  -> [`4.0.0`, `4.1.0`, `4.2.0`]
1. `org.apache.logging.log4j:log4j-api` 🧩 -> [`2.11.1`, `2.11.2`, `2.12.0`, `2.12.1`, `2.13.0`, `2.13.1`, `2.13.2`, `2.13.3`, `2.14.0`, `2.14.1`, `2.15.0`, `2.16.0`, `2.17.0`, `2.17.1`, `2.17.2`]
1. `org.apache.pulsar:pulsar-functions-runtime-all`  -> [`2.4.1`, `2.4.2`, `2.5.0`, `2.5.1`, `2.5.2`, `2.6.0`, `2.6.1`, `2.6.2`, `2.7.0`, `2.7.1`, `2.7.2`, `2.8.0`]
1. `org.apache.seatunnel:seatunnel-connector-flink-druid`  -> [`2.1.0`, `2.1.1`]
1. `org.apache.seatunnel:seatunnel-connector-flink-elasticsearch7`  -> [`2.1.1`]
1. `org.apache.seatunnel:seatunnel-core-flink`  -> [`2.1.1`]
1. `org.apache.seatunnel:seatunnel-flink-e2e`  -> [`2.1.1`]
1. `org.apache.seatunnel:seatunnel-flink-examples`  -> [`2.1.1`]
1. `org.apache.storm:blobstore-migrator`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`]
1. `org.apache.storm:flux-examples`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`]
1. `org.apache.storm:storm-hbase-examples`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`]
1. `org.apache.storm:storm-hdfs-examples`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`]
1. `org.apache.storm:storm-hive-examples`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`]
1. `org.apache.storm:storm-kafka-migration`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`]
1. `org.apache.storm:storm-perf`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`]
1. `org.apache.storm:storm-starter`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`]
1. `org.apache.tika:tika-eval-app`  -> [`2.0.0-BETA`, `2.0.0`, `2.1.0`]
1. `org.apache.tika:tika-server-client`  -> [`2.0.0-BETA`, `2.0.0`, `2.1.0`]
1. `org.biojava:biojava-protein-comparison-tool`  -> [`6.0.0`, `6.0.1`, `6.0.2`, `6.0.3`, `6.0.4`, `6.0.5`]
1. `org.bitbucket.bradleysmithllc.etlunit:etlunit-application-assembly`  -> [`4.5.7-eu`, `4.5.8-eu`, `4.5.9-eu`, `4.5.10-eu`, `4.5.11-eu`, `4.5.12-eu`, `4.5.13-eu`, `4.5.14-eu`, `4.5.15-eu`, `4.5.16-eu`, `4.5.17-eu`, `4.5.18-eu`, `4.5.19-eu`, `4.5.20-eu`, `4.5.21-eu`, `4.5.22-eu`, `4.5.23-eu`, `4.5.24-eu`]
1. `org.du-lab.adap-big:input`  -> [`0.1.0`]
1. `org.elasticflow:elasticflow`  -> [`5.0.1`, `5.0.2`, `5.0.3`, `5.0.4`, `5.0.5`, `5.0.6`, `5.0.7`, `5.1.0`, `5.1.1`, `5.3.0`, `5.3.1`, `5.3.2`, `5.3.3`, `5.3.4`, `5.3.5`, `5.3.6`, `5.3.7`]
1. `org.filteredpush:event_date_qc`  -> [`2.0.3`, `2.0.4`]
1. `org.finra.herd:herd-downloader`  -> [`0.77.0`, `0.78.0`, `0.79.0`, `0.80.0`, `0.81.0`, `0.82.0`, `0.85.0`]
1. `org.finra.herd:herd-retention-expiration-destroyer`  -> [`0.77.0`, `0.78.0`, `0.79.0`, `0.80.0`, `0.81.0`, `0.82.0`, `0.85.0`]
1. `org.finra.herd:herd-retention-expiration-exporter`  -> [`0.77.0`, `0.78.0`, `0.79.0`, `0.80.0`, `0.81.0`, `0.82.0`, `0.85.0`]
1. `org.finra.herd:herd-uploader`  -> [`0.77.0`, `0.78.0`, `0.79.0`, `0.80.0`, `0.81.0`, `0.82.0`, `0.85.0`]
1. `org.grapheco.pandadb:pandadb-java-driver`  -> [`0.3`]
1. `org.ibissource:frank-doc`  -> [`1.0`]
1. `org.linqs:psl-neural`  -> [`CANARY-2.3.1`]
1. `org.lucee:log4j-api`  -> [`2.17.0`, `2.17.0.0002L`, `2.17.1`, `2.17.2.0001L`]
1. `org.n52.arctic-sea:iceland-statistics-kibana`  -> [`7.0.0`, `7.1.0`]
1. `org.neo4j:neo4j-logging`  -> [`4.2.0`, `4.2.1`, `4.2.2`, `4.2.3`, `4.2.4`, `4.2.5`, `4.2.6`, `4.2.7`, `4.3.0`, `4.3.1`, `4.3.2`, `4.3.3`, `4.3.4`, `4.3.5`, `4.3.6`, `4.3.7`, `4.4.0`, `4.4.1`, `4.4.2`, `4.4.3`, `4.4.4`, `4.4.5`, `4.4.6`]
1. `org.odpi.egeria:gaian-ranger-plugin`  -> [`1.0`]
1. `org.powertac:sample-broker`  -> [`1.7.1`]
1. `org.robotframework:remoteswinglibrary`  -> [`2.2.5`]
1. `org.seaborne.rdf-delta:rdf-delta-fuseki-server`  -> [`0.7.0`, `0.8.0`, `0.8.1`, `0.8.2`, `0.9.0`, `0.9.1`, `0.9.2`, `1.0.0`, `1.0.1`, `1.0.2`, `1.1.0`, `1.1.1`]
1. `org.seaborne.rdf-delta:rdf-delta-server`  -> [`0.7.0`, `0.8.0`, `0.8.1`, `0.8.2`, `0.9.0`, `0.9.1`, `0.9.2`, `1.0.0`, `1.0.1`, `1.0.2`, `1.1.0`]
1. `org.tallison.lucene:gramreaper`  -> [`7.6-0.1`, `7.7-0.1`, `8.0-0.1`, `8.0-1.0`]
1. `org.tbee.xml2xxx:xml2yaml-application`  -> [`0.2.0`, `0.3.0`, `0.4.0`]
1. `org.vincenzolabs:paymaya-java-spring-sdk`  -> [`1.0.0`]
1. `org.wso2.am.choreo.connect:org.wso2.choreo.connect.enforcer`  -> [`0.9.0-beta`, `0.9.0`]
1. `org.wso2.performance.common:netty-http-echo-service`  -> [`0.2.0`, `0.2.1`, `0.3.0`, `0.4.1`, `0.4.2`, `0.4.3`, `0.4.4`, `0.4.5`]
1. `org.zowe.client.java.sdk:zowe-client-java-sdk`  -> [`1.0.0`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`, `1.0.10`, `1.0.11`, `1.0.12`]
1. `top.populus:bees`  -> [`1.0`]
1. `uk.gov.nca.graph:mapper`  -> [`1.0`]
1. `us.abstracta.jmeter:jmeter-java-dsl-jmx2dsl`  -> [`0.45`, `0.46`, `0.47`, `0.48`, `0.49`, `0.49.1`, `0.49.2`, `0.50`, `0.51`, `0.52`, `0.52.1`, `0.53`, `0.54`, `0.55`]
1. `za.co.absa.hyperdrive:hyperdrive-release_spark-2_2.11`  -> [`4.2.1`, `4.2.2`, `4.3.0`, `4.4.0`, `4.4.1`, `4.5.0`, `4.5.1`, `4.5.2`]
1. `za.co.absa.hyperdrive:hyperdrive-release_spark-2_2.12`  -> [`4.2.1`, `4.2.2`, `4.3.0`, `4.4.0`, `4.4.1`, `4.5.1`, `4.5.2`]
1. `za.co.absa.hyperdrive:hyperdrive-release_spark-3_2.12`  -> [`4.2.1`, `4.2.2`, `4.3.0`, `4.4.0`, `4.4.1`, `4.5.1`, `4.5.2`]
1. `za.co.absa.hyperdrive:hyperdrive-release`  -> [`3.2.2`, `3.3.0`, `4.0.0`, `4.1.0`]

## com.fasterxml.jackson.databind

For example, at least 133 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.databind`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.databind;`.

1. `ai.traceable.agent:javaagent`  -> [`0.2.6`, `0.2.7`, `0.2.8`, `0.2.9`, `1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`]
1. `cn.com.analysys:javasdk`  -> [`4.1.0-all`, `4.1.3-all`]
1. `co.navdeep:kafkaer`  -> [`1.4`, `1.4.1`, `1.4.2`, `1.4.3`]
1. `com.amazon.opendistroforelasticsearch.client:opendistro-sql-jdbc`  -> [`1.13.0.0`]
1. `com.appland:appmap-agent`  -> [`1.14.0`]
1. `com.azure:azure-security-keyvault-jca`  -> [`2.4.0`, `2.5.0`, `2.6.0`]
1. `com.bazaarvoice.jolt:jolt-cli`  -> [`0.1.6`, `0.1.7`]
1. `com.chtsinc:ch-mirakl-integrator`  -> [`0.0.1`]
1. `com.codacy:scooby-doo-fwk`  -> [`2.51.6`, `2.51.8`, `2.51.13`, `2.51.15`]
1. `com.couchbase.client:core-io`  -> [`2.2.5`, `2.2.6`, `2.2.7`, `2.3.0`]
1. `com.couchbase.client:couchbase-jdbc-driver`  -> [`1.0.0`, `1.0.1`]
1. `com.daml:ledger-api-bench-tool`  -> [`1.14.0-snapshot.20210608.7123.0.3cb8d5c2`, `1.14.0-snapshot.20210615.7124.0.d1b54ff0`, `1.14.0-snapshot.20210615.7169.0.adeba206`, `1.15.0-snapshot.20210615.7169.0.adeba206`, `1.15.0-snapshot.20210623.7217.0.5b73813d`]
1. `com.daml:ledger-api-test-tool`  -> [`1.4.0-snapshot.20200729.4851.0.224ab362`, `1.6.0-snapshot.20200915.5208.0.09014dc6`, `1.6.0-snapshot.20200922.5258.0.cd4a06db`, `1.6.0-snapshot.20200930.5312.0.b9a1905d`, `1.7.0-snapshot.20201006.5358.0.0c1cadcf`, `1.7.0-snapshot.20201012.5405.0.af92198d`, `1.7.0-snapshot.20201013.5418.0.bda13392`, `1.7.0-snapshot.20201020.5481.0.03a03957`, `1.7.0-snapshot.20201023.5508.0.9dec6689`, `1.7.0-snapshot.20201027.5530.0.bdbf8977`, `1.7.0-snapshot.20201103.5565.0.e75d42dd`, `1.7.0-snapshot.20201103.5565.1.e75d42dd`, `1.8.0-snapshot.20201110.5615.0.b35c9fcb`, `1.8.0-snapshot.20201117.5661.0.76fae40c`, `1.8.0-snapshot.20201124.5709.0.dabd55d0`, `1.8.0-snapshot.20201201.5776.0.4b91f2a6`, `1.8.0-snapshot.20201208.5840.0.38455e8c`, `1.8.0-snapshot.20201214.5841.0.a8ae8e4a`, `1.8.0`, `1.9.0-snapshot.20201215.5907.0.a6ed34c5`, `1.9.0-snapshot.20210106.5986.0.c6995a9c`, `1.9.0-snapshot.20210111.6034.0.7855b023`, `1.9.0-snapshot.20210112.6040.0.7171cb38`, `1.9.0-snapshot.20210113.6060.0.9ed787cb`, `1.9.0-snapshot.20210119.6062.0.5b3663a5`, `1.9.0`, `1.10.0-snapshot.20210120.6106.0.58ef725a`, `1.10.0-snapshot.20210125.6143.0.550aa48f`, `1.10.0-snapshot.20210201.6207.0.7cf1914d`, `1.10.0-snapshot.20210202.6218.0.c0573678`, `1.10.0-snapshot.20210208.6257.0.61feb5bf`, `1.10.0-snapshot.20210209.6265.0.19bf4031`, `1.11.0-snapshot.20210212.6300.0.ad161d7f`, `1.11.0-snapshot.20210217.6338.0.ba6ba901`, `1.11.0-snapshot.20210224.6385.0.dba114a2`, `1.11.0-snapshot.20210225.6390.0.0617fbde`, `1.11.0-snapshot.20210303.6421.0.145ddaa8`, `1.11.0-snapshot.20210304.6422.0.d3d5042a`, `1.11.0`, `1.12.0-snapshot.20210309.6463.0.f7abca91`, `1.12.0-snapshot.20210311.6483.0.5cb857d9`, `1.12.0-snapshot.20210311.6490.0.8e25227c`, `1.12.0-snapshot.20210312.6493.0.9a7e2465`, `1.12.0-snapshot.20210312.6498.0.707c86aa`, `1.12.0-snapshot.20210316.6523.0.b382fc45`, `1.12.0-snapshot.20210317.6528.0.493e2154`, `1.12.0-snapshot.20210323.6567.0.90c5ce70`, `1.12.0-snapshot.20210330.6619.0.007b8674`, `1.12.0-snapshot.20210330.6622.0.eef158d6`, `1.12.0-snapshot.20210331.6626.0.29a68134`, `1.12.0-snapshot.20210331.6634.0.b98a3881`, `1.12.0-snapshot.20210331.6640.0.4b807899`, `1.12.0-snapshot.20210406.6646.0.631db446`, `1.12.0`, `1.13.0-snapshot.20210413.6706.0.2dc09ba2`, `1.13.0-snapshot.20210419.6730.0.8c3a8c04`, `1.13.0-snapshot.20210426.6770.0.ca66061b`, `1.13.0-snapshot.20210503.6809.0.ca012c3b`, `1.13.0-snapshot.20210504.6833.0.9ae787d0`, `1.13.0`, `1.14.0-snapshot.20210511.6892.0.ca9e89b3`, `1.14.0-snapshot.20210518.6953.0.a6c7b86a`, `1.14.0-snapshot.20210526.7024.0.aedb9a82`, `1.14.0-snapshot.20210601.7081.0.7d716e6d`, `1.14.0-snapshot.20210602.7086.0.f36f556b`, `1.14.0-snapshot.20210608.7123.0.3cb8d5c2`, `1.14.0-snapshot.20210615.7124.0.d1b54ff0`, `1.14.0-snapshot.20210615.7169.0.adeba206`, `1.15.0-snapshot.20210615.7169.0.adeba206`, `1.15.0-snapshot.20210623.7217.0.5b73813d`]
1. `com.daml:sandbox-on-x-app-jar`  -> [`2.0.0-snapshot.20220124.8981.0.a150737d`, `2.0.0-snapshot.20220125.9008.0.ed33c0d5`, `2.0.0-snapshot.20220126.9017.0.159f3847`, `2.0.0-snapshot.20220126.9029.0.42cf70b1`, `2.0.0-snapshot.20220127.9042.0.4038d0a7`, `2.0.0-snapshot.20220127.9049.0.345e2679`, `2.0.0-snapshot.20220201.9108.0.aa2494f1`, `2.0.0-snapshot.20220204.9165.0.225c58f4`, `2.0.0-snapshot.20220207.9186.0.f63165aa`]
1. `com.datastax.oss.simulacron:simulacron-standalone`  -> [`0.11.0`]
1. `com.datastax.oss:pulsar-jms-all`  -> [`1.4.0`, `1.5.0`]
1. `com.devonfw.cobigen:cli`  -> [`1.2.0`, `7.0.0`, `7.1.0`]
1. `com.ellucian.ethos.integration.sdk:integration-sdk-java`  -> [`0.1.0`, `0.2.0`, `0.3.0`]
1. `com.exasol:import-export-udf-common-scala`  -> [`0.4.0`]
1. `com.expedia.www:haystack-attribution-persistence-email`  -> [`1.0.0`, `1.0.1`, `1.0.2`]
1. `com.expedia.www:haystack-attribution-s3`  -> [`1.0.0`, `1.0.1`, `1.0.2`]
1. `com.expedia.www:haystack-attributor`  -> [`1.0.0`, `1.0.1`, `1.0.2`]
1. `com.fasterxml.jackson.core:jackson-databind` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`, `2.13.2.1`, `2.13.2.2`]
1. `com.frox.opendpm:dpm-json-starter`  -> [`1.1.0`]
1. `com.github.biyanwen:bean2sql`  -> [`1.0.0`]
1. `com.github.claremontqualitymanagement:taf.core`  -> [`4.0.1`, `4.1.0`, `4.2.1`, `4.2.3`, `4.2.4`, `4.2.5`]
1. `com.github.gobars:rest`  -> [`0.0.9`]
1. `com.github.jknack:handlebars-proto`  -> [`4.3.0`]
1. `com.github.liuzhenghui:weaver-ecology-common`  -> [`9.00.2003.13.2`, `9.00.2003.13.4`, `9.00.2003.13.5`]
1. `com.github.masonm:wiremock-jwt-extension`  -> [`0.8`, `0.9`]
1. `com.github.tomakehurst:wiremock-jre8-standalone`  -> [`2.26.0`, `2.26.1`, `2.26.2`, `2.26.3`, `2.27.0`, `2.27.1`, `2.27.2`, `2.32.0`, `2.33.0`, `2.33.1`, `2.33.2`]
1. `com.github.tomakehurst:wiremock-standalone`  -> [`2.26.0`, `2.26.1`, `2.26.2`, `2.26.3`, `2.27.0`, `2.27.1`, `2.27.2`]
1. `com.here.account:here-oauth-client-example`  -> [`0.4.22`, `0.4.23`, `0.4.24`]
1. `com.heroku.agent:heroku-java-metrics-agent`  -> [`3.13`]
1. `com.ibm.cos:ibm-cos-java-sdk-bundle`  -> [`2.11.1`, `2.11.2`]
1. `com.joinesty:nullafi-java-sdk`  -> [`1.0.4`]
1. `com.jwebmp.jackson.core:jackson-databind`  -> [`0.63.0.54`, `0.63.0.60`, `0.63.0.61`, `0.65.0.1`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]
1. `com.jwebmp.jpms.jackson.core:jackson-databind`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre11.jackson.core:jackson-databind`  -> [`0.63.0.17`, `0.63.0.19`]
1. `com.launchdarkly:launchdarkly-java-server-sdk`  -> [`5.0.0-rc1`, `5.0.0-rc2`, `5.0.0-rc3`, `5.0.0`, `5.0.1`, `5.0.2`, `5.0.3`, `5.0.4`, `5.0.5`, `5.1.0`]
1. `com.orientechnologies:agent`  -> [`3.2.6`]
1. `com.playtika.reactivefeign:feign-reactor-benchmarks`  -> [`3.2.0`, `3.2.1`]
1. `com.salesforce.cantor:cantor-server`  -> [`0.4.20`, `0.4.21`, `0.4.22`, `0.4.23`, `0.4.24`, `0.4.25`, `0.4.26`]
1. `com.salesforce.cte:testadvisor-cli`  -> [`0.3.2`]
1. `com.salesforce.dockerfile-image-update:dockerfile-image-update`  -> [`1.1.2`, `1.1.3`]
1. `com.signalfx.public:signalfx-codahale`  -> [`1.0.13`, `1.0.14`, `1.0.15`, `1.0.16`, `1.0.17`, `1.0.18`]
1. `com.signalfx.public:signalfx-java`  -> [`1.0.13`, `1.0.14`, `1.0.15`, `1.0.16`, `1.0.17`, `1.0.18`]
1. `com.signalfx.public:signalfx-yammer`  -> [`1.0.13`, `1.0.14`, `1.0.15`, `1.0.16`, `1.0.17`, `1.0.18`]
1. `com.snowflake:snowpark-fips`  -> [`1.2.0`, `1.3.0`, `1.4.0`]
1. `com.snowflake:snowpark`  -> [`0.6.0`, `0.7.0`, `0.8.0`, `0.9.0`, `0.10.0`, `0.10.1`, `0.11.0`, `0.12.0`, `1.0.0`, `1.1.0`, `1.2.0`, `1.3.0`, `1.4.0`]
1. `com.souher:fastapi`  -> [`0.9.9`, `1.0.0`, `1.1.0`, `1.2.12`, `1.2.18`, `1.2.19`, `1.2.21`, `1.2.22`]
1. `com.spotify:styx-cli`  -> [`2.1.73`, `2.1.74`, `2.1.75`, `2.1.76`, `2.1.77`, `2.1.78`, `2.1.79`, `2.1.80`, `2.1.83`, `2.1.85`, `2.1.86`, `2.1.87`, `2.1.88`, `2.1.89`, `2.1.90`, `2.1.91`, `2.1.92`, `2.1.93`, `2.1.94`, `2.1.95`, `2.1.96`, `2.1.97`, `2.1.98`, `2.1.102`, `2.1.103`, `2.1.104`, `2.1.106`, `2.1.107`, `2.1.108`, `2.1.109`, `2.1.110`, `2.1.111`, `2.1.112`, `2.1.113`, `2.1.114`, `2.1.115`, `2.1.116`, `2.1.117`, `2.1.118`, `2.1.119`, `2.1.120`, `2.1.121`, `2.1.122`, `2.1.123`, `2.1.124`, `2.1.125`, `2.1.126`, `2.1.127`, `2.1.128`, `2.1.129`, `2.1.130`, `2.1.131`, `2.1.132`, `2.1.138`, `2.1.139`, `2.1.140`, `2.1.141`, `2.1.142`, `2.1.143`, `2.1.144`, `2.1.145`, `2.1.146`, `2.1.150`, `2.1.151`]
1. `com.tencent.bk.base.datahub:iceberg-flink-runtime`  -> [`0.12.1-bkbase.1`, `0.12.1-bkbase.2`, `0.12.1-bkbase.3`]
1. `com.tencent.bk.base.datahub:iceberg-hive-runtime`  -> [`0.12.1-bkbase.1`, `0.12.1-bkbase.2`, `0.12.1-bkbase.3`]
1. `com.tencent.bk.base.datahub:iceberg-hive3-orc-bundle`  -> [`0.12.1-bkbase.1`, `0.12.1-bkbase.2`, `0.12.1-bkbase.3`]
1. `com.tencent.bk.base.datahub:iceberg-spark-runtime`  -> [`0.9.0-bkbase.1`, `0.9.0-bkbase.2`, `0.9.0-bkbase.3`, `0.12.1-bkbase.1`, `0.12.1-bkbase.2`, `0.12.1-bkbase.3`]
1. `com.tencent.bk.base.datahub:iceberg-spark3-runtime`  -> [`0.12.1-bkbase.1`, `0.12.1-bkbase.2`, `0.12.1-bkbase.3`]
1. `de.m3y.hadoop.hdfs.hfsa:hfsa-fsimage-generator`  -> [`1.3.4`]
1. `de.quantummaid.tutorials.basic-tutorial:step4`  -> [`1.0.18`, `1.0.19`, `1.0.20`, `1.0.21`, `1.0.22`]
1. `fr.pilato.elasticsearch.injector:injector`  -> [`8.0`]
1. `io.github.delirius325:jmeter.backendlistener.elasticsearch`  -> [`2.6.8`]
1. `io.github.kingcjy:ezframework-core`  -> [`1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`, `1.1.0`, `1.1.1`]
1. `io.github.odalabasmaz.awsgenie:resource-terminator`  -> [`0.1.0`, `0.1.1`, `0.1.2`]
1. `io.github.singlerr:DiscordBot`  -> [`1.5`, `1.6`, `1.7`, `1.8`]
1. `io.kestra.plugin:plugin-aws`  -> [`0.2.0`]
1. `io.kestra.plugin:plugin-fs`  -> [`0.2.0`, `0.2.1`, `0.2.2`]
1. `io.kestra.storage:storage-minio`  -> [`0.2.0`]
1. `io.leonard:onebusaway-gtfs-hibernate-cli`  -> [`1.3.103`]
1. `io.leonard:onebusaway-gtfs-merge-cli`  -> [`1.3.103`]
1. `io.leonard:onebusaway-gtfs-transformer-cli`  -> [`1.3.103`]
1. `io.microconfig:osdf`  -> [`1.1.2`]
1. `io.opentelemetry.contrib:opentelemetry-jmx-metrics`  -> [`1.9.0-alpha`]
1. `io.opentelemetry.javaagent:opentelemetry-testing-common`  -> [`1.10.0-alpha`, `1.10.1-alpha`, `1.11.0-alpha`, `1.11.1-alpha`, `1.12.0-alpha`, `1.12.1-alpha`]
1. `io.sealights.on-premise.agents.android:android-agent-footprints`  -> [`1.0.22`, `1.0.25`, `1.0.26`, `1.0.27`, `1.0.33`, `1.0.34`]
1. `io.sealights.on-premise.agents.plugin:sealights-gradle-plugin`  -> [`2.1.526`, `2.1.531`, `2.1.539`, `3.0.559`, `3.0.564`, `3.0.567`, `3.0.568`, `3.0.570`, `3.0.572`, `3.0.583`, `3.0.603`, `3.0.607`, `3.0.608`, `3.0.610`, `3.0.613`, `3.0.614`, `3.1.627`, `3.1.628`, `3.1.631`, `3.1.633`, `3.1.639`, `3.1.649`, `3.1.653`, `3.1.654`, `3.1.657`]
1. `io.snice.networking:networking-examples`  -> [`0.0.6`, `0.0.7`, `0.0.8`, `0.0.9`]
1. `io.streamnative:pulsar-broker-shaded`  -> [`2.11.0-rc-202204132205`, `2.11.0-rc-202204142207`, `2.11.0-rc-202204152205`, `2.11.0-rc-202204162205`, `2.11.0-rc-202204172205`, `2.11.0-rc-202204182206`, `2.11.0-rc-202204192205`, `2.11.0-rc-202204202205`, `2.11.0-rc-202204212206`, `2.11.0-rc-202204222205`, `2.11.0-rc-202204232205`, `2.11.0-rc-202204242205`, `2.11.0-rc-202204252206`, `2.11.0-rc-202204262206`, `2.11.0-rc-202204272205`, `2.11.0-rc-202204282207`, `2.11.0-rc-202204292205`, `2.11.0-rc-202204302206`, `2.11.0-rc-202205012205`, `2.11.0-rc-202205022209`, `2.11.0-rc-202205032206`, `2.11.0-rc-202205042205`, `2.11.0-rc-202205052207`, `2.11.0-rc-202205062205`, `2.11.0-rc-202205072206`, `2.11.0-rc-202205082205`]
1. `io.streamnative:pulsar-client-2x-shaded`  -> [`2.11.0-rc-202204132205`, `2.11.0-rc-202204142207`, `2.11.0-rc-202204152205`, `2.11.0-rc-202204162205`, `2.11.0-rc-202204172205`, `2.11.0-rc-202204182206`, `2.11.0-rc-202204192205`, `2.11.0-rc-202204202205`, `2.11.0-rc-202204212206`, `2.11.0-rc-202204222205`, `2.11.0-rc-202204232205`, `2.11.0-rc-202204242205`, `2.11.0-rc-202204252206`, `2.11.0-rc-202204262206`, `2.11.0-rc-202204272205`, `2.11.0-rc-202204282207`, `2.11.0-rc-202204292205`, `2.11.0-rc-202204302206`, `2.11.0-rc-202205012205`, `2.11.0-rc-202205022209`, `2.11.0-rc-202205032206`, `2.11.0-rc-202205042205`, `2.11.0-rc-202205052207`, `2.11.0-rc-202205062205`, `2.11.0-rc-202205072206`, `2.11.0-rc-202205082205`]
1. `io.streamnative:pulsar-client-all`  -> [`2.11.0-rc-202204132205`, `2.11.0-rc-202204142207`, `2.11.0-rc-202204152205`, `2.11.0-rc-202204162205`, `2.11.0-rc-202204172205`, `2.11.0-rc-202204182206`, `2.11.0-rc-202204192205`, `2.11.0-rc-202204202205`, `2.11.0-rc-202204212206`, `2.11.0-rc-202204222205`, `2.11.0-rc-202204232205`, `2.11.0-rc-202204242205`, `2.11.0-rc-202204252206`, `2.11.0-rc-202204262206`, `2.11.0-rc-202204272205`, `2.11.0-rc-202204282207`, `2.11.0-rc-202204292205`, `2.11.0-rc-202204302206`, `2.11.0-rc-202205012205`, `2.11.0-rc-202205022209`, `2.11.0-rc-202205032206`, `2.11.0-rc-202205042205`, `2.11.0-rc-202205052207`, `2.11.0-rc-202205062205`, `2.11.0-rc-202205072206`, `2.11.0-rc-202205082205`]
1. `io.streamnative:pulsar-client`  -> [`2.11.0-rc-202204132205`, `2.11.0-rc-202204142207`, `2.11.0-rc-202204152205`, `2.11.0-rc-202204162205`, `2.11.0-rc-202204172205`, `2.11.0-rc-202204182206`, `2.11.0-rc-202204192205`, `2.11.0-rc-202204202205`, `2.11.0-rc-202204212206`, `2.11.0-rc-202204222205`, `2.11.0-rc-202204232205`, `2.11.0-rc-202204242205`, `2.11.0-rc-202204252206`, `2.11.0-rc-202204262206`, `2.11.0-rc-202204272205`, `2.11.0-rc-202204282207`, `2.11.0-rc-202204292205`, `2.11.0-rc-202204302206`, `2.11.0-rc-202205012205`, `2.11.0-rc-202205022209`, `2.11.0-rc-202205032206`, `2.11.0-rc-202205042205`, `2.11.0-rc-202205052207`, `2.11.0-rc-202205062205`, `2.11.0-rc-202205072206`, `2.11.0-rc-202205082205`]
1. `io.streamnative:pulsar-functions-runtime-all`  -> [`2.8.0-rc-202105092228`, `2.8.0-rc-202105122233`, `2.8.0-rc-202105130146`, `2.8.0-rc-202105130910`, `2.8.0-rc-202105132206`, `2.8.0-rc-202105140121`, `2.8.0-rc-202105170207`, `2.8.0-rc-202105170246`, `2.8.0-rc-202105170423`, `2.8.0-rc-202105170904`, `2.8.0-rc-202105172205`, `2.8.0-rc-202105180723`, `2.8.0-rc-202105182205`, `2.8.0-rc-202105250951`, `2.8.0-rc-202105251229`, `2.8.0-rc-202105252205`, `2.8.0-rc-202105262207`, `2.8.0-rc-202105272208`, `2.8.0-rc-202105291235`, `2.8.0-rc-202106012229`, `2.8.0-rc-202106021617`, `2.8.0-rc-202106022226`, `2.8.0-rc-202106061908`, `2.8.0-rc-202106062208`, `2.8.0-rc-202106071011`, `2.8.0-rc-202106071406`, `2.8.0-rc-202106071430`, `2.8.0-rc-202106091215`, `2.9.0-rc-202106092205`]
1. `net.snowflake:snowflake-jdbc-fips`  -> [`3.13.18`]
1. `net.snowflake:snowflake-jdbc`  -> [`3.13.18`]
1. `net.tislib.ui-expose:core`  -> [`0.0.1`, `0.1.0`]
1. `org.apache.beam:beam-runners-flink-1.10-job-server`  -> [`2.21.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-runners-flink-1.11-job-server`  -> [`2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-runners-flink-1.12-job-server`  -> [`2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-runners-flink-1.7-job-server`  -> [`2.20.0`]
1. `org.apache.beam:beam-runners-flink-1.8-job-server`  -> [`2.20.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-runners-flink-1.9-job-server`  -> [`2.20.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-runners-samza-job-server`  -> [`2.20.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`]
1. `org.apache.beam:beam-runners-spark-3-job-server`  -> [`2.30.0`, `2.31.0`, `2.32.0`, `2.33.0`]
1. `org.apache.beam:beam-runners-spark-job-server`  -> [`2.30.0`, `2.31.0`, `2.32.0`, `2.33.0`]
1. `org.apache.beam:beam-sdks-java-extensions-schemaio-expansion-service`  -> [`2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-sdks-java-extensions-sql-expansion-service`  -> [`2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-sdks-java-extensions-sql-jdbc`  -> [`2.20.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-sdks-java-harness`  -> [`2.20.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`, `2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.beam:beam-sdks-java-io-expansion-service`  -> [`2.21.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-sdks-java-io-google-cloud-platform-expansion-service`  -> [`2.27.0`, `2.28.0`]
1. `org.apache.calcite.avatica:avatica-standalone-server`  -> [`1.16.0`, `1.17.0`, `1.18.0`, `1.19.0`, `1.20.0`, `1.21.0`]
1. `org.apache.calcite.avatica:avatica`  -> [`1.16.0`, `1.17.0`, `1.18.0`, `1.19.0`, `1.20.0`, `1.21.0`]
1. `org.apache.flink:flink-azure-fs-hadoop`  -> [`1.15.0`]
1. `org.apache.flink:flink-gs-fs-hadoop`  -> [`1.15.0`]
1. `org.apache.flink:flink-oss-fs-hadoop`  -> [`1.15.0`]
1. `org.apache.flink:flink-sql-avro-confluent-registry`  -> [`1.15.0`]
1. `org.apache.flink:statefun-flink-distribution`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`, `3.0.0`, `3.1.0`, `3.1.1`]
1. `org.apache.iceberg:iceberg-flink-runtime`  -> [`0.10.0`, `0.11.0`, `0.11.1`, `0.12.0`, `0.12.1`]
1. `org.apache.iceberg:iceberg-hive-runtime`  -> [`0.10.0`, `0.11.0`, `0.11.1`, `0.12.0`, `0.12.1`]
1. `org.apache.iceberg:iceberg-hive3-orc-bundle`  -> [`0.12.0`, `0.12.1`]
1. `org.apache.iceberg:iceberg-spark-runtime`  -> [`0.8.0-incubating`, `0.9.0`, `0.9.1`, `0.10.0`, `0.11.0`, `0.11.1`, `0.12.0`, `0.12.1`]
1. `org.apache.iceberg:iceberg-spark3-runtime`  -> [`0.9.0`, `0.9.1`, `0.10.0`, `0.11.0`, `0.11.1`, `0.12.0`, `0.12.1`]
1. `org.apache.ignite:ignite-mesos`  -> [`2.12.0`, `2.13.0`]
1. `org.apache.tinkerpop:gremlin-shaded`  -> [`3.5.3`, `3.6.0`]
1. `org.commonjava.indy.launch:indy-record-extractor`  -> [`1.9.6`, `1.9.7.2`]
1. `org.fcrepo.importexport:fcrepo-import-export`  -> [`1.0.0`, `1.0.1`, `1.0.2`, `1.1.0`]
1. `org.icann.czds:czds-client`  -> [`1.0.3`]
1. `org.jboss.gm.analyzer:analyzer`  -> [`1.1`, `1.2`, `1.3`]
1. `org.jboss.gm.manipulation:manipulation`  -> [`1.1`, `1.2`, `1.3`]
1. `org.jboss.gm:analyzer`  -> [`1.5`, `1.6`, `1.6.1`, `1.6.2`, `1.8`, `1.9`, `2.0`, `2.1`, `2.2`, `2.3`, `2.4`, `2.5`, `2.6`, `2.7`, `2.8`, `2.9`, `3.0`, `3.1`, `3.1.1`, `3.2`, `3.3`, `3.4`, `3.5`]
1. `org.jboss.gm:manipulation`  -> [`1.5`, `1.6`, `1.6.1`, `1.6.2`, `1.8`, `1.9`, `2.0`, `2.1`, `2.2`, `2.3`, `2.4`, `2.5`, `2.6`, `2.7`, `2.8`, `2.9`, `3.0`, `3.1`, `3.1.1`, `3.2`, `3.3`, `3.4`, `3.5`]
1. `org.liquigraph:liquigraph-cli`  -> [`4.0.5`, `4.0.6`]
1. `org.mustangproject:Mustang-CLI`  -> [`2.3.2`, `2.3.3`, `2.4.0`, `2.5.0`]
1. `org.mustangproject:library`  -> [`2.3.2`, `2.3.3`, `2.4.0`, `2.5.0`]
1. `org.neo4j:neo4j-jdbc-driver`  -> [`3.5.1`, `4.0.0`, `4.0.1`, `4.0.2`, `4.0.3`, `4.0.4`, `4.0.5`]
1. `org.odpi.egeria:subject-area-fvt`  -> [`1.2`, `1.3`, `1.4`, `1.5`, `1.6`, `1.7`, `1.8`, `2.0`]
1. `org.openidentityplatform.commons.json-schema:cli`  -> [`2.0.7`, `2.0.8`, `2.0.9`, `2.0.10`, `2.0.11`, `2.0.12`, `2.0.13`, `2.0.14`]
1. `org.projectnessie:nessie-content-generator`  -> [`0.14.0`, `0.15.0`, `0.15.1`, `0.16.0`, `0.17.0`, `0.18.0`, `0.19.0`, `0.20.0`, `0.20.1`, `0.21.0`, `0.21.1`, `0.21.2`, `0.22.0`, `0.23.0`, `0.23.1`, `0.24.0`, `0.25.0`, `0.26.0`, `0.27.0`, `0.28.0`, `0.29.0`]
1. `org.sonatype.nexus:nexus-orient-component-migrator`  -> [`3.26.0-02`, `3.26.0-04`, `3.26.1-02`, `3.27.0-03`, `3.28.0-01`, `3.28.1-01`, `3.29.0-02`, `3.29.1-01`, `3.29.2-02`, `3.30.0-01`, `3.30.1-01`, `3.31.0-01`, `3.31.1-01`, `3.32.0-03`, `3.33.0-01`, `3.33.1-01`, `3.34.0-01`, `3.34.1-01`, `3.35.0-02`, `3.36.0-01`, `3.37.0-01`, `3.37.1-01`, `3.37.2-02`, `3.37.3-02`, `3.38.0-01`, `3.38.1-01`]
1. `org.symphonyoss.symphony:jcurl`  -> [`0.9.18`]
1. `org.wiremock:wiremock-webhooks-extension`  -> [`2.32.0`, `2.33.0`, `2.33.1`, `2.33.2`]
1. `tech.b180.cordaptor:cordaptor-bundle-rest-embedded`  -> [`0.1.0`]
1. `xyz.grasscutters:grasscutter`  -> [`1.0.3-dev`, `1.1.0`]
1. `za.co.absa.spline:admin`  -> [`0.5.5`, `0.5.6`, `0.6.0`, `0.6.1`, `0.7.0`, `0.7.1`, `0.7.2`, `0.7.3`, `0.7.4`, `0.7.5`, `0.7.6`, `0.7.7`]

## com.google.gson

For example, at least 105 artifacts on Maven Central claim to be the module `com.google.gson`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.google.gson;`.

1. `ai.h2o:h2o-clustering`  -> [`3.36.1.1`]
1. `ai.h2o:sparkling-water-package_2.11`  -> [`3.32.1.6-1-2.4`, `3.32.1.7-1-2.4`, `3.34.0.1-1-2.4`, `3.34.0.3-1-2.4`, `3.34.0.4-1-2.4`, `3.34.0.6-1-2.3`, `3.34.0.6-1-2.4`, `3.34.0.7-1-2.4`, `3.36.0.1-1-2.4`, `3.36.0.2-1-2.4`, `3.36.0.3-1-2.4`, `3.36.0.4-1-2.4`, `3.36.1.1-1-2.4`]
1. `ai.h2o:sparkling-water-package_2.12`  -> [`3.32.1.6-1-3.1`, `3.32.1.7-1-3.1`, `3.34.0.1-1-3.1`, `3.34.0.3-1-3.1`, `3.34.0.4-1-3.1`, `3.34.0.6-1-3.1`, `3.34.0.7-1-3.1`, `3.36.0.1-1-3.1`, `3.36.0.2-1-3.1`, `3.36.0.3-1-3.2`, `3.36.0.4-1-3.2`, `3.36.1.1-1-3.2`]
1. `com.aceql:aceql-http-client-jdbc-driver`  -> [`9.0`]
1. `com.capitalone.dashboard:hygieia-query`  -> [`1.0.1`, `1.0.2`]
1. `com.cloudofficeprint:cloudofficeprint`  -> [`21.2.0`, `21.2.1`, `21.2.2`]
1. `com.coralogix:coralogix-jdbc`  -> [`0.1`, `0.2`, `0.3`, `0.4`, `0.5`, `0.6`]
1. `com.coralogix:cosmetic_2.13`  -> [`0.1`]
1. `com.exaroton:api`  -> [`1.1.1`, `1.1.2`, `1.2.0`, `1.2.1`, `1.3.0`, `1.3.1`, `1.4.0`, `1.4.1`]
1. `com.free-now.sauron.plugins:kubernetesapi-report`  -> [`0.0.3`, `0.0.4`, `0.0.5`, `0.0.6`, `0.0.7`, `0.0.8`, `0.0.9`, `0.0.10`]
1. `com.fullcontact.client:java11`  -> [`1.0.0`, `2.0.0`, `2.1.0`]
1. `com.fullcontact.client:java8`  -> [`2.0.0`, `2.1.0`]
1. `com.github.flank:flank`  -> [`flank_snapshot`, `20.05.0`, `20.05.1`, `20.05.2`, `20.06.0`, `20.06.2`, `20.07.0`, `20.08.0`, `20.08.3`, `20.08.4`, `20.09.1`, `20.09.2`, `20.09.3`, `20.12.0`, `21.01.0`, `21.01.1`, `21.02.0`, `2131`]
1. `com.github.gtriip.translation.opera:opera-translation`  -> [`1.0.4`, `1.0.5`, `1.0.5-2`, `1.0.5-3`, `1.0.5-4`, `1.0.5-5`, `1.0.5-6`, `1.0.5-7`, `1.0.5-8`, `1.0.5-9`, `1.0.5-10`, `1.0.5-11`, `1.0.5-12`, `1.0.5-13`, `1.0.5-14`, `1.0.5-15`, `1.0.5-16`, `1.0.5-17`, `1.0.5-18`]
1. `com.github.shynixn.blockball:blockball-bukkit-plugin`  -> [`6.15.0`, `6.16.0`, `6.17.0`, `6.18.0`, `6.19.0`, `6.20.0`, `6.20.1`, `6.21.0`, `6.22.0`, `6.22.1`]
1. `com.github.shynixn.petblocks:petblocks-bukkit-plugin`  -> [`8.16.0`, `8.17.0`, `8.17.1`, `8.18.0`, `8.19.0`, `8.20.0`, `8.21.0`, `8.22.1`, `8.23.0`]
1. `com.google.api-ads:google-ads-shadowjar`  -> [`0.0.1-alpha`, `15.0.0`, `16.0.0`, `16.0.1`, `16.0.2`, `16.0.3`, `17.0.0`, `17.0.1`, `18.0.0`]
1. `com.google.api-ads:google-ads`  -> [`16.0.0`, `16.0.1`]
1. `com.google.appengine:runtime-impl`  -> [`2.0.5`]
1. `com.google.cloud.opentelemetry:exporter-auto`  -> [`0.10.0`, `0.10.1`, `0.11.0`, `0.14.0-RC1`, `0.15.0-alpha`, `0.16.0-alpha`, `0.17.0-alpha`, `0.18.0-alpha`, `0.18.1-alpha`, `0.19.0-alpha`, `0.20.0-alpha`, `0.21.0-alpha`, `0.22.0-alpha`]
1. `com.google.code.gson:gson`  -> [`2.8.6`, `2.8.7`, `2.8.8`, `2.8.9`, `2.9.0`]
1. `com.google.gerrit:gerrit-plugin-api`  -> [`3.6.0-rc0`, `3.6.0-rc1`, `3.6.0-rc2`, `3.6.0-rc3`, `3.6.0-rc4`]
1. `com.google.zetasql:zetasql-client`  -> [`2022.02.1`, `2022.04.1`]
1. `com.ibm.cloud:platform-services-examples`  -> [`0.24.1`, `0.24.2`]
1. `com.johnsnowlabs.nlp:pytorch-cpu_2.11`  -> [`0.0.5`, `0.0.6`, `0.0.8`, `0.0.9`, `0.0.11`, `0.0.12`]
1. `com.johnsnowlabs.nlp:pytorch-cpu_2.12`  -> [`0.0.5`, `0.0.6`, `0.0.8`, `0.0.9`, `0.0.11`, `0.0.12`]
1. `com.johnsnowlabs.nlp:pytorch-cpu_2.13`  -> [`0.0.5`, `0.0.6`, `0.0.8`, `0.0.9`]
1. `com.jpaulmorrison:javafbp-websockets`  -> [`1.2.4`, `1.2.5`]
1. `com.jpaulmorrison:javafbp`  -> [`4.1.4`, `4.1.5`, `4.1.6`, `4.1.7`, `4.1.8`, `4.1.9`]
1. `com.konduto.sdk:java-sdk`  -> [`2.14.0`, `2.15.0`]
1. `com.languageweaver.sdk:lw-sdk`  -> [`1.1`, `1.2`, `1.3`]
1. `com.launchdarkly:launchdarkly-java-server-sdk`  -> [`5.6.4`, `5.6.5`]
1. `com.newrelic.agent.extension:jfr-reporter`  -> [`0.2.0`, `0.3.0`]
1. `com.newrelic.telemetry:opentelemetry-exporters-newrelic-auto`  -> [`0.5.0`, `0.5.1`, `0.6.0`, `0.6.1`, `0.6.2`, `0.7.0`, `0.8.0`, `0.8.1`, `0.9.0`, `0.10.0`, `0.11.0`, `0.12.0`, `0.13.0`, `0.13.1`]
1. `com.newrelic.telemetry:telemetry-core`  -> [`0.6.0`, `0.6.1`, `0.7.0`, `0.8.0`, `0.9.0`, `0.10.0`]
1. `com.newrelic:jfr-daemon`  -> [`0.2.0`, `0.3.0`, `0.4.0`, `0.5.0`, `1.0.0`, `1.1.0`, `1.2.0`, `1.3.0`, `1.4.0`, `1.5.0`, `1.6.0`, `1.7.0`]
1. `com.oneandone:go-maven-poller`  -> [`1.3.7`]
1. `com.rockset:rockset-java`  -> [`0.9.2`]
1. `com.salesforce.cantor:cantor-server`  -> [`0.3.16`, `0.3.17`, `0.4.0`, `0.4.1`, `0.4.2`, `0.4.4`, `0.4.6`, `0.4.7`, `0.4.8`, `0.4.27`, `0.4.28`, `0.4.29`, `0.4.30`, `0.4.31`, `0.4.32`, `0.4.33`, `0.4.34`, `0.4.35`, `0.5.0`]
1. `com.salesforce.dockerfile-image-update:dockerfile-image-update`  -> [`1.1.4`, `1.1.6`, `1.1.7`, `1.1.8`, `1.1.9`, `1.1.10`, `1.1.11`, `1.1.13`]
1. `com.sap.cloud.sdk.datamodel:openapi-generator-cli`  -> [`3.64.0`, `3.65.0`, `3.66.0`, `3.67.0`]
1. `com.scalar-labs:scalardl-java-client-sdk`  -> [`2.0.9`, `2.1.0`, `2.1.1`, `2.2.0`]
1. `com.smartcar.sdk:java-sdk`  -> [`3.0.0`, `3.1.0`, `3.1.1`, `3.1.2`, `3.2.0`, `3.2.1`]
1. `com.vertica.jdbc:vertica-jdbc`  -> [`11.0.0-0`, `11.0.1-0`, `11.0.2-0`, `11.1.0-0`, `11.1.1-0`]
1. `de.labathome:gears`  -> [`1.0.0`]
1. `de.labathome:irb`  -> [`1.0.1`, `1.0.2`, `1.0.3`]
1. `dev.auth3.identity:admin-sdk`  -> [`1.0.0`]
1. `dev.robocode.tankroyale:robocode-tankroyale-bot-api`  -> [`0.10.0`, `0.11.0`, `0.11.1`, `0.11.2`, `0.12.0`, `0.13.0`]
1. `dev.zacsweers:kgp-160-patcher`  -> [`1.0.0`]
1. `io.github.gajendragusain:EmbeddedHttpServer`  -> [`0.1.2`, `0.1.3`]
1. `io.github.openfeign.experimental:feign-apt-test-generator`  -> [`11.3`, `11.4`, `11.5`, `11.6`, `11.7`, `11.8`]
1. `io.github.openfeign:feign-example-github`  -> [`11.3`, `11.4`, `11.5`, `11.6`, `11.7`, `11.8`]
1. `io.github.openfeign:feign-example-wikipedia`  -> [`11.3`, `11.4`, `11.5`, `11.6`, `11.7`, `11.8`]
1. `io.github.palexdev:gson`  -> [`2.9.0`]
1. `io.github.scalapb-json:protoc-lint-shaded_2.12`  -> [`0.3.0`, `0.4.0`, `0.5.0`]
1. `io.github.tzfun.jvmm:jvmm-server`  -> [`1.0.0`]
1. `io.jooby:jooby-graphql`  -> [`2.14.0`, `2.14.1`]
1. `io.kamon:kamon-bundle_2.12`  -> [`2.1.5`]
1. `io.kamon:kamon-bundle_2.13`  -> [`2.1.5`]
1. `io.kestra.plugin:plugin-dbt`  -> [`0.4.0`]
1. `io.kestra.plugin:plugin-gcp`  -> [`0.4.0`, `0.4.1`, `0.4.2`]
1. `io.opentelemetry.contrib:opentelemetry-java-contrib-jmx-metrics`  -> [`1.0.0-alpha`]
1. `io.opentelemetry.javaagent:opentelemetry-javaagent-exporter-jaeger-thrift`  -> [`0.13.0`, `0.13.1`, `0.14.0`]
1. `io.opentelemetry.javaagent:opentelemetry-javaagent-exporter-jaeger`  -> [`0.12.0`, `0.12.1`, `0.13.0`, `0.13.1`, `0.14.0`]
1. `io.opentelemetry.javaagent:opentelemetry-javaagent-exporter-otlp`  -> [`0.12.0`, `0.12.1`, `0.13.0`, `0.13.1`, `0.14.0`]
1. `io.opentracing.contrib:opentelemetry-bridge`  -> [`0.4.0`]
1. `io.pravega:pravega-test-system`  -> [`0.11.0`]
1. `io.qbeast:qbeast-spark-keeper_2.12`  -> [`0.1.0-a1`, `0.1.0-a2`]
1. `io.shiftleft:ghidra`  -> [`9.2_PUBLIC_20201113`, `10.0_PUBLIC_20210621`]
1. `net.cnri.cordra:cordra-embedded-test-server`  -> [`2.3.0`, `2.3.1`, `2.3.2`, `2.4.0`]
1. `net.intelie.pipes:pipes`  -> [`0.25.3`]
1. `net.revelc.code.formatter:jsdt-core`  -> [`3.0.0`, `3.1.0`]
1. `net.serenity-bdd:serenity-cli`  -> [`3.2.1`, `3.2.2`, `3.2.3`, `3.2.4`, `3.2.5`]
1. `org.apache.beam:beam-sdks-java-io-google-cloud-platform-expansion-service`  -> [`2.29.0`, `2.30.0`, `2.31.0`, `2.32.0`, `2.33.0`]
1. `org.apache.beam:beam-vendor-grpc-1_26_0`  -> [`0.1`]
1. `org.apache.jena:jena-fuseki-fulljar`  -> [`4.5.0`]
1. `org.apache.jena:jena-fuseki-geosparql`  -> [`4.5.0`]
1. `org.apache.jena:jena-fuseki-server`  -> [`4.5.0`]
1. `org.apache.jena:jena-jdbc-driver-bundle`  -> [`4.5.0`]
1. `org.apache.kudu:kudu-backup-tools`  -> [`1.12.0`, `1.13.0`, `1.14.0`, `1.15.0`, `1.16.0`]
1. `org.apache.kudu:kudu-backup2_2.11`  -> [`1.12.0`, `1.13.0`]
1. `org.apache.kudu:kudu-backup3_2.12`  -> [`1.14.0`, `1.15.0`, `1.16.0`]
1. `org.eclipse.californium:cf-plugtest-checker`  -> [`3.2.0`, `3.3.0`, `3.3.1`, `3.4.0`, `3.5.0`]
1. `org.eclipse.californium:cf-plugtest-client`  -> [`3.5.0`]
1. `org.jetbrains.dokka:kotlin-analysis-intellij`  -> [`1.4.32`]
1. `org.jetbrains.kotlin:kotlin-gradle-plugin`  -> [`1.4.20-M1`, `1.4.20-RC`, `1.4.20`, `1.4.21`, `1.4.30-M1`, `1.4.30-RC`, `1.4.30`, `1.4.31`, `1.5.0-M1`, `1.5.0-M2`, `1.5.0-RC`, `1.5.0`, `1.5.10`, `1.5.20-M1`, `1.5.20-RC`, `1.5.20`, `1.5.21`, `1.5.30-M1`, `1.5.30-RC`, `1.5.30`, `1.5.31`, `1.6.0-M1`, `1.6.0-RC`, `1.6.0-RC2`, `1.6.0`, `1.6.10-RC`, `1.6.10`, `1.6.20-M1`, `1.6.20-RC`, `1.6.20-RC2`, `1.6.20`, `1.6.21`, `1.7.0-Beta`]
1. `org.kill-bill.billing.plugin.java:stripe-plugin`  -> [`7.0.2`, `7.0.3`, `7.0.4`]
1. `org.kin.sdk.android:base-shaded`  -> [`0.4.7`, `1.0.0`, `1.0.1`, `2.0.0`, `2.1.0`, `2.1.1`, `2.1.2`]
1. `org.noear:luffy.lock.redis`  -> [`1.2.1`]
1. `org.noear:luffy.queue.redis`  -> [`1.2.1`]
1. `org.odpi.egeria:egeria-connector-viya-4`  -> [`2.11`, `3.3`, `3.6`]
1. `org.opendaylight.jsonrpc:test-tool`  -> [`1.12.0`]
1. `org.seaborne.rdf-delta:rdf-delta-server`  -> [`1.1.1`]
1. `org.sonarsource.api.plugin:sonar-plugin-api`  -> [`9.5.0.71`, `9.6.0.104`, `9.6.1.114`]
1. `org.sonarsource.dotnet:sonar-csharp-plugin`  -> [`8.36.0.43782`, `8.36.1.44192`, `8.37.0.45539`, `8.38.0.46746`]
1. `org.sonarsource.dotnet:sonar-vbnet-plugin`  -> [`8.36.0.43782`, `8.36.1.44192`, `8.37.0.45539`, `8.38.0.46746`]
1. `org.sonarsource.sonarlint.core:sonarlint-core-osgi`  -> [`8.5.0.46449`]
1. `org.sonarsource.sonarlint.core:sonarlint-core`  -> [`8.5.0.46449`]
1. `org.sonarsource.sonarqube:sonar-plugin-api`  -> [`8.3.0.34182`, `8.3.1.34397`, `8.4.0.35506`, `8.4.1.35646`, `8.4.2.36762`, `8.5.0.37579`, `8.5.1.38104`, `8.6.0.39681`, `8.6.1.40680`, `8.7.0.41497`, `8.7.1.42226`, `8.8.0.42792`, `8.9.0.43852`, `8.9.1.44547`, `9.0.0.45539`, `9.0.1.46107`, `9.1.0.47736`, `9.2.0.49796`, `9.2.0.49834`, `9.2.1.49989`, `9.2.2.50622`, `9.2.3.50713`, `9.2.4.50792`, `9.3.0.51899`, `9.4.0.54424`]
1. `org.wso2.cloud.secrets:cloud-cipher-tool`  -> [`1.0.0`]
1. `tech.xigam:grasscutter`  -> [`1.0.0-dev`, `1.0.1-dev`, `1.0.2-dev`]
1. `xyz.deftu.coffeecord:Coffeecord`  -> [`1.0.0-alpha.1`]
1. `xyz.gianlu.librespot:librespot-api`  -> [`1.5.0`, `1.5.1`, `1.5.2`, `1.5.3`, `1.5.4`, `1.5.5`, `1.6.0`, `1.6.1`, `1.6.2`]
1. `xyz.gianlu.librespot:librespot-player`  -> [`1.5.0`, `1.5.1`, `1.5.2`, `1.5.3`, `1.5.4`, `1.5.5`, `1.6.0`, `1.6.1`, `1.6.2`]
1. `xyz.tozymc.api:config-api`  -> [`1.0-BETA`]

## com.fasterxml.jackson.core

For example, at least 102 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.core`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.core;`.

1. `ch.dsivd.copper:copper`  -> [`1.2.0`]
1. `com.c4-soft.springaddons:keycloak-grants-mapper`  -> [`3.1.13-jdk17`, `3.1.14-jdk1.8`, `3.1.14-jdk11`, `3.1.14-jdk17`]
1. `com.daml:ledger-api-bench-tool`  -> [`1.15.0-snapshot.20210630.7261.0.84e1f3a7`, `1.15.0-snapshot.20210705.7286.0.62aabcc4`, `1.16.0-snapshot.20210713.7343.0.1f35db17`, `1.16.0-snapshot.20210720.7404.0.b7cf42d1`, `1.16.0-snapshot.20210727.7476.0.b5e9d861`, `1.16.0-snapshot.20210802.7499.0.5157ad6d`, `1.16.0-snapshot.20210805.7501.0.48050ad7`, `1.16.0`, `1.17.0-snapshot.20210811.7565.0.f1a55aa4`, `1.17.0-snapshot.20210817.7604.0.0c187853`, `1.17.0-snapshot.20210824.7647.0.640fb683`, `1.17.0-snapshot.20210831.7702.0.f058c2f1`, `1.17.0-snapshot.20210907.7759.0.35a853fd`, `1.17.0-snapshot.20210910.7786.0.976ca400`, `1.17.0-snapshot.20210915.7841.0.b4328b3d`, `1.18.0-snapshot.20210921.7889.0.1b473c2b`, `1.18.0-snapshot.20210921.7889.1.1b473c2b`, `1.18.0-snapshot.20210922.7908.0.ced4a272`, `1.18.0-snapshot.20210928.7948.0.b4d00317`, `1.18.0-snapshot.20211006.8003.0.cfcdc13c`, `1.18.0-snapshot.20211013.8071.0.514e8b50`, `1.18.0-snapshot.20211019.8113.0.8ff347d8`, `1.18.0-snapshot.20211026.8179.0.e474b2d1`, `1.18.0-snapshot.20211102.8257.0.7391a3cd`, `1.18.0-snapshot.20211109.8328.0.92181161`, `1.18.0-snapshot.20211110.8337.0.c5a1f0bb`, `1.18.0-snapshot.20211111.8349.0.d938a44c`, `1.18.0-snapshot.20211117.8399.0.a05a40ae`, `2.0.0-snapshot.20211123.8463.0.bd2a6852`, `2.0.0-snapshot.20211201.8538.0.1d0ff3cc`, `2.0.0-snapshot.20211207.8589.1.85e2fa55`, `2.0.0-snapshot.20211207.8589.2.85e2fa55`, `2.0.0-snapshot.20211207.8589.3.85e2fa55`, `2.0.0-snapshot.20211207.8608.0.c4d82f72`, `2.0.0-snapshot.20211209.8636.0.0a17087b`, `2.0.0-snapshot.20211209.8636.1.0a17087b`, `2.0.0-snapshot.20211210.8653.0.35beb44c`, `2.0.0-snapshot.20211220.8735.0.606a8ef0`, `2.0.0-snapshot.20211220.8736.0.040f1a93`, `2.0.0-snapshot.20220104.8767.0.d3101e01`, `2.0.0-snapshot.20220105.8777.0.cb15ab5a`, `2.0.0-snapshot.20220110.8812.0.3a08380b`, `2.0.0-snapshot.20220111.8828.0.7ec55d7f`, `2.0.0-snapshot.20220117.8894.0.502b21f8`, `2.0.0-snapshot.20220117.8897.0.36a93ef0`, `2.0.0-snapshot.20220118.8919.0.d0813e61`, `2.0.0-snapshot.20220119.8939.0.ebd3827c`, `2.0.0-snapshot.20220124.8981.0.a150737d`, `2.0.0-snapshot.20220125.9008.0.ed33c0d5`, `2.0.0-snapshot.20220126.9017.0.159f3847`, `2.0.0-snapshot.20220126.9029.0.42cf70b1`, `2.0.0-snapshot.20220127.9042.0.4038d0a7`, `2.0.0-snapshot.20220127.9049.0.345e2679`, `2.0.0-snapshot.20220201.9108.0.aa2494f1`, `2.0.0-snapshot.20220204.9165.0.225c58f4`, `2.0.0-snapshot.20220207.9186.0.f63165aa`, `2.0.0-snapshot.20220207.9190.0.89c9c5d3`, `2.0.0-snapshot.20220208.9197.0.8182602f`, `2.0.0-snapshot.20220208.9207.0.7b70711c`, `2.0.0-snapshot.20220209.9212.0.b7fc9f57`, `2.0.0-snapshot.20220210.9222.0.f2797795`, `2.0.0-snapshot.20220210.9244.0.6a91fdfe`, `2.0.0-snapshot.20220211.9260.0.3dccabf6`, `2.0.0-snapshot.20220212.9261.0.3ebd9d7b`, `2.0.0-snapshot.20220214.9284.0.dc5f2033`, `2.0.0-snapshot.20220215.9307.0.55fef9cf`, `2.0.0-snapshot.20220216.9321.0.eb45a4ce`, `2.0.0-snapshot.20220217.9331.0.a9fd5497`, `2.0.0-snapshot.20220221.9339.0.6d268fdc`, `2.0.0-snapshot.20220222.9362.0.1af680cd`, `2.1.0-snapshot.20220223.9363.0.d96b7bdc`, `2.1.0-snapshot.20220223.9379.0.2f86d8d3`, `2.1.0-snapshot.20220224.9392.0.786906f2`, `2.1.0-snapshot.20220225.9408.0.1783146c`, `2.1.0-snapshot.20220228.9413.0.ef8a0e66`, `2.1.0-snapshot.20220301.9419.0.091a5ac7`, `2.1.0-snapshot.20220302.9431.0.96029b7c`, `2.1.0-snapshot.20220303.9441.0.e6db3271`, `2.1.0-snapshot.20220304.9449.0.1f1e5051`, `2.1.0-snapshot.20220307.9459.0.878754e9`, `2.1.0-snapshot.20220308.9472.0.1f24348e`, `2.1.0-snapshot.20220309.9493.0.9a27edd6`, `2.1.0-snapshot.20220310.9512.0.e1030365`, `2.1.0-snapshot.20220311.9514.0.ab6e085f`, `2.1.0-snapshot.20220314.9530.0.2056f0a5`, `2.1.0-snapshot.20220315.9543.0.0b5ad7a7`, `2.1.0-snapshot.20220316.9555.0.f1949b44`, `2.1.0-snapshot.20220317.9559.0.1118a7fb`, `2.1.0-snapshot.20220318.9568.0.d37a63f5`, `2.1.0-snapshot.20220321.9580.0.49e950dc`, `2.1.0-snapshot.20220322.9591.0.d10f6785`, `2.1.0-snapshot.20220323.9607.0.a88079e4`, `2.1.0-snapshot.20220324.9615.0.467b8fbb`, `2.1.0-snapshot.20220325.9626.0.4a483381`, `2.1.0-snapshot.20220328.9630.0.66c37bad`, `2.1.0-snapshot.20220329.9638.0.f24a39d2`, `2.1.0-snapshot.20220330.9647.0.7000875e`, `2.1.0-snapshot.20220331.9659.0.4bf0de89`, `2.1.0-snapshot.20220404.9660.0.4b71431b`, `2.1.0-snapshot.20220405.9667.0.17bca6b1`, `2.1.0-snapshot.20220406.9678.0.ef3c5d4e`, `2.1.0-snapshot.20220407.9685.0.7ed507cf`, `2.1.0-snapshot.20220409.9691.0.7eccdfab`, `2.1.0-snapshot.20220411.9707.0.f6fed6ea`, `2.2.0-snapshot.20220412.9721.0.b7c4bdab`, `2.2.0-snapshot.20220413.9724.0.2dc1085b`, `2.2.0-snapshot.20220414.9733.0.957db9b0`, `2.2.0-snapshot.20220415.9735.0.6b3e7969`, `2.2.0-snapshot.20220418.9736.0.988b6090`, `2.2.0-snapshot.20220420.9744.0.e193f421`, `2.2.0-snapshot.20220420.9758.0.611cce8c`, `2.2.0-snapshot.20220421.9765.0.fc8ec7f2`, `2.2.0-snapshot.20220422.9774.0.b2d9f74b`, `2.2.0-snapshot.20220425.9780.0.f4d60375`, `2.2.0-snapshot.20220426.9797.0.00c944ae`, `2.2.0-snapshot.20220427.9808.0.f0303b69`, `2.2.0-snapshot.20220428.9820.0.615d2e62`, `2.2.0-snapshot.20220429.9826.0.2e6dbefa`, `2.2.0-snapshot.20220501.9828.0.7297fe9d`, `2.2.0-snapshot.20220502.9831.0.58c615a2`, `2.2.0-snapshot.20220503.9846.0.1b9e9905`, `2.2.0-snapshot.20220504.9851.0.4c8e027d`, `2.3.0-snapshot.20220505.9861.0.5d8ebd7a`, `2.3.0-snapshot.20220507.9869.0.2115fbf5`, `2.3.0-snapshot.20220509.9874.0.0798fe15`]
1. `com.daml:ledger-api-test-tool-1.13`  -> [`1.15.0-snapshot.20210630.7261.0.84e1f3a7`, `1.15.0-snapshot.20210705.7286.0.62aabcc4`, `1.16.0-snapshot.20210713.7343.0.1f35db17`, `1.16.0-snapshot.20210720.7404.0.b7cf42d1`, `1.16.0-snapshot.20210727.7476.0.b5e9d861`, `1.16.0-snapshot.20210802.7499.0.5157ad6d`, `1.16.0-snapshot.20210805.7501.0.48050ad7`, `1.16.0`, `1.17.0-snapshot.20210811.7565.0.f1a55aa4`, `1.17.0-snapshot.20210817.7604.0.0c187853`]
1. `com.daml:ledger-api-test-tool-1.14`  -> [`1.15.0-snapshot.20210630.7261.0.84e1f3a7`, `1.15.0-snapshot.20210705.7286.0.62aabcc4`, `1.16.0-snapshot.20210713.7343.0.1f35db17`, `1.16.0-snapshot.20210720.7404.0.b7cf42d1`, `1.16.0-snapshot.20210727.7476.0.b5e9d861`, `1.16.0-snapshot.20210802.7499.0.5157ad6d`, `1.16.0-snapshot.20210805.7501.0.48050ad7`, `1.16.0`, `1.17.0-snapshot.20210811.7565.0.f1a55aa4`, `1.17.0-snapshot.20210817.7604.0.0c187853`, `1.17.0-snapshot.20210824.7647.0.640fb683`, `1.17.0-snapshot.20210831.7702.0.f058c2f1`, `1.17.0-snapshot.20210907.7759.0.35a853fd`, `1.17.0-snapshot.20210910.7786.0.976ca400`, `1.17.0-snapshot.20210915.7841.0.b4328b3d`, `1.18.0-snapshot.20210921.7889.0.1b473c2b`, `1.18.0-snapshot.20210921.7889.1.1b473c2b`, `1.18.0-snapshot.20210922.7908.0.ced4a272`, `1.18.0-snapshot.20210928.7948.0.b4d00317`, `1.18.0-snapshot.20211006.8003.0.cfcdc13c`, `1.18.0-snapshot.20211013.8071.0.514e8b50`, `1.18.0-snapshot.20211019.8113.0.8ff347d8`, `1.18.0-snapshot.20211026.8179.0.e474b2d1`, `1.18.0-snapshot.20211102.8257.0.7391a3cd`, `1.18.0-snapshot.20211109.8328.0.92181161`, `1.18.0-snapshot.20211110.8337.0.c5a1f0bb`, `1.18.0-snapshot.20211111.8349.0.d938a44c`, `1.18.0-snapshot.20211117.8399.0.a05a40ae`, `2.0.0-snapshot.20211123.8463.0.bd2a6852`, `2.0.0-snapshot.20211201.8538.0.1d0ff3cc`, `2.0.0-snapshot.20211207.8589.1.85e2fa55`, `2.0.0-snapshot.20211207.8589.2.85e2fa55`, `2.0.0-snapshot.20211207.8589.3.85e2fa55`, `2.0.0-snapshot.20211207.8608.0.c4d82f72`, `2.0.0-snapshot.20211209.8636.0.0a17087b`, `2.0.0-snapshot.20211209.8636.1.0a17087b`, `2.0.0-snapshot.20211210.8653.0.35beb44c`, `2.0.0-snapshot.20211220.8735.0.606a8ef0`, `2.0.0-snapshot.20211220.8736.0.040f1a93`, `2.0.0-snapshot.20220104.8767.0.d3101e01`, `2.0.0-snapshot.20220105.8777.0.cb15ab5a`, `2.0.0-snapshot.20220110.8812.0.3a08380b`, `2.0.0-snapshot.20220111.8828.0.7ec55d7f`, `2.0.0-snapshot.20220117.8894.0.502b21f8`, `2.0.0-snapshot.20220117.8897.0.36a93ef0`, `2.0.0-snapshot.20220118.8919.0.d0813e61`, `2.0.0-snapshot.20220119.8939.0.ebd3827c`, `2.0.0-snapshot.20220124.8981.0.a150737d`, `2.0.0-snapshot.20220125.9008.0.ed33c0d5`, `2.0.0-snapshot.20220126.9017.0.159f3847`, `2.0.0-snapshot.20220126.9029.0.42cf70b1`, `2.0.0-snapshot.20220127.9042.0.4038d0a7`, `2.0.0-snapshot.20220127.9049.0.345e2679`, `2.0.0-snapshot.20220201.9108.0.aa2494f1`, `2.0.0-snapshot.20220204.9165.0.225c58f4`, `2.0.0-snapshot.20220207.9186.0.f63165aa`, `2.0.0-snapshot.20220207.9190.0.89c9c5d3`, `2.0.0-snapshot.20220208.9197.0.8182602f`, `2.0.0-snapshot.20220208.9207.0.7b70711c`, `2.0.0-snapshot.20220209.9212.0.b7fc9f57`, `2.0.0-snapshot.20220210.9222.0.f2797795`, `2.0.0-snapshot.20220210.9244.0.6a91fdfe`, `2.0.0-snapshot.20220211.9260.0.3dccabf6`, `2.0.0-snapshot.20220212.9261.0.3ebd9d7b`, `2.0.0-snapshot.20220214.9284.0.dc5f2033`, `2.0.0-snapshot.20220215.9307.0.55fef9cf`, `2.0.0-snapshot.20220216.9321.0.eb45a4ce`, `2.0.0-snapshot.20220217.9331.0.a9fd5497`, `2.0.0-snapshot.20220221.9339.0.6d268fdc`, `2.0.0-snapshot.20220222.9362.0.1af680cd`, `2.1.0-snapshot.20220223.9363.0.d96b7bdc`, `2.1.0-snapshot.20220223.9379.0.2f86d8d3`, `2.1.0-snapshot.20220224.9392.0.786906f2`, `2.1.0-snapshot.20220225.9408.0.1783146c`, `2.1.0-snapshot.20220228.9413.0.ef8a0e66`, `2.1.0-snapshot.20220301.9419.0.091a5ac7`, `2.1.0-snapshot.20220302.9431.0.96029b7c`, `2.1.0-snapshot.20220303.9441.0.e6db3271`, `2.1.0-snapshot.20220304.9449.0.1f1e5051`, `2.1.0-snapshot.20220307.9459.0.878754e9`, `2.1.0-snapshot.20220308.9472.0.1f24348e`, `2.1.0-snapshot.20220309.9493.0.9a27edd6`, `2.1.0-snapshot.20220310.9512.0.e1030365`, `2.1.0-snapshot.20220311.9514.0.ab6e085f`, `2.1.0-snapshot.20220314.9530.0.2056f0a5`, `2.1.0-snapshot.20220315.9543.0.0b5ad7a7`, `2.1.0-snapshot.20220316.9555.0.f1949b44`, `2.1.0-snapshot.20220317.9559.0.1118a7fb`, `2.1.0-snapshot.20220318.9568.0.d37a63f5`, `2.1.0-snapshot.20220321.9580.0.49e950dc`, `2.1.0-snapshot.20220322.9591.0.d10f6785`, `2.1.0-snapshot.20220323.9607.0.a88079e4`, `2.1.0-snapshot.20220324.9615.0.467b8fbb`, `2.1.0-snapshot.20220325.9626.0.4a483381`, `2.1.0-snapshot.20220328.9630.0.66c37bad`, `2.1.0-snapshot.20220329.9638.0.f24a39d2`, `2.1.0-snapshot.20220330.9647.0.7000875e`, `2.1.0-snapshot.20220331.9659.0.4bf0de89`, `2.1.0-snapshot.20220404.9660.0.4b71431b`, `2.1.0-snapshot.20220405.9667.0.17bca6b1`, `2.1.0-snapshot.20220406.9678.0.ef3c5d4e`, `2.1.0-snapshot.20220407.9685.0.7ed507cf`, `2.1.0-snapshot.20220409.9691.0.7eccdfab`, `2.1.0-snapshot.20220411.9707.0.f6fed6ea`, `2.2.0-snapshot.20220412.9721.0.b7c4bdab`, `2.2.0-snapshot.20220413.9724.0.2dc1085b`, `2.2.0-snapshot.20220414.9733.0.957db9b0`, `2.2.0-snapshot.20220415.9735.0.6b3e7969`, `2.2.0-snapshot.20220418.9736.0.988b6090`, `2.2.0-snapshot.20220420.9744.0.e193f421`, `2.2.0-snapshot.20220420.9758.0.611cce8c`, `2.2.0-snapshot.20220421.9765.0.fc8ec7f2`, `2.2.0-snapshot.20220422.9774.0.b2d9f74b`, `2.2.0-snapshot.20220425.9780.0.f4d60375`, `2.2.0-snapshot.20220426.9797.0.00c944ae`, `2.2.0-snapshot.20220427.9808.0.f0303b69`, `2.2.0-snapshot.20220428.9820.0.615d2e62`, `2.2.0-snapshot.20220429.9826.0.2e6dbefa`, `2.2.0-snapshot.20220501.9828.0.7297fe9d`, `2.2.0-snapshot.20220502.9831.0.58c615a2`, `2.2.0-snapshot.20220503.9846.0.1b9e9905`, `2.2.0-snapshot.20220504.9851.0.4c8e027d`, `2.3.0-snapshot.20220505.9861.0.5d8ebd7a`, `2.3.0-snapshot.20220507.9869.0.2115fbf5`, `2.3.0-snapshot.20220509.9874.0.0798fe15`]
1. `com.daml:ledger-api-test-tool-1.dev`  -> [`1.15.0-snapshot.20210630.7261.0.84e1f3a7`, `1.15.0-snapshot.20210705.7286.0.62aabcc4`, `1.16.0-snapshot.20210713.7343.0.1f35db17`, `1.16.0-snapshot.20210720.7404.0.b7cf42d1`, `1.16.0-snapshot.20210727.7476.0.b5e9d861`, `1.16.0-snapshot.20210802.7499.0.5157ad6d`, `1.16.0-snapshot.20210805.7501.0.48050ad7`, `1.16.0`, `1.17.0-snapshot.20210811.7565.0.f1a55aa4`, `1.17.0-snapshot.20210817.7604.0.0c187853`, `1.17.0-snapshot.20210824.7647.0.640fb683`, `1.17.0-snapshot.20210831.7702.0.f058c2f1`, `1.17.0-snapshot.20210907.7759.0.35a853fd`, `1.17.0-snapshot.20210910.7786.0.976ca400`, `1.17.0-snapshot.20210915.7841.0.b4328b3d`, `1.18.0-snapshot.20210921.7889.0.1b473c2b`, `1.18.0-snapshot.20210921.7889.1.1b473c2b`, `1.18.0-snapshot.20210922.7908.0.ced4a272`, `1.18.0-snapshot.20210928.7948.0.b4d00317`, `1.18.0-snapshot.20211006.8003.0.cfcdc13c`, `1.18.0-snapshot.20211013.8071.0.514e8b50`, `1.18.0-snapshot.20211019.8113.0.8ff347d8`, `1.18.0-snapshot.20211026.8179.0.e474b2d1`, `1.18.0-snapshot.20211102.8257.0.7391a3cd`, `1.18.0-snapshot.20211109.8328.0.92181161`, `1.18.0-snapshot.20211110.8337.0.c5a1f0bb`, `1.18.0-snapshot.20211111.8349.0.d938a44c`, `1.18.0-snapshot.20211117.8399.0.a05a40ae`, `2.0.0-snapshot.20211123.8463.0.bd2a6852`, `2.0.0-snapshot.20211201.8538.0.1d0ff3cc`, `2.0.0-snapshot.20211207.8589.1.85e2fa55`, `2.0.0-snapshot.20211207.8589.2.85e2fa55`, `2.0.0-snapshot.20211207.8589.3.85e2fa55`, `2.0.0-snapshot.20211207.8608.0.c4d82f72`, `2.0.0-snapshot.20211209.8636.0.0a17087b`, `2.0.0-snapshot.20211209.8636.1.0a17087b`, `2.0.0-snapshot.20211210.8653.0.35beb44c`, `2.0.0-snapshot.20211220.8735.0.606a8ef0`, `2.0.0-snapshot.20211220.8736.0.040f1a93`, `2.0.0-snapshot.20220104.8767.0.d3101e01`, `2.0.0-snapshot.20220105.8777.0.cb15ab5a`, `2.0.0-snapshot.20220110.8812.0.3a08380b`, `2.0.0-snapshot.20220111.8828.0.7ec55d7f`, `2.0.0-snapshot.20220117.8894.0.502b21f8`, `2.0.0-snapshot.20220117.8897.0.36a93ef0`, `2.0.0-snapshot.20220118.8919.0.d0813e61`, `2.0.0-snapshot.20220119.8939.0.ebd3827c`, `2.0.0-snapshot.20220124.8981.0.a150737d`, `2.0.0-snapshot.20220125.9008.0.ed33c0d5`, `2.0.0-snapshot.20220126.9017.0.159f3847`, `2.0.0-snapshot.20220126.9029.0.42cf70b1`, `2.0.0-snapshot.20220127.9042.0.4038d0a7`, `2.0.0-snapshot.20220127.9049.0.345e2679`, `2.0.0-snapshot.20220201.9108.0.aa2494f1`, `2.0.0-snapshot.20220204.9165.0.225c58f4`, `2.0.0-snapshot.20220207.9186.0.f63165aa`, `2.0.0-snapshot.20220207.9190.0.89c9c5d3`, `2.0.0-snapshot.20220208.9197.0.8182602f`, `2.0.0-snapshot.20220208.9207.0.7b70711c`, `2.0.0-snapshot.20220209.9212.0.b7fc9f57`, `2.0.0-snapshot.20220210.9222.0.f2797795`, `2.0.0-snapshot.20220210.9244.0.6a91fdfe`, `2.0.0-snapshot.20220211.9260.0.3dccabf6`, `2.0.0-snapshot.20220212.9261.0.3ebd9d7b`, `2.0.0-snapshot.20220214.9284.0.dc5f2033`, `2.0.0-snapshot.20220215.9307.0.55fef9cf`, `2.0.0-snapshot.20220216.9321.0.eb45a4ce`, `2.0.0-snapshot.20220217.9331.0.a9fd5497`, `2.0.0-snapshot.20220221.9339.0.6d268fdc`, `2.0.0-snapshot.20220222.9362.0.1af680cd`, `2.1.0-snapshot.20220223.9363.0.d96b7bdc`, `2.1.0-snapshot.20220223.9379.0.2f86d8d3`, `2.1.0-snapshot.20220224.9392.0.786906f2`, `2.1.0-snapshot.20220225.9408.0.1783146c`, `2.1.0-snapshot.20220228.9413.0.ef8a0e66`, `2.1.0-snapshot.20220301.9419.0.091a5ac7`, `2.1.0-snapshot.20220302.9431.0.96029b7c`, `2.1.0-snapshot.20220303.9441.0.e6db3271`, `2.1.0-snapshot.20220304.9449.0.1f1e5051`, `2.1.0-snapshot.20220307.9459.0.878754e9`, `2.1.0-snapshot.20220308.9472.0.1f24348e`, `2.1.0-snapshot.20220309.9493.0.9a27edd6`, `2.1.0-snapshot.20220310.9512.0.e1030365`, `2.1.0-snapshot.20220311.9514.0.ab6e085f`, `2.1.0-snapshot.20220314.9530.0.2056f0a5`, `2.1.0-snapshot.20220315.9543.0.0b5ad7a7`, `2.1.0-snapshot.20220316.9555.0.f1949b44`, `2.1.0-snapshot.20220317.9559.0.1118a7fb`, `2.1.0-snapshot.20220318.9568.0.d37a63f5`, `2.1.0-snapshot.20220321.9580.0.49e950dc`, `2.1.0-snapshot.20220322.9591.0.d10f6785`, `2.1.0-snapshot.20220323.9607.0.a88079e4`, `2.1.0-snapshot.20220324.9615.0.467b8fbb`, `2.1.0-snapshot.20220325.9626.0.4a483381`, `2.1.0-snapshot.20220328.9630.0.66c37bad`, `2.1.0-snapshot.20220329.9638.0.f24a39d2`, `2.1.0-snapshot.20220330.9647.0.7000875e`, `2.1.0-snapshot.20220331.9659.0.4bf0de89`, `2.1.0-snapshot.20220404.9660.0.4b71431b`, `2.1.0-snapshot.20220405.9667.0.17bca6b1`, `2.1.0-snapshot.20220406.9678.0.ef3c5d4e`, `2.1.0-snapshot.20220407.9685.0.7ed507cf`, `2.1.0-snapshot.20220409.9691.0.7eccdfab`, `2.1.0-snapshot.20220411.9707.0.f6fed6ea`, `2.2.0-snapshot.20220412.9721.0.b7c4bdab`, `2.2.0-snapshot.20220413.9724.0.2dc1085b`, `2.2.0-snapshot.20220414.9733.0.957db9b0`, `2.2.0-snapshot.20220415.9735.0.6b3e7969`, `2.2.0-snapshot.20220418.9736.0.988b6090`, `2.2.0-snapshot.20220420.9744.0.e193f421`, `2.2.0-snapshot.20220420.9758.0.611cce8c`, `2.2.0-snapshot.20220421.9765.0.fc8ec7f2`, `2.2.0-snapshot.20220422.9774.0.b2d9f74b`, `2.2.0-snapshot.20220425.9780.0.f4d60375`, `2.2.0-snapshot.20220426.9797.0.00c944ae`, `2.2.0-snapshot.20220427.9808.0.f0303b69`, `2.2.0-snapshot.20220428.9820.0.615d2e62`, `2.2.0-snapshot.20220429.9826.0.2e6dbefa`, `2.2.0-snapshot.20220501.9828.0.7297fe9d`, `2.2.0-snapshot.20220502.9831.0.58c615a2`, `2.2.0-snapshot.20220503.9846.0.1b9e9905`, `2.2.0-snapshot.20220504.9851.0.4c8e027d`, `2.3.0-snapshot.20220505.9861.0.5d8ebd7a`, `2.3.0-snapshot.20220507.9869.0.2115fbf5`, `2.3.0-snapshot.20220509.9874.0.0798fe15`]
1. `com.daml:ledger-api-test-tool`  -> [`1.3.0-snapshot.20200701.4616.0.bdbefd11`, `1.3.0-snapshot.20200706.4664.0.5db06051`, `1.3.0-snapshot.20200708.4686.0.95dfa18e`, `1.3.0-snapshot.20200714.4687.0.8e10c7a7`, `1.4.0-snapshot.20200715.4733.0.d6e58626`, `1.15.0-snapshot.20210630.7261.0.84e1f3a7`, `1.15.0-snapshot.20210705.7286.0.62aabcc4`, `1.16.0-snapshot.20210713.7343.0.1f35db17`, `1.16.0-snapshot.20210720.7404.0.b7cf42d1`, `1.16.0-snapshot.20210727.7476.0.b5e9d861`, `1.16.0-snapshot.20210802.7499.0.5157ad6d`, `1.16.0-snapshot.20210805.7501.0.48050ad7`, `1.16.0`, `1.17.0-snapshot.20210811.7565.0.f1a55aa4`, `1.17.0-snapshot.20210817.7604.0.0c187853`, `1.17.0-snapshot.20210824.7647.0.640fb683`, `1.17.0-snapshot.20210831.7702.0.f058c2f1`, `1.17.0-snapshot.20210907.7759.0.35a853fd`, `1.17.0-snapshot.20210910.7786.0.976ca400`, `1.17.0-snapshot.20210915.7841.0.b4328b3d`, `1.18.0-snapshot.20210921.7889.0.1b473c2b`, `1.18.0-snapshot.20210921.7889.1.1b473c2b`, `1.18.0-snapshot.20210922.7908.0.ced4a272`, `1.18.0-snapshot.20210928.7948.0.b4d00317`, `1.18.0-snapshot.20211006.8003.0.cfcdc13c`, `1.18.0-snapshot.20211013.8071.0.514e8b50`, `1.18.0-snapshot.20211019.8113.0.8ff347d8`, `1.18.0-snapshot.20211026.8179.0.e474b2d1`, `1.18.0-snapshot.20211102.8257.0.7391a3cd`, `1.18.0-snapshot.20211109.8328.0.92181161`, `1.18.0-snapshot.20211110.8337.0.c5a1f0bb`, `1.18.0-snapshot.20211111.8349.0.d938a44c`, `1.18.0-snapshot.20211117.8399.0.a05a40ae`, `2.0.0-snapshot.20211123.8463.0.bd2a6852`, `2.0.0-snapshot.20211201.8538.0.1d0ff3cc`, `2.0.0-snapshot.20211207.8589.1.85e2fa55`, `2.0.0-snapshot.20211207.8589.2.85e2fa55`, `2.0.0-snapshot.20211207.8589.3.85e2fa55`, `2.0.0-snapshot.20211207.8608.0.c4d82f72`, `2.0.0-snapshot.20211209.8636.0.0a17087b`, `2.0.0-snapshot.20211209.8636.1.0a17087b`, `2.0.0-snapshot.20211210.8653.0.35beb44c`, `2.0.0-snapshot.20211220.8735.0.606a8ef0`, `2.0.0-snapshot.20211220.8736.0.040f1a93`, `2.0.0-snapshot.20220104.8767.0.d3101e01`, `2.0.0-snapshot.20220105.8777.0.cb15ab5a`, `2.0.0-snapshot.20220110.8812.0.3a08380b`, `2.0.0-snapshot.20220111.8828.0.7ec55d7f`, `2.0.0-snapshot.20220117.8894.0.502b21f8`, `2.0.0-snapshot.20220117.8897.0.36a93ef0`, `2.0.0-snapshot.20220118.8919.0.d0813e61`, `2.0.0-snapshot.20220119.8939.0.ebd3827c`, `2.0.0-snapshot.20220124.8981.0.a150737d`, `2.0.0-snapshot.20220125.9008.0.ed33c0d5`, `2.0.0-snapshot.20220126.9017.0.159f3847`, `2.0.0-snapshot.20220126.9029.0.42cf70b1`, `2.0.0-snapshot.20220127.9042.0.4038d0a7`, `2.0.0-snapshot.20220127.9049.0.345e2679`, `2.0.0-snapshot.20220201.9108.0.aa2494f1`, `2.0.0-snapshot.20220204.9165.0.225c58f4`, `2.0.0-snapshot.20220207.9186.0.f63165aa`, `2.0.0-snapshot.20220207.9190.0.89c9c5d3`, `2.0.0-snapshot.20220208.9197.0.8182602f`, `2.0.0-snapshot.20220208.9207.0.7b70711c`, `2.0.0-snapshot.20220209.9212.0.b7fc9f57`, `2.0.0-snapshot.20220210.9222.0.f2797795`, `2.0.0-snapshot.20220210.9244.0.6a91fdfe`, `2.0.0-snapshot.20220211.9260.0.3dccabf6`, `2.0.0-snapshot.20220212.9261.0.3ebd9d7b`, `2.0.0-snapshot.20220214.9284.0.dc5f2033`, `2.0.0-snapshot.20220215.9307.0.55fef9cf`, `2.0.0-snapshot.20220216.9321.0.eb45a4ce`, `2.0.0-snapshot.20220217.9331.0.a9fd5497`, `2.0.0-snapshot.20220221.9339.0.6d268fdc`, `2.0.0-snapshot.20220222.9362.0.1af680cd`, `2.1.0-snapshot.20220223.9363.0.d96b7bdc`, `2.1.0-snapshot.20220223.9379.0.2f86d8d3`, `2.1.0-snapshot.20220224.9392.0.786906f2`, `2.1.0-snapshot.20220225.9408.0.1783146c`, `2.1.0-snapshot.20220228.9413.0.ef8a0e66`, `2.1.0-snapshot.20220301.9419.0.091a5ac7`, `2.1.0-snapshot.20220302.9431.0.96029b7c`, `2.1.0-snapshot.20220303.9441.0.e6db3271`, `2.1.0-snapshot.20220304.9449.0.1f1e5051`, `2.1.0-snapshot.20220307.9459.0.878754e9`, `2.1.0-snapshot.20220308.9472.0.1f24348e`, `2.1.0-snapshot.20220309.9493.0.9a27edd6`, `2.1.0-snapshot.20220310.9512.0.e1030365`, `2.1.0-snapshot.20220311.9514.0.ab6e085f`, `2.1.0-snapshot.20220314.9530.0.2056f0a5`, `2.1.0-snapshot.20220315.9543.0.0b5ad7a7`, `2.1.0-snapshot.20220316.9555.0.f1949b44`, `2.1.0-snapshot.20220317.9559.0.1118a7fb`, `2.1.0-snapshot.20220318.9568.0.d37a63f5`, `2.1.0-snapshot.20220321.9580.0.49e950dc`, `2.1.0-snapshot.20220322.9591.0.d10f6785`, `2.1.0-snapshot.20220323.9607.0.a88079e4`, `2.1.0-snapshot.20220324.9615.0.467b8fbb`, `2.1.0-snapshot.20220325.9626.0.4a483381`, `2.1.0-snapshot.20220328.9630.0.66c37bad`, `2.1.0-snapshot.20220329.9638.0.f24a39d2`, `2.1.0-snapshot.20220330.9647.0.7000875e`, `2.1.0-snapshot.20220331.9659.0.4bf0de89`, `2.1.0-snapshot.20220404.9660.0.4b71431b`, `2.1.0-snapshot.20220405.9667.0.17bca6b1`, `2.1.0-snapshot.20220406.9678.0.ef3c5d4e`, `2.1.0-snapshot.20220407.9685.0.7ed507cf`, `2.1.0-snapshot.20220409.9691.0.7eccdfab`, `2.1.0-snapshot.20220411.9707.0.f6fed6ea`, `2.2.0-snapshot.20220412.9721.0.b7c4bdab`, `2.2.0-snapshot.20220413.9724.0.2dc1085b`, `2.2.0-snapshot.20220414.9733.0.957db9b0`, `2.2.0-snapshot.20220415.9735.0.6b3e7969`, `2.2.0-snapshot.20220418.9736.0.988b6090`, `2.2.0-snapshot.20220420.9744.0.e193f421`, `2.2.0-snapshot.20220420.9758.0.611cce8c`, `2.2.0-snapshot.20220421.9765.0.fc8ec7f2`, `2.2.0-snapshot.20220422.9774.0.b2d9f74b`, `2.2.0-snapshot.20220425.9780.0.f4d60375`, `2.2.0-snapshot.20220426.9797.0.00c944ae`, `2.2.0-snapshot.20220427.9808.0.f0303b69`, `2.2.0-snapshot.20220428.9820.0.615d2e62`, `2.2.0-snapshot.20220429.9826.0.2e6dbefa`, `2.2.0-snapshot.20220501.9828.0.7297fe9d`, `2.2.0-snapshot.20220502.9831.0.58c615a2`, `2.2.0-snapshot.20220503.9846.0.1b9e9905`, `2.2.0-snapshot.20220504.9851.0.4c8e027d`, `2.3.0-snapshot.20220505.9861.0.5d8ebd7a`, `2.3.0-snapshot.20220507.9869.0.2115fbf5`, `2.3.0-snapshot.20220509.9874.0.0798fe15`]
1. `com.daml:ledger-indexer-benchmark`  -> [`1.16.0-snapshot.20210727.7476.0.b5e9d861`, `1.16.0-snapshot.20210802.7499.0.5157ad6d`, `1.16.0-snapshot.20210805.7501.0.48050ad7`, `1.16.0`, `1.17.0-snapshot.20210811.7565.0.f1a55aa4`, `1.17.0-snapshot.20210817.7604.0.0c187853`, `1.17.0-snapshot.20210824.7647.0.640fb683`, `1.17.0-snapshot.20210831.7702.0.f058c2f1`, `1.17.0-snapshot.20210907.7759.0.35a853fd`, `1.17.0-snapshot.20210910.7786.0.976ca400`, `1.17.0-snapshot.20210915.7841.0.b4328b3d`, `1.18.0-snapshot.20210921.7889.0.1b473c2b`, `1.18.0-snapshot.20210921.7889.1.1b473c2b`, `1.18.0-snapshot.20210922.7908.0.ced4a272`, `1.18.0-snapshot.20210928.7948.0.b4d00317`, `1.18.0-snapshot.20211006.8003.0.cfcdc13c`, `1.18.0-snapshot.20211013.8071.0.514e8b50`, `1.18.0-snapshot.20211019.8113.0.8ff347d8`, `1.18.0-snapshot.20211026.8179.0.e474b2d1`, `1.18.0-snapshot.20211102.8257.0.7391a3cd`, `1.18.0-snapshot.20211109.8328.0.92181161`, `1.18.0-snapshot.20211110.8337.0.c5a1f0bb`, `1.18.0-snapshot.20211111.8349.0.d938a44c`, `1.18.0-snapshot.20211117.8399.0.a05a40ae`, `2.0.0-snapshot.20211123.8463.0.bd2a6852`, `2.0.0-snapshot.20211201.8538.0.1d0ff3cc`, `2.0.0-snapshot.20211207.8589.1.85e2fa55`, `2.0.0-snapshot.20211207.8589.2.85e2fa55`, `2.0.0-snapshot.20211207.8589.3.85e2fa55`, `2.0.0-snapshot.20211207.8608.0.c4d82f72`, `2.0.0-snapshot.20211209.8636.0.0a17087b`, `2.0.0-snapshot.20211209.8636.1.0a17087b`, `2.0.0-snapshot.20211210.8653.0.35beb44c`, `2.0.0-snapshot.20211220.8735.0.606a8ef0`, `2.0.0-snapshot.20211220.8736.0.040f1a93`, `2.0.0-snapshot.20220104.8767.0.d3101e01`, `2.0.0-snapshot.20220105.8777.0.cb15ab5a`, `2.0.0-snapshot.20220110.8812.0.3a08380b`, `2.0.0-snapshot.20220111.8828.0.7ec55d7f`, `2.0.0-snapshot.20220117.8894.0.502b21f8`, `2.0.0-snapshot.20220117.8897.0.36a93ef0`, `2.0.0-snapshot.20220118.8919.0.d0813e61`, `2.0.0-snapshot.20220119.8939.0.ebd3827c`, `2.0.0-snapshot.20220124.8981.0.a150737d`, `2.0.0-snapshot.20220125.9008.0.ed33c0d5`, `2.0.0-snapshot.20220126.9017.0.159f3847`, `2.0.0-snapshot.20220126.9029.0.42cf70b1`, `2.0.0-snapshot.20220127.9042.0.4038d0a7`, `2.0.0-snapshot.20220127.9049.0.345e2679`, `2.0.0-snapshot.20220201.9108.0.aa2494f1`, `2.0.0-snapshot.20220204.9165.0.225c58f4`, `2.0.0-snapshot.20220207.9186.0.f63165aa`, `2.0.0-snapshot.20220207.9190.0.89c9c5d3`, `2.0.0-snapshot.20220208.9197.0.8182602f`, `2.0.0-snapshot.20220208.9207.0.7b70711c`, `2.0.0-snapshot.20220209.9212.0.b7fc9f57`, `2.0.0-snapshot.20220210.9222.0.f2797795`, `2.0.0-snapshot.20220210.9244.0.6a91fdfe`, `2.0.0-snapshot.20220211.9260.0.3dccabf6`, `2.0.0-snapshot.20220212.9261.0.3ebd9d7b`, `2.0.0-snapshot.20220214.9284.0.dc5f2033`, `2.0.0-snapshot.20220215.9307.0.55fef9cf`, `2.0.0-snapshot.20220216.9321.0.eb45a4ce`, `2.0.0-snapshot.20220217.9331.0.a9fd5497`, `2.0.0-snapshot.20220221.9339.0.6d268fdc`, `2.0.0-snapshot.20220222.9362.0.1af680cd`, `2.1.0-snapshot.20220223.9363.0.d96b7bdc`, `2.1.0-snapshot.20220223.9379.0.2f86d8d3`, `2.1.0-snapshot.20220224.9392.0.786906f2`, `2.1.0-snapshot.20220225.9408.0.1783146c`, `2.1.0-snapshot.20220228.9413.0.ef8a0e66`, `2.1.0-snapshot.20220301.9419.0.091a5ac7`, `2.1.0-snapshot.20220302.9431.0.96029b7c`, `2.1.0-snapshot.20220303.9441.0.e6db3271`, `2.1.0-snapshot.20220304.9449.0.1f1e5051`, `2.1.0-snapshot.20220307.9459.0.878754e9`, `2.1.0-snapshot.20220308.9472.0.1f24348e`, `2.1.0-snapshot.20220309.9493.0.9a27edd6`, `2.1.0-snapshot.20220310.9512.0.e1030365`, `2.1.0-snapshot.20220311.9514.0.ab6e085f`, `2.1.0-snapshot.20220314.9530.0.2056f0a5`, `2.1.0-snapshot.20220315.9543.0.0b5ad7a7`, `2.1.0-snapshot.20220316.9555.0.f1949b44`, `2.1.0-snapshot.20220317.9559.0.1118a7fb`, `2.1.0-snapshot.20220318.9568.0.d37a63f5`, `2.1.0-snapshot.20220321.9580.0.49e950dc`, `2.1.0-snapshot.20220322.9591.0.d10f6785`, `2.1.0-snapshot.20220323.9607.0.a88079e4`, `2.1.0-snapshot.20220324.9615.0.467b8fbb`, `2.1.0-snapshot.20220325.9626.0.4a483381`, `2.1.0-snapshot.20220328.9630.0.66c37bad`, `2.1.0-snapshot.20220329.9638.0.f24a39d2`, `2.1.0-snapshot.20220330.9647.0.7000875e`, `2.1.0-snapshot.20220331.9659.0.4bf0de89`, `2.1.0-snapshot.20220404.9660.0.4b71431b`, `2.1.0-snapshot.20220405.9667.0.17bca6b1`, `2.1.0-snapshot.20220406.9678.0.ef3c5d4e`, `2.1.0-snapshot.20220407.9685.0.7ed507cf`, `2.1.0-snapshot.20220409.9691.0.7eccdfab`, `2.1.0-snapshot.20220411.9707.0.f6fed6ea`, `2.2.0-snapshot.20220412.9721.0.b7c4bdab`, `2.2.0-snapshot.20220413.9724.0.2dc1085b`, `2.2.0-snapshot.20220414.9733.0.957db9b0`, `2.2.0-snapshot.20220415.9735.0.6b3e7969`, `2.2.0-snapshot.20220418.9736.0.988b6090`, `2.2.0-snapshot.20220420.9744.0.e193f421`, `2.2.0-snapshot.20220420.9758.0.611cce8c`, `2.2.0-snapshot.20220421.9765.0.fc8ec7f2`, `2.2.0-snapshot.20220422.9774.0.b2d9f74b`, `2.2.0-snapshot.20220425.9780.0.f4d60375`, `2.2.0-snapshot.20220426.9797.0.00c944ae`, `2.2.0-snapshot.20220427.9808.0.f0303b69`, `2.2.0-snapshot.20220428.9820.0.615d2e62`, `2.2.0-snapshot.20220429.9826.0.2e6dbefa`, `2.2.0-snapshot.20220501.9828.0.7297fe9d`, `2.2.0-snapshot.20220502.9831.0.58c615a2`, `2.2.0-snapshot.20220503.9846.0.1b9e9905`, `2.2.0-snapshot.20220504.9851.0.4c8e027d`, `2.3.0-snapshot.20220505.9861.0.5d8ebd7a`, `2.3.0-snapshot.20220507.9869.0.2115fbf5`, `2.3.0-snapshot.20220509.9874.0.0798fe15`]
1. `com.daml:sandbox-on-x-app-jar`  -> [`2.0.0-snapshot.20220117.8894.0.502b21f8`, `2.0.0-snapshot.20220117.8897.0.36a93ef0`, `2.0.0-snapshot.20220118.8919.0.d0813e61`, `2.0.0-snapshot.20220119.8939.0.ebd3827c`, `2.0.0-snapshot.20220207.9190.0.89c9c5d3`, `2.0.0-snapshot.20220208.9197.0.8182602f`, `2.0.0-snapshot.20220208.9207.0.7b70711c`, `2.0.0-snapshot.20220209.9212.0.b7fc9f57`, `2.0.0-snapshot.20220210.9222.0.f2797795`, `2.0.0-snapshot.20220210.9244.0.6a91fdfe`, `2.0.0-snapshot.20220211.9260.0.3dccabf6`, `2.0.0-snapshot.20220212.9261.0.3ebd9d7b`, `2.0.0-snapshot.20220214.9284.0.dc5f2033`, `2.0.0-snapshot.20220215.9307.0.55fef9cf`, `2.0.0-snapshot.20220216.9321.0.eb45a4ce`, `2.0.0-snapshot.20220217.9331.0.a9fd5497`, `2.0.0-snapshot.20220221.9339.0.6d268fdc`, `2.0.0-snapshot.20220222.9362.0.1af680cd`, `2.1.0-snapshot.20220223.9363.0.d96b7bdc`, `2.1.0-snapshot.20220223.9379.0.2f86d8d3`, `2.1.0-snapshot.20220224.9392.0.786906f2`, `2.1.0-snapshot.20220225.9408.0.1783146c`, `2.1.0-snapshot.20220228.9413.0.ef8a0e66`, `2.1.0-snapshot.20220301.9419.0.091a5ac7`, `2.1.0-snapshot.20220302.9431.0.96029b7c`, `2.1.0-snapshot.20220303.9441.0.e6db3271`, `2.1.0-snapshot.20220304.9449.0.1f1e5051`, `2.1.0-snapshot.20220307.9459.0.878754e9`, `2.1.0-snapshot.20220308.9472.0.1f24348e`, `2.1.0-snapshot.20220309.9493.0.9a27edd6`, `2.1.0-snapshot.20220310.9512.0.e1030365`, `2.1.0-snapshot.20220311.9514.0.ab6e085f`, `2.1.0-snapshot.20220314.9530.0.2056f0a5`, `2.1.0-snapshot.20220315.9543.0.0b5ad7a7`, `2.1.0-snapshot.20220316.9555.0.f1949b44`, `2.1.0-snapshot.20220317.9559.0.1118a7fb`, `2.1.0-snapshot.20220318.9568.0.d37a63f5`, `2.1.0-snapshot.20220321.9580.0.49e950dc`, `2.1.0-snapshot.20220322.9591.0.d10f6785`, `2.1.0-snapshot.20220323.9607.0.a88079e4`, `2.1.0-snapshot.20220324.9615.0.467b8fbb`, `2.1.0-snapshot.20220325.9626.0.4a483381`, `2.1.0-snapshot.20220328.9630.0.66c37bad`, `2.1.0-snapshot.20220329.9638.0.f24a39d2`, `2.1.0-snapshot.20220330.9647.0.7000875e`, `2.1.0-snapshot.20220331.9659.0.4bf0de89`, `2.1.0-snapshot.20220404.9660.0.4b71431b`, `2.1.0-snapshot.20220405.9667.0.17bca6b1`, `2.1.0-snapshot.20220406.9678.0.ef3c5d4e`, `2.1.0-snapshot.20220407.9685.0.7ed507cf`, `2.1.0-snapshot.20220409.9691.0.7eccdfab`, `2.1.0-snapshot.20220411.9707.0.f6fed6ea`, `2.2.0-snapshot.20220412.9721.0.b7c4bdab`, `2.2.0-snapshot.20220413.9724.0.2dc1085b`, `2.2.0-snapshot.20220414.9733.0.957db9b0`, `2.2.0-snapshot.20220415.9735.0.6b3e7969`, `2.2.0-snapshot.20220418.9736.0.988b6090`, `2.2.0-snapshot.20220420.9744.0.e193f421`, `2.2.0-snapshot.20220420.9758.0.611cce8c`, `2.2.0-snapshot.20220421.9765.0.fc8ec7f2`, `2.2.0-snapshot.20220422.9774.0.b2d9f74b`, `2.2.0-snapshot.20220425.9780.0.f4d60375`, `2.2.0-snapshot.20220426.9797.0.00c944ae`, `2.2.0-snapshot.20220427.9808.0.f0303b69`, `2.2.0-snapshot.20220428.9820.0.615d2e62`, `2.2.0-snapshot.20220429.9826.0.2e6dbefa`, `2.2.0-snapshot.20220501.9828.0.7297fe9d`, `2.2.0-snapshot.20220502.9831.0.58c615a2`, `2.2.0-snapshot.20220503.9846.0.1b9e9905`, `2.2.0-snapshot.20220504.9851.0.4c8e027d`, `2.3.0-snapshot.20220505.9861.0.5d8ebd7a`, `2.3.0-snapshot.20220507.9869.0.2115fbf5`, `2.3.0-snapshot.20220509.9874.0.0798fe15`]
1. `com.databricks:databricks-jdbc`  -> [`2.6.25-alpha-1`, `2.6.25-alpha-2`, `2.6.25`]
1. `com.excelsecu.iot:iot-sdk-java`  -> [`1.0.4`]
1. `com.fasterxml.jackson.core:jackson-core` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `com.free-now.sauron.plugins:elasticsearch-output`  -> [`0.0.18`, `0.0.19`, `0.0.20`, `0.0.21`, `0.0.22`, `0.0.23`, `0.0.24`, `0.0.26`]
1. `com.free-now.sauron.plugins:protocw-checker`  -> [`0.0.7`, `0.0.8`, `0.0.9`]
1. `com.github.cukedoctor:cukedoctor-main`  -> [`3.1`, `3.2`, `3.3`, `3.4`, `3.5`, `3.5.1`, `3.5.2`, `3.6.0`, `3.7.0`]
1. `com.github.greaterplus:sse-ble-signal`  -> [`1.0`]
1. `com.google.appengine:runtime-impl`  -> [`2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.4`]
1. `com.heroku.sdk:heroku-deploy-complete`  -> [`2.0.14`, `2.0.15`, `2.0.16`]
1. `com.heroku.sdk:heroku-deploy-standalone`  -> [`3.0.1`, `3.0.2`, `3.0.3`, `3.0.4`]
1. `com.hortonworks.registries:schema-registry-core`  -> [`0.9.0`]
1. `com.hortonworks.registries:storage-tool`  -> [`0.9.0`]
1. `com.huaweicloud.sdk:huaweicloud-sdk-bundle`  -> [`3.0.84`, `3.0.85`, `3.0.86`, `3.0.87`]
1. `com.jwebmp.jackson.core:jackson-core`  -> [`0.63.0.54`, `0.63.0.60`, `0.63.0.61`, `0.65.0.1`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]
1. `com.jwebmp.jpms.jackson.core:jackson-core`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre11.jackson.core:jackson-core`  -> [`0.63.0.14`, `0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.katalon:recurly-java-library`  -> [`0.109.3`]
1. `com.microsoft.azure:azure-schemaregistry-kafka-avro`  -> [`1.0.0-beta.5`, `1.0.0-beta.6`]
1. `com.microsoft.azure:spark-cdm-connector`  -> [`0.10`, `0.12`, `0.13`, `0.14`, `0.15`, `0.16`, `0.17`, `0.18.1`, `0.19.0`, `0.19.1`]
1. `com.okta.authn.sdk:okta-authn-sdk-examples-shiro`  -> [`2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.4`, `2.0.5`, `2.0.6`, `2.0.7`]
1. `com.protocol180:protocol-aggregator-workflows`  -> [`0.1.4`]
1. `com.quicko:api-client`  -> [`3.0.0-BUILD-RELEASE`, `3.0.1-BUILD-RELEASE`, `3.0.2-BUILD-RELEASE`, `3.0.3-BUILD-RELEASE`, `3.1.0-BUILD-RELEASE`, `3.1.1-BUILD-RELEASE`, `3.1.2-BUILD-RELEASE`, `3.1.3-BUILD-RELEASE`, `3.2.0-BUILD`, `3.2.0-BUILD-RELEASE`]
1. `com.redhat.red.offliner:offliner`  -> [`2.0`]
1. `com.rws.lt.lc.public-api:lc-public-api-sdk`  -> [`1.0.0-beta`, `1.0.1-beta`, `1.0.2-beta`]
1. `com.sap.cloud.sdk.datamodel:odata-generator-cli`  -> [`3.56.0`, `3.57.0`, `3.58.0`, `3.59.0`, `3.60.0`, `3.61.0`, `3.62.0`, `3.63.0`, `3.64.0`, `3.65.0`, `3.66.0`, `3.67.0`]
1. `com.sap.cloud.sdk.datamodel:odata-v4-generator-cli`  -> [`3.56.0`, `3.57.0`, `3.58.0`, `3.59.0`, `3.60.0`, `3.61.0`, `3.62.0`, `3.63.0`, `3.64.0`, `3.65.0`, `3.66.0`, `3.67.0`]
1. `com.snowflake:snowflake-kafka-connector`  -> [`1.2.4`, `1.3.0`, `1.3.1`, `1.4.0`, `1.4.1`, `1.4.2`, `1.4.3`, `1.4.4`, `1.5.0`, `1.5.1`, `1.5.2`, `1.5.3`, `1.5.4`, `1.5.5`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.7.0`, `1.7.1`, `1.7.2`]
1. `com.sonatype.nexus:nexus-platform-api`  -> [`3.48.2-01`, `3.48.3-01`, `3.48.4-01`, `3.48.5-01`, `3.48.6-01`, `3.48.7-01`, `3.48.8-01`]
1. `com.twilio:kudu-sql-cli`  -> [`1.0.57`]
1. `com.xenoamess.metasploit.java-external-module:core`  -> [`0.1.0`]
1. `com.xenoamess.metasploit.java-external-module:jar_demo`  -> [`0.1.0`]
1. `com.xenoamess.metasploit.java-external-module:loader`  -> [`0.1.0`]
1. `com.xenoamess.metasploit.java-external-module:single_java_file_demo`  -> [`0.1.0`]
1. `de.charite.compbio:jannovar-cli`  -> [`0.33`, `0.34`, `0.35`, `0.36`, `0.37`, `0.38`, `0.39`]
1. `de.m3y.libmobi:libmobi-standalone`  -> [`1.0.1`]
1. `de.uni-muenster:music2rdf`  -> [`1.3.8`]
1. `io.github.hkarthik7:azd`  -> [`3.0.3`]
1. `io.github.jaredpetersen:kafka-connect-arangodb`  -> [`1.0.6`, `1.0.7`]
1. `io.github.marquezproject:marquez-spark`  -> [`0.12.0`, `0.12.1`, `0.12.2`, `0.14.0`, `0.14.1`, `0.14.2`, `0.15.0`, `0.15.1`, `0.15.2-rc.2`, `0.15.2`, `0.16.0-rc.1`, `0.16.0`, `0.16.1-rc.1`, `0.16.1`, `0.17.0`]
1. `io.github.sinri:Keel`  -> [`1.0`, `1.1`, `1.3`, `1.4`, `1.5`, `1.6`, `1.8`, `1.9`, `1.10`, `1.11`, `1.12`, `1.13`, `2.0`]
1. `io.honeybadger:honeybadger-java-shaded`  -> [`2.1.0`]
1. `io.honeycomb.libhoney:libhoney-java`  -> [`1.4.0`, `1.4.1`, `1.5.0`]
1. `io.kestra.plugin:plugin-aws`  -> [`0.4.0`, `0.4.1`, `0.4.2`]
1. `io.kestra.plugin:plugin-gcp`  -> [`0.2.0`, `0.2.1`, `0.2.2`, `0.3.0`, `0.3.1`, `0.3.2`]
1. `io.kestra.storage:storage-gcs`  -> [`0.2.0`, `0.3.0`, `0.3.1`, `0.4.0`]
1. `io.openk9:io.openk9.third.party`  -> [`0.0.1-SNAPSHOTS`]
1. `io.openlineage:openlineage-spark`  -> [`0.1.0`, `0.2.0`, `0.2.1`, `0.2.2`, `0.2.3`]
1. `io.streamnative:pulsar-functions-runtime-all`  -> [`2.9.0-rc-202107212205`, `2.9.0-rc-202107222205`, `2.9.0-rc-202107231254`, `2.9.0.0-rc-202107231935`, `2.9.0-rc-202107242205`, `2.9.0-rc-202107262205`, `2.9.0-rc-202107272205`, `2.9.0-rc-202107282205`, `2.9.0-rc-202107292205`, `2.9.0-rc-202107312205`, `2.9.0-rc-202108011016`, `2.9.0-rc-202108011108`, `2.9.0-rc-202108012205`, `2.9.0-rc-202108022205`, `2.9.0-rc-202108032205`, `2.9.0-rc-202108042210`, `2.9.0-rc-202108062205`, `2.9.0-rc-202108071018`, `2.9.0-rc-202108072205`, `2.9.0-rc-202108081041`, `2.9.0-rc-202108082205`, `2.9.0-rc-202108100946`, `2.9.0-rc-202108102032`, `2.9.0-rc-202108110849`, `2.9.0-rc-202108111625`, `2.9.0-rc-202108130847`, `2.9.0-rc-202108131143`, `2.9.0-rc-202108131436`, `2.9.0-rc-202108132205`, `2.9.0-rc-202108152205`, `2.9.0-rc-202108172205`, `2.9.0-rc-202108182205`, `2.9.0-rc-202108202021`, `2.9.0-rc-202108202205`, `2.9.0-rc-202108232206`, `2.9.0-rc-202108242206`, `2.9.0-rc-202108262205`, `2.9.0-rc-202108272205`, `2.9.0-rc-202108292205`, `2.9.0-rc-202108302210`, `2.9.0-rc-202109012205`, `2.9.0-rc-202109022206`, `2.9.0-rc-202109042205`, `2.9.0-rc-202109052205`, `2.9.0-rc-202109072205`, `2.9.0-rc-202109112205`, `2.9.0-rc-202109122205`, `2.9.0-rc-202109132205`, `2.9.0-rc-202109142205`, `2.9.0-rc-202109152205`, `2.9.0-rc-202109162205`, `2.9.0-rc-202109172205`, `2.9.0-rc-202109192205`, `2.9.0-rc-202109212205`, `2.9.0-rc-202109241100`, `2.9.0-rc-202109242205`, `2.9.0-rc-202109252205`, `2.9.0-rc-202109262205`, `2.9.0-rc-202109291558`, `2.9.0-rc-202109292205`, `2.9.0-rc-202109301601`, `2.9.0-rc-202109302205`, `2.9.0-rc-202110012205`, `2.9.0-rc-202110022205`, `2.9.0-rc-202110032206`, `2.9.0-rc-202110042205`, `2.9.0-rc-20211005153744`, `2.9.0-rc-20211006034704`, `2.9.0-rc-20211006043034`, `2.9.0-rc-20211006044313`, `2.9.0-rc-20211012061032`, `2.10.0-rc-202110192205`, `2.10.0-rc-202110202205`, `2.10.0-rc-202110212205`, `2.10.0-rc-202110222206`, `2.10.0-rc-202110232205`, `2.10.0-rc-202110242205`, `2.10.0-rc-202110252206`, `2.10.0-rc-202110262205`, `2.10.0-rc-202110272205`, `2.10.0-rc-202110282205`, `2.10.0-rc-202110292205`, `2.10.0-rc-202110302205`, `2.10.0-rc-202110312205`, `2.10.0-rc-202111012205`, `2.10.0-rc-202111022205`, `2.10.0-rc-202111042205`, `2.10.0-rc-202111052205`, `2.10.0-rc-202111062205`, `2.10.0-rc-202111072205`, `2.10.0-rc-202111082207`, `2.10.0-rc-202111092206`, `2.10.0-rc-202111102205`, `2.10.0-rc-202111112205`, `2.10.0-rc-202111122205`, `2.10.0-rc-202111132206`, `2.10.0-rc-202111142205`, `2.10.0-rc-202111152210`, `2.10.0-rc-202111162205`, `2.10.0-rc-202111172205`, `2.10.0-rc-202111182205`, `2.10.0-rc-202111192205`, `2.10.0-rc-202111202206`, `2.10.0-rc-20211121082026`, `2.10.0-rc-2021121511380612`, `2.11.0-rc-202204132205`, `2.11.0-rc-202204142207`, `2.11.0-rc-202204152205`, `2.11.0-rc-202204162205`, `2.11.0-rc-202204172205`, `2.11.0-rc-202204182206`, `2.11.0-rc-202204192205`, `2.11.0-rc-202204202205`, `2.11.0-rc-202204212206`, `2.11.0-rc-202204222205`, `2.11.0-rc-202204232205`, `2.11.0-rc-202204242205`, `2.11.0-rc-202204252206`, `2.11.0-rc-202204262206`, `2.11.0-rc-202204272205`, `2.11.0-rc-202204282207`, `2.11.0-rc-202204292205`, `2.11.0-rc-202204302206`, `2.11.0-rc-202205012205`, `2.11.0-rc-202205022209`, `2.11.0-rc-202205032206`, `2.11.0-rc-202205042205`, `2.11.0-rc-202205052207`, `2.11.0-rc-202205062205`, `2.11.0-rc-202205072206`, `2.11.0-rc-202205082205`]
1. `io.trino:trino-jdbc`  -> [`367`, `368`, `369`, `370`, `371`, `372`, `373`, `374`, `375`, `376`, `377`, `378`, `379`, `380`]
1. `no.nav.arbeidsgiver:altinn-rettigheter-proxy-klient`  -> [`0.0.6`, `0.0.7`, `0.1.0`, `0.1.1`, `0.1.3`, `1.0.0`, `1.1.2`, `2.0.0`, `2.0.1`]
1. `org.apache.beam:beam-runners-spark-3-job-server`  -> [`2.29.0`]
1. `org.apache.beam:beam-runners-spark-job-server`  -> [`2.29.0`]
1. `org.apache.beam:beam-sdks-java-expansion-service-app`  -> [`2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.beam:beam-sdks-java-extensions-schemaio-expansion-service`  -> [`2.34.0`, `2.35.0`, `2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.beam:beam-sdks-java-extensions-sql-jdbc`  -> [`2.29.0`, `2.30.0`, `2.31.0`, `2.32.0`, `2.33.0`, `2.34.0`, `2.35.0`]
1. `org.apache.beam:beam-sdks-java-io-expansion-service`  -> [`2.29.0`, `2.30.0`, `2.31.0`, `2.32.0`, `2.33.0`, `2.34.0`, `2.35.0`]
1. `org.apache.beam:beam-sdks-java-io-google-cloud-platform-expansion-service`  -> [`2.34.0`, `2.35.0`, `2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.beam:beam-sdks-java-io-snowflake-expansion-service`  -> [`2.34.0`, `2.35.0`, `2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.distributedlog:distributedlog-core-shaded`  -> [`4.15.0`]
1. `org.apache.flink:flink-python_2.12`  -> [`1.15.0`]
1. `org.apache.flink:flink-sql-avro`  -> [`1.15.0`]
1. `org.apache.flink:flink-sql-connector-kinesis`  -> [`1.15.0`]
1. `org.apache.flink:flink-table-store-dist`  -> [`0.1.0`]
1. `org.apache.flink:flink-table-store-format`  -> [`0.1.0`]
1. `org.apache.jena:jena-fuseki-fulljar`  -> [`4.3.0`, `4.3.1`, `4.3.2`, `4.4.0`]
1. `org.apache.jena:jena-fuseki-geosparql`  -> [`4.3.0`, `4.3.1`, `4.3.2`, `4.4.0`]
1. `org.apache.jena:jena-fuseki-server`  -> [`4.3.0`, `4.3.1`, `4.3.2`, `4.4.0`]
1. `org.apache.jena:jena-jdbc-driver-bundle`  -> [`4.3.0`, `4.3.1`, `4.3.2`, `4.4.0`]
1. `org.apache.pulsar:pulsar-functions-runtime-all`  -> [`2.8.1`, `2.9.0`, `2.9.1`, `2.9.2`, `2.10.0`]
1. `org.apache.tika:tika-eval-app`  -> [`2.2.0`, `2.2.1`, `2.3.0`, `2.4.0`]
1. `org.apache.tika:tika-server-client`  -> [`2.2.0`, `2.2.1`, `2.3.0`, `2.4.0`]
1. `org.apache.tika:tika-server-eval`  -> [`2.4.0`]
1. `org.camunda.spin:camunda-spin-dataformat-all`  -> [`1.13.1`, `1.14.0`, `1.14.1`, `1.14.2`, `1.15.0`]
1. `org.commonjava.maven.ext:pom-manipulation-cli`  -> [`4.0`, `4.1`, `4.2`, `4.3`, `4.4`, `4.5`, `4.6`, `4.7`]
1. `org.fcrepo:fcrepo-upgrade-utils`  -> [`6.1.0`]
1. `org.n52.arctic-sea:iceland-statistics-kibana`  -> [`7.2.0`, `7.3.0`, `7.3.1`, `7.4.0`, `7.4.1`, `7.5.0`, `7.5.1`, `7.6.0`, `7.6.1`, `7.6.2`, `8.0.0`, `8.0.1`, `8.0.2`, `8.0.3`, `8.1.0`, `8.2.0`, `8.2.1`, `9.0.0`, `9.0.1`, `9.1.0`, `9.1.1`, `9.2.0`, `9.2.1`, `9.3.0`, `9.3.1`, `9.4.0`, `9.5.0`, `9.5.1`, `9.5.2`, `9.5.3`]
1. `org.openidentityplatform.commons.json-crypto:cli`  -> [`2.0.7`, `2.0.8`, `2.0.9`, `2.0.10`, `2.0.11`, `2.0.12`, `2.0.13`, `2.0.14`]
1. `run.facet.agent.java:facet-agent`  -> [`0.0.1`, `0.0.2`, `0.0.3`, `0.0.4`, `0.0.5`, `0.0.6`, `0.0.8`, `0.0.9`, `0.0.10`, `0.0.11`, `0.0.12`, `0.0.13`]
1. `software.amazon.appflow:custom-connector-example`  -> [`1.0`, `1.0.1`, `1.0.2`, `1.0.3`]
1. `software.amazon.appflow:custom-connector-tests`  -> [`1.0`, `1.0.1`, `1.0.2`, `1.0.3`]
1. `software.amazon.awssdk:bundle`  -> [`2.17.108`, `2.17.109`, `2.17.110`, `2.17.111`, `2.17.112`, `2.17.113`, `2.17.114`, `2.17.115`, `2.17.116`, `2.17.117`, `2.17.118`, `2.17.119`, `2.17.120`, `2.17.121`, `2.17.122`, `2.17.123`, `2.17.124`, `2.17.125`, `2.17.126`, `2.17.127`, `2.17.128`, `2.17.129`, `2.17.130`, `2.17.131`, `2.17.132`, `2.17.133`, `2.17.134`, `2.17.135`, `2.17.136`, `2.17.137`, `2.17.138`, `2.17.139`, `2.17.140`, `2.17.141`, `2.17.142`, `2.17.143`, `2.17.144`, `2.17.145`, `2.17.146`, `2.17.147`, `2.17.148`, `2.17.149`, `2.17.150`, `2.17.151`, `2.17.152`, `2.17.153`, `2.17.154`, `2.17.155`, `2.17.156`, `2.17.157`, `2.17.158`, `2.17.159`, `2.17.160`, `2.17.161`, `2.17.162`, `2.17.163`, `2.17.164`, `2.17.165`, `2.17.166`, `2.17.167`, `2.17.168`, `2.17.169`, `2.17.170`, `2.17.171`, `2.17.172`, `2.17.173`, `2.17.174`, `2.17.175`, `2.17.176`, `2.17.177`, `2.17.178`, `2.17.179`, `2.17.180`, `2.17.181`, `2.17.182`, `2.17.183`, `2.17.184`, `2.17.185`, `2.17.186`, `2.17.187`, `2.17.188`]
1. `software.amazon.awssdk:third-party-jackson-core`  -> [`2.17.108`, `2.17.109`, `2.17.110`, `2.17.111`, `2.17.112`, `2.17.113`, `2.17.114`, `2.17.115`, `2.17.116`, `2.17.117`, `2.17.118`, `2.17.119`, `2.17.120`, `2.17.121`, `2.17.122`, `2.17.123`, `2.17.124`, `2.17.125`, `2.17.126`, `2.17.127`, `2.17.128`, `2.17.129`, `2.17.130`, `2.17.131`, `2.17.132`, `2.17.133`, `2.17.134`, `2.17.135`, `2.17.136`, `2.17.137`, `2.17.138`, `2.17.139`, `2.17.140`, `2.17.141`, `2.17.142`, `2.17.143`, `2.17.144`, `2.17.145`, `2.17.146`, `2.17.147`, `2.17.148`, `2.17.149`, `2.17.150`, `2.17.151`, `2.17.152`, `2.17.153`, `2.17.154`, `2.17.155`, `2.17.156`, `2.17.157`, `2.17.158`, `2.17.159`, `2.17.160`, `2.17.161`, `2.17.162`, `2.17.163`, `2.17.164`, `2.17.165`, `2.17.166`, `2.17.167`, `2.17.168`, `2.17.169`, `2.17.170`, `2.17.171`, `2.17.172`, `2.17.173`, `2.17.174`, `2.17.175`, `2.17.176`, `2.17.177`, `2.17.178`, `2.17.179`, `2.17.180`, `2.17.181`, `2.17.182`, `2.17.183`, `2.17.184`, `2.17.185`, `2.17.186`, `2.17.187`, `2.17.188`]
1. `software.amazon.glue:jsonschema-kafkaconnect-converter`  -> [`1.1.9`, `1.1.10`]
1. `software.amazon.glue:schema-registry-kafkaconnect-converter`  -> [`1.1.9`, `1.1.10`]
1. `tech.xigam:grasscutter`  -> [`1.0.3-dev`]
1. `uk.co.gdmrdigital.iiif.image:iiif-tiler`  -> [`0.9.3`, `0.9.4`, `0.9.5`, `0.9.6`, `0.9.7`, `0.9.8`, `0.9.9`, `1.0`]
1. `uk.co.gresearch.siembol:alerting-storm`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`]
1. `uk.co.gresearch.siembol:enriching-storm`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`]
1. `uk.co.gresearch.siembol:parsing-storm`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`]
1. `xyz.ottr.lutra:lutra-cli`  -> [`0.6.12`]
1. `za.co.absa.spline:admin`  -> [`0.5.0`, `0.5.1`, `0.5.2`, `0.5.3`]
1. `za.co.absa.spline:rest-api-doc-generator`  -> [`0.5.0`, `0.5.1`, `0.5.2`, `0.5.3`, `0.5.4`, `0.5.5`]
1. `za.co.absa.utils:rest-api-doc-generator`  -> [`1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`]

## kotlin.stdlib.jdk8

For example, at least 79 artifacts on Maven Central claim to be the module `kotlin.stdlib.jdk8`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires kotlin.stdlib.jdk8;`.

1. `app.cash.sqldelight:gradle-plugin`  -> [`2.0.0-alpha01`, `2.0.0-alpha02`]
1. `ca.aqtech:mctreesearch4j`  -> [`0.0.1`, `0.0.2`, `0.0.3`, `0.0.4-dev`]
1. `ch.zizka.csvcruncher:csv-cruncher`  -> [`1.31.0`, `2.1.0`, `2.2.0`, `2.3.1`, `2.3.6`]
1. `cn.j4ger:firewatch`  -> [`1.0.0`, `1.0.1`, `1.0.2`]
1. `com.anatawa12.mod-patching:gradle-plugin`  -> [`2.0.0`, `2.0.1`, `2.0.3`, `2.1.0`]
1. `com.apollographql.apollo3:apollo-gradle-plugin`  -> [`3.0.0-dev6`]
1. `com.cjbooms:fabrikt`  -> [`1.1.2`, `1.1.3`, `1.1.4`, `1.1.5`, `1.1.6`, `1.1.7`, `1.2.1`, `1.3.0`, `1.4.0`, `2.0.0`, `2.0.1`, `2.1.0`, `2.1.1`, `2.1.2`, `2.1.3`, `2.1.4`, `2.1.5`, `2.1.6`, `2.2.0`, `2.2.1`, `2.3.0`, `3.0.0`, `4.0.0`, `5.0.0`, `5.1.0`]
1. `com.dbvis:mongo-jdbc-standalone`  -> [`1.13`]
1. `com.fastasyncworldedit:FastAsyncWorldEdit-Libs-Ap`  -> [`2.0.0`, `2.0.1`, `2.1.0`, `2.1.1`, `2.1.2`]
1. `com.felipebz.zpa:sonar-zpa-plugin`  -> [`3.0.0`, `3.1.0`, `3.1.1`]
1. `com.felipebz.zpa:zpa-toolkit`  -> [`3.0.0`, `3.1.0`, `3.1.1`]
1. `com.github.bun133:flyframe`  -> [`1.0`, `1.0.1`, `1.0.2`]
1. `com.github.bun133:flylib-module`  -> [`1.0.0`]
1. `com.github.flank:flank`  -> [`21.05.0`, `21.06.0`, `21.06.1`, `21.07.0`, `21.07.1`, `21.07.2`, `21.08.0`, `21.08.1`, `21.09.0`, `21.11.0`, `22.03.0`, `22.04.0`]
1. `com.github.hopshackle:NTBEA`  -> [`0.1`, `0.2`, `0.2.1`, `0.3.0`]
1. `com.github.patrick-mc:twipe`  -> [`1.0.3`]
1. `com.github.shynixn.packet:packet-api`  -> [`1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`]
1. `com.ibm.cloud:is-examples`  -> [`0.4.3`, `0.5.0`]
1. `com.impossibl.pgjdbc-ng.tools:udt-gen-all`  -> [`0.8.9`]
1. `com.incognia:incognia-api-client`  -> [`1.0.0`]
1. `com.intuit.hooks:compiler-plugin`  -> [`0.7.0`, `0.8.1`, `0.8.2`, `0.9.0`, `0.9.1`]
1. `com.intuit.hooks:maven-plugin`  -> [`0.10.0`, `0.10.1`, `0.10.2`, `0.11.0`, `0.11.1`]
1. `com.ivianuu.injekt:injekt-gradle-plugin-shaded`  -> [`0.0.1-dev649`, `0.0.1-dev654`, `0.0.1-dev655`, `0.0.1-dev656`, `0.0.1-dev658`, `0.0.1-dev659`, `0.0.1-dev661`, `0.0.1-dev663`, `0.0.1-dev664`, `0.0.1-dev665`, `0.0.1-dev666`, `0.0.1-dev667`, `0.0.1-dev668`, `0.0.1-dev670`, `0.0.1-dev672`, `0.0.1-dev673`, `0.0.1-dev674`]
1. `com.jakewharton.mosaic:compose-compiler`  -> [`0.1.0`]
1. `com.joseph-dwyer.katana:katana-compiler-plugin`  -> [`0.0.6`]
1. `com.mparticle:smartype-generator`  -> [`1.2.0`, `1.2.1`, `1.2.2`, `1.2.3`, `1.2.4`, `1.3`]
1. `com.notkamui.libs:keval`  -> [`0.7.1`]
1. `com.orange.ccmd:hurl`  -> [`1.0.39`, `1.0.40`, `1.0.41`, `1.0.42`]
1. `com.orange.ccmd:hurlfmt`  -> [`1.0.39`, `1.0.40`, `1.0.41`, `1.0.42`]
1. `com.protocol180:protocol-aggregator-contracts`  -> [`0.1.1`, `0.1.2`, `0.1.3`, `0.1.4`, `0.1.5`, `0.1.6`]
1. `com.squareup.sqldelight:gradle-plugin`  -> [`1.5.0`, `1.5.1`, `1.5.2`, `1.5.3`]
1. `com.truelayer:truelayer-java`  -> [`0.4.10`, `0.4.11`]
1. `com.yandex.android:appmetrica-build-plugin`  -> [`0.3.0`, `0.5.0`]
1. `com.youramaryllis:eventstorming-cli`  -> [`1.0.0`, `1.1.0`]
1. `de.jensklingenberg.cabret:cabret-compiler-plugin-native`  -> [`1.0.2`, `1.0.4-RC6`, `1.0.4-RC7`, `1.0.4`]
1. `de.jensklingenberg.cabret:cabret-compiler-plugin`  -> [`1.0.2`, `1.0.4-RC8`, `1.0.4`]
1. `de.quantummaid.tutorials.basic-tutorial:step4`  -> [`1.0.44`]
1. `de.quantummaid.tutorials.basic-tutorial:step5`  -> [`1.0.44`]
1. `dev.zacsweers.ticktock:ticktock-compiler`  -> [`0.2.0`, `0.2.1`, `1.0.0-2020d`, `1.1.0-2020f`, `1.2.0-2021e`]
1. `io.github.baharmc:bedrock-edition`  -> [`1.0`, `1.1`, `1.2`]
1. `io.github.baharmc:java-edition`  -> [`1.0`, `1.1`, `1.2`]
1. `io.github.baharmc:network-common`  -> [`1.0`, `1.1`, `1.2`]
1. `io.github.franvis.pimpmyandroidxml:pmaxml`  -> [`0.3.3`, `0.3.4`, `0.3.5`, `0.3.6`]
1. `io.github.g0dkar:qrcode-kotlin`  -> [`1.0.2`]
1. `io.github.jbock-java:dapper-compiler`  -> [`2.41.2`]
1. `io.github.portlek:patty`  -> [`1.1`]
1. `io.github.sergeshustoff.dikt:dikt-compiler-plugin-native`  -> [`1.0.0-alpha4`, `1.0.0-alpha5`, `1.0.0-alpha6`, `1.0.0-alpha7`, `1.0.0-alpha8`, `1.0.0-alpha9`, `1.0.1`]
1. `io.github.sergeshustoff.dikt:dikt-compiler-plugin`  -> [`1.0.0-alpha8`, `1.0.0-alpha9`, `1.0.1`]
1. `io.github.shiruka:common`  -> [`1.0`, `1.2`, `1.3`]
1. `io.github.shiruka:conf-common`  -> [`1.1`]
1. `io.github.shiruka:conf-json`  -> [`1.1`]
1. `io.github.shiruka:conf-yaml`  -> [`1.1`]
1. `io.github.shiruka:network`  -> [`1.3`]
1. `io.github.virusbear.trace:trace-ktor-client`  -> [`1.0.4`]
1. `io.github.virusbear.trace:trace-ktor-server`  -> [`1.0.4`]
1. `io.github.xhstormr.text-masker:cli`  -> [`1.0.0`, `1.1.0`]
1. `io.outfoxx.sunday:cli`  -> [`1.1.0-alpha.4`, `1.1.0-alpha.5`, `1.1.0-alpha.6`, `1.1.0-alpha.7`, `1.1.0-alpha.8`, `1.1.0-alpha.9`, `1.1.0-alpha.24`, `1.1.0-alpha.25`]
1. `io.realm.kotlin:plugin-compiler-shaded`  -> [`0.10.0`, `0.10.1`, `0.10.2`, `0.11.0`, `0.11.1`]
1. `io.tatum:tatum-java`  -> [`1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`]
1. `io.teamif:comcigan-lib`  -> [`1.0`]
1. `me.him188:kotlin-dynamic-delegation-compiler-embeddable`  -> [`0.1.0-160.1`, `0.1.1-160.1`, `0.2.0-160.1`, `0.3.0-162.1`, `0.3.0-162.4`]
1. `me.him188:kotlin-jvm-blocking-bridge-compiler-embeddable`  -> [`2.0.0-160.1`, `2.0.0-160.3`, `2.0.0-162.1`]
1. `net.corda.kotlin:kotlin-stdlib-jdk8-osgi`  -> [`1.4.21`]
1. `net.lz1998:pbbot-spring-boot-starter`  -> [`0.0.2`, `0.0.3`]
1. `net.mamoe:kotlin-jvm-blocking-bridge-compiler-embeddable`  -> [`1.10.3-dev-2`, `1.10.4`, `1.10.6`, `1.10.6-1530`, `1.10.6-1530.2`]
1. `org.brightify.hyperdrive:plugin-impl-native`  -> [`0.1.95`, `0.1.97`, `0.1.98`, `0.1.99`, `0.1.100`, `0.1.101`, `0.1.102`, `0.1.103`, `0.1.104`, `0.1.105`, `0.1.106`, `0.1.108`, `0.1.109`, `0.1.110`, `0.1.111`, `0.1.112`, `0.1.113`, `0.1.114`, `0.1.115`, `0.1.116`, `0.1.117`, `0.1.118`, `0.1.119`, `0.1.120`, `0.1.121`, `0.1.122`, `0.1.123`, `0.1.124`, `0.1.125`, `0.1.126`, `0.1.127`, `0.1.128`, `0.1.129`, `0.1.130`, `0.1.131`, `0.1.132`, `0.1.133`, `0.1.134`, `0.1.135`, `0.1.136`, `0.1.138`, `0.1.139`]
1. `org.jetbrains.dokka:dokka-cli`  -> [`1.4.10.2`, `1.4.20-dev-65`, `1.4.30`, `1.4.32`, `1.5.0`, `1.5.30`, `1.5.31`, `1.6.0`, `1.6.10`, `1.6.20`, `1.6.21`]
1. `org.jetbrains.dokka:kotlin-analysis-compiler`  -> [`1.4.10.2`, `1.4.20-dev-65`, `1.4.30`, `1.4.32`, `1.5.0`, `1.5.30`, `1.5.31`, `1.6.0`, `1.6.10`, `1.6.20`, `1.6.21`]
1. `org.jetbrains.dokka:kotlin-analysis-intellij`  -> [`1.4.10.2`, `1.4.20-dev-65`, `1.4.30`, `1.5.0`, `1.5.30`, `1.5.31`, `1.6.0`, `1.6.10`, `1.6.20`, `1.6.21`]
1. `org.jetbrains.kotlin:kotlin-stdlib-jdk8` 🧩 -> [`1.4.0-rc`, `1.4.0`, `1.4.10`, `1.4.20-M1`, `1.4.20-RC`, `1.4.20`, `1.4.21`, `1.4.30-M1`, `1.4.30-RC`, `1.4.30`, `1.4.31`, `1.5.0-M1`, `1.5.0-M2`, `1.5.0-RC`, `1.5.0`, `1.5.10`, `1.5.20-M1`, `1.5.20-RC`, `1.5.20`, `1.5.21`, `1.5.30-M1`, `1.5.30-RC`, `1.5.30`, `1.5.31`, `1.6.0-M1`, `1.6.0-RC`, `1.6.0-RC2`, `1.6.0`, `1.6.10-RC`, `1.6.10`, `1.6.20-M1`, `1.6.20-RC`, `1.6.20-RC2`, `1.6.20`, `1.6.21`, `1.7.0-Beta`]
1. `org.jetbrains.lets-plot:lets-plot-batik`  -> [`2.2.1-rc1`, `2.2.1`, `2.3.0-rc1`, `2.3.0-rc2`, `2.3.0`]
1. `org.jetbrains.lets-plot:lets-plot-common`  -> [`2.2.1-rc1`, `2.2.1`, `2.3.0-rc1`, `2.3.0-rc2`, `2.3.0`]
1. `org.jetbrains.lets-plot:lets-plot-gis`  -> [`2.0.3-rc1`, `2.0.3-rc2`, `2.0.3`, `2.0.4`, `2.0.5-rc1`, `2.1.0-rc1`, `2.1.0`, `2.2.0-rc1`, `2.2.0-rc2`, `2.2.0-rc3`, `2.2.0`, `2.2.1-rc1`, `2.2.1`, `2.3.0-rc1`, `2.3.0-rc2`, `2.3.0`]
1. `org.jetbrains.lets-plot:lets-plot-jfx`  -> [`2.2.1-rc1`, `2.2.1`, `2.3.0-rc1`, `2.3.0-rc2`, `2.3.0`]
1. `org.junit.platform:junit-platform-console-standalone`  -> [`1.8.0-M1`]
1. `org.multi-os-engine:moe-gradle`  -> [`1.8.0`, `1.8.1`, `1.8.2`]
1. `org.sonarsource.kotlin:sonar-kotlin-plugin`  -> [`2.0.0.29`, `2.0.1.110`, `2.1.0.344`, `2.2.0.499`, `2.3.0.609`, `2.4.0.703`, `2.5.0.754`, `2.6.0.862`, `2.7.0.948`, `2.8.0.1093`, `2.9.0.1147`]
1. `ru.pocketbyte.locolaser:core`  -> [`2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`, `2.2.3`]
1. `software.amazon.disco:disco-java-agent-kotlin-plugin`  -> [`0.12.0`]

## org.bouncycastle.provider

For example, at least 75 artifacts on Maven Central claim to be the module `org.bouncycastle.provider`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.bouncycastle.provider;`.

1. `cn.leancloud:filter-service-core`  -> [`1.9`, `1.10`, `1.12`, `1.13`]
1. `com.alipay.sdk:alipay-easysdk`  -> [`1.0.2`, `1.1.0`, `1.1.1`, `1.1.2`, `1.1.3`, `1.2.0`, `1.2.1`, `2.0.0`, `2.0.1`]
1. `com.alipay.sdk:easysdk-kernel`  -> [`1.0.0`, `1.0.2`]
1. `com.danielflower.apprunner:app-runner`  -> [`2.3.1`]
1. `com.github.chrislusf:seaweedfs-hadoop2-client`  -> [`1.2.5`]
1. `com.github.chrislusf:seaweedfs-hadoop3-client`  -> [`1.2.5`]
1. `com.joinesty:nullafi-java-sdk`  -> [`1.0.1`, `1.0.3`]
1. `com.juliozynger.floorplan:floorplan-gradle-plugin`  -> [`0.1`, `0.2`]
1. `com.liferay.portal:release.dxp.api`  -> [`7.3.10-ep5`, `7.3.10-ep6`]
1. `com.liferay:com.liferay.saml.opensaml.integration`  -> [`4.0.25`]
1. `com.liferay:com.liferay.sync.engine`  -> [`3.4.9`]
1. `com.linecorp.armeria:armeria`  -> [`0.92.0`, `0.93.0`, `0.94.0`, `0.95.0`, `0.96.0`, `0.97.0`, `0.98.0`, `0.98.1`, `0.98.2`, `0.98.3`, `0.98.4`, `0.98.5`, `0.98.6`, `0.98.7`, `0.99.0`, `0.99.1`, `0.99.2`, `0.99.3`, `0.99.4`, `0.99.5`, `0.99.6`, `0.99.7`, `0.99.8`]
1. `com.qcloud:cos_api-bundle`  -> [`5.6.29`, `5.6.31`, `5.6.32`, `5.6.33`, `5.6.35`, `5.6.37`, `5.6.38`, `5.6.42`, `5.6.46`, `5.6.47`, `5.6.48`, `5.6.49`, `5.6.50`, `5.6.52`, `5.6.60`, `5.6.62`, `5.6.63`, `5.6.65`, `5.6.68`]
1. `com.shopify.syrup:syrup-gradle`  -> [`0.2.1`]
1. `com.snowflake:snowflake-kafka-connector`  -> [`1.8.0`]
1. `io.castled:container`  -> [`1.0.0`]
1. `io.kestra.plugin:plugin-jdbc-snowflake`  -> [`0.4.1`, `0.4.2`]
1. `io.kestra.storage:storage-minio`  -> [`0.3.0`, `0.3.1`, `0.4.0`]
1. `io.mosip.registration:registration-libs`  -> [`1.1.2-rc2`, `1.1.2-rc3`, `1.1.2`, `1.1.3-rc1`, `1.1.3-rc2`, `1.1.3`, `1.1.4-rc1`, `1.1.4`, `1.1.5-rc1`, `1.1.5-rc2`, `1.1.5`, `1.1.5.1`, `1.1.5.2`, `1.1.5.3`, `1.1.5.4`, `1.2.0-rc1`]
1. `io.pravega:pravega-connectors-flink-1.11_2.12`  -> [`0.10.1`]
1. `io.pravega:pravega-connectors-flink-1.12_2.12`  -> [`0.10.1`]
1. `io.pravega:pravega-connectors-flink-1.13_2.12`  -> [`0.10.1`]
1. `io.pravega:pravega-connectors-hadoop`  -> [`0.10.1`]
1. `io.pravega:pravega-connectors-spark-2.4_2.11`  -> [`0.10.1`]
1. `io.pravega:pravega-connectors-spark-3.0_2.12`  -> [`0.10.1`]
1. `io.pravega:pravega-connectors-spark-3.1_2.12`  -> [`0.10.1`]
1. `net.snowflake:snowflake-hive-metastore-connector`  -> [`0.5.0`, `0.5.1`]
1. `net.snowflake:snowflake-ingest-sdk`  -> [`0.10.5-beta`, `1.0.0-beta`, `1.0.1-beta`, `1.0.2-beta`, `1.0.2-beta.1`]
1. `net.snowflake:snowflake-jdbc`  -> [`3.12.1`, `3.12.2`, `3.12.3`, `3.12.4`, `3.12.5`, `3.12.6`, `3.12.7`, `3.12.8`, `3.12.9`, `3.12.10`, `3.12.11`, `3.12.12`, `3.12.13`, `3.12.14`, `3.12.15`, `3.12.16`, `3.12.17`, `3.13.0`, `3.13.1`, `3.13.2`, `3.13.3`, `3.13.4`, `3.13.5`, `3.13.6`, `3.13.7`, `3.13.8`, `3.13.9`, `3.13.10`, `3.13.11`, `3.13.12`, `3.13.13`, `3.13.14`, `3.13.15`, `3.13.16`, `3.13.17`]
1. `org.apache.beam:beam-sdks-java-io-snowflake-expansion-service`  -> [`2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`, `2.29.0`, `2.30.0`, `2.31.0`, `2.32.0`, `2.33.0`]
1. `org.apache.directory.server:apacheds-service`  -> [`2.0.0.AM26`]
1. `org.apache.inlong:sort-core`  -> [`0.10.0-incubating`, `0.11.0-incubating`]
1. `org.apache.inlong:sort-dist`  -> [`0.10.0-incubating`, `0.11.0-incubating`]
1. `org.apache.pulsar:pulsar-client-2x-shaded`  -> [`2.6.2`]
1. `org.apache.pulsar:pulsar-client`  -> [`2.6.2`]
1. `org.bouncycastle:bcprov-debug-jdk15on`  -> [`1.61`, `1.62`, `1.63`, `1.64`, `1.65`, `1.66`, `1.67`, `1.68`, `1.69`, `1.70`]
1. `org.bouncycastle:bcprov-debug-jdk18on`  -> [`1.71`]
1. `org.bouncycastle:bcprov-ext-debug-jdk15on`  -> [`1.61`, `1.62`, `1.68`, `1.69`, `1.70`]
1. `org.bouncycastle:bcprov-ext-debug-jdk18on`  -> [`1.71`]
1. `org.bouncycastle:bcprov-ext-jdk15on`  -> [`1.61`, `1.62`, `1.63`, `1.64`, `1.65`, `1.66`, `1.67`, `1.68`, `1.69`, `1.70`]
1. `org.bouncycastle:bcprov-jdk15on`  -> [`1.61`, `1.62`, `1.63`, `1.64`, `1.65`, `1.65.01`, `1.66`, `1.67`, `1.68`, `1.69`, `1.70`]
1. `org.bouncycastle:bcprov-jdk18on` 🧩 -> [`1.71`]
1. `org.eclipse.milo:server-examples`  -> [`0.3.0-M1`, `0.3.0`, `0.3.1-M1`, `0.3.1`, `0.3.2-M1`, `0.3.2`, `0.3.3-RC1`, `0.3.3-RC2`, `0.3.3-RC3`, `0.3.3`, `0.3.4`, `0.3.5`, `0.3.6`, `0.3.7`, `0.3.8`, `0.4.0`, `0.4.1`, `0.4.2-M1`, `0.4.2`, `0.4.3`, `0.6.4`, `0.6.5`]
1. `org.keycloak:keycloak-admin-cli`  -> [`10.0.0`, `10.0.1`, `10.0.2`, `11.0.0`, `11.0.1`, `11.0.2`, `11.0.3`, `12.0.0`, `12.0.1`, `12.0.2`, `12.0.3`, `12.0.4`, `13.0.0`, `13.0.1`, `14.0.0`, `15.0.0`, `15.0.1`, `15.0.2`, `16.0.0`, `16.1.0`, `16.1.1`, `17.0.0`, `17.0.1`, `18.0.0`]
1. `org.keycloak:keycloak-client-registration-cli`  -> [`10.0.0`, `10.0.1`, `10.0.2`, `11.0.0`, `11.0.1`, `11.0.2`, `11.0.3`, `12.0.0`, `12.0.1`, `12.0.2`, `12.0.3`, `12.0.4`, `13.0.0`, `13.0.1`, `14.0.0`, `15.0.0`, `15.0.1`, `15.0.2`, `16.0.0`, `16.1.0`, `16.1.1`, `17.0.0`, `17.0.1`, `18.0.0`]
1. `org.netbeans.external:bcprov`  -> [`RELEASE113`]
1. `org.radarbase:radar-auth`  -> [`0.7.0`, `0.7.1`, `0.8.0`, `0.8.1`]
1. `org.spxp:spxp-crypto-tools`  -> [`0.3`]
1. `org.terracotta:angela-agent`  -> [`3.3.0`, `3.3.1`, `3.3.2`, `3.3.3`, `3.3.4`, `3.3.5`, `3.3.6`, `3.3.7`, `3.3.8`, `3.3.9`, `3.3.10`, `3.3.11`, `3.3.12`, `3.3.13`, `3.3.14`, `3.3.15`, `3.3.16`, `3.3.17`, `3.3.18`, `3.3.19`, `3.3.20`]
1. `org.verapdf.apps:pdfbox-apps`  -> [`1.14.6-RC`, `1.14.7-RC`, `1.14.8`, `1.16.1`, `1.18.1`, `1.18.5`, `1.20.1`]
1. `org.wso2.msf4j.example:stockquote-fatjar`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.perftest.echo:wso2msf4j-echo-message`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:circuitbreaker`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:das-tracing-feign-client`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:fileserver`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:formparam`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:helloworld`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:http-monitoring`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:jpa`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:lifecycle`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:metrics`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:regex-pathparam`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:session`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:subresource-sample`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:template`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.sample:zipkin-tracing-feign-client`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.samples:fatjar-interceptor-service`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j.samples:interceptor-common`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j:basicauth-security`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j:msf4j-all`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j:oauth2-security`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j:spring-helloworld`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j:spring-profile`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j:websocket-chatApp-sample`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `world.convex:convex-cli`  -> [`0.7.0-rc4`, `0.7.0`, `0.7.1`, `0.7.2`, `0.7.3`, `0.7.4`, `0.7.5`]

## java.xml.bind

For example, at least 70 artifacts on Maven Central claim to be the module `java.xml.bind`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires java.xml.bind;`.

1. `ai.toloka:toloka-java-sdk`  -> [`0.0.1`, `0.0.2`]
1. `cloud.testload:jmeter.pack-listener`  -> [`1.6`, `1.7`, `1.8`, `1.9`, `1.9.1`, `1.9.2`, `1.9.3`, `2.0`, `2.01`, `2.03`, `2.06`, `2.07`]
1. `com.airbus-cyber-security.graylog:graylog-plugin-glpi`  -> [`1.4.0`]
1. `com.devonfw.cobigen:cli`  -> [`1.0.0`, `1.0.1`, `1.1.0`]
1. `com.elastisys:autoscaler.simulation`  -> [`5.2.2`]
1. `com.eurodyn.qlack.extras:Qlack-Extras-TranslationsConverter`  -> [`1.7.0`, `1.7.1`, `1.7.2`, `1.7.3`, `1.7.4`]
1. `com.exasol:exasol-virtual-schema`  -> [`1.0.0`, `2.0.0`, `3.0.0`, `3.0.1`, `3.0.2`, `3.1.0`, `4.0.0`, `5.0.0`, `5.0.1`, `5.0.2`, `5.0.3`, `5.0.4`, `5.0.5`, `6.0.0`, `6.0.1`, `6.0.2`]
1. `com.expedia.www:haystack-agent`  -> [`0.1.3`, `0.1.4`, `0.1.5`, `0.1.6`]
1. `com.github.agliznetsov.swagger-tools:swagger-tools-cli`  -> [`0.2.0`, `0.2.1`, `0.2.2`, `0.3.0`, `0.3.1`, `0.3.2`, `0.3.3`, `0.3.4`, `0.4.0`, `0.4.1`, `0.5.0`, `0.5.1`, `0.5.2`, `0.5.3`, `0.5.4`, `0.5.5`, `0.5.6`, `0.6.0`]
1. `com.github.albfernandez.richfaces.cdk:cmdln-generator`  -> [`4.6.0.ayg`, `4.6.1.ayg`]
1. `com.github.containersolutions:webserver-sample`  -> [`0.3.6`, `0.3.8`, `0.3.9`]
1. `com.github.elibracha:openapi-diff-commons`  -> [`1.0.2`, `1.0.42`]
1. `com.github.elibracha:openapi-diff-models`  -> [`1.0.1`]
1. `com.github.elibracha:openapi-diff`  -> [`2.2.5`, `2.2.8`, `2.2.10`, `2.2.11`, `2.3.0`, `2.3.1`, `2.3.2`, `2.3.5`, `2.3.6`]
1. `com.github.kopilov.rcallerservice:rcallerservice`  -> [`1.1.0`]
1. `com.github.robozonky.distribution:robozonky-distribution-installer-4.6.0-cr-1`  -> [`4.6.0-cr-1`]
1. `com.github.zuinnote:spark-hadoopoffice-ds_2.11`  -> [`1.6.0`, `1.6.1`, `1.6.2`]
1. `com.github.zuinnote:spark-hadoopoffice-ds_2.12`  -> [`1.6.0`, `1.6.1`, `1.6.2`]
1. `com.growin:flipper_2.12`  -> [`0.3`]
1. `com.guicedee.services:jakarta.xml.bind-api`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.hurence.logisland:logisland-engine-spark_2_3`  -> [`1.4.0`]
1. `com.oradian.util:jaxb-for-scalac_2.12`  -> [`2.3.1`]
1. `com.oradian.util:jaxb-for-scalac_2.13`  -> [`2.3.1`]
1. `com.qcloud.oceanus:flink-s3-fs-hadoop`  -> [`1.10.1`]
1. `com.qcloud.oceanus:flink-s3-fs-presto`  -> [`1.10.1`]
1. `com.squareup.misk:chat`  -> [`0.3.0`]
1. `com.squareup.misk:exemplar`  -> [`0.3.0`]
1. `com.squareup.misk:urlshortener`  -> [`0.3.0`]
1. `de.gematik.ti.epa:VZD-CLient`  -> [`0.5.0`, `1.0.1`]
1. `de.gematik.ti.epa:VZD-Client`  -> [`1.1.0`]
1. `de.gurkenlabs:litiengine`  -> [`0.4.14`, `0.4.15`, `0.4.16`, `0.4.16.1`, `0.4.17`, `0.4.18`, `0.4.19`]
1. `es.us.isa:restest`  -> [`0.1.0`, `1.0.0`, `1.1.3`, `1.2.0`]
1. `eu.rssw.pct:pct`  -> [`216`, `217`, `218`, `219`, `221`]
1. `eu.smesec.library:lib_coach_standard_language`  -> [`0.9.0`]
1. `eu.smesec.platform:cysec_bridge`  -> [`0.2.0`]
1. `io.kestra.plugin:plugin-jdbc-clickhouse`  -> [`0.2.0`, `0.2.1`]
1. `io.kestra.plugin:plugin-notifications`  -> [`0.2.0`, `0.2.1`]
1. `io.mosip.registrationprocessor:registration-processor-common-camel-bridge`  -> [`1.0.6`, `1.0.9`, `1.0.10-rc2`, `1.0.10`, `1.1.1-rc1`]
1. `io.pravega:pravega-test-system`  -> [`0.5.0`, `0.5.1`, `0.6.0`, `0.6.1`, `0.6.2`, `0.7.0`, `0.7.1`, `0.7.2`]
1. `io.swagger.codegen.v3:swagger-codegen-cli`  -> [`3.0.0`, `3.0.1`, `3.0.2`, `3.0.3`, `3.0.4`, `3.0.5`, `3.0.6`, `3.0.7`, `3.0.8`, `3.0.9`, `3.0.10`, `3.0.11`, `3.0.12`, `3.0.13`, `3.0.14`, `3.0.15`, `3.0.16`, `3.0.17`, `3.0.18`, `3.0.19`, `3.0.20`, `3.0.21`, `3.0.22`, `3.0.23`, `3.0.24`, `3.0.25`, `3.0.26`, `3.0.27`, `3.0.28`, `3.0.29`, `3.0.30`, `3.0.31`, `3.0.32`]
1. `jakarta.xml.bind:jakarta.xml.bind-api`  -> [`2.3.2`]
1. `javax.xml.bind:jaxb-api`  -> [`2.4.0-b180830.0359`]
1. `net.sf.ehcache.internal:ehcache-rest-agent`  -> [`2.10.5`, `2.10.6`]
1. `net.sf.ehcache:ehcache`  -> [`2.10.5`, `2.10.6`, `2.10.7`]
1. `org.apache.dolphinscheduler:dolphinscheduler-data-quality`  -> [`3.0.0-alpha`]
1. `org.apache.druid.extensions.contrib:aliyun-oss-extensions`  -> [`0.19.0`, `0.20.0`, `0.20.1`, `0.20.2`, `0.21.0`, `0.21.1`, `0.22.0`, `0.22.1`]
1. `org.apache.druid:druid-benchmarks`  -> [`0.18.0`, `0.18.1`, `0.19.0`, `0.20.0`, `0.20.1`, `0.20.2`, `0.21.0`, `0.21.1`, `0.22.0`, `0.22.1`]
1. `org.apache.flink:flink-s3-fs-hadoop`  -> [`1.10.0`, `1.10.1`, `1.11.0`, `1.11.1`, `1.11.2`, `1.12.0`, `1.12.1`, `1.12.2`, `1.12.3`, `1.13.0`, `1.13.1`, `1.13.2`, `1.14.0`, `1.14.1`, `1.14.2`, `1.14.3`, `1.14.4`, `1.15.0`]
1. `org.apache.flink:flink-s3-fs-presto`  -> [`1.10.0`, `1.10.1`, `1.11.0`, `1.11.1`, `1.11.2`, `1.12.0`, `1.12.1`, `1.12.2`, `1.12.3`, `1.13.0`, `1.13.1`, `1.13.2`, `1.14.0`, `1.14.1`, `1.14.2`, `1.14.3`, `1.14.4`, `1.15.0`]
1. `org.apache.heron:heron-api`  -> [`0.20.3-incubating`, `0.20.4-incubating`]
1. `org.apache.heron:heron-simulator`  -> [`0.20.3-incubating`, `0.20.4-incubating`]
1. `org.apache.heron:heron-spi`  -> [`0.20.3-incubating`, `0.20.4-incubating`]
1. `org.apache.heron:heron-storm`  -> [`0.20.3-incubating`, `0.20.4-incubating`]
1. `org.apache.jackrabbit:oak-run-elastic`  -> [`1.42.0`]
1. `org.apache.servicemix.specs:org.apache.servicemix.specs.jaxb-api-2.3`  -> [`2.3_1`, `2.3_2`, `2.3_3`]
1. `org.apache.tika:tika-app`  -> [`1.19`, `1.19.1`]
1. `org.apache.tika:tika-server`  -> [`1.19`, `1.19.1`]
1. `org.apache.tomee:openejb-lite`  -> [`8.0.0`, `8.0.1`, `8.0.2`, `8.0.3`, `8.0.4`, `8.0.5`, `8.0.6`, `8.0.7`, `8.0.8`, `8.0.9`, `8.0.10`, `8.0.11`]
1. `org.duracloud.snapshot:snapshot-service-impl`  -> [`3.0.0`]
1. `org.duracloud:account-management-db-util`  -> [`7.0.0`]
1. `org.duracloud:account-management-monitor`  -> [`7.0.0`]
1. `org.icij.extract:extract-cli`  -> [`3.8.1`, `3.9.0`, `3.9.4`]
1. `org.neo4j:neosemantics`  -> [`4.0.0.0`, `4.0.0.1`, `4.1.0.0`, `4.1.0.1`, `4.2.0.0`, `4.2.0.1`, `4.3.0.0`, `4.3.0.1`, `4.3.0.2`, `4.4.0.0`, `4.4.0.1`]
1. `org.openapitools:openapi-generator-cli`  -> [`3.2.2`, `3.2.3`, `3.3.0`]
1. `org.verapdf.apps:greenfield-apps`  -> [`1.14.6-RC`, `1.14.7-RC`, `1.14.8`, `1.16.1`, `1.18.1`, `1.18.5`, `1.20.1`]
1. `org.verapdf.plugins:metsMetadata-plugin`  -> [`1.14.2-RC`, `1.14.9-RC`, `1.14.10-RC`]
1. `org.wso2.ei:encryption-client`  -> [`1.2.0-beta`]
1. `pl.allegro.tech.graphql:extended-audit-instrumentation`  -> [`1.0.0`]
1. `pl.decerto.hyperon.persistence:codegen-gradle-plugin`  -> [`0.1.45`, `0.1.51`, `6.0.0`]
1. `pl.owlsy:einvoice-peppol-bis`  -> [`0.0.1`]

## kotlin.stdlib

For example, at least 68 artifacts on Maven Central claim to be the module `kotlin.stdlib`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires kotlin.stdlib;`.

1. `cn.alapi:javasdk`  -> [`1.0`, `1.0.1`]
1. `cn.net.mugui:mugui-communication`  -> [`0.0.1`]
1. `com.brendangoldberg:kotlin-jwt`  -> [`1.3.0`]
1. `com.cognite:cdf-sdk-java`  -> [`0.9.0`, `0.9.1`, `0.9.2`, `0.9.3`, `0.9.4`, `0.9.5`, `0.9.6`, `0.9.8`, `0.9.9`, `0.9.10`, `1.0.0`, `1.0.1`, `1.1.0`, `1.1.1`, `1.2.0`, `1.3.0`, `1.4.0`, `1.5.0`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.7.0`, `1.7.1`, `1.8.0`, `1.9.0`, `1.10.0`, `1.11.0`, `1.12.0`, `1.12.1`, `1.13.0`, `1.13.1`]
1. `com.github.answerail:dingtalk-spring-boot-starter`  -> [`2.0.2-RELEASE`, `2.0.3-RELEASE`, `2.0.4-RELEASE`, `2.0.5-RELEASE`, `3.0.0-RELEASE`, `3.1.0-RELEASE`, `3.1.1-RELEASE`, `3.1.2-RELEASE`]
1. `com.github.shynixn.mccoroutine:mccoroutine-bukkit-sample`  -> [`0.0.4`, `0.0.5`, `0.0.6`, `0.0.7`, `1.1.0`, `1.1.2`, `1.2.0`, `1.3.0`, `1.4.0`, `1.5.0`, `1.6.0`, `2.0.0`, `2.0.1`, `2.1.0`, `2.2.0`]
1. `com.github.shynixn.mccoroutine:mccoroutine-bungeecord-core`  -> [`2.0.0`]
1. `com.github.shynixn.mccoroutine:mccoroutine-bungeecord-sample`  -> [`2.0.0`, `2.0.1`, `2.1.0`, `2.2.0`]
1. `com.gradleup:gr8-plugin`  -> [`0.2`, `0.3`, `0.4`]
1. `com.huaweicloud:esdk-obs-java-bundle`  -> [`3.21.11`, `3.21.12`, `3.22.3`]
1. `com.ibm.cloud:code-engine-examples`  -> [`0.3.3`]
1. `com.ibm.cloud:examples`  -> [`0.0.4`, `0.0.5`, `0.0.7`, `0.0.8`, `0.0.9`, `0.0.10`, `0.0.13`, `0.0.14`, `0.0.15`, `0.0.16`, `0.0.18`, `0.0.19`, `0.0.20`, `0.0.21`, `0.0.30`, `0.0.31`, `0.0.32`, `0.0.33`, `1.0.0`, `1.0.1`, `1.0.2`, `2.0.1`]
1. `com.ibm.cloud:is-examples`  -> [`0.6.2`, `0.7.0`, `0.8.0`, `0.8.1`, `0.9.0`]
1. `com.ibm.cloud:platform-services-examples`  -> [`0.17.10`, `0.17.11`, `0.17.12`, `0.17.13`, `0.17.14`, `0.17.15`, `0.17.16`, `0.17.17`, `0.18.0`, `0.18.1`, `0.18.4`, `0.18.5`, `0.18.6`, `0.18.7`, `0.18.8`, `0.18.10`, `0.18.11`, `0.18.12`, `0.18.14`, `0.18.15`, `0.19.0`, `0.19.1`, `0.19.2`, `0.20.0`, `0.20.1`, `0.21.0`, `0.21.1`, `0.22.0`, `0.22.1`, `0.22.2`, `0.22.3`, `0.22.4`, `0.22.5`, `0.22.6`, `0.22.7`, `0.22.8`, `0.22.9`, `0.23.0`, `0.24.0`]
1. `com.ibm.watson.health.cognitive-services:ibm-whcs-services-examples`  -> [`1.4.2`, `1.5.0`, `1.5.1`, `1.5.2`]
1. `com.incognia:incognia-api-client`  -> [`1.1.0`]
1. `com.intuit.hooks:maven-plugin`  -> [`0.7.0`, `0.8.1`, `0.8.2`, `0.9.0`, `0.9.1`]
1. `com.joseph-dwyer.katana:katana-compiler-plugin`  -> [`0.0.5`]
1. `com.networknt:light-proxy`  -> [`2.0.28`, `2.0.29`, `2.0.30`, `2.0.31`, `2.0.32`]
1. `com.networknt:light-router`  -> [`2.0.28`, `2.0.29`, `2.0.30`, `2.0.31`, `2.0.32`]
1. `com.networknt:oauth-code`  -> [`2.0.31`, `2.1.0`, `2.1.1`]
1. `com.networknt:oauth-key`  -> [`2.1.0`, `2.1.1`]
1. `com.networknt:oauth-token`  -> [`2.0.31`, `2.1.0`, `2.1.1`]
1. `com.networknt:oauth2-authorize`  -> [`2.1.1`]
1. `com.networknt:oauth2-client`  -> [`2.1.1`]
1. `com.networknt:oauth2-code`  -> [`2.1.1`]
1. `com.networknt:oauth2-key`  -> [`2.1.1`]
1. `com.networknt:oauth2-provider`  -> [`2.1.1`]
1. `com.networknt:oauth2-refresh-token`  -> [`2.1.1`]
1. `com.networknt:oauth2-service`  -> [`2.1.1`]
1. `com.networknt:oauth2-token`  -> [`2.1.1`]
1. `com.networknt:oauth2-user`  -> [`2.1.1`]
1. `com.niklasarndt:healthchecksio-java`  -> [`1.0.1`]
1. `com.niklasarndt:okhttp-mocker`  -> [`1.0.0`]
1. `com.oneidentity.safeguard:safeguardjava`  -> [`6.11.0.133386`]
1. `com.precisely.apis:PreciselyAPISJavaSDK`  -> [`11.9.2`]
1. `com.sanctionco.thunder:application`  -> [`3.0.0`, `3.0.1`, `3.0.2`, `3.0.3`, `3.0.4`]
1. `com.sap.cloud.sdk.datamodel:odata-generator-cli`  -> [`3.51.0`, `3.52.0`, `3.53.0`, `3.54.0`, `3.55.1`]
1. `com.sap.cloud.sdk.datamodel:odata-v4-generator-cli`  -> [`3.51.0`, `3.52.0`, `3.53.0`, `3.54.0`, `3.55.1`]
1. `com.sap.cloud.sdk.datamodel:openapi-generator-cli`  -> [`3.51.0`, `3.52.0`, `3.53.0`, `3.54.0`, `3.55.1`, `3.56.0`, `3.57.0`, `3.58.0`, `3.59.0`, `3.60.0`, `3.61.0`, `3.62.0`, `3.63.0`]
1. `com.sourcegraph:semanticdb-kotlinc`  -> [`0.0.1`, `0.0.2`, `0.1.0`, `0.2.0`]
1. `com.tradologics:tradologics-sdk`  -> [`0.0.2`, `0.0.8`, `1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.0.10`, `1.1.0`]
1. `de.smartsquare:socket-io-redis-emitter`  -> [`0.9.0`, `0.9.1`, `0.9.3`]
1. `fr.renardfute:SteamAPI`  -> [`1.0`]
1. `io.github.willena:connect-influxdb-sink`  -> [`1.0.0`]
1. `io.jumpco.open:kfsm-viz`  -> [`1.4.32.2`, `1.4.32.3`, `1.5.0`, `1.5.1`, `1.5.2`, `1.5.2.1`, `1.5.2.3`, `1.5.2.4`]
1. `io.kestra.plugin:plugin-kafka`  -> [`0.3.0`, `0.4.0`, `0.4.1`]
1. `io.lakefs:hadoop-lakefs-assembly`  -> [`0.1.0-RC.0`, `0.1.0`, `0.1.2-RC.0`, `0.1.3`, `0.1.4`, `0.1.5`, `0.1.6`, `0.58.1-new-key`]
1. `io.opentelemetry.contrib:opentelemetry-jmx-metrics`  -> [`1.10.0-alpha`, `1.11.0-alpha`, `1.12.0-alpha`, `1.13.0-alpha`]
1. `io.opentelemetry.contrib:opentelemetry-maven-extension`  -> [`1.10.0-alpha`, `1.11.0-alpha`, `1.12.0-alpha`, `1.13.0-alpha`]
1. `no.entur:schema2proto-lib`  -> [`1.1`, `1.2`, `1.3`, `1.4`, `1.5`, `1.6`, `1.7`, `1.8`, `1.9`, `1.10`, `1.13`, `1.14`, `1.15`, `1.16`, `1.17`, `1.18`, `1.19`, `1.20`, `1.21`, `1.22`, `1.23`, `1.24`, `1.25`, `1.26`, `1.27`, `1.28`, `1.29`, `1.30`, `1.31`, `1.32`, `1.33`, `1.34`, `1.35`, `1.36`, `1.37`, `1.39`, `1.40`, `1.41`, `1.42`, `1.45`, `1.46`, `1.47`, `1.48`, `1.49`, `1.50`, `1.51`, `1.52`, `1.53`, `1.54`, `1.55`, `1.56`]
1. `org.apache.seatunnel:seatunnel-connector-flink-influxdb`  -> [`2.1.0`, `2.1.1`]
1. `org.apache.servicemix.bundles:org.apache.servicemix.bundles.azure-core-http-okhttp`  -> [`1.7.10_1`, `1.8.0_1`]
1. `org.didcommx.peerdid:peerdid`  -> [`0.1.0`]
1. `org.didcommx:peerdid`  -> [`0.1.0`]
1. `org.jetbrains.bsp:bazel-bsp`  -> [`2.0.0`]
1. `org.jetbrains.kotlin:kotlin-osgi-bundle`  -> [`1.4.0`, `1.4.10`, `1.4.21`, `1.4.30`, `1.5.0-M2`, `1.5.20`, `1.5.30-M1`, `1.5.30-RC`, `1.5.30`, `1.5.31`, `1.6.0-M1`, `1.6.0-RC`, `1.6.0-RC2`, `1.6.0`, `1.6.10`, `1.6.20-M1`, `1.6.20-RC2`, `1.6.20`, `1.6.21`]
1. `org.jetbrains.kotlin:kotlin-stdlib` 🧩 -> [`1.4.0-rc`, `1.4.0`, `1.4.10`, `1.4.20-M1`, `1.4.20-RC`, `1.4.20`, `1.4.21`, `1.4.30-M1`, `1.4.30-RC`, `1.4.30`, `1.4.31`, `1.5.0-M1`, `1.5.0-M2`, `1.5.0-RC`, `1.5.0`, `1.5.10`, `1.5.20-M1`, `1.5.20-RC`, `1.5.20`, `1.5.21`, `1.5.30-M1`, `1.5.30-RC`, `1.5.30`, `1.5.31`, `1.6.0-M1`, `1.6.0-RC`, `1.6.0-RC2`, `1.6.0`, `1.6.10-RC`, `1.6.10`, `1.6.20-M1`, `1.6.20-RC`, `1.6.20-RC2`, `1.6.20`, `1.6.21`, `1.7.0-Beta`]
1. `org.jetbrains.kotlinx:rdkit-jupyter`  -> [`1.0.0`]
1. `org.jetbrains.xodus:xodus-tools`  -> [`2.0.0`, `2.0.1`]
1. `org.testcontainers:solr`  -> [`1.17.0`, `1.17.1`]
1. `ru.pocketbyte.locolaser:resource-gettext`  -> [`2.1.0`]
1. `ru.pocketbyte.locolaser:resource-googlesheet`  -> [`2.1.0`]
1. `ru.pocketbyte.locolaser:resource-ini`  -> [`2.1.0`]
1. `ru.pocketbyte.locolaser:resource-json`  -> [`2.1.0`]
1. `ru.pocketbyte.locolaser:resource-mobile`  -> [`2.1.0`]
1. `ru.pocketbyte.locolaser:resource-properties`  -> [`2.1.0`]
1. `ru.sokomishalov.skraper:cli`  -> [`0.7.0`, `0.8.0`, `0.8.1`, `0.8.2`, `0.8.3`]

## net.bytebuddy

For example, at least 68 artifacts on Maven Central claim to be the module `net.bytebuddy`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires net.bytebuddy;`.

1. `cloud.orbit:orbit-redis-cluster`  -> [`1.5.0`, `1.5.1`]
1. `co.elastic.apm:elastic-apm-agent`  -> [`1.0.0.RC1`, `1.0.0`, `1.1.0`]
1. `com.alipay.sdk:alipay-easysdk`  -> [`1.0.0`, `1.0.1`]
1. `com.criteo.java:garmadon-agent`  -> [`1.0.0`, `1.2.0`, `1.3.0`, `1.3.1`, `1.4.0`]
1. `com.exasol:virtual-schema-common-document-files`  -> [`0.2.0`, `1.0.0`]
1. `com.github.database-rider:rider-micronaut`  -> [`1.23.1`, `1.24.0`, `1.25.0`, `1.26.0`, `1.27.0`, `1.28.0`, `1.29.0`, `1.30.0`, `1.31.0`, `1.32.0`, `1.32.1`, `1.32.2`, `1.32.3`]
1. `com.github.jiayaoguang:gameserver-example`  -> [`0.0.2`]
1. `com.github.jsimone:webapp-runner`  -> [`9.0.27.1`]
1. `com.github.roskart.dropwizard-jaxws:dropwizard-jaxws-example`  -> [`1.2.0`, `1.2.1`, `1.2.2`, `1.2.3`]
1. `com.guicedee.services:byte-buddy`  -> [`1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.0.3-jre17-rc1`, `1.2.1.1-jre17`, `1.2.1.2-jre17`, `1.2.2.1`, `1.2.2.1-jre17`]
1. `com.heroku:webapp-runner`  -> [`9.0.30.0`, `9.0.31.0`, `9.0.36.1`, `9.0.38.0`, `9.0.41.0`, `9.0.52.0`, `9.0.52.1`]
1. `com.huaweicloud.sermant:sermant-agentcore-core`  -> [`0.2.0`, `0.2.1`]
1. `com.instaclustr:ttl-remover-byte-buddy`  -> [`1.0.0`, `1.0.1`, `1.0.3`]
1. `com.nordstrom.ui-tools:local-grid-utility`  -> [`1.3.3`]
1. `com.proofpoint.platform:jaxrs`  -> [`1.95`, `1.96`, `1.97`, `1.98`, `1.99`, `2.00`, `2.01`, `2.02`, `2.03`, `2.04`, `2.05`, `2.06`, `2.07`, `2.08`, `2.09`, `2.10`, `2.11`, `2.12`, `2.13`, `2.14`, `2.15`, `2.16`, `2.17`, `2.18`, `2.19`, `2.20`, `2.22`, `2.23`, `2.24`, `2.25`, `2.26`, `2.27`, `2.28`, `2.29`, `2.30`, `2.32`, `2.33`, `2.34`, `2.35`, `2.36`, `2.37`, `2.38`, `2.39`, `2.40`, `2.41`, `2.42`, `2.43`, `2.44`, `2.46`, `2.47`, `2.48`, `2.49`, `2.51`, `2.53`, `2.54`, `2.55`, `2.56`, `2.57`, `2.58`, `2.59`, `2.60`, `2.61`, `2.65`, `2.66`, `2.67`]
1. `com.qcloud.oceanus:flink-python_2.11`  -> [`1.10.1`]
1. `com.undefinedlabs.scope:scope-agent`  -> [`0.1.0-beta1`, `0.1.0`, `0.1.1-beta.1`, `0.1.1-beta.2`, `0.1.1-rc.1`, `0.1.1`, `0.1.2-beta.1`, `0.1.2-beta.2`, `0.1.2-beta.3`, `0.1.2-beta.4`, `0.1.2`, `0.1.3-beta.1`, `0.1.3-beta.2`, `0.1.3`, `0.1.4-beta.1`, `0.1.4-beta.2`, `0.1.4-beta.3`, `0.1.4-beta.4`, `0.1.4-beta.5`, `0.1.4-beta.6`, `0.1.4-beta.7`, `0.1.4-beta.8`, `0.1.4-beta.9`, `0.1.4`, `0.1.5-beta.1`, `0.1.5-beta.2`, `0.1.5-beta.3`, `0.1.5-beta.4`, `0.1.5`, `0.1.6-beta.1`, `0.1.6`, `0.1.7-beta.1`, `0.1.7-beta.2`, `0.1.7-beta.3`, `0.1.7-beta.4`, `0.1.7-beta.5`, `0.1.7-beta.6`, `0.1.7-beta.7`, `0.1.7-beta.8`, `0.1.7-beta.9`, `0.1.7-beta.10`, `0.1.7-beta.11`, `0.1.7`, `0.1.8-beta.1`, `0.1.8-beta.2`, `0.1.8-beta.3`, `0.1.8-beta.4`, `0.1.8-beta.5`, `0.1.8-beta.6`, `0.1.8-beta.7`, `0.1.8-beta.8`, `0.1.8`, `0.1.9-beta.1`, `0.1.9-beta.2`, `0.1.9-beta.3`, `0.1.9-beta.4`, `0.1.9-beta.5`, `0.1.9-beta.6`, `0.1.9-beta.7`, `0.1.9`, `0.1.10-beta.1`, `0.1.10-beta.2`, `0.1.10-beta.3`, `0.1.10-beta.4`, `0.1.10-beta.5`, `0.1.10-beta.6`, `0.1.10-beta.7`, `0.1.10-beta.8`, `0.2.0`, `0.2.1-beta.1`, `0.2.1-beta.2`, `0.2.1-beta.3`, `0.2.1-beta.4`, `0.2.1-beta.5`, `0.2.1-beta.6`, `0.2.1-beta.7`, `0.2.1`, `0.2.2-beta.1`, `0.2.2-beta.2`, `0.2.2-beta.3`, `0.2.2-beta.4`, `0.2.2`, `0.2.3-beta.1`, `0.2.3`, `0.2.4-beta.1`, `0.2.4-beta.2`, `0.2.4`, `0.2.5-beta.1`, `0.2.5-beta.2`, `0.2.5-beta.3`, `0.2.5-beta.4`, `0.2.5-beta.5`, `0.2.5-beta.6`, `0.2.5-beta.7`, `0.2.5-beta.8`, `0.2.5-beta.9`, `0.2.5-beta.10`, `0.2.5-beta.11`, `0.2.5-beta.12`, `0.2.5-beta.13`, `0.3.0-beta.1`, `0.3.0`, `0.3.1`, `0.3.2`, `0.3.3-beta.1`, `0.3.3-beta.2`, `0.3.3-beta.3`, `0.3.3-beta.4`, `0.4.0`, `0.5.0-beta.1`, `0.5.0-beta.2`, `0.5.0-beta.3`, `0.5.0-beta.4`, `0.5.0`, `0.5.1`, `0.5.2-beta.1`, `0.5.2`, `0.6.0-beta.1`, `0.6.0`, `0.6.1`, `0.6.2`, `0.6.3`, `0.7.0-beta.1`, `0.7.0-beta.2`, `0.7.0`, `0.7.1-beta.1`, `0.8.0-beta.1`, `0.8.0-beta.2`, `0.8.0-beta.3`, `0.8.0-beta.4`, `0.8.0-beta.5`, `0.8.0`, `0.8.1`, `0.8.2-beta.1`, `0.9.0-beta.1`, `0.9.0-beta.2`, `0.9.0-beta.3`, `0.9.0-beta.4`, `0.9.0`, `0.10.0-beta.1`, `0.10.0-beta.2`, `0.10.0-beta.3`, `0.10.0`, `0.10.1-beta.1`, `0.10.1-beta.2`, `0.10.1-beta.3`, `0.10.1-beta.4`, `0.10.1-beta.5`, `0.11.0-beta.1`, `0.11.0`, `0.11.1-beta.1`, `0.11.1-beta.2`, `0.12.0-beta.1`, `0.12.0-beta.2`, `0.12.0-beta.3`, `0.12.0`, `0.13.0`, `0.14.0-beta.1`, `0.14.0-beta.2`, `0.14.0-beta.3`, `0.14.0-beta.4`, `0.14.0-beta.5`, `0.14.0-beta.6`, `0.14.0-beta.7`, `0.14.0`, `0.15.0-beta.1`, `0.15.0-beta.2`, `0.15.0-beta.3`, `0.15.0-beta.4`, `0.15.0-beta.5`, `0.15.0-beta.6`, `0.15.0-beta.7`, `0.15.0-beta.8`, `0.15.0-beta.9`, `0.15.0`, `0.15.1-beta.1`, `0.15.1-beta.2`]
1. `com.yahoo.elide:elide-blog-example`  -> [`4.5.6`, `4.5.7`, `4.5.8`, `4.5.9`]
1. `cz.o2.proxima.beam:beam-runners-direct-java`  -> [`0.3.0-rc1`, `0.3.0-rc1-ab3f0b`, `0.3-1d562f`]
1. `cz.o2.proxima.beam:beam-runners-flink-1.8`  -> [`0.3.0-rc1`]
1. `cz.o2.proxima.beam:beam-runners-flink-1.9`  -> [`0.3.0-rc1-ab3f0b`, `0.3-1d562f`]
1. `cz.o2.proxima.beam:beam-sdks-java-core`  -> [`0.3.0-rc1`, `0.3.0-rc1-ab3f0b`, `0.3-1d562f`]
1. `cz.o2.proxima.beam:beam-sdks-java-extensions-euphoria`  -> [`0.3.0-rc1`, `0.3.0-rc1-ab3f0b`, `0.3-1d562f`]
1. `cz.o2.proxima.beam:beam-sdks-java-extensions-kryo`  -> [`0.3.0-rc1`, `0.3.0-rc1-ab3f0b`, `0.3-1d562f`]
1. `cz.o2.proxima.beam:beam-sdks-java-io-google-cloud-platform`  -> [`0.3.0-rc1`, `0.3.0-rc1-ab3f0b`]
1. `cz.o2.proxima.beam:beam-sdks-java-io-kafka`  -> [`0.3.0-rc1`, `0.3.0-rc1-ab3f0b`]
1. `io.aeron:aeron-agent`  -> [`1.26.0`, `1.27.0`, `1.28.0`, `1.28.1`, `1.28.2`, `1.29.0`, `1.30.0`, `1.31.0`, `1.31.1`, `1.32.0`, `1.33.0`, `1.33.1`, `1.34.0`, `1.35.0`, `1.35.1`, `1.36.0`, `1.37.0`, `1.38.0`, `1.38.1`]
1. `io.aeron:aeron-all`  -> [`1.13.0`, `1.14.0`, `1.15.0`, `1.15.1`, `1.15.2`, `1.15.3`, `1.16.0`, `1.17.0`, `1.18.0`, `1.19.0`, `1.19.1`, `1.20.0`, `1.21.0`, `1.21.1`, `1.21.2`, `1.22.0`, `1.22.1`, `1.23.0`, `1.23.1`]
1. `io.github.harvies.charon:charon-agent`  -> [`0.0.6`, `0.0.7`, `0.0.8`]
1. `io.github.jas34:scheduledwf-server`  -> [`1.1.0`, `1.1.1`, `1.2.0`, `1.2.2`]
1. `io.github.lomom:agent-logger`  -> [`1.0.1-Release`]
1. `io.kamon:kanela-agent`  -> [`1.0.0-M1`, `1.0.0-M2`, `1.0.0-M3`, `1.0.0-RC1`, `1.0.0-RC2`, `1.0.0-RC3`, `1.0.0-RC4`, `1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`]
1. `io.openk9:io.openk9.reactor.agent`  -> [`0.0.1-SNAPSHOTS`]
1. `io.opentracing.contrib.specialagent:opentracing-specialagent`  -> [`0.9.0`, `1.0.1`, `1.0.2`]
1. `io.projectreactor.tools:blockhound`  -> [`1.0.0.RELEASE`]
1. `net.bytebuddy:byte-buddy` 🧩 -> [`1.9.0`, `1.9.1`, `1.9.2`, `1.9.3`, `1.9.4`, `1.9.6`, `1.9.7`, `1.9.8`, `1.9.9`, `1.9.10`, `1.9.11`, `1.9.12`, `1.9.13`, `1.9.14`, `1.9.15`, `1.9.16`, `1.10.0`, `1.10.1`, `1.10.2`, `1.10.3`, `1.10.4`, `1.10.5`, `1.10.6`, `1.10.7`, `1.10.8`, `1.10.9`, `1.10.10`, `1.10.11`, `1.10.12`, `1.10.13`, `1.10.14`, `1.10.15`, `1.10.16`, `1.10.17`, `1.10.18`, `1.10.19`, `1.10.20`, `1.10.21`, `1.10.22`, `1.11.0`, `1.11.1`, `1.11.2`, `1.11.3`, `1.11.4`, `1.11.5`, `1.11.6`, `1.11.7`, `1.11.8`, `1.11.9`, `1.11.10`, `1.11.11`, `1.11.12`, `1.11.13`, `1.11.14`, `1.11.15`, `1.11.16`, `1.11.17`, `1.11.18`, `1.11.19`, `1.11.20`, `1.11.21`, `1.11.22`, `1.12.0`, `1.12.1`, `1.12.2`, `1.12.3`, `1.12.4`, `1.12.5`, `1.12.6`, `1.12.7`, `1.12.8`, `1.12.9`, `1.12.10`]
1. `net.serenity-bdd:serenity-cli`  -> [`2.3.26`, `2.3.30`, `2.3.31`, `2.3.32`, `2.3.33`, `2.4.0`, `2.4.1`, `2.4.2`, `2.4.3`, `2.4.4`, `2.4.5`, `2.4.15`, `2.4.20`, `2.4.21`, `2.4.24`, `2.4.34`, `2.4.35`, `2.4.42`, `2.4.44`, `2.4.47`, `2.4.48`, `2.4.49`, `2.4.50`, `2.4.51`, `2.5.0`, `2.5.1`, `2.5.4`, `2.5.5`, `2.5.6`, `2.5.7`, `2.5.8`, `2.5.10`, `2.6.0`, `3.0.0`, `3.0.1`, `3.0.2`, `3.0.3`, `3.0.4`, `3.0.5`, `3.1.0`, `3.1.1`, `3.1.2`, `3.1.3`, `3.1.4`, `3.1.5`, `3.1.10`, `3.1.11`, `3.1.13`, `3.1.15`, `3.1.16`]
1. `nl.jqno.equalsverifier:equalsverifier`  -> [`3.0.1`, `3.0.2`]
1. `org.agrona:agrona-agent`  -> [`1.4.0`, `1.4.1`, `1.5.0`, `1.5.1`, `1.6.0`, `1.7.0`, `1.7.1`, `1.7.2`, `1.8.0`, `1.9.0`, `1.10.0`, `1.11.0`, `1.12.0`, `1.13.0`, `1.13.1`, `1.14.0`, `1.15.0`, `1.15.1`]
1. `org.apache.beam:beam-runners-flink-1.6-job-server`  -> [`2.10.0`, `2.11.0`, `2.12.0`, `2.13.0`, `2.14.0`, `2.15.0`, `2.16.0`]
1. `org.apache.beam:beam-runners-flink-1.7-job-server`  -> [`2.10.0`, `2.11.0`, `2.12.0`, `2.13.0`, `2.14.0`, `2.15.0`, `2.16.0`, `2.17.0`, `2.18.0`, `2.19.0`]
1. `org.apache.beam:beam-runners-flink-1.8-job-server`  -> [`2.13.0`, `2.14.0`, `2.15.0`, `2.16.0`, `2.17.0`, `2.18.0`, `2.19.0`]
1. `org.apache.beam:beam-runners-flink-1.9-job-server`  -> [`2.17.0`, `2.18.0`, `2.19.0`]
1. `org.apache.beam:beam-runners-flink_2.11-job-server`  -> [`2.9.0`, `2.10.0`, `2.11.0`, `2.12.0`, `2.13.0`, `2.14.0`, `2.15.0`, `2.16.0`]
1. `org.apache.beam:beam-runners-reference-job-server`  -> [`2.9.0`, `2.10.0`, `2.11.0`, `2.12.0`, `2.13.0`]
1. `org.apache.beam:beam-runners-samza-job-server`  -> [`2.13.0`, `2.14.0`, `2.15.0`, `2.16.0`, `2.17.0`, `2.18.0`, `2.19.0`]
1. `org.apache.beam:beam-runners-spark-job-server`  -> [`2.13.0`, `2.14.0`, `2.15.0`, `2.16.0`, `2.17.0`, `2.18.0`, `2.19.0`]
1. `org.apache.beam:beam-sdks-java-core`  -> [`2.9.0`, `2.10.0`, `2.11.0`, `2.12.0`, `2.13.0`, `2.14.0`, `2.15.0`]
1. `org.apache.beam:beam-sdks-java-extensions-sql-jdbc`  -> [`2.9.0`, `2.10.0`, `2.11.0`, `2.12.0`, `2.13.0`, `2.14.0`, `2.15.0`, `2.16.0`, `2.17.0`, `2.18.0`, `2.19.0`]
1. `org.apache.beam:beam-sdks-java-harness`  -> [`2.9.0`, `2.10.0`, `2.11.0`, `2.12.0`, `2.13.0`, `2.14.0`, `2.15.0`, `2.16.0`, `2.17.0`, `2.18.0`, `2.19.0`]
1. `org.apache.beam:beam-vendor-bytebuddy-1_9_3`  -> [`0.1`]
1. `org.apache.flink:flink-python_2.11`  -> [`1.10.0`, `1.10.1`, `1.11.0`, `1.11.1`, `1.11.2`]
1. `org.apache.flink:flink-python_2.12`  -> [`1.10.0`, `1.10.1`, `1.11.0`, `1.11.1`, `1.11.2`]
1. `org.apache.hadoop:hadoop-client-minicluster`  -> [`3.3.0`, `3.3.1`, `3.3.2`]
1. `org.apache.shardingsphere:shardingsphere-agent-bootstrap`  -> [`5.0.0-beta`, `5.0.0`, `5.1.0`, `5.1.1`]
1. `org.apache.skywalking:apm-agent`  -> [`6.0.0-alpha`, `6.0.0-beta`, `6.0.0-GA`]
1. `org.assertj:assertj-core`  -> [`3.12.0`]
1. `org.choco-solver:choco-solver`  -> [`4.10.0`, `4.10.1`, `4.10.2`]
1. `org.duracloud:account-management-monitor`  -> [`7.1.0`, `7.1.1`]
1. `org.infinispan.doclets:infinispan-doclets-java11`  -> [`1.2.1.Final`, `1.3.0`]
1. `org.jetbrains.kotlinx:kotlinx-coroutines-debug`  -> [`1.1.0-alpha`, `1.1.0`, `1.1.1`, `1.1.1-eap13`, `1.2.0-alpha`, `1.2.0-alpha-2`, `1.2.0`, `1.2.1`, `1.3.0-M1`, `1.3.0-M2`, `1.3.0-RC`, `1.3.0-RC2`, `1.3.0`, `1.3.1`, `1.3.2`, `1.3.2-1.3.60`, `1.3.3`, `1.3.4`, `1.3.5`, `1.3.5-native-mt`, `1.3.5-native-mt-1.4-M1`, `1.3.5-2-native-mt-1.4-M1`, `1.3.6`, `1.3.7`, `1.3.7-native-mt-1.4-M2`, `1.3.8`, `1.3.8-1.4.0-rc`, `1.3.9`, `1.3.9-native-mt`, `1.3.9-native-mt-2`, `1.4.0-M1`, `1.4.0`, `1.4.1`, `1.4.1-native-mt`, `1.4.2`, `1.4.2-native-mt`, `1.4.3`, `1.4.3-native-mt`, `1.5.0-RC`, `1.5.0-RC-native-mt`, `1.5.0`, `1.5.0-native-mt`, `1.5.1`, `1.5.1-native-mt`, `1.5.2`, `1.5.2-native-mt`, `1.6.0-RC`, `1.6.0-RC2`, `1.6.0-RC3`, `1.6.0`, `1.6.0-native-mt`, `1.6.1`, `1.6.1-native-mt`]
1. `org.opendaylight.mdsal:mdsal-binding-dom-codec`  -> [`4.0.1`, `4.0.2`, `4.0.3`, `4.0.4`]
1. `org.rapidpm.vaadin:nano-vaadin-undertow`  -> [`01.00.01-RPM`, `01.00.02-RPM`, `01.00.03-RPM`]
1. `org.redisson:redisson-all`  -> [`3.10.1`]
1. `org.sheinbergon:needle-agent`  -> [`0.2.0-RELEASE`, `0.2.1-RELEASE`, `0.3.0-RELEASE`]
1. `org.thepavel:jpql-builder`  -> [`0.4.0`]
1. `org.treblereel.gwt.gwtproject.resources:gwt-resources-processor`  -> [`202203291`]
1. `pl.morgwai.base:servlet-scopes`  -> [`4.2-javax`, `5.0-javax`, `6.0-javax`, `6.1-javax`]

## info.picocli

For example, at least 65 artifacts on Maven Central claim to be the module `info.picocli`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires info.picocli;`.

1. `biz.netcentric.security:pickaxe-scans`  -> [`2.4.2`]
1. `com.aeontronix.enhanced-mule:enhanced-mule-tools-cli`  -> [`1.3.0-alpha1`, `1.3.0-alpha2`, `1.3.0-alpha3`, `1.3.0-alpha4`, `1.3.0-alpha5`, `1.3.0-alpha8`, `1.3.0-alpha9`, `1.3.0-beta1`, `1.3.0-beta2`, `1.3.0-beta3`, `1.3.0-beta4`, `1.3.0-beta5`, `1.3.0-beta6`, `1.3.0-beta7`, `1.3.0-beta8`, `1.3.0-beta9`, `1.3.0-beta10`, `1.3.0-beta11`, `1.3.0-beta12`, `1.3.0-beta13`, `1.3.0-beta14`, `1.3.0-beta15`, `1.3.0-beta16`, `1.3.0-beta17`, `1.3.0-beta18`, `1.3.0-beta19`, `1.3.0-beta20`, `1.3.0-beta21`, `1.3.0-beta22`, `2.0.0-alpha1`]
1. `com.aeontronix.enhancedmule:enhanced-mule-installer-cli`  -> [`1.0.0-beta2`]
1. `com.appland:appmap-agent`  -> [`1.4.0`, `1.4.1`, `1.5.0`, `1.6.0`, `1.6.1`, `1.7.0`, `1.8.0`, `1.8.1`, `1.9.0`, `1.10.0`, `1.11.0`, `1.12.0`, `1.12.1`, `1.12.2`, `1.12.3`, `1.13.0`, `1.13.1`]
1. `com.arcadedb:arcadedb-gremlin`  -> [`21.12.1`, `22.1.1`, `22.1.2`, `22.1.3`, `22.2.1`]
1. `com.arcadedb:arcadedb-mongodbw`  -> [`21.12.1`]
1. `com.arcadedb:arcadedb-postgresw`  -> [`21.12.1`, `22.1.1`, `22.1.2`]
1. `com.arcadedb:arcadedb-redisw`  -> [`21.12.1`]
1. `com.github.cafapi.util.flywayinstaller:util-flywayinstaller-cli`  -> [`1.0.0-73`]
1. `com.github.crawler-commons:urlfrontier-client`  -> [`0.1`, `0.2`, `0.3`, `0.4`, `1.0`, `1.1`, `1.2`, `2.0`]
1. `com.github.crawler-commons:urlfrontier-service`  -> [`1.1`, `1.2`, `2.0`]
1. `com.github.ngeor:yak4j-cli`  -> [`0.10.0`]
1. `com.instaclustr:cassandra-3`  -> [`1.0`]
1. `com.instaclustr:cassandra-4`  -> [`1.0`]
1. `com.instaclustr:cassandra-sidecar`  -> [`1.0.0`, `2.0.0-alpha1`, `2.0.0-alpha2`, `2.0.0-alpha3`, `2.0.0-alpha4`, `2.0.0-alpha5`, `2.0.0-alpha6`, `2.0.0-alpha7`, `2.0.0-alpha8`]
1. `com.instaclustr:esop`  -> [`1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`, `1.1.0`, `1.1.2`, `1.1.3`, `1.1.4`, `1.1.5`, `2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`]
1. `com.instaclustr:ic-sstable-tools-4.0-rc1`  -> [`1.0.0`]
1. `com.instaclustr:ic-sstable-tools-4.0.0`  -> [`1.0.0`]
1. `com.instaclustr:icarus`  -> [`1.0.0`, `1.0.1`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`, `1.1.1`, `1.1.2`, `1.1.3`, `2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`]
1. `com.instaclustr:instaclustr-backup-restore`  -> [`1.0.0`, `1.1.0`, `1.1.1`, `1.1.2`, `1.1.3`, `1.1.4`, `1.1.5`, `1.1.6`, `1.1.7`, `1.1.8`, `2.0.0-alpha1`, `2.0.0-alpha2`, `2.0.0-alpha3`, `2.0.0-alpha4`, `2.0.0-alpha5`, `2.0.0-alpha6`, `2.0.0-alpha7`, `2.0.0-alpha8`]
1. `com.instaclustr:minotaur`  -> [`1.0.0`, `1.0.1`]
1. `com.instaclustr:sstable-generator-cassandra-2-2-19`  -> [`1.0`]
1. `com.instaclustr:sstable-generator-cassandra-2`  -> [`1.2`, `1.3`]
1. `com.instaclustr:sstable-generator-cassandra-3-0-25`  -> [`1.0`]
1. `com.instaclustr:sstable-generator-cassandra-3-11-11`  -> [`1.0`]
1. `com.instaclustr:sstable-generator-cassandra-3`  -> [`1.1`, `1.2`, `1.3`]
1. `com.instaclustr:sstable-generator-cassandra-4-0-0`  -> [`1.0`]
1. `com.instaclustr:sstable-generator-cassandra-4`  -> [`1.1`, `1.2`, `1.3`]
1. `com.instaclustr:sstable-generator`  -> [`1.0`, `1.1`, `1.2`, `1.3`, `1.4`]
1. `com.instaclustr:ttl-remover-impl`  -> [`1.0.0`, `1.1.0`, `1.1.1`, `1.1.2`]
1. `com.mygraphql.graphub:openapi2graphqls-cli`  -> [`0.0.2`]
1. `com.ninja-beans.crawler:cloudflare-iuam-solver-dist`  -> [`0.1.0`]
1. `com.nitorcreations:aws-vault-cli`  -> [`0.16`]
1. `com.pessetto.origamismtp:OrigamiSMTP`  -> [`2.0.0`, `2.0.3`, `2.0.4`, `3.0.0`]
1. `com.scalar-labs:scalardb-schema-loader`  -> [`3.4.0`, `3.4.1`]
1. `com.tngtech.keycloakmock:standalone`  -> [`0.1.0`, `0.2.0`, `0.3.0`, `0.4.0`, `0.5.0`, `0.6.0`, `0.7.0`, `0.8.0`, `0.9.0`, `0.10.0`, `0.11.0`]
1. `de.dagere.kieker:kieker-source-instrumentation`  -> [`1.15.0`]
1. `de.dagere.peass:peass-distribution`  -> [`0.1.0`]
1. `de.jpdigital:owlapi-simplex-cli`  -> [`0.1.0`, `0.1.1`]
1. `eu.toop:toop-demoui-dcstandalone`  -> [`2.0.0-rc1`, `2.0.0-rc2`, `2.0.0-rc3`, `2.0.0`, `2.1.0`, `2.1.0-1`, `2.1.1`]
1. `info.picocli:picocli-jpms-module`  -> [`4.0.0-alpha-2`, `4.0.0-alpha-3`]
1. `info.picocli:picocli` 🧩 -> [`4.0.0-beta-1b`, `4.0.0-beta-2`, `4.0.0`, `4.0.1`, `4.0.2`, `4.0.3`, `4.0.4`, `4.1.0`, `4.1.1`, `4.1.2`, `4.1.3`, `4.1.4`, `4.2.0`, `4.3.0`, `4.3.1`, `4.3.2`, `4.4.0`, `4.5.0`, `4.5.1`, `4.5.2`, `4.6.0`, `4.6.1`, `4.6.2`, `4.6.3`]
1. `io.apiwiz.astrum:astrum-cli`  -> [`0.1`]
1. `io.github.asseco-pst:einstein`  -> [`1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.1.0`, `1.2.0`, `1.2.1`]
1. `io.github.davidwhitlock.cs410J.original:student`  -> [`2021.0.0`, `2021.1.0`, `2021.1.1`, `2021.1.2`, `2021.2.0`, `2021.3.0`, `2022.0.0`]
1. `io.jooby:jooby-cli`  -> [`2.0.6`, `2.1.0`, `2.2.0`, `2.2.1`, `2.3.0`, `2.3.1`, `2.4.0`, `2.5.0`, `2.5.1`, `2.6.0`, `2.6.1`, `2.6.2`, `2.7.0`, `2.7.1`, `2.7.2`, `2.7.3`, `2.8.0`, `2.8.1`, `2.8.2`, `2.8.3`, `2.8.4`, `2.8.5`, `2.8.6`, `2.8.7`, `2.8.8`, `2.8.9`, `2.8.10`, `2.9.0`, `2.9.1`, `2.9.2`, `2.9.3`, `2.9.4`, `2.9.5`, `2.9.6`, `2.10.0`, `2.11.0`, `2.12.0`, `2.13.0`, `2.14.0`, `2.14.1`]
1. `io.kestra:kestra`  -> [`0.2.3`, `0.2.4`, `0.2.5`, `0.2.9`, `0.2.10`, `0.2.11`, `0.2.12`, `0.2.13`, `0.2.14`, `0.2.15`, `0.2.16`, `0.3.0`, `0.3.1`, `0.3.2`, `0.4.0`, `0.4.1`, `0.4.2`]
1. `io.mongock:mongock-cli-core`  -> [`5.0.20.BETA`, `5.0.23.BETA`, `5.0.24`, `5.0.25`, `5.0.26`]
1. `io.mongock:mongock-cli-springboot`  -> [`5.0.17.BETA`, `5.0.20.BETA`, `5.0.21.BETA`, `5.0.22.BETA`, `5.0.23.BETA`, `5.0.24`, `5.0.25`, `5.0.26`]
1. `io.sealights.on-premise.agents:sl-build-scanner`  -> [`3.0.1796`, `3.0.1812`, `3.1.1830`, `3.1.1863`, `3.1.1870`, `3.1.1892`, `3.1.1902`, `3.1.1910`, `3.1.1925`, `3.1.1932`, `3.1.1955`, `3.1.1956`, `3.1.1968`, `3.1.1993`, `3.1.1995`, `3.1.2024`, `3.1.2056`, `3.1.2065`, `3.1.2066`, `3.1.2070`, `3.1.2079`, `3.1.2083`, `3.1.2089`, `3.1.2090`, `3.1.2092`, `3.1.2093`]
1. `org.apache.hadoop:hadoop-ozone-filesystem-shaded`  -> [`1.1.0`]
1. `org.apache.james:webadmin-cli`  -> [`3.6.0`, `3.6.2`, `3.7.0`]
1. `org.apache.ozone:ozone-filesystem-shaded`  -> [`1.2.0`, `1.2.1`]
1. `org.caseine:caseine.vpl.tools.CLI`  -> [`0.0.36`, `0.0.37`, `0.0.38`, `0.0.41`, `0.0.44`, `0.0.45`, `0.0.46`, `0.0.48`, `0.0.49`, `0.0.50`, `0.0.51`]
1. `org.jboss.gm:cli`  -> [`1.5`, `1.6`, `1.6.1`, `1.6.2`, `1.8`, `1.9`, `2.0`, `2.1`, `2.2`, `2.3`, `2.4`, `2.5`, `2.6`, `2.7`, `2.8`, `2.9`, `3.0`, `3.1`, `3.1.1`, `3.2`, `3.3`, `3.4`, `3.5`]
1. `org.kie:kie-dmn-xls2dmn-cli`  -> [`7.57.0.Final`, `7.58.0.Beta1`, `7.58.0.Final`, `7.59.0.Beta1`, `7.59.0.Final`, `7.60.0.Final`, `8.13.0.Beta`, `8.14.0.Beta`, `8.14.1.Beta`, `8.15.0.Beta`]
1. `org.monarchinitiative.phenol:phenol-cli`  -> [`1.6.3`]
1. `org.pgpainless:pgpainless-cert-d-cli`  -> [`0.1.0`, `0.1.1`, `0.1.2`]
1. `org.pgpainless:pgpainless-cli`  -> [`0.2.4`, `0.2.5`, `0.2.6`, `0.2.7`, `0.2.8`, `0.2.9`, `0.2.10`, `0.2.11`, `0.2.12`, `0.2.13`, `0.2.14`, `0.2.15`, `0.2.16`, `0.2.17`, `0.2.18`, `0.2.19`, `1.0.0-rc1`, `1.0.0-rc2`, `1.0.0-rc3`, `1.0.0-rc4`, `1.0.0-rc5`, `1.0.0-rc6`, `1.0.0-rc7`, `1.0.0-rc8`, `1.0.0-rc9`, `1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.1.0`, `1.1.1-alpha1`, `1.1.1`, `1.1.2`, `1.1.3`, `1.1.4`, `1.1.5`, `1.2.0`, `1.2.1`, `1.2.2`]
1. `org.pgpainless:pgpainless-sop`  -> [`0.2.0-alpha5`, `0.2.0-alpha6`, `0.2.0-alpha7`, `0.2.0-alpha8`, `0.2.0-alpha9`, `0.2.0-alpha10`, `0.2.0-alpha11`, `0.2.0-alpha12`, `0.2.0`, `0.2.1`, `0.2.2`, `0.2.3`]
1. `org.pgpainless:sop-java-picocli`  -> [`0.2.4`, `0.2.5`, `0.2.6`, `0.2.7`, `0.2.8`, `0.2.9`, `0.2.10`, `0.2.11`, `0.2.12`, `0.2.13`, `0.2.14`, `0.2.15`, `0.2.16`, `0.2.17`, `0.2.18`, `0.2.19`, `1.0.0-rc1`, `1.0.0-rc2`, `1.0.0-rc3`, `1.0.0-rc4`, `1.0.0-rc5`, `1.0.0-rc6`, `1.0.0-rc7`, `1.0.0-rc8`, `1.0.0-rc9`, `1.0.0`, `1.1.0`, `1.2.0`, `1.2.1`, `1.2.2`, `1.2.3`]
1. `org.primefaces:primefaces-cli`  -> [`11.0.0-RC1`, `11.0.0-RC2`, `11.0.0`]
1. `tech.kronicle:gradle-version-logic`  -> [`0.1.5`]
1. `technology.dice.open:dice-where-downloader`  -> [`1.2.9`]
1. `xyz.ottr.lutra:lutra-cli`  -> [`0.6.9`, `0.6.10`]

## org.objectweb.asm

For example, at least 57 artifacts on Maven Central claim to be the module `org.objectweb.asm`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.objectweb.asm;`.

1. `cn.cyejing:dsync-dominate`  -> [`0.1.2`, `0.1.3`]
1. `cn.cyejing:dsync-example`  -> [`0.1.2`, `0.1.3`]
1. `com.att.ajsc:ajsc-runner`  -> [`3.0.8-oss`, `3.0.9-oss`, `3.0.10-oss`, `3.0.11-oss`]
1. `com.bmuschko:gradle-docker-plugin`  -> [`4.6.0`, `4.6.1`, `4.6.2`, `4.7.0`, `4.7.1`, `4.8.0`, `4.8.1`, `4.9.0`, `4.10.0`, `5.1.0`, `5.2.0`, `5.3.0`, `6.0.0`, `6.1.0`, `6.1.1`, `6.1.2`, `6.1.3`, `6.1.4`, `6.2.0`, `6.3.0`, `6.4.0`, `6.5.0`, `6.6.0`, `6.6.1`, `6.7.0`]
1. `com.codeborne:jvm2dts`  -> [`1.1.1`, `1.1.2`, `1.1.3`, `1.1.4`, `1.1.5`, `1.1.6`, `1.2.0`, `1.2.1`, `1.2.2`]
1. `com.datastax.junitpytest:pytest-gradle-plugin`  -> [`0.1`]
1. `com.diffplug.spotless:spotless-eclipse-groovy`  -> [`2.9.2`]
1. `com.exasol:parquet-io-java`  -> [`1.0.2`, `1.0.3`, `1.1.0`]
1. `com.github.collinalpert:expressions`  -> [`2.5`, `2.6.0`, `2.6.1`, `2.7.0`]
1. `com.github.collinalpert:jaque`  -> [`2.4.1`, `2.4.2`]
1. `com.github.collinalpert:java2db`  -> [`1.5.1`, `1.5.2`, `1.5.3`, `1.5.4`, `2.0`, `2.1`, `2.2`, `2.2.1`, `2.2.2`, `2.2.3`, `2.2.4`, `2.2.5`, `2.2.6`, `2.4`, `2.4.2`, `2.4.3`, `2.5`, `3.0`, `3.1`, `4.0.1`, `4.1`, `4.1.1`, `4.2`, `5.0`, `5.0.1`, `5.1.0`, `5.1.1`, `5.1.2`, `5.2`, `5.2.1`, `5.3.0`, `5.4.0`, `5.5.0`, `5.5.1`, `5.6.0`, `6.0.0`, `6.0.1`, `6.1.0`]
1. `com.github.collinalpert:lambda2sql`  -> [`1.5`, `1.6`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.8.1`, `1.8.2`, `1.8.3`, `1.8.4`, `1.8.5`, `2.0`, `2.1`, `2.1.1`, `2.1.2`, `2.1.3`, `2.1.4`, `2.2`, `2.2.1`, `2.2.2`, `2.3.0`, `2.4.0`, `2.5.0`]
1. `com.github.luxlang:lux-python`  -> [`0.6.1`, `0.6.2`, `0.6.3`, `0.6.4`, `0.6.5`]
1. `com.github.nawforce:uber-apex-jorje`  -> [`1.0.0`]
1. `com.github.roskart.dropwizard-jaxws:dropwizard-jaxws-example`  -> [`1.1.0`]
1. `com.github.tomakehurst:wiremock-jre8-standalone`  -> [`2.21.0`, `2.22.0`, `2.23.0`, `2.23.1`, `2.23.2`, `2.24.0`, `2.24.1`, `2.25.0`, `2.25.1`]
1. `com.github.tomakehurst:wiremock-standalone`  -> [`2.21.0`, `2.22.0`, `2.23.0`, `2.23.1`, `2.23.2`, `2.24.0`, `2.24.1`, `2.25.0`, `2.25.1`]
1. `com.google.gerrit:gerrit-acceptance-framework`  -> [`2.16-rc0`, `2.16-rc1`, `2.16-rc2`, `2.16-rc3`, `2.16`, `2.16.1`, `2.16.2`, `2.16.3`, `2.16.4`, `2.16.5`, `2.16.6`, `2.16.7`, `3.0.0-rc0`, `3.0.0-rc1`, `3.0.0-rc2`, `3.0.0-rc3`, `3.0.0`, `3.0.1`, `3.0.2`, `3.0.3`]
1. `com.google.gerrit:gerrit-plugin-api`  -> [`2.16-rc0`, `2.16-rc1`, `2.16-rc2`, `2.16-rc3`, `2.16`, `2.16.1`, `2.16.2`, `2.16.3`, `2.16.4`, `2.16.5`, `2.16.6`, `2.16.7`, `3.0.0-rc0`, `3.0.0-rc1`, `3.0.0-rc2`, `3.0.0-rc3`, `3.0.0`, `3.0.1`, `3.0.2`, `3.0.3`, `3.1.3`, `3.1.4`, `3.2.0-rc0`, `3.2.0-rc1`, `3.2.0-rc2`, `3.2.0-rc3`, `3.2.0-rc4`, `3.2.0`, `3.2.1`, `3.2.2`, `3.2.3`, `3.3.0-rc0`, `3.3.0-rc1`, `3.3.0-rc2`, `3.3.0-rc3`, `3.3.0-rc4`, `3.3.0-rc5`, `3.3.0-rc6`, `3.3.0-rc7`, `3.3.0`, `3.3.1`, `3.3.2`, `3.3.3`, `3.4.0-rc0`, `3.4.0-rc1`, `3.4.0-rc2`, `3.4.0-rc3`, `3.4.0-rc4`, `3.4.0-rc5`, `3.4.0`, `3.4.1`, `3.5.0-rc0`, `3.5.0-rc1`, `3.5.0-rc2`, `3.5.0-rc4`, `3.5.0`, `3.5.0.1`, `3.5.1`]
1. `com.graphaware.neo4j:graphaware-framework-embedded`  -> [`3.4.6.52`, `3.4.7.52`, `3.4.8.52`, `3.4.9.52`, `3.5.0.53-beta02`, `3.5.0.53-beta03`, `3.5.1.53`, `3.5.2.53`, `3.5.3.53`, `3.5.4.53`, `3.5.5.53`, `3.5.6.54`, `3.5.7.54`, `3.5.8.54`, `3.5.9.54`, `3.5.10.54`, `3.5.11.54`, `3.5.11.55`, `3.5.12.55`, `3.5.13.55`, `3.5.14.55`, `3.5.14.56`, `3.5.14.58`]
1. `com.heapanalytics.android:heap-android-gradle`  -> [`1.9.0`, `1.9.1`, `1.9.2-rc.1`, `1.9.2`, `1.9.3`, `1.9.4`, `1.10.0`, `1.10.1`, `1.10.2`, `1.10.3`]
1. `com.netflix.nebula:gradle-lint-plugin`  -> [`10.5.2`, `10.5.3`, `11.0.0`, `11.1.0`]
1. `com.newrelic.agent.android:class-rewriter`  -> [`6.2.0`, `6.2.1`, `6.3.0`, `6.3.1`, `6.4.0`, `6.4.1`, `6.5.0`]
1. `com.oracle.substratevm:svm`  -> [`19.2.0`, `19.2.0.1`, `19.2.1`]
1. `com.oradian.util:exit-denied`  -> [`0.1.0`]
1. `com.salesforceiq.augmenteddriver:AugmentedDriver`  -> [`1.10.1`]
1. `com.sap.cloud.s4hana.datamodel:odata-generator-cli`  -> [`2.3.1`, `2.4.1`, `2.4.2`, `2.5.0`]
1. `com.uber.nullaway:jar-infer-cli`  -> [`0.7.4`, `0.7.5`]
1. `com.vmlens:agent-runtime`  -> [`1.0.14`, `1.0.15`, `1.1.0`, `1.1.1`, `1.1.2`, `1.1.4`, `1.1.5`]
1. `com.vmlens:plugin.sync.bug`  -> [`1.1.1`, `1.1.2`, `1.1.4`, `1.1.5`]
1. `de.adorsys.keycloak:keycloak-clientregistration-provider`  -> [`1.5`, `1.6`, `1.7`, `1.7.1`, `1.8`, `1.9`, `1.10-RC1`, `1.10`, `1.11-RC1`, `1.11`]
1. `de.adorsys.multibanking:keycloak-custom-secret-provider`  -> [`2.2.3`]
1. `de.tud.sse:soot-infoflow`  -> [`2.8`, `2.9.0`]
1. `de.uni-hildesheim.sse.spassMeter:spass-meter-ant`  -> [`1.30`]
1. `de.uni-hildesheim.sse.spassMeter:spass-meter-ia`  -> [`1.30`]
1. `de.uni-hildesheim.sse.spassMeter:spass-meter`  -> [`1.30`]
1. `fi.evident.apina:apina-cli`  -> [`0.16.0`, `0.17.5`, `0.17.6`, `0.18.0`]
1. `fi.evident.apina:apina-core`  -> [`0.16.0`, `0.17.5`, `0.17.6`, `0.18.0`]
1. `io.ebean.tools:ebean-init`  -> [`1.6`, `1.7`, `1.8`, `1.9`, `1.10`, `1.11`, `1.12`]
1. `io.kestra.plugin:plugin-script-jython`  -> [`0.2.0`]
1. `io.quarkus:quarkus-cli`  -> [`1.6.0.Final`, `1.6.1.Final`, `1.7.0.CR1`, `1.7.0.CR2`, `1.7.0.Final`, `1.7.1.Final`]
1. `io.quarkus:quarkus-ide-launcher`  -> [`1.5.2.Final`, `1.6.0.Final`, `1.6.1.Final`, `1.7.0.CR1`, `1.7.0.CR2`, `1.7.0.Final`, `1.7.1.Final`]
1. `net.onedaybeard.artemis:artemis-odb-cli`  -> [`2.3.0`]
1. `net.onedaybeard.graftt:agent`  -> [`0.1.3`, `0.2.0`, `0.2.1`]
1. `org.checkerframework:checker`  -> [`3.10.0`, `3.11.0`]
1. `org.duracloud:synctoolui`  -> [`5.1.0`, `6.0.0`, `6.0.1`, `6.1.0`, `6.1.1`, `6.2.0`, `6.2.1`, `7.0.0`, `7.1.0`, `7.1.1`]
1. `org.glassfish.main.extras:glassfish-embedded-all`  -> [`6.1.0`, `6.2.0`, `6.2.1`]
1. `org.glassfish.main.extras:glassfish-embedded-nucleus`  -> [`6.1.0`, `6.2.0`, `6.2.1`, `6.2.2`, `6.2.3`, `7.0.0-M1`, `7.0.0-M2`, `7.0.0-M3`, `7.0.0-M4`]
1. `org.glassfish.main.extras:glassfish-embedded-web`  -> [`6.1.0`, `6.2.0`, `6.2.1`, `6.2.2`, `6.2.3`, `7.0.0-M1`, `7.0.0-M2`, `7.0.0-M3`, `7.0.0-M4`]
1. `org.graalvm.nativeimage:svm`  -> [`19.3.0`, `19.3.0.2`, `19.3.1`, `20.0.0`, `20.1.0`]
1. `org.netbeans.external:asm-7.2`  -> [`RELEASE113`]
1. `org.noear:solon.extend.jetty.jsp`  -> [`1.0.2`, `1.0.2.1`, `1.0.3`]
1. `org.ow2.asm:asm` 🧩 -> [`6.2.1`, `7.0-beta`, `7.0`, `7.1`, `7.2-beta`, `7.2`, `7.3.1`, `8.0`, `8.0.1`, `9.0-beta`, `9.0`, `9.1`, `9.2`, `9.3`]
1. `org.python:jython-standalone`  -> [`2.7.2b2`, `2.7.2b3`, `2.7.2rc1`, `2.7.2`]
1. `org.python:jython`  -> [`2.7.2b2`, `2.7.2b3`, `2.7.2rc1`, `2.7.2`]
1. `org.robotframework:robotframework`  -> [`3.2`, `3.2.1`, `3.2.2`, `4.0`, `4.0.1`, `4.0.3`, `4.1`]
1. `org.tomitribe.jkta:jkta`  -> [`0.4`, `0.5`, `0.6`, `0.7`]

## io.github.classgraph

For example, at least 50 artifacts on Maven Central claim to be the module `io.github.classgraph`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires io.github.classgraph;`.

1. `ch.exense.step.library:step-library-kw-monitoring-system`  -> [`1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `2021.08.18-ID174e3d1`]
1. `ch.exense.step.library:step-library-kw-step-client`  -> [`1.0.7`, `1.0.8`, `2021.08.18-ID174e3d1`]
1. `cloud.orbit:orbit-core`  -> [`1.12.0`]
1. `cloud.orbit:orbit-runtime`  -> [`1.12.0`]
1. `com.datarobot:datarobot-mlops`  -> [`8.0.6`, `8.0.7`]
1. `com.github.bogie-clj:playground`  -> [`0.1.1`]
1. `com.hazelcast.jet:hazelcast-jet`  -> [`4.1`, `4.1.1`, `4.2`, `4.3`, `4.4`, `4.5`, `4.5.1`, `4.5.2`, `4.5.3`]
1. `com.networknt:codegen-cli`  -> [`1.6.1`, `1.6.2`, `1.6.4`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.4`, `2.0.5`, `2.0.6`, `2.0.7`, `2.0.8`, `2.0.9`, `2.0.10`, `2.0.11`, `2.0.12`, `2.0.13`, `2.0.14`, `2.0.15`, `2.0.16`, `2.0.17`, `2.0.18`, `2.0.19`, `2.0.20`, `2.0.21`, `2.0.22`, `2.0.23`, `2.0.24`, `2.0.25`, `2.0.26`, `2.0.27`, `2.0.28`, `2.0.29`, `2.0.30`, `2.0.31`, `2.0.32`, `2.1.0`, `2.1.1`]
1. `com.networknt:oauth-key`  -> [`2.0.31`]
1. `com.purbon.kafka:julie-ops`  -> [`4.1.2`, `4.1.3`, `4.2.0`, `4.2.2`, `4.2.3`, `4.2.5`]
1. `com.teamscale:teamscale-jacoco-agent`  -> [`21.6.0`, `21.6.1`, `21.8.0`, `21.9.0`, `22.0.0`, `22.1.0`, `22.2.0`, `23.0.0`, `23.1.0`, `23.1.1`]
1. `com.telenav.kivakit:kivakit-service-server`  -> [`0.9.8-beta`, `1.0.0`]
1. `com.yahoo.elide:elide-blog-example`  -> [`4.5.12`, `4.5.13`, `4.5.14`, `4.5.15`, `4.5.16`, `4.6.0`, `4.6.1`, `4.6.2`, `4.6.3`, `4.6.4`, `4.6.5`, `4.6.6`, `4.6.7`, `4.6.8`, `4.6.9`, `4.6.10`, `4.6.11`, `4.7.0`]
1. `cz.o2.proxima:proxima-beam-io-pubsub`  -> [`0.4.0`, `0.5.0`, `0.5.1`, `0.6.0`, `0.6.0-jdk11`, `0.6.1`, `0.6.1-jdk11`, `0.7.0`, `0.7.0-jdk11`]
1. `de.fraunhofer.iosb.ilt.faaast.service:starter`  -> [`0.1.0`]
1. `io.cordite.braid:braid-corda`  -> [`5.0.0-RC01`, `5.0.0-RC02`, `5.0.0-RC03`, `5.0.0-RC04`, `5.0.0-RC05`, `5.0.0-RC07`, `5.0.0-RC08`, `5.0.0-RC09`, `5.0.0-RC10`, `5.0.0-RC11`, `5.0.0-RC15`, `5.0.0-RC16`]
1. `io.cordite.services:network-map-service`  -> [`0.4.5`, `0.5.2`]
1. `io.crysknife.legacy.ui.databinding:generator`  -> [`0.3`]
1. `io.crysknife.legacy.ui.navigation:generator`  -> [`0.3`]
1. `io.crysknife.legacy.ui:gwt-dom-generator`  -> [`0.3`]
1. `io.crysknife.ui.mutationobserver:generator`  -> [`0.3`]
1. `io.crysknife.ui.templates:generator`  -> [`0.3`]
1. `io.crysknife.ui.translation:generator`  -> [`0.3`]
1. `io.crysknife:crysknife-processor`  -> [`0.1`, `0.2`, `0.3`]
1. `io.crysknife:templates-generator`  -> [`0.1`, `0.2`]
1. `io.github.classgraph:classgraph` 🧩 -> [`4.0.7`, `4.1.0`, `4.1.1`, `4.1.2`, `4.1.3`, `4.1.4`, `4.1.5`, `4.1.6`, `4.1.7`, `4.2.0`, `4.2.1`, `4.2.2`, `4.2.3`, `4.2.4`, `4.2.5`, `4.2.6`, `4.2.7`, `4.2.8`, `4.2.9`, `4.2.10`, `4.2.11`, `4.2.12`, `4.3.0`, `4.3.1`, `4.4.0`, `4.4.1`, `4.4.2`, `4.4.3`, `4.4.5`, `4.4.7`, `4.4.8`, `4.4.9`, `4.4.10`, `4.4.11`, `4.4.12`, `4.6.8`, `4.6.9`, `4.6.10`, `4.6.11`, `4.6.12`, `4.6.13`, `4.6.14`, `4.6.16`, `4.6.18`, `4.6.19`, `4.6.20`, `4.6.21`, `4.6.22`, `4.6.23`, `4.6.24`, `4.6.25`, `4.6.26`, `4.6.27`, `4.6.28`, `4.6.29`, `4.6.30`, `4.6.31`, `4.6.32`, `4.8.0`, `4.8.1`, `4.8.2`, `4.8.3`, `4.8.4`, `4.8.5`, `4.8.6`, `4.8.7`, `4.8.8`, `4.8.9`, `4.8.10`, `4.8.11`, `4.8.12`, `4.8.13`, `4.8.14`, `4.8.15`, `4.8.16`, `4.8.17`, `4.8.19`, `4.8.20`, `4.8.21`, `4.8.22`, `4.8.23`, `4.8.24`, `4.8.25`, `4.8.26`, `4.8.27`, `4.8.28`, `4.8.29`, `4.8.30`, `4.8.31`, `4.8.32`, `4.8.33`, `4.8.34`, `4.8.35`, `4.8.36`, `4.8.37`, `4.8.38`, `4.8.39`, `4.8.40`, `4.8.41`, `4.8.42`, `4.8.43`, `4.8.44`, `4.8.45`, `4.8.46`, `4.8.47`, `4.8.48`, `4.8.49`, `4.8.50`, `4.8.51`, `4.8.52`, `4.8.53`, `4.8.54`, `4.8.55`, `4.8.56`, `4.8.57`, `4.8.58`, `4.8.59`, `4.8.60`, `4.8.61`, `4.8.62`, `4.8.63`, `4.8.64`, `4.8.65`, `4.8.66`, `4.8.67`, `4.8.68`, `4.8.69`, `4.8.70`, `4.8.71`, `4.8.72`, `4.8.73`, `4.8.74`, `4.8.75`, `4.8.76`, `4.8.77`, `4.8.78`, `4.8.79`, `4.8.80`, `4.8.81`, `4.8.82`, `4.8.83`, `4.8.84`, `4.8.85`, `4.8.86`, `4.8.87`, `4.8.88`, `4.8.89`, `4.8.90`, `4.8.92`, `4.8.93`, `4.8.94`, `4.8.95`, `4.8.96`, `4.8.97`, `4.8.98`, `4.8.100`, `4.8.101`, `4.8.102`, `4.8.103`, `4.8.104`, `4.8.105`, `4.8.106`, `4.8.107`, `4.8.108`, `4.8.109`, `4.8.110`, `4.8.111`, `4.8.112`, `4.8.113`, `4.8.114`, `4.8.115`, `4.8.116`, `4.8.117`, `4.8.118`, `4.8.119`, `4.8.120`, `4.8.121`, `4.8.122`, `4.8.123`, `4.8.124`, `4.8.125`, `4.8.126`, `4.8.127`, `4.8.128`, `4.8.129`, `4.8.130`, `4.8.131`, `4.8.132`, `4.8.133`, `4.8.134`, `4.8.135`, `4.8.136`, `4.8.137`, `4.8.138`, `4.8.139`, `4.8.140`, `4.8.141`, `4.8.143`, `4.8.144`, `4.8.145`, `4.8.146`]
1. `io.github.eisop:checker`  -> [`3.21.2-eisop1`, `3.21.3-eisop1`, `3.21.4-eisop1`, `3.22.0-eisop1`]
1. `io.github.it-gorillaz:one-lambda`  -> [`1.0.0`]
1. `io.github.shenbinglife:argsRunner`  -> [`1.0.0`]
1. `net.corda:corda-shell`  -> [`4.9`, `4.9.1`]
1. `net.corda:corda-tools-blob-inspector`  -> [`4.0`]
1. `net.corda:corda-tools-network-bootstrapper`  -> [`4.0`, `4.1`, `4.3`, `4.4`, `4.5`, `4.6`, `4.7`, `4.8`, `4.9`, `4.9.1`]
1. `net.serenity-bdd:serenity-cli`  -> [`3.1.17`, `3.1.18`, `3.1.20`, `3.2.0`, `3.2.1-RC1`]
1. `org.checkerframework:checker`  -> [`3.12.0`, `3.13.0`, `3.14.0`, `3.15.0`, `3.16.0`, `3.17.0`, `3.18.0`, `3.18.1`, `3.19.0`, `3.20.0`, `3.21.0`, `3.21.1`, `3.21.2`, `3.21.3`, `3.21.4`, `3.22.0`]
1. `org.eclipse.vorto:generator-lambda-executor`  -> [`1.0.0`]
1. `org.eclipse.vorto:generator-lambda-plugininfo`  -> [`1.0.0`]
1. `org.minijax:minijax-example-hello`  -> [`0.5.10`]
1. `org.minijax:minijax-example-minitwit`  -> [`0.5.10`]
1. `org.restheart:restheart`  -> [`5.0.0-RC2`, `5.0.0-RC3`, `5.0.0-RC4`, `5.0.0`, `5.0.1`, `5.1.0`, `5.1.1`, `5.1.2`, `5.1.3`, `5.1.4`, `5.1.5`, `5.1.6`, `5.1.7`, `5.2.0`, `5.3.0`, `5.3.1`, `5.3.2`, `5.3.3`, `5.3.4`, `5.3.5`, `6.0.0-RC1`, `6.0.0`, `6.0.1`, `6.0.2`, `6.0.3`, `6.0.4`, `6.0.5`, `6.1.0`]
1. `org.treblereel.gwt.gwtproject.i18n:gwt-i18n-processor`  -> [`202203291`]
1. `org.treblereel.gwt.gwtproject.validation:gwt-validation-processor`  -> [`202203291`]
1. `software.amazon.glue:jsonschema-kafkaconnect-converter`  -> [`1.1.0`, `1.1.1`, `1.1.2`, `1.1.3`, `1.1.4`, `1.1.5`, `1.1.6`, `1.1.7`, `1.1.8`]
1. `software.amazon.glue:schema-registry-kafkaconnect-converter`  -> [`1.1.0`, `1.1.1`, `1.1.2`, `1.1.3`, `1.1.4`, `1.1.5`, `1.1.6`, `1.1.7`, `1.1.8`]
1. `za.co.absa.spline.agent.spark:spark-2.2-spline-agent-bundle_2.11`  -> [`0.5.4`, `0.5.5`, `0.5.6`, `0.6.0`, `0.6.1`, `0.6.2`, `0.6.3`, `0.6.4`, `0.7.0`, `0.7.1`, `0.7.2`, `0.7.3`, `0.7.4`, `0.7.5`, `0.7.6`, `0.7.7`]
1. `za.co.absa.spline.agent.spark:spark-2.3-spline-agent-bundle_2.11`  -> [`0.5.4`, `0.5.5`, `0.5.6`, `0.6.0`, `0.6.1`, `0.6.2`, `0.6.3`, `0.6.4`, `0.7.0`, `0.7.1`, `0.7.2`, `0.7.3`, `0.7.4`, `0.7.5`, `0.7.6`, `0.7.7`]
1. `za.co.absa.spline.agent.spark:spark-2.4-spline-agent-bundle_2.11`  -> [`0.5.4`, `0.5.5`, `0.5.6`, `0.6.0`, `0.6.1`, `0.6.2`, `0.6.3`, `0.6.4`, `0.7.0`, `0.7.1`, `0.7.2`, `0.7.3`, `0.7.4`, `0.7.5`, `0.7.6`, `0.7.7`]
1. `za.co.absa.spline.agent.spark:spark-2.4-spline-agent-bundle_2.12`  -> [`0.5.4`, `0.5.5`, `0.5.6`, `0.6.0`, `0.6.1`, `0.6.2`, `0.6.3`, `0.6.4`, `0.7.0`, `0.7.1`, `0.7.2`, `0.7.3`, `0.7.4`, `0.7.6`, `0.7.7`]
1. `za.co.absa.spline.agent.spark:spark-3.0-spline-agent-bundle_2.12`  -> [`0.6.0`, `0.6.1`, `0.6.2`, `0.6.3`, `0.6.4`, `0.7.0`, `0.7.1`, `0.7.2`, `0.7.3`, `0.7.4`, `0.7.6`, `0.7.7`]
1. `za.co.absa.spline.agent.spark:spark-3.1-spline-agent-bundle_2.12`  -> [`0.6.1`, `0.6.2`, `0.6.3`, `0.6.4`, `0.7.0`, `0.7.1`, `0.7.2`, `0.7.3`, `0.7.4`, `0.7.6`, `0.7.7`]
1. `za.co.absa.spline.agent.spark:spark-3.2-spline-agent-bundle_2.12`  -> [`0.7.6`, `0.7.7`]

## com.fasterxml.jackson.annotation

For example, at least 46 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.annotation`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.annotation;`.

1. `com.aerospike:aerospike-spark_2.12`  -> [`3.3.0_spark3.1-allshaded`]
1. `com.codeborne:jvm2dts`  -> [`1.2.3`, `1.2.4`]
1. `com.daml:ledger-api-test-tool`  -> [`1.4.0-snapshot.20200722.4796.0.28ab504b`, `1.4.0-snapshot.20200722.4800.0.21a16eef`, `1.4.0-snapshot.20200724.4812.0.818a52b0`]
1. `com.exasol:parquet-io-java`  -> [`1.0.0`, `1.0.1`]
1. `com.fasterxml.jackson.core:jackson-annotations` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `com.free-now.sauron.plugins:dependency-checker`  -> [`0.0.32`, `0.0.33`, `0.0.34`, `0.0.35`, `0.0.36`, `0.0.38`, `0.0.39`, `0.0.40`, `0.0.41`, `0.0.42`, `0.0.43`, `0.0.45`, `0.0.46`, `0.0.47`]
1. `com.github.fpopic:bigquery-schema-select_2.13`  -> [`0.2`, `0.3`, `0.4`]
1. `com.github.wjw465150:easyfastjson`  -> [`2.11.4`]
1. `com.gu.play-secret-rotation:aws-parameterstore-lambda_2.12`  -> [`0.19`, `0.20`, `0.31`, `0.33`, `0.34`]
1. `com.gu.play-secret-rotation:aws-parameterstore-lambda_2.13`  -> [`0.19`, `0.20`, `0.31`, `0.33`, `0.34`]
1. `com.jwebmp.jackson.core:jackson-annotations`  -> [`0.63.0.54`, `0.65.0.1`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]
1. `com.jwebmp.jpms.jackson.core:jackson-annotations`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre11.jackson.core:jackson-annotations`  -> [`0.63.0.17`, `0.63.0.19`]
1. `com.liferay.portal:release.portal.api`  -> [`7.3.4-ga5`, `7.3.5-ga6`, `7.4.0-ga1`]
1. `com.vertica.spark:vertica-spark`  -> [`2.0.0-rc0`, `2.0.0-0`, `2.0.1-0`]
1. `com.wavefront:wavefront-opentracing-bundle-java`  -> [`1.2.0`, `1.2.1`]
1. `edu.byu.hbll.maven:executable-parent`  -> [`3.4.1`, `3.5.0`, `3.6.0`, `3.7.0`, `3.7.1`]
1. `io.github.drewlakee:discojx`  -> [`1.0.0`, `1.0.1`, `1.0.2`]
1. `io.github.edwardUL99:docker-sandbox`  -> [`0.3.0`, `0.4.0`, `0.4.1`]
1. `io.github.henrikbulldog:spark-org-anonymizer_2.12`  -> [`1.0.2`]
1. `io.gitlab.arturbosch.detekt:detekt-report-sarif`  -> [`1.15.0-RC1`, `1.15.0-RC2`, `1.15.0`, `1.16.0-RC1`, `1.16.0-RC2`, `1.16.0-RC3`, `1.16.0`]
1. `io.hdocdb:hdocdb`  -> [`1.0.0`, `1.0.1`]
1. `io.inugami.security:inugami_core_security_tools`  -> [`2.0.0`, `2.0.1`]
1. `io.mantisrx:mantis-connector-iceberg`  -> [`1.2.11`, `1.2.12`, `1.2.13`, `1.2.14`, `1.2.15`, `1.2.16`, `1.3.3`, `1.3.5`, `1.3.6`, `1.3.7`, `1.3.9`, `1.3.13`, `1.3.14`, `1.3.16`, `1.3.17`, `1.3.18`, `1.3.19`, `1.3.20`, `1.3.21`, `1.3.22`, `1.3.23`, `1.3.24`, `1.3.25`, `1.3.26`, `1.3.33`, `1.3.35`, `1.3.36`, `1.3.37`, `1.3.38`, `1.3.39`, `1.3.40`, `1.3.41`, `1.3.42`, `1.3.43`, `1.3.45`, `1.3.46`, `1.3.48`, `1.3.49`, `1.3.50`, `1.3.51`]
1. `io.mantisrx:mantis-publish-netty`  -> [`1.3.2`, `1.3.3`, `1.3.5`, `1.3.6`, `1.3.7`, `1.3.9`, `1.3.13`, `1.3.14`, `1.3.16`, `1.3.17`, `1.3.18`, `1.3.19`, `1.3.20`, `1.3.21`, `1.3.22`, `1.3.23`, `1.3.24`, `1.3.25`, `1.3.26`, `1.3.33`, `1.3.35`, `1.3.36`, `1.3.37`, `1.3.38`, `1.3.39`, `1.3.40`, `1.3.41`, `1.3.42`, `1.3.43`, `1.3.45`, `1.3.46`, `1.3.48`, `1.3.49`, `1.3.50`, `1.3.51`]
1. `io.mantisrx:mantis-shaded`  -> [`1.2.56`, `1.2.57`, `1.2.58`, `1.2.59`, `1.2.60`, `1.2.62`, `1.2.63`, `1.3.3`, `1.3.5`, `1.3.6`, `1.3.7`, `1.3.9`, `1.3.13`, `1.3.14`, `1.3.16`, `1.3.17`, `1.3.18`, `1.3.19`, `1.3.20`, `1.3.21`, `1.3.22`, `1.3.23`, `1.3.24`, `1.3.25`, `1.3.26`, `1.3.33`, `1.3.35`, `1.3.36`, `1.3.37`, `1.3.38`, `1.3.39`, `1.3.40`, `1.3.41`, `1.3.42`, `1.3.43`, `1.3.45`, `1.3.46`, `1.3.48`, `1.3.49`, `1.3.50`, `1.3.51`]
1. `org.apache.beam:beam-runners-flink-1.10-job-server`  -> [`2.29.0`, `2.30.0`]
1. `org.apache.beam:beam-runners-flink-1.11-job-server`  -> [`2.29.0`, `2.30.0`, `2.31.0`, `2.32.0`, `2.33.0`, `2.34.0`, `2.35.0`]
1. `org.apache.beam:beam-runners-flink-1.12-job-server`  -> [`2.29.0`, `2.30.0`, `2.31.0`, `2.32.0`, `2.33.0`, `2.34.0`, `2.35.0`]
1. `org.apache.beam:beam-runners-flink-1.13-job-server`  -> [`2.31.0`, `2.32.0`, `2.33.0`, `2.34.0`, `2.35.0`]
1. `org.apache.beam:beam-runners-flink-1.8-job-server`  -> [`2.29.0`]
1. `org.apache.beam:beam-runners-flink-1.9-job-server`  -> [`2.29.0`]
1. `org.apache.beam:beam-sdks-java-extensions-schemaio-expansion-service`  -> [`2.29.0`, `2.30.0`, `2.31.0`, `2.32.0`, `2.33.0`]
1. `org.apache.beam:beam-sdks-java-extensions-sql-expansion-service`  -> [`2.29.0`, `2.30.0`, `2.31.0`, `2.32.0`, `2.33.0`, `2.34.0`, `2.35.0`]
1. `org.apache.beam:beam-sdks-java-harness`  -> [`2.29.0`, `2.30.0`, `2.31.0`, `2.32.0`, `2.33.0`, `2.34.0`, `2.35.0`]
1. `org.apache.beam:beam-sdks-java-io-kinesis-expansion-service`  -> [`2.29.0`, `2.30.0`, `2.31.0`, `2.32.0`, `2.33.0`]
1. `org.apache.flink:statefun-flink-distribution`  -> [`3.2.0`]
1. `org.apache.hudi:hudi-timeline-server-bundle`  -> [`0.8.0`, `0.9.0`, `0.10.0`]
1. `org.apache.ignite:ignite-yarn`  -> [`2.13.0`]
1. `org.apache.jackrabbit:oak-run`  -> [`1.22.0`, `1.24.0`, `1.26.0`, `1.32.0`, `1.34.0`, `1.36`, `1.38.0`, `1.40.0`, `1.42.0`]
1. `org.apache.sedona:sedona-python-adapter-2.4_2.11`  -> [`1.0.0-incubating`, `1.0.1-incubating`, `1.1.0-incubating`, `1.1.1-incubating`, `1.2.0-incubating`]
1. `org.apache.sedona:sedona-python-adapter-2.4_2.12`  -> [`1.0.0-incubating`, `1.0.1-incubating`, `1.1.0-incubating`, `1.1.1-incubating`, `1.2.0-incubating`]
1. `org.apache.sedona:sedona-python-adapter-3.0_2.12`  -> [`1.0.0-incubating`, `1.0.1-incubating`, `1.1.0-incubating`, `1.1.1-incubating`, `1.2.0-incubating`]
1. `org.commonjava.maven.ext:pom-manipulation-cli`  -> [`3.8`, `3.8.1`, `3.8.2`, `3.8.3`]
1. `org.neo4j:neo4j-connector-apache-spark_2.11_test-support`  -> [`4.0.2`, `4.1.0`, `4.1.1`, `4.1.2`]
1. `org.neo4j:neo4j-connector-apache-spark_2.12_test-support`  -> [`4.0.2`, `4.1.0`, `4.1.1`, `4.1.2`]

## com.fasterxml.jackson.module.jaxb

For example, at least 42 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.module.jaxb`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.module.jaxb;`.

1. `co.luminositylabs.payara.arquillian:payara-container-common`  -> [`2.4.5-ll-20211004.01`]
1. `com.azure.cosmos.spark:azure-cosmos-spark_3-1_2-12`  -> [`4.0.0-beta.2`, `4.0.0-beta.3`, `4.0.0`, `4.1.0`, `4.2.0`, `4.2.1-beta.1`, `4.3.0`, `4.3.1`, `4.4.0-beta.1`, `4.4.0`, `4.4.1`, `4.4.2`]
1. `com.fasterxml.jackson.module:jackson-module-jaxb-annotations` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `com.github.containersolutions:mysql-schema-sample`  -> [`1.0.0`, `1.1.0`, `1.2.0`, `1.2.1`, `1.2.2`]
1. `com.github.containersolutions:webserver-sample`  -> [`1.0.0`, `1.1.0`, `1.2.0`, `1.2.1`, `1.2.2`]
1. `com.guicedee.services:jackson-module-jaxb-annotations`  -> [`1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`]
1. `com.icegreen:greenmail-standalone`  -> [`2.0.0-alpha-2`]
1. `com.sap.cloud.sdk.datamodel:odata-v4-generator-cli`  -> [`3.36.0`, `3.37.0`, `3.38.0`, `3.39.0`, `3.40.0`, `3.41.0`, `3.42.0`, `3.43.0`, `3.44.1`, `3.45.0`, `3.46.0`, `3.47.0`, `3.48.0`, `3.49.0`, `3.50.0`]
1. `com.sonatype.clm:clm-maven-plugin`  -> [`2.21.0-01`, `2.22.0-01`, `2.22.1-01`, `2.23.0-01`, `2.24.0-01`, `2.24.1-01`, `2.25.0-01`, `2.26.0-01`, `2.27.0-01`, `2.28.0-01`, `2.29.0-01`, `2.30.0-01`, `2.30.1-01`, `2.30.2-01`, `2.30.3-01`, `2.30.4-01`, `2.30.5-01`]
1. `com.sonatype.nexus:nexus-platform-api`  -> [`3.35`, `3.36`, `3.37`, `3.39.1-01`, `3.40.0-01`, `3.41.0-01`, `3.41.1-01`, `3.42.0-01`, `3.43.0-01`, `3.44.0-01`, `3.44.1-01`, `3.44.2-02`, `3.44.3-01`, `3.44.4-01`, `3.44.5-01`, `3.44.6-03`, `3.44.7-01`, `3.45.0-01`, `3.46.0-01`, `3.47.0-01`, `3.48.0-01`, `3.48.1-01`]
1. `com.wizzdi:flexicore-territories-service`  -> [`4.0.0`, `4.0.1`]
1. `com.yahoo.athenz:athenz-zts-java-client`  -> [`1.10.16`, `1.10.17`, `1.10.18`, `1.10.19`, `1.10.20`, `1.10.21`, `1.10.22`, `1.10.23`, `1.10.24`, `1.10.25`, `1.10.26`, `1.10.27`, `1.10.28`, `1.10.29`, `1.10.30`, `1.10.31`, `1.10.32`, `1.10.33`, `1.10.34`, `1.10.35`, `1.10.36`, `1.10.37`, `1.10.38`, `1.10.39`, `1.10.40`, `1.10.41`, `1.10.42`, `1.10.43`, `1.10.44`, `1.10.45`, `1.10.46`, `1.10.47`, `1.10.48`, `1.10.49`, `1.10.50`, `1.10.51`, `1.10.52`, `1.10.53`, `1.10.54`]
1. `com.yahoo.vespa:vespa-hadoop`  -> [`7.356.23`, `7.358.44`, `7.359.24`, `7.360.24`, `7.361.22`, `7.362.70`, `7.363.17`, `7.364.19`, `7.365.20`, `7.366.33`, `7.367.19`, `7.368.3`, `7.369.27`, `7.371.20`, `7.372.13`, `7.373.22`, `7.374.52`, `7.375.22`, `7.376.25`, `7.378.53`, `7.379.1`, `7.380.25`, `7.381.20`, `7.382.45`, `7.383.13`, `7.384.43`, `7.385.3`, `7.386.28`, `7.387.80`, `7.388.28`, `7.389.1`, `7.390.64`, `7.391.28`, `7.393.56`, `7.394.21`, `7.396.22`, `7.397.65`, `7.398.17`, `7.401.18`, `7.403.18`, `7.404.59`, `7.405.22`, `7.406.26`, `7.407.45`, `7.411.24`, `7.413.25`, `7.414.19`, `7.416.18`, `7.417.20`, `7.418.23`, `7.419.22`, `7.420.21`, `7.421.25`, `7.422.63`, `7.423.37`, `7.424.27`, `7.425.42`, `7.426.23`, `7.433.11`, `7.434.10`, `7.435.15`, `7.436.31`, `7.437.7`, `7.438.16`, `7.439.3`, `7.440.12`, `7.441.3`, `7.442.7`, `7.444.18`, `7.446.9`, `7.447.10`, `7.448.16`, `7.449.21`, `7.450.12`, `7.451.27`, `7.452.11`, `7.455.43`, `7.456.11`, `7.457.52`, `7.458.20`, `7.460.23`, `7.462.20`, `7.463.15`, `7.464.41`, `7.465.17`, `7.466.3`, `7.469.18`, `7.470.24`, `7.472.1`, `7.473.17`, `7.475.17`, `7.476.1`, `7.477.12`, `7.479.3`, `7.480.66`, `7.481.18`, `7.482.13`, `7.483.19`, `7.484.47`, `7.485.19`, `7.487.27`, `7.488.67`, `7.489.25`, `7.490.17`, `7.492.78`, `7.493.25`, `7.495.22`, `7.496.44`, `7.499.15`, `7.500.40`, `7.501.17`, `7.502.22`, `7.503.19`, `7.505.17`, `7.507.96`, `7.508.20`, `7.509.14`, `7.510.36`, `7.511.3`, `7.512.7`, `7.513.4`, `7.514.59`, `7.515.19`, `7.517.18`, `7.518.53`, `7.519.16`, `7.520.3`, `7.522.16`, `7.523.17`, `7.524.43`, `7.525.28`, `7.526.8`, `7.527.20`, `7.528.38`, `7.529.2`, `7.531.17`, `7.532.27`, `7.533.16`, `7.534.29`, `7.536.19`, `7.537.15`, `7.538.1`]
1. `fish.payara.arquillian:payara-container-common`  -> [`2.4.5`]
1. `io.kestra.plugin:plugin-serdes`  -> [`0.2.0`, `0.2.1`, `0.2.2`, `0.2.3`, `0.2.4`, `0.2.5`, `0.2.6`, `0.2.7`, `0.2.8`, `0.3.0`, `0.3.1`, `0.4.0`, `0.4.1`]
1. `io.streamnative.connectors:flink-sql-connector-pulsar`  -> [`1.15.0.0-rc1`, `1.15.0-develop-rc1`]
1. `io.streamnative.connectors:pulsar-flink-sql-connector_2.11`  -> [`1.13.1.0`, `1.13.1.1`, `1.13.1.2`, `1.13.1.3`, `1.13.1.4`, `1.13.1.5-rc1`, `1.13.1.5-rc2`, `1.13.1.5-rc3`, `1.14.3.0-rc9`, `1.14.3.0-rc10`, `1.14.3.0-rc11`, `1.14.3.0-rc12`, `1.14.3.0-rc13`, `1.14.3.0-rc14`, `1.14.3.0-rc15`, `1.14.3.0`, `1.14.3.1-rc4`, `1.14.3.1-rc5`, `1.14.3.1`, `1.14.3.2-rc1`, `1.14.3.2-rc2`, `1.14.3.2-rc3`, `1.14.3.2-rc4`, `1.14.3.2-rc5`]
1. `io.streamnative.connectors:pulsar-flink-sql-connector_2.12`  -> [`1.13.1.0`, `1.13.1.1`, `1.13.1.2`, `1.13.1.3`, `1.13.1.4`, `1.13.1.5-rc1`, `1.13.1.5-rc2`, `1.13.1.5-rc3`, `1.13.6.0-rc2`, `1.13.6.1-rc1`, `1.13.6.1-rc2`, `1.13.6.1-rc3`, `1.13.6.1-rc4`, `1.13.6.1-rc6`, `1.13.6.1-rc7`, `1.14.3.1-rc5`, `1.14.3.1`, `1.14.3.2-rc1`, `1.14.3.2-rc2`, `1.14.3.2-rc3`, `1.14.3.2-rc4`, `1.14.3.2-rc5`]
1. `io.streamnative:flink-sql-connector-pulsar`  -> [`1.15.0.0-rc1`]
1. `io.streamnative:pulsar-broker-shaded`  -> [`2.8.0-rc-202106022226`, `2.8.0-rc-202106061908`, `2.8.0-rc-202106062208`, `2.8.0-rc-202106071011`, `2.8.0-rc-202106071430`, `2.8.0-rc-202106091215`, `2.9.0-rc-202106092205`, `2.9.0-rc-202106122205`, `2.9.0-rc-202106132205`, `2.9.0-rc-202106142205`, `2.9.0-rc-202106161005`, `2.9.0-rc-202106162205`, `2.9.0-rc-202106191455`, `2.9.0-rc-202106192205`, `2.9.0-rc-202106201258`, `2.9.0-rc-202106202206`, `2.9.0-rc-202106222205`, `2.9.0-rc-202106232205`, `2.9.0-rc-202106242205`, `2.9.0-rc-202106262205`, `2.9.0-rc-202106282205`, `2.9.0-rc-202106292205`, `2.9.0-rc-202106302205`, `2.9.0-rc-202107022206`, `2.9.0-rc-202107030819`, `2.9.0-rc-202107072205`, `2.9.0-rc-202107102205`, `2.9.0-rc-202107112205`, `2.9.0-rc-202107152205`, `2.9.0-rc-202107162205`, `2.9.0-rc-202107172205`, `2.9.0-rc-202107192205`, `2.9.0-rc-202107212205`, `2.9.0-rc-202107222205`, `2.9.0-rc-202107231254`, `2.9.0.0-rc-202107231935`, `2.9.0-rc-202107242205`, `2.9.0-rc-202107262205`, `2.9.0-rc-202107272205`, `2.9.0-rc-202107282205`, `2.9.0-rc-202107292205`, `2.9.0-rc-202107312205`, `2.9.0-rc-202108011016`, `2.9.0-rc-202108011108`, `2.9.0-rc-202108012205`, `2.9.0-rc-202108022205`, `2.9.0-rc-202108032205`, `2.9.0-rc-202108042210`, `2.9.0-rc-202108062205`, `2.9.0-rc-202108071018`, `2.9.0-rc-202108072205`, `2.9.0-rc-202108081041`, `2.9.0-rc-202108082205`, `2.9.0-rc-202108100946`, `2.9.0-rc-202108102032`, `2.9.0-rc-202108110849`, `2.9.0-rc-202108111625`, `2.9.0-rc-202108130847`, `2.9.0-rc-202108131143`, `2.9.0-rc-202108131436`, `2.9.0-rc-202108132205`, `2.9.0-rc-202108152205`, `2.9.0-rc-202108172205`, `2.9.0-rc-202108182205`, `2.9.0-rc-202108202021`, `2.9.0-rc-202108202205`, `2.9.0-rc-202108232206`, `2.9.0-rc-202108242206`, `2.9.0-rc-202108262205`, `2.9.0-rc-202108272205`, `2.9.0-rc-202108292205`, `2.9.0-rc-202108302210`, `2.9.0-rc-202109012205`, `2.9.0-rc-202109022206`, `2.9.0-rc-202109042205`, `2.9.0-rc-202109052205`, `2.9.0-rc-202109072205`, `2.9.0-rc-202109112205`, `2.9.0-rc-202109122205`, `2.9.0-rc-202109132205`, `2.9.0-rc-202109142205`, `2.9.0-rc-202109152205`, `2.9.0-rc-202109162205`, `2.9.0-rc-202109172205`, `2.9.0-rc-202109192205`, `2.9.0-rc-202109212205`, `2.9.0-rc-202109241100`, `2.9.0-rc-202109242205`, `2.9.0-rc-202109252205`, `2.9.0-rc-202109262205`, `2.9.0-rc-202109291558`, `2.9.0-rc-202109292205`, `2.9.0-rc-202109301601`, `2.9.0-rc-202109302205`, `2.9.0-rc-202110012205`, `2.9.0-rc-202110022205`, `2.9.0-rc-202110032206`, `2.9.0-rc-202110042205`, `2.9.0-rc-20211005153744`, `2.9.0-rc-20211006034704`, `2.9.0-rc-20211006043034`, `2.9.0-rc-20211006044313`, `2.9.0-rc-20211012061032`, `2.10.0-rc-202110192205`, `2.10.0-rc-202110202205`, `2.10.0-rc-202110212205`, `2.10.0-rc-202110222206`, `2.10.0-rc-202110232205`, `2.10.0-rc-202110242205`, `2.10.0-rc-202110252206`, `2.10.0-rc-202110262205`, `2.10.0-rc-202110272205`, `2.10.0-rc-202110282205`, `2.10.0-rc-202110292205`, `2.10.0-rc-202110302205`, `2.10.0-rc-202110312205`, `2.10.0-rc-202111012205`, `2.10.0-rc-202111022205`, `2.10.0-rc-202111042205`, `2.10.0-rc-202111052205`, `2.10.0-rc-202111062205`, `2.10.0-rc-202111072205`, `2.10.0-rc-202111082207`, `2.10.0-rc-202111092206`, `2.10.0-rc-202111102205`, `2.10.0-rc-202111112205`, `2.10.0-rc-202111122205`, `2.10.0-rc-202111132206`, `2.10.0-rc-202111142205`, `2.10.0-rc-202111152210`, `2.10.0-rc-202111162205`, `2.10.0-rc-202111172205`, `2.10.0-rc-202111182205`, `2.10.0-rc-202111192205`, `2.10.0-rc-202111202206`, `2.10.0-rc-20211121082026`, `2.10.0-rc-2021121511380612`]
1. `io.streamnative:pulsar-client-admin`  -> [`2.8.0-rc-202106022226`, `2.8.0-rc-202106061908`, `2.8.0-rc-202106062208`, `2.8.0-rc-202106071011`, `2.8.0-rc-202106071430`, `2.8.0-rc-202106091215`, `2.9.0-rc-202106092205`, `2.9.0-rc-202106122205`, `2.9.0-rc-202106132205`, `2.9.0-rc-202106142205`, `2.9.0-rc-202106161005`, `2.9.0-rc-202106162205`, `2.9.0-rc-202106191455`, `2.9.0-rc-202106192205`, `2.9.0-rc-202106201258`, `2.9.0-rc-202106202206`, `2.9.0-rc-202106222205`, `2.9.0-rc-202106232205`, `2.9.0-rc-202106242205`, `2.9.0-rc-202106262205`, `2.9.0-rc-202106282205`, `2.9.0-rc-202106292205`, `2.9.0-rc-202106302205`, `2.9.0-rc-202107022206`, `2.9.0-rc-202107030819`, `2.9.0-rc-202107072205`, `2.9.0-rc-202107102205`, `2.9.0-rc-202107112205`, `2.9.0-rc-202107152205`, `2.9.0-rc-202107162205`, `2.9.0-rc-202107172205`, `2.9.0-rc-202107192205`, `2.9.0-rc-202107212205`, `2.9.0-rc-202107222205`, `2.9.0-rc-202107231254`, `2.9.0.0-rc-202107231935`, `2.9.0-rc-202107242205`, `2.9.0-rc-202107262205`, `2.9.0-rc-202107272205`, `2.9.0-rc-202107282205`, `2.9.0-rc-202107292205`, `2.9.0-rc-202107312205`, `2.9.0-rc-202108011016`, `2.9.0-rc-202108011108`, `2.9.0-rc-202108012205`, `2.9.0-rc-202108022205`, `2.9.0-rc-202108032205`, `2.9.0-rc-202108042210`, `2.9.0-rc-202108062205`, `2.9.0-rc-202108071018`, `2.9.0-rc-202108072205`, `2.9.0-rc-202108081041`, `2.9.0-rc-202108082205`, `2.9.0-rc-202108100946`, `2.9.0-rc-202108102032`, `2.9.0-rc-202108110849`, `2.9.0-rc-202108111625`, `2.9.0-rc-202108130847`, `2.9.0-rc-202108131143`, `2.9.0-rc-202108131436`, `2.9.0-rc-202108132205`, `2.9.0-rc-202108152205`, `2.9.0-rc-202108172205`, `2.9.0-rc-202108182205`, `2.9.0-rc-202108202021`, `2.9.0-rc-202108202205`, `2.9.0-rc-202108232206`, `2.9.0-rc-202108242206`, `2.9.0-rc-202108262205`, `2.9.0-rc-202108272205`, `2.9.0-rc-202108292205`, `2.9.0-rc-202108302210`, `2.9.0-rc-202109012205`, `2.9.0-rc-202109022206`, `2.9.0-rc-202109042205`, `2.9.0-rc-202109052205`, `2.9.0-rc-202109072205`, `2.9.0-rc-202109112205`, `2.9.0-rc-202109122205`, `2.9.0-rc-202109132205`, `2.9.0-rc-202109142205`, `2.9.0-rc-202109152205`, `2.9.0-rc-202109162205`, `2.9.0-rc-202109172205`, `2.9.0-rc-202109192205`, `2.9.0-rc-202109212205`, `2.9.0-rc-202109241100`, `2.9.0-rc-202109242205`, `2.9.0-rc-202109252205`, `2.9.0-rc-202109262205`, `2.9.0-rc-202109291558`, `2.9.0-rc-202109292205`, `2.9.0-rc-202109301601`, `2.9.0-rc-202109302205`, `2.9.0-rc-202110012205`, `2.9.0-rc-202110022205`, `2.9.0-rc-202110032206`, `2.9.0-rc-202110042205`, `2.9.0-rc-20211005153744`, `2.9.0-rc-20211006034704`, `2.9.0-rc-20211006043034`, `2.9.0-rc-20211006044313`, `2.9.0-rc-20211012061032`, `2.10.0-rc-202110192205`, `2.10.0-rc-202110202205`, `2.10.0-rc-202110212205`, `2.10.0-rc-202110222206`, `2.10.0-rc-202110232205`, `2.10.0-rc-202110242205`, `2.10.0-rc-202110252206`, `2.10.0-rc-202110262205`, `2.10.0-rc-202110272205`, `2.10.0-rc-202110282205`, `2.10.0-rc-202110292205`, `2.10.0-rc-202110302205`, `2.10.0-rc-202110312205`, `2.10.0-rc-202111012205`, `2.10.0-rc-202111022205`, `2.10.0-rc-202111042205`, `2.10.0-rc-202111052205`, `2.10.0-rc-202111062205`, `2.10.0-rc-202111072205`, `2.10.0-rc-202111082207`, `2.10.0-rc-202111092206`, `2.10.0-rc-202111102205`, `2.10.0-rc-202111112205`, `2.10.0-rc-202111122205`, `2.10.0-rc-202111132206`, `2.10.0-rc-202111142205`, `2.10.0-rc-202111152210`, `2.10.0-rc-202111162205`, `2.10.0-rc-202111172205`, `2.10.0-rc-202111182205`, `2.10.0-rc-202111192205`, `2.10.0-rc-202111202206`, `2.10.0-rc-20211121082026`, `2.10.0-rc-2021121511380612`]
1. `io.streamnative:pulsar-client-all`  -> [`2.8.0-rc-202106022226`, `2.8.0-rc-202106061908`, `2.8.0-rc-202106062208`, `2.8.0-rc-202106071011`, `2.8.0-rc-202106071430`, `2.8.0-rc-202106091215`, `2.9.0-rc-202106092205`, `2.9.0-rc-202106122205`, `2.9.0-rc-202106132205`, `2.9.0-rc-202106142205`, `2.9.0-rc-202106161005`, `2.9.0-rc-202106162205`, `2.9.0-rc-202106191455`, `2.9.0-rc-202106192205`, `2.9.0-rc-202106201258`, `2.9.0-rc-202106202206`, `2.9.0-rc-202106222205`, `2.9.0-rc-202106232205`, `2.9.0-rc-202106242205`, `2.9.0-rc-202106262205`, `2.9.0-rc-202106282205`, `2.9.0-rc-202106292205`, `2.9.0-rc-202106302205`, `2.9.0-rc-202107022206`, `2.9.0-rc-202107030819`, `2.9.0-rc-202107072205`, `2.9.0-rc-202107102205`, `2.9.0-rc-202107112205`, `2.9.0-rc-202107152205`, `2.9.0-rc-202107162205`, `2.9.0-rc-202107172205`, `2.9.0-rc-202107192205`, `2.9.0-rc-202107212205`, `2.9.0-rc-202107222205`, `2.9.0-rc-202107231254`, `2.9.0.0-rc-202107231935`, `2.9.0-rc-202107242205`, `2.9.0-rc-202107262205`, `2.9.0-rc-202107272205`, `2.9.0-rc-202107282205`, `2.9.0-rc-202107292205`, `2.9.0-rc-202107312205`, `2.9.0-rc-202108011016`, `2.9.0-rc-202108011108`, `2.9.0-rc-202108012205`, `2.9.0-rc-202108022205`, `2.9.0-rc-202108032205`, `2.9.0-rc-202108042210`, `2.9.0-rc-202108062205`, `2.9.0-rc-202108071018`, `2.9.0-rc-202108072205`, `2.9.0-rc-202108081041`, `2.9.0-rc-202108082205`, `2.9.0-rc-202108100946`, `2.9.0-rc-202108102032`, `2.9.0-rc-202108110849`, `2.9.0-rc-202108111625`, `2.9.0-rc-202108130847`, `2.9.0-rc-202108131143`, `2.9.0-rc-202108131436`, `2.9.0-rc-202108132205`, `2.9.0-rc-202108152205`, `2.9.0-rc-202108172205`, `2.9.0-rc-202108182205`, `2.9.0-rc-202108202021`, `2.9.0-rc-202108202205`, `2.9.0-rc-202108232206`, `2.9.0-rc-202108242206`, `2.9.0-rc-202108262205`, `2.9.0-rc-202108272205`, `2.9.0-rc-202108292205`, `2.9.0-rc-202108302210`, `2.9.0-rc-202109012205`, `2.9.0-rc-202109022206`, `2.9.0-rc-202109042205`, `2.9.0-rc-202109052205`, `2.9.0-rc-202109072205`, `2.9.0-rc-202109112205`, `2.9.0-rc-202109122205`, `2.9.0-rc-202109132205`, `2.9.0-rc-202109142205`, `2.9.0-rc-202109152205`, `2.9.0-rc-202109162205`, `2.9.0-rc-202109172205`, `2.9.0-rc-202109192205`, `2.9.0-rc-202109212205`, `2.9.0-rc-202109241100`, `2.9.0-rc-202109242205`, `2.9.0-rc-202109252205`, `2.9.0-rc-202109262205`, `2.9.0-rc-202109291558`, `2.9.0-rc-202109292205`, `2.9.0-rc-202109301601`, `2.9.0-rc-202109302205`, `2.9.0-rc-202110012205`, `2.9.0-rc-202110022205`, `2.9.0-rc-202110032206`, `2.9.0-rc-202110042205`, `2.9.0-rc-20211005153744`, `2.9.0-rc-20211006034704`, `2.9.0-rc-20211006043034`, `2.9.0-rc-20211006044313`, `2.9.0-rc-20211012061032`, `2.10.0-rc-202110192205`, `2.10.0-rc-202110202205`, `2.10.0-rc-202110212205`, `2.10.0-rc-202110222206`, `2.10.0-rc-202110232205`, `2.10.0-rc-202110242205`, `2.10.0-rc-202110252206`, `2.10.0-rc-202110262205`, `2.10.0-rc-202110272205`, `2.10.0-rc-202110282205`, `2.10.0-rc-202110292205`, `2.10.0-rc-202110302205`, `2.10.0-rc-202110312205`, `2.10.0-rc-202111012205`, `2.10.0-rc-202111022205`, `2.10.0-rc-202111042205`, `2.10.0-rc-202111052205`, `2.10.0-rc-202111062205`, `2.10.0-rc-202111072205`, `2.10.0-rc-202111082207`, `2.10.0-rc-202111092206`, `2.10.0-rc-202111102205`, `2.10.0-rc-202111112205`, `2.10.0-rc-202111122205`, `2.10.0-rc-202111132206`, `2.10.0-rc-202111142205`, `2.10.0-rc-202111152210`, `2.10.0-rc-202111162205`, `2.10.0-rc-202111172205`, `2.10.0-rc-202111182205`, `2.10.0-rc-202111192205`, `2.10.0-rc-202111202206`, `2.10.0-rc-20211121082026`, `2.10.0-rc-2021121511380612`]
1. `org.apache.flink:flink-sql-connector-pulsar`  -> [`1.15.0`]
1. `org.apache.inlong:sort-connectors`  -> [`1.0.0-incubating`]
1. `org.apache.inlong:sort-core`  -> [`0.12.0-incubating`, `1.0.0-incubating`]
1. `org.apache.inlong:sort-dist`  -> [`0.12.0-incubating`, `1.0.0-incubating`, `1.1.0-incubating`]
1. `org.apache.inlong:sort-single-tenant`  -> [`1.0.0-incubating`, `1.1.0-incubating`]
1. `org.apache.pulsar:pulsar-broker-shaded`  -> [`2.8.0`, `2.8.1`, `2.9.0`, `2.9.1`, `2.9.2`, `2.10.0`]
1. `org.apache.pulsar:pulsar-client-admin`  -> [`2.8.0`, `2.8.1`, `2.9.0`, `2.9.1`, `2.9.2`, `2.10.0`]
1. `org.apache.pulsar:pulsar-client-all`  -> [`2.8.0`, `2.8.1`, `2.9.0`, `2.9.1`, `2.9.2`, `2.10.0`]
1. `org.glassfish.main.admingui:jackson-module-jaxb-annotations`  -> [`6.0.0-M1`, `6.0.0-RC2`, `6.0.0-RC3`, `6.0.0-RC4`, `6.0.0`, `6.1.0`, `6.2.0`]
1. `org.kill-bill.billing.plugin.java:analytics-plugin`  -> [`7.1.1`, `7.2.0`, `7.2.1`, `7.2.2`, `7.2.3`, `7.2.4`, `7.2.5`, `7.2.6`]
1. `org.kill-bill.billing.plugin.java:avatax-plugin`  -> [`0.8.2`, `0.8.3`, `0.8.4`]
1. `org.kill-bill.billing.plugin.java:deposit-plugin`  -> [`0.0.1`, `0.0.2`]
1. `org.kill-bill.billing.plugin.java:killbill-email-notifications-plugin`  -> [`0.7.0`, `0.7.1`, `0.7.2`]
1. `org.kill-bill.billing.plugin.java:stripe-plugin`  -> [`7.3.0`, `7.3.1`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-kpm`  -> [`0.40.5`, `0.40.6`, `0.40.7`, `0.40.8`, `0.40.9`, `0.40.10`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-logger`  -> [`0.40.5`, `0.40.6`, `0.40.7`, `0.40.8`, `0.40.9`, `0.40.10`]
1. `org.omnifaces.arquillian:glassfish-container-common`  -> [`1.0`]
1. `org.sonatype.gradle.plugins:scan-gradle-plugin`  -> [`2.0.11`, `2.0.12`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`, `2.2.3`, `2.3.0`]
1. `org.wso2.am.choreo.connect:org.wso2.choreo.connect.enforcer`  -> [`1.0.0-m3`, `1.0.0`]
1. `org.wso2.choreo.connect:org.wso2.choreo.connect.enforcer`  -> [`1.0.0`, `1.1.0-m4`, `1.1.0`]

## org.bouncycastle.pkix

For example, at least 36 artifacts on Maven Central claim to be the module `org.bouncycastle.pkix`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.bouncycastle.pkix;`.

1. `com.datastax.oss:pulsar-jms-all`  -> [`1.0.0-ALPHA`, `1.0.0`, `1.1.0`, `1.2.0`, `1.2.1`, `1.2.2`, `1.3.0`]
1. `com.foilen:foilen-infra-plugins-core`  -> [`0.22.0`]
1. `com.guicedee.services:bouncycastle`  -> [`1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.0.3-jre17-rc1`, `1.2.1.1-jre17`, `1.2.1.2-jre17`, `1.2.2.1`, `1.2.2.1-jre17`]
1. `com.intuit.karate:karate-core`  -> [`1.2.0.RC2`, `1.2.0.RC3`, `1.2.0.RC4`]
1. `com.linecorp.armeria:armeria`  -> [`1.10.0`, `1.11.0`, `1.12.0`, `1.13.0`, `1.13.1`, `1.13.2`, `1.13.3`, `1.13.4`, `1.14.0`, `1.14.1`, `1.15.0`, `1.16.0`]
1. `com.vesoft:nebula-algorithm`  -> [`2.6.0`, `2.6.1`, `2.6.2`, `3.0.0`]
1. `com.vesoft:nebula-exchange`  -> [`2.6.0`, `2.6.1`, `2.6.2`, `2.6.3`]
1. `com.vesoft:nebula-flink-connector`  -> [`2.6.0`, `2.6.1`, `3.0.0`]
1. `com.vesoft:nebula-spark-connector`  -> [`2.6.0`, `2.6.1`, `2.6.2`, `3.0.0`]
1. `com.yahoo.vespa:vespa-feed-client-cli`  -> [`7.411.24`, `7.413.25`, `7.414.19`, `7.416.18`, `7.417.20`, `7.418.23`, `7.419.22`, `7.420.21`]
1. `com.yahoo.vespa:vespa-hadoop`  -> [`7.117.37`, `7.119.4`, `7.120.13`, `7.122.7`, `7.125.11`, `7.126.14`, `7.128.18`, `7.132.16`, `7.133.13`, `7.136.13`, `7.138.15`, `7.140.12`, `7.142.14`, `7.143.13`, `7.144.5`, `7.145.41`, `7.147.12`, `7.157.9`, `7.161.1`, `7.162.26`, `7.164.8`, `7.165.5`, `7.166.31`, `7.168.4`, `7.169.4`, `7.171.10`, `7.172.13`, `7.173.17`, `7.174.29`, `7.175.12`, `7.176.11`, `7.177.11`, `7.179.11`, `7.184.8`, `7.185.19`, `7.186.20`, `7.187.1`, `7.190.14`, `7.193.27`, `7.197.21`, `7.198.13`, `7.199.1`, `7.200.54`, `7.201.7`, `7.204.28`, `7.206.15`, `7.207.47`, `7.208.2`, `7.209.2`, `7.211.11`, `7.212.12`, `7.213.19`, `7.214.34`, `7.215.8`, `7.216.10`, `7.217.12`, `7.218.37`, `7.219.14`, `7.220.14`, `7.223.70`, `7.225.71`, `7.226.6`, `7.227.16`, `7.228.15`, `7.229.35`, `7.232.23`, `7.233.7`, `7.234.10`, `7.235.16`, `7.236.32`, `7.237.14`, `7.238.12`, `7.240.27`, `7.241.12`, `7.242.24`, `7.244.2`, `7.246.11`, `7.247.32`, `7.248.5`, `7.249.12`, `7.250.9`, `7.251.31`, `7.252.6`, `7.254.8`, `7.255.24`, `7.256.6`, `7.257.6`, `7.258.11`, `7.259.2`, `7.261.8`, `7.263.4`, `7.264.3`, `7.265.10`, `7.266.25`, `7.267.11`, `7.268.15`, `7.270.21`, `7.271.29`, `7.273.15`, `7.274.2`, `7.275.26`, `7.276.8`, `7.277.38`, `7.278.21`, `7.279.34`, `7.280.10`, `7.281.56`, `7.282.23`, `7.285.54`, `7.286.18`, `7.290.1`, `7.291.27`, `7.292.82`, `7.294.10`, `7.295.58`, `7.297.21`, `7.298.26`, `7.299.105`, `7.300.57`, `7.301.24`, `7.304.50`, `7.305.19`, `7.306.19`, `7.308.21`, `7.309.46`, `7.310.25`, `7.312.45`, `7.314.13`, `7.317.18`, `7.322.17`, `7.323.38`, `7.324.57`, `7.326.17`, `7.327.42`, `7.328.17`, `7.329.19`, `7.330.15`, `7.331.24`, `7.334.42`, `7.335.22`, `7.338.31`, `7.339.20`, `7.340.22`, `7.342.40`, `7.343.18`, `7.346.59`, `7.347.28`, `7.349.32`, `7.350.53`, `7.351.32`, `7.354.14`, `7.355.22`]
1. `de.aaschmid:taskwarrior-java-client`  -> [`1.0`]
1. `io.kestra.plugin:plugin-debezium-postgres`  -> [`0.4.0`, `0.4.1`]
1. `io.kestra.plugin:plugin-jdbc-postgres`  -> [`0.2.7`, `0.2.8`, `0.3.0`, `0.3.1`, `0.3.2`, `0.3.3`, `0.4.0`, `0.4.1`, `0.4.2`]
1. `io.nosqlbench:nb`  -> [`3.12.52`, `3.12.54`, `3.12.55`, `3.12.60`, `3.12.61`, `3.12.62`, `3.12.66`, `3.12.67`, `3.12.70`, `3.12.71`, `3.12.72`, `3.12.73`, `3.12.75`, `3.12.76`, `3.12.77`, `3.12.78`, `3.12.79`, `3.12.81`, `3.12.82`, `3.12.83`, `3.12.84`, `3.12.85`]
1. `io.opentelemetry.javaagent:opentelemetry-testing-common`  -> [`1.13.0-alpha`, `1.13.1-alpha`]
1. `io.pravega:pravega-keycloak-client`  -> [`0.8.0`, `0.9.0`, `0.10.1`, `0.11.0`]
1. `io.streamnative.connectors:pulsar-flink-connector-2.11-1.11`  -> [`2.5.8.3`, `2.5.8.4`]
1. `io.streamnative.connectors:pulsar-flink-connector-2.11-1.12`  -> [`2.7.6`]
1. `io.streamnative.connectors:pulsar-flink-connector-2.12-1.11`  -> [`2.5.8.3`, `2.5.8.4`]
1. `io.streamnative.connectors:pulsar-flink-connector-2.12-1.12`  -> [`2.7.6`]
1. `io.streamnative.connectors:pulsar-flink-sql-connector_2.11`  -> [`1.12.4.0`, `1.12.4.1`]
1. `io.streamnative.connectors:pulsar-flink-sql-connector_2.12`  -> [`1.12.4.0`, `1.12.4.1`]
1. `kr.ikhoon.armeria:armeria`  -> [`0.1.0-beta2`, `0.1.0-rc1`]
1. `org.apache.pulsar:bouncy-castle-bc-shaded`  -> [`2.6.4`]
1. `org.bouncycastle:bcpkix-jdk15on`  -> [`1.61`, `1.62`, `1.63`, `1.64`, `1.65`, `1.66`, `1.67`, `1.68`, `1.69`, `1.70`]
1. `org.bouncycastle:bcpkix-jdk18on` 🧩 -> [`1.71`]
1. `org.keycloak:kcinit`  -> [`10.0.0`, `10.0.1`, `10.0.2`, `11.0.0`, `11.0.1`, `11.0.2`, `11.0.3`, `12.0.0`, `12.0.1`, `12.0.2`, `12.0.3`, `12.0.4`]
1. `org.netherald:MiniGameLib`  -> [`1.0.0`]
1. `org.opendaylight.jsonrpc:test-tool`  -> [`1.9.0`, `1.9.1`, `1.9.2`, `1.9.3`, `1.10.0`, `1.10.1`, `1.10.2`, `1.11.1`, `1.11.2`]
1. `org.testcontainers:testcontainers`  -> [`1.14.0`]
1. `org.wso2.msf4j:jwt-sample`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j:petstore-fileserver`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j:petstore-pet`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j:petstore-security`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]
1. `org.wso2.msf4j:petstore-txn`  -> [`2.7.0`, `2.8.2`, `2.8.3`, `2.8.4`]

## org.slf4j

For example, at least 36 artifacts on Maven Central claim to be the module `org.slf4j`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.slf4j;`.

1. `ch.hsr.adv:adv-commons`  -> [`1.0`]
1. `com.bytes-pot:daraja-api`  -> [`1.0-b`, `1.1-b`, `1.2-b`, `1.3-b`, `1.4-b`, `1.5-b`, `1.6-b`]
1. `com.credibledoc:log-combiner`  -> [`1.0.20`, `1.0.21`, `1.0.22`, `1.0.23`, `1.0.24`, `1.0.25`, `1.0.26`, `1.0.27`, `1.0.28`, `1.0.29`, `1.0.30`, `1.0.31`, `1.0.32`, `1.0.33`, `1.0.34`, `1.0.35`, `1.0.36`, `1.0.37`, `1.0.38`, `1.0.39`, `1.0.40`, `1.0.41`, `1.0.42`, `1.0.43`, `1.0.44`, `1.0.45`, `1.0.46`]
1. `com.credibledoc:substitution-core`  -> [`1.0.20`, `1.0.21`, `1.0.22`, `1.0.23`, `1.0.24`, `1.0.25`, `1.0.26`, `1.0.27`, `1.0.28`, `1.0.29`, `1.0.30`, `1.0.31`, `1.0.32`, `1.0.33`, `1.0.34`, `1.0.35`, `1.0.36`, `1.0.37`, `1.0.38`, `1.0.39`, `1.0.40`, `1.0.41`, `1.0.42`, `1.0.43`, `1.0.44`]
1. `com.github.biyanwen:easycsv`  -> [`1.0.0`]
1. `com.github.tomcat-slf4j-logback:tomcat10-slf4j-logback`  -> [`10.0.0-M1`, `10.0.0-M3`, `10.0.0-M4`, `10.0.0-M5`, `10.0.0-M6`, `10.0.0-M7`, `10.0.0-M9`, `10.0.0`]
1. `com.github.tomcat-slf4j-logback:tomcat7-slf4j-logback`  -> [`7.0.93`, `7.0.94`, `7.0.96`, `7.0.100`, `7.0.104`, `7.0.105`, `7.0.106`, `7.0.107`, `7.0.108`, `7.0.109`]
1. `com.github.tomcat-slf4j-logback:tomcat85-slf4j-logback`  -> [`8.5.38`, `8.5.39`, `8.5.40`, `8.5.41`, `8.5.42`, `8.5.43`, `8.5.45`, `8.5.46`, `8.5.47`, `8.5.49`, `8.5.50`, `8.5.51`, `8.5.53`, `8.5.54`, `8.5.55`, `8.5.56`, `8.5.57`, `8.5.59`, `8.5.61`, `8.5.65`]
1. `com.github.tomcat-slf4j-logback:tomcat9-slf4j-logback`  -> [`9.0.16`, `9.0.17`, `9.0.19`, `9.0.20`, `9.0.21`, `9.0.22`, `9.0.24`, `9.0.26`, `9.0.27`, `9.0.29`, `9.0.30`, `9.0.31`, `9.0.33`, `9.0.34`, `9.0.35`, `9.0.36`, `9.0.37`, `9.0.38`, `9.0.39`, `9.0.40`, `9.0.41`, `9.0.41.SP1`, `9.0.41.SP2`, `9.0.43`, `9.0.44`, `9.0.45`, `9.0.46`, `9.0.48`, `9.0.50`, `9.0.52`, `9.0.53`, `9.0.54`, `9.0.55`]
1. `com.guicedee.services:sl4j`  -> [`1.0.9.5-jre14`, `1.0.9.7-jre14`, `1.0.9.10-jre14`, `1.0.9.11-jre14`, `1.0.9.13-jre14`, `1.0.9.14-jre14`, `1.0.10.0-jre14`, `1.0.10.1-jre14`, `1.0.10.3-jre14`, `1.0.10.4-jre14`, `1.0.11.0-jre14`, `1.0.11.2-jre14`, `1.0.11.5-jre14`, `1.0.11.6-jre14`, `1.0.11.7-jre14`, `1.0.12.0-jre14`, `1.0.12.1-jre14`, `1.0.12.2-jre14`, `1.0.12.3-jre14`, `1.0.12.4-jre14`, `1.0.12.5-jre14`, `1.0.13.0-jre14`, `1.0.13.1-jre14`, `1.0.13.2-jre14`, `1.0.13.3-jre14`, `1.0.13.4-jre14`, `1.0.13.5-jre14`]
1. `com.guicedee.services:slf4j`  -> [`1.0.14.0-RC1-jre14`, `1.0.14.1-jre14`, `1.0.14.3-jre8`, `1.0.14.4-jre8`, `1.0.14.4-jre14`, `1.0.15.1-jre14`, `1.0.15.2-jre14`, `1.0.15.3-jre8`, `1.0.15.3-jre14`, `1.0.15.4-jre8`, `1.0.15.4-jre14`, `1.0.15.5-jre8`, `1.0.15.5-jre14`, `1.0.16.0-jre14`, `1.0.17.0-jre14`, `1.0.17.1-jre14`, `1.0.18.0-jre14`, `1.0.18.0-jre15`, `1.0.18.1-jre14`, `1.0.18.1-jre15`, `1.0.19.0-jre14`, `1.0.19.0-jre15`, `1.0.19.1-jre15`, `1.0.19.2-jre14`, `1.0.19.2-jre15`, `1.0.19.3-jre14`, `1.0.19.3-jre15`, `1.0.19.4-jre14`, `1.0.19.4-jre15`, `1.0.19.5-jre14`, `1.0.19.5-jre15`, `1.0.19.6-jre8`, `1.0.19.6-jre14`, `1.0.19.7-jre14`, `1.0.19.8-jre8`, `1.0.19.9-jre8`, `1.0.19.9-jre14`, `1.0.19.9-jre15`, `1.0.19.10-jre8`, `1.0.19.10-jre14`, `1.0.19.10-jre15`, `1.0.19.11-jre8`, `1.0.19.11-jre14`, `1.0.19.12-jre8`, `1.0.19.12-jre14`, `1.0.19.13-jre8`, `1.0.19.13-jre14`, `1.0.19.13-jre15`, `1.0.20.0-jre8`, `1.0.20.0-jre14`, `1.0.20.0-jre15`, `1.0.20.1-jre8`, `1.0.20.1-jre14`, `1.0.20.1-jre15`, `1.0.20.2-jre8`, `1.0.20.2-jre14`, `1.0.20.2-jre15`, `1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`, `1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.0.3-jre17-rc1`, `1.2.1.1-jre17`, `1.2.1.2-jre17`, `1.2.2.1`, `1.2.2.1-jre17`]
1. `com.ibm.cloud:ibm-analytics-engine-api-examples`  -> [`0.4.0`, `0.4.1`, `0.4.2`]
1. `com.sndyuk:logback-more-appenders`  -> [`1.5.7-JAVA9MODULE_SLF4J17`, `1.6.0-JAVA9MODULE_SLF4J17`, `1.6.1-JAVA9MODULE_SLF4J17`, `1.7.1-JAVA9MODULE_SLF4J17`, `1.7.2-JAVA9MODULE_SLF4J17`, `1.7.3-JAVA9MODULE_SLF4J17`, `1.7.4-JAVA9MODULE_SLF4J17`, `1.7.5-JAVA9MODULE_SLF4J17`, `1.8.0-JAVA9MODULE_SLF4J17`, `1.8.1-JAVA9MODULE_SLF4J17`, `1.8.2-JAVA9MODULE_SLF4J17`, `1.8.3-JAVA9MODULE_SLF4J17`, `1.8.4-JAVA9MODULE_SLF4J17`, `1.8.5-JAVA9MODULE_SLF4J17`, `1.8.6-JAVA9MODULE_SLF4J17`, `1.8.7-JAVA9MODULE_SLF4J17`]
1. `de.quantummaid.tutorials.basic-tutorial:step4`  -> [`1.0.23`, `1.0.30`, `1.0.31`]
1. `io.github.jdiscordbots:nightdream-logging`  -> [`1.1.5`, `1.1.6`, `1.1.7`, `1.1.8`, `1.1.9`, `1.1.10`]
1. `io.github.origin-energy:java-snapshot-testing-junit4`  -> [`2.0.0-Beta4`, `2.0.0-Beta6`]
1. `io.github.origin-energy:java-snapshot-testing-junit5`  -> [`2.0.0-Beta4`, `2.0.0-Beta6`]
1. `io.github.origin-energy:java-snapshot-testing-spock`  -> [`2.0.0-Beta4`, `2.0.0-Beta6`]
1. `io.keyko:secret-store-client`  -> [`0.1.0`]
1. `io.virtdata:virtdata-lib-curves4`  -> [`2.12.01`, `2.12.02`, `2.12.03`]
1. `io.virtdata:virtdata-lib-random`  -> [`2.12.01`, `2.12.02`, `2.12.03`]
1. `io.virtdata:virtdata-lib-realer`  -> [`2.12.01`, `2.12.02`]
1. `io.virtdata:virtdata-realdata`  -> [`2.12.01`]
1. `io.wizzie.enricher:base`  -> [`0.5.2`, `0.6.1`]
1. `io.wizzie.enricher:extensions`  -> [`0.5.2`, `0.6.1`]
1. `io.wizzie.enricher:model`  -> [`0.5.2`, `0.6.1`]
1. `io.wizzie.enricher:service`  -> [`0.5.2`]
1. `io.wizzie.normalizer:service`  -> [`0.6.2`, `0.7.2`, `0.7.3`]
1. `io.wizzie:enricher-base`  -> [`0.5.1`, `0.5.1.1`]
1. `io.wizzie:enricher-model`  -> [`0.5.1`, `0.5.1.1`]
1. `io.wizzie:normalizer-service`  -> [`0.6.1.1`, `0.6.1.2`]
1. `nl.basjes.parse.useragent:yauaa-commandline`  -> [`5.14`]
1. `org.eclipse.jetty:jetty-runner`  -> [`10.0.0.alpha2`, `10.0.0.beta0`, `11.0.0-alpha0`, `11.0.0.beta1`, `11.0.0.beta2`, `11.0.0.beta3`, `11.0.0`, `11.0.1`, `11.0.2`, `11.0.3`, `11.0.4`, `11.0.5`, `11.0.6`, `11.0.7`, `11.0.8`, `11.0.9`]
1. `org.logevents:logevents-smtp-demo`  -> [`0.2.1`, `0.2.2`, `0.2.3`, `0.2.4`, `0.2.5`, `0.2.6`, `0.3.0`, `0.3.1`, `0.3.2`]
1. `org.slf4j:slf4j-api` 🧩 -> [`1.8.0-beta2`, `1.8.0-beta4`, `2.0.0-alpha0`, `2.0.0-alpha1`, `2.0.0-alpha2`, `2.0.0-alpha3`, `2.0.0-alpha4`, `2.0.0-alpha5`, `2.0.0-alpha6`, `2.0.0-alpha7`]
1. `se.bjurr.gitchangelog:git-changelog-command-line`  -> [`1.45`, `1.50`, `1.52`]

## lombok

For example, at least 34 artifacts on Maven Central claim to be the module `lombok`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires lombok;`.

1. `cn.itlym.shoulder:lombok`  -> [`0.1`]
1. `cn.itlym:shoulder-lombok`  -> [`0.0.1`]
1. `co.privacyone.sdk:keychain`  -> [`1.6.7`, `1.6.8`, `1.6.9`, `1.7.0`, `1.7.1`, `1.7.2`, `1.7.3`, `1.7.4`, `1.7.5`, `2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.5`, `2.0.6`, `2.0.7`, `2.0.8`]
1. `co.privacyone.sdk:ldar`  -> [`1.6.7`, `1.6.8`, `1.6.9`, `1.7.0`, `1.7.1`, `1.7.2`, `1.7.3`, `1.7.4`, `1.7.5`, `2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.5`, `2.0.6`, `2.0.7`, `2.0.8`]
1. `co.privacyone.sdk:restapi`  -> [`1.6.7`, `1.6.8`, `1.6.9`, `1.7.0`, `1.7.1`, `1.7.2`, `1.7.3`, `1.7.4`, `1.7.5`, `2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.5`, `2.0.6`, `2.0.7`, `2.0.8`]
1. `com.github.ramalapure:filesystem`  -> [`1.0`]
1. `com.infobip:jira-version-generator`  -> [`2.0.1`]
1. `com.neko233:forward-engineering`  -> [`0.0.1`, `0.0.2`, `0.0.3`, `0.0.4`, `0.0.5`]
1. `com.neko233:sql-light-rail`  -> [`0.0.2`, `0.0.3`, `0.0.4`, `0.0.5`, `0.0.6`, `0.0.7`, `0.0.8`, `0.0.9`]
1. `com.neko233:sqlStatement-light-rail`  -> [`0.0.3`]
1. `com.yubico:java-yubihsm`  -> [`0.1.0RC1`]
1. `io.github.harvies.charon:charon-socks-proxy-server`  -> [`0.0.7`, `0.0.8`]
1. `io.github.interestinglab.waterdrop:plugin-flink-sink-elasticsearch`  -> [`2.0.2`]
1. `io.github.interestinglab.waterdrop:plugin-spark-phoenix-core`  -> [`2.0.2`]
1. `io.github.interestinglab.waterdrop:plugin-spark-sink-clickhouse`  -> [`2.0.2`]
1. `io.github.interestinglab.waterdrop:plugin-spark-sink-elasticsearch`  -> [`2.0.2`]
1. `io.github.interestinglab.waterdrop:plugin-spark-sink-phoenix`  -> [`2.0.2`]
1. `io.github.interestinglab.waterdrop:plugin-spark-source-elasticsearch`  -> [`2.0.2`]
1. `io.github.interestinglab.waterdrop:plugin-spark-source-phoenix`  -> [`2.0.2`]
1. `io.github.interestinglab.waterdrop:waterdrop-apis`  -> [`2.0.0`, `2.0.2`]
1. `io.github.interestinglab.waterdrop:waterdrop-common`  -> [`2.0.0`, `2.0.2`]
1. `io.github.interestinglab.waterdrop:waterdrop-core`  -> [`2.0.2`]
1. `io.github.interestinglab.waterdrop:waterdrop-flink-api`  -> [`2.0.0`, `2.0.2`]
1. `io.github.interestinglab.waterdrop:waterdrop-spark-api`  -> [`2.0.0`, `2.0.2`]
1. `io.github.keonwangjw:aimp-iot`  -> [`1.0.0`]
1. `io.github.marquezproject:marquez-api`  -> [`0.18.0`, `0.19.0`, `0.19.1`, `0.20.0`]
1. `io.github.marquezproject:marquez-spark`  -> [`0.18.0`, `0.19.0`, `0.19.1`, `0.20.0`]
1. `io.github.mqwerm98:munzi-log`  -> [`0.0.1`]
1. `io.github.mqwerm98:munzi-scheduler`  -> [`0.0.1`]
1. `io.github.sudharsan-selvaraj:selenium-audio-logger`  -> [`1.0.0`]
1. `io.mateu:lombok`  -> [`1.18.11.97`]
1. `io.pravega:pravega-connectors-hadoop`  -> [`0.5.0`]
1. `net.dryuf:dryuf-cmdline`  -> [`1.0.0`]
1. `org.projectlombok:lombok` 🧩 -> [`1.18.2`, `1.18.4`, `1.18.6`, `1.18.8`, `1.18.10`, `1.18.12`, `1.18.14`, `1.18.16`, `1.18.18`, `1.18.20`, `1.18.22`, `1.18.24`]

## com.fasterxml.jackson.dataformat.yaml

For example, at least 28 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.dataformat.yaml`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.dataformat.yaml;`.

1. `ai.h2o:sparkling-water-package_2.11`  -> [`3.32.0.1-2-2.4`, `3.32.0.2-1-2.4`, `3.32.0.3-1-2.4`, `3.32.0.4-1-2.4`, `3.32.0.5-1-2.4`, `3.32.1.1-1-2.4`, `3.32.1.2-1-2.4`, `3.32.1.3-1-2.4`, `3.32.1.4-1-2.4`, `3.32.1.5-1-2.4`]
1. `ai.h2o:sparkling-water-package_2.12`  -> [`3.32.0.1-2-3.0`, `3.32.0.2-1-3.0`, `3.32.0.3-1-3.0`, `3.32.0.4-1-3.0`, `3.32.0.5-1-3.0`, `3.32.1.1-1-3.0`, `3.32.1.2-1-3.1`, `3.32.1.3-1-3.1`, `3.32.1.4-1-3.1`, `3.32.1.5-1-3.1`]
1. `ai.traceable.agent:javaagent`  -> [`0.2.5`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`]
1. `com.aerospike:java-object-mapper`  -> [`1.1.0`, `1.2.0`, `1.2.1`]
1. `com.browserstack:browserstack-javaagent`  -> [`1.0.0`]
1. `com.fasterxml.jackson.dataformat:jackson-dataformat-yaml` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `com.free-now.sauron.plugins:jaegerapi-report`  -> [`0.0.3`, `0.0.4`, `0.0.5`]
1. `com.free-now.sauron.plugins:sonarapi-report`  -> [`0.0.3`, `0.0.4`, `0.0.5`, `0.0.6`]
1. `com.free-now.sauron.plugins:thanosapi-report`  -> [`0.0.2`, `0.0.3`, `0.0.4`]
1. `com.g2forge.joint:jo-joint`  -> [`0.0.1`, `0.0.2`, `0.0.3`, `0.0.4`]
1. `com.github.liuzhenghui:ecology-plugin-core`  -> [`1.0.0`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7.1`, `1.0.7.2`, `1.0.8.2`, `1.0.8.3`]
1. `com.restbusters:qreasp`  -> [`0.0.4`]
1. `com.sagframe:sqltoy-quickvo`  -> [`5.0.0`, `5.0.1`, `5.0.2`, `5.0.3`, `5.0.4`, `5.0.5`, `5.0.6`, `5.0.7`]
1. `io.bdeploy:api`  -> [`2.3.0`, `2.4.0`, `2.5.0`, `2.5.1`, `2.5.2`, `3.0.0`, `3.1.0`, `3.1.1`, `3.2.0`, `3.3.0`, `3.3.1`, `3.4.0`, `3.5.0`]
1. `io.github.karanshah-browserstack:javaagent-example`  -> [`1.0.0`, `1.0.1`]
1. `io.github.quickmsg:smqtt-bootstrap`  -> [`1.1.2`]
1. `io.github.serpro69:kotlin-faker`  -> [`1.8.0-rc.0`, `1.8.0`, `1.9.0`, `1.10.0`]
1. `io.kestra.plugin:plugin-kubernetes`  -> [`0.2.0`, `0.2.1`]
1. `io.kestra:kestra`  -> [`0.2.0`, `0.2.1`, `0.2.2`]
1. `io.liftwizard:liftwizard-example`  -> [`0.21.0`, `0.22.0`, `0.23.0`, `0.24.0`]
1. `io.openlineage:openlineage-proxy`  -> [`0.5.1`, `0.5.2`, `0.6.0`, `0.6.1`, `0.6.2`, `0.7.1`, `0.8.1`]
1. `io.streamnative:pulsar-client-admin`  -> [`2.11.0-rc-202204132205`, `2.11.0-rc-202204142207`, `2.11.0-rc-202204152205`, `2.11.0-rc-202204162205`, `2.11.0-rc-202204172205`, `2.11.0-rc-202204182206`, `2.11.0-rc-202204192205`, `2.11.0-rc-202204202205`, `2.11.0-rc-202204212206`, `2.11.0-rc-202204222205`, `2.11.0-rc-202204232205`, `2.11.0-rc-202204242205`, `2.11.0-rc-202204252206`, `2.11.0-rc-202204262206`, `2.11.0-rc-202204272205`, `2.11.0-rc-202204282207`, `2.11.0-rc-202204292205`, `2.11.0-rc-202204302206`, `2.11.0-rc-202205012205`, `2.11.0-rc-202205022209`, `2.11.0-rc-202205032206`, `2.11.0-rc-202205042205`, `2.11.0-rc-202205052207`, `2.11.0-rc-202205062205`, `2.11.0-rc-202205072206`, `2.11.0-rc-202205082205`]
1. `net.corda:corda-tools-blob-inspector`  -> [`4.9`, `4.9.1`]
1. `org.apache.beam:beam-examples-multi-language`  -> [`2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.beam:beam-runners-samza-job-server`  -> [`2.34.0`, `2.35.0`, `2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.beam:beam-runners-spark-3-job-server`  -> [`2.34.0`, `2.35.0`, `2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.beam:beam-runners-spark-job-server`  -> [`2.34.0`, `2.35.0`, `2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.flink:flink-kubernetes`  -> [`1.15.0`]

## com.zaxxer.hikari

For example, at least 25 artifacts on Maven Central claim to be the module `com.zaxxer.hikari`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.zaxxer.hikari;`.

1. `com.aliyun.schedulerx:schedulerx2-worker`  -> [`1.2.0.1`, `1.2.0.2`, `1.2.1`, `1.2.1.1`, `1.2.1.2`, `1.2.2`, `1.2.2.1`, `1.2.2.2`, `1.2.3`, `1.2.3.1`, `1.2.4`, `1.2.4.3`, `1.2.5.1`, `1.2.5.2`, `1.2.7`, `1.2.8`, `1.2.8.2`, `1.2.8.3`, `1.2.9`, `1.2.9.1`, `1.2.9.2`, `1.3.0`, `1.3.0.1`, `1.3.0.2`, `1.3.0.3`, `1.3.2`, `1.3.3`, `1.3.4`, `1.4.0`, `1.4.1`, `1.4.1.1`, `1.4.2`, `1.5.0`, `1.5.1`]
1. `com.github.susom:database`  -> [`4.0`]
1. `com.streamxhub.streamx:streamx-flink-sqlclient`  -> [`1.0.0`, `1.1.0`, `1.2.0`]
1. `com.ververica:flink-sql-connector-mysql-cdc`  -> [`2.1.0`, `2.1.1`, `2.2.0`, `2.2.1`]
1. `com.zaxxer:HikariCP` 🧩 -> [`3.4.4`, `3.4.5`, `4.0.0`, `4.0.1`, `4.0.3`, `5.0.0`, `5.0.1`]
1. `fr.blueberry-studio.hermes:hermes-api`  -> [`0.9-ALPHA`]
1. `io.tidb:flink-tidb-connector-1.11`  -> [`0.0.3`, `0.0.4`]
1. `io.tidb:flink-tidb-connector-1.12`  -> [`0.0.3`, `0.0.4`]
1. `io.tidb:flink-tidb-connector-1.13`  -> [`0.0.4`]
1. `io.tidb:flink-tidb-connector-base`  -> [`0.0.3`, `0.0.4`]
1. `io.tidb:mapreduce-tidb-connector-base`  -> [`0.0.4`]
1. `io.tidb:prestodb-connector`  -> [`0.0.4`]
1. `io.tidb:prestosql-connector`  -> [`0.0.4`]
1. `io.tidb:trino-connector`  -> [`0.0.4`]
1. `me.confuser.banmanager.BanManagerLibs:BanManagerLibs`  -> [`7.7.0`, `7.8.0`]
1. `org.appops:appops-br-maven-plugin`  -> [`0.3.0`, `0.4.0`, `0.5.0`, `0.7.0`]
1. `org.appops:appops-br-service-base`  -> [`0.3.0`, `0.4.0`, `0.5.0`, `0.7.0`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-test-beatrix`  -> [`0.40.2`, `0.40.3`, `0.40.4`, `0.40.5`, `0.40.6`, `0.40.8`, `0.40.9`, `0.40.10`, `0.40.11`, `0.40.12`]
1. `org.sonatype.nexus:nexus-orient-component-migrator`  -> [`3.25.0-03`, `3.25.1-02`]
1. `tr.com.infumia:InfumiaCommon`  -> [`1.7.7`]
1. `tr.com.infumia:InfumiaPaper`  -> [`1.7.7`]
1. `tr.com.infumia:InfumiaPlugin`  -> [`1.1.0`, `1.2.0`, `1.3.0`, `1.4.0`, `1.4.2`, `1.5.0`, `1.5.1`, `1.5.2`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.10`, `1.7.0`, `1.7.1`, `1.7.2`, `1.7.3`, `1.7.4`]
1. `tr.com.infumia:InfumiaVelocity`  -> [`1.7.7`]
1. `tr.com.infumia:KekoUtil`  -> [`2.0`, `2.1`, `2.2`, `2.3`, `2.4`, `2.5`, `2.6`, `2.7`, `2.8`, `2.9`, `3.0`, `3.1`, `3.2`, `3.3`, `3.4`, `3.5`, `3.6`, `3.7`, `3.8`, `3.9`, `4.0`, `4.1`, `4.2`, `4.3`, `4.4`, `4.5`, `4.6`, `4.7`, `4.8`, `5.0`, `5.1`, `5.2`, `5.3`, `5.4`, `5.5`, `5.6`, `5.7`, `5.8`, `6.0`, `6.1`, `6.2`, `6.3`, `6.4`, `6.5`, `6.6`, `6.7`, `6.8`, `7.0`, `7.1`, `7.2`, `7.3`, `7.4`, `7.4.1`, `7.5`, `7.6`, `7.7`]
1. `tr.com.infumia:db`  -> [`1.0`, `1.1`, `1.3`, `1.4`]

## org.objectweb.asm.commons

For example, at least 24 artifacts on Maven Central claim to be the module `org.objectweb.asm.commons`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.objectweb.asm.commons;`.

1. `com.github.fromage.quasi:quasi-core`  -> [`0.7.10`]
1. `com.github.upthewaterspout.fates:fates-instrumentation`  -> [`0.1.0`, `0.2.0`, `0.3.0`]
1. `com.joom.colonist:colonist-gradle-plugin`  -> [`0.1.0-alpha10`]
1. `com.joom.colonist:colonist-processor`  -> [`0.1.0-alpha10`]
1. `com.joom.lightsaber:lightsaber-gradle-plugin`  -> [`1.0.0-alpha05`]
1. `com.joom.lightsaber:lightsaber-processor`  -> [`1.0.0-alpha05`]
1. `com.microsoft.azure:applicationinsights-agent`  -> [`2.5.0-BETA`, `2.5.0-BETA.2`, `2.5.0-BETA.3`, `2.5.0-BETA.4`, `2.5.0-BETA.5`, `2.5.0`, `2.5.1-BETA`, `2.5.1-BETA.2`, `2.5.1`, `2.6.0-BETA`]
1. `com.netflix.nebula:gradle-lint-plugin`  -> [`11.2.0`, `11.3.0`, `11.4.0`, `11.4.1`, `11.4.2`, `11.4.3`, `11.4.4`, `12.0.0`, `12.1.0`, `13.0.0`, `13.1.0`, `13.1.1`, `13.1.2`, `13.1.4`, `13.1.5`, `13.1.6`, `13.1.7`, `14.0.0`, `14.0.1`, `14.1.0`, `14.2.0`, `14.2.1`, `14.2.4`, `15.0.0`, `15.0.1`, `15.0.2`, `15.0.3`, `16.0.0`, `16.0.1`, `16.1.1`, `16.1.2`, `16.1.3`, `16.1.4`, `16.2.0`, `16.2.1`, `16.2.2`, `16.2.3`, `16.3.0`, `16.3.1`, `16.4.0`, `16.5.1`, `16.5.2`, `16.6.0`, `16.7.0`, `16.7.1`, `16.8.0`, `16.8.1`, `16.9.0`, `16.9.1`, `16.10.0`, `16.12.0`, `16.15.6`, `16.15.7`, `16.15.8`, `16.15.9`, `16.16.0`, `16.17.0`, `16.17.1`, `16.18.0`, `16.19.0`, `16.20.0`, `16.22.0`, `16.23.0`, `16.24.0`, `16.25.0`, `16.26.0`]
1. `com.newrelic.agent.android:class-rewriter`  -> [`5.28.0`, `5.28.1`, `6.0.0`, `6.1.0`]
1. `com.teamscale:teamscale-jacoco-agent`  -> [`16.0.1`, `17.0.0`, `18.0.0`, `19.0.0`, `20.0.0`, `21.0.0`, `21.1.0`, `21.2.0`, `21.2.1`, `21.3.0`, `21.4.0`, `21.5.0`]
1. `com.viridiansoftware:desugar`  -> [`1.0.0`, `1.0.1`]
1. `com.xdev-software:desktopkit-app`  -> [`1.2.0`]
1. `fish.payara.extras:payara-embedded-all`  -> [`5.183`, `5.184`, `5.191`, `5.192`, `5.193`, `5.193.1`]
1. `fish.payara.extras:payara-embedded-web`  -> [`5.183`, `5.184`, `5.191`, `5.192`, `5.193`, `5.193.1`]
1. `io.joynr.tools.generator:joynr-generator-standalone`  -> [`1.6.4`, `1.6.5`, `1.7.0`, `1.7.1`, `1.8.0`, `1.8.2`, `1.9.0`, `1.9.1`, `1.10.0`, `1.10.1`, `1.11.0`, `1.11.1`, `1.12.0`, `1.13.0`, `1.14.0`, `1.14.1`, `1.14.2`, `1.14.3`, `1.15.0`, `1.15.1`, `1.15.2`, `1.15.3`, `1.15.4`, `1.15.5`, `1.15.6`, `1.15.7`, `1.15.7.1`, `1.15.8`, `1.15.9`, `1.15.10`, `1.15.11`, `1.15.12`, `1.16.0`, `1.16.1`]
1. `io.michaelrocks:paranoid-gradle-plugin`  -> [`0.3.3`]
1. `io.michaelrocks:paranoid-processor`  -> [`0.3.3`]
1. `net.corda:corda-djvm`  -> [`4.0`]
1. `org.copper-engine:copper-performance-test`  -> [`5.0.0-SNAPHOT`]
1. `org.javastro.vodsl:vodslparser`  -> [`0.4.0`, `0.4.2`, `0.4.3`]
1. `org.netbeans.external:asm-commons-7.2`  -> [`RELEASE113`]
1. `org.ow2.asm:asm-commons` 🧩 -> [`6.2.1`, `7.0-beta`, `7.0`, `7.1`, `7.2-beta`, `7.2`, `7.3.1`, `8.0`, `8.0.1`, `9.0-beta`, `9.0`, `9.1`, `9.2`, `9.3`]
1. `org.realityforge.shade:shade-cli`  -> [`2.0.0`]
1. `software.amazon.disco:disco-java-agent`  -> [`0.10.0`, `0.11.0`, `0.12.0`]

## com.fasterxml.jackson.jaxrs.json

For example, at least 23 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.jaxrs.json`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.jaxrs.json;`.

1. `app.cash.backfila:service-lib`  -> [`0.1.3-20210805.0116-93702c4`]
1. `com.baidu.dev2:baiduads-sdk`  -> [`2022.0.0`, `2022.1.0`, `2022.2.0`, `2022.3.0`]
1. `com.emc.ecs:object-client-bundle`  -> [`3.3.2`]
1. `com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.2`, `2.10.2.1`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `com.guicedee.services:jackson-jaxrs-json-provider`  -> [`0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.telenav.kivakit:kivakit-examples-lambda`  -> [`1.2.0`, `1.2.1`, `1.2.2`, `1.3.0`, `1.4.0`, `1.4.1`, `1.4.2`, `1.5.0`]
1. `com.telenav.kivakit:kivakit-service-server`  -> [`1.1.0`, `1.1.1`, `1.1.2`, `1.2.0`, `1.2.1`, `1.2.2`, `1.3.0`, `1.4.0`, `1.4.1`, `1.4.2`, `1.5.0`]
1. `io.github.marquezproject:marquez-api`  -> [`0.21.0`]
1. `io.github.nur858:com-microsoft-osdu-api`  -> [`0.0.4`]
1. `io.kestra.plugin:plugin-debezium-mysql`  -> [`0.4.0`, `0.4.1`]
1. `io.kestra.plugin:plugin-debezium-sqlserver`  -> [`0.4.1`]
1. `io.kestra.plugin:plugin-debezium`  -> [`0.4.0`, `0.4.1`]
1. `io.kestra:kestra`  -> [`0.2.6`, `0.2.7`, `0.2.8`]
1. `io.liftwizard:liftwizard-example`  -> [`0.13.0`, `0.14.0`, `0.15.0`, `0.16.0`, `0.17.0`, `0.18.0`, `0.19.0`, `0.20.0`]
1. `io.nflow:nflow-perf-test`  -> [`7.2.1`, `7.2.2`, `7.2.3`, `7.2.4`, `7.3.0`, `7.3.1`, `7.4.0`]
1. `io.nflow:nflow-tests`  -> [`7.2.1`, `7.2.2`, `7.2.3`, `7.2.4`, `7.3.0`, `7.3.1`, `7.4.0`]
1. `io.stargate.graphql:sgv2-graphqlapi`  -> [`2.0.0-ALPHA-7`, `2.0.0-ALPHA-8`, `2.0.0-ALPHA-9`]
1. `io.stargate.web:sgv2-rest-service`  -> [`2.0.0-ALPHA-1`, `2.0.0-ALPHA-2`, `2.0.0-ALPHA-3`, `2.0.0-ALPHA-4`, `2.0.0-ALPHA-5`, `2.0.0-ALPHA-6`, `2.0.0-ALPHA-7`, `2.0.0-ALPHA-8`, `2.0.0-ALPHA-9`]
1. `org.apache.drill.exec:drill-jdbc-all`  -> [`1.19.0`, `1.20.0-hadoop2`]
1. `org.apache.hbase.thirdparty:hbase-shaded-jackson-jaxrs-json-provider`  -> [`4.1.0`]
1. `org.apache.tika:tika-server-classic`  -> [`2.0.0-ALPHA`]
1. `org.apache.tika:tika-server-core`  -> [`2.0.0-ALPHA`, `2.0.0-BETA`]
1. `org.apache.tika:tika-server-standard`  -> [`2.0.0-BETA`]

## org.jetbrains.annotations

For example, at least 20 artifacts on Maven Central claim to be the module `org.jetbrains.annotations`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.jetbrains.annotations;`.

1. `com.danielflower.apprunner:restabuild`  -> [`0.8.8`, `0.8.11`, `0.8.13`, `1.0.0`]
1. `com.github.alfonsoLeandro:MPUtils`  -> [`1.9.0`, `1.9.1`, `1.9.2`, `1.9.3`]
1. `com.localhost22:rf`  -> [`1.0`]
1. `de.uni-mannheim.informatik.dws.melt:matching-eval-client`  -> [`3.1`, `3.2`]
1. `de.uni-mannheim.informatik.dws:jrdf2vec`  -> [`1.2`]
1. `dev.dejvokep:boosted-yaml`  -> [`1.0`, `1.1`]
1. `io.github.charles-grozny.pluginlib:bukkitpluginlib`  -> [`1.0.0`, `1.0.1`]
1. `io.github.dailystruggle:CommandsAPI`  -> [`1.0-ALPHA01`, `1.0-ALPHA04`, `1.0-ALPHA05`, `1.0-ALPHA06`, `1.0-ALPHA08`, `1.0-ALPHA10`, `1.0-ALPHA12`, `1.0-ALPHA13`, `1.0-ALPHA14`, `1.0-ALPHA15`, `1.0-ALPHA16`, `1.0-ALPHA19`, `1.0-ALPHA23`, `1.0-ALPHA26`, `1.0-ALPHA28`, `1.0-ALPHA29`, `1.0-ALPHA30`, `1.0-ALPHA31`, `1.0-ALPHA32`, `1.0-ALPHA33`, `1.0-ALPHA35`, `1.0-ALPHA36`, `1.0-ALPHA37`, `1.0-ALPHA38`, `1.0-ALPHA39`, `1.0-ALPHA40`, `1.0-ALPHA42`]
1. `io.github.dailystruggle:EffectsAPI`  -> [`1.0-ALPHA01`, `1.0-ALPHA02`, `1.0-ALPHA03`]
1. `io.github.wand555:richerconversation-api`  -> [`1.0.2`, `1.0.3`]
1. `io.github.wand555:richerconversation-example`  -> [`1.0.2`, `1.0.3`]
1. `org.bspfsystems.bungeeipc:bungeeipc-api`  -> [`1.0.1`, `1.0.2`, `1.0.3`]
1. `org.bspfsystems.bungeeipc:bungeeipc-client-api`  -> [`3.0.1`, `3.0.2`]
1. `org.bspfsystems.bungeeipc:bungeeipc-common-api`  -> [`2.0.0`, `2.1.0`, `2.1.1`, `3.0.0`, `3.0.1`, `3.0.2`]
1. `org.bspfsystems.bungeeipc:bungeeipc-server-api`  -> [`3.0.1`, `3.0.2`]
1. `org.bspfsystems:basic-mojang-api`  -> [`1.0.0`, `1.0.1`, `1.0.2`, `1.1.0`, `1.1.1`, `1.1.2`, `1.2.0`]
1. `org.bspfsystems:simple-json`  -> [`1.0.0`, `1.1.0`, `1.1.1`, `1.1.2`, `1.1.3`, `1.1.4`]
1. `org.bspfsystems:yamlconfiguration`  -> [`1.0.9`, `1.0.10`, `1.0.11`, `1.1.0`]
1. `org.jetbrains:annotations-java5` 🧩 -> [`21.0.0`, `21.0.1`, `22.0.0`, `23.0.0`]
1. `org.jetbrains:annotations`  -> [`21.0.0`, `21.0.1`, `22.0.0`, `23.0.0`]

## java.ws.rs

For example, at least 15 artifacts on Maven Central claim to be the module `java.ws.rs`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires java.ws.rs;`.

1. `cc.kebei:boot-in-jar`  -> [`1.1`]
1. `com.bazaarvoice.emodb:emodb-web-local`  -> [`6.3.0`, `6.3.1`, `6.3.2`, `6.4.0`, `6.4.1`]
1. `com.bazaarvoice.emodb:emodb-web`  -> [`6.3.0`, `6.3.1`, `6.3.2`, `6.4.0`, `6.4.1`]
1. `com.guicedee.services:java.ws.rs`  -> [`1.0.20.0-jre8`, `1.0.20.0-jre14`, `1.0.20.0-jre15`, `1.0.20.1-jre8`, `1.0.20.1-jre14`, `1.0.20.1-jre15`, `1.0.20.2-jre8`, `1.0.20.2-jre14`, `1.0.20.2-jre15`, `1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`, `1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.0.3-jre17-rc1`]
1. `com.intershop.gradle.jobrunner:icmjobrunner`  -> [`1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`]
1. `de.foellix:AQL-System`  -> [`1.2.0`]
1. `io.github.parj:getexternalip`  -> [`1.0`, `1.1`]
1. `io.pravega:pravega-test-system`  -> [`0.9.0`, `0.9.1`]
1. `jakarta.ws.rs:jakarta.ws.rs-api`  -> [`2.1.2`, `2.1.4`, `2.1.5`, `2.1.6`]
1. `javax.ws.rs:javax.ws.rs-api`  -> [`2.1.1`]
1. `net.oneandone.ioc-unit:ioc-unit-wf24-specs`  -> [`2.0.42`, `2.0.43`]
1. `net.sf.ehcache.internal:ehcache-rest-agent`  -> [`2.10.9`, `2.10.9.2`]
1. `net.sf.ehcache:ehcache`  -> [`2.10.8`, `2.10.9.2`]
1. `org.jboss.spec.javax.ws.rs:jboss-jaxrs-api_2.1_spec`  -> [`2.0.0.CR2`, `2.0.1.Final`, `2.0.2.Final`]
1. `org.keycloak:kcinit`  -> [`9.0.0`, `9.0.2`, `9.0.3`]

## com.fasterxml.jackson.datatype.jdk8

For example, at least 14 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.datatype.jdk8`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.datatype.jdk8;`.

1. `com.fasterxml.jackson.datatype:jackson-datatype-jdk8` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `com.github.shynixn.minikeyvaluestore:minikeyvaluestore-core`  -> [`1.0.0`]
1. `com.jwebmp.jackson.datatype:jackson-datatype-jdk8`  -> [`0.65.0.1`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]
1. `com.jwebmp.jpms.jackson.datatype:jackson-datatype-jdk8`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.microsoft.azure:spark-cdm-connector`  -> [`0.18.2`]
1. `io.bdeploy:api`  -> [`3.6.0`, `3.6.1`, `3.6.2`, `3.6.3`, `3.6.4`, `3.6.5`, `3.6.6`, `3.6.7`, `4.0.0`, `4.0.1`, `4.0.2`, `4.0.3`, `4.0.4`, `4.0.5`, `4.1.0`, `4.1.2`, `4.1.3`, `4.2.1`, `4.2.2`, `4.3.0`]
1. `io.github.marquezproject:marquez-api`  -> [`0.12.0`, `0.12.1`, `0.12.2`, `0.13.0`, `0.13.1`, `0.14.0`, `0.14.1`, `0.14.2`, `0.15.0`, `0.15.1`, `0.15.2-rc.2`, `0.15.2`, `0.16.0-rc.1`, `0.16.0`, `0.16.1-rc.1`, `0.16.1`, `0.17.0`]
1. `io.github.origin-energy:java-snapshot-testing-core`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`]
1. `io.github.origin-energy:java-snapshot-testing-junit4`  -> [`2.0.0-Beta9`, `2.0.0`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`]
1. `io.github.origin-energy:java-snapshot-testing-junit5`  -> [`2.0.0-Beta9`, `2.0.0`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`]
1. `io.github.origin-energy:java-snapshot-testing-spock`  -> [`2.0.0-Beta9`, `2.0.0`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`]
1. `io.mantisrx:mantis-connector-iceberg`  -> [`1.2.6`, `1.2.7`, `1.2.8`, `1.2.9`, `1.2.10`]
1. `io.mantisrx:mantis-publish-netty`  -> [`1.2.8`, `1.2.9`, `1.2.10`, `1.2.11`, `1.2.12`, `1.2.14`, `1.2.15`, `1.2.17`, `1.2.18`, `1.2.19`, `1.2.20`, `1.3.0`]
1. `org.apache.beam:beam-sdks-java-io-debezium-expansion-service`  -> [`2.34.0`, `2.35.0`]

## net.bytebuddy.agent

For example, at least 14 artifacts on Maven Central claim to be the module `net.bytebuddy.agent`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires net.bytebuddy.agent;`.

1. `co.elastic.apm:apm-agent-attach-cli`  -> [`1.23.0`, `1.24.0`, `1.25.0`, `1.26.0`, `1.27.0`, `1.27.1`, `1.28.0`, `1.28.1`, `1.28.2`, `1.28.3`, `1.28.4`, `1.29.0`, `1.30.0`, `1.30.1`]
1. `co.elastic.apm:apm-agent-attach`  -> [`1.4.0`, `1.5.0`, `1.6.0`, `1.6.1`, `1.7.0`, `1.8.0`, `1.9.0`, `1.10.0`, `1.10.1`, `1.11.0`, `1.12.0`, `1.13.0`, `1.14.0`, `1.15.0`, `1.16.0`, `1.17.0`, `1.18.0.RC1`, `1.18.0`, `1.18.1`, `1.19.0`, `1.20.0`, `1.21.0`, `1.22.0`, `1.27.0`, `1.27.1`, `1.28.0`, `1.28.1`, `1.28.2`, `1.28.3`, `1.28.4`, `1.29.0`, `1.30.0`, `1.30.1`]
1. `com.amazonaws:aws-xray-auto-instrumentation-agent-bootstrap`  -> [`2.4.0-beta`, `2.4.0-beta.1`]
1. `com.ea.async:ea-async`  -> [`1.2.3`]
1. `com.google.gerrit:gerrit-acceptance-framework`  -> [`3.1.3`, `3.1.4`, `3.2.0-rc0`, `3.2.0-rc1`, `3.2.0-rc2`, `3.2.0-rc3`, `3.2.0-rc4`, `3.2.0`, `3.2.1`, `3.2.2`, `3.2.3`, `3.3.0-rc0`, `3.3.0-rc1`, `3.3.0-rc2`, `3.3.0-rc3`, `3.3.0-rc4`, `3.3.0-rc5`, `3.3.0-rc6`, `3.3.0-rc7`, `3.3.0`, `3.3.1`, `3.3.2`, `3.3.3`, `3.4.0-rc0`, `3.4.0-rc1`, `3.4.0-rc2`, `3.4.0-rc3`, `3.4.0-rc4`, `3.4.0-rc5`, `3.4.0`, `3.4.1`, `3.5.0-rc0`, `3.5.0-rc1`, `3.5.0-rc2`, `3.5.0-rc4`, `3.5.0`, `3.5.0.1`, `3.5.1`, `3.6.0-rc0`, `3.6.0-rc1`, `3.6.0-rc2`, `3.6.0-rc3`, `3.6.0-rc4`]
1. `com.idea-aedi:component-dump-class`  -> [`1.2.0`, `1.3.0`, `1.4.0`, `1.6.0`, `1.8.0`, `1.9.0`, `2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`, `2.5.0`, `2.6.0`]
1. `com.nerdvision:dynamic-load`  -> [`3.0.0-rc1`, `3.0.0-rc2`, `3.0.0-rc3`, `3.0.0`, `3.0.1`, `3.0.2`]
1. `com.nerdvision:example`  -> [`2.0.1`, `2.0.2`, `2.0.4`, `2.1.0`, `2.2.0`]
1. `com.netsensia.rivalchess:rivalchess-engine`  -> [`10.0.0`, `10.0.3`, `10.0.4`]
1. `io.opentracing.contrib.specialagent:opentracing-specialagent`  -> [`1.0.0`, `1.1.0`, `1.1.1`, `1.1.2`, `1.2.0`, `1.3.0`, `1.3.1`, `1.3.2`, `1.3.3`, `1.3.4`, `1.3.5`, `1.3.6`]
1. `io.projectreactor:reactor-tools`  -> [`3.3.0.RELEASE`, `3.3.1.RELEASE`, `3.3.2.RELEASE`, `3.3.3.RELEASE`, `3.3.4.RELEASE`, `3.3.5.RELEASE`, `3.3.6.RELEASE`, `3.3.7.RELEASE`, `3.3.8.RELEASE`, `3.3.9.RELEASE`, `3.3.10.RELEASE`, `3.3.11.RELEASE`, `3.4.0`, `3.4.1`, `3.4.2`, `3.4.3`, `3.4.4`, `3.4.5`, `3.4.6`, `3.4.7`, `3.4.8`, `3.4.9`, `3.4.10`]
1. `net.bytebuddy:byte-buddy-agent` 🧩 -> [`1.9.0`, `1.9.1`, `1.9.2`, `1.9.3`, `1.9.4`, `1.9.6`, `1.9.7`, `1.9.8`, `1.9.9`, `1.9.10`, `1.9.11`, `1.9.12`, `1.9.13`, `1.9.14`, `1.9.15`, `1.9.16`, `1.10.0`, `1.10.1`, `1.10.2`, `1.10.3`, `1.10.4`, `1.10.5`, `1.10.6`, `1.10.7`, `1.10.8`, `1.10.9`, `1.10.10`, `1.10.11`, `1.10.12`, `1.10.13`, `1.10.14`, `1.10.15`, `1.10.16`, `1.10.17`, `1.10.18`, `1.10.19`, `1.10.20`, `1.10.21`, `1.10.22`, `1.11.0`, `1.11.1`, `1.11.2`, `1.11.3`, `1.11.4`, `1.11.5`, `1.11.6`, `1.11.7`, `1.11.8`, `1.11.9`, `1.11.10`, `1.11.11`, `1.11.12`, `1.11.13`, `1.11.14`, `1.11.15`, `1.11.16`, `1.11.17`, `1.11.18`, `1.11.19`, `1.11.20`, `1.11.21`, `1.11.22`, `1.12.0`, `1.12.1`, `1.12.2`, `1.12.3`, `1.12.4`, `1.12.5`, `1.12.6`, `1.12.7`, `1.12.8`, `1.12.9`, `1.12.10`]
1. `software.amazon.disco:disco-java-agent-inject-api`  -> [`0.10.0`, `0.11.0`, `0.12.0`]
1. `software.amazon.disco:disco-java-agent-instrumentation-preprocess`  -> [`0.12.0`]

## org.openqa.selenium.core

For example, at least 14 artifacts on Maven Central claim to be the module `org.openqa.selenium.core`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.openqa.selenium.core;`.

1. `br.com.behaviortest:behavior-test-api`  -> [`1.0.0`, `1.0.1`]
1. `ch.exense.step.examples:demo-selenium-keyword`  -> [`1.1.3`, `3.13.0`]
1. `ch.exense.step.library:step-library-kw-selenium`  -> [`1.0.7`, `1.0.8`, `2021.08.18-ID174e3d1`]
1. `ch.exense.step.library:step-library-selenium-3`  -> [`1.0.11`, `1.0.12`, `1.0.13`]
1. `com.codacy:scooby-doo-fwk`  -> [`1.23.0-featpromotetocentral.bec3d80`, `1.23.0-featpromotetocentral.fd73670`, `1.24.0`, `1.26.0`, `1.28.0`, `1.28.2`, `1.28.3`, `1.28.5`, `1.30.0`, `1.32.0`, `1.33.1`, `1.33.3`, `1.35.0`, `1.37.0`, `1.39.0`, `1.40.0`, `1.42.0`, `1.43.1`, `1.45.0`, `1.46.1`, `1.48.0`, `1.48.2`]
1. `com.gitee.pyqone:autest`  -> [`2.0.0-RELEASE`]
1. `com.github.qgintest:testutilities`  -> [`1.5.0`, `1.7.0`]
1. `com.iceolive:selenium-script`  -> [`0.0.5`]
1. `com.infotel.seleniumRobot:core`  -> [`3.14.2`, `4.0.0`, `4.0.1`, `4.1.0`, `4.1.1`, `4.1.2`, `4.1.3`, `4.1.4`, `4.2.0`, `4.2.1`, `4.2.2`, `4.3.0`]
1. `io.github.sridharbandi:java-a11y`  -> [`1.1.0`, `2.0-alpha-1`]
1. `io.sitoolkit.wt:sit-wt-app`  -> [`3.0.0-alpha.2`, `3.0.0-beta.1`, `3.0.0-beta.2`, `3.0.0-beta.3`, `3.0.0`]
1. `io.tesbo:Tesbo-Web`  -> [`0.0.6`]
1. `org.seleniumhq.selenium:selenium-api`  -> [`3.14.0`, `3.141.0`, `3.141.5`, `3.141.59`, `4.0.0-alpha-1`, `4.0.0-alpha-2`]
1. `ru.sbtqa.tag.pagefactory:page-factory-core`  -> [`10.0.0`, `10.1.1`, `10.1.2`, `10.1.3`, `11.0.0`, `11.0.1`, `11.1.0`, `11.1.1`, `11.2.0`, `12.0.0`, `12.0.1`, `12.0.2`, `12.0.3`, `12.0.4`, `13.0.0`, `13.0.1`, `13.0.2`, `13.0.3`, `13.0.4`, `13.0.5`, `14.0.0`, `14.1.0`, `14.2.0`, `14.3.1`, `14.4.0`, `14.5.0`, `14.6.0`, `14.7.0`, `14.7.1`, `14.8.0`, `14.8.1`, `14.9.0`, `15.0.0`, `15.0.1`, `15.0.2`, `15.1.0`, `15.2.0`, `15.2.2`, `15.2.3`, `15.3.0`, `15.3.1`, `15.4.0`, `15.4.3`, `15.4.8`, `15.5.0`, `15.6.0`, `15.7.2`, `15.8.0`, `15.9.1`, `15.9.2`, `15.9.3`, `15.10.0`, `15.11.0`, `15.12.0`, `15.13.3`, `15.14.1`, `15.14.2`, `15.14.4`, `15.15.0`, `15.15.3`, `15.16.1`, `15.17.1`, `15.18.0`, `15.19.0`, `15.19.1`, `16.0.0`, `16.1.0`, `16.1.1`, `16.1.2`, `16.1.3`, `16.3.0`, `16.4.0`, `16.4.1`, `16.4.4`, `16.4.5`, `16.5.0`]

## com.sun.xml.bind

For example, at least 13 artifacts on Maven Central claim to be the module `com.sun.xml.bind`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.sun.xml.bind;`.

1. `com.airbus-cyber-security.graylog:graylog-plugin-glpi`  -> [`1.1.0`, `1.2.0`, `1.2.1`, `1.3.0`]
1. `com.eternitywall:java-opentimestamps`  -> [`1.18`, `1.19`, `1.20`]
1. `com.github.cafapi:caf-utils`  -> [`2.0.0-425`]
1. `com.hortonworks.registries:schema-registry-core`  -> [`0.8.1`]
1. `com.sun.xml.bind:jaxb-impl` 🧩 -> [`2.4.0-b180725.0644`, `2.4.0-b180830.0438`, `2.3.3-b01`, `2.3.3-b02`, `3.0.0-M1`, `3.0.0-M2`, `3.0.0-M3`, `3.0.0-M4`, `3.0.0-M5`, `3.0.0`, `3.0.1`, `3.0.2-b01`, `3.0.2`, `4.0.0-M4`]
1. `eu.fbk.dh:KD-Runner`  -> [`0.1`]
1. `io.github.azagniotov:stubby4j`  -> [`7.1.0`, `7.1.1`, `7.1.2`, `7.1.3`, `7.2.0`, `7.3.0`, `7.3.1`, `7.3.2`, `7.3.3`, `7.4.0`, `7.5.0`, `7.5.1`, `7.5.2`]
1. `io.pravega:pravega-test-system`  -> [`0.8.0`, `0.8.1`]
1. `org.duracloud:account-management-db-util`  -> [`7.1.0`, `7.1.1`]
1. `org.glassfish.jaxb:jaxb-runtime`  -> [`2.4.0-b180725.0644`, `2.4.0-b180830.0438`, `2.3.2`]
1. `org.icij.extract:extract-cli`  -> [`2.3.0`, `2.3.1`, `2.3.2`, `2.3.3`, `2.3.4`, `2.3.5`, `2.3.8`, `2.3.9`, `2.3.10`, `3.0.0`, `3.0.1`, `3.1.0`, `3.2.0`, `3.2.1`, `3.3.0`, `3.3.1`, `3.3.2`, `3.3.3`, `3.3.4`, `3.3.5`, `3.4.0`, `3.5.0`, `3.5.1`, `3.5.2`, `3.6.0`, `3.6.1`, `3.7.0`, `3.7.1`, `3.7.2`]
1. `org.jboss.windup.web:windup-keycloak-tool`  -> [`5.2.0.Final`, `5.3.0.Final`, `5.4.0.Final`, `5.5.0.Alpha1`]
1. `org.mustangproject:Mustang-CLI`  -> [`2.0.1`, `2.0.2`, `2.0.3`]

## org.bouncycastle.pg

For example, at least 13 artifacts on Maven Central claim to be the module `org.bouncycastle.pg`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.bouncycastle.pg;`.

1. `com.danielflower.apprunner:restabuild`  -> [`0.6.0`]
1. `com.google.gerrit:gerrit-acceptance-framework`  -> [`3.1.0-rc0`, `3.1.0-rc1`, `3.1.0-rc2`, `3.1.0-rc3`, `3.1.0`, `3.1.1`, `3.1.2`]
1. `com.google.gerrit:gerrit-plugin-api`  -> [`3.1.0-rc0`, `3.1.0-rc1`, `3.1.0-rc2`, `3.1.0-rc3`, `3.1.0`, `3.1.1`, `3.1.2`]
1. `com.juliozynger.floorplan:floorplan-gradle-plugin`  -> [`0.3`, `0.4`]
1. `io.kestra.plugin:plugin-crypto`  -> [`0.2.0`, `0.2.1`, `0.2.2`, `0.3.0`, `0.3.1`, `0.4.0`]
1. `org.bouncycastle:bcpg-fips`  -> [`1.0.3`, `1.0.4`, `1.0.5`, `1.0.5.1`]
1. `org.bouncycastle:bcpg-jdk15on`  -> [`1.61`, `1.62`, `1.63`, `1.64`, `1.65`, `1.66`, `1.67`, `1.68`, `1.69`, `1.70`]
1. `org.bouncycastle:bcpg-jdk18on` 🧩 -> [`1.71`]
1. `org.netbeans.external:bcpg`  -> [`RELEASE113`]
1. `org.sonarsource.scm.git:sonar-scm-git-plugin`  -> [`1.11.0.11`, `1.11.1.2008`]
1. `org.vafer:jdeb`  -> [`1.8`, `1.9`, `1.10`]
1. `org.whitesource:wss-unified-agent-main`  -> [`19.7.3`]
1. `pl.allegro.tech.build:axion-release-plugin`  -> [`1.13.0`, `1.13.1`, `1.13.2`, `1.13.3`, `1.13.4`, `1.13.5`, `1.13.6`]

## com.blazebit.persistence.integration.hibernate

For example, at least 12 artifacts on Maven Central claim to be the module `com.blazebit.persistence.integration.hibernate`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.blazebit.persistence.integration.hibernate;`.

1. `com.blazebit:blaze-persistence-integration-hibernate-4.2`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-hibernate-4.3`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-hibernate-5.2`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-hibernate-5.3`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-hibernate-5.4-jakarta`  -> [`1.6.4`]
1. `com.blazebit:blaze-persistence-integration-hibernate-5.4`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-hibernate-5.5-jakarta`  -> [`1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-hibernate-5.5`  -> [`1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-hibernate-5.6-jakarta`  -> [`1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-hibernate-5.6`  -> [`1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-hibernate-5`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-hibernate-6.0` 🧩 -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.6.6`]

## com.fasterxml.jackson.dataformat.xml

For example, at least 12 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.dataformat.xml`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.dataformat.xml;`.

1. `com.azure.cosmos.spark:azure-cosmos-spark_3-1_2-12`  -> [`4.5.0`, `4.5.1`, `4.5.2`, `4.5.3`, `4.6.0`, `4.6.1`, `4.6.2`, `4.7.0`, `4.8.0`, `4.9.0`]
1. `com.azure.cosmos.spark:azure-cosmos-spark_3-2_2-12`  -> [`4.6.0`, `4.6.1`, `4.6.2`, `4.7.0`, `4.8.0`, `4.9.0`]
1. `com.fasterxml.jackson.dataformat:jackson-dataformat-xml` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `com.sonatype.clm:clm-maven-plugin`  -> [`2.30.6-01`]
1. `io.github.shuigedeng:taotao-cloud-starter-common`  -> [`2021.8.1`]
1. `io.kestra.plugin:plugin-azure`  -> [`0.4.0`, `0.4.1`]
1. `io.kestra.storage:storage-azure`  -> [`0.4.1`]
1. `org.apache.beam:beam-runners-flink-1.11-job-server`  -> [`2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.beam:beam-runners-flink-1.12-job-server`  -> [`2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.beam:beam-runners-flink-1.13-job-server`  -> [`2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.beam:beam-runners-flink-1.14-job-server`  -> [`2.38.0`]
1. `org.apache.beam:beam-sdks-java-extensions-sql-expansion-service`  -> [`2.36.0`, `2.37.0`, `2.38.0`]

## com.fasterxml.jackson.datatype.jsr310

For example, at least 12 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.datatype.jsr310`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.datatype.jsr310;`.

1. `com.fasterxml.jackson.datatype:jackson-datatype-jsr310` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `com.jwebmp.jpms.jackson.datatype:jackson-datatype-datetime`  -> [`0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.networknt:eventuate-cdc-polling-server`  -> [`2.0.8`, `2.0.9`]
1. `com.networknt:eventuate-cdc-server`  -> [`2.0.8`, `2.0.9`, `2.0.10`, `2.0.11`]
1. `com.networknt:tram-cdc-mysql-server`  -> [`2.0.8`, `2.0.9`, `2.0.10`, `2.0.11`]
1. `com.networknt:tram-cdc-mysql-service`  -> [`2.0.8`, `2.0.9`, `2.0.10`, `2.0.11`]
1. `com.networknt:tram-cdc-polling-server`  -> [`2.0.8`, `2.0.9`]
1. `io.github.marquezproject:marquez-spark`  -> [`0.13.0`, `0.13.1`]
1. `io.github.shuigedeng:taotao-cloud-starter-file`  -> [`2021.8.1`]
1. `io.kestra.plugin:plugin-kubernetes`  -> [`0.3.0`, `0.3.1`, `0.4.0`]
1. `io.strimzi:crd-generator`  -> [`0.27.0`, `0.27.1`, `0.28.0`]
1. `org.apache.beam:beam-sdks-java-io-debezium-expansion-service`  -> [`2.31.0`, `2.32.0`, `2.33.0`]

## org.apiguardian.api

For example, at least 12 artifacts on Maven Central claim to be the module `org.apiguardian.api`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.apiguardian.api;`.

1. `net.coru:kloadgen`  -> [`4.0.1`, `4.0.2`, `4.0.3`, `4.0.4`, `4.0.5`, `4.0.6`, `4.0.7`, `4.0.8`, `4.0.9`, `4.1.0`, `4.2.0`, `4.3.0`]
1. `org.apiguardian:apiguardian-api` 🧩 -> [`1.1.0`, `1.1.1`, `1.1.2`]
1. `org.eclipse.tycho:org.eclipse.tycho.surefire.junit56`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`, `2.5.0`, `2.6.0`, `2.7.0`, `2.7.1`, `2.7.2`, `2.7.3`]
1. `org.eclipse.tycho:org.eclipse.tycho.surefire.junit57`  -> [`2.2.0`, `2.3.0`, `2.4.0`, `2.5.0`, `2.6.0`, `2.7.0`, `2.7.1`, `2.7.2`, `2.7.3`]
1. `org.eclipse.tycho:org.eclipse.tycho.surefire.junit57withvintage`  -> [`2.6.0`, `2.7.0`, `2.7.1`, `2.7.2`, `2.7.3`]
1. `org.eclipse.tycho:org.eclipse.tycho.surefire.junit58`  -> [`2.6.0`, `2.7.0`, `2.7.1`, `2.7.2`, `2.7.3`]
1. `org.eclipse.tycho:org.eclipse.tycho.surefire.junit58withvintage`  -> [`2.6.0`, `2.7.0`, `2.7.1`, `2.7.2`, `2.7.3`]
1. `org.neo4j:neo4j-connector-apache-spark_2.11_common`  -> [`4.0.2`, `4.1.0`, `4.1.1`, `4.1.2`]
1. `org.neo4j:neo4j-connector-apache-spark_2.11`  -> [`4.0.2_for_spark_2.4`, `4.1.0_for_spark_2.4`, `4.1.1_for_spark_2.4`, `4.1.2_for_spark_2.4`]
1. `org.neo4j:neo4j-connector-apache-spark_2.12_common`  -> [`4.0.2`, `4.1.0`, `4.1.1`, `4.1.2`]
1. `org.neo4j:neo4j-connector-apache-spark_2.12`  -> [`4.0.2_for_spark_3`, `4.1.0_for_spark_3`, `4.1.1_for_spark_3`, `4.1.2_for_spark_3`]
1. `org.neo4j:neo4j-connector-apache-spark`  -> [`4.0.2`, `4.1.0`, `4.1.1`]

## org.slf4j.simple

For example, at least 12 artifacts on Maven Central claim to be the module `org.slf4j.simple`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.slf4j.simple;`.

1. `com.jpaulmorrison:javafbp-websockets`  -> [`1.3.2`, `1.3.3`]
1. `de.quantummaid.tutorials.basic-tutorial:step4`  -> [`1.0.32`, `1.0.34`, `1.0.37`, `1.0.38`]
1. `io.github.artrayme:jmantic`  -> [`0.6.1`, `0.6.2`]
1. `org.slf4j:slf4j-simple` 🧩 -> [`1.8.0-beta2`, `1.8.0-beta4`, `2.0.0-alpha0`, `2.0.0-alpha1`, `2.0.0-alpha2`, `2.0.0-alpha3`, `2.0.0-alpha4`, `2.0.0-alpha5`, `2.0.0-alpha6`, `2.0.0-alpha7`]
1. `se.bjurr.gitchangelog:git-changelog-command-line`  -> [`1.53`, `1.54`, `1.55`, `1.58`, `1.59`, `1.60.1`, `1.61.0`, `1.62.0`, `1.63.0`, `1.65.0`, `1.67.0`, `1.69.0`, `1.72.0`, `1.74.0`, `1.75.0`, `1.76.0`, `1.77.0`, `1.78.0`, `1.80.0`, `1.81.0`, `1.82.0`, `1.83.0`, `1.84.0`, `1.85.0`, `1.85.1`, `1.85.2`, `1.86.0`, `1.87.0`, `1.88.0`, `1.89.0`, `1.92.0`, `1.93.0`, `1.94.0`, `1.95.0`, `1.96.0`, `1.96.2`, `1.96.6`, `1.97.0`, `1.97.1`, `1.97.3`, `1.98.0`, `1.99.0`, `1.99.1`, `1.99.2`, `1.99.3`, `1.99.4`, `1.99.5`, `1.99.6`, `1.99.7`, `1.99.8`, `1.100.0`, `1.100.1`, `1.100.2`]
1. `se.bjurr.gradle:violations-command-line`  -> [`1.21.1`]
1. `se.bjurr.openapitowiremock:openapi-to-wiremock`  -> [`0.0`]
1. `se.bjurr.violations:violation-comments-to-bitbucket-cloud-command-line`  -> [`1.11`, `1.13`, `1.23.0`, `1.26.0`, `1.28.0`, `1.29.0`, `1.29.1`, `1.29.2`, `1.30.0`, `1.30.1`, `1.31.0`]
1. `se.bjurr.violations:violation-comments-to-bitbucket-server-command-line`  -> [`1.9`, `1.35.0`, `1.36.0`, `1.37.0`, `1.38.0`, `1.38.1`, `1.39.0`, `1.39.1`]
1. `se.bjurr.violations:violation-comments-to-github-command-line`  -> [`1.9`, `1.10`, `1.19.0`, `1.20.0`, `1.21.0`, `1.21.1`, `1.21.4`, `1.21.5`, `1.21.6`, `1.21.7`, `1.22.0`, `1.23.0`, `1.23.1`]
1. `se.bjurr.violations:violation-comments-to-gitlab-command-line`  -> [`1.11`, `1.17`, `1.23.0`, `1.24.0`, `1.25.0`, `1.26.0`, `1.27.0`, `1.28.0`, `1.29.0`, `1.29.1`, `1.30.0`, `1.30.1`]
1. `se.bjurr.violations:violations-command-line`  -> [`1.5`, `1.7`, `1.15.0`, `1.16.0`, `1.17.0`, `1.18.0`, `1.18.1`, `1.19.0`, `1.20.4`, `1.20.5`, `1.20.6`, `1.21.0`, `1.21.2`, `1.21.3`, `1.21.4`]

## java.json

For example, at least 11 artifacts on Maven Central claim to be the module `java.json`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires java.json;`.

1. `com.scalar-labs:scalardl-client-sdk`  -> [`1.0.0-alpha.20190222`, `1.1.0`, `1.2.0`, `1.3.0`]
1. `com.scalar-labs:scalardl-java-client-sdk`  -> [`2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.4`, `2.0.5`, `2.0.6`, `2.0.7`, `2.0.8`]
1. `jakarta.json:jakarta.json-api`  -> [`1.1.5`, `1.1.6`]
1. `javax.json:javax.json-api` 🧩 -> [`1.1.3`, `1.1.4`]
1. `org.finra.herd:herd-access-validator`  -> [`0.102.0`, `0.103.0`, `0.104.0`, `0.106.0`, `0.107.0`, `0.108.0`, `0.109.0`, `0.110.0`, `0.111.0`, `0.112.0`, `0.113.0`, `0.114.0`, `0.115.0`, `0.116.0`, `0.117.0`, `0.118.0`, `0.119.0`, `0.120.0`, `0.122.0`, `0.123.0`, `0.124.0`, `0.125.0`, `0.130.0`, `0.131.0`, `0.132.0`, `0.133.0`, `0.134.0`, `0.135.0`, `0.136.0`, `0.137.0`, `0.147.0`, `0.148.0`, `0.149.0`, `0.150.0`, `0.152.0`, `0.154.0`, `0.155.0`, `0.156.0`, `0.157.0`, `0.158.0`, `0.159.0`, `0.160.0`]
1. `org.finra.herd:herd-downloader`  -> [`0.86.0`, `0.87.0`, `0.88.0`, `0.89.0`, `0.90.0`, `0.91.0`, `0.92.0`, `0.93.0`, `0.94.0`, `0.96.0`, `0.97.0`, `0.98.0`, `0.99.0`, `0.100.0`, `0.102.0`, `0.103.0`, `0.104.0`, `0.106.0`, `0.107.0`, `0.108.0`, `0.109.0`, `0.110.0`, `0.111.0`, `0.112.0`, `0.113.0`, `0.114.0`, `0.115.0`, `0.116.0`, `0.117.0`, `0.118.0`, `0.119.0`, `0.120.0`, `0.122.0`, `0.123.0`, `0.124.0`, `0.125.0`, `0.130.0`, `0.131.0`, `0.132.0`, `0.133.0`, `0.134.0`, `0.135.0`, `0.136.0`, `0.137.0`, `0.147.0`, `0.148.0`, `0.149.0`, `0.150.0`, `0.152.0`, `0.154.0`, `0.155.0`, `0.156.0`, `0.157.0`, `0.158.0`, `0.159.0`, `0.160.0`]
1. `org.finra.herd:herd-retention-expiration-destroyer`  -> [`0.86.0`, `0.87.0`, `0.88.0`, `0.89.0`, `0.90.0`, `0.91.0`, `0.92.0`, `0.93.0`, `0.94.0`, `0.96.0`, `0.97.0`, `0.98.0`, `0.99.0`, `0.100.0`, `0.102.0`, `0.103.0`, `0.104.0`, `0.106.0`, `0.107.0`, `0.108.0`, `0.109.0`, `0.110.0`, `0.111.0`, `0.112.0`, `0.113.0`, `0.114.0`, `0.115.0`, `0.116.0`, `0.117.0`, `0.118.0`, `0.119.0`, `0.120.0`, `0.122.0`, `0.123.0`, `0.124.0`, `0.125.0`, `0.130.0`, `0.131.0`, `0.132.0`, `0.133.0`, `0.134.0`, `0.135.0`, `0.136.0`, `0.137.0`, `0.147.0`, `0.148.0`, `0.149.0`, `0.150.0`, `0.152.0`, `0.154.0`, `0.155.0`, `0.156.0`, `0.157.0`, `0.158.0`, `0.159.0`, `0.160.0`]
1. `org.finra.herd:herd-retention-expiration-exporter`  -> [`0.86.0`, `0.87.0`, `0.88.0`, `0.89.0`, `0.90.0`, `0.91.0`, `0.92.0`, `0.93.0`, `0.94.0`, `0.96.0`, `0.97.0`, `0.98.0`, `0.99.0`, `0.100.0`, `0.102.0`, `0.103.0`, `0.104.0`, `0.106.0`, `0.107.0`, `0.108.0`, `0.109.0`, `0.110.0`, `0.111.0`, `0.112.0`, `0.113.0`, `0.114.0`, `0.115.0`, `0.116.0`, `0.117.0`, `0.118.0`, `0.119.0`, `0.120.0`, `0.122.0`, `0.123.0`, `0.124.0`, `0.125.0`, `0.130.0`, `0.131.0`, `0.132.0`, `0.133.0`, `0.134.0`, `0.135.0`, `0.136.0`, `0.137.0`, `0.147.0`, `0.148.0`, `0.149.0`, `0.150.0`, `0.152.0`, `0.154.0`, `0.155.0`, `0.156.0`, `0.157.0`, `0.158.0`, `0.159.0`, `0.160.0`]
1. `org.finra.herd:herd-uploader`  -> [`0.86.0`, `0.87.0`, `0.88.0`, `0.89.0`, `0.90.0`, `0.91.0`, `0.92.0`, `0.93.0`, `0.94.0`, `0.96.0`, `0.97.0`, `0.98.0`, `0.99.0`, `0.100.0`, `0.102.0`, `0.103.0`, `0.104.0`, `0.106.0`, `0.107.0`, `0.108.0`, `0.109.0`, `0.110.0`, `0.111.0`, `0.112.0`, `0.113.0`, `0.114.0`, `0.115.0`, `0.116.0`, `0.117.0`, `0.118.0`, `0.119.0`, `0.120.0`, `0.122.0`, `0.123.0`, `0.124.0`, `0.125.0`, `0.130.0`, `0.131.0`, `0.132.0`, `0.133.0`, `0.134.0`, `0.135.0`, `0.136.0`, `0.137.0`, `0.147.0`, `0.148.0`, `0.149.0`, `0.150.0`, `0.152.0`, `0.154.0`, `0.155.0`, `0.156.0`, `0.157.0`, `0.158.0`, `0.159.0`, `0.160.0`]
1. `org.openpreservation.jhove:jhove-apps`  -> [`1.24.2`, `1.24.9`, `1.26.0-RC2`]
1. `org.openpreservation.jhove:jhove-ext-modules`  -> [`1.24.2`, `1.24.9`, `1.26.0-RC2`]

## ch.qos.logback.classic

For example, at least 10 artifacts on Maven Central claim to be the module `ch.qos.logback.classic`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires ch.qos.logback.classic;`.

1. `ch.hsr.adv:adv-lib`  -> [`1.0`]
1. `ch.hsr.adv:adv-ui`  -> [`1.0`]
1. `ch.qos.logback:logback-classic` 🧩 -> [`1.3.0-alpha4`, `1.3.0-alpha5`, `1.3.0-alpha6`, `1.3.0-alpha7`, `1.3.0-alpha8`, `1.3.0-alpha9`, `1.3.0-alpha10`, `1.3.0-alpha11`, `1.3.0-alpha12`, `1.3.0-alpha13`, `1.3.0-alpha14`, `1.3.0-alpha15`]
1. `com.github.gv2011.logback:logback-classic`  -> [`1.3.0`, `1.3.1`, `1.3.2`, `1.3.3`, `1.3.4`, `1.3.5`]
1. `com.optum.sourcehawk:sourcehawk-exec`  -> [`0.2.0`, `0.2.1`, `0.2.2`, `0.2.3`, `0.3.0`, `0.4.0`, `0.4.2`, `0.4.3`, `0.4.4`]
1. `de.quantummaid.tutorials.basic-tutorial:step4`  -> [`1.0.24`, `1.0.25`, `1.0.26`, `1.0.27`, `1.0.28`]
1. `io.github.davidwhitlock.cs410J:grader`  -> [`2021.0.0`, `2021.0.1`, `2021.0.2`, `2021.1.0`, `2021.1.1`, `2021.2.0`, `2021.3.0`, `2021.4.0`, `2021.4.1`, `2022.0.0`, `2022.1.0`, `2022.3.0`]
1. `io.github.shuigedeng:taotao-cloud-starter-elk`  -> [`2021.8.1`]
1. `io.rainfall:rainfall-store-server`  -> [`1.5.2`, `1.5.3`]
1. `za.co.bbd:jportal2`  -> [`1.5.4`, `1.5.5`, `1.6.0`, `1.6.1`, `1.6.2`]

## jakarta.activation

For example, at least 10 artifacts on Maven Central claim to be the module `jakarta.activation`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires jakarta.activation;`.

1. `com.cognite.spark.datasource:cdf-spark-datasource-fat_2.12`  -> [`1.4.55`, `1.4.56`, `1.4.57`, `1.4.58`, `1.4.59`, `1.4.61`, `1.4.62`, `1.4.63`, `1.4.64`, `1.4.66`, `1.4.67`, `2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.4`, `2.0.6`, `2.0.7`, `2.0.8`, `2.0.9`]
1. `com.cognite.spark.datasource:cdf-spark-datasource-fat_2.13`  -> [`1.4.64`, `1.4.66`, `1.4.67`, `2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.4`, `2.0.6`, `2.0.7`, `2.0.8`, `2.0.9`]
1. `com.guicedee.services:jakarta.activation`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.thirdparty:jakarta.activation`  -> [`0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.sun.activation:jakarta.activation`  -> [`2.0.0-rc1`, `2.0.0-RC2`, `2.0.0-RC3`, `2.0.0`, `2.0.1`]
1. `com.typesafe.play:shaded-asynchttpclient`  -> [`2.2.0-M1`]
1. `jakarta.activation:jakarta.activation-api` 🧩 -> [`2.0.0-rc1`, `2.0.0-RC2`, `2.0.0-RC3`, `2.0.0`, `2.0.1`, `2.1.0-RC1`, `2.1.0`]
1. `org.apache.servicemix.specs:org.apache.servicemix.specs.activation-api-2.0.1`  -> [`2.0.1_1`]
1. `org.apache.sling:org.apache.sling.javax.activation`  -> [`0.2.0`, `0.3.0`]
1. `org.keycloak:kcinit`  -> [`13.0.0`, `13.0.1`, `14.0.0`, `15.0.0`, `15.0.1`, `15.0.2`, `15.1.1`]

## kotlin.reflect

1. `app.cash.backfila:service-lib`  -> [`0.1.3-20210127.1838-76ab4fc`]
1. `io.github.c-fraser:moka-dsl`  -> [`0.2.14`]
1. `org.jetbrains.kotlin:kotlin-osgi-bundle`  -> [`1.4.0-rc`, `1.4.20-M1`, `1.4.20-RC`, `1.4.20`, `1.4.30-M1`, `1.4.30-RC`, `1.4.31`, `1.5.0-M1`, `1.5.0-RC`, `1.5.0`, `1.5.10`, `1.5.20-M1`, `1.5.20-RC`, `1.5.21`, `1.6.10-RC`, `1.6.20-RC`, `1.7.0-Beta`]
1. `org.jetbrains.kotlin:kotlin-reflect` 🧩 -> [`1.4.0-rc`, `1.4.0`, `1.4.10`, `1.4.20-M1`, `1.4.20-RC`, `1.4.20`, `1.4.21`, `1.4.30-M1`, `1.4.30-RC`, `1.4.30`, `1.4.31`, `1.5.0-M1`, `1.5.0-M2`, `1.5.0-RC`, `1.5.0`, `1.5.10`, `1.5.20-M1`, `1.5.20-RC`, `1.5.20`, `1.5.21`, `1.5.30-M1`, `1.5.30-RC`, `1.5.30`, `1.5.31`, `1.6.0-M1`, `1.6.0-RC`, `1.6.0-RC2`, `1.6.0`, `1.6.10-RC`, `1.6.10`, `1.6.20-M1`, `1.6.20-RC`, `1.6.20-RC2`, `1.6.20`, `1.6.21`, `1.7.0-Beta`]
1. `org.jetbrains.lets-plot:lets-plot-batik`  -> [`2.0.1`, `2.0.5-rc1`, `2.1.0-rc1`, `2.1.0`, `2.2.0-rc1`, `2.2.0-rc2`, `2.2.0-rc3`, `2.2.0`]
1. `org.jetbrains.lets-plot:lets-plot-common`  -> [`2.0.1`, `2.0.2-rc1`, `2.0.2`, `2.0.3-rc1`, `2.0.3-rc2`, `2.0.3`, `2.0.4`, `2.0.5-rc1`, `2.1.0-rc1`, `2.1.0`, `2.2.0-rc1`, `2.2.0-rc2`, `2.2.0-rc3`, `2.2.0`]
1. `org.jetbrains.lets-plot:lets-plot-jfx`  -> [`2.0.1`, `2.0.5-rc1`, `2.1.0-rc1`, `2.1.0`, `2.2.0-rc1`, `2.2.0-rc2`, `2.2.0-rc3`, `2.2.0`]
1. `org.sonarsource.slang:sonar-kotlin-plugin`  -> [`1.8.0.1775`, `1.8.1.1804`, `1.8.2.1946`, `1.8.3.2219`]

## org.graalvm.js

1. `io.nosqlbench:driver-cql-shaded`  -> [`4.15.31`, `4.15.33`, `4.15.34`, `4.15.35`, `4.15.36`, `4.15.37`, `4.15.38`, `4.15.39`, `4.15.40`, `4.15.41`, `4.15.42`, `4.15.43`, `4.15.44`, `4.15.45`, `4.15.46`, `4.15.47`, `4.15.48`, `4.15.49`, `4.15.50`, `4.15.52`, `4.15.53`, `4.15.54`, `4.15.55`, `4.15.56`, `4.15.57`, `4.15.58`, `4.15.59`, `4.15.60`, `4.15.61`, `4.15.62`, `4.15.63`, `4.15.64`, `4.15.70`, `4.15.72`, `4.15.82`, `4.15.83`, `4.15.84`, `4.15.85`, `4.15.86`, `4.15.87`, `4.15.88`, `4.15.89`, `4.15.90`]
1. `io.nosqlbench:driver-cqld3-shaded`  -> [`4.15.31`, `4.15.33`, `4.15.34`, `4.15.35`, `4.15.36`, `4.15.37`, `4.15.38`, `4.15.39`, `4.15.40`, `4.15.41`, `4.15.42`, `4.15.43`, `4.15.44`, `4.15.45`, `4.15.46`, `4.15.47`, `4.15.48`, `4.15.49`, `4.15.50`, `4.15.52`, `4.15.53`, `4.15.54`, `4.15.55`, `4.15.56`, `4.15.57`, `4.15.58`, `4.15.59`, `4.15.60`, `4.15.61`, `4.15.62`, `4.15.63`, `4.15.64`, `4.15.70`, `4.15.72`, `4.15.82`, `4.15.83`, `4.15.84`, `4.15.85`, `4.15.86`, `4.15.87`, `4.15.88`, `4.15.89`, `4.15.90`]
1. `io.nosqlbench:driver-dsegraph-shaded`  -> [`4.15.31`, `4.15.33`, `4.15.34`, `4.15.35`, `4.15.36`, `4.15.37`, `4.15.38`, `4.15.39`, `4.15.40`, `4.15.41`, `4.15.42`, `4.15.43`, `4.15.44`, `4.15.45`, `4.15.46`, `4.15.47`, `4.15.48`, `4.15.49`, `4.15.50`, `4.15.52`, `4.15.53`, `4.15.54`, `4.15.55`, `4.15.56`, `4.15.57`, `4.15.58`, `4.15.59`, `4.15.60`, `4.15.61`, `4.15.62`, `4.15.63`, `4.15.64`, `4.15.70`, `4.15.72`, `4.15.82`, `4.15.83`, `4.15.84`, `4.15.85`, `4.15.86`, `4.15.87`, `4.15.88`, `4.15.89`, `4.15.90`]
1. `org.graalvm.js:js` 🧩 -> [`20.0.0`, `20.1.0`, `20.2.0`, `20.3.0`, `21.0.0`, `21.0.0.2`, `21.1.0`, `21.2.0`, `21.3.0`, `22.0.0`, `22.0.0.2`]
1. `org.graphwalker:graphwalker-cli`  -> [`4.3.0`, `4.3.1`]
1. `org.noear:luffy.executor.s.graaljs`  -> [`1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.1.0`, `1.1.1`, `1.1.3`, `1.1.5`, `1.1.6`, `1.1.7`, `1.1.8`, `1.1.9`, `1.1.10`, `1.1.11`, `1.1.12`, `1.1.13`, `1.1.14`, `1.1.15`, `1.1.16`, `1.2.0`, `1.2.1`]
1. `org.noear:solonjt.actuator.s.graaljs`  -> [`1.0.1`]
1. `org.noear:solonjt.executor.s.graaljs`  -> [`1.0.3.2`, `1.0.3.9`, `1.0.4.3`, `1.0.4.5`, `1.0.4.6`, `1.0.5`, `1.0.6`]

## org.joda.convert

1. `com.expedia.www:haystack-service-graph-node-finder`  -> [`1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`, `1.0.10`, `1.0.12`, `1.0.13`, `1.0.14`, `1.0.15`, `1.0.16`, `1.0.17`, `1.0.18`, `1.0.19`]
1. `com.vmlens:plugin.sync.bug`  -> [`1.0.14`, `1.0.15`, `1.1.0`]
1. `eu.xenit.care4alf:care4alf-5x`  -> [`2.1.1`, `2.1.2`, `2.1.3`, `2.2.1`, `2.3.0`, `2.4.0`, `2.5.0`]
1. `eu.xenit.care4alf:care4alf-6x`  -> [`2.1.1`, `2.1.2`, `2.1.3`, `2.2.1`, `2.3.0`, `2.4.0`, `2.5.0`]
1. `eu.xenit.care4alf:care4alf-7x`  -> [`2.4.0`, `2.5.0`]
1. `org.joda:joda-convert` 🧩 -> [`2.1.1`, `2.1.2`, `2.2.0`, `2.2.1`, `2.2.2`]
1. `za.co.absa:atum-examples-s3-sdk-extension_2.12`  -> [`3.6.0`, `3.7.0`]
1. `za.co.absa:atum-examples_2.12`  -> [`3.6.0`, `3.7.0`]

## org.objectweb.asm.util

1. `com.github.luxlang:lux-jvm`  -> [`0.6.0`, `0.6.1`, `0.6.2`, `0.6.3`, `0.6.4`, `0.6.5`]
1. `com.github.luxlang:lux-python`  -> [`0.6.0`]
1. `com.github.luxlang:lux-ruby`  -> [`0.6.0`, `0.6.1`, `0.6.2`, `0.6.3`, `0.6.4`, `0.6.5`]
1. `com.github.pxav.kelp:core`  -> [`0.0.5`]
1. `com.rookout:rook`  -> [`0.1.65`, `0.1.66`, `0.1.67`, `0.1.68`, `0.1.69`, `0.1.70`, `0.1.71`, `0.1.72`, `0.1.73`, `0.1.74`, `0.1.75`, `0.1.76`, `0.1.77`, `0.1.78`, `0.1.79`, `0.1.80`, `0.1.81`, `0.1.82`, `0.1.83`, `0.1.84`, `0.1.85`, `0.1.86`, `0.1.87`, `0.1.88`, `0.1.89`, `0.1.90`, `0.1.91`, `0.1.92`, `0.1.93`, `0.1.94`, `0.1.95`, `0.1.96`, `0.1.97`, `0.1.98`, `0.1.99`, `0.1.100`, `0.1.101`, `0.1.102`, `0.1.103`, `0.1.104`, `0.1.105`, `0.1.106`, `0.1.107`, `0.1.108`, `0.1.109`, `0.1.110`, `0.1.111`, `0.1.112`, `0.1.113`, `0.1.114`, `0.1.115`, `0.1.116`, `0.1.117`, `0.1.118`, `0.1.119`, `0.1.120`, `0.1.121`, `0.1.122`, `0.1.123`, `0.1.124`, `0.1.125`, `0.1.126`, `0.1.127`, `0.1.128`, `0.1.129`, `0.1.130`, `0.1.132`, `0.1.133`, `0.1.134`, `0.1.135`, `0.1.136`, `0.1.137`, `0.1.138`, `0.1.139`, `0.1.140`, `0.1.141`, `0.1.142`, `0.1.143`, `0.1.144`, `0.1.145`, `0.1.146`, `0.1.147`, `0.1.148`, `0.1.149`, `0.1.150`, `0.1.151`, `0.1.152`, `0.1.153`, `0.1.154`, `0.1.155`, `0.1.156`, `0.1.157`, `0.1.158`, `0.1.159`, `0.1.160`, `0.1.161`, `0.1.162`, `0.1.163`, `0.1.164`, `0.1.165`, `0.1.166`, `0.1.167`, `0.1.168`, `0.1.169`, `0.1.170`, `0.1.171`, `0.1.172`, `0.1.173`, `0.1.174`, `0.1.175`, `0.1.176`, `0.1.177`, `0.1.178`, `0.1.179`, `0.1.180`, `0.1.181`, `0.1.182`, `0.1.183`, `0.1.184`, `0.1.185`, `0.1.186`, `0.1.187`, `0.1.188`, `0.1.189`, `0.1.190`, `0.1.191`, `0.1.192`, `0.1.193`, `0.1.194`, `0.1.195`, `0.1.196`, `0.1.197`, `0.1.198`, `0.1.199`, `0.1.200`, `0.1.201`, `0.1.202`, `0.1.203`, `0.1.204`, `0.1.205`, `0.1.206`, `0.1.207`, `0.1.208`, `0.1.209`, `0.1.210`, `0.1.211`, `0.1.212`, `0.1.213`, `0.1.214`, `0.1.215`, `0.1.216`, `0.1.217`, `0.1.218`, `0.1.219`, `0.1.220`, `0.1.221`, `0.1.222`, `0.1.223`, `0.1.224`, `0.1.225`]
1. `io.btrace:btrace-client`  -> [`2.2.0`, `2.2.2`]
1. `org.activecomponents.jadex:jadex-editor-bpmn`  -> [`4.0.244`, `4.0.249`, `4.0.250`, `4.0.252`, `4.0.254`, `4.0.255`, `4.0.256`, `4.0.257`, `4.0.258`, `4.0.260`, `4.0.261`, `4.0.262`, `4.0.263`, `4.0.264`, `4.0.265`]
1. `org.ow2.asm:asm-util` 🧩 -> [`6.2.1`, `7.0-beta`, `7.0`, `7.1`, `7.2-beta`, `7.2`, `7.3.1`, `8.0`, `8.0.1`, `9.0-beta`, `9.0`, `9.1`, `9.2`, `9.3`]

## org.beryx.awt.color

1. `org.apache.sedona:sedona-viz-2.4_2.11`  -> [`1.0.0-incubating`, `1.0.1-incubating`, `1.1.0-incubating`, `1.1.1-incubating`, `1.2.0-incubating`]
1. `org.apache.sedona:sedona-viz-2.4_2.12`  -> [`1.0.0-incubating`, `1.0.1-incubating`, `1.1.0-incubating`, `1.1.1-incubating`, `1.2.0-incubating`]
1. `org.apache.sedona:sedona-viz-3.0_2.12`  -> [`1.0.0-incubating`, `1.0.1-incubating`, `1.1.0-incubating`, `1.1.1-incubating`, `1.2.0-incubating`]
1. `org.beryx:awt-color-factory` 🧩 -> [`1.0.0`, `1.0.1`, `1.0.2`]
1. `org.datasyslab:geospark-viz_2.1`  -> [`1.2.0`, `1.3.0`, `1.3.1`]
1. `org.datasyslab:geospark-viz_2.2`  -> [`1.2.0`, `1.3.0`, `1.3.1`]
1. `org.datasyslab:geospark-viz_2.3`  -> [`1.2.0`, `1.3.0`, `1.3.1`]

## org.bouncycastle.mail

1. `org.apache.tika:tika-app`  -> [`1.22`, `1.23`, `1.24`, `1.24.1`, `1.25`, `2.0.0-ALPHA`, `2.0.0-BETA`, `2.0.0`, `2.1.0`, `2.2.0`, `2.2.1`, `2.4.0`]
1. `org.apache.tika:tika-server`  -> [`1.22`, `1.23`, `1.24`, `1.24.1`, `1.25`]
1. `org.bouncycastle:bcjmail-jdk15on`  -> [`1.69`, `1.70`]
1. `org.bouncycastle:bcjmail-jdk18on`  -> [`1.71`]
1. `org.bouncycastle:bcmail-fips`  -> [`1.0.2`, `1.0.3`]
1. `org.bouncycastle:bcmail-jdk15on`  -> [`1.61`, `1.62`, `1.63`, `1.64`, `1.65`, `1.66`, `1.67`, `1.68`, `1.69`, `1.70`]
1. `org.bouncycastle:bcmail-jdk18on` 🧩 -> [`1.71`]

## org.burningwave.core

1. `ml.karmaconfigs:KarmaAPI-Bukkit`  -> [`1.3.2`]
1. `ml.karmaconfigs:KarmaAPI-Bundle`  -> [`1.3.2`]
1. `ml.karmaconfigs:KarmaAPI-Bungee`  -> [`1.3.2`]
1. `ml.karmaconfigs:KarmaAPI-Common`  -> [`1.3.2`]
1. `ml.karmaconfigs:KarmaAPI-Velocity`  -> [`1.3.2`]
1. `ml.karmaconfigs:RemoteMessaging`  -> [`1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`, `1.1.0`, `1.1.1`, `1.1.4`, `1.1.5`, `1.1.6`, `1.1.7`]
1. `org.burningwave:core` 🧩 -> [`11.0.0`, `11.0.1`, `11.0.2`, `11.0.3`, `11.0.4`, `11.0.5`, `11.0.6`, `12.0.0`, `12.1.0`, `12.1.1`, `12.1.2`, `12.1.3`, `12.1.4`, `12.2.0`, `12.2.1`, `12.2.2`, `12.3.0`, `12.3.1`, `12.4.0`, `12.5.0`, `12.5.1`, `12.5.3`, `12.6.0`, `12.7.0`, `12.8.0`, `12.8.1`, `12.8.2`, `12.9.0`, `12.9.1`, `12.9.2`, `12.9.3`, `12.10.0`, `12.11.0`, `12.11.1`, `12.11.2`, `12.11.3`, `12.11.4`, `12.12.0`, `12.12.1`, `12.12.2`, `12.12.3`, `12.12.4`, `12.12.5`, `12.12.6`, `12.13.0`, `12.13.1`, `12.13.2`, `12.13.3`, `12.13.4`, `12.14.0`, `12.15.0`, `12.15.1`, `12.15.2`, `12.15.3`, `12.15.4`, `12.15.5`, `12.15.6`, `12.15.7`, `12.15.8`, `12.16.0`, `12.16.1`, `12.16.2`, `12.17.0`, `12.18.0`, `12.19.0`, `12.20.0`, `12.20.1`, `12.21.0`, `12.22.0`, `12.23.0`, `12.24.0`, `12.24.1`, `12.24.2`, `12.25.0`, `12.26.1`, `12.26.2`, `12.26.3`, `12.26.4`, `12.27.0`, `12.28.0`, `12.29.1`, `12.29.2`, `12.29.3`, `12.30.0`, `12.31.0`, `12.32.0`, `12.33.0`, `12.34.0`, `12.34.1`, `12.35.0`, `12.36.0`, `12.38.0`, `12.38.2`, `12.38.3`, `12.39.1`, `12.39.2`, `12.39.3`, `12.39.5`, `12.39.6`, `12.39.7`, `12.39.8`, `12.40.0`, `12.40.1`, `12.41.0`, `12.41.1`, `12.41.2`, `12.42.0`, `12.42.1`, `12.43.0`, `12.43.1`, `12.44.0`, `12.45.0`, `12.45.1`, `12.45.2`, `12.45.3`, `12.45.4`, `12.46.0`, `12.47.0`, `12.48.0`]

## org.bytedeco.javacpp

1. `com.alibaba.alink:shaded_tensorflow_core_api`  -> [`0.2.0-0.3`, `0.2.0-0.4`]
1. `org.bytedeco:javacpp` 🧩 -> [`1.5`, `1.5.1`, `1.5.1-1`, `1.5.2`, `1.5.3`, `1.5.4`, `1.5.5`, `1.5.6`, `1.5.7`]
1. `org.deeplearning4j:deeplearning4j-ui-standalone`  -> [`1.0.0-beta4`, `1.0.0-beta5`]
1. `org.deeplearning4j:jumpy`  -> [`1.0.0-beta4`, `1.0.0-beta5`, `1.0.0-beta6`, `1.0.0-beta7`]
1. `org.deeplearning4j:pydl4j`  -> [`1.0.0-beta4`, `1.0.0-beta5`, `1.0.0-beta6`, `1.0.0-beta7`]
1. `org.flinkextended:dl-on-flink-examples`  -> [`0.4.0`]
1. `org.nd4j:nd4j-uberjar`  -> [`1.0.0-beta5`, `1.0.0-beta6`, `1.0.0-beta7`]

## org.codehaus.stax2

1. `com.exasol:parquet-io-java`  -> [`1.2.0`, `1.2.1`, `1.3.0`]
1. `com.github.zuinnote:hadoopoffice-flinkts_2.11`  -> [`1.4.0`, `1.5.0`]
1. `com.github.zuinnote:hadoopoffice-flinkts_2.12`  -> [`1.4.0`, `1.5.0`]
1. `com.github.zuinnote:spark-hadoopoffice-ds_2.11`  -> [`1.4.0`, `1.5.0`]
1. `com.github.zuinnote:spark-hadoopoffice-ds_2.12`  -> [`1.4.0`, `1.5.0`]
1. `com.onelogin:onelogin-aws-assume-role-cli`  -> [`1.1.3`]
1. `org.codehaus.woodstox:stax2-api`  -> [`4.2`, `4.2.1`]

## com.blazebit.persistence.integration.spring.data.impl

1. `com.blazebit:blaze-persistence-integration-spring-data-1.x`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-spring-data-2.0`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-spring-data-2.1`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-spring-data-2.2`  -> [`1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-spring-data-2.3`  -> [`1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.6.6`]
1. `com.blazebit:blaze-persistence-integration-spring-data-2.4` 🧩 -> [`1.6.0-Alpha2`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.6.6`]

## com.fasterxml.jackson.dataformat.cbor

1. `com.amazonaws:aws-xray-agent-plugin`  -> [`2.7.1`, `2.8.0`, `2.9.0`, `2.9.1`]
1. `com.fasterxml.jackson.dataformat:jackson-dataformat-cbor` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `org.apache.beam:beam-sdks-java-io-kinesis-expansion-service`  -> [`2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`, `2.34.0`, `2.35.0`, `2.36.0`, `2.37.0`, `2.38.0`]
1. `org.duracloud.snapshot:snapshot-service-impl`  -> [`3.1.0`]
1. `org.elasticsearch.plugin:x-pack-sql-jdbc`  -> [`7.8.1`, `7.9.0`, `7.9.1`, `7.9.2`, `7.9.3`, `7.10.0`, `7.10.1`, `7.10.2`, `7.11.0`, `7.11.1`, `7.11.2`, `7.12.0`, `7.12.1`, `7.13.0`, `7.13.1`]
1. `software.amazon.awssdk:third-party-jackson-dataformat-cbor`  -> [`2.17.108`, `2.17.109`, `2.17.110`, `2.17.111`, `2.17.112`, `2.17.113`, `2.17.114`, `2.17.115`, `2.17.116`, `2.17.117`, `2.17.118`, `2.17.119`, `2.17.120`, `2.17.121`, `2.17.122`, `2.17.123`, `2.17.124`, `2.17.125`, `2.17.126`, `2.17.127`, `2.17.128`, `2.17.129`, `2.17.130`, `2.17.131`, `2.17.132`, `2.17.133`, `2.17.134`, `2.17.135`, `2.17.136`, `2.17.137`, `2.17.138`, `2.17.139`, `2.17.140`, `2.17.141`, `2.17.142`, `2.17.143`, `2.17.144`, `2.17.145`, `2.17.146`, `2.17.147`, `2.17.148`, `2.17.149`, `2.17.150`, `2.17.151`, `2.17.152`, `2.17.153`, `2.17.154`, `2.17.155`, `2.17.156`, `2.17.157`, `2.17.158`, `2.17.159`, `2.17.160`, `2.17.161`, `2.17.162`, `2.17.163`, `2.17.164`, `2.17.165`, `2.17.166`, `2.17.167`, `2.17.168`, `2.17.169`, `2.17.170`, `2.17.171`, `2.17.172`, `2.17.173`, `2.17.174`, `2.17.175`, `2.17.176`, `2.17.177`, `2.17.178`, `2.17.179`, `2.17.180`, `2.17.181`, `2.17.182`, `2.17.183`, `2.17.184`, `2.17.185`, `2.17.186`, `2.17.187`, `2.17.188`]

## com.fasterxml.jackson.dataformat.csv

1. `com.fasterxml.jackson.dataformat:jackson-dataformat-csv` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `com.hortonworks.registries:avro-examples`  -> [`0.9.0`, `0.9.1`]
1. `org.apache.beam:beam-runners-samza-job-server`  -> [`2.27.0`, `2.28.0`, `2.29.0`, `2.30.0`, `2.31.0`, `2.32.0`, `2.33.0`]
1. `org.apache.beam:beam-sdks-java-extensions-sql-jdbc`  -> [`2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.beam:beam-sdks-java-io-debezium-expansion-service`  -> [`2.36.0`, `2.37.0`, `2.38.0`]
1. `org.apache.beam:beam-sdks-java-io-expansion-service`  -> [`2.36.0`, `2.37.0`, `2.38.0`]

## de.carne.swt

1. `de.carne.common:java-swt-cocoa-macosx-x86_64`  -> [`4.0.0`]
1. `de.carne.common:java-swt-gtk-linux-x86_64`  -> [`4.0.0`]
1. `de.carne.common:java-swt-win32-win32-x86_64`  -> [`4.0.0`]
1. `de.carne:java-swt-cocoa-macosx-x86_64`  -> [`4.0.1`, `4.0.2`]
1. `de.carne:java-swt-gtk-linux-x86_64`  -> [`4.0.1`, `4.0.2`]
1. `de.carne:java-swt-win32-win32-x86_64` 🧩 -> [`4.0.1`, `4.0.2`]

## de.carne.test.swt

1. `de.carne.common:java-test-swt-cocoa-macosx-x86_64`  -> [`4.0.0`]
1. `de.carne.common:java-test-swt-gtk-linux-x86_64`  -> [`4.0.0`]
1. `de.carne.common:java-test-swt-win32-win32-x86_64`  -> [`4.0.0`]
1. `de.carne:java-test-swt-cocoa-macosx-x86_64`  -> [`4.0.1`, `4.0.2`]
1. `de.carne:java-test-swt-gtk-linux-x86_64`  -> [`4.0.1`, `4.0.2`]
1. `de.carne:java-test-swt-win32-win32-x86_64` 🧩 -> [`4.0.1`, `4.0.2`]

## org.apache.poi.poi

1. `ch.exense.step.library:step-library-kw-excel`  -> [`1.0.7`, `1.0.8`, `2021.08.18-ID174e3d1`]
1. `org.apache.poi:poi` 🧩 -> [`5.0.0`, `5.1.0`, `5.2.0`, `5.2.1`, `5.2.2`]
1. `org.apache.tika:tika-app`  -> [`2.3.0`]
1. `org.datakurator:kurator-ffdq`  -> [`2.0.0`]
1. `org.lucee:poi`  -> [`5.0.0`]
1. `xyz.ottr.lutra:lutra-cli`  -> [`0.6.11`]

## org.glassfish.java.json

1. `com.github.mibo:jaxrsdoc`  -> [`1.1.0`]
1. `com.sebastian-daschner:jaxrs-analyzer`  -> [`0.16`, `0.17`]
1. `com.smartcar.sdk:java-sdk`  -> [`2.7.6`, `2.7.7`, `2.8.0`, `2.8.1`, `2.8.2`]
1. `cz.cuni.mff.d3s.spl:spl-evaluation-java`  -> [`1.0.4`]
1. `org.glassfish:javax.json` 🧩 -> [`1.1.2`, `1.1.3`]
1. `tech.b180.cordaptor:glassfish-javax-json-shaded`  -> [`1.1`]

## org.objectweb.asm.tree

1. `com.autonomousapps:dependency-analysis-gradle-plugin`  -> [`0.31.1`, `0.31.5`, `0.32.0`, `0.33.0`, `0.34.0`, `0.35.0`, `0.36.0`, `0.37.0`, `0.38.0`, `0.39.0`, `0.40.0`, `0.41.0`, `0.42.0`, `0.43.0`, `0.44.0`, `0.45.0`, `0.46.0`, `0.47.0`, `0.48.0`, `0.49.0`, `0.50.0`, `0.52.0`, `0.53.0`, `0.54.0`, `0.55.0`, `0.56.0`, `0.57.0`, `0.58.0`, `0.59.0`, `0.60.0`, `0.61.0`, `0.62.0`, `0.63.0`, `0.64.0`, `0.65.0`, `0.66.0`, `0.67.0`, `0.68.0`, `0.69.0`, `0.70.0`, `0.71.0`, `0.72.0`, `0.73.0`, `0.74.0`, `0.75.0`, `0.76.0`, `0.77.0`, `0.78.0`, `0.79.0`, `0.80.0`, `1.0.0-rc01`, `1.0.0-rc02`, `1.0.0-rc03`, `1.0.0-rc04`, `1.0.0-rc05`, `1.0.0-rc06`, `1.0.0`, `1.1.0`, `1.2.0`]
1. `com.guujiang:jacob-core`  -> [`0.0.1`]
1. `com.uber.nullaway:jar-infer-cli`  -> [`0.7.6`, `0.7.7`, `0.7.8`, `0.7.9`, `0.7.10`, `0.8.0`, `0.9.0`, `0.9.1`, `0.9.2`, `0.9.3`, `0.9.4`, `0.9.5`, `0.9.6`, `0.9.7`]
1. `io.joynr.tools.generator:joynr-generator-standalone`  -> [`1.17.0`, `1.17.1`, `1.17.2`, `1.17.3`, `1.17.4`, `1.17.5`, `1.17.6`, `1.17.7`, `1.17.8`, `1.18.0`, `1.18.1`, `1.19.0`, `1.19.1`, `1.19.2`, `1.19.3`, `1.19.4`, `1.19.5`, `1.19.6`, `1.19.7`, `1.19.8`, `1.19.9`, `1.19.10`, `1.19.11`, `1.19.12`]
1. `org.netbeans.external:asm-tree-7.2`  -> [`RELEASE113`]
1. `org.ow2.asm:asm-tree` 🧩 -> [`6.2.1`, `7.0-beta`, `7.0`, `7.1`, `7.2-beta`, `7.2`, `7.3.1`, `8.0`, `8.0.1`, `9.0-beta`, `9.0`, `9.1`, `9.2`, `9.3`]

## org.opentest4j

1. `com.github.tandronicus:ezperf4j`  -> [`0.1`]
1. `io.github.origin-energy:java-snapshot-testing-core`  -> [`3.2.6`, `3.2.7`]
1. `io.github.origin-energy:java-snapshot-testing-junit4`  -> [`3.2.6`, `3.2.7`]
1. `io.github.origin-energy:java-snapshot-testing-junit5`  -> [`3.2.6`, `3.2.7`]
1. `io.github.origin-energy:java-snapshot-testing-spock`  -> [`3.2.6`, `3.2.7`]
1. `org.opentest4j:opentest4j` 🧩 -> [`1.2.0`]

## com.amihaiemil.eoyaml

1. `com.amihaiemil.web:eo-yaml`  -> [`4.3.0`, `4.3.1`, `4.3.2`, `4.3.3`, `4.3.4`, `4.3.5`, `5.0.0`, `5.0.1`, `5.0.2`, `5.0.3`, `5.1.0`, `5.1.1`, `5.1.2`, `5.1.3`, `5.1.4`, `5.1.5`, `5.1.6`, `5.1.7`, `5.1.8`, `5.1.9`, `5.2.0`, `5.2.1`, `5.2.2`, `5.2.3`, `6.0.0`, `6.0.1`]
1. `io.github.portlek:configs-bukkit`  -> [`4.7`, `4.7.1`, `4.7.2`, `4.7.3`, `4.7.4`, `4.7.5`]
1. `io.github.portlek:configs-bungeecord`  -> [`4.7`, `4.7.1`, `4.7.2`, `4.7.3`, `4.7.4`, `4.7.5`]
1. `io.github.portlek:configs-core`  -> [`4.7`, `4.7.1`, `4.7.2`, `4.7.3`, `4.7.4`, `4.7.5`]
1. `io.github.portlek:configs-nukkit`  -> [`4.7`, `4.7.1`, `4.7.2`, `4.7.3`, `4.7.4`, `4.7.5`]

## com.ctc.wstx

1. `com.fasterxml.woodstox:woodstox-core`  -> [`6.0.0.pr1`, `6.0.0.pr2`, `6.0.1`, `6.0.2`, `6.0.3`, `6.1.0`, `6.1.1`, `6.2.0`, `6.2.1`, `6.2.2`, `6.2.3`, `6.2.4`, `6.2.5`, `6.2.6`, `6.2.7`, `6.2.8`]
1. `com.github.zuinnote:spark-hadoopoffice-ds_2.11`  -> [`1.6.3`, `1.6.4`]
1. `com.github.zuinnote:spark-hadoopoffice-ds_2.12`  -> [`1.6.3`, `1.6.4`]
1. `org.sonarsource.slang:sonar-go-plugin`  -> [`1.9.0.3429`]
1. `org.sonarsource.slang:sonar-scala-plugin`  -> [`1.9.0.3429`]

## com.fasterxml.jackson.datatype.guava

1. `com.fasterxml.jackson.datatype:jackson-datatype-guava` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `com.github.priytam:exampleApp`  -> [`1.0`, `1.1`, `1.1-java-8`, `1.2-java-8`, `1.3-java-8`, `1.4-java-8`, `1.5.1`]
1. `io.github.marquezproject:marquez`  -> [`0.11.1-rc.4`, `0.11.1`, `0.11.2`, `0.11.3-rc.1`, `0.11.3-rc.2`, `0.11.3-rc.3`, `0.11.3-rc.4`, `0.11.3`, `0.11.4-rc.1`, `0.11.4-rc.2`, `0.11.4-rc.3`]
1. `io.pravega:pravega-test-system`  -> [`0.10.0`, `0.10.1`, `0.10.2`]
1. `org.openapitools:openapi-generator-cli`  -> [`6.0.0-beta`]

## com.jwebmp.guicedpersistence.wildfly

1. `com.guicedee.persistence:guiced-persistence-wildfly`  -> [`1.0.1.0`, `1.0.1.1`, `1.0.1.2`, `1.0.1.3`, `1.0.1.4`, `1.0.1.5`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.0.14.3-jre8`, `1.0.14.4-jre8`, `1.0.15.3-jre8`, `1.0.15.4-jre8`, `1.0.15.5-jre8`, `1.0.19.6-jre8`, `1.0.19.8-jre8`]
1. `com.jwebmp.guicedee.persistence:guiced-persistence-wildfly`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:guiced-persistence-wildfly`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:guiced-persistence-wildfly`  -> [`0.62.0.1`]
1. `com.jwebmp:guiced-persistence-wildfly` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqueryui

1. `com.jwebmp.jre10:jwebmp-jquery-ui-themes-nestable`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre10:jwebmp-jquery-ui`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-jquery-ui`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-jquery-ui` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-jquery-ui`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## jakarta.mail

1. `com.guicedee.services:jakarta.mail`  -> [`1.0.1.0`, `1.0.1.0-jre12`, `1.0.1.0-jre13`, `1.0.1.1`, `1.0.1.1-jre12`, `1.0.1.1-jre13`, `1.0.1.2`, `1.0.1.3`, `1.0.1.3-jre12`, `1.0.1.3-jre13`, `1.0.1.4`, `1.0.1.4-jre8`, `1.0.1.4-jre12`, `1.0.1.4-jre13`, `1.0.1.5`, `1.0.1.5-jre12`, `1.0.1.5-jre13`, `1.0.1.6`, `1.0.1.6-jre12`, `1.0.1.6-jre13`, `1.0.1.7`, `1.0.1.7-jre8`, `1.0.1.7-jre12`, `1.0.1.7-jre13`, `1.0.2.0`, `1.0.2.0-jre8`, `1.0.2.0-jre12`, `1.0.2.0-jre13`, `1.0.2.1`, `1.0.2.1-jre12`, `1.0.2.1-jre13`, `1.0.2.2`, `1.0.2.2-jre8`, `1.0.2.2-jre12`, `1.0.2.2-jre13`, `1.0.2.3`, `1.0.2.3-jre8`, `1.0.2.3-jre12`, `1.0.2.3-jre13`, `1.0.2.4`, `1.0.2.4-jre12`, `1.0.2.4-jre13`, `1.0.2.6-jre13`, `1.0.2.7-jre13`, `1.0.2.8`, `1.0.2.8-jre13`, `1.0.2.9-jre13`, `1.0.2.10-jre13`, `1.0.2.11-jre13`, `1.0.2.12-jre13`, `1.0.2.13-jre13`, `1.0.2.14-jre13`, `1.0.2.15-jre13`, `1.0.2.16-jre13`, `1.0.2.17-jre13`, `1.0.2.18-jre13`, `1.0.3.1-jre13`, `1.0.3.2-jre13`, `1.0.3.3-jre13`, `1.0.4.1-jre13`, `1.0.4.2-jre13`, `1.0.4.3-jre13`, `1.0.4.4-jre13`, `1.0.5.0-jre13`, `1.0.5.1-jre13`, `1.0.5.2-jre13`, `1.0.5.3-jre13`, `1.0.5.4-jre13`, `1.0.5.4-jre14`, `1.0.5.5-jre14`, `1.0.6.1-jre14`, `1.0.6.2-jre14`, `1.0.6.3-jre14`, `1.0.6.4-jre14`, `1.0.6.5-jre14`, `1.0.6.7-jre14`, `1.0.7.0-jre14`, `1.0.7.1-jre14`, `1.0.7.2-jre14`, `1.0.7.3-jre14`, `1.0.7.4-jre14`, `1.0.7.5-jre14`, `1.0.7.6-jre14`, `1.0.7.9-jre14`, `1.0.7.10-jre14`, `1.0.7.11-jre14`, `1.0.7.12-jre14`, `1.0.8.1-jre14`, `1.0.8.2-jre14`, `1.0.8.3-jre14`, `1.0.8.4-jre14`, `1.0.8.5-jre14`, `1.0.8.6-jre14`, `1.0.8.12-jre14`, `1.0.8.16-jre14`, `1.0.8.18-jre14`, `1.0.9.0-jre14`, `1.0.9.1-jre14`, `1.0.9.2-jre14`, `1.0.9.3-jre14`, `1.0.9.4-jre14`, `1.0.9.5-jre14`, `1.0.9.7-jre14`, `1.0.9.10-jre14`, `1.0.9.11-jre14`, `1.0.9.13-jre14`, `1.0.9.14-jre14`, `1.0.10.0-jre14`, `1.0.10.1-jre14`, `1.0.10.3-jre14`, `1.0.10.4-jre14`, `1.0.11.0-jre14`, `1.0.11.2-jre14`, `1.0.11.5-jre14`, `1.0.11.6-jre14`, `1.0.11.7-jre14`, `1.0.12.0-jre14`, `1.0.12.1-jre14`, `1.0.12.2-jre14`, `1.0.12.3-jre14`, `1.0.12.4-jre14`, `1.0.12.5-jre14`, `1.0.13.0-jre14`, `1.0.13.1-jre14`, `1.0.13.2-jre14`, `1.0.13.3-jre14`, `1.0.13.4-jre14`, `1.0.13.5-jre14`, `1.0.14.0-RC1-jre14`, `1.0.14.1-jre14`, `1.0.14.3-jre8`, `1.0.14.4-jre8`, `1.0.14.4-jre14`, `1.0.15.1-jre14`, `1.0.15.2-jre14`, `1.0.15.3-jre8`, `1.0.15.3-jre14`, `1.0.15.4-jre8`, `1.0.15.4-jre14`, `1.0.15.5-jre8`, `1.0.15.5-jre14`, `1.0.16.0-jre14`, `1.0.17.0-jre14`, `1.0.17.1-jre14`, `1.0.18.0-jre14`, `1.0.18.0-jre15`, `1.0.18.1-jre14`, `1.0.18.1-jre15`, `1.0.19.0-jre14`, `1.0.19.0-jre15`, `1.0.19.1-jre15`, `1.0.19.2-jre14`, `1.0.19.2-jre15`, `1.0.19.3-jre14`, `1.0.19.3-jre15`, `1.0.19.4-jre14`, `1.0.19.4-jre15`, `1.0.19.5-jre14`, `1.0.19.5-jre15`, `1.0.19.6-jre8`, `1.0.19.6-jre14`, `1.0.19.7-jre14`, `1.0.19.8-jre8`, `1.0.19.9-jre8`, `1.0.19.9-jre14`, `1.0.19.9-jre15`, `1.0.19.10-jre8`, `1.0.19.10-jre14`, `1.0.19.10-jre15`, `1.0.19.11-jre8`, `1.0.19.11-jre14`, `1.0.19.12-jre8`, `1.0.19.12-jre14`, `1.0.19.13-jre8`, `1.0.19.13-jre14`, `1.0.19.13-jre15`, `1.0.20.0-jre8`, `1.0.20.0-jre14`, `1.0.20.0-jre15`, `1.0.20.1-jre8`, `1.0.20.1-jre14`, `1.0.20.1-jre15`, `1.0.20.2-jre8`, `1.0.20.2-jre14`, `1.0.20.2-jre15`, `1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`, `1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.0.3-jre17-rc1`, `1.2.1.1-jre17`, `1.2.1.2-jre17`, `1.2.2.1`, `1.2.2.1-jre17`]
1. `com.sun.mail:jakarta.mail`  -> [`2.0.1`]
1. `com.sun.mail:mailapi`  -> [`2.0.1`]
1. `jakarta.mail:jakarta.mail-api` 🧩 -> [`2.0.1`, `2.1.0-RC1`, `2.1.0`]
1. `org.eclipse.angus:jakarta.mail`  -> [`1.0.0-M1`, `1.0.0`]

## java.json.bind

1. `be.valuya.cestzam:cestzam-myminfin-filesystem-sync`  -> [`2021.9.1`, `2022.1.1`]
1. `com.manywho.sdk:sdk-example`  -> [`2.0.0`, `2.0.1`]
1. `io.zeleo.application:zeleo-application-library`  -> [`1.0.1`, `1.0.3`, `1.0.4`]
1. `jakarta.json.bind:jakarta.json.bind-api`  -> [`1.0.1`, `1.0.2`]
1. `org.keycloak:kcinit`  -> [`4.4.0.Final`, `4.5.0.Final`, `4.6.0.Final`, `4.8.0.Final`, `4.8.1.Final`, `4.8.2.Final`, `4.8.3.Final`]

## javax.inject

1. `com.guicedee.services:javax.inject`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.jre11:javax.inject`  -> [`0.63.0.11`, `0.63.0.12`, `0.63.0.13`, `0.63.0.14`, `0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.jwebmp.thirdparty:javax.inject`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp:javax.inject`  -> [`1.1`]
1. `io.avaje:javax.inject`  -> [`1.0`]

## net.kyori.examination.string

1. `com.fastasyncworldedit:FastAsyncWorldEdit-Libs-Core`  -> [`2.0.0`, `2.0.1`, `2.1.0`, `2.1.1`, `2.1.2`]
1. `io.github.fisher2911:FishCore`  -> [`1.0.0`]
1. `net.kyori:examination-string` 🧩 -> [`1.3.0`]
1. `net.silthus.schat:schat-bukkit`  -> [`1.0.0-alpha.5`, `1.0.0`, `1.0.1`]
1. `net.silthus.schat:schat-bungeecord`  -> [`1.0.0-alpha.5`, `1.0.0`, `1.0.1`]

## org.apache.poi.ooxml

1. `com.github.zuinnote:hadoopoffice-hiveserde`  -> [`1.4.0`, `1.5.0`, `1.6.0`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`]
1. `com.github.zuinnote:hiveserde`  -> [`1.6.0`]
1. `com.guicedee.services:apache-poi-ooxml`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `org.apache.poi:poi-ooxml` 🧩 -> [`5.0.0`, `5.1.0`, `5.2.0`, `5.2.1`, `5.2.2`]
1. `org.kie:kie-dmn-xls2dmn-cli`  -> [`8.16.0.Beta`, `8.16.1.Beta`, `8.17.0.Beta`, `8.18.0.Beta`, `8.19.0.Beta`, `8.20.0.Beta`, `8.21.0.Beta`]

## org.eclipse.osgi

1. `io.github.phillima:asniffer`  -> [`2.4.1`, `2.4.2`, `2.4.3`, `2.4.4`]
1. `org.codehaus.groovy:groovy-eclipse-batch`  -> [`3.0.7-03`, `3.0.8-01`]
1. `org.eclipse.platform:org.eclipse.osgi`  -> [`3.16.200`, `3.16.300`, `3.17.0`, `3.17.100`, `3.17.200`]
1. `org.jboss.windup.jdt:windup-eclipse-jdt`  -> [`5.2.0.Alpha1`, `5.2.0.Final`, `5.2.1.Alpha1`, `5.2.1.Final`, `5.3.0.Alpha1`, `5.3.0.Alpha2`, `5.3.0.Alpha3`, `5.3.0.Final`]
1. `org.nasdanika.core:exec-bundle`  -> [`2021.7.3-java-8-b`]

## org.joda.money

1. `org.joda:joda-money` 🧩 -> [`1.0.1`]
1. `org.kill-bill.billing.plugin.java:avatax-plugin`  -> [`0.8.0`]
1. `org.kill-bill.billing.plugin.java:stripe-plugin`  -> [`7.1.0`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-kpm`  -> [`0.40.0`, `0.40.1`, `0.40.2`, `0.40.3`, `0.40.4`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-logger`  -> [`0.40.0`, `0.40.1`]

## org.tukaani.xz

1. `com.anatawa12.jarInJar:jar-in-jar-creator`  -> [`1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`]
1. `com.protocol180:protocol-aggregator-workflows`  -> [`0.1.1`, `0.1.2`, `0.1.3`, `0.1.5`, `0.1.6`]
1. `io.kestra.plugin:plugin-compress`  -> [`0.2.0`, `0.2.1`, `0.2.2`, `0.2.3`, `0.3.0`, `0.3.1`, `0.4.0`]
1. `org.apache.avro:avro-tools`  -> [`1.11.0`]
1. `org.tukaani:xz` 🧩 -> [`1.9`]

## com.auth0.jwt

1. `com.auth0:java-jwt` 🧩 -> [`3.17.0`, `3.18.0`, `3.18.1`, `3.18.2`, `3.18.3`, `3.19.0`, `3.19.1`, `3.19.2`, `4.0.0-beta.0`]
1. `com.sanctionco.thunder:application`  -> [`3.1.0`]
1. `fr.techad:edc-httpd`  -> [`2.0.0`]
1. `org.restheart:restheart`  -> [`6.1.1`, `6.1.2`]

## com.fasterxml.jackson.datatype.joda

1. `com.fasterxml.jackson.datatype:jackson-datatype-joda-money` 🧩 -> [`2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `com.fasterxml.jackson.datatype:jackson-datatype-joda`  -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-kpm`  -> [`0.40.11`, `0.40.12`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-logger`  -> [`0.40.11`, `0.40.12`]

## com.github.benmanes.caffeine

1. `com.github.ben-manes.caffeine:caffeine` 🧩 -> [`3.0.2`, `3.0.3`, `3.0.4`, `3.0.5`, `3.0.6`, `3.1.0`]
1. `com.google.errorprone:error_prone_refaster`  -> [`2.12.0`, `2.12.1`, `2.13.0`, `2.13.1`]
1. `org.atlanmod.commons:commons-core`  -> [`1.1.0`]
1. `org.atlanmod.commons:commons-testing`  -> [`1.1.0`]

## com.github.rvesse.airline

1. `com.github.rvesse:airline-examples` 🧩 -> [`2.7.0`, `2.7.1`, `2.7.2`, `2.8.0`, `2.8.1`, `2.8.2`, `2.8.3`, `2.8.4`, `2.8.5`]
1. `com.github.rvesse:airline`  -> [`2.7.0`, `2.7.1`, `2.7.2`, `2.8.0`, `2.8.1`, `2.8.2`, `2.8.3`, `2.8.4`, `2.8.5`]
1. `io.stargate.starter:stargate-starter`  -> [`0.0.7`, `0.0.8`, `0.0.9`, `0.0.10`, `0.0.11`, `0.0.13`, `0.0.14`, `0.0.15`, `0.0.16`, `0.0.17`, `0.0.18`, `0.0.19`, `0.0.20`, `0.0.21`, `0.0.22`, `0.0.23`, `0.0.24`, `0.0.25`, `0.0.26`, `0.0.27`, `0.0.28`, `0.0.29`, `1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`, `1.0.10`, `1.0.11`, `1.0.12`, `1.0.13`, `1.0.14`, `1.0.15`, `1.0.16`, `1.0.17`, `1.0.18`, `1.0.19`, `1.0.21`, `1.0.22`, `1.0.23`, `1.0.24`, `1.0.25`, `1.0.26`, `1.0.27`, `1.0.28`, `1.0.29`, `1.0.30`, `1.0.31`, `1.0.32`, `1.0.33`, `1.0.34`, `1.0.35`, `1.0.36`, `1.0.37`, `1.0.38`, `1.0.39`, `1.0.40`, `1.0.41`, `1.0.42`, `1.0.43`, `1.0.44`, `1.0.45`, `1.0.46`, `1.0.47`, `1.0.48`, `2.0.0-ALPHA-1`, `2.0.0-ALPHA-2`, `2.0.0-ALPHA-3`, `2.0.0-ALPHA-4`, `2.0.0-ALPHA-5`, `2.0.0-ALPHA-6`, `2.0.0-ALPHA-7`, `2.0.0-ALPHA-8`, `2.0.0-ALPHA-9`]
1. `org.reploop:json2bean-standalone`  -> [`0.19`]

## com.jwebmp.core

1. `com.jwebmp.core:jwebmp-core` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp.jre10:jwebmp-core`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-core`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-core`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.guicedhazelcast

1. `com.jwebmp.guicedee.persistence:guiced-hazelcast`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:guiced-hazelcast`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:guiced-hazelcast`  -> [`0.62.0.1`]
1. `com.jwebmp:guiced-hazelcast` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.guicedinjection

1. `com.jwebmp.guicedee:guiced-injection`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:guiced-injection`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`, `0.60.0.1`]
1. `com.jwebmp.jre11:guiced-injection`  -> [`0.60.0.1`, `0.62.0.1`]
1. `com.jwebmp:guiced-injection` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.guicedpersistence

1. `com.jwebmp.guicedee.persistence:guiced-persistence`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:guiced-persistence`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`, `0.60.0.1`]
1. `com.jwebmp.jre11:guiced-persistence`  -> [`0.60.0.1`, `0.62.0.1`]
1. `com.jwebmp:guiced-persistence` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.guicedpersistence.c3p0

1. `com.jwebmp.guicedee.persistence:guiced-persistence-c3p0`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:guiced-persistence-c3p0`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:guiced-persistence-c3p0`  -> [`0.62.0.1`]
1. `com.jwebmp:guiced-persistence-c3p0` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`]

## com.jwebmp.guicedpersistence.ehcache

1. `com.jwebmp.guicedee.persistence:guiced-persistence-ehcache`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:guiced-persistence-ehcache`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:guiced-persistence-ehcache`  -> [`0.62.0.1`]
1. `com.jwebmp:guiced-persistence-ehcache` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.guicedpersistence.jpa

1. `com.jwebmp.guicedee.persistence:guiced-persistence-jpa`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:guiced-persistence-jpa`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`, `0.60.0.1`]
1. `com.jwebmp.jre11:guiced-persistence-jpa`  -> [`0.60.0.1`, `0.62.0.1`]
1. `com.jwebmp:guiced-persistence-jpa` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.guicedpersistence.readers.eclipselink

1. `com.jwebmp.guicedee.persistence:guiced-persistence-eclipselink-reader`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`]
1. `com.jwebmp.jre10:guiced-persistence-eclipselink-reader`  -> [`0.59.0.14`, `0.60.0.1`]
1. `com.jwebmp.jre11:guiced-persistence-eclipselink-reader`  -> [`0.60.0.1`, `0.62.0.1`]
1. `com.jwebmp:guiced-persistence-eclipselink-reader` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.guicedpersistence.readers.hibernateproperties

1. `com.jwebmp.guicedee.persistence:guiced-persistence-hibernateproperties-reader`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:guiced-persistence-hibernateproperties-reader`  -> [`0.59.0.14`, `0.60.0.1`]
1. `com.jwebmp.jre11:guiced-persistence-hibernateproperties-reader`  -> [`0.62.0.1`]
1. `com.jwebmp:guiced-persistence-hibernateproperties-reader` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.guicedpersistence.readers.systemproperties

1. `com.jwebmp.guicedee.persistence:guiced-persistence-systemproperties-reader`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:guiced-persistence-systemproperties-reader`  -> [`0.59.0.14`, `0.60.0.1`]
1. `com.jwebmp.jre11:guiced-persistence-systemproperties-reader`  -> [`0.60.0.1`, `0.62.0.1`]
1. `com.jwebmp:guiced-persistence-systemproperties-reader` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.guicedservlets

1. `com.jwebmp.guicedee.servlets:guiced-servlets`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:guiced-servlets`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`, `0.60.0.1`]
1. `com.jwebmp.jre11:guiced-servlets`  -> [`0.62.0.1`]
1. `com.jwebmp:guiced-servlets` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.guicedservlets.requestscoped

1. `com.jwebmp.guicedee.servlets:guiced-servlets-request-scoper`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:guiced-servlets-request-scoper`  -> [`0.59.0.14`]
1. `com.jwebmp.jre11:guiced-servlets-request-scoper`  -> [`0.62.0.1`]
1. `com.jwebmp:guiced-servlets-request-scoper` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.interception

1. `com.jwebmp.core:jwebmp-interception`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`]
1. `com.jwebmp.jre10:jwebmp-interception`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-interception`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-interception` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.logmaster

1. `com.jwebmp.guicedee:guiced-log-master`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:jwebmp-log-master`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`, `0.60.0.1`]
1. `com.jwebmp.jre11:jwebmp-log-master`  -> [`0.60.0.1`, `0.63.0.12`, `0.63.0.13`, `0.63.0.14`, `0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.jwebmp:jwebmp-log-master` 🧩 -> [`0.63.0.54`, `0.63.0.60`, `0.63.0.61`, `0.65.0.1`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularanimate

1. `com.jwebmp.jre10:jwebmp-angular-animate`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-animate`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-animate` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-animate`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularanimatedchange

1. `com.jwebmp.jre10:jwebmp-angular-animated-change`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-animated-change`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-animated-change` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-animated-change`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularautofocus

1. `com.jwebmp.jre10:jwebmp-angular-auto-focus`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-auto-focus`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-auto-focus` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-auto-focus`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularfastclick

1. `com.jwebmp.jre10:jwebmp-angular-fastclick`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-fastclick`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-fastclick`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-fastclick` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularfileupload

1. `com.jwebmp.jre10:jwebmp-angular-file-upload`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-file-upload`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-file-upload` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-file-upload`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularionslider

1. `com.jwebmp.jre10:jwebmp-angular-ion-slider`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-ion-slider`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-ion-slider` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-ion-slider`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularnyabootstrapselector

1. `com.jwebmp.jre10:jwebmp-bootstrap-nya-select4`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre10:jwebmp-bootstrap-nya-select`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-bootstrap-nya-select`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-bootstrap-nya-select` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularprettycheckboxes

1. `com.jwebmp.jre10:jwebmp-angular-pretty-checkboxes`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-pretty-checkboxes`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-pretty-checkboxes` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-pretty-checkboxes`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularprogressbuttonstyles

1. `com.jwebmp.jre10:jwebmp-angular-progress-button-styles`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-progress-button-styles`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-progress-button-styles` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-progress-button-styles`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularroute

1. `com.jwebmp.jre10:jwebmp-angular-route`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-route`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-route` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-route`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularsanitize

1. `com.jwebmp.jre10:jwebmp-angular-sanitize`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-sanitize`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-sanitize` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-sanitize`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularscrollposition

1. `com.jwebmp.jre10:jwebmp-angular-scroll-position`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-scroll-position`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-scroll-position` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-scroll-position`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularslimscroll

1. `com.jwebmp.jre10:jwebmp-angular-slim-scroll`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-slim-scroll`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-slim-scroll` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-slim-scroll`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angulartouch

1. `com.jwebmp.jre10:jwebmp-angular-touch`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-touch`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-touch` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-touch`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`]

## com.jwebmp.plugins.angulartrackwidth

1. `com.jwebmp.jre10:jwebmp-angular-track-width`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-track-width`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-track-width` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-track-width`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`]

## com.jwebmp.plugins.angularzoomanimation

1. `com.jwebmp.jre10:jwebmp-angular-ui-zoom`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-ui-zoom`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-ui-zoom` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-angular-ui-zoom`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.bit6

1. `com.jwebmp.jre10:jwebmp-bit6`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-bit6`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-bit6`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`]
1. `com.jwebmp:jwebmp-bit6` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.blockui

1. `com.jwebmp.jre10:jwebmp-block-ui`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-block-ui`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-block-ui`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-block-ui` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.blueimp.fileupload

1. `com.jwebmp.jre10:jwebmp-blueimp-fileupload`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-blueimp-fileupload`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.blueimp:jwebmp-blueimp-fileupload` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-blueimp-fileupload`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.blueimp.gallery

1. `com.jwebmp.jre10:jwebmp-blueimp-gallery`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-blueimp-gallery`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.blueimp:jwebmp-blueimp-gallery` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-blueimp-gallery`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.bootstrap4

1. `com.jwebmp.jre10:jwebmp-bootstrap4`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-bootstrap4`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.bootstrap:jwebmp-bootstrap` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-bootstrap4`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.datatable

1. `com.jwebmp.jre10:jwebmp-data-tables`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-data-tables`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-data-tables`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-data-tables` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.dynamicsourcecode

1. `com.jwebmp.jre10:jwebmp-dynamic-source-code-viewer`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-dynamic-source-code-viewer`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-dynamic-source-code-viewer`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-dynamic-source-code-viewer` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.easypiechart

1. `com.jwebmp.jre10:jwebmp-easy-pie-chart`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-easy-pie-chart`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.graphing:jwebmp-easy-pie-chart`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-easy-pie-chart` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.fontawesome5

1. `com.jwebmp.jre10:jwebmp-font-awesome5`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-font-awesome5`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.iconsets:jwebmp-font-awesome5`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-font-awesome5` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.fullcalendar

1. `com.jwebmp.jre10:jwebmp-full-calendar`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-full-calendar`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-full-calendar`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-full-calendar` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.globalize.cultures

1. `com.jwebmp.jre10:jwebmp-globalize`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-globalize`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-globalize`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-globalize` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.glyphicons

1. `com.jwebmp.jre10:jwebmp-glyphicons`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-glyphicons`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.iconsets:jwebmp-glyphicons`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-glyphicons` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.google.sourceprettify

1. `com.jwebmp.jre10:jwebmp-google-source-code-prettify`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-google-source-code-prettify`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-source-prettify`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-google-source-code-prettify` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.imagemap

1. `com.jwebmp.jre10:jwebmp-image-map-heatmap`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-image-map-heatmap`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-image-map-heatmap`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-image-map-heatmap` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.ionic.ionicons

1. `com.jwebmp.jre10:jwebmp-ion-icons`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-ion-icons`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.ion:jwebmp-ion-icons` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-ion-icons`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.ionrangeslider

1. `com.jwebmp.jre10:jwebmp-ion-range-slider`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-ion-range-slider`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.ion:jwebmp-ion-range-slider` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-ion-range-slider`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqgradientlinear

1. `com.jwebmp.jre10:jwebmp-gradients-linear-ie6`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-gradients-linear-ie6`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-linear-gradients`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-gradients-linear-ie6` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqlayout

1. `com.jwebmp.jre10:jwebmp-jquery-ui-layout`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-jquery-ui-layout`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-jqui-layout`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-jquery-ui-layout` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqplot

1. `com.jwebmp.jre10:jwebmp-jqplot`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-jqplot`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.graphing:jwebmp-jqplot`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-jqplot` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqxwidgets

1. `com.jwebmp.jre10:jwebmp-jqx-widgets`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-jqx-widgets`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins:jwebmp-jqx-widgets` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`]
1. `com.jwebmp:jwebmp-jqx-widgets`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jstree

1. `com.jwebmp.jre10:jwebmp-jstree`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-jstree`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-jstree`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-jstree` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.leaflet

1. `com.jwebmp.jre10:jwebmp-leafletjs`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-leafletjs`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-leafletjs`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-leafletjs` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.materialdesignicons

1. `com.jwebmp.jre10:jwebmp-material-design-icons`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-material-design-icons`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.iconsets:jwebmp-material-design-icons`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-material-design-icons` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.metrojs

1. `com.jwebmp.jre10:jwebmp-metro-tiles`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-metro-tiles`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-metro-tiles`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-metro-tiles` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.modernizr

1. `com.jwebmp.jre10:jwebmp-modernizr`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-modernizr`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-modernizr`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-modernizr` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.moment

1. `com.jwebmp.jre10:jwebmp-momentjs`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-momentjs`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-momentjs`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-momentjs` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.ngslimscroll

1. `com.jwebmp.jre10:jwebmp-ng-slim-scroll`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-ng-slim-scroll`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-ng-slim-scroll`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-ng-slim-scroll` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.pace

1. `com.jwebmp.jre10:jwebmp-pace-plugin`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-pace-plugin`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-pace-loader`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-pace-plugin` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.particlejs

1. `com.jwebmp.jre10:jwebmp-particlesjs`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-particlesjs`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-particlesjs`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-particlesjs` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.plusastab

1. `com.jwebmp.jre10:jwebmp-plus-as-tab`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-plus-as-tab`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-plus-as-tab`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-plus-as-tab` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.quickforms

1. `com.jwebmp.jre10:jwebmp-quickforms`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-quickforms`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-quickforms`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-quickforms` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.radialsvgslider

1. `com.jwebmp.jre10:jwebmp-radial-slider-gem`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-radial-slider-gem`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.effects:jwebmp-radial-slider-gem`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-radial-slider-gem` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.skycons

1. `com.jwebmp.jre10:jwebmp-skycons`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-skycons`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.iconsets:jwebmp-skycons`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-skycons` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.smartwizard

1. `com.jwebmp.jre10:jwebmp-smart-wizard`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-smart-wizard`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-smart-wizard`  -> [`1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-smart-wizard` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.softhistorychange

1. `com.jwebmp.jre10:jwebmp-soft-history-change`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-soft-history-change`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-soft-history-change`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-soft-history-change` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.spectrum.colourpicker

1. `com.jwebmp.jre10:jwebmp-spectrum-colour-picker`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-spectrum-colour-picker`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-spectrum-colour-picker`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-spectrum-colour-picker` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.textangular

1. `com.jwebmp.jre10:jwebmp-text-angular`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-text-angular`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-text-angular`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-text-angular` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.textinputeffects

1. `com.jwebmp.jre10:jwebmp-text-input-effects`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-text-input-effects`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-text-input-effects`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-text-input-effects` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.themify.icons

1. `com.jwebmp.jre10:jwebmp-themify-icons`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-themify-icons`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.iconsets:jwebmp-themify-icons`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-themify-icons` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.toastr

1. `com.jwebmp.jre10:jwebmp-toastr`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-toastr`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-toastr`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-toastr` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.verticaltimeline

1. `com.jwebmp.jre10:jwebmp-vertical-timeline-css`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-vertical-timeline-css`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.effects:jwebmp-vertical-timeline-css`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-vertical-timeline-css` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.66.0.1`]

## com.jwebmp.plugins.waveseffect

1. `com.jwebmp.jre10:jwebmp-waveseffect`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-waveseffect`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.effects:jwebmp-waveseffect`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-waveseffect` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.weathericons

1. `com.jwebmp.jre10:jwebmp-weathericons`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-weathericons`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.iconsets:jwebmp-weathericons`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-weathericons` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.xeditable

1. `com.jwebmp.jre10:jwebmp-xeditable`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-xeditable`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-xeditable`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-xeditable` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.undertow

1. `com.jwebmp.guicedee.servlets:guiced-undertow`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:jwebmp-undertow`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-undertow`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-undertow` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.websockets

1. `com.jwebmp.guicedee.servlets:guiced-websockets`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre10:jwebmp-websockets`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-websockets`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-websockets` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.sun.tools.xjc

1. `com.github.shynixn:discordwebhook-ktl`  -> [`1.0`]
1. `com.sun.xml.bind:jaxb-osgi`  -> [`2.4.0-b180725.0644`, `2.4.0-b180830.0438`]
1. `com.sun.xml.bind:jaxb-xjc`  -> [`2.4.0-b180725.0644`, `2.4.0-b180830.0438`, `2.3.3-b01`, `2.3.3-b02`, `3.0.0-M1`, `3.0.0-M2`, `3.0.0-M3`, `3.0.0-M4`, `3.0.0-M5`, `3.0.0`, `3.0.1`, `3.0.2-b01`, `3.0.2`, `4.0.0-M4`]
1. `org.glassfish.jaxb:jaxb-xjc`  -> [`2.4.0-b180725.0644`, `2.4.0-b180830.0438`, `2.3.2`]

## jakarta.json

1. `jakarta.json:jakarta.json-api` 🧩 -> [`2.0.0-RC1`, `2.0.0-RC2`, `2.0.0-RC3`, `2.0.0`, `2.0.1`, `2.1.0`]
1. `org.avaje.experiment:experiment-jsonp-api`  -> [`0.2`]
1. `org.eclipse.parsson:jakarta.json`  -> [`1.0.0`, `1.1.0`]
1. `org.glassfish:jakarta.json`  -> [`2.0.0`, `2.0.1`]

## jakarta.servlet

1. `cloud.piranha.core:piranha-core-servlet-api`  -> [`21.11.0`, `21.12.0`, `22.1.0`, `22.2.0`, `22.3.0`, `22.4.0`]
1. `cloud.piranha.servlet:piranha-servlet-api`  -> [`21.4.0`, `21.5.0`, `21.6.0`, `21.7.0`, `21.8.0`, `21.9.0`, `21.10.0`]
1. `com.guicedee.services:jakarta.servlet-api`  -> [`1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.0.3-jre17-rc1`, `1.2.1.1-jre17`, `1.2.1.2-jre17`, `1.2.2.1`, `1.2.2.1-jre17`]
1. `org.apache.tomcat:tomcat-servlet-api`  -> [`10.0.0-M8`, `10.0.0-M9`, `10.0.0-M10`, `10.0.0`, `10.0.2`, `10.0.4`, `10.0.5`, `10.0.6`, `10.1.0-M1`, `10.1.0-M2`, `10.1.0-M4`, `10.1.0-M5`, `10.1.0-M6`, `10.1.0-M7`, `10.1.0-M8`, `10.1.0-M10`, `10.1.0-M11`, `10.1.0-M12`, `10.1.0-M14`]

## jakarta.xml.bind

1. `jakarta.xml.bind:jakarta.xml.bind-api` 🧩 -> [`3.0.0-RC1`, `3.0.0-RC2`, `3.0.0-RC3`, `3.0.0`, `3.0.1`, `4.0.0-RC1`, `4.0.0-RC2`, `4.0.0-RC3`, `4.0.0`]
1. `org.glassfish.tyrus.bundles:tyrus-standalone-client-jdk`  -> [`2.0.0-M2`, `2.0.0-M3`, `2.0.0`, `2.0.1`]
1. `org.glassfish.tyrus.bundles:tyrus-standalone-client`  -> [`2.0.0-M2`, `2.0.0-M3`, `2.0.0`, `2.0.1`]
1. `org.glassfish.tyrus.ext:tyrus-client-cli`  -> [`2.0.0-M2`, `2.0.0-M3`, `2.0.0`, `2.0.1`]

## java.xml.ws

1. `com.srotya.sidewinder:sidewinder-standalone-dist`  -> [`0.2.3`, `0.2.12`, `0.2.13`]
1. `jakarta.xml.ws:jakarta.xml.ws-api`  -> [`2.3.2`]
1. `javax.xml.ws:jaxws-api`  -> [`2.3.1`]
1. `org.apache.servicemix.specs:org.apache.servicemix.specs.jaxws-api-2.3`  -> [`2.3_1`, `2.3_2`, `2.3_3`]

## net.sf.uadetector.core

1. `com.guicedee.services:uadetector-core`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.jre11:uadetector-core`  -> [`0.63.0.12`, `0.63.0.14`, `0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.jwebmp.thirdparty:uadetector-core`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp:uadetector-core`  -> [`0.63.0.54`, `0.63.0.60`, `0.63.0.61`, `0.65.0.1`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## net.sf.uadetector.resources

1. `com.guicedee.services:uadetector-resources`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.jre11:uadetector-resources`  -> [`0.63.0.12`, `0.63.0.14`, `0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.jwebmp.thirdparty:uadetector-resources`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp:uadetector-resources`  -> [`0.63.0.54`, `0.63.0.60`, `0.63.0.61`, `0.65.0.1`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## org.apache.commons.fileupload

1. `com.guicedee.services:commons-fileupload`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.jpms.commons:commons-fileupload`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre11:commons-fileupload`  -> [`0.63.0.14`, `0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.jwebmp:commons-fileupload`  -> [`0.63.0.54`, `0.63.0.60`, `0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## org.apache.commons.io

1. `com.guicedee.services:commons-io`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.jpms.commons:commons-io`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre11:commons-io`  -> [`0.63.0.14`, `0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.jwebmp:commons-io`  -> [`0.63.0.54`, `0.63.0.60`, `0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## org.apache.commons.lang3

1. `com.guicedee.services:commons-lang3`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.jpms.commons:commons-lang3`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre11:commons-lang3`  -> [`0.63.0.12`, `0.63.0.13`, `0.63.0.14`, `0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.jwebmp:commons-lang3`  -> [`0.63.0.54`, `0.63.0.60`, `0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## org.apache.commons.text

1. `com.guicedee.services:commons-text`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.jpms.commons:commons-text`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre11:commons-text`  -> [`0.63.0.12`, `0.63.0.13`, `0.63.0.14`, `0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.jwebmp:commons-text`  -> [`0.63.0.54`, `0.63.0.60`, `0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## org.assertj.core

1. `com.accenture.testing.bdd:bdd-for-all`  -> [`2.0.0-RC2`, `2.0.0-RC3`, `2.0.0`, `2.0.1`, `2.0.2-RC1`, `2.0.2-RC2`, `2.0.2-RC3`]
1. `com.salesforce.dockerfile-image-update:dockerfile-image-update-itest`  -> [`1.0.46`, `1.0.47`, `1.0.48`, `1.0.49`, `1.0.50`, `1.0.51`, `1.0.78`, `1.0.79`, `1.0.81`, `1.0.82`, `1.0.83`, `1.0.84`, `1.0.85`, `1.0.86`, `1.0.87`, `1.0.88`, `1.0.89`, `1.0.90`, `1.0.91`, `1.0.93`, `1.0.94`, `1.0.95`, `1.0.96`, `1.0.97`, `1.0.98`, `1.0.99`, `1.0.102`, `1.0.103`, `1.0.104`, `1.0.105`, `1.0.106`, `1.0.107`, `1.0.110`, `1.0.111`, `1.0.112`, `1.0.113`, `1.0.114`, `1.0.115`, `1.0.117`, `1.0.119`, `1.0.120`, `1.0.121`, `1.0.125`, `1.0.126`, `1.0.127`]
1. `org.assertj:assertj-core` 🧩 -> [`3.13.0`, `3.13.1`, `3.13.2`, `3.14.0`, `3.15.0`, `3.16.0`, `3.16.1`, `3.17.0`, `3.17.1`, `3.17.2`, `3.18.0`, `3.18.1`, `3.19.0`, `3.20.0`, `3.20.1`, `3.20.2`, `3.21.0`, `3.22.0`]
1. `org.robotframework:javafxlibrary`  -> [`0.5.3`, `0.5.4`, `0.5.5`, `0.6.0`, `0.7.0`, `0.7.1`]

## org.bytedeco.tensorflow.platform

1. `org.bytedeco:tensorflow-platform-gpu`  -> [`1.15.0-1.5.2`, `1.15.2-1.5.3`]
1. `org.bytedeco:tensorflow-platform-python-gpu`  -> [`1.15.0-1.5.2`, `1.15.2-1.5.3`]
1. `org.bytedeco:tensorflow-platform-python`  -> [`1.15.0-1.5.2`, `1.15.2-1.5.3`]
1. `org.bytedeco:tensorflow-platform` 🧩 -> [`1.13.1-1.5`, `1.14.0-1.5.1`, `1.15.0-1.5.2`, `1.15.2-1.5.3`, `1.15.3-1.5.4`, `1.15.5-1.5.5`, `1.15.5-1.5.6`, `1.15.5-1.5.7`]

## org.graalvm.truffle

1. `com.orientechnologies:agent`  -> [`3.2.4`, `3.2.5`]
1. `org.graalvm.truffle:truffle-api` 🧩 -> [`19.3.0`, `19.3.0.2`, `19.3.1`, `20.0.0`, `20.1.0`, `20.2.0`, `20.3.0`, `21.0.0`, `21.0.0.2`, `21.1.0`, `21.2.0`, `21.3.0`, `22.0.0`, `22.0.0.2`, `22.1.0`]
1. `org.noear:luffy.executor.s.graaljs`  -> [`1.0`]
1. `org.noear:solonjt.executor.s.graaljs`  -> [`1.0.4.4`, `1.0.4.7`]

## org.json

1. `com.guicedee.services:json`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.jre11:json`  -> [`0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.jwebmp.thirdparty:json`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp:json`  -> [`0.63.0.60`, `0.63.0.61`, `0.65.0.1`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## org.objectweb.asm.tree.analysis

1. `fish.payara.extras:payara-embedded-all`  -> [`5.194`, `5.201`, `5.2020.2`, `5.2020.3`, `5.2020.4`, `5.2020.5`, `5.2020.6`, `5.2020.7`, `5.2021.1`, `5.2021.2`, `5.2021.3`, `5.2021.4`, `6.2021.1.Alpha1`, `6.2022.1.Alpha2`]
1. `fish.payara.extras:payara-embedded-web`  -> [`5.194`, `5.201`, `5.2020.2`, `5.2020.3`, `5.2020.4`, `5.2020.6`, `5.2020.7`, `5.2021.1`, `5.2021.2`, `5.2021.3`, `5.2021.4`, `6.2021.1.Alpha1`, `6.2022.1.Alpha2`]
1. `org.apache.felix:org.apache.felix.scr.bnd`  -> [`1.9.4`, `1.9.6`]
1. `org.ow2.asm:asm-analysis` 🧩 -> [`6.2.1`, `7.0-beta`, `7.0`, `7.1`, `7.2-beta`, `7.2`, `7.3.1`, `8.0`, `8.0.1`, `9.0-beta`, `9.0`, `9.1`, `9.2`, `9.3`]

## org.openqa.selenium.chrome

1. `ch.exense.step.examples:demo-appium-keyword`  -> [`1.1.3`, `3.13.0`]
1. `com.automation-remarks:video-recorder-remote`  -> [`2.0`]
1. `com.github.claremontqualitymanagement.TestAutomationFramework:TafFull`  -> [`3.0.3`, `3.0.4`, `3.0.5`, `3.0.9`, `3.0.10`, `3.0.11`]
1. `org.seleniumhq.selenium:selenium-chrome-driver`  -> [`3.14.0`, `3.141.0`, `3.141.5`, `3.141.59`, `4.0.0-alpha-1`, `4.0.0-alpha-2`]

## org.seleniumhq.selenium.java

1. `com.gitee.pyqone:autest`  -> [`2.1.0`, `2.1.1`]
1. `com.iceolive:selenium-script`  -> [`0.0.6`, `0.0.7`, `0.0.8`, `0.0.9`, `0.2.0`, `0.3.0`, `0.3.1`, `0.4.0`]
1. `io.github.multicatch:cucumber-audit-standalone`  -> [`1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`]
1. `org.seleniumhq.selenium:selenium-java` 🧩 -> [`4.0.0-alpha-3`, `4.0.0-alpha-4`, `4.0.0-alpha-5`, `4.0.0-alpha-6`, `4.0.0-alpha-7`, `4.0.0-beta-1`, `4.0.0-beta-2`, `4.0.0-beta-3`, `4.0.0-beta-4`, `4.0.0-rc-1`, `4.0.0-rc-2`, `4.0.0-rc-3`, `4.0.0`, `4.1.0`, `4.1.1`, `4.1.2`, `4.1.3`, `4.1.4`]

## aopalliance

1. `com.guicedee.services:aopalliance-core`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.jre11:aopalliance-core`  -> [`0.63.0.12`, `0.63.0.13`, `0.63.0.14`, `0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.jwebmp.thirdparty:aopalliance-core`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]

## be.webtechie.piheaders

1. `be.webtechie:pi-headerPins`  -> [`0.1.1`]
1. `be.webtechie:pi-headers`  -> [`0.0.3`, `0.1.1`]
1. `be.webtechie:resistor-calculator` 🧩 -> [`0.0.1`, `0.0.2`]

## br.com.objectos.concurrent

1. `br.com.objectos.oss-java11:objectos-concurrent`  -> [`1.0.0`, `2.0.0`, `3.0.0`, `3.1.0`]
1. `br.com.objectos.oss-java16:objectos-concurrent`  -> [`1.0.0`]
1. `br.com.objectos.oss-java17:objectos-concurrent`  -> [`2.0.0`]

## br.com.objectos.core.array

1. `br.com.objectos.oss-java11:objectos-core-array`  -> [`2.0.0`, `3.0.0`, `3.1.0`]
1. `br.com.objectos.oss-java17:objectos-core-array`  -> [`2.0.0`]
1. `br.com.objectos:core-array` 🧩 -> [`0.7.0-jdk11`]

## br.com.objectos.core.io

1. `br.com.objectos.oss-java11:objectos-core-io`  -> [`2.0.0`, `3.0.0`, `3.1.0`]
1. `br.com.objectos.oss-java17:objectos-core-io`  -> [`2.0.0`]
1. `br.com.objectos:core-io` 🧩 -> [`0.7.0-jdk11`]

## br.com.objectos.core.logging

1. `br.com.objectos.oss-java11:objectos-core-logging`  -> [`2.0.0`]
1. `br.com.objectos.oss-java17:objectos-core-logging`  -> [`2.0.0`]
1. `br.com.objectos:core-logging` 🧩 -> [`0.7.0-jdk11`]

## br.com.objectos.core.object

1. `br.com.objectos.oss-java11:objectos-core-object`  -> [`2.0.0`, `3.0.0`, `3.1.0`]
1. `br.com.objectos.oss-java17:objectos-core-object`  -> [`2.0.0`]
1. `br.com.objectos:core-object` 🧩 -> [`0.7.0-jdk11`]

## br.com.objectos.core.runtime

1. `br.com.objectos.oss-java11:objectos-core-runtime`  -> [`2.0.0`, `3.0.0`, `3.1.0`]
1. `br.com.objectos.oss-java17:objectos-core-runtime`  -> [`2.0.0`]
1. `br.com.objectos:core-runtime` 🧩 -> [`0.7.0-jdk11`]

## br.com.objectos.core.service

1. `br.com.objectos.oss-java11:objectos-core-service`  -> [`2.0.0`, `3.0.0`, `3.1.0`]
1. `br.com.objectos.oss-java17:objectos-core-service`  -> [`2.0.0`]
1. `br.com.objectos:core-service` 🧩 -> [`0.7.0-jdk11`]

## br.com.objectos.core.string

1. `br.com.objectos.oss-java11:objectos-core-string`  -> [`2.0.0`, `3.0.0`, `3.1.0`]
1. `br.com.objectos.oss-java17:objectos-core-string`  -> [`2.0.0`]
1. `br.com.objectos:core-string` 🧩 -> [`0.7.0-jdk11`]

## br.com.objectos.core.system

1. `br.com.objectos.oss-java11:objectos-core-system`  -> [`2.0.0`, `3.0.0`, `3.1.0`]
1. `br.com.objectos.oss-java17:objectos-core-system`  -> [`2.0.0`]
1. `br.com.objectos:core-system` 🧩 -> [`0.7.0-jdk11`]

## br.com.objectos.core.throwable

1. `br.com.objectos.oss-java11:objectos-core-throwable`  -> [`2.0.0`, `3.0.0`, `3.1.0`]
1. `br.com.objectos.oss-java17:objectos-core-throwable`  -> [`2.0.0`]
1. `br.com.objectos:core-throwable` 🧩 -> [`0.7.0-jdk11`]

## br.com.objectos.git

1. `br.com.objectos.oss-java11:objectos-git`  -> [`1.0.0`, `2.0.0`, `3.0.0`, `3.1.0`]
1. `br.com.objectos.oss-java16:objectos-git`  -> [`1.0.0`]
1. `br.com.objectos.oss-java17:objectos-git`  -> [`2.0.0`]

## ch.qos.logback.core

1. `ch.qos.logback:logback-core` 🧩 -> [`1.3.0-alpha4`, `1.3.0-alpha5`, `1.3.0-alpha6`, `1.3.0-alpha7`, `1.3.0-alpha8`, `1.3.0-alpha9`, `1.3.0-alpha10`, `1.3.0-alpha11`, `1.3.0-alpha12`, `1.3.0-alpha13`, `1.3.0-alpha14`, `1.3.0-alpha15`]
1. `com.github.gv2011.logback:logback-core`  -> [`1.3.0`, `1.3.1`, `1.3.2`, `1.3.3`, `1.3.4`, `1.3.5`]
1. `com.guicedee.services:logback-core`  -> [`1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.0.3-jre17-rc1`, `1.2.1.1-jre17`, `1.2.1.2-jre17`, `1.2.2.1`, `1.2.2.1-jre17`]

## com.clickhouse.jdbc

1. `com.clickhouse:clickhouse-jdbc` 🧩 -> [`0.3.2-test2`, `0.3.2-test3`]
1. `io.kestra.plugin:plugin-jdbc-clickhouse`  -> [`0.4.1`, `0.4.2`]
1. `ru.yandex.clickhouse:clickhouse-jdbc`  -> [`0.3.2`]

## com.fasterxml.classmate

1. `com.fasterxml:classmate` 🧩 -> [`1.5.0`, `1.5.1`]
1. `com.guicedee.services:classmate`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-test-beatrix`  -> [`0.40.0`, `0.40.1`, `0.40.7`]

## com.fasterxml.jackson.module.afterburner

1. `com.fasterxml.jackson.module:jackson-module-afterburner` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `org.kill-bill.billing.plugin.java:stripe-plugin`  -> [`7.2.0`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-logger`  -> [`0.40.2`, `0.40.3`, `0.40.4`]

## com.fasterxml.jackson.module.guice

1. `com.fasterxml.jackson.module:jackson-module-guice` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `com.jwebmp.jackson.module:jackson-module-guice`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]
1. `com.jwebmp.jpms.jackson.module:jackson-module-guice`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]

## com.fasterxml.jackson.module.paranamer

1. `com.datamountaineer:kafka-connect-common`  -> [`2.0.1`, `2.0.2`, `2.0.3`, `2.0.4`, `2.0.5`]
1. `com.fasterxml.jackson.module:jackson-module-paranamer` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`, `2.12.4`, `2.13.0-rc1`, `2.13.0-rc2`, `2.13.0`, `2.13.1`, `2.13.2`]
1. `org.apache.beam:beam-runners-spark-job-server`  -> [`2.20.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]

## com.google.guice.extensions.persist

1. `com.guicedee.services.extensions:guice-persist`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.guicedee.services:guice-persist`  -> [`1.0.14.0-RC1-jre14`, `1.0.14.1-jre14`, `1.0.14.3-jre8`, `1.0.14.4-jre8`, `1.0.14.4-jre14`, `1.0.15.1-jre14`, `1.0.15.2-jre14`, `1.0.15.3-jre8`, `1.0.15.3-jre14`, `1.0.15.4-jre8`, `1.0.15.4-jre14`, `1.0.15.5-jre8`, `1.0.15.5-jre14`, `1.0.16.0-jre14`, `1.0.17.0-jre14`, `1.0.17.1-jre14`, `1.0.18.0-jre14`, `1.0.18.0-jre15`, `1.0.18.1-jre14`, `1.0.18.1-jre15`, `1.0.19.0-jre14`, `1.0.19.0-jre15`, `1.0.19.1-jre15`, `1.0.19.2-jre14`, `1.0.19.2-jre15`, `1.0.19.3-jre14`, `1.0.19.3-jre15`, `1.0.19.4-jre14`, `1.0.19.4-jre15`, `1.0.19.5-jre14`, `1.0.19.5-jre15`, `1.0.19.6-jre8`, `1.0.19.6-jre14`, `1.0.19.7-jre14`, `1.0.19.8-jre8`, `1.0.19.9-jre8`, `1.0.19.9-jre14`, `1.0.19.9-jre15`, `1.0.19.10-jre8`, `1.0.19.10-jre14`, `1.0.19.10-jre15`, `1.0.19.11-jre8`, `1.0.19.12-jre8`, `1.0.19.12-jre14`, `1.0.19.13-jre8`, `1.0.19.13-jre14`, `1.0.19.13-jre15`, `1.0.20.0-jre8`, `1.0.20.0-jre14`, `1.0.20.0-jre15`, `1.0.20.1-jre8`, `1.0.20.1-jre14`, `1.0.20.1-jre15`, `1.0.20.2-jre8`, `1.0.20.2-jre14`, `1.0.20.2-jre15`, `1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`, `1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.0.3-jre17-rc1`, `1.2.1.1-jre17`, `1.2.1.2-jre17`, `1.2.2.1`, `1.2.2.1-jre17`]
1. `com.jwebmp.inject.extensions:guice-persist`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`, `0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]

## com.google.guice.extensions.servlet

1. `com.guicedee.services.extensions:guice-servlet`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.guicedee.services:guice-servlet`  -> [`1.0.14.0-RC1-jre14`, `1.0.14.1-jre14`, `1.0.14.3-jre8`, `1.0.14.4-jre8`, `1.0.14.4-jre14`, `1.0.15.1-jre14`, `1.0.15.2-jre14`, `1.0.15.3-jre8`, `1.0.15.3-jre14`, `1.0.15.4-jre8`, `1.0.15.4-jre14`, `1.0.15.5-jre8`, `1.0.15.5-jre14`, `1.0.16.0-jre14`, `1.0.17.0-jre14`, `1.0.17.1-jre14`, `1.0.18.0-jre14`, `1.0.18.0-jre15`, `1.0.18.1-jre14`, `1.0.18.1-jre15`, `1.0.19.0-jre14`, `1.0.19.0-jre15`, `1.0.19.1-jre15`, `1.0.19.2-jre14`, `1.0.19.2-jre15`, `1.0.19.3-jre14`, `1.0.19.3-jre15`, `1.0.19.4-jre14`, `1.0.19.4-jre15`, `1.0.19.5-jre14`, `1.0.19.5-jre15`, `1.0.19.6-jre8`, `1.0.19.6-jre14`, `1.0.19.7-jre14`, `1.0.19.8-jre8`, `1.0.19.9-jre8`, `1.0.19.9-jre14`, `1.0.19.9-jre15`, `1.0.19.10-jre8`, `1.0.19.10-jre14`, `1.0.19.10-jre15`, `1.0.19.11-jre8`, `1.0.19.12-jre8`, `1.0.19.12-jre14`, `1.0.19.13-jre8`, `1.0.19.13-jre14`, `1.0.19.13-jre15`, `1.0.20.0-jre8`, `1.0.20.0-jre14`, `1.0.20.0-jre15`, `1.0.20.1-jre8`, `1.0.20.1-jre14`, `1.0.20.1-jre15`, `1.0.20.2-jre8`, `1.0.20.2-jre14`, `1.0.20.2-jre15`, `1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`, `1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.0.3-jre17-rc1`, `1.2.1.1-jre17`, `1.2.1.2-jre17`, `1.2.2.1`, `1.2.2.1-jre17`]
1. `com.jwebmp.inject.extensions:guice-servlet`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`, `0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]

## com.headius.invokebinder

1. `com.headius:invokebinder` 🧩 -> [`1.11`, `1.12`]
1. `org.asciidoctor:asciidoctor-ant`  -> [`1.6.2`]
1. `org.jruby:jruby-complete`  -> [`9.2.0.0`, `9.2.1.0`, `9.2.2.0`, `9.2.3.0`, `9.2.4.0`, `9.2.5.0`, `9.2.6.0`, `9.2.7.0`, `9.2.8.0`]

## com.jwebmp.components.bootstrap.themes.sbadmin2

1. `com.jwebmp.jre10:jwebmp-sb2-admin-theme`  -> [`0.58.0.21-RCTEST`]
1. `com.jwebmp.jre11:jwebmp-sb2-admin-theme`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-sb2-admin-theme` 🧩 -> [`0.63.0.61`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularautoexpand

1. `com.jwebmp.jre10:jwebmp-angular-auto-expand`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-auto-expand`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-angular-auto-expand` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularbootstrapdatetimepicker

1. `com.jwebmp.jre10:jwebmp-bootstrap-date-time-picker`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-bootstrap-date-time-picker`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-bootstrap-date-time-picker` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularuibootstrap

1. `com.jwebmp.jre10:jwebmp-angular-ui-bootstrap`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-ui-bootstrap`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-angular-ui-bootstrap` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularuiselect

1. `com.jwebmp.jre10:jwebmp-angular-ui-select`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-ui-select`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-angular-ui-select` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularuisortable

1. `com.jwebmp.jre10:jwebmp-angular-ui-sortable`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-ui-sortable`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-angular-ui-sortable` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.bluradmin

1. `com.jwebmp.jre10:jwebmp-blur-admin-theme`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-blur-admin-theme`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-blur-admin-theme` 🧩 -> [`0.63.0.61`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.bootstrap

1. `com.jwebmp.jre10:jwebmp-bootstrap`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-bootstrap`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-bootstrap` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.bootstrap.dialog

1. `com.jwebmp.jre10:jwebmp-bootstrap-dialog`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-bootstrap-dialog`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-bootstrap-dialog` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.bootstrapselect

1. `com.jwebmp.jre10:jwebmp-bootstrap-select`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-bootstrap-select`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-bootstrap-select` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.bootstrapswitch

1. `com.jwebmp.jre10:jwebmp-bootstrap-switch`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-bootstrap-switch`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-bootstrap-switch` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.bootstraptagsinput

1. `com.jwebmp.jre10:jwebmp-bootstrap-tags-input`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-bootstrap-tags-input`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-bootstrap-tags-input` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.bsquickforms

1. `com.jwebmp.jre10:jwebmp-bootstrap-quick-forms`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-bootstrap-quick-forms`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-bootstrap-quick-forms` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.c3

1. `com.jwebmp.jre11:jwebmp-c3`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.graphing:jwebmp-c3`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-c3` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.66.0.1`]

## com.jwebmp.plugins.cordovify

1. `com.jwebmp.jre10:jwebmp-cordovify`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-cordovify`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-cordovify` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.d3

1. `com.jwebmp.jre11:jwebmp-d3`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.graphing:jwebmp-d3`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-d3` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.66.0.1`]

## com.jwebmp.plugins.easingeffects

1. `com.jwebmp.jre10:jwebmp-easing-effects`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-easing-effects`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-easing-effects`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]

## com.jwebmp.plugins.fontawesome

1. `com.jwebmp.jre10:jwebmp-font-awesome`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-font-awesome`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-font-awesome` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqruler

1. `com.jwebmp.jre10:jwebmp-jqruler`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-jqruler`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-jqruler` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqueryui.themes

1. `com.jwebmp.jre11:jwebmp-jquery-ui-themes`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-jqui-themes` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-jquery-ui-themes`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqueryui.themes.nestable

1. `com.jwebmp.jre11:jwebmp-jquery-ui-themes-nestable`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-jqui-themes-nestable` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.2.1`]
1. `com.jwebmp:jwebmp-jquery-ui-themes-nestable`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqueryverticaltimeline

1. `com.jwebmp.jre10:jwebmp-jquery-vertical-timeline`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-jquery-vertical-timeline`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-jqui-vertical-timeline` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`]

## com.jwebmp.plugins.smartwizard4

1. `com.jwebmp.jre11:jwebmp-smart-wizard-bootstrap4`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-smart-wizard`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`]
1. `com.jwebmp:jwebmp-smart-wizard-bootstrap4` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.weblogappender

1. `com.jwebmp.jre10:jwebmp-web-log-appender`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-web-log-appender`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-web-log-appender` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.samskivert.jmustache

1. `com.samskivert:jmustache` 🧩 -> [`1.15`]
1. `io.garam:core`  -> [`0.4`]
1. `io.swagger.codegen.v3:swagger-codegen-cli`  -> [`3.0.33`, `3.0.34`]

## com.sun.tools.ws.jaxws

1. `com.sun.xml.ws:jaxws-tools`  -> [`2.3.2`]
1. `com.sun.xml.ws:tools`  -> [`2.3.2`]
1. `org.glassfish.metro:webservices-tools`  -> [`2.4.3`]

## com.sun.xml.fastinfoset

1. `com.expedia.www:haystack-agent`  -> [`0.1.8`, `0.1.9`, `0.1.10`, `0.1.11`, `0.1.12`, `0.1.13`, `0.1.14`, `0.1.15`, `0.1.16`, `0.1.17`, `0.1.18`]
1. `com.sun.xml.fastinfoset:FastInfoset` 🧩 -> [`1.2.15`, `1.2.16`, `1.2.17`, `1.2.18`, `2.0.0-M1`, `2.0.0-M2`, `2.0.0`, `2.1.0`]
1. `org.realityforge.keycloak.converger:keycloak-converger`  -> [`1.9`, `1.11`, `1.12`, `1.13`]

## com.sun.xml.ws.jaxws

1. `com.sun.xml.ws:jaxws-rt`  -> [`2.3.1`, `2.3.2`]
1. `com.sun.xml.ws:runtime` 🧩 -> [`2.3.2`]
1. `org.glassfish.metro:webservices-rt`  -> [`2.4.2`]

## com.truthbean.logger.log4j2

1. `com.truthbean.logger:log4j2-adapter`  -> [`0.1.0-RELEASE`, `0.1.1-RELEASE`, `0.2.0-RELEASE`, `0.3.0-RELEASE`, `0.3.1-RELEASE`]
1. `com.truthbean.logger:logger-to-log4j2`  -> [`0.4.0-RELEASE`]
1. `com.truthbean:logger-to-log4j2` 🧩 -> [`0.5.0-RELEASE`, `0.5.1-RELEASE`, `0.5.2-RELEASE`]

## com.truthbean.logger.slf4j

1. `com.truthbean.logger:logger-to-slf4j`  -> [`0.4.0-RELEASE`]
1. `com.truthbean.logger:slf4j-adapter`  -> [`0.1.0-RELEASE`, `0.1.1-RELEASE`, `0.2.0-RELEASE`, `0.3.0-RELEASE`, `0.3.1-RELEASE`]
1. `com.truthbean:logger-to-slf4j` 🧩 -> [`0.5.0-RELEASE`, `0.5.1-RELEASE`, `0.5.2-RELEASE`]

## com.truthbean.logger.stdout

1. `com.truthbean.logger:logger-stdout`  -> [`0.4.0-RELEASE`]
1. `com.truthbean.logger:stdout-adapter`  -> [`0.1.0-RELEASE`, `0.1.1-RELEASE`, `0.2.0-RELEASE`, `0.3.0-RELEASE`, `0.3.1-RELEASE`]
1. `com.truthbean:logger-stdout` 🧩 -> [`0.5.0-RELEASE`, `0.5.1-RELEASE`, `0.5.2-RELEASE`]

## de.carne.swt.browseradapater

1. `de.carne.common:java-swt-browseradapter-cocoa-macosx-x86_64`  -> [`0.1.0`]
1. `de.carne.common:java-swt-browseradapter-gtk-linux-x86_64`  -> [`0.1.0`]
1. `de.carne.common:java-swt-browseradapter-win32-win32-x86_64`  -> [`0.1.0`]

## io.helidon.metrics

1. `io.helidon.metrics:helidon-metrics2`  -> [`1.3.0`, `1.3.1`, `1.4.0`, `1.4.1`, `1.4.2`, `1.4.3`, `1.4.4`, `1.4.5`, `1.4.6`, `1.4.7`, `1.4.8`, `1.4.9`, `1.4.10`, `1.4.11`]
1. `io.helidon.metrics:helidon-metrics` 🧩 -> [`0.11.0`, `0.11.1`, `1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`, `1.1.0`, `1.1.1`, `1.1.2`, `1.2.0`, `1.2.1`, `1.3.0`, `1.3.1`, `1.4.0`, `1.4.1`, `2.0.0-M1`, `2.0.0-M2`, `2.0.0-M3`, `2.0.0-M4`, `2.0.0-RC1`, `2.0.0-RC2`, `2.0.0`, `2.0.1`, `2.0.2`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`, `2.3.0`, `2.3.1`, `2.3.2`, `2.3.3`, `2.3.4`, `2.4.0`, `2.4.1`, `2.4.2`]
1. `io.helidon.microprofile.metrics:helidon-metrics-se`  -> [`0.9.0`, `0.9.1`, `0.10.0`, `0.10.1`, `0.10.2`, `0.10.3`, `0.10.4`, `0.10.5`, `0.10.6`]

## jakarta.el

1. `jakarta.el:jakarta.el-api` 🧩 -> [`5.0.0-RC1`]
1. `org.apache.tomcat:tomcat-el-api`  -> [`10.0.0-M10`, `10.0.0`, `10.0.2`, `10.0.4`, `10.0.5`, `10.0.6`, `10.1.0-M1`, `10.1.0-M2`, `10.1.0-M4`, `10.1.0-M5`, `10.1.0-M6`, `10.1.0-M7`, `10.1.0-M8`, `10.1.0-M10`, `10.1.0-M11`, `10.1.0-M12`, `10.1.0-M14`]
1. `org.jboss.spec.jakarta.el:jboss-el-api_5.0_spec`  -> [`4.0.0.Alpha1`]

## jakarta.inject

1. `io.avaje:jakarta.inject-api`  -> [`1.0`]
1. `io.github.jbock-java:dapper-compiler`  -> [`0.92`, `0.94`]
1. `jakarta.inject:jakarta.inject-api` 🧩 -> [`2.0.1.RC1`, `2.0.1.MR`]

## jakarta.persistence

1. `jakarta.persistence:jakarta.persistence-api` 🧩 -> [`3.0.0-RC1`, `3.0.0-RC2`, `3.0.0`, `3.1.0-RC2`, `3.1.0`]
1. `org.datanucleus:jakarta.persistence`  -> [`3.0.0`, `3.1.0`]
1. `org.jboss.weld:weld-osgi-bundle`  -> [`4.0.0.Beta1`, `4.0.0.Beta2`]

## jakarta.ws.rs

1. `com.guicedee.services:jakarta.ws.rs-api`  -> [`1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`, `1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.0.3-jre17-rc1`, `1.2.1.1-jre17`, `1.2.1.2-jre17`, `1.2.2.1`, `1.2.2.1-jre17`]
1. `jakarta.ws.rs:jakarta.ws.rs-api` 🧩 -> [`3.0.0-M1`, `3.0.0`, `3.1.0`]
1. `org.jboss.spec.javax.ws.rs:jboss-jaxrs-api_3.0_spec`  -> [`1.0.1.Final`]

## jakarta.xml.soap

1. `com.guicedee.services:jakarta.xml.soap-api`  -> [`1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`, `1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.0.3-jre17-rc1`, `1.2.1.1-jre17`, `1.2.1.2-jre17`, `1.2.2.1`, `1.2.2.1-jre17`]
1. `jakarta.xml.soap:jakarta.xml.soap-api` 🧩 -> [`2.0.0-RC1`, `2.0.0-RC2`, `2.0.0-RC3`, `2.0.0`, `2.0.1`, `3.0.0-RC1`, `3.0.0`]
1. `org.jboss.spec.jakarta.xml.soap:jboss-saaj-api_2.0_spec`  -> [`1.0.0.Final`]

## jakarta.xml.ws

1. `com.guicedee.services:jakarta.xml.ws-api`  -> [`1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`, `1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.0.3-jre17-rc1`, `1.2.1.1-jre17`, `1.2.1.2-jre17`, `1.2.2.1`, `1.2.2.1-jre17`]
1. `jakarta.xml.ws:jakarta.xml.ws-api` 🧩 -> [`3.0.0-RC1`, `3.0.0-RC2`, `3.0.0-RC3`, `3.0.0`, `3.0.1`, `4.0.0-RC1`, `4.0.0`]
1. `org.jboss.spec.jakarta.xml.ws:jboss-jakarta-xml-ws-api_3.0_spec`  -> [`1.0.0.Final`, `1.0.1.Final`]

## java.activation

1. `com.guicedee.services:javax.activation`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.thirdparty:javax.activation`  -> [`0.67.0.5`, `0.67.0.7`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `org.glassfish.metro:helidon-activation`  -> [`2.0.0`, `2.0.1`]

## java.base

1. `com.rover12421.android.hide:libcore`  -> [`android-11.0.0_r17`, `11.0.0_r17`, `12.0.0_r16`]
1. `de.mirkosertic.bytecoder:java.base`  -> [`2018-04-10`, `2018-12-10`, `2018-12-17`, `2018-12-19`, `2019-01-26`, `2019-02-27`, `2021-06-10`, `2021-06-24`]
1. `org.qbicc.rt:qbicc-rt-java.base`  -> [`11.alpha.0.1`]

## java.measure

1. `eu.europa.ec.eurostat:searoute-jar`  -> [`3.6`]
1. `io.pcp.agentparfait:parfait-agent`  -> [`1.1.0`, `1.1.1`]
1. `javax.measure:unit-api`  -> [`2.0-PRD`, `2.1`, `2.1.1`, `2.1.2`, `2.1.3`]

## java.servlet

1. `com.guicedee.services:jakarta.servlet-api`  -> [`1.0.10.0-jre14`, `1.0.10.1-jre14`, `1.0.10.3-jre14`, `1.0.10.4-jre14`, `1.0.11.0-jre14`, `1.0.11.2-jre14`, `1.0.11.5-jre14`, `1.0.11.6-jre14`, `1.0.11.7-jre14`, `1.0.12.0-jre14`, `1.0.12.1-jre14`, `1.0.12.2-jre14`, `1.0.12.3-jre14`, `1.0.12.4-jre14`, `1.0.12.5-jre14`, `1.0.13.0-jre14`, `1.0.13.1-jre14`, `1.0.13.2-jre14`, `1.0.13.3-jre14`, `1.0.13.4-jre14`, `1.0.13.5-jre14`, `1.0.14.0-RC1-jre14`, `1.0.14.1-jre14`, `1.0.14.3-jre8`, `1.0.14.4-jre8`, `1.0.14.4-jre14`, `1.0.15.1-jre14`, `1.0.15.2-jre14`, `1.0.15.3-jre8`, `1.0.15.3-jre14`, `1.0.15.4-jre8`, `1.0.15.4-jre14`, `1.0.15.5-jre8`, `1.0.15.5-jre14`, `1.0.16.0-jre14`, `1.0.17.0-jre14`, `1.0.17.1-jre14`, `1.0.18.0-jre14`, `1.0.18.0-jre15`, `1.0.18.1-jre14`, `1.0.18.1-jre15`, `1.0.19.0-jre14`, `1.0.19.0-jre15`, `1.0.19.1-jre15`, `1.0.19.2-jre14`, `1.0.19.2-jre15`, `1.0.19.3-jre14`, `1.0.19.3-jre15`, `1.0.19.4-jre14`, `1.0.19.4-jre15`, `1.0.19.5-jre14`, `1.0.19.5-jre15`, `1.0.19.6-jre8`, `1.0.19.6-jre14`, `1.0.19.7-jre14`, `1.0.19.8-jre8`, `1.0.19.9-jre8`, `1.0.19.9-jre14`, `1.0.19.9-jre15`, `1.0.19.10-jre8`, `1.0.19.10-jre14`, `1.0.19.10-jre15`, `1.0.19.11-jre8`, `1.0.19.11-jre14`, `1.0.19.12-jre8`, `1.0.19.12-jre14`, `1.0.19.13-jre8`, `1.0.19.13-jre14`, `1.0.19.13-jre15`, `1.0.20.0-jre8`, `1.0.20.0-jre14`, `1.0.20.0-jre15`, `1.0.20.1-jre8`, `1.0.20.1-jre14`, `1.0.20.1-jre15`, `1.0.20.2-jre8`, `1.0.20.2-jre14`, `1.0.20.2-jre15`, `1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`]
1. `com.guicedee.services:java.servlet-api`  -> [`1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`, `1.1.1.9-jre16`, `1.2.0.0-jre16`, `1.2.0.1-jre16`, `1.2.0.2-jre16`, `1.2.0.3-jre17-rc1`, `1.2.1.1-jre17`, `1.2.1.2-jre17`, `1.2.2.1`, `1.2.2.1-jre17`]
1. `org.apache.felix:org.apache.felix.http.servlet-api`  -> [`1.2.0`]

## java.transaction

1. `com.guicedee.services:javax.transaction`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.thirdparty:javax.transaction`  -> [`0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `org.jboss.spec.javax.transaction:jboss-transaction-api_1.2_spec`  -> [`2.0.0.Alpha1`]

## kotlin.test.junit

1. `org.jetbrains.kotlin:kotlin-test-junit` 🧩 -> [`1.4.0-rc`, `1.4.0`, `1.4.10`, `1.4.20-M1`, `1.4.20-RC`, `1.4.20`, `1.4.21`, `1.4.30-M1`, `1.4.30-RC`, `1.4.30`, `1.4.31`, `1.5.0-M1`, `1.5.0-M2`, `1.5.0-RC`, `1.5.0`, `1.5.10`, `1.5.20-M1`, `1.5.20-RC`, `1.5.20`, `1.5.21`, `1.5.30-M1`, `1.5.30-RC`, `1.5.30`, `1.5.31`, `1.6.0-M1`, `1.6.0-RC`, `1.6.0-RC2`, `1.6.0`, `1.6.10-RC`, `1.6.10`, `1.6.20-M1`, `1.6.20-RC`, `1.6.20-RC2`, `1.6.20`, `1.6.21`, `1.7.0-Beta`]
1. `org.jetbrains.lets-plot:lets-plot-batik`  -> [`2.0.2-rc1`, `2.0.2`, `2.0.3-rc1`, `2.0.3-rc2`, `2.0.3`, `2.0.4`]
1. `org.jetbrains.lets-plot:lets-plot-jfx`  -> [`2.0.2-rc1`, `2.0.2`, `2.0.3-rc1`, `2.0.3-rc2`, `2.0.3`, `2.0.4`]

## net.dongliu.cute.http.jsonb

1. `net.dongliu:cute-http-gson`  -> [`1.2.2`, `3.0.0`]
1. `net.dongliu:cute-http-jackson`  -> [`1.1.2`, `1.2.0`, `1.2.1`, `1.2.2`, `3.0.0`]
1. `net.dongliu:cute-http-jsonb` 🧩 -> [`1.1.0`, `1.1.1`, `1.1.2`, `1.2.0`, `1.2.1`, `1.2.2`, `3.0.0`]

## net.frogmouth.chronyjava

1. `net.frogmouth.chronyjava:chrony-java`  -> [`0.6`]
1. `net.frogmouth.chronyjava:java-chrny-candm` 🧩 -> [`0.8`]
1. `net.frogmouth.chronyjava:java-chrony-candm`  -> [`0.7`]

## net.tascalate.instrument.emitter

1. `net.tascalate.instrument:net.tascalate.instrument.emitter11`  -> [`1.0.0`, `1.0.1`, `1.1.0`, `1.1.1`, `1.2.0`, `1.3.0`]
1. `net.tascalate.instrument:net.tascalate.instrument.emitter9` 🧩 -> [`1.0.0`, `1.0.1`, `1.1.0`, `1.1.1`, `1.2.0`, `1.3.0`]
1. `net.tascalate.instrument:net.tascalate.instrument.emitter`  -> [`1.0.0`, `1.0.1`, `1.1.0`, `1.1.1`, `1.2.0`, `1.3.0`]

## net.tascalate.instrument.examples.app

1. `net.tascalate.instrument:net.tascalate.instrument.examples.app9modular`  -> [`1.0.0`, `1.0.1`, `1.1.0`, `1.1.1`, `1.2.0`, `1.3.0`]
1. `net.tascalate.instrument:net.tascalate.instrument.examples.app9simple`  -> [`1.0.0`, `1.0.1`, `1.1.0`, `1.1.1`, `1.2.0`, `1.3.0`]
1. `net.tascalate.instrument:net.tascalate.instrument.examples.load9` 🧩 -> [`1.0.0`, `1.0.1`, `1.1.0`, `1.1.1`, `1.2.0`, `1.3.0`]

## org.apache.commons.logging

1. `com.guicedee.services:commons-logging`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `no.ssb.vtl:java-vtl-interpreter`  -> [`0.1.0`]
1. `org.slf4j:jcl-over-slf4j`  -> [`1.8.0-beta2`, `1.8.0-beta4`, `2.0.0-alpha0`, `2.0.0-alpha1`, `2.0.0-alpha2`, `2.0.0-alpha3`, `2.0.0-alpha4`, `2.0.0-alpha5`, `2.0.0-alpha6`, `2.0.0-alpha7`]

## org.apache.poi.ooxml.schemas

1. `org.apache.poi:poi-ooxml-full`  -> [`5.0.0`, `5.1.0`, `5.2.0`, `5.2.1`, `5.2.2`]
1. `org.apache.poi:poi-ooxml-lite` 🧩 -> [`5.0.0`, `5.1.0`, `5.2.0`, `5.2.1`, `5.2.2`]
1. `org.lucee:poi-ooxml-lite`  -> [`5.0.0`]

## org.apache.tomcat.juli

1. `de.mklinger.tomcat:tomcat-juli-slf4j`  -> [`9.0.38`]
1. `org.apache.tomcat:tomcat-juli` 🧩 -> [`10.0.0-M8`, `10.0.0-M9`, `10.0.0-M10`, `10.0.0`, `10.0.2`, `10.0.4`, `10.0.5`, `10.0.6`, `10.1.0-M1`, `10.1.0-M2`, `10.1.0-M4`, `10.1.0-M5`, `10.1.0-M6`, `10.1.0-M7`, `10.1.0-M8`, `10.1.0-M10`, `10.1.0-M11`, `10.1.0-M12`, `10.1.0-M14`]
1. `org.apache.tomee:tomee-juli`  -> [`8.0.5`, `8.0.6`, `8.0.7`, `8.0.8`, `8.0.9`, `8.0.10`, `8.0.11`]

## org.bouncycastle.fips.core

1. `org.blobit:blobit-cli`  -> [`0.5.0`]
1. `org.bouncycastle:bc-fips-debug` 🧩 -> [`1.0.2`, `1.0.2.1`, `1.0.2.3`]
1. `org.bouncycastle:bc-fips`  -> [`1.0.2`, `1.0.2.1`, `1.0.2.3`]

## org.bytedeco.hdf5.platform

1. `es.upm.etsisi:cf4j`  -> [`2.1.1`, `2.1.2`, `2.2.1`, `2.2.2`, `2.2.3`, `2.2.4`, `2.2.5`, `2.2.6`]
1. `org.bytedeco:hdf5-platform` 🧩 -> [`1.10.5-1.5`, `1.10.5-1.5.1`, `1.10.5-1.5.2`, `1.12.0-1.5.3`, `1.12.0-1.5.4`, `1.12.0-1.5.5`, `1.12.1-1.5.6`, `1.12.1-1.5.7`]
1. `org.deeplearning4j:deeplearning4j-ui-standalone`  -> [`1.0.0-beta6`, `1.0.0-beta7`]

## org.codehaus.plexus.languages.java

1. `com.github.jxc454:udpmodels`  -> [`1.0.1`]
1. `dev.redcoke:mcserverping`  -> [`0.1`, `0.1.1`, `0.1.2`, `0.1.3`]
1. `org.codehaus.plexus:plexus-java` 🧩 -> [`0.9.11`, `1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.1.0`, `1.1.1`]

## org.eclipse.jetty.server

1. `de.acosix.alfresco.transform:de.acosix.alfresco.transform.base`  -> [`0.1.0`]
1. `de.acosix.alfresco.transform:de.acosix.alfresco.transform.onlyoffice`  -> [`0.1.0`]
1. `org.eclipse.jetty:jetty-server` 🧩 -> [`10.0.0-alpha0`, `10.0.0.alpha1`, `10.0.0.alpha2`, `10.0.0.beta0`, `11.0.0-alpha0`, `11.0.0.beta1`, `11.0.0.beta2`, `11.0.0.beta3`, `11.0.0`, `11.0.1`, `11.0.2`, `11.0.3`, `11.0.4`, `11.0.5`, `11.0.6`, `11.0.7`, `11.0.8`, `11.0.9`]

## org.freedesktop.dbus.transport.jnr

1. `com.github.hypfvieh:dbus-java-transport-jnr-unixsocket`  -> [`4.0.0`]
1. `com.github.hypfvieh:dbus-java-transport-native-unixsocket`  -> [`4.0.0`]
1. `com.github.hypfvieh:dbus-java-transport-tcp`  -> [`4.0.0`]

## org.glassfish.jaxb.runtime

1. `org.glassfish.jaxb:jaxb-runtime` 🧩 -> [`3.0.0-M1`, `3.0.0-M2`, `3.0.0-M3`, `3.0.0-M4`, `3.0.0-M5`, `3.0.0`, `3.0.1`, `3.0.2-b01`, `3.0.2`, `4.0.0-M4`]
1. `org.jboss.windup.web:windup-keycloak-tool`  -> [`5.5.0.Final`, `5.6.0.Final`, `5.7.0.Final`]
1. `org.mustangproject:Mustang-CLI`  -> [`2.1.0`, `2.1.1`, `2.2.0`, `2.2.1`, `2.3.0`, `2.3.1`]

## org.hibernate.search.batch.jsr352.core

1. `org.hibernate.search:hibernate-search-mapper-orm-batch-jsr352-core-jakarta`  -> [`6.1.0.Beta1`, `6.1.0.Beta2`, `6.1.0.CR1`, `6.1.0.Final`, `6.1.1.Final`, `6.1.2.Final`, `6.1.3.Final`, `6.1.4.Final`]
1. `org.hibernate.search:hibernate-search-mapper-orm-batch-jsr352-core-orm6` 🧩 -> [`6.1.0.CR1`, `6.1.0.Final`, `6.1.1.Final`, `6.1.2.Final`, `6.1.3.Final`, `6.1.4.Final`]
1. `org.hibernate.search:hibernate-search-mapper-orm-batch-jsr352-core`  -> [`6.1.0.Beta1`, `6.1.0.Beta2`, `6.1.0.CR1`, `6.1.0.Final`, `6.1.1.Final`, `6.1.2.Final`, `6.1.3.Final`, `6.1.4.Final`]

## org.hibernate.search.mapper.orm.coordination.outboxpolling

1. `org.hibernate.search:hibernate-search-mapper-orm-coordination-outbox-polling-jakarta`  -> [`6.1.0.Beta1`, `6.1.0.Beta2`, `6.1.0.CR1`, `6.1.0.Final`, `6.1.1.Final`, `6.1.2.Final`, `6.1.3.Final`, `6.1.4.Final`]
1. `org.hibernate.search:hibernate-search-mapper-orm-coordination-outbox-polling-orm6` 🧩 -> [`6.1.0.CR1`, `6.1.0.Final`, `6.1.1.Final`, `6.1.2.Final`, `6.1.3.Final`, `6.1.4.Final`]
1. `org.hibernate.search:hibernate-search-mapper-orm-coordination-outbox-polling`  -> [`6.1.0.Beta1`, `6.1.0.Beta2`, `6.1.0.CR1`, `6.1.0.Final`, `6.1.1.Final`, `6.1.2.Final`, `6.1.3.Final`, `6.1.4.Final`]

## org.jruby.joni

1. `com.github.cukedoctor:cukedoctor-main`  -> [`2.0`, `2.1`, `3.0`]
1. `net.thisptr:jackson-jq-cli`  -> [`0.0.10`]
1. `org.jruby.joni:joni` 🧩 -> [`2.1.20`, `2.1.21`, `2.1.23`, `2.1.24`, `2.1.25`, `2.1.26`, `2.1.27`, `2.1.28`, `2.1.29`, `2.1.30`, `2.1.31`, `2.1.32`, `2.1.33`, `2.1.34`, `2.1.35`, `2.1.36`, `2.1.37`, `2.1.38`, `2.1.39`, `2.1.40`, `2.1.41`, `2.1.42`, `2.1.43`]

## org.junit.vintage.engine

1. `org.eclipse.tycho:org.eclipse.tycho.surefire.junit55`  -> [`1.7.0`, `2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`, `2.4.0`, `2.5.0`, `2.6.0`, `2.7.0`, `2.7.1`, `2.7.2`, `2.7.3`]
1. `org.eclipse.tycho:org.eclipse.tycho.surefire.junit56`  -> [`1.7.0`]
1. `org.junit.vintage:junit-vintage-engine` 🧩 -> [`5.5.0-RC1`, `5.5.0-RC2`, `5.5.0`, `5.5.1`, `5.5.2`, `5.6.0-M1`, `5.6.0-RC1`, `5.6.0`, `5.6.1`, `5.6.2`, `5.7.0-M1`, `5.7.0-RC1`, `5.7.0`, `5.7.1`, `5.8.0-M1`, `5.8.0-RC1`, `5.8.0`, `5.8.1`, `5.8.2`]

## org.kordamp.iconli.core

1. `eu.hansolo.fx.regulators:regulators`  -> [`11.0`, `11.2`, `11.5`]
1. `eu.hansolo:regulators`  -> [`11.6`]
1. `org.kordamp.ikonli:ikonli-core`  -> [`11.0.2`, `11.1.0`, `11.2.0`, `11.3.0`, `11.3.1`, `11.3.3`, `11.3.4`, `11.3.5`, `11.4.0`, `11.5.0`]

## org.lwjgl

1. `io.github.ranchordo:lepton`  -> [`1.0.2`]
1. `org.lwjgl.osgi:org.lwjgl.lwjgl`  -> [`3.2.1.1`, `3.2.1.2`, `3.3.0`]
1. `org.lwjgl:lwjgl` 🧩 -> [`3.2.0`, `3.2.1`, `3.2.2`, `3.2.3`, `3.3.0`, `3.3.1`]

## org.lwjgl.glfw

1. `io.github.spair:imgui-java-app`  -> [`1.83.3`, `1.84.1.0`, `1.84.1.1`, `1.84.1.2`, `1.84.1.3`, `1.84.1.4`, `1.85.0`, `1.85.1`, `1.86.0`, `1.86.1`, `1.86.2`, `1.86.3`, `1.86.4`]
1. `org.lwjgl.osgi:org.lwjgl.glfw`  -> [`3.2.1.1`, `3.2.1.2`, `3.3.0`]
1. `org.lwjgl:lwjgl-glfw` 🧩 -> [`3.2.0`, `3.2.1`, `3.2.2`, `3.2.3`, `3.3.0`, `3.3.1`]

## org.openqa.selenium.remote

1. `com.infotel.seleniumRobot:core`  -> [`4.4.0`, `4.4.1`, `4.4.2`, `4.4.3`, `4.4.4`, `4.5.0`, `4.5.1`, `4.6.0`, `4.6.1`, `4.6.2`, `4.7.0`, `4.7.1`, `4.7.2`, `4.7.3`, `4.8.0`, `4.8.1`, `4.8.2`, `4.8.3`, `4.8.4`, `4.8.5`, `4.8.6`, `4.8.7`, `4.8.8`, `4.9.0`, `4.9.1`, `4.9.2`, `4.9.3`, `4.10.0`, `4.11.0`, `4.11.1`, `4.11.2`, `4.12.0`, `4.13.0`, `4.13.1`, `4.13.2`, `4.13.3`, `4.14.0`, `4.14.1`, `4.15.0`, `4.15.1`, `4.15.2`, `4.15.3`, `4.16.0`, `4.16.1`, `4.16.2`, `4.17.0`, `4.18.0`, `4.18.1`, `4.18.2`, `4.18.3`, `4.18.4`, `4.18.5`, `4.19.0`, `4.20.0`, `4.20.1`, `4.20.2`, `4.21.0`, `4.21.1`, `4.21.2`, `4.21.3`, `4.21.4`, `4.21.5`, `4.21.6`, `4.22.0`]
1. `io.github.jaqat:remoterobot`  -> [`0.2.1`, `0.2.2`]
1. `org.seleniumhq.selenium:selenium-remote-driver`  -> [`3.14.0`, `3.141.0`, `3.141.5`, `3.141.59`, `4.0.0-alpha-1`, `4.0.0-alpha-2`]

## org.pf4j

1. `com.wizzdi:flexicore-security-service`  -> [`1.0.0`]
1. `org.pf4j:pf4j` 🧩 -> [`3.0.1`, `3.1.0`, `3.2.0`, `3.5.0`, `3.6.0`]
1. `org.rationalityfrontline.workaround:pf4j`  -> [`3.7.0`, `3.7.1`]

## tagtraum.japlscript

1. `com.tagtraum:japlscript-complete`  -> [`3.3.0`]
1. `com.tagtraum:japlscript-java`  -> [`3.3.0`]
1. `com.tagtraum:japlscript-runtime`  -> [`3.4.0`, `3.4.1`, `3.4.2`, `3.4.3`, `3.4.4`, `3.4.5`, `3.4.6`, `3.4.7`, `3.4.8`, `3.4.9`, `3.4.10`, `3.4.11`]

## tm.bitronix.btm

1. `com.guicedee.services:btm`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.guicedee.persistence:btm`  -> [`0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre11:btm`  -> [`0.63.0.17`, `0.63.0.19`]
