# Impostor Modules

An impostor module is a Maven artifact that contains the `module-info.class` file from a different Maven artifact.
Some well known modules that were packaged as Maven artifacts by their authors, have been repackaged into dozens of other Maven artifacts by the maintainers of those other artifacts.
This makes it look like there are dozens of modules with the same name in Maven Central -- all but one are impostor modules.

1. `org.apache.logging.log4j` x129
1. `com.fasterxml.jackson.databind` x70
1. `java.xml.bind` x61
1. `net.bytebuddy` x58
1. `org.bouncycastle.provider` x55
1. `org.objectweb.asm` x50
1. `com.google.gson` x44
1. `com.fasterxml.jackson.core` x42
1. `info.picocli` x37
1. `kotlin.stdlib.jdk8` x35
1. `com.fasterxml.jackson.annotation` x34
1. `org.slf4j` x33
1. `io.github.classgraph` x26
1. `kotlin.stdlib` x25
1. `lombok` x24
1. `org.objectweb.asm.commons` x19
1. `org.bouncycastle.pkix` x18
1. `com.fasterxml.jackson.module.jaxb` x14
1. `java.ws.rs` x14
1. `com.fasterxml.jackson.dataformat.yaml` x13
1. `com.fasterxml.jackson.datatype.jdk8` x13
1. `org.openqa.selenium.core` x13
1. `org.bouncycastle.pg` x12
1. `com.sun.xml.bind` x11
1. `com.zaxxer.hikari` x11
1. _... and some more._

## org.apache.logging.log4j

For example, at least 129 artifacts on Maven Central claim to be the module `org.apache.logging.log4j`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.apache.logging.log4j;`.

1. `au.org.consumerdatastandards:codegen`  -> [`0.9.6`, `1.0.0-RC1`, `1.0.0-RC2`, `1.0.0-RC3`, `1.0.0-RC4`, `1.0.0-RC5`, `1.0.0-RC6`, `1.0.0`, `1.1.1`]
1. `cn.net.mugui:spring`  -> [`1.00`, `1.01`, `1.02`, `1.03`, `1.05`, `1.06`, `1.08`, `1.10`, `1.11`, `1.12`, `1.13`]
1. `com.alibaba.ververica:flink-connector-test-util`  -> [`1.0.0`, `1.1.0`, `1.1.1`, `1.2.0`, `1.3.0`, `1.4.0`]
1. `com.ardikars.jxnet:jxnet-example`  -> [`1.5.5.RC5`]
1. `com.arpitos:arpitos-fw`  -> [`0.0.2`]
1. `com.arpitos:artos`  -> [`0.0.1`]
1. `com.criteo.java:garmadon-readers-elasticsearch`  -> [`0.0.1`, `1.0.0`, `1.2.0`, `1.3.0`, `1.3.1`, `1.4.0`]
1. `com.datarobot:datarobot-mlops`  -> [`5.3.0`, `5.3.0.1`, `6.0.0`, `6.1.3`]
1. `com.dlsc.workbenchfx:workbenchfx-core`  -> [`1.0.0`, `11.0.0`]
1. `com.github.answerail:dingtalk-spring-boot-starter`  -> [`1.0.1-RELEASE`, `1.0.2-RELEASE`]
1. `com.github.code-cubic:elasticsearch-tool`  -> [`6.5.4.20201101-RELEASE`, `6.5.4.20201110-RELEASE`, `6.5.4.20210101-RELEASE`, `6.5.4.20210220-RELEASE`, `6.5.4.20210310-RELEASE`]
1. `com.github.containersolutions:mysql-schema-sample`  -> [`1.2.3`, `1.3.0`]
1. `com.github.containersolutions:webserver-sample`  -> [`1.2.3`, `1.3.0`]
1. `com.github.daggerok.sonar:sonar-breaker`  -> [`0.1.4`, `0.1.5`, `1.0.0`, `1.0.1`]
1. `com.github.joselion:lion-spring-security`  -> [`1.0.1`]
1. `com.github.onbass-naga:schema2json`  -> [`1.0.0`, `1.0.1`]
1. `com.github.pellierd:pddl4j`  -> [`3.7.2`, `3.7.3`, `3.8`, `3.8.1`, `3.8.2`, `3.8.3`]
1. `com.github.quickstart-nt-996:data-generator-hive`  -> [`0.0.2-RELEASE`]
1. `com.github.skapral.poetryclub:poetryclub-app`  -> [`0.0.0`, `0.0.1`]
1. `com.github.vzakharchenko:radius-plugin`  -> [`0.1`, `1.0.0`, `1.0.1`, `1.0.2`, `1.1.0`, `1.2.0`, `1.2.2`, `1.2.3`, `1.2.4`, `1.2.5`, `1.2.6`, `1.2.9`, `1.3.0`, `1.3.1`, `1.3.2`, `1.3.3`, `1.3.4`, `1.3.5`, `1.3.6`]
1. `com.github.xincao9:jsonrpc-benchmark`  -> [`1.2.1`, `1.2.2`, `1.2.3`, `1.2.4`, `1.2.5`]
1. `com.github.xincao9:jsonrpc-ui`  -> [`1.2.5`]
1. `com.github.xincao9:jswitcher-sample`  -> [`1.2.1`, `1.2.2`]
1. `com.github.xincao9:jswitcher-ui`  -> [`1.2`, `1.2.1`, `1.2.2`]
1. `com.groupbyinc:common-flux-nologgers-stage`  -> [`129`]
1. `com.groupbyinc:common-flux-nologgers`  -> [`129`]
1. `com.groupbyinc:common-flux-stage`  -> [`129`]
1. `com.guicedee.services:log4j-core`  -> [`1.0.8.12-jre14`, `1.0.8.16-jre14`, `1.0.8.18-jre14`, `1.0.9.0-jre14`, `1.0.9.1-jre14`, `1.0.9.2-jre14`, `1.0.9.3-jre14`, `1.0.9.4-jre14`, `1.0.9.5-jre14`, `1.0.9.7-jre14`, `1.0.9.10-jre14`, `1.0.9.11-jre14`, `1.0.9.13-jre14`, `1.0.9.14-jre14`, `1.0.10.0-jre14`, `1.0.10.1-jre14`, `1.0.10.3-jre14`, `1.0.10.4-jre14`, `1.0.11.0-jre14`, `1.0.11.2-jre14`, `1.0.11.5-jre14`, `1.0.11.6-jre14`, `1.0.11.7-jre14`, `1.0.12.0-jre14`, `1.0.12.1-jre14`, `1.0.12.2-jre14`, `1.0.12.3-jre14`, `1.0.12.4-jre14`, `1.0.12.5-jre14`, `1.0.13.0-jre14`, `1.0.13.1-jre14`, `1.0.13.2-jre14`, `1.0.13.3-jre14`, `1.0.13.4-jre14`, `1.0.13.5-jre14`]
1. `com.hedera.hashgraph:java-sdk`  -> [`0.2.0`]
1. `com.hpe.adm.octane.ciplugins:bamboo-ci-plugin`  -> [`1.10.1`]
1. `com.ibm.ta.sdk:ta-sdk-sample`  -> [`0.5.2`, `0.5.2-1`, `0.5.2-2`, `0.5.3`, `0.5.4`, `0.5.5`, `0.6.0`, `0.6.1`]
1. `com.jpaulmorrison:javafbp-websockets`  -> [`1.2.7`]
1. `com.khubla.olmreader:olmreader`  -> [`1.8.0`]
1. `com.macasaet.fernet:fernet-aws-secrets-manager-rotator`  -> [`1.5.0`]
1. `com.microsoft.azure:azure-cosmos-cassandra-uploader`  -> [`1.0.9`, `1.0.10`, `1.0.12`, `1.0.13`, `1.0.14`, `1.0.15`, `1.0.16`]
1. `com.netflix.conductor:conductor-es6-persistence`  -> [`2.27.0-beta.2`, `2.27.0`, `2.27.1`, `2.27.2`, `2.27.3`, `2.27.4`, `2.27.5`, `2.27.6`, `2.28.0`, `2.28.1`, `2.28.2`, `2.28.3`, `2.28.4-alpha`, `2.29.0`, `2.29.1`, `2.29.2`, `2.29.3`, `2.30.1`, `2.30.2`, `2.30.3`, `2.30.4`, `2.31.0`, `2.31.1`, `2.31.2`, `2.31.3`]
1. `com.netflix.conductor:conductor-es7-persistence`  -> [`2.31.1`, `2.31.2`, `2.31.3`, `2.31.4`]
1. `com.nimblygames.packr:packr-all`  -> [`2.3.0`, `2.4.2`, `2.5.0`, `2.6.0`, `2.6.2`, `2.6.3`, `2.6.4`, `2.7.0`]
1. `com.oceanprotocol:secret-store-client`  -> [`0.0.3`]
1. `com.opkloud:kloudminions-api`  -> [`1.0.6`]
1. `com.sagframe:sqltoy-quickvo`  -> [`4.9.9`, `4.9.13`, `4.10.0`, `4.10.1`, `4.10.8`, `4.10.9`, `4.11.0`, `4.11.1`, `4.11.5`, `4.11.7`, `4.11.8`, `4.11.9`]
1. `com.snowflake:snowflake-kafka-connector`  -> [`1.1.0`]
1. `com.spotify.ffwd:ffwd-agent`  -> [`0.4.1`, `0.4.2`, `0.4.3`, `0.4.4`, `0.4.5`, `0.4.6`]
1. `com.theartos:artos`  -> [`0.0.1`, `0.0.2`, `0.0.3`, `0.0.4`, `0.0.5-beta-1`, `0.0.5-beta-2`, `0.0.6`, `0.0.7`, `0.0.8`, `0.0.9`, `0.0.10`, `0.0.11`, `0.0.12`, `0.0.13-beta-1`, `0.0.13-beta-2`, `0.0.13`, `0.0.14-beta-1`]
1. `com.weblyzard.sparql:streaming-client`  -> [`0.0.7.2`]
1. `com.weicoder.extend:core-extend`  -> [`3.3.2`, `3.3.3`, `3.3.4`]
1. `com.weicoder.extend:log-extend`  -> [`3.3.5`]
1. `de.charite.compbio:jannovar-cli`  -> [`0.32`]
1. `de.sfuhrm:logwebconfig-example`  -> [`0.8.2`]
1. `de.wenzlaff.twbibel:de.wenzlaff.twbibel`  -> [`0.0.3`]
1. `es.us.isa:idl-reasoner`  -> [`0.0.1`, `0.0.2`]
1. `es.us.isa:json-mutator`  -> [`0.0.1`]
1. `eu.europa.ec.eurostat:searoute-jar`  -> [`3.1`]
1. `eu.fthevenet:binjr`  -> [`1.4.0`, `1.4.1`, `1.4.2`, `1.4.3`]
1. `eu.stamp-project:botsing-reproduction`  -> [`1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`]
1. `io.bluebank.braid:braid-server`  -> [`4.1.2-RC06`, `4.1.2-RC07`, `4.1.2-RC08`, `4.1.2-RC10`, `4.1.2-RC11`, `4.1.2-RC12`, `4.1.2-RC13`]
1. `io.cellery.distribution:io.cellery.cell.api.publisher`  -> [`0.4.0`]
1. `io.cellery.distribution:io.cellery.cell.gateway.initializer`  -> [`0.1.0`, `0.4.0`]
1. `io.cellery.security:io.cellery.security.cell.sts.server`  -> [`0.2.1`, `0.4.0`, `0.6.0`]
1. `io.github.basilapi:basil-server`  -> [`0.8.0`]
1. `io.github.jas34:scheduledwf-server`  -> [`1.0.0-rc1`, `1.0.0`]
1. `io.github.shiruka:api`  -> [`1.8.0`, `1.9.0`]
1. `io.github.shiruka:common`  -> [`3.2.0`, `3.3.0`, `3.4.0`]
1. `io.github.shiruka:fragment`  -> [`1.6.0`, `1.6.1`]
1. `io.github.shiruka:world-fragment`  -> [`3.2.10`, `3.2.11`]
1. `io.javaoperatorsdk:mysql-schema-sample`  -> [`1.3.0`, `1.4.0`, `1.5.0`, `1.6.1`, `1.6.2`, `1.7.0`, `1.7.1`]
1. `io.javaoperatorsdk:tomcat-sample`  -> [`1.3.0`, `1.4.0`, `1.5.0`]
1. `io.javaoperatorsdk:webserver-sample`  -> [`1.3.0`, `1.4.0`, `1.5.0`, `1.6.1`, `1.6.2`, `1.7.0`, `1.7.1`]
1. `io.michaelrocks.pablo:pablo`  -> [`1.1.0`, `1.1.1`, `1.1.3`, `1.2.0`]
1. `io.mosip.kernel:kernel-auth-adapter`  -> [`1.1.3-rc1`, `1.1.3-rc2`, `1.1.3`, `1.1.4-rc1`, `1.1.4`, `1.1.5-rc1`, `1.1.5`, `1.1.5.1`, `1.1.5.2`]
1. `io.mosip.registrationprocessor:registration-processor-common-camel-bridge`  -> [`1.1.2-rc2`, `1.1.2-rc3`, `1.1.2`, `1.1.3-rc1`, `1.1.3-rc2`, `1.1.3`, `1.1.4-rc1`, `1.1.4`, `1.1.5-rc1`, `1.1.5`]
1. `io.nosqlbench:driver-cql-shaded`  -> [`3.12.103`, `3.12.104`, `3.12.106`, `3.12.109`, `3.12.110`, `3.12.111`, `3.12.113`, `3.12.114`, `3.12.115`, `3.12.116`, `3.12.117`, `3.12.119`, `3.12.120`, `3.12.121`, `3.12.122`, `3.12.123`, `3.12.124`, `3.12.125`, `3.12.126`, `3.12.127`, `3.12.128`, `3.12.129`, `3.12.130`, `3.12.131`, `3.12.132`, `3.12.133`, `3.12.134`, `3.12.135`, `3.12.136`, `3.12.137`, `3.12.138`, `3.12.139`, `3.12.140`, `3.12.141`, `3.12.142`, `3.12.143`, `3.12.144`, `3.12.146`, `3.12.147`, `3.12.148`, `3.12.149`, `3.12.150`, `3.12.151`, `3.12.152`, `3.12.153`, `3.12.154`, `3.12.155`, `3.12.200`, `3.12.201`, `3.12.202`]
1. `io.nosqlbench:driver-dsegraph-shaded`  -> [`3.12.155`, `3.12.200`, `3.12.201`, `3.12.202`]
1. `io.nosqlbench:nb`  -> [`3.12.86`, `3.12.87`, `3.12.88`, `3.12.89`, `3.12.90`, `3.12.91`, `3.12.92`, `3.12.93`, `3.12.94`, `3.12.95`, `3.12.96`, `3.12.97`, `3.12.98`, `3.12.99`]
1. `io.nosqlbench:virtdata-lib-curves4`  -> [`3.12.1`, `3.12.2`, `3.12.17`, `3.12.19`, `3.12.20`, `3.12.21`, `3.12.22`, `3.12.23`, `3.12.24`, `3.12.25`, `3.12.26`, `3.12.27`, `3.12.28`, `3.12.29`, `3.12.30`, `3.12.31`, `3.12.32`, `3.12.34`, `3.12.35`, `3.12.36`, `3.12.37`, `3.12.38`, `3.12.39`, `3.12.41`, `3.12.43`, `3.12.44`, `3.12.45`, `3.12.46`, `3.12.47`, `3.12.48`, `3.12.52`, `3.12.53`, `3.12.54`, `3.12.55`, `3.12.60`, `3.12.61`, `3.12.62`, `3.12.66`, `3.12.67`, `3.12.70`, `3.12.71`, `3.12.72`, `3.12.73`, `3.12.75`, `3.12.76`, `3.12.77`, `3.12.78`, `3.12.79`, `3.12.81`, `3.12.82`, `3.12.83`, `3.12.84`, `3.12.85`, `3.12.86`, `3.12.87`, `3.12.88`, `3.12.89`, `3.12.90`, `3.12.91`, `3.12.92`, `3.12.93`, `3.12.94`, `3.12.95`, `3.12.96`, `3.12.97`, `3.12.98`, `3.12.99`]
1. `io.nosqlbench:virtdata-lib-random`  -> [`3.12.1`, `3.12.2`, `3.12.17`, `3.12.19`, `3.12.20`, `3.12.21`, `3.12.22`, `3.12.23`, `3.12.24`, `3.12.25`, `3.12.26`, `3.12.27`, `3.12.28`, `3.12.29`, `3.12.30`, `3.12.31`, `3.12.32`, `3.12.34`, `3.12.35`, `3.12.36`, `3.12.37`, `3.12.38`, `3.12.39`, `3.12.41`, `3.12.43`, `3.12.44`, `3.12.45`, `3.12.46`, `3.12.47`, `3.12.48`]
1. `io.nosqlbench:virtdata-lib-realer`  -> [`3.12.1`, `3.12.2`, `3.12.17`, `3.12.19`, `3.12.20`, `3.12.21`, `3.12.22`, `3.12.23`, `3.12.24`, `3.12.25`, `3.12.26`, `3.12.27`, `3.12.28`, `3.12.29`, `3.12.30`, `3.12.31`, `3.12.32`, `3.12.34`, `3.12.35`, `3.12.36`, `3.12.37`, `3.12.38`, `3.12.39`, `3.12.41`, `3.12.43`, `3.12.44`, `3.12.45`, `3.12.46`, `3.12.47`, `3.12.48`]
1. `io.nosqlbench:virtdata-realdata`  -> [`3.12.1`, `3.12.2`, `3.12.17`, `3.12.19`, `3.12.20`, `3.12.21`, `3.12.22`, `3.12.23`, `3.12.24`, `3.12.25`, `3.12.26`, `3.12.27`, `3.12.28`, `3.12.29`, `3.12.30`, `3.12.31`, `3.12.32`, `3.12.34`, `3.12.35`, `3.12.36`, `3.12.37`, `3.12.38`, `3.12.39`, `3.12.41`, `3.12.43`, `3.12.44`, `3.12.45`, `3.12.46`, `3.12.47`, `3.12.48`]
1. `io.streamnative:pulsar-functions-runtime-all`  -> [`2.7.1.4`, `2.7.1.5-rc-202104301334`, `2.7.1.5-rc-202105051501`, `2.7.1.5-rc-202105062307`, `2.7.1.5-rc-202105072323`, `2.7.2.0-rc-202105080004`, `2.7.2.0-rc-202105080044`, `2.7.2.0-rc-202105080149`]
1. `io.wizzie.enricher:service`  -> [`0.6.1`]
1. `io.wizzie:enricher-extensions`  -> [`0.5.1`, `0.5.1.1`]
1. `io.wizzie:enricher-service`  -> [`0.5.1`, `0.5.1.1`]
1. `io.zeebe:zeebe-dmn-worker`  -> [`0.2.0`, `0.3.0`, `0.4.0`]
1. `io.zeebe:zeebe-http-worker`  -> [`0.2.0`]
1. `io.zeebe:zeebe-kafka-exporter-samples`  -> [`1.0.0`, `1.1.0`]
1. `io.zeebe:zeebe-script-worker`  -> [`0.4.0`, `0.5.0`, `0.6.0`, `0.6.1`]
1. `me.escoffier.fluid:review-example`  -> [`0.8`]
1. `net.corda:corda-tools-blob-inspector`  -> [`4.3`, `4.4`, `4.5`, `4.6`, `4.8`]
1. `nl.basjes.parse.useragent:yauaa-commandline`  -> [`5.18`, `5.19`, `5.20`, `5.21`, `5.22`, `5.23`]
1. `org.apache.flink:statefun-ridesharing-example-simulator`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`]
1. `org.apache.hadoop:hadoop-ozone-filesystem-shaded`  -> [`1.0.0`]
1. `org.apache.hbase.operator.tools:hbase-hbck2`  -> [`1.0.0`, `1.1.0`]
1. `org.apache.hbase.operator.tools:hbase-tools`  -> [`1.1.0`]
1. `org.apache.jena:jena-fuseki-fulljar`  -> [`3.15.0`, `3.16.0`, `3.17.0`, `4.0.0`]
1. `org.apache.jena:jena-fuseki-geosparql`  -> [`3.15.0`, `3.16.0`, `3.17.0`, `4.0.0`]
1. `org.apache.jena:jena-fuseki-server`  -> [`3.15.0`, `3.16.0`, `3.17.0`, `4.0.0`]
1. `org.apache.jena:jena-jdbc-driver-bundle`  -> [`4.0.0`]
1. `org.apache.logging.log4j:log4j-api` 🧩 -> [`2.11.1`, `2.11.2`, `2.12.0`, `2.12.1`, `2.13.0`, `2.13.1`, `2.13.2`, `2.13.3`, `2.14.0`, `2.14.1`]
1. `org.apache.pulsar:pulsar-functions-runtime-all`  -> [`2.4.1`, `2.4.2`, `2.5.0`, `2.5.1`, `2.5.2`, `2.6.0`, `2.6.1`, `2.6.2`, `2.7.0`, `2.7.1`, `2.7.2`]
1. `org.apache.storm:blobstore-migrator`  -> [`2.0.0`, `2.1.0`, `2.2.0`]
1. `org.apache.storm:flux-examples`  -> [`2.0.0`, `2.1.0`, `2.2.0`]
1. `org.apache.storm:storm-hbase-examples`  -> [`2.0.0`, `2.1.0`, `2.2.0`]
1. `org.apache.storm:storm-hdfs-examples`  -> [`2.0.0`, `2.1.0`, `2.2.0`]
1. `org.apache.storm:storm-hive-examples`  -> [`2.0.0`, `2.1.0`, `2.2.0`]
1. `org.apache.storm:storm-kafka-migration`  -> [`2.0.0`, `2.1.0`, `2.2.0`]
1. `org.apache.storm:storm-perf`  -> [`2.0.0`, `2.1.0`, `2.2.0`]
1. `org.apache.storm:storm-starter`  -> [`2.0.0`, `2.1.0`, `2.2.0`]
1. `org.bitbucket.bradleysmithllc.etlunit:etlunit-application-assembly`  -> [`4.5.7-eu`, `4.5.8-eu`, `4.5.9-eu`, `4.5.10-eu`, `4.5.11-eu`, `4.5.12-eu`, `4.5.13-eu`, `4.5.14-eu`, `4.5.15-eu`, `4.5.16-eu`, `4.5.17-eu`, `4.5.18-eu`, `4.5.19-eu`, `4.5.20-eu`, `4.5.21-eu`, `4.5.22-eu`]
1. `org.finra.herd:herd-downloader`  -> [`0.77.0`, `0.78.0`, `0.79.0`, `0.80.0`, `0.81.0`, `0.82.0`, `0.85.0`]
1. `org.finra.herd:herd-retention-expiration-destroyer`  -> [`0.77.0`, `0.78.0`, `0.79.0`, `0.80.0`, `0.81.0`, `0.82.0`, `0.85.0`]
1. `org.finra.herd:herd-retention-expiration-exporter`  -> [`0.77.0`, `0.78.0`, `0.79.0`, `0.80.0`, `0.81.0`, `0.82.0`, `0.85.0`]
1. `org.finra.herd:herd-uploader`  -> [`0.77.0`, `0.78.0`, `0.79.0`, `0.80.0`, `0.81.0`, `0.82.0`, `0.85.0`]
1. `org.n52.arctic-sea:iceland-statistics-kibana`  -> [`7.0.0`, `7.1.0`]
1. `org.neo4j:neo4j-logging`  -> [`4.2.0`, `4.2.1`, `4.2.2`, `4.2.3`, `4.2.4`, `4.2.5`, `4.2.6`]
1. `org.odpi.egeria:gaian-ranger-plugin`  -> [`1.0`]
1. `org.powertac:sample-broker`  -> [`1.7.1`]
1. `org.robotframework:remoteswinglibrary`  -> [`2.2.5`]
1. `org.seaborne.rdf-delta:rdf-delta-fuseki-server`  -> [`0.7.0`, `0.8.0`, `0.8.1`, `0.8.2`, `0.9.0`, `0.9.1`, `0.9.2`]
1. `org.seaborne.rdf-delta:rdf-delta-server`  -> [`0.7.0`, `0.8.0`, `0.8.1`, `0.8.2`, `0.9.0`, `0.9.1`, `0.9.2`]
1. `org.tallison.lucene:gramreaper`  -> [`7.6-0.1`, `7.7-0.1`, `8.0-0.1`, `8.0-1.0`]
1. `org.tbee.xml2xxx:xml2yaml-application`  -> [`0.2.0`, `0.3.0`, `0.4.0`]
1. `org.wso2.am.choreo.connect:org.wso2.choreo.connect.enforcer`  -> [`0.9.0-beta`, `0.9.0`]
1. `org.wso2.performance.common:netty-http-echo-service`  -> [`0.2.0`, `0.2.1`, `0.3.0`, `0.4.1`, `0.4.2`, `0.4.3`, `0.4.4`, `0.4.5`]
1. `top.populus:bees`  -> [`1.0`]
1. `uk.gov.nca.graph:mapper`  -> [`1.0`]
1. `za.co.absa.hyperdrive:hyperdrive-release_spark-2_2.11`  -> [`4.2.1`, `4.2.2`, `4.3.0`, `4.4.0`]
1. `za.co.absa.hyperdrive:hyperdrive-release_spark-2_2.12`  -> [`4.2.1`, `4.2.2`, `4.3.0`, `4.4.0`]
1. `za.co.absa.hyperdrive:hyperdrive-release_spark-3_2.12`  -> [`4.2.1`, `4.2.2`, `4.3.0`, `4.4.0`]
1. `za.co.absa.hyperdrive:hyperdrive-release`  -> [`3.2.2`, `3.3.0`, `4.0.0`, `4.1.0`]

## com.fasterxml.jackson.databind

For example, at least 70 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.databind`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.databind;`.

1. `cn.com.analysys:javasdk`  -> [`4.1.0-all`, `4.1.3-all`]
1. `co.navdeep:kafkaer`  -> [`1.4`, `1.4.1`, `1.4.2`]
1. `com.amazon.opendistroforelasticsearch.client:opendistro-sql-jdbc`  -> [`1.13.0.0`]
1. `com.daml:ledger-api-test-tool`  -> [`1.4.0-snapshot.20200729.4851.0.224ab362`, `1.6.0-snapshot.20200915.5208.0.09014dc6`, `1.6.0-snapshot.20200922.5258.0.cd4a06db`, `1.6.0-snapshot.20200930.5312.0.b9a1905d`, `1.7.0-snapshot.20201006.5358.0.0c1cadcf`, `1.7.0-snapshot.20201012.5405.0.af92198d`, `1.7.0-snapshot.20201013.5418.0.bda13392`, `1.7.0-snapshot.20201020.5481.0.03a03957`, `1.7.0-snapshot.20201023.5508.0.9dec6689`, `1.7.0-snapshot.20201027.5530.0.bdbf8977`, `1.7.0-snapshot.20201103.5565.0.e75d42dd`, `1.7.0-snapshot.20201103.5565.1.e75d42dd`, `1.8.0-snapshot.20201110.5615.0.b35c9fcb`, `1.8.0-snapshot.20201117.5661.0.76fae40c`, `1.8.0-snapshot.20201124.5709.0.dabd55d0`, `1.8.0-snapshot.20201201.5776.0.4b91f2a6`, `1.8.0-snapshot.20201208.5840.0.38455e8c`, `1.8.0-snapshot.20201214.5841.0.a8ae8e4a`, `1.8.0`, `1.9.0-snapshot.20201215.5907.0.a6ed34c5`, `1.9.0-snapshot.20210106.5986.0.c6995a9c`, `1.9.0-snapshot.20210111.6034.0.7855b023`, `1.9.0-snapshot.20210112.6040.0.7171cb38`, `1.9.0-snapshot.20210113.6060.0.9ed787cb`, `1.9.0-snapshot.20210119.6062.0.5b3663a5`, `1.9.0`, `1.10.0-snapshot.20210120.6106.0.58ef725a`, `1.10.0-snapshot.20210125.6143.0.550aa48f`, `1.10.0-snapshot.20210201.6207.0.7cf1914d`, `1.10.0-snapshot.20210202.6218.0.c0573678`, `1.10.0-snapshot.20210208.6257.0.61feb5bf`, `1.10.0-snapshot.20210209.6265.0.19bf4031`, `1.11.0-snapshot.20210212.6300.0.ad161d7f`, `1.11.0-snapshot.20210217.6338.0.ba6ba901`, `1.11.0-snapshot.20210224.6385.0.dba114a2`, `1.11.0-snapshot.20210225.6390.0.0617fbde`, `1.11.0-snapshot.20210303.6421.0.145ddaa8`, `1.11.0-snapshot.20210304.6422.0.d3d5042a`, `1.11.0`, `1.12.0-snapshot.20210309.6463.0.f7abca91`, `1.12.0-snapshot.20210311.6483.0.5cb857d9`, `1.12.0-snapshot.20210311.6490.0.8e25227c`, `1.12.0-snapshot.20210312.6493.0.9a7e2465`, `1.12.0-snapshot.20210312.6498.0.707c86aa`, `1.12.0-snapshot.20210316.6523.0.b382fc45`, `1.12.0-snapshot.20210317.6528.0.493e2154`, `1.12.0-snapshot.20210323.6567.0.90c5ce70`, `1.12.0-snapshot.20210330.6619.0.007b8674`, `1.12.0-snapshot.20210330.6622.0.eef158d6`, `1.12.0-snapshot.20210331.6626.0.29a68134`, `1.12.0-snapshot.20210331.6634.0.b98a3881`, `1.12.0-snapshot.20210331.6640.0.4b807899`, `1.12.0-snapshot.20210406.6646.0.631db446`, `1.12.0`, `1.13.0-snapshot.20210413.6706.0.2dc09ba2`, `1.13.0-snapshot.20210419.6730.0.8c3a8c04`, `1.13.0-snapshot.20210426.6770.0.ca66061b`, `1.13.0-snapshot.20210503.6809.0.ca012c3b`, `1.13.0-snapshot.20210504.6833.0.9ae787d0`, `1.13.0`, `1.14.0-snapshot.20210511.6892.0.ca9e89b3`]
1. `com.datastax.oss.simulacron:simulacron-standalone`  -> [`0.11.0`]
1. `com.devonfw.cobigen:cli`  -> [`1.2.0`, `7.0.0`, `7.1.0`]
1. `com.ellucian.ethos.integration.sdk:integration-sdk-java`  -> [`0.1.0`, `0.2.0`, `0.3.0`]
1. `com.expedia.www:haystack-attribution-persistence-email`  -> [`1.0.0`, `1.0.1`, `1.0.2`]
1. `com.expedia.www:haystack-attribution-s3`  -> [`1.0.0`, `1.0.1`, `1.0.2`]
1. `com.expedia.www:haystack-attributor`  -> [`1.0.0`, `1.0.1`, `1.0.2`]
1. `com.fasterxml.jackson.core:jackson-databind` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `com.github.claremontqualitymanagement:taf.core`  -> [`4.0.1`, `4.1.0`, `4.2.1`, `4.2.3`, `4.2.4`, `4.2.5`]
1. `com.github.liuzhenghui:weaver-ecology-common`  -> [`9.00.2003.13.2`, `9.00.2003.13.4`, `9.00.2003.13.5`]
1. `com.github.tomakehurst:wiremock-jre8-standalone`  -> [`2.26.0`, `2.26.1`, `2.26.2`, `2.26.3`, `2.27.0`, `2.27.1`, `2.27.2`]
1. `com.github.tomakehurst:wiremock-standalone`  -> [`2.26.0`, `2.26.1`, `2.26.2`, `2.26.3`, `2.27.0`, `2.27.1`, `2.27.2`]
1. `com.here.account:here-oauth-client-example`  -> [`0.4.22`]
1. `com.heroku.agent:heroku-java-metrics-agent`  -> [`3.13`]
1. `com.joinesty:nullafi-java-sdk`  -> [`1.0.4`]
1. `com.jwebmp.jackson.core:jackson-databind`  -> [`0.63.0.54`, `0.63.0.60`, `0.63.0.61`, `0.65.0.1`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]
1. `com.jwebmp.jpms.jackson.core:jackson-databind`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre11.jackson.core:jackson-databind`  -> [`0.63.0.17`, `0.63.0.19`]
1. `com.launchdarkly:launchdarkly-java-server-sdk`  -> [`5.0.0-rc1`, `5.0.0-rc2`, `5.0.0-rc3`, `5.0.0`, `5.0.1`, `5.0.2`, `5.0.3`, `5.0.4`, `5.0.5`, `5.1.0`]
1. `com.souher:fastapi`  -> [`0.9.9`, `1.0.0`, `1.1.0`]
1. `com.spotify:styx-cli`  -> [`2.1.73`, `2.1.74`, `2.1.75`, `2.1.76`, `2.1.77`, `2.1.78`, `2.1.79`, `2.1.80`, `2.1.83`, `2.1.85`, `2.1.86`, `2.1.87`, `2.1.88`, `2.1.89`, `2.1.90`, `2.1.91`, `2.1.92`, `2.1.93`, `2.1.94`, `2.1.95`, `2.1.96`, `2.1.97`, `2.1.98`, `2.1.102`, `2.1.103`, `2.1.104`, `2.1.106`, `2.1.107`, `2.1.108`, `2.1.109`, `2.1.110`, `2.1.111`, `2.1.112`, `2.1.113`, `2.1.114`, `2.1.115`, `2.1.116`, `2.1.117`, `2.1.118`, `2.1.119`, `2.1.120`, `2.1.121`, `2.1.122`, `2.1.123`, `2.1.124`, `2.1.125`]
1. `de.quantummaid.tutorials.basic-tutorial:step4`  -> [`1.0.18`, `1.0.19`, `1.0.20`, `1.0.21`, `1.0.22`]
1. `io.github.delirius325:jmeter.backendlistener.elasticsearch`  -> [`2.6.8`]
1. `io.github.kingcjy:ezframework-core`  -> [`1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`, `1.1.0`, `1.1.1`]
1. `io.github.odalabasmaz.awsgenie:resource-terminator`  -> [`0.1.0`, `0.1.1`, `0.1.2`]
1. `io.kestra.plugin:plugin-aws`  -> [`0.2.0`]
1. `io.kestra.plugin:plugin-fs`  -> [`0.2.0`, `0.2.1`, `0.2.2`]
1. `io.kestra.storage:storage-minio`  -> [`0.2.0`]
1. `io.microconfig:osdf`  -> [`1.1.2`]
1. `io.sealights.on-premise.agents.android:android-agent-footprints`  -> [`1.0.22`, `1.0.25`, `1.0.26`, `1.0.27`, `1.0.33`, `1.0.34`]
1. `io.sealights.on-premise.agents.plugin:sealights-gradle-plugin`  -> [`2.1.526`, `2.1.531`, `2.1.539`, `3.0.559`, `3.0.564`, `3.0.567`, `3.0.568`, `3.0.570`, `3.0.572`, `3.0.583`, `3.0.603`, `3.0.607`, `3.0.608`, `3.0.610`, `3.0.613`, `3.0.614`, `3.1.627`, `3.1.628`, `3.1.631`, `3.1.633`, `3.1.639`, `3.1.649`, `3.1.653`, `3.1.654`, `3.1.657`]
1. `io.snice.networking:networking-examples`  -> [`0.0.6`, `0.0.7`, `0.0.8`, `0.0.9`]
1. `io.streamnative:pulsar-functions-runtime-all`  -> [`2.8.0-rc-202105092228`, `2.8.0-rc-202105122233`, `2.8.0-rc-202105130146`, `2.8.0-rc-202105130910`, `2.8.0-rc-202105132206`, `2.8.0-rc-202105140121`, `2.8.0-rc-202105170207`, `2.8.0-rc-202105170246`, `2.8.0-rc-202105170423`, `2.8.0-rc-202105170904`, `2.8.0-rc-202105172205`, `2.8.0-rc-202105180723`]
1. `net.tislib.ui-expose:core`  -> [`0.0.1`, `0.1.0`]
1. `org.apache.beam:beam-runners-flink-1.10-job-server`  -> [`2.21.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-runners-flink-1.11-job-server`  -> [`2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-runners-flink-1.12-job-server`  -> [`2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-runners-flink-1.7-job-server`  -> [`2.20.0`]
1. `org.apache.beam:beam-runners-flink-1.8-job-server`  -> [`2.20.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-runners-flink-1.9-job-server`  -> [`2.20.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-runners-samza-job-server`  -> [`2.20.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`]
1. `org.apache.beam:beam-sdks-java-extensions-schemaio-expansion-service`  -> [`2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-sdks-java-extensions-sql-expansion-service`  -> [`2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-sdks-java-extensions-sql-jdbc`  -> [`2.20.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-sdks-java-harness`  -> [`2.20.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-sdks-java-io-expansion-service`  -> [`2.21.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.apache.beam:beam-sdks-java-io-google-cloud-platform-expansion-service`  -> [`2.27.0`, `2.28.0`]
1. `org.apache.calcite.avatica:avatica-standalone-server`  -> [`1.16.0`, `1.17.0`]
1. `org.apache.calcite.avatica:avatica`  -> [`1.16.0`, `1.17.0`]
1. `org.apache.flink:statefun-flink-distribution`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`, `3.0.0`]
1. `org.apache.iceberg:iceberg-flink-runtime`  -> [`0.10.0`, `0.11.0`, `0.11.1`]
1. `org.apache.iceberg:iceberg-hive-runtime`  -> [`0.10.0`, `0.11.0`, `0.11.1`]
1. `org.apache.iceberg:iceberg-spark-runtime`  -> [`0.8.0-incubating`, `0.9.0`, `0.9.1`, `0.10.0`, `0.11.0`, `0.11.1`]
1. `org.apache.iceberg:iceberg-spark3-runtime`  -> [`0.9.0`, `0.9.1`, `0.10.0`, `0.11.0`, `0.11.1`]
1. `org.commonjava.indy.launch:indy-record-extractor`  -> [`1.9.6`, `1.9.7.2`]
1. `org.fcrepo.importexport:fcrepo-import-export`  -> [`1.0.0`, `1.0.1`]
1. `org.icann.czds:czds-client`  -> [`1.0.3`]
1. `org.jboss.gm.analyzer:analyzer`  -> [`1.1`, `1.2`, `1.3`]
1. `org.jboss.gm.manipulation:manipulation`  -> [`1.1`, `1.2`, `1.3`]
1. `org.jboss.gm:analyzer`  -> [`1.5`, `1.6`, `1.6.1`, `1.6.2`, `1.8`, `1.9`, `2.0`, `2.1`, `2.2`, `2.3`, `2.4`, `2.5`, `2.6`, `2.7`]
1. `org.jboss.gm:manipulation`  -> [`1.5`, `1.6`, `1.6.1`, `1.6.2`, `1.8`, `1.9`, `2.0`, `2.1`, `2.2`, `2.3`, `2.4`, `2.5`, `2.6`, `2.7`]
1. `org.neo4j:neo4j-jdbc-driver`  -> [`3.5.1`, `4.0.0`, `4.0.1`]
1. `org.odpi.egeria:subject-area-fvt`  -> [`1.2`, `1.3`, `1.4`, `1.5`, `1.6`, `1.7`, `1.8`, `2.0`]
1. `org.openidentityplatform.commons.json-schema:cli`  -> [`2.0.7`, `2.0.8`, `2.0.9`, `2.0.10`, `2.0.11`]
1. `org.sonatype.nexus:nexus-orient-component-migrator`  -> [`3.26.0-02`, `3.26.0-04`, `3.26.1-02`, `3.27.0-03`, `3.28.0-01`, `3.28.1-01`, `3.29.0-02`, `3.29.1-01`, `3.29.2-02`, `3.30.0-01`, `3.30.1-01`]
1. `tech.b180.cordaptor:cordaptor-bundle-rest-embedded`  -> [`0.1.0`]
1. `za.co.absa.spline:admin`  -> [`0.5.5`, `0.5.6`]

## java.xml.bind

For example, at least 61 artifacts on Maven Central claim to be the module `java.xml.bind`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires java.xml.bind;`.

1. `cloud.testload:jmeter.pack-listener`  -> [`1.6`, `1.7`, `1.8`, `1.9`, `1.9.1`, `1.9.2`, `1.9.3`, `2.0`, `2.01`, `2.03`, `2.06`, `2.07`]
1. `com.airbus-cyber-security.graylog:graylog-plugin-glpi`  -> [`1.4.0`]
1. `com.devonfw.cobigen:cli`  -> [`1.0.0`, `1.0.1`, `1.1.0`]
1. `com.elastisys:autoscaler.simulation`  -> [`5.2.2`]
1. `com.eurodyn.qlack.extras:Qlack-Extras-TranslationsConverter`  -> [`1.7.0`, `1.7.1`, `1.7.2`, `1.7.3`]
1. `com.exasol:exasol-virtual-schema`  -> [`1.0.0`, `2.0.0`, `3.0.0`, `3.0.1`, `3.0.2`, `3.1.0`, `4.0.0`, `5.0.0`, `5.0.1`]
1. `com.expedia.www:haystack-agent`  -> [`0.1.3`, `0.1.4`, `0.1.5`, `0.1.6`]
1. `com.github.agliznetsov.swagger-tools:swagger-tools-cli`  -> [`0.2.0`, `0.2.1`, `0.2.2`, `0.3.0`, `0.3.1`, `0.3.2`, `0.3.3`, `0.3.4`, `0.4.0`, `0.4.1`, `0.5.0`, `0.5.1`, `0.5.2`, `0.5.3`, `0.5.4`, `0.5.5`, `0.5.6`, `0.6.0`]
1. `com.github.albfernandez.richfaces.cdk:cmdln-generator`  -> [`4.6.0.ayg`, `4.6.1.ayg`]
1. `com.github.containersolutions:webserver-sample`  -> [`0.3.6`, `0.3.8`, `0.3.9`]
1. `com.github.elibracha:openapi-diff-commons`  -> [`1.0.2`, `1.0.42`]
1. `com.github.elibracha:openapi-diff-models`  -> [`1.0.1`]
1. `com.github.elibracha:openapi-diff`  -> [`2.2.5`, `2.2.8`, `2.2.10`, `2.2.11`, `2.3.0`, `2.3.1`, `2.3.2`, `2.3.5`, `2.3.6`]
1. `com.github.robozonky.distribution:robozonky-distribution-installer-4.6.0-cr-1`  -> [`4.6.0-cr-1`]
1. `com.growin:flipper_2.12`  -> [`0.3`]
1. `com.guicedee.services:jakarta.xml.bind-api`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
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
1. `es.us.isa:restest`  -> [`0.1.0`, `1.0.0`]
1. `eu.rssw.pct:pct`  -> [`216`, `217`, `218`]
1. `eu.smesec.library:lib_coach_standard_language`  -> [`0.9.0`]
1. `eu.smesec.platform:cysec_bridge`  -> [`0.2.0`]
1. `io.kestra.plugin:plugin-jdbc-clickhouse`  -> [`0.2.0`, `0.2.1`]
1. `io.kestra.plugin:plugin-notifications`  -> [`0.2.0`, `0.2.1`]
1. `io.mosip.registrationprocessor:registration-processor-common-camel-bridge`  -> [`1.0.6`, `1.0.9`, `1.0.10-rc2`, `1.0.10`, `1.1.1-rc1`]
1. `io.pravega:pravega-test-system`  -> [`0.5.0`, `0.5.1`, `0.6.0`, `0.6.1`, `0.6.2`, `0.7.0`, `0.7.1`, `0.7.2`]
1. `io.swagger.codegen.v3:swagger-codegen-cli`  -> [`3.0.0`, `3.0.1`, `3.0.2`, `3.0.3`, `3.0.4`, `3.0.5`, `3.0.6`, `3.0.7`, `3.0.8`, `3.0.9`, `3.0.10`, `3.0.11`, `3.0.12`, `3.0.13`, `3.0.14`, `3.0.15`, `3.0.16`, `3.0.17`, `3.0.18`, `3.0.19`, `3.0.20`, `3.0.21`, `3.0.22`, `3.0.23`, `3.0.24`, `3.0.25`]
1. `jakarta.xml.bind:jakarta.xml.bind-api`  -> [`2.3.2`]
1. `javax.xml.bind:jaxb-api`  -> [`2.4.0-b180830.0359`]
1. `net.sf.ehcache.internal:ehcache-rest-agent`  -> [`2.10.5`, `2.10.6`]
1. `net.sf.ehcache:ehcache`  -> [`2.10.5`, `2.10.6`, `2.10.7`]
1. `org.apache.druid.extensions.contrib:aliyun-oss-extensions`  -> [`0.19.0`, `0.20.0`, `0.20.1`, `0.20.2`, `0.21.0`]
1. `org.apache.druid:druid-benchmarks`  -> [`0.18.0`, `0.18.1`, `0.19.0`, `0.20.0`, `0.20.1`, `0.20.2`, `0.21.0`]
1. `org.apache.flink:flink-s3-fs-hadoop`  -> [`1.10.0`, `1.10.1`, `1.11.0`, `1.11.1`, `1.11.2`, `1.12.0`, `1.12.1`, `1.12.2`, `1.12.3`, `1.13.0`]
1. `org.apache.flink:flink-s3-fs-presto`  -> [`1.10.0`, `1.10.1`, `1.11.0`, `1.11.1`, `1.11.2`, `1.12.0`, `1.12.1`, `1.12.2`, `1.12.3`, `1.13.0`]
1. `org.apache.heron:heron-api`  -> [`0.20.3-incubating`]
1. `org.apache.heron:heron-simulator`  -> [`0.20.3-incubating`]
1. `org.apache.heron:heron-spi`  -> [`0.20.3-incubating`]
1. `org.apache.heron:heron-storm`  -> [`0.20.3-incubating`]
1. `org.apache.servicemix.specs:org.apache.servicemix.specs.jaxb-api-2.3`  -> [`2.3_1`, `2.3_2`, `2.3_3`]
1. `org.apache.tika:tika-app`  -> [`1.19`, `1.19.1`]
1. `org.apache.tika:tika-server`  -> [`1.19`, `1.19.1`]
1. `org.apache.tomee:openejb-lite`  -> [`8.0.0`, `8.0.1`, `8.0.2`, `8.0.3`, `8.0.4`, `8.0.5`, `8.0.6`, `8.0.7`]
1. `org.duracloud.snapshot:snapshot-service-impl`  -> [`3.0.0`]
1. `org.duracloud:account-management-db-util`  -> [`7.0.0`]
1. `org.duracloud:account-management-monitor`  -> [`7.0.0`]
1. `org.neo4j:neosemantics`  -> [`4.0.0.0`, `4.0.0.1`, `4.1.0.0`, `4.1.0.1`, `4.2.0.0`, `4.2.0.1`]
1. `org.openapitools:openapi-generator-cli`  -> [`3.2.2`, `3.2.3`, `3.3.0`]
1. `org.verapdf.apps:greenfield-apps`  -> [`1.14.6-RC`, `1.14.7-RC`, `1.14.8`, `1.16.1`, `1.18.1`, `1.18.5`]
1. `org.verapdf.plugins:metsMetadata-plugin`  -> [`1.14.2-RC`, `1.14.9-RC`, `1.14.10-RC`]
1. `org.wso2.ei:encryption-client`  -> [`1.2.0-beta`]
1. `pl.allegro.tech.graphql:extended-audit-instrumentation`  -> [`1.0.0`]
1. `pl.decerto.hyperon.persistence:codegen-gradle-plugin`  -> [`0.1.45`, `0.1.51`, `6.0.0`]

## net.bytebuddy

For example, at least 58 artifacts on Maven Central claim to be the module `net.bytebuddy`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires net.bytebuddy;`.

1. `cloud.orbit:orbit-redis-cluster`  -> [`1.5.0`, `1.5.1`]
1. `co.elastic.apm:elastic-apm-agent`  -> [`1.0.0.RC1`, `1.0.0`, `1.1.0`]
1. `com.alipay.sdk:alipay-easysdk`  -> [`1.0.0`, `1.0.1`]
1. `com.criteo.java:garmadon-agent`  -> [`1.0.0`, `1.2.0`, `1.3.0`, `1.3.1`, `1.4.0`]
1. `com.exasol:virtual-schema-common-document-files`  -> [`0.2.0`, `1.0.0`]
1. `com.github.jsimone:webapp-runner`  -> [`9.0.27.1`]
1. `com.github.roskart.dropwizard-jaxws:dropwizard-jaxws-example`  -> [`1.2.0`, `1.2.1`]
1. `com.heroku:webapp-runner`  -> [`9.0.30.0`, `9.0.31.0`, `9.0.36.1`, `9.0.38.0`, `9.0.41.0`]
1. `com.instaclustr:ttl-remover-byte-buddy`  -> [`1.0.0`, `1.0.1`]
1. `com.nordstrom.ui-tools:local-grid-utility`  -> [`1.3.3`]
1. `com.proofpoint.platform:jaxrs`  -> [`1.95`, `1.96`, `1.97`, `1.98`, `1.99`, `2.00`, `2.01`, `2.02`, `2.03`, `2.04`, `2.05`, `2.06`, `2.07`, `2.08`, `2.09`, `2.10`, `2.11`, `2.12`, `2.13`, `2.14`, `2.15`, `2.16`, `2.17`, `2.18`, `2.19`, `2.20`, `2.22`, `2.23`, `2.24`, `2.25`, `2.26`, `2.27`, `2.28`, `2.29`, `2.30`, `2.32`, `2.33`, `2.34`, `2.35`, `2.36`, `2.37`, `2.38`, `2.39`, `2.40`, `2.41`, `2.42`, `2.43`, `2.44`, `2.46`, `2.47`, `2.48`, `2.49`, `2.51`]
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
1. `io.aeron:aeron-agent`  -> [`1.26.0`, `1.27.0`, `1.28.0`, `1.28.1`, `1.28.2`, `1.29.0`, `1.30.0`, `1.31.0`, `1.31.1`, `1.32.0`, `1.33.0`, `1.33.1`]
1. `io.aeron:aeron-all`  -> [`1.13.0`, `1.14.0`, `1.15.0`, `1.15.1`, `1.15.2`, `1.15.3`, `1.16.0`, `1.17.0`, `1.18.0`, `1.19.0`, `1.19.1`, `1.20.0`, `1.21.0`, `1.21.1`, `1.21.2`, `1.22.0`, `1.22.1`, `1.23.0`, `1.23.1`]
1. `io.github.harvies.charon:charon-agent`  -> [`0.0.6`, `0.0.7`]
1. `io.github.lomom:agent-logger`  -> [`1.0.1-Release`]
1. `io.kamon:kanela-agent`  -> [`1.0.0-M1`, `1.0.0-M2`, `1.0.0-M3`, `1.0.0-RC1`, `1.0.0-RC2`, `1.0.0-RC3`, `1.0.0-RC4`, `1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`]
1. `io.openk9:io.openk9.reactor.agent`  -> [`0.0.1-SNAPSHOTS`]
1. `io.opentracing.contrib.specialagent:opentracing-specialagent`  -> [`0.9.0`, `1.0.1`, `1.0.2`]
1. `io.projectreactor.tools:blockhound`  -> [`1.0.0.RELEASE`]
1. `net.bytebuddy:byte-buddy` 🧩 -> [`1.9.0`, `1.9.1`, `1.9.2`, `1.9.3`, `1.9.4`, `1.9.6`, `1.9.7`, `1.9.8`, `1.9.9`, `1.9.10`, `1.9.11`, `1.9.12`, `1.9.13`, `1.9.14`, `1.9.15`, `1.9.16`, `1.10.0`, `1.10.1`, `1.10.2`, `1.10.3`, `1.10.4`, `1.10.5`, `1.10.6`, `1.10.7`, `1.10.8`, `1.10.9`, `1.10.10`, `1.10.11`, `1.10.12`, `1.10.13`, `1.10.14`, `1.10.15`, `1.10.16`, `1.10.17`, `1.10.18`, `1.10.19`, `1.10.20`, `1.10.21`, `1.10.22`, `1.11.0`]
1. `net.serenity-bdd:serenity-cli`  -> [`2.3.26`, `2.3.30`, `2.3.31`, `2.3.32`, `2.3.33`, `2.4.0`, `2.4.1`, `2.4.2`, `2.4.3`, `2.4.4`, `2.4.5`, `2.4.15`, `2.4.20`, `2.4.21`, `2.4.24`]
1. `nl.jqno.equalsverifier:equalsverifier`  -> [`3.0.1`, `3.0.2`]
1. `org.agrona:agrona-agent`  -> [`1.4.0`, `1.4.1`, `1.5.0`, `1.5.1`, `1.6.0`, `1.7.0`, `1.7.1`, `1.7.2`, `1.8.0`, `1.9.0`, `1.10.0`]
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
1. `org.apache.hadoop:hadoop-client-minicluster`  -> [`3.3.0`]
1. `org.apache.skywalking:apm-agent`  -> [`6.0.0-alpha`, `6.0.0-beta`, `6.0.0-GA`]
1. `org.assertj:assertj-core`  -> [`3.12.0`]
1. `org.choco-solver:choco-solver`  -> [`4.10.0`, `4.10.1`, `4.10.2`]
1. `org.infinispan.doclets:infinispan-doclets-java11`  -> [`1.2.1.Final`, `1.3.0`]
1. `org.jetbrains.kotlinx:kotlinx-coroutines-debug`  -> [`1.1.0-alpha`, `1.1.0`, `1.1.1`, `1.1.1-eap13`, `1.2.0-alpha`, `1.2.0-alpha-2`, `1.2.0`, `1.2.1`, `1.3.0-M1`, `1.3.0-M2`, `1.3.0-RC`, `1.3.0-RC2`, `1.3.0`, `1.3.1`, `1.3.2`, `1.3.2-1.3.60`, `1.3.3`, `1.3.4`, `1.3.5`, `1.3.5-native-mt`, `1.3.5-native-mt-1.4-M1`, `1.3.5-2-native-mt-1.4-M1`, `1.3.6`, `1.3.7`, `1.3.7-native-mt-1.4-M2`, `1.3.8`, `1.3.8-1.4.0-rc`, `1.3.9`, `1.3.9-native-mt`, `1.3.9-native-mt-2`, `1.4.0-M1`, `1.4.0`, `1.4.1`, `1.4.1-native-mt`, `1.4.2`, `1.4.2-native-mt`, `1.4.3`, `1.4.3-native-mt`, `1.5.0-RC`, `1.5.0-RC-native-mt`, `1.5.0`, `1.5.0-native-mt`]
1. `org.opendaylight.mdsal:mdsal-binding-dom-codec`  -> [`4.0.1`, `4.0.2`, `4.0.3`, `4.0.4`]
1. `org.rapidpm.vaadin:nano-vaadin-undertow`  -> [`01.00.01-RPM`, `01.00.02-RPM`, `01.00.03-RPM`]
1. `org.redisson:redisson-all`  -> [`3.10.1`]
1. `org.sheinbergon:needle-agent`  -> [`0.2.0-RELEASE`, `0.2.1-RELEASE`, `0.3.0-RELEASE`]

## org.bouncycastle.provider

For example, at least 55 artifacts on Maven Central claim to be the module `org.bouncycastle.provider`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.bouncycastle.provider;`.

1. `cn.leancloud:filter-service-core`  -> [`1.9`, `1.10`, `1.12`, `1.13`]
1. `com.alipay.sdk:alipay-easysdk`  -> [`1.0.2`, `1.1.0`, `1.1.1`, `1.1.2`, `1.1.3`, `1.2.0`, `1.2.1`, `2.0.0`, `2.0.1`]
1. `com.alipay.sdk:easysdk-kernel`  -> [`1.0.0`, `1.0.2`]
1. `com.github.chrislusf:seaweedfs-hadoop2-client`  -> [`1.2.5`]
1. `com.github.chrislusf:seaweedfs-hadoop3-client`  -> [`1.2.5`]
1. `com.joinesty:nullafi-java-sdk`  -> [`1.0.1`, `1.0.3`]
1. `com.juliozynger.floorplan:floorplan-gradle-plugin`  -> [`0.1`, `0.2`]
1. `com.liferay.portal:release.dxp.api`  -> [`7.3.10-ep5`, `7.3.10-ep6`]
1. `com.liferay:com.liferay.saml.opensaml.integration`  -> [`4.0.25`]
1. `com.liferay:com.liferay.sync.engine`  -> [`3.4.9`]
1. `com.linecorp.armeria:armeria`  -> [`0.92.0`, `0.93.0`, `0.94.0`, `0.95.0`, `0.96.0`, `0.97.0`, `0.98.0`, `0.98.1`, `0.98.2`, `0.98.3`, `0.98.4`, `0.98.5`, `0.98.6`, `0.98.7`, `0.99.0`, `0.99.1`, `0.99.2`, `0.99.3`, `0.99.4`, `0.99.5`, `0.99.6`, `0.99.7`, `0.99.8`]
1. `com.qcloud:cos_api-bundle`  -> [`5.6.29`, `5.6.31`, `5.6.32`, `5.6.33`, `5.6.35`, `5.6.37`]
1. `com.shopify.syrup:syrup-gradle`  -> [`0.2.1`]
1. `io.mosip.registration:registration-libs`  -> [`1.1.2-rc2`, `1.1.2-rc3`, `1.1.2`, `1.1.3-rc1`, `1.1.3-rc2`, `1.1.3`, `1.1.4-rc1`, `1.1.4`, `1.1.5-rc1`, `1.1.5-rc2`, `1.1.5`, `1.1.5.1`]
1. `net.snowflake:snowflake-hive-metastore-connector`  -> [`0.5.0`, `0.5.1`]
1. `net.snowflake:snowflake-jdbc`  -> [`3.12.1`, `3.12.2`, `3.12.3`, `3.12.4`, `3.12.5`, `3.12.6`, `3.12.7`, `3.12.8`, `3.12.9`, `3.12.10`, `3.12.11`, `3.12.12`, `3.12.13`, `3.12.14`, `3.12.15`, `3.12.16`, `3.12.17`, `3.13.0`, `3.13.1`, `3.13.2`, `3.13.3`]
1. `org.apache.beam:beam-sdks-java-io-snowflake-expansion-service`  -> [`2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`, `2.29.0`]
1. `org.apache.directory.server:apacheds-service`  -> [`2.0.0.AM26`]
1. `org.apache.pulsar:pulsar-client-2x-shaded`  -> [`2.6.2`]
1. `org.apache.pulsar:pulsar-client`  -> [`2.6.2`]
1. `org.bouncycastle:bcprov-debug-jdk15on`  -> [`1.61`, `1.62`, `1.63`, `1.64`, `1.65`, `1.66`, `1.67`, `1.68`]
1. `org.bouncycastle:bcprov-ext-debug-jdk15on`  -> [`1.61`, `1.62`, `1.68`]
1. `org.bouncycastle:bcprov-ext-jdk15on`  -> [`1.61`, `1.62`, `1.63`, `1.64`, `1.65`, `1.66`, `1.67`, `1.68`]
1. `org.bouncycastle:bcprov-jdk15on` 🧩 -> [`1.61`, `1.62`, `1.63`, `1.64`, `1.65`, `1.65.01`, `1.66`, `1.67`, `1.68`]
1. `org.eclipse.milo:server-examples`  -> [`0.3.0-M1`, `0.3.0`, `0.3.1-M1`, `0.3.1`, `0.3.2-M1`, `0.3.2`, `0.3.3-RC1`, `0.3.3-RC2`, `0.3.3-RC3`, `0.3.3`, `0.3.4`, `0.3.5`, `0.3.6`, `0.3.7`, `0.3.8`, `0.4.0`, `0.4.1`, `0.4.2-M1`, `0.4.2`, `0.4.3`]
1. `org.keycloak:keycloak-admin-cli`  -> [`10.0.0`, `10.0.1`, `10.0.2`, `11.0.0`, `11.0.1`, `11.0.2`, `11.0.3`, `12.0.0`, `12.0.1`, `12.0.2`, `12.0.3`, `12.0.4`, `13.0.0`]
1. `org.keycloak:keycloak-client-registration-cli`  -> [`10.0.0`, `10.0.1`, `10.0.2`, `11.0.0`, `11.0.1`, `11.0.2`, `11.0.3`, `12.0.0`, `12.0.1`, `12.0.2`, `12.0.3`, `12.0.4`, `13.0.0`]
1. `org.netbeans.external:bcprov`  -> [`RELEASE113`]
1. `org.radarbase:radar-auth`  -> [`0.7.0`, `0.7.1`]
1. `org.spxp:spxp-crypto-tools`  -> [`0.3`]
1. `org.verapdf.apps:pdfbox-apps`  -> [`1.14.6-RC`, `1.14.7-RC`, `1.14.8`, `1.16.1`, `1.18.1`, `1.18.5`]
1. `org.wso2.msf4j.example:stockquote-fatjar`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.perftest.echo:wso2msf4j-echo-message`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:circuitbreaker`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:das-tracing-feign-client`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:fileserver`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:formparam`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:helloworld`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:http-monitoring`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:jpa`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:lifecycle`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:metrics`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:regex-pathparam`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:session`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:subresource-sample`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:template`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.sample:zipkin-tracing-feign-client`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.samples:fatjar-interceptor-service`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j.samples:interceptor-common`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j:basicauth-security`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j:msf4j-all`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j:oauth2-security`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j:spring-helloworld`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j:spring-profile`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j:websocket-chatApp-sample`  -> [`2.7.0`, `2.8.2`, `2.8.3`]

## org.objectweb.asm

For example, at least 50 artifacts on Maven Central claim to be the module `org.objectweb.asm`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.objectweb.asm;`.

1. `cn.cyejing:dsync-dominate`  -> [`0.1.2`, `0.1.3`]
1. `cn.cyejing:dsync-example`  -> [`0.1.2`, `0.1.3`]
1. `com.att.ajsc:ajsc-runner`  -> [`3.0.8-oss`, `3.0.9-oss`, `3.0.10-oss`, `3.0.11-oss`]
1. `com.bmuschko:gradle-docker-plugin`  -> [`4.6.0`, `4.6.1`, `4.6.2`, `4.7.0`, `4.7.1`, `4.8.0`, `4.8.1`, `4.9.0`, `4.10.0`, `5.1.0`, `5.2.0`, `5.3.0`, `6.0.0`, `6.1.0`, `6.1.1`, `6.1.2`, `6.1.3`, `6.1.4`, `6.2.0`, `6.3.0`, `6.4.0`, `6.5.0`, `6.6.0`, `6.6.1`, `6.7.0`]
1. `com.codeborne:jvm2dts`  -> [`1.1.1`, `1.1.2`, `1.1.3`, `1.1.4`, `1.1.5`, `1.1.6`, `1.2.0`, `1.2.1`, `1.2.2`]
1. `com.datastax.junitpytest:pytest-gradle-plugin`  -> [`0.1`]
1. `com.diffplug.spotless:spotless-eclipse-groovy`  -> [`2.9.2`]
1. `com.github.collinalpert:expressions`  -> [`2.5`, `2.6.0`, `2.6.1`]
1. `com.github.collinalpert:jaque`  -> [`2.4.1`, `2.4.2`]
1. `com.github.collinalpert:java2db`  -> [`1.5.1`, `1.5.2`, `1.5.3`, `1.5.4`, `2.0`, `2.1`, `2.2`, `2.2.1`, `2.2.2`, `2.2.3`, `2.2.4`, `2.2.5`, `2.2.6`, `2.4`, `2.4.2`, `2.4.3`, `2.5`, `3.0`, `3.1`, `4.0.1`, `4.1`, `4.1.1`, `4.2`, `5.0`, `5.0.1`, `5.1.0`, `5.1.1`, `5.1.2`, `5.2`, `5.2.1`, `5.3.0`, `5.4.0`, `5.5.0`, `5.5.1`, `5.6.0`, `6.0.0`, `6.0.1`]
1. `com.github.collinalpert:lambda2sql`  -> [`1.5`, `1.6`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.5`, `1.8.1`, `1.8.2`, `1.8.3`, `1.8.4`, `1.8.5`, `2.0`, `2.1`, `2.1.1`, `2.1.2`, `2.1.3`, `2.1.4`, `2.2`, `2.2.1`, `2.2.2`, `2.3.0`, `2.4.0`]
1. `com.github.roskart.dropwizard-jaxws:dropwizard-jaxws-example`  -> [`1.1.0`]
1. `com.github.tomakehurst:wiremock-jre8-standalone`  -> [`2.21.0`, `2.22.0`, `2.23.0`, `2.23.1`, `2.23.2`, `2.24.0`, `2.24.1`, `2.25.0`, `2.25.1`]
1. `com.github.tomakehurst:wiremock-standalone`  -> [`2.21.0`, `2.22.0`, `2.23.0`, `2.23.1`, `2.23.2`, `2.24.0`, `2.24.1`, `2.25.0`, `2.25.1`]
1. `com.google.gerrit:gerrit-acceptance-framework`  -> [`2.16-rc0`, `2.16-rc1`, `2.16-rc2`, `2.16-rc3`, `2.16`, `2.16.1`, `2.16.2`, `2.16.3`, `2.16.4`, `2.16.5`, `2.16.6`, `2.16.7`, `3.0.0-rc0`, `3.0.0-rc1`, `3.0.0-rc2`, `3.0.0-rc3`, `3.0.0`, `3.0.1`, `3.0.2`, `3.0.3`]
1. `com.google.gerrit:gerrit-plugin-api`  -> [`2.16-rc0`, `2.16-rc1`, `2.16-rc2`, `2.16-rc3`, `2.16`, `2.16.1`, `2.16.2`, `2.16.3`, `2.16.4`, `2.16.5`, `2.16.6`, `2.16.7`, `3.0.0-rc0`, `3.0.0-rc1`, `3.0.0-rc2`, `3.0.0-rc3`, `3.0.0`, `3.0.1`, `3.0.2`, `3.0.3`, `3.1.3`, `3.1.4`, `3.2.0-rc0`, `3.2.0-rc1`, `3.2.0-rc2`, `3.2.0-rc3`, `3.2.0-rc4`, `3.2.0`, `3.2.1`, `3.2.2`, `3.2.3`, `3.3.0-rc0`, `3.3.0-rc1`, `3.3.0-rc2`, `3.3.0-rc3`, `3.3.0-rc4`, `3.3.0-rc5`, `3.3.0-rc6`, `3.3.0-rc7`, `3.3.0`, `3.3.1`, `3.3.2`, `3.3.3`, `3.4.0-rc0`, `3.4.0-rc1`, `3.4.0-rc2`, `3.4.0-rc3`, `3.4.0-rc4`, `3.4.0-rc5`]
1. `com.graphaware.neo4j:graphaware-framework-embedded`  -> [`3.4.6.52`, `3.4.7.52`, `3.4.8.52`, `3.4.9.52`, `3.5.0.53-beta02`, `3.5.0.53-beta03`, `3.5.1.53`, `3.5.2.53`, `3.5.3.53`, `3.5.4.53`, `3.5.5.53`, `3.5.6.54`, `3.5.7.54`, `3.5.8.54`, `3.5.9.54`, `3.5.10.54`, `3.5.11.54`, `3.5.11.55`, `3.5.12.55`, `3.5.13.55`, `3.5.14.55`, `3.5.14.56`, `3.5.14.58`]
1. `com.heapanalytics.android:heap-android-gradle`  -> [`1.9.0`, `1.9.1`, `1.9.2-rc.1`]
1. `com.netflix.nebula:gradle-lint-plugin`  -> [`10.5.2`, `10.5.3`, `11.0.0`, `11.1.0`]
1. `com.oracle.substratevm:svm`  -> [`19.2.0`, `19.2.0.1`, `19.2.1`]
1. `com.oradian.util:exit-denied`  -> [`0.1.0`]
1. `com.salesforceiq.augmenteddriver:AugmentedDriver`  -> [`1.10.1`]
1. `com.sap.cloud.s4hana.datamodel:odata-generator-cli`  -> [`2.3.1`, `2.4.1`, `2.4.2`, `2.5.0`]
1. `com.uber.nullaway:jar-infer-cli`  -> [`0.7.4`, `0.7.5`]
1. `com.vmlens:agent-runtime`  -> [`1.0.14`, `1.0.15`, `1.1.0`, `1.1.1`, `1.1.2`, `1.1.4`, `1.1.5`]
1. `com.vmlens:plugin.sync.bug`  -> [`1.1.1`, `1.1.2`, `1.1.4`, `1.1.5`]
1. `de.adorsys.keycloak:keycloak-clientregistration-provider`  -> [`1.5`, `1.6`, `1.7`, `1.7.1`, `1.8`, `1.9`, `1.10-RC1`, `1.10`, `1.11-RC1`, `1.11`]
1. `de.adorsys.multibanking:keycloak-custom-secret-provider`  -> [`2.2.3`]
1. `de.tud.sse:soot-infoflow`  -> [`2.8`]
1. `de.uni-hildesheim.sse.spassMeter:spass-meter-ant`  -> [`1.30`]
1. `de.uni-hildesheim.sse.spassMeter:spass-meter-ia`  -> [`1.30`]
1. `de.uni-hildesheim.sse.spassMeter:spass-meter`  -> [`1.30`]
1. `fi.evident.apina:apina-cli`  -> [`0.16.0`]
1. `fi.evident.apina:apina-core`  -> [`0.16.0`]
1. `io.ebean.tools:ebean-init`  -> [`1.6`, `1.7`, `1.8`, `1.9`, `1.10`, `1.11`, `1.12`]
1. `io.kestra.plugin:plugin-script-jython`  -> [`0.2.0`]
1. `io.quarkus:quarkus-cli`  -> [`1.6.0.Final`, `1.6.1.Final`, `1.7.0.CR1`, `1.7.0.CR2`, `1.7.0.Final`, `1.7.1.Final`]
1. `io.quarkus:quarkus-ide-launcher`  -> [`1.5.2.Final`, `1.6.0.Final`, `1.6.1.Final`, `1.7.0.CR1`, `1.7.0.CR2`, `1.7.0.Final`, `1.7.1.Final`]
1. `net.onedaybeard.artemis:artemis-odb-cli`  -> [`2.3.0`]
1. `net.onedaybeard.graftt:agent`  -> [`0.1.3`, `0.2.0`, `0.2.1`]
1. `org.checkerframework:checker`  -> [`3.10.0`, `3.11.0`]
1. `org.duracloud:synctoolui`  -> [`5.1.0`, `6.0.0`, `6.0.1`, `6.1.0`, `6.1.1`, `6.2.0`, `6.2.1`, `7.0.0`]
1. `org.graalvm.nativeimage:svm`  -> [`19.3.0`, `19.3.0.2`, `19.3.1`, `20.0.0`, `20.1.0`]
1. `org.netbeans.external:asm-7.2`  -> [`RELEASE113`]
1. `org.noear:solon.extend.jetty.jsp`  -> [`1.0.2`, `1.0.2.1`, `1.0.3`]
1. `org.ow2.asm:asm` 🧩 -> [`6.2.1`, `7.0-beta`, `7.0`, `7.1`, `7.2-beta`, `7.2`, `7.3.1`, `8.0`, `8.0.1`, `9.0-beta`, `9.0`, `9.1`]
1. `org.python:jython-standalone`  -> [`2.7.2b2`, `2.7.2b3`, `2.7.2rc1`, `2.7.2`]
1. `org.python:jython`  -> [`2.7.2b2`, `2.7.2b3`, `2.7.2rc1`, `2.7.2`]
1. `org.robotframework:robotframework`  -> [`3.2`, `3.2.1`, `3.2.2`, `4.0`, `4.0.1`]
1. `org.tomitribe.jkta:jkta`  -> [`0.4`, `0.5`, `0.6`, `0.7`]

## com.google.gson

For example, at least 44 artifacts on Maven Central claim to be the module `com.google.gson`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.google.gson;`.

1. `com.capitalone.dashboard:hygieia-query`  -> [`1.0.1`, `1.0.2`]
1. `com.coralogix:coralogix-jdbc`  -> [`0.1`, `0.2`, `0.3`, `0.4`, `0.5`, `0.6`]
1. `com.coralogix:cosmetic_2.13`  -> [`0.1`]
1. `com.free-now.sauron.plugins:kubernetesapi-report`  -> [`0.0.3`, `0.0.4`]
1. `com.fullcontact.client:java11`  -> [`1.0.0`, `2.0.0`, `2.1.0`]
1. `com.fullcontact.client:java8`  -> [`2.0.0`, `2.1.0`]
1. `com.github.flank:flank`  -> [`flank_snapshot`, `20.05.0`, `20.05.1`, `20.05.2`, `20.06.0`, `20.06.2`, `20.07.0`, `20.08.0`, `20.08.3`, `20.08.4`, `20.09.1`, `20.09.2`, `20.09.3`, `20.12.0`, `21.01.0`, `21.01.1`, `21.02.0`, `2131`]
1. `com.github.gtriip.translation.opera:opera-translation`  -> [`1.0.4`, `1.0.5`, `1.0.5-2`, `1.0.5-3`, `1.0.5-4`, `1.0.5-5`, `1.0.5-6`, `1.0.5-7`, `1.0.5-8`, `1.0.5-9`, `1.0.5-10`, `1.0.5-11`, `1.0.5-12`, `1.0.5-13`, `1.0.5-14`, `1.0.5-15`, `1.0.5-16`, `1.0.5-17`, `1.0.5-18`]
1. `com.github.shynixn.blockball:blockball-bukkit-plugin`  -> [`6.15.0`, `6.16.0`, `6.17.0`, `6.18.0`, `6.19.0`, `6.20.0`, `6.20.1`, `6.21.0`, `6.22.0`, `6.22.1`]
1. `com.github.shynixn.petblocks:petblocks-bukkit-plugin`  -> [`8.16.0`, `8.17.0`, `8.17.1`, `8.18.0`, `8.19.0`, `8.20.0`, `8.21.0`, `8.22.1`, `8.23.0`]
1. `com.google.cloud.opentelemetry:exporter-auto`  -> [`0.10.0`, `0.10.1`, `0.11.0`, `0.14.0-RC1`, `0.15.0-alpha`]
1. `com.google.code.gson:gson`  -> [`2.8.6`]
1. `com.jpaulmorrison:javafbp-websockets`  -> [`1.2.4`, `1.2.5`]
1. `com.jpaulmorrison:javafbp`  -> [`4.1.4`, `4.1.5`, `4.1.6`, `4.1.7`, `4.1.8`, `4.1.9`]
1. `com.konduto.sdk:java-sdk`  -> [`2.14.0`]
1. `com.newrelic.agent.extension:jfr-reporter`  -> [`0.2.0`, `0.3.0`]
1. `com.newrelic.telemetry:opentelemetry-exporters-newrelic-auto`  -> [`0.5.0`, `0.5.1`, `0.6.0`, `0.6.1`, `0.6.2`, `0.7.0`, `0.8.0`, `0.8.1`, `0.9.0`, `0.10.0`, `0.11.0`, `0.12.0`, `0.13.0`, `0.13.1`]
1. `com.newrelic.telemetry:telemetry-core`  -> [`0.6.0`, `0.6.1`, `0.7.0`, `0.8.0`, `0.9.0`, `0.10.0`]
1. `com.newrelic:jfr-daemon`  -> [`0.2.0`, `0.3.0`, `0.4.0`, `0.5.0`, `1.0.0`, `1.1.0`, `1.2.0`]
1. `com.oneandone:go-maven-poller`  -> [`1.3.7`]
1. `com.salesforce.cantor:cantor-server`  -> [`0.3.16`, `0.3.17`, `0.4.0`, `0.4.1`, `0.4.2`, `0.4.4`, `0.4.6`, `0.4.7`, `0.4.8`]
1. `com.scalar-labs:scalardl-java-client-sdk`  -> [`2.0.9`, `2.1.0`]
1. `io.github.gajendragusain:EmbeddedHttpServer`  -> [`0.1.2`, `0.1.3`]
1. `io.github.scalapb-json:protoc-lint-shaded_2.12`  -> [`0.3.0`, `0.4.0`, `0.5.0`]
1. `io.kamon:kamon-bundle_2.12`  -> [`2.1.5`]
1. `io.kamon:kamon-bundle_2.13`  -> [`2.1.5`]
1. `io.opentelemetry.javaagent:opentelemetry-javaagent-exporter-jaeger-thrift`  -> [`0.13.0`, `0.13.1`, `0.14.0`]
1. `io.opentelemetry.javaagent:opentelemetry-javaagent-exporter-jaeger`  -> [`0.12.0`, `0.12.1`, `0.13.0`, `0.13.1`, `0.14.0`]
1. `io.opentelemetry.javaagent:opentelemetry-javaagent-exporter-otlp`  -> [`0.12.0`, `0.12.1`, `0.13.0`, `0.13.1`, `0.14.0`]
1. `io.opentracing.contrib:opentelemetry-bridge`  -> [`0.4.0`]
1. `net.cnri.cordra:cordra-embedded-test-server`  -> [`2.3.0`]
1. `org.apache.beam:beam-sdks-java-io-google-cloud-platform-expansion-service`  -> [`2.29.0`]
1. `org.apache.beam:beam-vendor-grpc-1_26_0`  -> [`0.1`]
1. `org.apache.kudu:kudu-backup-tools`  -> [`1.12.0`, `1.13.0`, `1.14.0`]
1. `org.apache.kudu:kudu-backup2_2.11`  -> [`1.12.0`, `1.13.0`]
1. `org.apache.kudu:kudu-backup3_2.12`  -> [`1.14.0`]
1. `org.jetbrains.dokka:kotlin-analysis-intellij`  -> [`1.4.32`]
1. `org.jetbrains.kotlin:kotlin-gradle-plugin`  -> [`1.4.20-M1`, `1.4.20-RC`, `1.4.20`, `1.4.21`, `1.4.30-M1`, `1.4.30-RC`, `1.4.30`, `1.4.31`, `1.5.0-M1`, `1.5.0-M2`, `1.5.0-RC`, `1.5.0`]
1. `org.kill-bill.billing.plugin.java:stripe-plugin`  -> [`7.0.2`, `7.0.3`, `7.0.4`]
1. `org.kin.sdk.android:base-shaded`  -> [`0.4.7`]
1. `org.sonarsource.sonarqube:sonar-plugin-api`  -> [`8.3.0.34182`, `8.3.1.34397`, `8.4.0.35506`, `8.4.1.35646`, `8.4.2.36762`, `8.5.0.37579`, `8.5.1.38104`, `8.6.0.39681`, `8.6.1.40680`, `8.7.0.41497`, `8.7.1.42226`, `8.8.0.42792`, `8.9.0.43852`]
1. `org.wso2.cloud.secrets:cloud-cipher-tool`  -> [`1.0.0`]
1. `xyz.gianlu.librespot:librespot-api`  -> [`1.5.0`, `1.5.1`, `1.5.2`, `1.5.3`, `1.5.4`, `1.5.5`, `1.6.0`]
1. `xyz.gianlu.librespot:librespot-player`  -> [`1.5.0`, `1.5.1`, `1.5.2`, `1.5.3`, `1.5.4`, `1.5.5`, `1.6.0`]

## com.fasterxml.jackson.core

For example, at least 42 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.core`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.core;`.

1. `ch.dsivd.copper:copper`  -> [`1.2.0`]
1. `com.daml:ledger-api-test-tool`  -> [`1.3.0-snapshot.20200701.4616.0.bdbefd11`, `1.3.0-snapshot.20200706.4664.0.5db06051`, `1.3.0-snapshot.20200708.4686.0.95dfa18e`, `1.3.0-snapshot.20200714.4687.0.8e10c7a7`, `1.4.0-snapshot.20200715.4733.0.d6e58626`]
1. `com.fasterxml.jackson.core:jackson-core` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `com.free-now.sauron.plugins:elasticsearch-output`  -> [`0.0.18`, `0.0.19`]
1. `com.free-now.sauron.plugins:protocw-checker`  -> [`0.0.7`]
1. `com.github.cukedoctor:cukedoctor-main`  -> [`3.1`, `3.2`, `3.3`, `3.4`, `3.5`, `3.5.1`, `3.5.2`, `3.6.0`]
1. `com.github.greaterplus:sse-ble-signal`  -> [`1.0`]
1. `com.heroku.sdk:heroku-deploy-complete`  -> [`2.0.14`, `2.0.15`, `2.0.16`]
1. `com.heroku.sdk:heroku-deploy-standalone`  -> [`3.0.1`, `3.0.2`, `3.0.3`, `3.0.4`]
1. `com.hortonworks.registries:schema-registry-core`  -> [`0.9.0`]
1. `com.hortonworks.registries:storage-tool`  -> [`0.9.0`]
1. `com.jwebmp.jackson.core:jackson-core`  -> [`0.63.0.54`, `0.63.0.60`, `0.63.0.61`, `0.65.0.1`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]
1. `com.jwebmp.jpms.jackson.core:jackson-core`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre11.jackson.core:jackson-core`  -> [`0.63.0.14`, `0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.microsoft.azure:spark-cdm-connector`  -> [`0.10`, `0.12`, `0.13`, `0.14`, `0.15`, `0.16`, `0.17`, `0.18.1`, `0.19.0`, `0.19.1`]
1. `com.okta.authn.sdk:okta-authn-sdk-examples-shiro`  -> [`2.0.0`, `2.0.1`, `2.0.2`]
1. `com.quicko:api-client`  -> [`3.0.0-BUILD-RELEASE`, `3.0.1-BUILD-RELEASE`, `3.0.2-BUILD-RELEASE`, `3.0.3-BUILD-RELEASE`, `3.1.0-BUILD-RELEASE`, `3.1.1-BUILD-RELEASE`, `3.1.2-BUILD-RELEASE`, `3.1.3-BUILD-RELEASE`, `3.2.0-BUILD`, `3.2.0-BUILD-RELEASE`]
1. `com.redhat.red.offliner:offliner`  -> [`2.0`]
1. `com.snowflake:snowflake-kafka-connector`  -> [`1.2.4`, `1.3.0`, `1.3.1`, `1.4.0`, `1.4.1`, `1.4.2`, `1.4.3`, `1.4.4`, `1.5.0`, `1.5.1`, `1.5.2`, `1.5.3`]
1. `com.xenoamess.metasploit.java-external-module:core`  -> [`0.1.0`]
1. `com.xenoamess.metasploit.java-external-module:jar_demo`  -> [`0.1.0`]
1. `com.xenoamess.metasploit.java-external-module:loader`  -> [`0.1.0`]
1. `com.xenoamess.metasploit.java-external-module:single_java_file_demo`  -> [`0.1.0`]
1. `de.charite.compbio:jannovar-cli`  -> [`0.33`, `0.34`, `0.35`]
1. `io.github.jaredpetersen:kafka-connect-arangodb`  -> [`1.0.6`, `1.0.7`]
1. `io.github.marquezproject:marquez-spark`  -> [`0.12.0`, `0.12.1`, `0.12.2`, `0.14.0`, `0.14.1`, `0.14.2`]
1. `io.kestra.plugin:plugin-gcp`  -> [`0.2.0`, `0.2.1`, `0.2.2`]
1. `io.kestra.storage:storage-gcs`  -> [`0.2.0`]
1. `io.openk9:io.openk9.third.party`  -> [`0.0.1-SNAPSHOTS`]
1. `no.nav.arbeidsgiver:altinn-rettigheter-proxy-klient`  -> [`0.0.6`, `0.0.7`, `0.1.0`, `0.1.1`, `0.1.3`, `1.0.0`, `1.1.2`, `2.0.0`, `2.0.1`]
1. `org.apache.beam:beam-runners-spark-3-job-server`  -> [`2.29.0`]
1. `org.apache.beam:beam-runners-spark-job-server`  -> [`2.29.0`]
1. `org.apache.beam:beam-sdks-java-extensions-sql-jdbc`  -> [`2.29.0`]
1. `org.apache.beam:beam-sdks-java-io-expansion-service`  -> [`2.29.0`]
1. `org.commonjava.maven.ext:pom-manipulation-cli`  -> [`4.0`, `4.1`, `4.2`, `4.3`]
1. `org.n52.arctic-sea:iceland-statistics-kibana`  -> [`7.2.0`, `7.3.0`, `7.3.1`, `7.4.0`, `7.4.1`, `7.5.0`, `7.5.1`, `7.6.0`, `7.6.1`, `7.6.2`, `8.0.0`, `8.0.1`, `8.0.2`, `8.0.3`, `8.1.0`, `8.2.0`, `8.2.1`]
1. `org.openidentityplatform.commons.json-crypto:cli`  -> [`2.0.7`, `2.0.8`, `2.0.9`, `2.0.10`, `2.0.11`]
1. `run.facet.agent.java:facet-agent`  -> [`0.0.1`, `0.0.2`, `0.0.3`, `0.0.4`, `0.0.5`, `0.0.6`, `0.0.8`, `0.0.9`, `0.0.10`, `0.0.11`, `0.0.12`, `0.0.13`]
1. `uk.co.gdmrdigital.iiif.image:iiif-tiler`  -> [`0.9.3`, `0.9.4`, `0.9.5`, `0.9.6`]
1. `za.co.absa.spline:admin`  -> [`0.5.0`, `0.5.1`, `0.5.2`, `0.5.3`]
1. `za.co.absa.spline:rest-api-doc-generator`  -> [`0.5.0`, `0.5.1`, `0.5.2`, `0.5.3`, `0.5.4`, `0.5.5`]
1. `za.co.absa.utils:rest-api-doc-generator`  -> [`1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`]

## info.picocli

For example, at least 37 artifacts on Maven Central claim to be the module `info.picocli`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires info.picocli;`.

1. `com.aeontronix.enhanced-mule:enhanced-mule-tools-cli`  -> [`1.3.0-alpha1`, `1.3.0-alpha2`, `1.3.0-alpha3`, `1.3.0-alpha4`, `1.3.0-alpha5`, `1.3.0-alpha8`, `1.3.0-alpha9`, `1.3.0-beta1`, `1.3.0-beta2`, `1.3.0-beta3`, `1.3.0-beta4`, `1.3.0-beta5`, `1.3.0-beta6`, `1.3.0-beta7`, `1.3.0-beta8`, `1.3.0-beta9`, `1.3.0-beta10`, `1.3.0-beta11`, `1.3.0-beta12`, `1.3.0-beta13`, `1.3.0-beta14`, `1.3.0-beta15`, `1.3.0-beta16`, `1.3.0-beta17`, `1.3.0-beta18`]
1. `com.aeontronix.enhancedmule:enhanced-mule-installer-cli`  -> [`1.0.0-beta2`]
1. `com.github.crawler-commons:urlfrontier-client`  -> [`0.1`, `0.2`]
1. `com.instaclustr:cassandra-3`  -> [`1.0`]
1. `com.instaclustr:cassandra-4`  -> [`1.0`]
1. `com.instaclustr:cassandra-sidecar`  -> [`1.0.0`, `2.0.0-alpha1`, `2.0.0-alpha2`, `2.0.0-alpha3`, `2.0.0-alpha4`, `2.0.0-alpha5`, `2.0.0-alpha6`, `2.0.0-alpha7`, `2.0.0-alpha8`]
1. `com.instaclustr:esop`  -> [`1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`, `1.1.0`]
1. `com.instaclustr:ic-sstable-tools-4.0-rc1`  -> [`1.0.0`]
1. `com.instaclustr:icarus`  -> [`1.0.0`, `1.0.1`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`]
1. `com.instaclustr:instaclustr-backup-restore`  -> [`1.0.0`, `1.1.0`, `1.1.1`, `1.1.2`, `1.1.3`, `1.1.4`, `1.1.5`, `1.1.6`, `1.1.7`, `1.1.8`, `2.0.0-alpha1`, `2.0.0-alpha2`, `2.0.0-alpha3`, `2.0.0-alpha4`, `2.0.0-alpha5`, `2.0.0-alpha6`, `2.0.0-alpha7`, `2.0.0-alpha8`]
1. `com.instaclustr:minotaur`  -> [`1.0.0`]
1. `com.instaclustr:sstable-generator-cassandra-2`  -> [`1.2`, `1.3`]
1. `com.instaclustr:sstable-generator-cassandra-3`  -> [`1.1`, `1.2`, `1.3`]
1. `com.instaclustr:sstable-generator-cassandra-4`  -> [`1.1`, `1.2`, `1.3`]
1. `com.instaclustr:sstable-generator`  -> [`1.0`, `1.1`, `1.2`, `1.3`]
1. `com.instaclustr:ttl-remover-impl`  -> [`1.0.0`, `1.1.0`, `1.1.1`]
1. `com.mygraphql.graphub:openapi2graphqls-cli`  -> [`0.0.2`]
1. `com.ninja-beans.crawler:cloudflare-iuam-solver-dist`  -> [`0.1.0`]
1. `com.nitorcreations:aws-vault-cli`  -> [`0.16`]
1. `com.pessetto.origamismtp:OrigamiSMTP`  -> [`2.0.0`, `2.0.3`]
1. `com.tngtech.keycloakmock:standalone`  -> [`0.1.0`, `0.2.0`, `0.3.0`, `0.4.0`, `0.5.0`, `0.6.0`, `0.7.0`]
1. `de.jpdigital:owlapi-simplex-cli`  -> [`0.1.0`, `0.1.1`]
1. `eu.toop:toop-demoui-dcstandalone`  -> [`2.0.0-rc1`, `2.0.0-rc2`, `2.0.0-rc3`, `2.0.0`, `2.1.0`, `2.1.0-1`, `2.1.1`]
1. `info.picocli:picocli-jpms-module`  -> [`4.0.0-alpha-2`, `4.0.0-alpha-3`]
1. `info.picocli:picocli` 🧩 -> [`4.0.0-beta-1b`, `4.0.0-beta-2`, `4.0.0`, `4.0.1`, `4.0.2`, `4.0.3`, `4.0.4`, `4.1.0`, `4.1.1`, `4.1.2`, `4.1.3`, `4.1.4`, `4.2.0`, `4.3.0`, `4.3.1`, `4.3.2`, `4.4.0`, `4.5.0`, `4.5.1`, `4.5.2`, `4.6.0`, `4.6.1`]
1. `io.github.asseco-pst:einstein`  -> [`1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`]
1. `io.github.davidwhitlock.cs410J.original:student`  -> [`2021.0.0`, `2021.1.0`, `2021.1.1`]
1. `io.jooby:jooby-cli`  -> [`2.0.6`, `2.1.0`, `2.2.0`, `2.2.1`, `2.3.0`, `2.3.1`, `2.4.0`, `2.5.0`, `2.5.1`, `2.6.0`, `2.6.1`, `2.6.2`, `2.7.0`, `2.7.1`, `2.7.2`, `2.7.3`, `2.8.0`, `2.8.1`, `2.8.2`, `2.8.3`, `2.8.4`, `2.8.5`, `2.8.6`, `2.8.7`, `2.8.8`, `2.8.9`, `2.8.10`, `2.9.0`, `2.9.1`, `2.9.2`, `2.9.3`, `2.9.4`, `2.9.5`, `2.9.6`]
1. `io.kestra:kestra`  -> [`0.2.3`]
1. `io.sealights.on-premise.agents:sl-build-scanner`  -> [`3.0.1796`, `3.0.1812`, `3.1.1830`, `3.1.1863`, `3.1.1870`, `3.1.1892`, `3.1.1902`, `3.1.1910`]
1. `org.apache.hadoop:hadoop-ozone-filesystem-shaded`  -> [`1.1.0`]
1. `org.apache.james:webadmin-cli`  -> [`3.6.0`]
1. `org.caseine:caseine.vpl.tools.CLI`  -> [`0.0.36`, `0.0.37`, `0.0.38`, `0.0.41`, `0.0.44`]
1. `org.jboss.gm:cli`  -> [`1.5`, `1.6`, `1.6.1`, `1.6.2`, `1.8`, `1.9`, `2.0`, `2.1`, `2.2`, `2.3`, `2.4`, `2.5`, `2.6`, `2.7`]
1. `org.pgpainless:pgpainless-sop`  -> [`0.2.0-alpha5`, `0.2.0-alpha6`, `0.2.0-alpha7`, `0.2.0-alpha8`, `0.2.0-alpha9`, `0.2.0-alpha10`, `0.2.0-alpha11`]
1. `technology.dice.open:dice-where-downloader`  -> [`1.2.9`]
1. `xyz.ottr.lutra:lutra-cli`  -> [`0.6.9`, `0.6.10`]

## kotlin.stdlib.jdk8

For example, at least 35 artifacts on Maven Central claim to be the module `kotlin.stdlib.jdk8`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires kotlin.stdlib.jdk8;`.

1. `com.apollographql.apollo3:apollo-gradle-plugin`  -> [`3.0.0-dev6`]
1. `com.github.bun133:flyframe`  -> [`1.0`, `1.0.1`, `1.0.2`]
1. `com.github.bun133:flylib-module`  -> [`1.0.0`]
1. `com.github.flank:flank`  -> [`21.05.0`]
1. `com.github.hopshackle:NTBEA`  -> [`0.1`, `0.2`, `0.2.1`, `0.3.0`]
1. `com.github.patrick-mc:twipe`  -> [`1.0.3`]
1. `com.ibm.cloud:is-examples`  -> [`0.4.3`, `0.5.0`]
1. `com.intuit.hooks:compiler-plugin`  -> [`0.7.0`, `0.8.1`, `0.8.2`, `0.9.0`, `0.9.1`]
1. `com.mparticle:smartype-generator`  -> [`1.2.0`, `1.2.1`, `1.2.2`]
1. `com.notkamui.libs:keval`  -> [`0.7.1`]
1. `com.orange.ccmd:hurl`  -> [`1.0.39`, `1.0.40`, `1.0.41`, `1.0.42`]
1. `com.orange.ccmd:hurlfmt`  -> [`1.0.39`, `1.0.40`, `1.0.41`, `1.0.42`]
1. `com.squareup.sqldelight:gradle-plugin`  -> [`1.5.0`]
1. `de.jensklingenberg.cabret:cabret-compiler-plugin-native`  -> [`1.0.2`]
1. `de.jensklingenberg.cabret:cabret-compiler-plugin`  -> [`1.0.2`]
1. `dev.zacsweers.ticktock:ticktock-compiler`  -> [`0.2.0`, `0.2.1`, `1.0.0-2020d`, `1.1.0-2020f`]
1. `io.github.baharmc:bedrock-edition`  -> [`1.0`, `1.1`, `1.2`]
1. `io.github.baharmc:java-edition`  -> [`1.0`, `1.1`, `1.2`]
1. `io.github.baharmc:network-common`  -> [`1.0`, `1.1`, `1.2`]
1. `io.github.portlek:patty`  -> [`1.1`]
1. `io.github.shiruka:common`  -> [`1.0`, `1.2`, `1.3`]
1. `io.github.shiruka:conf-common`  -> [`1.1`]
1. `io.github.shiruka:conf-json`  -> [`1.1`]
1. `io.github.shiruka:conf-yaml`  -> [`1.1`]
1. `io.github.shiruka:network`  -> [`1.3`]
1. `io.tatum:tatum-java`  -> [`1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`]
1. `io.teamif:comcigan-lib`  -> [`1.0`]
1. `net.lz1998:pbbot-spring-boot-starter`  -> [`0.0.2`, `0.0.3`]
1. `net.mamoe:kotlin-jvm-blocking-bridge-compiler-embeddable`  -> [`1.10.3-dev-2`, `1.10.4`]
1. `org.jetbrains.dokka:dokka-cli`  -> [`1.4.10.2`, `1.4.20-dev-65`, `1.4.30`, `1.4.32`]
1. `org.jetbrains.dokka:kotlin-analysis-compiler`  -> [`1.4.10.2`, `1.4.20-dev-65`, `1.4.30`, `1.4.32`]
1. `org.jetbrains.dokka:kotlin-analysis-intellij`  -> [`1.4.10.2`, `1.4.20-dev-65`, `1.4.30`]
1. `org.jetbrains.kotlin:kotlin-stdlib-jdk8` 🧩 -> [`1.4.0-rc`, `1.4.0`, `1.4.10`, `1.4.20-M1`, `1.4.20-RC`, `1.4.20`, `1.4.21`, `1.4.30-M1`, `1.4.30-RC`, `1.4.30`, `1.4.31`, `1.5.0-M1`, `1.5.0-M2`, `1.5.0-RC`, `1.5.0`]
1. `org.junit.platform:junit-platform-console-standalone`  -> [`1.8.0-M1`]
1. `ru.pocketbyte.locolaser:core`  -> [`2.1.0`]

## com.fasterxml.jackson.annotation

For example, at least 34 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.annotation`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.annotation;`.

1. `com.codeborne:jvm2dts`  -> [`1.2.3`, `1.2.4`]
1. `com.daml:ledger-api-test-tool`  -> [`1.4.0-snapshot.20200722.4796.0.28ab504b`, `1.4.0-snapshot.20200722.4800.0.21a16eef`, `1.4.0-snapshot.20200724.4812.0.818a52b0`]
1. `com.fasterxml.jackson.core:jackson-annotations` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `com.free-now.sauron.plugins:dependency-checker`  -> [`0.0.32`, `0.0.33`, `0.0.34`]
1. `com.github.fpopic:bigquery-schema-select_2.13`  -> [`0.2`]
1. `com.jwebmp.jackson.core:jackson-annotations`  -> [`0.63.0.54`, `0.65.0.1`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]
1. `com.jwebmp.jpms.jackson.core:jackson-annotations`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre11.jackson.core:jackson-annotations`  -> [`0.63.0.17`, `0.63.0.19`]
1. `com.liferay.portal:release.portal.api`  -> [`7.3.4-ga5`, `7.3.5-ga6`]
1. `com.vertica.spark:vertica-spark`  -> [`2.0.0-rc0`]
1. `com.wavefront:wavefront-opentracing-bundle-java`  -> [`1.2.0`]
1. `edu.byu.hbll.maven:executable-parent`  -> [`3.4.1`, `3.5.0`, `3.6.0`, `3.7.0`, `3.7.1`]
1. `io.github.drewlakee:discojx`  -> [`1.0.0`, `1.0.1`]
1. `io.gitlab.arturbosch.detekt:detekt-report-sarif`  -> [`1.15.0-RC1`, `1.15.0-RC2`, `1.15.0`, `1.16.0-RC1`, `1.16.0-RC2`, `1.16.0-RC3`, `1.16.0`]
1. `io.hdocdb:hdocdb`  -> [`1.0.0`, `1.0.1`]
1. `io.inugami.security:inugami_core_security_tools`  -> [`2.0.0`]
1. `io.mantisrx:mantis-connector-iceberg`  -> [`1.2.11`, `1.2.12`, `1.2.13`, `1.2.14`, `1.2.15`, `1.2.16`, `1.3.3`, `1.3.5`, `1.3.6`, `1.3.7`, `1.3.9`, `1.3.13`, `1.3.14`, `1.3.16`, `1.3.17`, `1.3.18`, `1.3.19`, `1.3.20`, `1.3.21`, `1.3.22`, `1.3.23`, `1.3.24`, `1.3.25`, `1.3.26`, `1.3.33`, `1.3.35`]
1. `io.mantisrx:mantis-publish-netty`  -> [`1.3.2`, `1.3.3`, `1.3.5`, `1.3.6`, `1.3.7`, `1.3.9`, `1.3.13`, `1.3.14`, `1.3.16`, `1.3.17`, `1.3.18`, `1.3.19`, `1.3.20`, `1.3.21`, `1.3.22`, `1.3.23`, `1.3.24`, `1.3.25`, `1.3.26`, `1.3.33`, `1.3.35`]
1. `io.mantisrx:mantis-shaded`  -> [`1.2.56`, `1.2.57`, `1.2.58`, `1.2.59`, `1.2.60`, `1.2.62`, `1.2.63`, `1.3.3`, `1.3.5`, `1.3.6`, `1.3.7`, `1.3.9`, `1.3.13`, `1.3.14`, `1.3.16`, `1.3.17`, `1.3.18`, `1.3.19`, `1.3.20`, `1.3.21`, `1.3.22`, `1.3.23`, `1.3.24`, `1.3.25`, `1.3.26`, `1.3.33`, `1.3.35`]
1. `org.apache.beam:beam-runners-flink-1.10-job-server`  -> [`2.29.0`]
1. `org.apache.beam:beam-runners-flink-1.11-job-server`  -> [`2.29.0`]
1. `org.apache.beam:beam-runners-flink-1.12-job-server`  -> [`2.29.0`]
1. `org.apache.beam:beam-runners-flink-1.8-job-server`  -> [`2.29.0`]
1. `org.apache.beam:beam-runners-flink-1.9-job-server`  -> [`2.29.0`]
1. `org.apache.beam:beam-sdks-java-extensions-schemaio-expansion-service`  -> [`2.29.0`]
1. `org.apache.beam:beam-sdks-java-extensions-sql-expansion-service`  -> [`2.29.0`]
1. `org.apache.beam:beam-sdks-java-harness`  -> [`2.29.0`]
1. `org.apache.beam:beam-sdks-java-io-kinesis-expansion-service`  -> [`2.29.0`]
1. `org.apache.hudi:hudi-timeline-server-bundle`  -> [`0.8.0`]
1. `org.apache.jackrabbit:oak-run`  -> [`1.22.0`, `1.24.0`, `1.26.0`, `1.32.0`, `1.34.0`, `1.36`, `1.38.0`]
1. `org.apache.sedona:sedona-python-adapter-2.4_2.11`  -> [`1.0.0-incubating`]
1. `org.apache.sedona:sedona-python-adapter-2.4_2.12`  -> [`1.0.0-incubating`]
1. `org.apache.sedona:sedona-python-adapter-3.0_2.12`  -> [`1.0.0-incubating`]
1. `org.commonjava.maven.ext:pom-manipulation-cli`  -> [`3.8`, `3.8.1`, `3.8.2`, `3.8.3`]

## org.slf4j

For example, at least 33 artifacts on Maven Central claim to be the module `org.slf4j`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.slf4j;`.

1. `ch.hsr.adv:adv-commons`  -> [`1.0`]
1. `com.bytes-pot:daraja-api`  -> [`1.0-b`, `1.1-b`, `1.2-b`, `1.3-b`, `1.4-b`, `1.5-b`, `1.6-b`]
1. `com.credibledoc:log-combiner`  -> [`1.0.20`, `1.0.21`, `1.0.22`, `1.0.23`, `1.0.24`, `1.0.25`, `1.0.26`, `1.0.27`, `1.0.28`, `1.0.29`, `1.0.30`, `1.0.31`, `1.0.32`, `1.0.33`, `1.0.34`, `1.0.35`]
1. `com.credibledoc:substitution-core`  -> [`1.0.20`, `1.0.21`, `1.0.22`, `1.0.23`, `1.0.24`, `1.0.25`, `1.0.26`, `1.0.27`, `1.0.28`, `1.0.29`, `1.0.30`, `1.0.31`, `1.0.32`, `1.0.33`, `1.0.34`, `1.0.35`]
1. `com.github.tomcat-slf4j-logback:tomcat10-slf4j-logback`  -> [`10.0.0-M1`, `10.0.0-M3`, `10.0.0-M4`, `10.0.0-M5`, `10.0.0-M6`, `10.0.0-M7`, `10.0.0-M9`, `10.0.0`]
1. `com.github.tomcat-slf4j-logback:tomcat7-slf4j-logback`  -> [`7.0.93`, `7.0.94`, `7.0.96`, `7.0.100`, `7.0.104`, `7.0.105`, `7.0.106`, `7.0.107`, `7.0.108`]
1. `com.github.tomcat-slf4j-logback:tomcat85-slf4j-logback`  -> [`8.5.38`, `8.5.39`, `8.5.40`, `8.5.41`, `8.5.42`, `8.5.43`, `8.5.45`, `8.5.46`, `8.5.47`, `8.5.49`, `8.5.50`, `8.5.51`, `8.5.53`, `8.5.54`, `8.5.55`, `8.5.56`, `8.5.57`, `8.5.59`, `8.5.61`, `8.5.65`]
1. `com.github.tomcat-slf4j-logback:tomcat9-slf4j-logback`  -> [`9.0.16`, `9.0.17`, `9.0.19`, `9.0.20`, `9.0.21`, `9.0.22`, `9.0.24`, `9.0.26`, `9.0.27`, `9.0.29`, `9.0.30`, `9.0.31`, `9.0.33`, `9.0.34`, `9.0.35`, `9.0.36`, `9.0.37`, `9.0.38`, `9.0.39`, `9.0.40`, `9.0.41`, `9.0.41.SP1`, `9.0.41.SP2`, `9.0.43`, `9.0.44`, `9.0.45`, `9.0.46`]
1. `com.guicedee.services:sl4j`  -> [`1.0.9.5-jre14`, `1.0.9.7-jre14`, `1.0.9.10-jre14`, `1.0.9.11-jre14`, `1.0.9.13-jre14`, `1.0.9.14-jre14`, `1.0.10.0-jre14`, `1.0.10.1-jre14`, `1.0.10.3-jre14`, `1.0.10.4-jre14`, `1.0.11.0-jre14`, `1.0.11.2-jre14`, `1.0.11.5-jre14`, `1.0.11.6-jre14`, `1.0.11.7-jre14`, `1.0.12.0-jre14`, `1.0.12.1-jre14`, `1.0.12.2-jre14`, `1.0.12.3-jre14`, `1.0.12.4-jre14`, `1.0.12.5-jre14`, `1.0.13.0-jre14`, `1.0.13.1-jre14`, `1.0.13.2-jre14`, `1.0.13.3-jre14`, `1.0.13.4-jre14`, `1.0.13.5-jre14`]
1. `com.guicedee.services:slf4j`  -> [`1.0.14.0-RC1-jre14`, `1.0.14.1-jre14`, `1.0.14.3-jre8`, `1.0.14.4-jre8`, `1.0.14.4-jre14`, `1.0.15.1-jre14`, `1.0.15.2-jre14`, `1.0.15.3-jre8`, `1.0.15.3-jre14`, `1.0.15.4-jre8`, `1.0.15.4-jre14`, `1.0.15.5-jre8`, `1.0.15.5-jre14`, `1.0.16.0-jre14`, `1.0.17.0-jre14`, `1.0.17.1-jre14`, `1.0.18.0-jre14`, `1.0.18.0-jre15`, `1.0.18.1-jre14`, `1.0.18.1-jre15`, `1.0.19.0-jre14`, `1.0.19.0-jre15`, `1.0.19.1-jre15`, `1.0.19.2-jre14`, `1.0.19.2-jre15`, `1.0.19.3-jre14`, `1.0.19.3-jre15`, `1.0.19.4-jre14`, `1.0.19.4-jre15`, `1.0.19.5-jre14`, `1.0.19.5-jre15`, `1.0.19.6-jre8`, `1.0.19.6-jre14`, `1.0.19.7-jre14`, `1.0.19.8-jre8`, `1.0.19.9-jre8`, `1.0.19.9-jre14`, `1.0.19.9-jre15`, `1.0.19.10-jre8`, `1.0.19.10-jre14`, `1.0.19.10-jre15`, `1.0.19.11-jre8`, `1.0.19.11-jre14`, `1.0.19.12-jre8`, `1.0.19.12-jre14`, `1.0.19.13-jre8`, `1.0.19.13-jre14`, `1.0.19.13-jre15`, `1.0.20.0-jre8`, `1.0.20.0-jre14`, `1.0.20.0-jre15`, `1.0.20.1-jre8`, `1.0.20.1-jre14`, `1.0.20.1-jre15`, `1.0.20.2-jre8`, `1.0.20.2-jre14`, `1.0.20.2-jre15`, `1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`, `1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.sndyuk:logback-more-appenders`  -> [`1.5.7-JAVA9MODULE_SLF4J17`, `1.6.0-JAVA9MODULE_SLF4J17`, `1.6.1-JAVA9MODULE_SLF4J17`, `1.7.1-JAVA9MODULE_SLF4J17`, `1.7.2-JAVA9MODULE_SLF4J17`, `1.7.3-JAVA9MODULE_SLF4J17`, `1.7.4-JAVA9MODULE_SLF4J17`, `1.7.5-JAVA9MODULE_SLF4J17`, `1.8.0-JAVA9MODULE_SLF4J17`, `1.8.1-JAVA9MODULE_SLF4J17`, `1.8.2-JAVA9MODULE_SLF4J17`, `1.8.3-JAVA9MODULE_SLF4J17`, `1.8.4-JAVA9MODULE_SLF4J17`, `1.8.5-JAVA9MODULE_SLF4J17`, `1.8.6-JAVA9MODULE_SLF4J17`]
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
1. `org.eclipse.jetty:jetty-runner`  -> [`10.0.0.alpha2`, `10.0.0.beta0`, `11.0.0-alpha0`, `11.0.0.beta1`, `11.0.0.beta2`, `11.0.0.beta3`, `11.0.0`, `11.0.1`, `11.0.2`]
1. `org.slf4j:slf4j-api` 🧩 -> [`1.8.0-beta2`, `1.8.0-beta4`, `2.0.0-alpha0`, `2.0.0-alpha1`]
1. `se.bjurr.gitchangelog:git-changelog-command-line`  -> [`1.45`, `1.50`, `1.52`]

## io.github.classgraph

For example, at least 26 artifacts on Maven Central claim to be the module `io.github.classgraph`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires io.github.classgraph;`.

1. `ch.exense.step.library:step-library-kw-monitoring-system`  -> [`1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`]
1. `ch.exense.step.library:step-library-kw-step-client`  -> [`1.0.7`]
1. `cloud.orbit:orbit-core`  -> [`1.12.0`]
1. `cloud.orbit:orbit-runtime`  -> [`1.12.0`]
1. `com.github.bogie-clj:playground`  -> [`0.1.1`]
1. `com.hazelcast.jet:hazelcast-jet`  -> [`4.1`, `4.1.1`, `4.2`, `4.3`, `4.4`, `4.5`]
1. `com.networknt:codegen-cli`  -> [`1.6.1`, `1.6.2`, `1.6.4`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.4`, `2.0.5`, `2.0.6`, `2.0.7`, `2.0.8`, `2.0.9`, `2.0.10`, `2.0.11`, `2.0.12`, `2.0.13`, `2.0.14`, `2.0.15`, `2.0.16`, `2.0.17`, `2.0.18`, `2.0.19`, `2.0.20`, `2.0.21`, `2.0.22`, `2.0.23`, `2.0.24`, `2.0.25`, `2.0.26`]
1. `com.yahoo.elide:elide-blog-example`  -> [`4.5.12`, `4.5.13`, `4.5.14`, `4.5.15`, `4.5.16`, `4.6.0`, `4.6.1`, `4.6.2`, `4.6.3`, `4.6.4`, `4.6.5`, `4.6.6`, `4.6.7`, `4.6.8`, `4.6.9`, `4.6.10`, `4.6.11`, `4.7.0`]
1. `cz.o2.proxima:proxima-beam-io-pubsub`  -> [`0.4.0`, `0.5.0`, `0.5.1`, `0.6.0`, `0.6.0-jdk11`, `0.6.1`, `0.6.1-jdk11`]
1. `io.cordite.braid:braid-corda`  -> [`5.0.0-RC01`, `5.0.0-RC02`, `5.0.0-RC03`, `5.0.0-RC04`, `5.0.0-RC05`, `5.0.0-RC07`, `5.0.0-RC08`]
1. `io.cordite.services:network-map-service`  -> [`0.4.5`, `0.5.2`]
1. `io.crysknife:crysknife-processor`  -> [`0.1`, `0.2`]
1. `io.crysknife:templates-generator`  -> [`0.1`, `0.2`]
1. `io.github.classgraph:classgraph` 🧩 -> [`4.0.7`, `4.1.0`, `4.1.1`, `4.1.2`, `4.1.3`, `4.1.4`, `4.1.5`, `4.1.6`, `4.1.7`, `4.2.0`, `4.2.1`, `4.2.2`, `4.2.3`, `4.2.4`, `4.2.5`, `4.2.6`, `4.2.7`, `4.2.8`, `4.2.9`, `4.2.10`, `4.2.11`, `4.2.12`, `4.3.0`, `4.3.1`, `4.4.0`, `4.4.1`, `4.4.2`, `4.4.3`, `4.4.5`, `4.4.7`, `4.4.8`, `4.4.9`, `4.4.10`, `4.4.11`, `4.4.12`, `4.6.8`, `4.6.9`, `4.6.10`, `4.6.11`, `4.6.12`, `4.6.13`, `4.6.14`, `4.6.16`, `4.6.18`, `4.6.19`, `4.6.20`, `4.6.21`, `4.6.22`, `4.6.23`, `4.6.24`, `4.6.25`, `4.6.26`, `4.6.27`, `4.6.28`, `4.6.29`, `4.6.30`, `4.6.31`, `4.6.32`, `4.8.0`, `4.8.1`, `4.8.2`, `4.8.3`, `4.8.4`, `4.8.5`, `4.8.6`, `4.8.7`, `4.8.8`, `4.8.9`, `4.8.10`, `4.8.11`, `4.8.12`, `4.8.13`, `4.8.14`, `4.8.15`, `4.8.16`, `4.8.17`, `4.8.19`, `4.8.20`, `4.8.21`, `4.8.22`, `4.8.23`, `4.8.24`, `4.8.25`, `4.8.26`, `4.8.27`, `4.8.28`, `4.8.29`, `4.8.30`, `4.8.31`, `4.8.32`, `4.8.33`, `4.8.34`, `4.8.35`, `4.8.36`, `4.8.37`, `4.8.38`, `4.8.39`, `4.8.40`, `4.8.41`, `4.8.42`, `4.8.43`, `4.8.44`, `4.8.45`, `4.8.46`, `4.8.47`, `4.8.48`, `4.8.49`, `4.8.50`, `4.8.51`, `4.8.52`, `4.8.53`, `4.8.54`, `4.8.55`, `4.8.56`, `4.8.57`, `4.8.58`, `4.8.59`, `4.8.60`, `4.8.61`, `4.8.62`, `4.8.63`, `4.8.64`, `4.8.65`, `4.8.66`, `4.8.67`, `4.8.68`, `4.8.69`, `4.8.70`, `4.8.71`, `4.8.72`, `4.8.73`, `4.8.74`, `4.8.75`, `4.8.76`, `4.8.77`, `4.8.78`, `4.8.79`, `4.8.80`, `4.8.81`, `4.8.82`, `4.8.83`, `4.8.84`, `4.8.85`, `4.8.86`, `4.8.87`, `4.8.88`, `4.8.89`, `4.8.90`, `4.8.92`, `4.8.93`, `4.8.94`, `4.8.95`, `4.8.96`, `4.8.97`, `4.8.98`, `4.8.100`, `4.8.101`, `4.8.102`, `4.8.103`, `4.8.104`, `4.8.105`]
1. `io.github.it-gorillaz:one-lambda`  -> [`1.0.0`]
1. `io.github.shenbinglife:argsRunner`  -> [`1.0.0`]
1. `net.corda:corda-tools-blob-inspector`  -> [`4.0`]
1. `net.corda:corda-tools-network-bootstrapper`  -> [`4.0`, `4.1`, `4.3`, `4.4`, `4.5`, `4.6`, `4.7`, `4.8`]
1. `org.checkerframework:checker`  -> [`3.12.0`, `3.13.0`]
1. `org.eclipse.vorto:generator-lambda-executor`  -> [`1.0.0`]
1. `org.eclipse.vorto:generator-lambda-plugininfo`  -> [`1.0.0`]
1. `org.restheart:restheart`  -> [`5.0.0-RC2`, `5.0.0-RC3`, `5.0.0-RC4`, `5.0.0`, `5.0.1`, `5.1.0`, `5.1.1`, `5.1.2`, `5.1.3`, `5.1.4`, `5.1.5`, `5.1.6`, `5.1.7`, `5.2.0`, `5.3.0`, `5.3.1`, `5.3.2`, `5.3.3`, `5.3.4`, `5.3.5`, `6.0.0-RC1`]
1. `za.co.absa.spline.agent.spark:spark-2.2-spline-agent-bundle_2.11`  -> [`0.5.4`, `0.5.5`, `0.5.6`]
1. `za.co.absa.spline.agent.spark:spark-2.3-spline-agent-bundle_2.11`  -> [`0.5.4`, `0.5.5`, `0.5.6`]
1. `za.co.absa.spline.agent.spark:spark-2.4-spline-agent-bundle_2.11`  -> [`0.5.4`, `0.5.5`, `0.5.6`]
1. `za.co.absa.spline.agent.spark:spark-2.4-spline-agent-bundle_2.12`  -> [`0.5.4`, `0.5.5`, `0.5.6`]

## kotlin.stdlib

For example, at least 25 artifacts on Maven Central claim to be the module `kotlin.stdlib`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires kotlin.stdlib;`.

1. `cn.net.mugui:mugui-communication`  -> [`0.0.1`]
1. `com.brendangoldberg:kotlin-jwt`  -> [`1.3.0`]
1. `com.cognite:cdf-sdk-java`  -> [`0.9.0`, `0.9.1`, `0.9.2`, `0.9.3`, `0.9.4`, `0.9.5`, `0.9.6`]
1. `com.github.answerail:dingtalk-spring-boot-starter`  -> [`2.0.2-RELEASE`, `2.0.3-RELEASE`, `2.0.4-RELEASE`, `2.0.5-RELEASE`, `3.0.0-RELEASE`, `3.1.0-RELEASE`, `3.1.1-RELEASE`, `3.1.2-RELEASE`]
1. `com.github.shynixn.mccoroutine:mccoroutine-bukkit-sample`  -> [`0.0.4`, `0.0.5`, `0.0.6`, `0.0.7`, `1.1.0`, `1.1.2`, `1.2.0`]
1. `com.ibm.cloud:examples`  -> [`0.0.4`]
1. `com.ibm.cloud:platform-services-examples`  -> [`0.17.10`, `0.17.11`, `0.17.12`, `0.17.13`, `0.17.14`, `0.17.15`, `0.17.16`, `0.17.17`, `0.18.0`, `0.18.1`, `0.18.4`, `0.18.5`, `0.18.6`, `0.18.7`, `0.18.8`]
1. `com.intuit.hooks:maven-plugin`  -> [`0.7.0`, `0.8.1`, `0.8.2`, `0.9.0`, `0.9.1`]
1. `com.joseph-dwyer.katana:katana-compiler-plugin`  -> [`0.0.5`]
1. `com.niklasarndt:healthchecksio-java`  -> [`1.0.1`]
1. `com.niklasarndt:okhttp-mocker`  -> [`1.0.0`]
1. `com.sanctionco.thunder:application`  -> [`3.0.0`, `3.0.1`, `3.0.2`, `3.0.3`, `3.0.4`]
1. `de.smartsquare:socket-io-redis-emitter`  -> [`0.9.0`, `0.9.1`, `0.9.3`]
1. `fr.renardfute:SteamAPI`  -> [`1.0`]
1. `no.entur:schema2proto-lib`  -> [`1.1`, `1.2`, `1.3`, `1.4`, `1.5`, `1.6`, `1.7`, `1.8`, `1.9`, `1.10`, `1.13`, `1.14`, `1.15`, `1.16`, `1.17`, `1.18`, `1.19`, `1.20`, `1.21`, `1.22`, `1.23`, `1.24`, `1.25`, `1.26`, `1.27`, `1.28`, `1.29`, `1.30`, `1.31`, `1.32`, `1.33`, `1.34`, `1.35`, `1.36`, `1.37`]
1. `org.jetbrains.kotlin:kotlin-osgi-bundle`  -> [`1.4.0`, `1.4.10`, `1.4.21`, `1.4.30`, `1.5.0-M2`]
1. `org.jetbrains.kotlin:kotlin-stdlib` 🧩 -> [`1.4.0-rc`, `1.4.0`, `1.4.10`, `1.4.20-M1`, `1.4.20-RC`, `1.4.20`, `1.4.21`, `1.4.30-M1`, `1.4.30-RC`, `1.4.30`, `1.4.31`, `1.5.0-M1`, `1.5.0-M2`, `1.5.0-RC`, `1.5.0`]
1. `org.jetbrains.kotlinx:rdkit-jupyter`  -> [`1.0.0`]
1. `ru.pocketbyte.locolaser:resource-gettext`  -> [`2.1.0`]
1. `ru.pocketbyte.locolaser:resource-googlesheet`  -> [`2.1.0`]
1. `ru.pocketbyte.locolaser:resource-ini`  -> [`2.1.0`]
1. `ru.pocketbyte.locolaser:resource-json`  -> [`2.1.0`]
1. `ru.pocketbyte.locolaser:resource-mobile`  -> [`2.1.0`]
1. `ru.pocketbyte.locolaser:resource-properties`  -> [`2.1.0`]
1. `ru.sokomishalov.skraper:cli`  -> [`0.7.0`]

## lombok

For example, at least 24 artifacts on Maven Central claim to be the module `lombok`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires lombok;`.

1. `cn.itlym.shoulder:lombok`  -> [`0.1`]
1. `cn.itlym:shoulder-lombok`  -> [`0.0.1`]
1. `co.privacyone.sdk:keychain`  -> [`1.6.7`, `1.6.8`, `1.6.9`, `1.7.0`, `1.7.1`, `1.7.2`, `1.7.3`, `1.7.4`, `1.7.5`, `2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.5`, `2.0.6`]
1. `co.privacyone.sdk:ldar`  -> [`1.6.7`, `1.6.8`, `1.6.9`, `1.7.0`, `1.7.1`, `1.7.2`, `1.7.3`, `1.7.4`, `1.7.5`, `2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.5`, `2.0.6`]
1. `co.privacyone.sdk:restapi`  -> [`1.6.7`, `1.6.8`, `1.6.9`, `1.7.0`, `1.7.1`, `1.7.2`, `1.7.3`, `1.7.4`, `1.7.5`, `2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.5`, `2.0.6`]
1. `com.github.ramalapure:filesystem`  -> [`1.0`]
1. `com.infobip:jira-version-generator`  -> [`2.0.1`]
1. `com.yubico:java-yubihsm`  -> [`0.1.0RC1`]
1. `io.github.harvies.charon:charon-socks-proxy-server`  -> [`0.0.7`]
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
1. `io.mateu:lombok`  -> [`1.18.11.97`]
1. `io.pravega:pravega-connectors-hadoop`  -> [`0.5.0`]
1. `org.projectlombok:lombok` 🧩 -> [`1.18.2`, `1.18.4`, `1.18.6`, `1.18.8`, `1.18.10`, `1.18.12`, `1.18.14`, `1.18.16`, `1.18.18`, `1.18.20`]

## org.objectweb.asm.commons

For example, at least 19 artifacts on Maven Central claim to be the module `org.objectweb.asm.commons`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.objectweb.asm.commons;`.

1. `com.github.fromage.quasi:quasi-core`  -> [`0.7.10`]
1. `com.github.upthewaterspout.fates:fates-instrumentation`  -> [`0.1.0`, `0.2.0`, `0.3.0`]
1. `com.microsoft.azure:applicationinsights-agent`  -> [`2.5.0-BETA`, `2.5.0-BETA.2`, `2.5.0-BETA.3`, `2.5.0-BETA.4`, `2.5.0-BETA.5`, `2.5.0`, `2.5.1-BETA`, `2.5.1-BETA.2`, `2.5.1`, `2.6.0-BETA`]
1. `com.netflix.nebula:gradle-lint-plugin`  -> [`11.2.0`, `11.3.0`, `11.4.0`, `11.4.1`, `11.4.2`, `11.4.3`, `11.4.4`, `12.0.0`, `12.1.0`, `13.0.0`, `13.1.0`, `13.1.1`, `13.1.2`, `13.1.4`, `13.1.5`, `13.1.6`, `13.1.7`, `14.0.0`, `14.0.1`, `14.1.0`, `14.2.0`, `14.2.1`, `14.2.4`, `15.0.0`, `15.0.1`, `15.0.2`, `15.0.3`, `16.0.0`, `16.0.1`, `16.1.1`, `16.1.2`, `16.1.3`, `16.1.4`, `16.2.0`, `16.2.1`, `16.2.2`, `16.2.3`, `16.3.0`, `16.3.1`, `16.4.0`, `16.5.1`, `16.5.2`, `16.6.0`, `16.7.0`, `16.7.1`, `16.8.0`, `16.8.1`, `16.9.0`, `16.9.1`, `16.10.0`, `16.12.0`, `16.15.6`, `16.15.7`, `16.15.8`, `16.15.9`, `16.16.0`, `16.17.0`, `16.17.1`, `16.18.0`, `16.19.0`, `16.20.0`, `16.22.0`, `16.23.0`]
1. `com.newrelic.agent.android:class-rewriter`  -> [`5.28.0`, `5.28.1`, `6.0.0`]
1. `com.teamscale:teamscale-jacoco-agent`  -> [`16.0.1`, `17.0.0`, `18.0.0`, `19.0.0`, `20.0.0`, `21.0.0`, `21.1.0`, `21.2.0`, `21.2.1`, `21.3.0`, `21.4.0`]
1. `com.viridiansoftware:desugar`  -> [`1.0.0`, `1.0.1`]
1. `com.xdev-software:desktopkit-app`  -> [`1.2.0`]
1. `fish.payara.extras:payara-embedded-all`  -> [`5.183`, `5.184`, `5.191`, `5.192`, `5.193`, `5.193.1`]
1. `fish.payara.extras:payara-embedded-web`  -> [`5.183`, `5.184`, `5.191`, `5.192`, `5.193`, `5.193.1`]
1. `io.joynr.tools.generator:joynr-generator-standalone`  -> [`1.6.4`, `1.6.5`, `1.7.0`, `1.7.1`, `1.8.0`, `1.8.2`, `1.9.0`, `1.9.1`, `1.10.0`, `1.10.1`, `1.11.0`, `1.11.1`, `1.12.0`, `1.13.0`, `1.14.0`, `1.14.1`, `1.14.2`, `1.14.3`, `1.15.0`, `1.15.1`, `1.15.2`, `1.15.3`, `1.15.4`, `1.15.5`, `1.15.6`, `1.15.7`, `1.15.7.1`, `1.15.8`, `1.15.9`, `1.15.10`, `1.15.11`, `1.15.12`, `1.16.0`]
1. `io.michaelrocks:paranoid-gradle-plugin`  -> [`0.3.3`]
1. `io.michaelrocks:paranoid-processor`  -> [`0.3.3`]
1. `net.corda:corda-djvm`  -> [`4.0`]
1. `org.copper-engine:copper-performance-test`  -> [`5.0.0-SNAPHOT`]
1. `org.javastro.vodsl:vodslparser`  -> [`0.4.0`]
1. `org.netbeans.external:asm-commons-7.2`  -> [`RELEASE113`]
1. `org.ow2.asm:asm-commons` 🧩 -> [`6.2.1`, `7.0-beta`, `7.0`, `7.1`, `7.2-beta`, `7.2`, `7.3.1`, `8.0`, `8.0.1`, `9.0-beta`, `9.0`, `9.1`]
1. `software.amazon.disco:disco-java-agent`  -> [`0.10.0`, `0.11.0`]

## org.bouncycastle.pkix

For example, at least 18 artifacts on Maven Central claim to be the module `org.bouncycastle.pkix`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.bouncycastle.pkix;`.

1. `com.datastax.oss:pulsar-jms-all`  -> [`1.0.0-ALPHA`, `1.0.0`]
1. `com.yahoo.vespa:vespa-hadoop`  -> [`7.117.37`, `7.119.4`, `7.120.13`, `7.122.7`, `7.125.11`, `7.126.14`, `7.128.18`, `7.132.16`, `7.133.13`, `7.136.13`, `7.138.15`, `7.140.12`, `7.142.14`, `7.143.13`, `7.144.5`, `7.145.41`, `7.147.12`, `7.157.9`, `7.161.1`, `7.162.26`, `7.164.8`, `7.165.5`, `7.166.31`, `7.168.4`, `7.169.4`, `7.171.10`, `7.172.13`, `7.173.17`, `7.174.29`, `7.175.12`, `7.176.11`, `7.177.11`, `7.179.11`, `7.184.8`, `7.185.19`, `7.186.20`, `7.187.1`, `7.190.14`, `7.193.27`, `7.197.21`, `7.198.13`, `7.199.1`, `7.200.54`, `7.201.7`, `7.204.28`, `7.206.15`, `7.207.47`, `7.208.2`, `7.209.2`, `7.211.11`, `7.212.12`, `7.213.19`, `7.214.34`, `7.215.8`, `7.216.10`, `7.217.12`, `7.218.37`, `7.219.14`, `7.220.14`, `7.223.70`, `7.225.71`, `7.226.6`, `7.227.16`, `7.228.15`, `7.229.35`, `7.232.23`, `7.233.7`, `7.234.10`, `7.235.16`, `7.236.32`, `7.237.14`, `7.238.12`, `7.240.27`, `7.241.12`, `7.242.24`, `7.244.2`, `7.246.11`, `7.247.32`, `7.248.5`, `7.249.12`, `7.250.9`, `7.251.31`, `7.252.6`, `7.254.8`, `7.255.24`, `7.256.6`, `7.257.6`, `7.258.11`, `7.259.2`, `7.261.8`, `7.263.4`, `7.264.3`, `7.265.10`, `7.266.25`, `7.267.11`, `7.268.15`, `7.270.21`, `7.271.29`, `7.273.15`, `7.274.2`, `7.275.26`, `7.276.8`, `7.277.38`, `7.278.21`, `7.279.34`, `7.280.10`, `7.281.56`, `7.282.23`, `7.285.54`, `7.286.18`, `7.290.1`, `7.291.27`, `7.292.82`, `7.294.10`, `7.295.58`, `7.297.21`, `7.298.26`, `7.299.105`, `7.300.57`, `7.301.24`, `7.304.50`, `7.305.19`, `7.306.19`, `7.308.21`, `7.309.46`, `7.310.25`, `7.312.45`, `7.314.13`, `7.317.18`, `7.322.17`, `7.323.38`, `7.324.57`, `7.326.17`, `7.327.42`, `7.328.17`, `7.329.19`, `7.330.15`, `7.331.24`, `7.334.42`, `7.335.22`, `7.338.31`, `7.339.20`, `7.340.22`, `7.342.40`, `7.343.18`, `7.346.59`, `7.347.28`, `7.349.32`, `7.350.53`, `7.351.32`, `7.354.14`, `7.355.22`]
1. `de.aaschmid:taskwarrior-java-client`  -> [`1.0`]
1. `io.nosqlbench:nb`  -> [`3.12.52`, `3.12.54`, `3.12.55`, `3.12.60`, `3.12.61`, `3.12.62`, `3.12.66`, `3.12.67`, `3.12.70`, `3.12.71`, `3.12.72`, `3.12.73`, `3.12.75`, `3.12.76`, `3.12.77`, `3.12.78`, `3.12.79`, `3.12.81`, `3.12.82`, `3.12.83`, `3.12.84`, `3.12.85`]
1. `io.pravega:pravega-keycloak-client`  -> [`0.8.0`, `0.9.0`]
1. `io.streamnative.connectors:pulsar-flink-connector-2.11-1.11`  -> [`2.5.8.3`, `2.5.8.4`]
1. `io.streamnative.connectors:pulsar-flink-connector-2.11-1.12`  -> [`2.7.6`]
1. `io.streamnative.connectors:pulsar-flink-connector-2.12-1.11`  -> [`2.5.8.3`, `2.5.8.4`]
1. `io.streamnative.connectors:pulsar-flink-connector-2.12-1.12`  -> [`2.7.6`]
1. `org.bouncycastle:bcpkix-jdk15on` 🧩 -> [`1.61`, `1.62`, `1.63`, `1.64`, `1.65`, `1.66`, `1.67`, `1.68`]
1. `org.keycloak:kcinit`  -> [`10.0.0`, `10.0.1`, `10.0.2`, `11.0.0`, `11.0.1`, `11.0.2`, `11.0.3`, `12.0.0`, `12.0.1`, `12.0.2`, `12.0.3`, `12.0.4`]
1. `org.opendaylight.jsonrpc:test-tool`  -> [`1.9.0`, `1.9.1`, `1.9.2`, `1.9.3`, `1.10.0`]
1. `org.testcontainers:testcontainers`  -> [`1.14.0`]
1. `org.wso2.msf4j:jwt-sample`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j:petstore-fileserver`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j:petstore-pet`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j:petstore-security`  -> [`2.7.0`, `2.8.2`, `2.8.3`]
1. `org.wso2.msf4j:petstore-txn`  -> [`2.7.0`, `2.8.2`, `2.8.3`]

## com.fasterxml.jackson.module.jaxb

For example, at least 14 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.module.jaxb`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.module.jaxb;`.

1. `com.azure.cosmos.spark:azure-cosmos-spark_3-1_2-12`  -> [`4.0.0-beta.2`, `4.0.0-beta.3`, `4.0.0`]
1. `com.fasterxml.jackson.module:jackson-module-jaxb-annotations` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `com.github.containersolutions:mysql-schema-sample`  -> [`1.0.0`, `1.1.0`, `1.2.0`, `1.2.1`, `1.2.2`]
1. `com.github.containersolutions:webserver-sample`  -> [`1.0.0`, `1.1.0`, `1.2.0`, `1.2.1`, `1.2.2`]
1. `com.guicedee.services:jackson-module-jaxb-annotations`  -> [`1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`]
1. `com.sap.cloud.sdk.datamodel:odata-v4-generator-cli`  -> [`3.36.0`, `3.37.0`, `3.38.0`, `3.39.0`, `3.40.0`, `3.41.0`, `3.42.0`, `3.43.0`, `3.44.1`]
1. `com.yahoo.vespa:vespa-hadoop`  -> [`7.356.23`, `7.358.44`, `7.359.24`, `7.360.24`, `7.361.22`, `7.362.70`, `7.363.17`, `7.364.19`, `7.365.20`, `7.366.33`, `7.367.19`, `7.368.3`, `7.369.27`, `7.371.20`, `7.372.13`, `7.373.22`, `7.374.52`, `7.375.22`, `7.376.25`, `7.378.53`, `7.379.1`, `7.380.25`, `7.381.20`, `7.382.45`, `7.383.13`, `7.384.43`, `7.385.3`, `7.386.28`, `7.387.80`, `7.388.28`, `7.389.1`, `7.390.64`, `7.391.28`, `7.393.56`, `7.394.21`, `7.396.22`, `7.397.65`, `7.398.17`, `7.401.18`, `7.403.18`]
1. `io.kestra.plugin:plugin-serdes`  -> [`0.2.0`, `0.2.1`, `0.2.2`]
1. `org.glassfish.main.admingui:jackson-module-jaxb-annotations`  -> [`6.0.0-M1`, `6.0.0-RC2`, `6.0.0-RC3`, `6.0.0-RC4`, `6.0.0`]
1. `org.kill-bill.billing.plugin.java:analytics-plugin`  -> [`7.1.1`, `7.2.0`, `7.2.1`]
1. `org.kill-bill.billing.plugin.java:deposit-plugin`  -> [`0.0.1`]
1. `org.kill-bill.billing.plugin.java:stripe-plugin`  -> [`7.3.0`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-kpm`  -> [`0.40.5`, `0.40.6`, `0.40.7`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-logger`  -> [`0.40.5`, `0.40.6`, `0.40.7`]

## java.ws.rs

For example, at least 14 artifacts on Maven Central claim to be the module `java.ws.rs`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires java.ws.rs;`.

1. `cc.kebei:boot-in-jar`  -> [`1.1`]
1. `com.bazaarvoice.emodb:emodb-web-local`  -> [`6.3.0`, `6.3.1`, `6.3.2`, `6.4.0`, `6.4.1`]
1. `com.bazaarvoice.emodb:emodb-web`  -> [`6.3.0`, `6.3.1`, `6.3.2`, `6.4.0`, `6.4.1`]
1. `com.guicedee.services:java.ws.rs`  -> [`1.0.20.0-jre8`, `1.0.20.0-jre14`, `1.0.20.0-jre15`, `1.0.20.1-jre8`, `1.0.20.1-jre14`, `1.0.20.1-jre15`, `1.0.20.2-jre8`, `1.0.20.2-jre14`, `1.0.20.2-jre15`, `1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`, `1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.intershop.gradle.jobrunner:icmjobrunner`  -> [`1.0.2`]
1. `de.foellix:AQL-System`  -> [`1.2.0`]
1. `io.github.parj:getexternalip`  -> [`1.0`, `1.1`]
1. `io.pravega:pravega-test-system`  -> [`0.9.0`]
1. `jakarta.ws.rs:jakarta.ws.rs-api`  -> [`2.1.2`, `2.1.4`, `2.1.5`, `2.1.6`]
1. `javax.ws.rs:javax.ws.rs-api`  -> [`2.1.1`]
1. `net.sf.ehcache.internal:ehcache-rest-agent`  -> [`2.10.9`, `2.10.9.2`]
1. `net.sf.ehcache:ehcache`  -> [`2.10.8`, `2.10.9.2`]
1. `org.jboss.spec.javax.ws.rs:jboss-jaxrs-api_2.1_spec`  -> [`2.0.0.CR2`, `2.0.1.Final`]
1. `org.keycloak:kcinit`  -> [`9.0.0`, `9.0.2`, `9.0.3`]

## com.fasterxml.jackson.dataformat.yaml

For example, at least 13 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.dataformat.yaml`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.dataformat.yaml;`.

1. `ai.h2o:sparkling-water-package_2.11`  -> [`3.32.0.1-2-2.4`, `3.32.0.2-1-2.4`, `3.32.0.3-1-2.4`, `3.32.0.4-1-2.4`, `3.32.0.5-1-2.4`, `3.32.1.1-1-2.4`, `3.32.1.2-1-2.4`]
1. `ai.h2o:sparkling-water-package_2.12`  -> [`3.32.0.1-2-3.0`, `3.32.0.2-1-3.0`, `3.32.0.3-1-3.0`, `3.32.0.4-1-3.0`, `3.32.0.5-1-3.0`, `3.32.1.1-1-3.0`, `3.32.1.2-1-3.1`]
1. `com.aerospike:java-object-mapper`  -> [`1.1.0`]
1. `com.fasterxml.jackson.dataformat:jackson-dataformat-yaml` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `com.free-now.sauron.plugins:jaegerapi-report`  -> [`0.0.3`]
1. `com.free-now.sauron.plugins:sonarapi-report`  -> [`0.0.3`, `0.0.4`]
1. `com.free-now.sauron.plugins:thanosapi-report`  -> [`0.0.2`]
1. `com.g2forge.joint:jo-joint`  -> [`0.0.1`, `0.0.2`, `0.0.3`, `0.0.4`]
1. `com.github.liuzhenghui:ecology-plugin-core`  -> [`1.0.0`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7.1`, `1.0.7.2`]
1. `com.restbusters:qreasp`  -> [`0.0.4`]
1. `io.bdeploy:api`  -> [`2.3.0`, `2.4.0`, `2.5.0`, `2.5.1`, `2.5.2`, `3.0.0`, `3.1.0`, `3.1.1`, `3.2.0`, `3.3.0`, `3.3.1`, `3.4.0`, `3.5.0`]
1. `io.kestra.plugin:plugin-kubernetes`  -> [`0.2.0`, `0.2.1`]
1. `io.kestra:kestra`  -> [`0.2.0`, `0.2.1`, `0.2.2`]

## com.fasterxml.jackson.datatype.jdk8

For example, at least 13 artifacts on Maven Central claim to be the module `com.fasterxml.jackson.datatype.jdk8`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.fasterxml.jackson.datatype.jdk8;`.

1. `com.fasterxml.jackson.datatype:jackson-datatype-jdk8` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `com.github.shynixn.minikeyvaluestore:minikeyvaluestore-core`  -> [`1.0.0`]
1. `com.jwebmp.jackson.datatype:jackson-datatype-jdk8`  -> [`0.65.0.1`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]
1. `com.jwebmp.jpms.jackson.datatype:jackson-datatype-jdk8`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.microsoft.azure:spark-cdm-connector`  -> [`0.18.2`]
1. `io.bdeploy:api`  -> [`3.6.0`, `3.6.1`, `3.6.2`, `3.6.3`, `3.6.4`]
1. `io.github.marquezproject:marquez-api`  -> [`0.12.0`, `0.12.1`, `0.12.2`, `0.13.0`, `0.13.1`, `0.14.0`, `0.14.1`, `0.14.2`]
1. `io.github.origin-energy:java-snapshot-testing-core`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`]
1. `io.github.origin-energy:java-snapshot-testing-junit4`  -> [`2.0.0-Beta9`, `2.0.0`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`]
1. `io.github.origin-energy:java-snapshot-testing-junit5`  -> [`2.0.0-Beta9`, `2.0.0`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`]
1. `io.github.origin-energy:java-snapshot-testing-spock`  -> [`2.0.0-Beta9`, `2.0.0`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`]
1. `io.mantisrx:mantis-connector-iceberg`  -> [`1.2.6`, `1.2.7`, `1.2.8`, `1.2.9`, `1.2.10`]
1. `io.mantisrx:mantis-publish-netty`  -> [`1.2.8`, `1.2.9`, `1.2.10`, `1.2.11`, `1.2.12`, `1.2.14`, `1.2.15`, `1.2.17`, `1.2.18`, `1.2.19`, `1.2.20`, `1.3.0`]

## org.openqa.selenium.core

For example, at least 13 artifacts on Maven Central claim to be the module `org.openqa.selenium.core`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.openqa.selenium.core;`.

1. `br.com.behaviortest:behavior-test-api`  -> [`1.0.0`, `1.0.1`]
1. `ch.exense.step.examples:demo-selenium-keyword`  -> [`1.1.3`, `3.13.0`]
1. `ch.exense.step.library:step-library-kw-selenium`  -> [`1.0.7`]
1. `com.codacy:scooby-doo-fwk`  -> [`1.23.0-featpromotetocentral.bec3d80`, `1.23.0-featpromotetocentral.fd73670`, `1.24.0`, `1.26.0`, `1.28.0`, `1.28.2`, `1.28.3`, `1.28.5`, `1.30.0`, `1.32.0`, `1.33.1`, `1.33.3`]
1. `com.gitee.pyqone:autest`  -> [`2.0.0-RELEASE`]
1. `com.github.qgintest:testutilities`  -> [`1.5.0`, `1.7.0`]
1. `com.iceolive:selenium-script`  -> [`0.0.5`]
1. `com.infotel.seleniumRobot:core`  -> [`3.14.2`, `4.0.0`, `4.0.1`, `4.1.0`, `4.1.1`, `4.1.2`, `4.1.3`, `4.1.4`, `4.2.0`, `4.2.1`, `4.2.2`, `4.3.0`]
1. `io.github.sridharbandi:java-a11y`  -> [`1.1.0`, `2.0-alpha-1`]
1. `io.sitoolkit.wt:sit-wt-app`  -> [`3.0.0-alpha.2`, `3.0.0-beta.1`, `3.0.0-beta.2`, `3.0.0-beta.3`, `3.0.0`]
1. `io.tesbo:Tesbo-Web`  -> [`0.0.6`]
1. `org.seleniumhq.selenium:selenium-api`  -> [`3.14.0`, `3.141.0`, `3.141.5`, `3.141.59`, `4.0.0-alpha-1`, `4.0.0-alpha-2`]
1. `ru.sbtqa.tag.pagefactory:page-factory-core`  -> [`10.0.0`, `10.1.1`, `10.1.2`, `10.1.3`, `11.0.0`, `11.0.1`, `11.1.0`, `11.1.1`, `11.2.0`, `12.0.0`, `12.0.1`, `12.0.2`, `12.0.3`, `12.0.4`, `13.0.0`, `13.0.1`, `13.0.2`, `13.0.3`, `13.0.4`, `13.0.5`, `14.0.0`, `14.1.0`, `14.2.0`, `14.3.1`, `14.4.0`, `14.5.0`, `14.6.0`, `14.7.0`, `14.7.1`, `14.8.0`, `14.8.1`, `14.9.0`, `15.0.0`, `15.0.1`, `15.0.2`, `15.1.0`, `15.2.0`, `15.2.2`, `15.2.3`, `15.3.0`, `15.3.1`, `15.4.0`, `15.4.3`, `15.4.8`, `15.5.0`, `15.6.0`, `15.7.2`, `15.8.0`, `15.9.1`, `15.9.2`, `15.9.3`, `15.10.0`, `15.11.0`, `15.12.0`, `15.13.3`, `15.14.1`, `15.14.2`, `15.14.4`, `15.15.0`, `15.15.3`, `15.16.1`, `15.17.1`, `15.18.0`, `15.19.0`, `15.19.1`]

## org.bouncycastle.pg

For example, at least 12 artifacts on Maven Central claim to be the module `org.bouncycastle.pg`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires org.bouncycastle.pg;`.

1. `com.danielflower.apprunner:restabuild`  -> [`0.6.0`]
1. `com.google.gerrit:gerrit-acceptance-framework`  -> [`3.1.0-rc0`, `3.1.0-rc1`, `3.1.0-rc2`, `3.1.0-rc3`, `3.1.0`, `3.1.1`, `3.1.2`]
1. `com.google.gerrit:gerrit-plugin-api`  -> [`3.1.0-rc0`, `3.1.0-rc1`, `3.1.0-rc2`, `3.1.0-rc3`, `3.1.0`, `3.1.1`, `3.1.2`]
1. `com.juliozynger.floorplan:floorplan-gradle-plugin`  -> [`0.3`]
1. `io.kestra.plugin:plugin-crypto`  -> [`0.2.0`, `0.2.1`]
1. `org.bouncycastle:bcpg-fips` 🧩 -> [`1.0.3`, `1.0.4`, `1.0.5`, `1.0.5.1`]
1. `org.bouncycastle:bcpg-jdk15on`  -> [`1.61`, `1.62`, `1.63`, `1.64`, `1.65`, `1.66`, `1.67`, `1.68`]
1. `org.netbeans.external:bcpg`  -> [`RELEASE113`]
1. `org.sonarsource.scm.git:sonar-scm-git-plugin`  -> [`1.11.0.11`, `1.11.1.2008`]
1. `org.vafer:jdeb`  -> [`1.8`]
1. `org.whitesource:wss-unified-agent-main`  -> [`19.7.3`]
1. `pl.allegro.tech.build:axion-release-plugin`  -> [`1.13.0`, `1.13.1`, `1.13.2`]

## com.sun.xml.bind

For example, at least 11 artifacts on Maven Central claim to be the module `com.sun.xml.bind`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.sun.xml.bind;`.

1. `com.airbus-cyber-security.graylog:graylog-plugin-glpi`  -> [`1.1.0`, `1.2.0`, `1.2.1`, `1.3.0`]
1. `com.eternitywall:java-opentimestamps`  -> [`1.18`, `1.19`, `1.20`]
1. `com.hortonworks.registries:schema-registry-core`  -> [`0.8.1`]
1. `com.sun.xml.bind:jaxb-impl` 🧩 -> [`2.4.0-b180725.0644`, `2.4.0-b180830.0438`, `2.3.3-b01`, `2.3.3-b02`, `3.0.0-M1`, `3.0.0-M2`, `3.0.0-M3`, `3.0.0-M4`, `3.0.0-M5`, `3.0.0`, `3.0.1`, `3.0.2-b01`]
1. `eu.fbk.dh:KD-Runner`  -> [`0.1`]
1. `io.github.azagniotov:stubby4j`  -> [`7.1.0`, `7.1.1`, `7.1.2`, `7.1.3`, `7.2.0`, `7.3.0`, `7.3.1`, `7.3.2`, `7.3.3`]
1. `io.pravega:pravega-test-system`  -> [`0.8.0`, `0.8.1`]
1. `org.glassfish.jaxb:jaxb-runtime`  -> [`2.4.0-b180725.0644`, `2.4.0-b180830.0438`, `2.3.2`]
1. `org.icij.extract:extract-cli`  -> [`2.3.0`, `2.3.1`, `2.3.2`, `2.3.3`, `2.3.4`, `2.3.5`, `2.3.8`, `2.3.9`, `2.3.10`, `3.0.0`, `3.0.1`, `3.1.0`, `3.2.0`, `3.2.1`, `3.3.0`, `3.3.1`, `3.3.2`, `3.3.3`, `3.3.4`, `3.3.5`, `3.4.0`, `3.5.0`, `3.5.1`, `3.5.2`, `3.6.0`, `3.6.1`, `3.7.0`, `3.7.1`]
1. `org.jboss.windup.web:windup-keycloak-tool`  -> [`5.2.0.Final`, `5.3.0.Final`, `5.4.0.Final`, `5.5.0.Alpha1`]
1. `org.mustangproject:Mustang-CLI`  -> [`2.0.1`, `2.0.2`, `2.0.3`]

## com.zaxxer.hikari

For example, at least 11 artifacts on Maven Central claim to be the module `com.zaxxer.hikari`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires com.zaxxer.hikari;`.

1. `com.aliyun.schedulerx:schedulerx2-worker`  -> [`1.2.0.1`, `1.2.0.2`, `1.2.1`, `1.2.1.1`, `1.2.1.2`, `1.2.2`, `1.2.2.1`, `1.2.2.2`, `1.2.3`, `1.2.3.1`, `1.2.4`, `1.2.4.3`, `1.2.5.1`, `1.2.5.2`, `1.2.7`]
1. `com.zaxxer:HikariCP` 🧩 -> [`3.4.4`, `3.4.5`, `4.0.0`, `4.0.1`, `4.0.3`]
1. `fr.blueberry-studio.hermes:hermes-api`  -> [`0.9-ALPHA`]
1. `io.tidb:flink-tidb-connector-1.11`  -> [`0.0.3`]
1. `io.tidb:flink-tidb-connector-1.12`  -> [`0.0.3`]
1. `io.tidb:flink-tidb-connector-base`  -> [`0.0.3`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-test-beatrix`  -> [`0.40.2`, `0.40.3`, `0.40.4`, `0.40.5`, `0.40.6`]
1. `org.sonatype.nexus:nexus-orient-component-migrator`  -> [`3.25.0-03`, `3.25.1-02`]
1. `tr.com.infumia:InfumiaPlugin`  -> [`1.1.0`, `1.2.0`, `1.3.0`, `1.4.0`, `1.4.2`, `1.5.0`, `1.5.1`, `1.5.2`, `1.6.1`, `1.6.2`, `1.6.3`, `1.6.4`, `1.6.10`, `1.7.0`, `1.7.1`, `1.7.2`, `1.7.3`, `1.7.4`]
1. `tr.com.infumia:KekoUtil`  -> [`2.0`, `2.1`, `2.2`, `2.3`, `2.4`, `2.5`, `2.6`, `2.7`, `2.8`, `2.9`, `3.0`, `3.1`, `3.2`, `3.3`, `3.4`, `3.5`, `3.6`, `3.7`, `3.8`, `3.9`, `4.0`, `4.1`, `4.2`, `4.3`, `4.4`, `4.5`, `4.6`, `4.7`, `4.8`, `5.0`, `5.1`, `5.2`, `5.3`, `5.4`, `5.5`, `5.6`, `5.7`, `5.8`, `6.0`, `6.1`, `6.2`, `6.3`, `6.4`, `6.5`, `6.6`, `6.7`, `6.8`, `7.0`, `7.1`, `7.2`, `7.3`, `7.4`, `7.4.1`, `7.5`, `7.6`, `7.7`]
1. `tr.com.infumia:db`  -> [`1.0`, `1.1`, `1.3`, `1.4`]

## java.json

For example, at least 11 artifacts on Maven Central claim to be the module `java.json`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires java.json;`.

1. `com.scalar-labs:scalardl-client-sdk`  -> [`1.0.0-alpha.20190222`, `1.1.0`, `1.2.0`, `1.3.0`]
1. `com.scalar-labs:scalardl-java-client-sdk`  -> [`2.0.0`, `2.0.1`, `2.0.2`, `2.0.3`, `2.0.4`, `2.0.5`, `2.0.6`, `2.0.7`, `2.0.8`]
1. `jakarta.json:jakarta.json-api`  -> [`1.1.5`, `1.1.6`]
1. `javax.json:javax.json-api` 🧩 -> [`1.1.3`, `1.1.4`]
1. `org.finra.herd:herd-access-validator`  -> [`0.102.0`, `0.103.0`, `0.104.0`, `0.106.0`, `0.107.0`, `0.108.0`, `0.109.0`, `0.110.0`, `0.111.0`, `0.112.0`, `0.113.0`, `0.114.0`, `0.115.0`, `0.116.0`, `0.117.0`, `0.118.0`, `0.119.0`, `0.120.0`, `0.122.0`, `0.123.0`, `0.124.0`, `0.125.0`, `0.130.0`, `0.131.0`, `0.132.0`, `0.133.0`, `0.134.0`, `0.135.0`, `0.136.0`, `0.137.0`, `0.147.0`]
1. `org.finra.herd:herd-downloader`  -> [`0.86.0`, `0.87.0`, `0.88.0`, `0.89.0`, `0.90.0`, `0.91.0`, `0.92.0`, `0.93.0`, `0.94.0`, `0.96.0`, `0.97.0`, `0.98.0`, `0.99.0`, `0.100.0`, `0.102.0`, `0.103.0`, `0.104.0`, `0.106.0`, `0.107.0`, `0.108.0`, `0.109.0`, `0.110.0`, `0.111.0`, `0.112.0`, `0.113.0`, `0.114.0`, `0.115.0`, `0.116.0`, `0.117.0`, `0.118.0`, `0.119.0`, `0.120.0`, `0.122.0`, `0.123.0`, `0.124.0`, `0.125.0`, `0.130.0`, `0.131.0`, `0.132.0`, `0.133.0`, `0.134.0`, `0.135.0`, `0.136.0`, `0.137.0`, `0.147.0`]
1. `org.finra.herd:herd-retention-expiration-destroyer`  -> [`0.86.0`, `0.87.0`, `0.88.0`, `0.89.0`, `0.90.0`, `0.91.0`, `0.92.0`, `0.93.0`, `0.94.0`, `0.96.0`, `0.97.0`, `0.98.0`, `0.99.0`, `0.100.0`, `0.102.0`, `0.103.0`, `0.104.0`, `0.106.0`, `0.107.0`, `0.108.0`, `0.109.0`, `0.110.0`, `0.111.0`, `0.112.0`, `0.113.0`, `0.114.0`, `0.115.0`, `0.116.0`, `0.117.0`, `0.118.0`, `0.119.0`, `0.120.0`, `0.122.0`, `0.123.0`, `0.124.0`, `0.125.0`, `0.130.0`, `0.131.0`, `0.132.0`, `0.133.0`, `0.134.0`, `0.135.0`, `0.136.0`, `0.137.0`, `0.147.0`]
1. `org.finra.herd:herd-retention-expiration-exporter`  -> [`0.86.0`, `0.87.0`, `0.88.0`, `0.89.0`, `0.90.0`, `0.91.0`, `0.92.0`, `0.93.0`, `0.94.0`, `0.96.0`, `0.97.0`, `0.98.0`, `0.99.0`, `0.100.0`, `0.102.0`, `0.103.0`, `0.104.0`, `0.106.0`, `0.107.0`, `0.108.0`, `0.109.0`, `0.110.0`, `0.111.0`, `0.112.0`, `0.113.0`, `0.114.0`, `0.115.0`, `0.116.0`, `0.117.0`, `0.118.0`, `0.119.0`, `0.120.0`, `0.122.0`, `0.123.0`, `0.124.0`, `0.125.0`, `0.130.0`, `0.131.0`, `0.132.0`, `0.133.0`, `0.134.0`, `0.135.0`, `0.136.0`, `0.137.0`, `0.147.0`]
1. `org.finra.herd:herd-uploader`  -> [`0.86.0`, `0.87.0`, `0.88.0`, `0.89.0`, `0.90.0`, `0.91.0`, `0.92.0`, `0.93.0`, `0.94.0`, `0.96.0`, `0.97.0`, `0.98.0`, `0.99.0`, `0.100.0`, `0.102.0`, `0.103.0`, `0.104.0`, `0.106.0`, `0.107.0`, `0.108.0`, `0.109.0`, `0.110.0`, `0.111.0`, `0.112.0`, `0.113.0`, `0.114.0`, `0.115.0`, `0.116.0`, `0.117.0`, `0.118.0`, `0.119.0`, `0.120.0`, `0.122.0`, `0.123.0`, `0.124.0`, `0.125.0`, `0.130.0`, `0.131.0`, `0.132.0`, `0.133.0`, `0.134.0`, `0.135.0`, `0.136.0`, `0.137.0`, `0.147.0`]
1. `org.openpreservation.jhove:jhove-apps`  -> [`1.24.2`, `1.24.9`]
1. `org.openpreservation.jhove:jhove-ext-modules`  -> [`1.24.2`, `1.24.9`]

## net.bytebuddy.agent

For example, at least 11 artifacts on Maven Central claim to be the module `net.bytebuddy.agent`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires net.bytebuddy.agent;`.

1. `co.elastic.apm:apm-agent-attach-cli`  -> [`1.23.0`]
1. `co.elastic.apm:apm-agent-attach`  -> [`1.4.0`, `1.5.0`, `1.6.0`, `1.6.1`, `1.7.0`, `1.8.0`, `1.9.0`, `1.10.0`, `1.10.1`, `1.11.0`, `1.12.0`, `1.13.0`, `1.14.0`, `1.15.0`, `1.16.0`, `1.17.0`, `1.18.0.RC1`, `1.18.0`, `1.18.1`, `1.19.0`, `1.20.0`, `1.21.0`, `1.22.0`]
1. `com.amazonaws:aws-xray-auto-instrumentation-agent-bootstrap`  -> [`2.4.0-beta`, `2.4.0-beta.1`]
1. `com.ea.async:ea-async`  -> [`1.2.3`]
1. `com.google.gerrit:gerrit-acceptance-framework`  -> [`3.1.3`, `3.1.4`, `3.2.0-rc0`, `3.2.0-rc1`, `3.2.0-rc2`, `3.2.0-rc3`, `3.2.0-rc4`, `3.2.0`, `3.2.1`, `3.2.2`, `3.2.3`, `3.3.0-rc0`, `3.3.0-rc1`, `3.3.0-rc2`, `3.3.0-rc3`, `3.3.0-rc4`, `3.3.0-rc5`, `3.3.0-rc6`, `3.3.0-rc7`, `3.3.0`, `3.3.1`, `3.3.2`, `3.3.3`, `3.4.0-rc0`, `3.4.0-rc1`, `3.4.0-rc2`, `3.4.0-rc3`, `3.4.0-rc4`, `3.4.0-rc5`]
1. `com.nerdvision:example`  -> [`2.0.1`, `2.0.2`, `2.0.4`, `2.1.0`, `2.2.0`]
1. `com.netsensia.rivalchess:rivalchess-engine`  -> [`10.0.0`, `10.0.3`, `10.0.4`]
1. `io.opentracing.contrib.specialagent:opentracing-specialagent`  -> [`1.0.0`, `1.1.0`, `1.1.1`, `1.1.2`, `1.2.0`, `1.3.0`, `1.3.1`, `1.3.2`, `1.3.3`, `1.3.4`, `1.3.5`, `1.3.6`]
1. `io.projectreactor:reactor-tools`  -> [`3.3.0.RELEASE`, `3.3.1.RELEASE`, `3.3.2.RELEASE`, `3.3.3.RELEASE`, `3.3.4.RELEASE`, `3.3.5.RELEASE`, `3.3.6.RELEASE`, `3.3.7.RELEASE`, `3.3.8.RELEASE`, `3.3.9.RELEASE`, `3.3.10.RELEASE`, `3.3.11.RELEASE`, `3.4.0`, `3.4.1`, `3.4.2`, `3.4.3`, `3.4.4`, `3.4.5`, `3.4.6`]
1. `net.bytebuddy:byte-buddy-agent` 🧩 -> [`1.9.0`, `1.9.1`, `1.9.2`, `1.9.3`, `1.9.4`, `1.9.6`, `1.9.7`, `1.9.8`, `1.9.9`, `1.9.10`, `1.9.11`, `1.9.12`, `1.9.13`, `1.9.14`, `1.9.15`, `1.9.16`, `1.10.0`, `1.10.1`, `1.10.2`, `1.10.3`, `1.10.4`, `1.10.5`, `1.10.6`, `1.10.7`, `1.10.8`, `1.10.9`, `1.10.10`, `1.10.11`, `1.10.12`, `1.10.13`, `1.10.14`, `1.10.15`, `1.10.16`, `1.10.17`, `1.10.18`, `1.10.19`, `1.10.20`, `1.10.21`, `1.10.22`, `1.11.0`]
1. `software.amazon.disco:disco-java-agent-inject-api`  -> [`0.10.0`, `0.11.0`]

## org.slf4j.simple

1. `de.quantummaid.tutorials.basic-tutorial:step4`  -> [`1.0.32`, `1.0.34`, `1.0.37`, `1.0.38`]
1. `org.slf4j:slf4j-simple` 🧩 -> [`1.8.0-beta2`, `1.8.0-beta4`, `2.0.0-alpha0`, `2.0.0-alpha1`]
1. `se.bjurr.gitchangelog:git-changelog-command-line`  -> [`1.53`, `1.54`, `1.55`, `1.58`, `1.59`, `1.60.1`, `1.61.0`, `1.62.0`, `1.63.0`]
1. `se.bjurr.openapitowiremock:openapi-to-wiremock`  -> [`0.0`]
1. `se.bjurr.violations:violation-comments-to-bitbucket-cloud-command-line`  -> [`1.11`, `1.13`, `1.23.0`, `1.26.0`]
1. `se.bjurr.violations:violation-comments-to-bitbucket-server-command-line`  -> [`1.9`, `1.35.0`, `1.36.0`]
1. `se.bjurr.violations:violation-comments-to-github-command-line`  -> [`1.9`, `1.10`, `1.19.0`]
1. `se.bjurr.violations:violation-comments-to-gitlab-command-line`  -> [`1.11`, `1.17`, `1.23.0`]
1. `se.bjurr.violations:violations-command-line`  -> [`1.5`, `1.7`, `1.15.0`]

## com.fasterxml.jackson.datatype.jsr310

1. `com.fasterxml.jackson.datatype:jackson-datatype-jsr310` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `com.jwebmp.jpms.jackson.datatype:jackson-datatype-datetime`  -> [`0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.networknt:eventuate-cdc-polling-server`  -> [`2.0.8`, `2.0.9`]
1. `com.networknt:eventuate-cdc-server`  -> [`2.0.8`, `2.0.9`, `2.0.10`, `2.0.11`]
1. `com.networknt:tram-cdc-mysql-server`  -> [`2.0.8`, `2.0.9`, `2.0.10`, `2.0.11`]
1. `com.networknt:tram-cdc-mysql-service`  -> [`2.0.8`, `2.0.9`, `2.0.10`, `2.0.11`]
1. `com.networknt:tram-cdc-polling-server`  -> [`2.0.8`, `2.0.9`]
1. `io.github.marquezproject:marquez-spark`  -> [`0.13.0`, `0.13.1`]

## org.graalvm.js

1. `io.nosqlbench:driver-cql-shaded`  -> [`4.15.31`, `4.15.33`, `4.15.34`, `4.15.35`, `4.15.36`, `4.15.37`, `4.15.38`, `4.15.39`, `4.15.40`, `4.15.41`, `4.15.42`, `4.15.43`, `4.15.44`, `4.15.45`, `4.15.46`]
1. `io.nosqlbench:driver-cqld3-shaded`  -> [`4.15.31`, `4.15.33`, `4.15.34`, `4.15.35`, `4.15.36`, `4.15.37`, `4.15.38`, `4.15.39`, `4.15.40`, `4.15.41`, `4.15.42`, `4.15.43`, `4.15.44`, `4.15.45`, `4.15.46`]
1. `io.nosqlbench:driver-dsegraph-shaded`  -> [`4.15.31`, `4.15.33`, `4.15.34`, `4.15.35`, `4.15.36`, `4.15.37`, `4.15.38`, `4.15.39`, `4.15.40`, `4.15.41`, `4.15.42`, `4.15.43`, `4.15.44`, `4.15.45`, `4.15.46`]
1. `org.graalvm.js:js` 🧩 -> [`20.0.0`, `20.1.0`, `20.2.0`, `20.3.0`, `21.0.0`, `21.0.0.2`, `21.1.0`]
1. `org.graphwalker:graphwalker-cli`  -> [`4.3.0`, `4.3.1`]
1. `org.noear:luffy.executor.s.graaljs`  -> [`1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`]
1. `org.noear:solonjt.actuator.s.graaljs`  -> [`1.0.1`]
1. `org.noear:solonjt.executor.s.graaljs`  -> [`1.0.3.2`, `1.0.3.9`, `1.0.4.3`, `1.0.4.5`, `1.0.4.6`, `1.0.5`, `1.0.6`]

## ch.qos.logback.classic

1. `ch.hsr.adv:adv-lib`  -> [`1.0`]
1. `ch.hsr.adv:adv-ui`  -> [`1.0`]
1. `ch.qos.logback:logback-classic` 🧩 -> [`1.3.0-alpha4`, `1.3.0-alpha5`]
1. `com.github.gv2011.logback:logback-classic`  -> [`1.3.0`, `1.3.1`, `1.3.2`, `1.3.3`, `1.3.4`]
1. `com.optum.sourcehawk:sourcehawk-exec`  -> [`0.2.0`, `0.2.1`, `0.2.2`, `0.2.3`, `0.3.0`, `0.4.0`, `0.4.2`, `0.4.3`, `0.4.4`]
1. `de.quantummaid.tutorials.basic-tutorial:step4`  -> [`1.0.24`, `1.0.25`, `1.0.26`, `1.0.27`, `1.0.28`]
1. `io.github.davidwhitlock.cs410J:grader`  -> [`2021.0.0`, `2021.0.1`, `2021.0.2`, `2021.1.0`]

## com.blazebit.persistence.integration.hibernate

1. `com.blazebit:blaze-persistence-integration-hibernate-4.2`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`]
1. `com.blazebit:blaze-persistence-integration-hibernate-4.3`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`]
1. `com.blazebit:blaze-persistence-integration-hibernate-5.2`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`]
1. `com.blazebit:blaze-persistence-integration-hibernate-5.3`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`]
1. `com.blazebit:blaze-persistence-integration-hibernate-5.4`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`]
1. `com.blazebit:blaze-persistence-integration-hibernate-5`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`]
1. `com.blazebit:blaze-persistence-integration-hibernate-6.0` 🧩 -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`]

## com.fasterxml.jackson.jaxrs.json

1. `com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.2`, `2.10.2.1`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `com.guicedee.services:jackson-jaxrs-json-provider`  -> [`0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `io.liftwizard:liftwizard-example`  -> [`0.13.0`, `0.14.0`, `0.15.0`, `0.16.0`]
1. `io.nflow:nflow-perf-test`  -> [`7.2.1`, `7.2.2`, `7.2.3`, `7.2.4`, `7.3.0`]
1. `io.nflow:nflow-tests`  -> [`7.2.1`, `7.2.2`, `7.2.3`, `7.2.4`, `7.3.0`]
1. `org.apache.tika:tika-server-classic`  -> [`2.0.0-ALPHA`]
1. `org.apache.tika:tika-server-core`  -> [`2.0.0-ALPHA`]

## jakarta.activation

1. `com.guicedee.services:jakarta.activation`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.thirdparty:jakarta.activation`  -> [`0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.sun.activation:jakarta.activation`  -> [`2.0.0-rc1`, `2.0.0-RC2`, `2.0.0-RC3`, `2.0.0`, `2.0.1`]
1. `jakarta.activation:jakarta.activation-api` 🧩 -> [`2.0.0-rc1`, `2.0.0-RC2`, `2.0.0-RC3`, `2.0.0`, `2.0.1`]
1. `org.apache.servicemix.specs:org.apache.servicemix.specs.activation-api-2.0.1`  -> [`2.0.1_1`]
1. `org.apache.sling:org.apache.sling.javax.activation`  -> [`0.2.0`]
1. `org.keycloak:kcinit`  -> [`13.0.0`]

## kotlin.reflect

1. `app.cash.backfila:service-lib`  -> [`0.1.3-20210127.1838-76ab4fc`]
1. `org.jetbrains.kotlin:kotlin-osgi-bundle`  -> [`1.4.0-rc`, `1.4.20-M1`, `1.4.20-RC`, `1.4.20`, `1.4.30-M1`, `1.4.30-RC`, `1.4.31`, `1.5.0-M1`, `1.5.0-RC`, `1.5.0`]
1. `org.jetbrains.kotlin:kotlin-reflect` 🧩 -> [`1.4.0-rc`, `1.4.0`, `1.4.10`, `1.4.20-M1`, `1.4.20-RC`, `1.4.20`, `1.4.21`, `1.4.30-M1`, `1.4.30-RC`, `1.4.30`, `1.4.31`, `1.5.0-M1`, `1.5.0-M2`, `1.5.0-RC`, `1.5.0`]
1. `org.jetbrains.lets-plot:lets-plot-batik`  -> [`2.0.1`]
1. `org.jetbrains.lets-plot:lets-plot-common`  -> [`2.0.1`, `2.0.2-rc1`, `2.0.2`]
1. `org.jetbrains.lets-plot:lets-plot-jfx`  -> [`2.0.1`]
1. `org.sonarsource.slang:sonar-kotlin-plugin`  -> [`1.8.0.1775`, `1.8.1.1804`, `1.8.2.1946`, `1.8.3.2219`]

## org.beryx.awt.color

1. `org.apache.sedona:sedona-viz-2.4_2.11`  -> [`1.0.0-incubating`]
1. `org.apache.sedona:sedona-viz-2.4_2.12`  -> [`1.0.0-incubating`]
1. `org.apache.sedona:sedona-viz-3.0_2.12`  -> [`1.0.0-incubating`]
1. `org.beryx:awt-color-factory` 🧩 -> [`1.0.0`, `1.0.1`, `1.0.2`]
1. `org.datasyslab:geospark-viz_2.1`  -> [`1.2.0`, `1.3.0`, `1.3.1`]
1. `org.datasyslab:geospark-viz_2.2`  -> [`1.2.0`, `1.3.0`, `1.3.1`]
1. `org.datasyslab:geospark-viz_2.3`  -> [`1.2.0`, `1.3.0`, `1.3.1`]

## com.blazebit.persistence.integration.spring.data.impl

1. `com.blazebit:blaze-persistence-integration-spring-data-1.x`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`]
1. `com.blazebit:blaze-persistence-integration-spring-data-2.0`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`]
1. `com.blazebit:blaze-persistence-integration-spring-data-2.1`  -> [`1.4.0-Alpha2`, `1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`]
1. `com.blazebit:blaze-persistence-integration-spring-data-2.2`  -> [`1.4.0-Alpha3`, `1.4.0-Alpha4`, `1.4.0`, `1.4.1`, `1.5.0-Alpha1`, `1.5.0-Alpha2`, `1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`]
1. `com.blazebit:blaze-persistence-integration-spring-data-2.3`  -> [`1.5.0-Alpha3`, `1.5.0-Alpha4`, `1.5.0-Alpha5`, `1.5.0`, `1.5.1`, `1.6.0-Alpha1`, `1.6.0-Alpha2`, `1.6.0`]
1. `com.blazebit:blaze-persistence-integration-spring-data-2.4` 🧩 -> [`1.6.0-Alpha2`, `1.6.0`]

## de.carne.swt

1. `de.carne.common:java-swt-cocoa-macosx-x86_64`  -> [`4.0.0`]
1. `de.carne.common:java-swt-gtk-linux-x86_64`  -> [`4.0.0`]
1. `de.carne.common:java-swt-win32-win32-x86_64`  -> [`4.0.0`]
1. `de.carne:java-swt-cocoa-macosx-x86_64`  -> [`4.0.1`]
1. `de.carne:java-swt-gtk-linux-x86_64`  -> [`4.0.1`]
1. `de.carne:java-swt-win32-win32-x86_64` 🧩 -> [`4.0.1`]

## de.carne.test.swt

1. `de.carne.common:java-test-swt-cocoa-macosx-x86_64`  -> [`4.0.0`]
1. `de.carne.common:java-test-swt-gtk-linux-x86_64`  -> [`4.0.0`]
1. `de.carne.common:java-test-swt-win32-win32-x86_64`  -> [`4.0.0`]
1. `de.carne:java-test-swt-cocoa-macosx-x86_64`  -> [`4.0.1`]
1. `de.carne:java-test-swt-gtk-linux-x86_64`  -> [`4.0.1`]
1. `de.carne:java-test-swt-win32-win32-x86_64` 🧩 -> [`4.0.1`]

## org.glassfish.java.json

1. `com.github.mibo:jaxrsdoc`  -> [`1.1.0`]
1. `com.sebastian-daschner:jaxrs-analyzer`  -> [`0.16`, `0.17`]
1. `com.smartcar.sdk:java-sdk`  -> [`2.7.6`, `2.7.7`, `2.8.0`, `2.8.1`, `2.8.2`]
1. `cz.cuni.mff.d3s.spl:spl-evaluation-java`  -> [`1.0.4`]
1. `org.glassfish:javax.json` 🧩 -> [`1.1.2`, `1.1.3`]
1. `tech.b180.cordaptor:glassfish-javax-json-shaded`  -> [`1.1`]

## com.amihaiemil.eoyaml

1. `com.amihaiemil.web:eo-yaml`  -> [`4.3.0`, `4.3.1`, `4.3.2`, `4.3.3`, `4.3.4`, `4.3.5`, `5.0.0`, `5.0.1`, `5.0.2`, `5.0.3`, `5.1.0`, `5.1.1`, `5.1.2`, `5.1.3`, `5.1.4`, `5.1.5`, `5.1.6`, `5.1.7`, `5.1.8`, `5.1.9`]
1. `io.github.portlek:configs-bukkit`  -> [`4.7`, `4.7.1`, `4.7.2`, `4.7.3`, `4.7.4`, `4.7.5`]
1. `io.github.portlek:configs-bungeecord`  -> [`4.7`, `4.7.1`, `4.7.2`, `4.7.3`, `4.7.4`, `4.7.5`]
1. `io.github.portlek:configs-core`  -> [`4.7`, `4.7.1`, `4.7.2`, `4.7.3`, `4.7.4`, `4.7.5`]
1. `io.github.portlek:configs-nukkit`  -> [`4.7`, `4.7.1`, `4.7.2`, `4.7.3`, `4.7.4`, `4.7.5`]

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
1. `com.jwebmp.plugins.jquery:jwebmp-jquery-ui` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-jquery-ui`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## org.bytedeco.javacpp

1. `org.bytedeco:javacpp` 🧩 -> [`1.5`, `1.5.1`, `1.5.1-1`, `1.5.2`, `1.5.3`, `1.5.4`, `1.5.5`]
1. `org.deeplearning4j:deeplearning4j-ui-standalone`  -> [`1.0.0-beta4`, `1.0.0-beta5`]
1. `org.deeplearning4j:jumpy`  -> [`1.0.0-beta4`, `1.0.0-beta5`, `1.0.0-beta6`, `1.0.0-beta7`]
1. `org.deeplearning4j:pydl4j`  -> [`1.0.0-beta4`, `1.0.0-beta5`, `1.0.0-beta6`, `1.0.0-beta7`]
1. `org.nd4j:nd4j-uberjar`  -> [`1.0.0-beta5`, `1.0.0-beta6`, `1.0.0-beta7`]

## org.codehaus.stax2

1. `com.github.zuinnote:hadoopoffice-flinkts_2.11`  -> [`1.4.0`, `1.5.0`]
1. `com.github.zuinnote:hadoopoffice-flinkts_2.12`  -> [`1.4.0`, `1.5.0`]
1. `com.github.zuinnote:spark-hadoopoffice-ds_2.11`  -> [`1.4.0`, `1.5.0`]
1. `com.github.zuinnote:spark-hadoopoffice-ds_2.12`  -> [`1.4.0`, `1.5.0`]
1. `org.codehaus.woodstox:stax2-api`  -> [`4.2`, `4.2.1`]

## org.joda.convert

1. `com.expedia.www:haystack-service-graph-node-finder`  -> [`1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`, `1.0.10`, `1.0.12`, `1.0.13`, `1.0.14`, `1.0.15`, `1.0.16`, `1.0.17`, `1.0.18`, `1.0.19`]
1. `com.vmlens:plugin.sync.bug`  -> [`1.0.14`, `1.0.15`, `1.1.0`]
1. `eu.xenit.care4alf:care4alf-5x`  -> [`2.1.1`, `2.1.2`, `2.1.3`, `2.2.1`, `2.3.0`]
1. `eu.xenit.care4alf:care4alf-6x`  -> [`2.1.1`, `2.1.2`, `2.1.3`, `2.2.1`, `2.3.0`]
1. `org.joda:joda-convert` 🧩 -> [`2.1.1`, `2.1.2`, `2.2.0`, `2.2.1`]

## org.joda.money

1. `org.joda:joda-money` 🧩 -> [`1.0.1`]
1. `org.kill-bill.billing.plugin.java:avatax-plugin`  -> [`0.8.0`]
1. `org.kill-bill.billing.plugin.java:stripe-plugin`  -> [`7.1.0`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-kpm`  -> [`0.40.0`, `0.40.1`, `0.40.2`, `0.40.3`, `0.40.4`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-logger`  -> [`0.40.0`, `0.40.1`]

## org.objectweb.asm.tree

1. `com.autonomousapps:dependency-analysis-gradle-plugin`  -> [`0.31.1`, `0.31.5`, `0.32.0`, `0.33.0`, `0.34.0`, `0.35.0`, `0.36.0`, `0.37.0`, `0.38.0`, `0.39.0`, `0.40.0`, `0.41.0`, `0.42.0`, `0.43.0`, `0.44.0`, `0.45.0`, `0.46.0`, `0.47.0`, `0.48.0`, `0.49.0`, `0.50.0`, `0.52.0`, `0.53.0`, `0.54.0`, `0.55.0`, `0.56.0`, `0.57.0`, `0.58.0`, `0.59.0`, `0.60.0`, `0.61.0`, `0.62.0`, `0.63.0`, `0.64.0`, `0.65.0`, `0.66.0`, `0.67.0`, `0.68.0`, `0.69.0`, `0.70.0`, `0.71.0`, `0.72.0`, `0.73.0`]
1. `com.guujiang:jacob-core`  -> [`0.0.1`]
1. `com.uber.nullaway:jar-infer-cli`  -> [`0.7.6`, `0.7.7`, `0.7.8`, `0.7.9`, `0.7.10`, `0.8.0`, `0.9.0`, `0.9.1`]
1. `org.netbeans.external:asm-tree-7.2`  -> [`RELEASE113`]
1. `org.ow2.asm:asm-tree` 🧩 -> [`6.2.1`, `7.0-beta`, `7.0`, `7.1`, `7.2-beta`, `7.2`, `7.3.1`, `8.0`, `8.0.1`, `9.0-beta`, `9.0`, `9.1`]

## com.fasterxml.jackson.dataformat.cbor

1. `com.amazonaws:aws-xray-agent-plugin`  -> [`2.7.1`, `2.8.0`, `2.9.0`]
1. `com.fasterxml.jackson.dataformat:jackson-dataformat-cbor` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `org.apache.beam:beam-sdks-java-io-kinesis-expansion-service`  -> [`2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]
1. `org.elasticsearch.plugin:x-pack-sql-jdbc`  -> [`7.8.1`, `7.9.0`, `7.9.1`, `7.9.2`, `7.9.3`, `7.10.0`, `7.10.1`, `7.10.2`, `7.11.0`, `7.11.1`, `7.11.2`, `7.12.0`, `7.12.1`]

## com.jwebmp.core

1. `com.jwebmp.core:jwebmp-core` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
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
1. `com.jwebmp.plugins.angular:jwebmp-angular-animate` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-animate`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularanimatedchange

1. `com.jwebmp.jre10:jwebmp-angular-animated-change`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-animated-change`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-animated-change` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-animated-change`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularautofocus

1. `com.jwebmp.jre10:jwebmp-angular-auto-focus`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-auto-focus`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-auto-focus` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-auto-focus`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularfastclick

1. `com.jwebmp.jre10:jwebmp-angular-fastclick`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-fastclick`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-fastclick`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-fastclick` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularfileupload

1. `com.jwebmp.jre10:jwebmp-angular-file-upload`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-file-upload`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-file-upload` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-file-upload`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularionslider

1. `com.jwebmp.jre10:jwebmp-angular-ion-slider`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-ion-slider`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-ion-slider` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-ion-slider`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularnyabootstrapselector

1. `com.jwebmp.jre10:jwebmp-bootstrap-nya-select4`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre10:jwebmp-bootstrap-nya-select`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-bootstrap-nya-select`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-bootstrap-nya-select` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularprettycheckboxes

1. `com.jwebmp.jre10:jwebmp-angular-pretty-checkboxes`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-pretty-checkboxes`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-pretty-checkboxes` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-pretty-checkboxes`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularprogressbuttonstyles

1. `com.jwebmp.jre10:jwebmp-angular-progress-button-styles`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-progress-button-styles`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-progress-button-styles` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-progress-button-styles`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularroute

1. `com.jwebmp.jre10:jwebmp-angular-route`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-route`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-route` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-route`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularsanitize

1. `com.jwebmp.jre10:jwebmp-angular-sanitize`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-sanitize`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-sanitize` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-sanitize`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularscrollposition

1. `com.jwebmp.jre10:jwebmp-angular-scroll-position`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-scroll-position`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-scroll-position` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-scroll-position`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angularslimscroll

1. `com.jwebmp.jre10:jwebmp-angular-slim-scroll`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-slim-scroll`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-slim-scroll` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-slim-scroll`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.angulartouch

1. `com.jwebmp.jre10:jwebmp-angular-touch`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-touch`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-touch` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-touch`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`]

## com.jwebmp.plugins.angulartrackwidth

1. `com.jwebmp.jre10:jwebmp-angular-track-width`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-track-width`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-track-width` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-track-width`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`]

## com.jwebmp.plugins.angularzoomanimation

1. `com.jwebmp.jre10:jwebmp-angular-ui-zoom`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-angular-ui-zoom`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-angular-ui-zoom` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-angular-ui-zoom`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.bit6

1. `com.jwebmp.jre10:jwebmp-bit6`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-bit6`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-bit6`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-bit6` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.blockui

1. `com.jwebmp.jre10:jwebmp-block-ui`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-block-ui`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-block-ui`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-block-ui` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.blueimp.fileupload

1. `com.jwebmp.jre10:jwebmp-blueimp-fileupload`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-blueimp-fileupload`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.blueimp:jwebmp-blueimp-fileupload` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-blueimp-fileupload`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.blueimp.gallery

1. `com.jwebmp.jre10:jwebmp-blueimp-gallery`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-blueimp-gallery`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.blueimp:jwebmp-blueimp-gallery` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-blueimp-gallery`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.bootstrap4

1. `com.jwebmp.jre10:jwebmp-bootstrap4`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-bootstrap4`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.bootstrap:jwebmp-bootstrap` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-bootstrap4`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.datatable

1. `com.jwebmp.jre10:jwebmp-data-tables`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-data-tables`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-data-tables`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-data-tables` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.dynamicsourcecode

1. `com.jwebmp.jre10:jwebmp-dynamic-source-code-viewer`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-dynamic-source-code-viewer`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-dynamic-source-code-viewer`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-dynamic-source-code-viewer` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.easypiechart

1. `com.jwebmp.jre10:jwebmp-easy-pie-chart`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-easy-pie-chart`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.graphing:jwebmp-easy-pie-chart`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-easy-pie-chart` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.fontawesome5

1. `com.jwebmp.jre10:jwebmp-font-awesome5`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-font-awesome5`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.iconsets:jwebmp-font-awesome5`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-font-awesome5` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.fullcalendar

1. `com.jwebmp.jre10:jwebmp-full-calendar`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-full-calendar`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-full-calendar`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-full-calendar` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.globalize.cultures

1. `com.jwebmp.jre10:jwebmp-globalize`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-globalize`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-globalize`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-globalize` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.glyphicons

1. `com.jwebmp.jre10:jwebmp-glyphicons`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-glyphicons`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.iconsets:jwebmp-glyphicons`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-glyphicons` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.google.sourceprettify

1. `com.jwebmp.jre10:jwebmp-google-source-code-prettify`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-google-source-code-prettify`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-source-prettify`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-google-source-code-prettify` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.imagemap

1. `com.jwebmp.jre10:jwebmp-image-map-heatmap`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-image-map-heatmap`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-image-map-heatmap`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-image-map-heatmap` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.ionic.ionicons

1. `com.jwebmp.jre10:jwebmp-ion-icons`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-ion-icons`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.ion:jwebmp-ion-icons` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-ion-icons`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.ionrangeslider

1. `com.jwebmp.jre10:jwebmp-ion-range-slider`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-ion-range-slider`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.ion:jwebmp-ion-range-slider` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-ion-range-slider`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqgradientlinear

1. `com.jwebmp.jre10:jwebmp-gradients-linear-ie6`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-gradients-linear-ie6`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-linear-gradients`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-gradients-linear-ie6` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqlayout

1. `com.jwebmp.jre10:jwebmp-jquery-ui-layout`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-jquery-ui-layout`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-jqui-layout`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-jquery-ui-layout` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqplot

1. `com.jwebmp.jre10:jwebmp-jqplot`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-jqplot`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.graphing:jwebmp-jqplot`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-jqplot` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqxwidgets

1. `com.jwebmp.jre10:jwebmp-jqx-widgets`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-jqx-widgets`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins:jwebmp-jqx-widgets` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`]
1. `com.jwebmp:jwebmp-jqx-widgets`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jstree

1. `com.jwebmp.jre10:jwebmp-jstree`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-jstree`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-jstree`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-jstree` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.leaflet

1. `com.jwebmp.jre10:jwebmp-leafletjs`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-leafletjs`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-leafletjs`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-leafletjs` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.materialdesignicons

1. `com.jwebmp.jre10:jwebmp-material-design-icons`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-material-design-icons`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.iconsets:jwebmp-material-design-icons`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-material-design-icons` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.metrojs

1. `com.jwebmp.jre10:jwebmp-metro-tiles`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-metro-tiles`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-metro-tiles`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-metro-tiles` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.modernizr

1. `com.jwebmp.jre10:jwebmp-modernizr`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-modernizr`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-modernizr`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-modernizr` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.moment

1. `com.jwebmp.jre10:jwebmp-momentjs`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-momentjs`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-momentjs`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-momentjs` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.ngslimscroll

1. `com.jwebmp.jre10:jwebmp-ng-slim-scroll`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-ng-slim-scroll`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-ng-slim-scroll`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-ng-slim-scroll` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.pace

1. `com.jwebmp.jre10:jwebmp-pace-plugin`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-pace-plugin`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-pace-loader`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-pace-plugin` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.particlejs

1. `com.jwebmp.jre10:jwebmp-particlesjs`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-particlesjs`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-particlesjs`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-particlesjs` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.plusastab

1. `com.jwebmp.jre10:jwebmp-plus-as-tab`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-plus-as-tab`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-plus-as-tab`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-plus-as-tab` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.quickforms

1. `com.jwebmp.jre10:jwebmp-quickforms`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-quickforms`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-quickforms`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-quickforms` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.radialsvgslider

1. `com.jwebmp.jre10:jwebmp-radial-slider-gem`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-radial-slider-gem`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.effects:jwebmp-radial-slider-gem`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-radial-slider-gem` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.skycons

1. `com.jwebmp.jre10:jwebmp-skycons`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-skycons`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.iconsets:jwebmp-skycons`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-skycons` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.smartwizard

1. `com.jwebmp.jre10:jwebmp-smart-wizard`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-smart-wizard`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-smart-wizard`  -> [`1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-smart-wizard` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.softhistorychange

1. `com.jwebmp.jre10:jwebmp-soft-history-change`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-soft-history-change`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-soft-history-change`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-soft-history-change` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.spectrum.colourpicker

1. `com.jwebmp.jre10:jwebmp-spectrum-colour-picker`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-spectrum-colour-picker`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-spectrum-colour-picker`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-spectrum-colour-picker` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.textangular

1. `com.jwebmp.jre10:jwebmp-text-angular`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-text-angular`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.angular:jwebmp-text-angular`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-text-angular` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.textinputeffects

1. `com.jwebmp.jre10:jwebmp-text-input-effects`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-text-input-effects`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-text-input-effects`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-text-input-effects` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.themify.icons

1. `com.jwebmp.jre10:jwebmp-themify-icons`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-themify-icons`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.iconsets:jwebmp-themify-icons`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-themify-icons` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.toastr

1. `com.jwebmp.jre10:jwebmp-toastr`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-toastr`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-toastr`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-toastr` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.verticaltimeline

1. `com.jwebmp.jre10:jwebmp-vertical-timeline-css`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-vertical-timeline-css`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.effects:jwebmp-vertical-timeline-css`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-vertical-timeline-css` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.66.0.1`]

## com.jwebmp.plugins.waveseffect

1. `com.jwebmp.jre10:jwebmp-waveseffect`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-waveseffect`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.effects:jwebmp-waveseffect`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-waveseffect` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.weathericons

1. `com.jwebmp.jre10:jwebmp-weathericons`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-weathericons`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.iconsets:jwebmp-weathericons`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-weathericons` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.xeditable

1. `com.jwebmp.jre10:jwebmp-xeditable`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-xeditable`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-xeditable`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
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
1. `com.sun.xml.bind:jaxb-xjc`  -> [`2.4.0-b180725.0644`, `2.4.0-b180830.0438`, `2.3.3-b01`, `2.3.3-b02`, `3.0.0-M1`, `3.0.0-M2`, `3.0.0-M3`, `3.0.0-M4`, `3.0.0-M5`, `3.0.0`, `3.0.1`, `3.0.2-b01`]
1. `org.glassfish.jaxb:jaxb-xjc`  -> [`2.4.0-b180725.0644`, `2.4.0-b180830.0438`, `2.3.2`]

## jakarta.mail

1. `com.guicedee.services:jakarta.mail`  -> [`1.0.1.0`, `1.0.1.0-jre12`, `1.0.1.0-jre13`, `1.0.1.1`, `1.0.1.1-jre12`, `1.0.1.1-jre13`, `1.0.1.2`, `1.0.1.3`, `1.0.1.3-jre12`, `1.0.1.3-jre13`, `1.0.1.4`, `1.0.1.4-jre8`, `1.0.1.4-jre12`, `1.0.1.4-jre13`, `1.0.1.5`, `1.0.1.5-jre12`, `1.0.1.5-jre13`, `1.0.1.6`, `1.0.1.6-jre12`, `1.0.1.6-jre13`, `1.0.1.7`, `1.0.1.7-jre8`, `1.0.1.7-jre12`, `1.0.1.7-jre13`, `1.0.2.0`, `1.0.2.0-jre8`, `1.0.2.0-jre12`, `1.0.2.0-jre13`, `1.0.2.1`, `1.0.2.1-jre12`, `1.0.2.1-jre13`, `1.0.2.2`, `1.0.2.2-jre8`, `1.0.2.2-jre12`, `1.0.2.2-jre13`, `1.0.2.3`, `1.0.2.3-jre8`, `1.0.2.3-jre12`, `1.0.2.3-jre13`, `1.0.2.4`, `1.0.2.4-jre12`, `1.0.2.4-jre13`, `1.0.2.6-jre13`, `1.0.2.7-jre13`, `1.0.2.8`, `1.0.2.8-jre13`, `1.0.2.9-jre13`, `1.0.2.10-jre13`, `1.0.2.11-jre13`, `1.0.2.12-jre13`, `1.0.2.13-jre13`, `1.0.2.14-jre13`, `1.0.2.15-jre13`, `1.0.2.16-jre13`, `1.0.2.17-jre13`, `1.0.2.18-jre13`, `1.0.3.1-jre13`, `1.0.3.2-jre13`, `1.0.3.3-jre13`, `1.0.4.1-jre13`, `1.0.4.2-jre13`, `1.0.4.3-jre13`, `1.0.4.4-jre13`, `1.0.5.0-jre13`, `1.0.5.1-jre13`, `1.0.5.2-jre13`, `1.0.5.3-jre13`, `1.0.5.4-jre13`, `1.0.5.4-jre14`, `1.0.5.5-jre14`, `1.0.6.1-jre14`, `1.0.6.2-jre14`, `1.0.6.3-jre14`, `1.0.6.4-jre14`, `1.0.6.5-jre14`, `1.0.6.7-jre14`, `1.0.7.0-jre14`, `1.0.7.1-jre14`, `1.0.7.2-jre14`, `1.0.7.3-jre14`, `1.0.7.4-jre14`, `1.0.7.5-jre14`, `1.0.7.6-jre14`, `1.0.7.9-jre14`, `1.0.7.10-jre14`, `1.0.7.11-jre14`, `1.0.7.12-jre14`, `1.0.8.1-jre14`, `1.0.8.2-jre14`, `1.0.8.3-jre14`, `1.0.8.4-jre14`, `1.0.8.5-jre14`, `1.0.8.6-jre14`, `1.0.8.12-jre14`, `1.0.8.16-jre14`, `1.0.8.18-jre14`, `1.0.9.0-jre14`, `1.0.9.1-jre14`, `1.0.9.2-jre14`, `1.0.9.3-jre14`, `1.0.9.4-jre14`, `1.0.9.5-jre14`, `1.0.9.7-jre14`, `1.0.9.10-jre14`, `1.0.9.11-jre14`, `1.0.9.13-jre14`, `1.0.9.14-jre14`, `1.0.10.0-jre14`, `1.0.10.1-jre14`, `1.0.10.3-jre14`, `1.0.10.4-jre14`, `1.0.11.0-jre14`, `1.0.11.2-jre14`, `1.0.11.5-jre14`, `1.0.11.6-jre14`, `1.0.11.7-jre14`, `1.0.12.0-jre14`, `1.0.12.1-jre14`, `1.0.12.2-jre14`, `1.0.12.3-jre14`, `1.0.12.4-jre14`, `1.0.12.5-jre14`, `1.0.13.0-jre14`, `1.0.13.1-jre14`, `1.0.13.2-jre14`, `1.0.13.3-jre14`, `1.0.13.4-jre14`, `1.0.13.5-jre14`, `1.0.14.0-RC1-jre14`, `1.0.14.1-jre14`, `1.0.14.3-jre8`, `1.0.14.4-jre8`, `1.0.14.4-jre14`, `1.0.15.1-jre14`, `1.0.15.2-jre14`, `1.0.15.3-jre8`, `1.0.15.3-jre14`, `1.0.15.4-jre8`, `1.0.15.4-jre14`, `1.0.15.5-jre8`, `1.0.15.5-jre14`, `1.0.16.0-jre14`, `1.0.17.0-jre14`, `1.0.17.1-jre14`, `1.0.18.0-jre14`, `1.0.18.0-jre15`, `1.0.18.1-jre14`, `1.0.18.1-jre15`, `1.0.19.0-jre14`, `1.0.19.0-jre15`, `1.0.19.1-jre15`, `1.0.19.2-jre14`, `1.0.19.2-jre15`, `1.0.19.3-jre14`, `1.0.19.3-jre15`, `1.0.19.4-jre14`, `1.0.19.4-jre15`, `1.0.19.5-jre14`, `1.0.19.5-jre15`, `1.0.19.6-jre8`, `1.0.19.6-jre14`, `1.0.19.7-jre14`, `1.0.19.8-jre8`, `1.0.19.9-jre8`, `1.0.19.9-jre14`, `1.0.19.9-jre15`, `1.0.19.10-jre8`, `1.0.19.10-jre14`, `1.0.19.10-jre15`, `1.0.19.11-jre8`, `1.0.19.11-jre14`, `1.0.19.12-jre8`, `1.0.19.12-jre14`, `1.0.19.13-jre8`, `1.0.19.13-jre14`, `1.0.19.13-jre15`, `1.0.20.0-jre8`, `1.0.20.0-jre14`, `1.0.20.0-jre15`, `1.0.20.1-jre8`, `1.0.20.1-jre14`, `1.0.20.1-jre15`, `1.0.20.2-jre8`, `1.0.20.2-jre14`, `1.0.20.2-jre15`, `1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`, `1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.sun.mail:jakarta.mail`  -> [`2.0.1`]
1. `com.sun.mail:mailapi`  -> [`2.0.1`]
1. `jakarta.mail:jakarta.mail-api` 🧩 -> [`2.0.1`]

## jakarta.xml.bind

1. `jakarta.xml.bind:jakarta.xml.bind-api` 🧩 -> [`3.0.0-RC1`, `3.0.0-RC2`, `3.0.0-RC3`, `3.0.0`, `3.0.1`]
1. `org.glassfish.tyrus.bundles:tyrus-standalone-client-jdk`  -> [`2.0.0-M2`, `2.0.0-M3`, `2.0.0`]
1. `org.glassfish.tyrus.bundles:tyrus-standalone-client`  -> [`2.0.0-M2`, `2.0.0-M3`, `2.0.0`]
1. `org.glassfish.tyrus.ext:tyrus-client-cli`  -> [`2.0.0-M2`, `2.0.0-M3`, `2.0.0`]

## java.json.bind

1. `com.manywho.sdk:sdk-example`  -> [`2.0.0`, `2.0.1`]
1. `io.zeleo.application:zeleo-application-library`  -> [`1.0.1`, `1.0.3`, `1.0.4`]
1. `jakarta.json.bind:jakarta.json.bind-api`  -> [`1.0.1`, `1.0.2`]
1. `org.keycloak:kcinit`  -> [`4.4.0.Final`, `4.5.0.Final`, `4.6.0.Final`, `4.8.0.Final`, `4.8.1.Final`, `4.8.2.Final`, `4.8.3.Final`]

## java.xml.ws

1. `com.srotya.sidewinder:sidewinder-standalone-dist`  -> [`0.2.3`, `0.2.12`, `0.2.13`]
1. `jakarta.xml.ws:jakarta.xml.ws-api`  -> [`2.3.2`]
1. `javax.xml.ws:jaxws-api`  -> [`2.3.1`]
1. `org.apache.servicemix.specs:org.apache.servicemix.specs.jaxws-api-2.3`  -> [`2.3_1`, `2.3_2`, `2.3_3`]

## javax.inject

1. `com.guicedee.services:javax.inject`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.jre11:javax.inject`  -> [`0.63.0.11`, `0.63.0.12`, `0.63.0.13`, `0.63.0.14`, `0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.jwebmp.thirdparty:javax.inject`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp:javax.inject`  -> [`1.1`]

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

1. `com.accenture.testing.bdd:bdd-for-all`  -> [`2.0.0-RC2`, `2.0.0-RC3`]
1. `com.salesforce.dockerfile-image-update:dockerfile-image-update-itest`  -> [`1.0.46`, `1.0.47`, `1.0.48`, `1.0.49`, `1.0.50`, `1.0.51`, `1.0.78`, `1.0.79`, `1.0.81`, `1.0.82`, `1.0.83`, `1.0.84`, `1.0.85`, `1.0.86`, `1.0.87`, `1.0.88`, `1.0.89`, `1.0.90`, `1.0.91`, `1.0.93`, `1.0.94`, `1.0.95`, `1.0.96`, `1.0.97`, `1.0.98`, `1.0.99`, `1.0.102`, `1.0.103`, `1.0.104`, `1.0.105`, `1.0.106`, `1.0.107`, `1.0.110`, `1.0.111`, `1.0.112`, `1.0.113`, `1.0.114`, `1.0.115`, `1.0.117`, `1.0.119`, `1.0.120`, `1.0.121`, `1.0.125`, `1.0.126`, `1.0.127`]
1. `org.assertj:assertj-core` 🧩 -> [`3.13.0`, `3.13.1`, `3.13.2`, `3.14.0`, `3.15.0`, `3.16.0`, `3.16.1`, `3.17.0`, `3.17.1`, `3.17.2`, `3.18.0`, `3.18.1`, `3.19.0`]
1. `org.robotframework:javafxlibrary`  -> [`0.5.3`, `0.5.4`, `0.5.5`, `0.6.0`, `0.7.0`, `0.7.1`]

## org.bouncycastle.mail

1. `org.apache.tika:tika-app`  -> [`1.22`, `1.23`, `1.24`, `1.24.1`, `1.25`, `2.0.0-ALPHA`]
1. `org.apache.tika:tika-server`  -> [`1.22`, `1.23`, `1.24`, `1.24.1`, `1.25`]
1. `org.bouncycastle:bcmail-fips` 🧩 -> [`1.0.2`, `1.0.3`]
1. `org.bouncycastle:bcmail-jdk15on`  -> [`1.61`, `1.62`, `1.63`, `1.64`, `1.65`, `1.66`, `1.67`, `1.68`]

## org.bytedeco.tensorflow.platform

1. `org.bytedeco:tensorflow-platform-gpu`  -> [`1.15.0-1.5.2`, `1.15.2-1.5.3`]
1. `org.bytedeco:tensorflow-platform-python-gpu`  -> [`1.15.0-1.5.2`, `1.15.2-1.5.3`]
1. `org.bytedeco:tensorflow-platform-python`  -> [`1.15.0-1.5.2`, `1.15.2-1.5.3`]
1. `org.bytedeco:tensorflow-platform` 🧩 -> [`1.13.1-1.5`, `1.14.0-1.5.1`, `1.15.0-1.5.2`, `1.15.2-1.5.3`, `1.15.3-1.5.4`, `1.15.5-1.5.5`]

## org.json

1. `com.guicedee.services:json`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.jre11:json`  -> [`0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.jwebmp.thirdparty:json`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp:json`  -> [`0.63.0.60`, `0.63.0.61`, `0.65.0.1`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## org.objectweb.asm.tree.analysis

1. `fish.payara.extras:payara-embedded-all`  -> [`5.194`, `5.201`, `5.2020.2`, `5.2020.3`, `5.2020.4`, `5.2020.5`, `5.2020.6`, `5.2020.7`, `5.2021.1`, `5.2021.2`, `5.2021.3`]
1. `fish.payara.extras:payara-embedded-web`  -> [`5.194`, `5.201`, `5.2020.2`, `5.2020.3`, `5.2020.4`, `5.2020.6`, `5.2020.7`, `5.2021.1`, `5.2021.2`, `5.2021.3`]
1. `org.apache.felix:org.apache.felix.scr.bnd`  -> [`1.9.4`, `1.9.6`]
1. `org.ow2.asm:asm-analysis` 🧩 -> [`6.2.1`, `7.0-beta`, `7.0`, `7.1`, `7.2-beta`, `7.2`, `7.3.1`, `8.0`, `8.0.1`, `9.0-beta`, `9.0`, `9.1`]

## org.objectweb.asm.util

1. `com.github.pxav.kelp:core`  -> [`0.0.5`]
1. `com.rookout:rook`  -> [`0.1.65`, `0.1.66`, `0.1.67`, `0.1.68`, `0.1.69`, `0.1.70`, `0.1.71`, `0.1.72`, `0.1.73`, `0.1.74`, `0.1.75`, `0.1.76`, `0.1.77`, `0.1.78`, `0.1.79`, `0.1.80`, `0.1.81`, `0.1.82`, `0.1.83`, `0.1.84`, `0.1.85`, `0.1.86`, `0.1.87`, `0.1.88`, `0.1.89`, `0.1.90`, `0.1.91`, `0.1.92`, `0.1.93`, `0.1.94`, `0.1.95`, `0.1.96`, `0.1.97`, `0.1.98`, `0.1.99`, `0.1.100`, `0.1.101`, `0.1.102`, `0.1.103`, `0.1.104`, `0.1.105`, `0.1.106`, `0.1.107`, `0.1.108`, `0.1.109`, `0.1.110`, `0.1.111`, `0.1.112`, `0.1.113`, `0.1.114`, `0.1.115`, `0.1.116`, `0.1.117`, `0.1.118`, `0.1.119`, `0.1.120`, `0.1.121`, `0.1.122`, `0.1.123`, `0.1.124`, `0.1.125`, `0.1.126`, `0.1.127`, `0.1.128`, `0.1.129`, `0.1.130`, `0.1.132`, `0.1.133`, `0.1.134`, `0.1.135`, `0.1.136`, `0.1.137`, `0.1.138`, `0.1.139`, `0.1.140`, `0.1.141`, `0.1.142`, `0.1.143`, `0.1.144`, `0.1.145`, `0.1.146`, `0.1.147`, `0.1.148`, `0.1.149`, `0.1.150`, `0.1.151`, `0.1.152`, `0.1.153`, `0.1.154`, `0.1.155`, `0.1.156`, `0.1.157`, `0.1.158`, `0.1.159`, `0.1.160`, `0.1.161`, `0.1.162`, `0.1.163`, `0.1.164`, `0.1.165`, `0.1.166`, `0.1.167`, `0.1.168`, `0.1.169`, `0.1.170`, `0.1.171`, `0.1.172`]
1. `io.btrace:btrace-client`  -> [`2.2.0`]
1. `org.ow2.asm:asm-util` 🧩 -> [`6.2.1`, `7.0-beta`, `7.0`, `7.1`, `7.2-beta`, `7.2`, `7.3.1`, `8.0`, `8.0.1`, `9.0-beta`, `9.0`, `9.1`]

## org.openqa.selenium.chrome

1. `ch.exense.step.examples:demo-appium-keyword`  -> [`1.1.3`, `3.13.0`]
1. `com.automation-remarks:video-recorder-remote`  -> [`2.0`]
1. `com.github.claremontqualitymanagement.TestAutomationFramework:TafFull`  -> [`3.0.3`, `3.0.4`, `3.0.5`, `3.0.9`, `3.0.10`, `3.0.11`]
1. `org.seleniumhq.selenium:selenium-chrome-driver`  -> [`3.14.0`, `3.141.0`, `3.141.5`, `3.141.59`, `4.0.0-alpha-1`, `4.0.0-alpha-2`]

## org.seleniumhq.selenium.java

1. `com.gitee.pyqone:autest`  -> [`2.1.0`, `2.1.1`]
1. `com.iceolive:selenium-script`  -> [`0.0.6`, `0.0.7`]
1. `io.github.multicatch:cucumber-audit-standalone`  -> [`1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`]
1. `org.seleniumhq.selenium:selenium-java` 🧩 -> [`4.0.0-alpha-3`, `4.0.0-alpha-4`, `4.0.0-alpha-5`, `4.0.0-alpha-6`, `4.0.0-alpha-7`, `4.0.0-beta-1`, `4.0.0-beta-2`, `4.0.0-beta-3`]

## aopalliance

1. `com.guicedee.services:aopalliance-core`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.jre11:aopalliance-core`  -> [`0.63.0.12`, `0.63.0.13`, `0.63.0.14`, `0.63.0.16`, `0.63.0.17`, `0.63.0.19`]
1. `com.jwebmp.thirdparty:aopalliance-core`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]

## be.webtechie.piheaders

1. `be.webtechie:pi-headerPins`  -> [`0.1.1`]
1. `be.webtechie:pi-headers`  -> [`0.0.3`, `0.1.1`]
1. `be.webtechie:resistor-calculator` 🧩 -> [`0.0.1`, `0.0.2`]

## com.fasterxml.classmate

1. `com.fasterxml:classmate` 🧩 -> [`1.5.0`, `1.5.1`]
1. `com.guicedee.services:classmate`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-test-beatrix`  -> [`0.40.0`, `0.40.1`, `0.40.7`]

## com.fasterxml.jackson.dataformat.csv

1. `com.fasterxml.jackson.dataformat:jackson-dataformat-csv` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `com.hortonworks.registries:avro-examples`  -> [`0.9.0`, `0.9.1`]
1. `org.apache.beam:beam-runners-samza-job-server`  -> [`2.27.0`, `2.28.0`, `2.29.0`]

## com.fasterxml.jackson.datatype.guava

1. `com.fasterxml.jackson.datatype:jackson-datatype-guava` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `com.github.priytam:exampleApp`  -> [`1.0`, `1.1`, `1.1-java-8`, `1.2-java-8`, `1.3-java-8`, `1.4-java-8`, `1.5.1`]
1. `io.github.marquezproject:marquez`  -> [`0.11.1-rc.4`, `0.11.1`, `0.11.2`, `0.11.3-rc.1`, `0.11.3-rc.2`, `0.11.3-rc.3`, `0.11.3-rc.4`, `0.11.3`, `0.11.4-rc.1`, `0.11.4-rc.2`, `0.11.4-rc.3`]

## com.fasterxml.jackson.module.afterburner

1. `com.fasterxml.jackson.module:jackson-module-afterburner` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `org.kill-bill.billing.plugin.java:stripe-plugin`  -> [`7.2.0`]
1. `org.kill-bill.billing:killbill-platform-osgi-bundles-logger`  -> [`0.40.2`, `0.40.3`, `0.40.4`]

## com.fasterxml.jackson.module.guice

1. `com.fasterxml.jackson.module:jackson-module-guice` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `com.jwebmp.jackson.module:jackson-module-guice`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]
1. `com.jwebmp.jpms.jackson.module:jackson-module-guice`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]

## com.fasterxml.jackson.module.paranamer

1. `com.datamountaineer:kafka-connect-common`  -> [`2.0.1`, `2.0.2`, `2.0.3`, `2.0.4`, `2.0.5`]
1. `com.fasterxml.jackson.module:jackson-module-paranamer` 🧩 -> [`2.10.0.pr1`, `2.10.0.pr2`, `2.10.0.pr3`, `2.10.1`, `2.10.2`, `2.10.3`, `2.11.0.rc1`, `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.12.0-rc1`, `2.12.0-rc2`, `2.12.0`, `2.12.1`, `2.12.2`, `2.12.3`]
1. `org.apache.beam:beam-runners-spark-job-server`  -> [`2.20.0`, `2.22.0`, `2.23.0`, `2.24.0`, `2.25.0`, `2.26.0`, `2.27.0`, `2.28.0`]

## com.github.rvesse.airline

1. `com.github.rvesse:airline-examples` 🧩 -> [`2.7.0`, `2.7.1`, `2.7.2`, `2.8.0`, `2.8.1`]
1. `com.github.rvesse:airline`  -> [`2.7.0`, `2.7.1`, `2.7.2`, `2.8.0`, `2.8.1`]
1. `io.stargate.starter:stargate-starter`  -> [`0.0.7`, `0.0.8`, `0.0.9`, `0.0.10`, `0.0.11`, `0.0.13`, `0.0.14`, `0.0.15`, `0.0.16`, `0.0.17`, `0.0.18`, `0.0.19`, `0.0.20`, `0.0.21`, `0.0.22`, `0.0.23`, `0.0.24`, `0.0.25`, `0.0.26`, `0.0.27`, `0.0.28`, `0.0.29`, `1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`, `1.0.4`, `1.0.5`, `1.0.6`, `1.0.7`, `1.0.8`, `1.0.9`, `1.0.10`, `1.0.11`, `1.0.12`, `1.0.13`, `1.0.14`, `1.0.15`, `1.0.16`, `1.0.17`, `1.0.18`, `1.0.19`, `1.0.21`, `1.0.22`, `1.0.23`, `1.0.24`]

## com.google.guice.extensions.persist

1. `com.guicedee.services.extensions:guice-persist`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.guicedee.services:guice-persist`  -> [`1.0.14.0-RC1-jre14`, `1.0.14.1-jre14`, `1.0.14.3-jre8`, `1.0.14.4-jre8`, `1.0.14.4-jre14`, `1.0.15.1-jre14`, `1.0.15.2-jre14`, `1.0.15.3-jre8`, `1.0.15.3-jre14`, `1.0.15.4-jre8`, `1.0.15.4-jre14`, `1.0.15.5-jre8`, `1.0.15.5-jre14`, `1.0.16.0-jre14`, `1.0.17.0-jre14`, `1.0.17.1-jre14`, `1.0.18.0-jre14`, `1.0.18.0-jre15`, `1.0.18.1-jre14`, `1.0.18.1-jre15`, `1.0.19.0-jre14`, `1.0.19.0-jre15`, `1.0.19.1-jre15`, `1.0.19.2-jre14`, `1.0.19.2-jre15`, `1.0.19.3-jre14`, `1.0.19.3-jre15`, `1.0.19.4-jre14`, `1.0.19.4-jre15`, `1.0.19.5-jre14`, `1.0.19.5-jre15`, `1.0.19.6-jre8`, `1.0.19.6-jre14`, `1.0.19.7-jre14`, `1.0.19.8-jre8`, `1.0.19.9-jre8`, `1.0.19.9-jre14`, `1.0.19.9-jre15`, `1.0.19.10-jre8`, `1.0.19.10-jre14`, `1.0.19.10-jre15`, `1.0.19.11-jre8`, `1.0.19.12-jre8`, `1.0.19.12-jre14`, `1.0.19.13-jre8`, `1.0.19.13-jre14`, `1.0.19.13-jre15`, `1.0.20.0-jre8`, `1.0.20.0-jre14`, `1.0.20.0-jre15`, `1.0.20.1-jre8`, `1.0.20.1-jre14`, `1.0.20.1-jre15`, `1.0.20.2-jre8`, `1.0.20.2-jre14`, `1.0.20.2-jre15`, `1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`, `1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp.inject.extensions:guice-persist`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`, `0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]

## com.google.guice.extensions.servlet

1. `com.guicedee.services.extensions:guice-servlet`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.guicedee.services:guice-servlet`  -> [`1.0.14.0-RC1-jre14`, `1.0.14.1-jre14`, `1.0.14.3-jre8`, `1.0.14.4-jre8`, `1.0.14.4-jre14`, `1.0.15.1-jre14`, `1.0.15.2-jre14`, `1.0.15.3-jre8`, `1.0.15.3-jre14`, `1.0.15.4-jre8`, `1.0.15.4-jre14`, `1.0.15.5-jre8`, `1.0.15.5-jre14`, `1.0.16.0-jre14`, `1.0.17.0-jre14`, `1.0.17.1-jre14`, `1.0.18.0-jre14`, `1.0.18.0-jre15`, `1.0.18.1-jre14`, `1.0.18.1-jre15`, `1.0.19.0-jre14`, `1.0.19.0-jre15`, `1.0.19.1-jre15`, `1.0.19.2-jre14`, `1.0.19.2-jre15`, `1.0.19.3-jre14`, `1.0.19.3-jre15`, `1.0.19.4-jre14`, `1.0.19.4-jre15`, `1.0.19.5-jre14`, `1.0.19.5-jre15`, `1.0.19.6-jre8`, `1.0.19.6-jre14`, `1.0.19.7-jre14`, `1.0.19.8-jre8`, `1.0.19.9-jre8`, `1.0.19.9-jre14`, `1.0.19.9-jre15`, `1.0.19.10-jre8`, `1.0.19.10-jre14`, `1.0.19.10-jre15`, `1.0.19.11-jre8`, `1.0.19.12-jre8`, `1.0.19.12-jre14`, `1.0.19.13-jre8`, `1.0.19.13-jre14`, `1.0.19.13-jre15`, `1.0.20.0-jre8`, `1.0.20.0-jre14`, `1.0.20.0-jre15`, `1.0.20.1-jre8`, `1.0.20.1-jre14`, `1.0.20.1-jre15`, `1.0.20.2-jre8`, `1.0.20.2-jre14`, `1.0.20.2-jre15`, `1.1.0.0-jre15`, `1.1.0.1-jre14`, `1.1.0.1-jre15`, `1.1.0.2-jre15`, `1.1.0.3-jre15`, `1.1.0.4-jre8`, `1.1.0.4-jre14`, `1.1.0.4-jre15`, `1.1.0.5-jre14`, `1.1.0.5-jre15`, `1.1.0.6-jre14`, `1.1.0.6-jre15`, `1.1.0.7-jre15`, `1.1.0.8-SNAPSHOT-jre14`, `1.1.1.0-SNAPSHOT-jre15`, `1.1.1.0-jre15`, `1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
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
1. `com.jwebmp.plugins.graphing:jwebmp-c3`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-c3` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.66.0.1`]

## com.jwebmp.plugins.cordovify

1. `com.jwebmp.jre10:jwebmp-cordovify`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-cordovify`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-cordovify` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.d3

1. `com.jwebmp.jre11:jwebmp-d3`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.graphing:jwebmp-d3`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-d3` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.66.0.1`]

## com.jwebmp.plugins.easingeffects

1. `com.jwebmp.jre10:jwebmp-easing-effects`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-easing-effects`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.javascript:jwebmp-easing-effects`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]

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
1. `com.jwebmp.plugins.jquery:jwebmp-jqui-themes` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-jquery-ui-themes`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqueryui.themes.nestable

1. `com.jwebmp.jre11:jwebmp-jquery-ui-themes-nestable`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-jqui-themes-nestable` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `com.jwebmp:jwebmp-jquery-ui-themes-nestable`  -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.jqueryverticaltimeline

1. `com.jwebmp.jre10:jwebmp-jquery-vertical-timeline`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-jquery-vertical-timeline`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.jquery:jwebmp-jqui-vertical-timeline` 🧩 -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]

## com.jwebmp.plugins.smartwizard4

1. `com.jwebmp.jre11:jwebmp-smart-wizard-bootstrap4`  -> [`0.62.0.1`]
1. `com.jwebmp.plugins.forms:jwebmp-smart-wizard`  -> [`0.67.0.1`, `0.67.0.2`, `0.67.0.3`, `0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`, `0.73.0.1`, `1.0.1.6`, `1.0.1.7`, `1.0.2.0`, `1.0.2.1`, `1.0.2.2`, `1.0.2.3`, `1.0.2.4`, `1.0.2.8`]
1. `com.jwebmp:jwebmp-smart-wizard-bootstrap4` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.jwebmp.plugins.weblogappender

1. `com.jwebmp.jre10:jwebmp-web-log-appender`  -> [`0.58.0.21-RCTEST`, `0.59.0.14`]
1. `com.jwebmp.jre11:jwebmp-web-log-appender`  -> [`0.62.0.1`]
1. `com.jwebmp:jwebmp-web-log-appender` 🧩 -> [`0.63.0.61`, `0.65.0.2`, `0.65.0.3`, `0.66.0.1`]

## com.sun.tools.ws.jaxws

1. `com.sun.xml.ws:jaxws-tools`  -> [`2.3.2`]
1. `com.sun.xml.ws:tools`  -> [`2.3.2`]
1. `org.glassfish.metro:webservices-tools`  -> [`2.4.3`]

## com.sun.xml.fastinfoset

1. `com.expedia.www:haystack-agent`  -> [`0.1.8`, `0.1.9`, `0.1.10`, `0.1.11`, `0.1.12`, `0.1.13`, `0.1.14`, `0.1.15`, `0.1.16`, `0.1.17`, `0.1.18`]
1. `com.sun.xml.fastinfoset:FastInfoset` 🧩 -> [`1.2.15`, `1.2.16`, `1.2.17`, `1.2.18`, `2.0.0-M1`, `2.0.0-M2`, `2.0.0`]
1. `org.realityforge.keycloak.converger:keycloak-converger`  -> [`1.9`, `1.11`, `1.12`, `1.13`]

## com.sun.xml.ws.jaxws

1. `com.sun.xml.ws:jaxws-rt`  -> [`2.3.1`, `2.3.2`]
1. `com.sun.xml.ws:runtime` 🧩 -> [`2.3.2`]
1. `org.glassfish.metro:webservices-rt`  -> [`2.4.2`]

## de.carne.swt.browseradapater

1. `de.carne.common:java-swt-browseradapter-cocoa-macosx-x86_64`  -> [`0.1.0`]
1. `de.carne.common:java-swt-browseradapter-gtk-linux-x86_64`  -> [`0.1.0`]
1. `de.carne.common:java-swt-browseradapter-win32-win32-x86_64`  -> [`0.1.0`]

## io.helidon.metrics

1. `io.helidon.metrics:helidon-metrics2`  -> [`1.3.0`, `1.3.1`, `1.4.0`, `1.4.1`, `1.4.2`, `1.4.3`, `1.4.4`, `1.4.5`, `1.4.6`, `1.4.7`, `1.4.8`]
1. `io.helidon.metrics:helidon-metrics` 🧩 -> [`0.11.0`, `0.11.1`, `1.0.0`, `1.0.1`, `1.0.2`, `1.0.3`, `1.1.0`, `1.1.1`, `1.1.2`, `1.2.0`, `1.2.1`, `1.3.0`, `1.3.1`, `1.4.0`, `1.4.1`, `2.0.0-M1`, `2.0.0-M2`, `2.0.0-M3`, `2.0.0-M4`, `2.0.0-RC1`, `2.0.0-RC2`, `2.0.0`, `2.0.1`, `2.0.2`, `2.1.0`, `2.2.0`, `2.2.1`, `2.2.2`, `2.3.0`]
1. `io.helidon.microprofile.metrics:helidon-metrics-se`  -> [`0.9.0`, `0.9.1`, `0.10.0`, `0.10.1`, `0.10.2`, `0.10.3`, `0.10.4`, `0.10.5`, `0.10.6`]

## jakarta.servlet

1. `cloud.piranha.servlet:piranha-servlet-api`  -> [`21.4.0`, `21.5.0`]
1. `com.guicedee.services:jakarta.servlet-api`  -> [`1.1.1.1-jre15-SP1`, `1.1.1.2-jre15`, `1.1.1.3-jre15`, `1.1.1.3-jre16`, `1.1.1.4-jre15`, `1.1.1.4-jre16`, `1.1.1.5-jre15`, `1.1.1.7-jre15`, `1.1.1.7-jre16`, `1.1.1.8-jre16`]
1. `org.apache.tomcat:tomcat-servlet-api`  -> [`10.0.0-M8`, `10.0.0-M9`, `10.0.0-M10`, `10.0.0`, `10.0.2`, `10.0.4`, `10.0.5`, `10.0.6`]

## java.transaction

1. `com.guicedee.services:javax.transaction`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.thirdparty:javax.transaction`  -> [`0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `org.jboss.spec.javax.transaction:jboss-transaction-api_1.2_spec`  -> [`2.0.0.Alpha1`]

## kotlin.test.junit

1. `org.jetbrains.kotlin:kotlin-test-junit` 🧩 -> [`1.4.0-rc`, `1.4.0`, `1.4.10`, `1.4.20-M1`, `1.4.20-RC`, `1.4.20`, `1.4.21`, `1.4.30-M1`, `1.4.30-RC`, `1.4.30`, `1.4.31`, `1.5.0-M1`, `1.5.0-M2`, `1.5.0-RC`, `1.5.0`]
1. `org.jetbrains.lets-plot:lets-plot-batik`  -> [`2.0.2-rc1`, `2.0.2`]
1. `org.jetbrains.lets-plot:lets-plot-jfx`  -> [`2.0.2-rc1`, `2.0.2`]

## net.dongliu.cute.http.jsonb

1. `net.dongliu:cute-http-gson`  -> [`1.2.2`, `3.0.0`]
1. `net.dongliu:cute-http-jackson`  -> [`1.1.2`, `1.2.0`, `1.2.1`, `1.2.2`, `3.0.0`]
1. `net.dongliu:cute-http-jsonb` 🧩 -> [`1.1.0`, `1.1.1`, `1.1.2`, `1.2.0`, `1.2.1`, `1.2.2`, `3.0.0`]

## org.apache.commons.logging

1. `com.guicedee.services:commons-logging`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `no.ssb.vtl:java-vtl-interpreter`  -> [`0.1.0`]
1. `org.slf4j:jcl-over-slf4j`  -> [`1.8.0-beta2`, `1.8.0-beta4`, `2.0.0-alpha0`, `2.0.0-alpha1`]

## org.apache.poi.ooxml

1. `com.github.zuinnote:hadoopoffice-hiveserde`  -> [`1.4.0`, `1.5.0`]
1. `com.guicedee.services:apache-poi-ooxml`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `org.apache.poi:poi-ooxml` 🧩 -> [`5.0.0`]

## org.apache.tomcat.juli

1. `de.mklinger.tomcat:tomcat-juli-slf4j`  -> [`9.0.38`]
1. `org.apache.tomcat:tomcat-juli` 🧩 -> [`10.0.0-M8`, `10.0.0-M9`, `10.0.0-M10`, `10.0.0`, `10.0.2`, `10.0.4`, `10.0.5`, `10.0.6`]
1. `org.apache.tomee:tomee-juli`  -> [`8.0.5`, `8.0.6`, `8.0.7`]

## org.apiguardian.api

1. `org.apiguardian:apiguardian-api` 🧩 -> [`1.1.0`, `1.1.1`]
1. `org.eclipse.tycho:org.eclipse.tycho.surefire.junit56`  -> [`2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`]
1. `org.eclipse.tycho:org.eclipse.tycho.surefire.junit57`  -> [`2.2.0`, `2.3.0`]

## org.bytedeco.hdf5.platform

1. `es.upm.etsisi:cf4j`  -> [`2.1.1`]
1. `org.bytedeco:hdf5-platform` 🧩 -> [`1.10.5-1.5`, `1.10.5-1.5.1`, `1.10.5-1.5.2`, `1.12.0-1.5.3`, `1.12.0-1.5.4`, `1.12.0-1.5.5`]
1. `org.deeplearning4j:deeplearning4j-ui-standalone`  -> [`1.0.0-beta6`, `1.0.0-beta7`]

## org.eclipse.jetty.server

1. `de.acosix.alfresco.transform:de.acosix.alfresco.transform.base`  -> [`0.1.0`]
1. `de.acosix.alfresco.transform:de.acosix.alfresco.transform.onlyoffice`  -> [`0.1.0`]
1. `org.eclipse.jetty:jetty-server` 🧩 -> [`10.0.0-alpha0`, `10.0.0.alpha1`, `10.0.0.alpha2`, `10.0.0.beta0`, `11.0.0-alpha0`, `11.0.0.beta1`, `11.0.0.beta2`, `11.0.0.beta3`, `11.0.0`, `11.0.1`, `11.0.2`]

## org.eclipse.osgi

1. `io.github.phillima:asniffer`  -> [`2.4.1`, `2.4.2`]
1. `org.codehaus.groovy:groovy-eclipse-batch`  -> [`3.0.7-03`, `3.0.8-01`]
1. `org.eclipse.platform:org.eclipse.osgi`  -> [`3.16.200`]

## org.graalvm.truffle

1. `org.graalvm.truffle:truffle-api` 🧩 -> [`19.3.0`, `19.3.0.2`, `19.3.1`, `20.0.0`, `20.1.0`, `20.2.0`, `20.3.0`, `21.0.0`, `21.0.0.2`, `21.1.0`]
1. `org.noear:luffy.executor.s.graaljs`  -> [`1.0`]
1. `org.noear:solonjt.executor.s.graaljs`  -> [`1.0.4.4`, `1.0.4.7`]

## org.jruby.joni

1. `com.github.cukedoctor:cukedoctor-main`  -> [`2.0`, `2.1`, `3.0`]
1. `net.thisptr:jackson-jq-cli`  -> [`0.0.10`]
1. `org.jruby.joni:joni` 🧩 -> [`2.1.20`, `2.1.21`, `2.1.23`, `2.1.24`, `2.1.25`, `2.1.26`, `2.1.27`, `2.1.28`, `2.1.29`, `2.1.30`, `2.1.31`, `2.1.32`, `2.1.33`, `2.1.34`, `2.1.35`, `2.1.36`, `2.1.37`, `2.1.38`, `2.1.39`, `2.1.40`, `2.1.41`]

## org.junit.vintage.engine

1. `org.eclipse.tycho:org.eclipse.tycho.surefire.junit55`  -> [`1.7.0`, `2.0.0`, `2.1.0`, `2.2.0`, `2.3.0`]
1. `org.eclipse.tycho:org.eclipse.tycho.surefire.junit56`  -> [`1.7.0`]
1. `org.junit.vintage:junit-vintage-engine` 🧩 -> [`5.5.0-RC1`, `5.5.0-RC2`, `5.5.0`, `5.5.1`, `5.5.2`, `5.6.0-M1`, `5.6.0-RC1`, `5.6.0`, `5.6.1`, `5.6.2`, `5.7.0-M1`, `5.7.0-RC1`, `5.7.0`, `5.7.1`, `5.8.0-M1`]

## org.kordamp.iconli.core

1. `eu.hansolo.fx.regulators:regulators`  -> [`11.0`, `11.2`, `11.5`]
1. `eu.hansolo:regulators`  -> [`11.6`]
1. `org.kordamp.ikonli:ikonli-core`  -> [`11.0.2`, `11.1.0`, `11.2.0`, `11.3.0`, `11.3.1`, `11.3.3`, `11.3.4`, `11.3.5`, `11.4.0`, `11.5.0`]

## org.openqa.selenium.remote

1. `com.infotel.seleniumRobot:core`  -> [`4.4.0`, `4.4.1`, `4.4.2`, `4.4.3`, `4.4.4`, `4.5.0`, `4.5.1`, `4.6.0`, `4.6.1`, `4.6.2`, `4.7.0`, `4.7.1`, `4.7.2`, `4.7.3`, `4.8.0`, `4.8.1`, `4.8.2`, `4.8.3`, `4.8.4`, `4.8.5`, `4.8.6`, `4.8.7`, `4.8.8`, `4.9.0`, `4.9.1`, `4.9.2`, `4.9.3`, `4.10.0`, `4.11.0`, `4.11.1`, `4.11.2`, `4.12.0`, `4.13.0`, `4.13.1`, `4.13.2`, `4.13.3`, `4.14.0`, `4.14.1`, `4.15.0`, `4.15.1`, `4.15.2`, `4.15.3`, `4.16.0`, `4.16.1`, `4.16.2`, `4.17.0`, `4.18.0`, `4.18.1`, `4.18.2`, `4.18.3`, `4.18.4`, `4.18.5`]
1. `io.github.jaqat:remoterobot`  -> [`0.2.1`, `0.2.2`]
1. `org.seleniumhq.selenium:selenium-remote-driver`  -> [`3.14.0`, `3.141.0`, `3.141.5`, `3.141.59`, `4.0.0-alpha-1`, `4.0.0-alpha-2`]

## tm.bitronix.btm

1. `com.guicedee.services:btm`  -> [`0.70.0.1-rc1`, `0.70.0.1-rc2`, `0.70.0.1-rc3`, `0.70.0.1-rc4`, `0.70.0.1-rc5`, `0.70.0.1-rc13`, `0.70.0.1-rc14`, `0.70.0.1-rc15`, `0.70.0.1`, `0.70.0.2`, `0.70.0.3`, `0.70.0.4`, `0.70.0.5`, `0.70.0.6`, `0.70.0.7`, `62`]
1. `com.jwebmp.guicedee.persistence:btm`  -> [`0.67.0.4`, `0.67.0.5`, `0.67.0.7`, `0.67.0.9`, `0.67.0.12`, `0.67.0.15`, `0.67.0.16`, `0.68.0.1`]
1. `com.jwebmp.jre11:btm`  -> [`0.63.0.17`, `0.63.0.19`]
