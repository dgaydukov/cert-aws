# AWS Certified Data Analytics Specialty

### Description
Here is my experience of taking data analytics specialty exam
* [DAS-C01](https://aws.amazon.com/certification/certified-data-analytics-specialty)

### Contents
* [Data Analytics Tips](https://github.com/dgaydukov/cert-aws/blob/master/da/files/da.md)

### Useful Links
* [Mock exam DAS](https://www.whizlabs.com/aws-certified-data-analytics-specialty)
* [Free DAS questions](https://www.examtopics.com/exams/amazon/aws-certified-data-analytics-specialty)

### TODO
* spring
    * https://www.youtube.com/watch?v=lgyO9C9zdrg (Whats New in Spring Boot 2 4)
    * Play Framework vs google guice vs spring
    * jooq vs hibernate
    * hibernate second level cache (how cache system works)
    * spring + hibernate sharding (https://docs.jboss.org/hibernate/shards/3.0/reference/en/html_single)
    * enable AspectJ proxy mode for the @EnableAsync and provide a weaver (so you can call `@Async` from same class)
    * move to guice for dependency injection (check if guice good for low-latency project if we need only DI)
    * check hibernate @Version (so read+write becomes atomic, and we can use db row locking) => solve race condition
    * sleuth tracing when several microservices call each other
* kafka
    * https://docs.confluent.io/platform/current/schema-registry/index.html
    * kafka poll wait for specified timeout (don't return even if there are already messages)
    * kafka cluster docker example
* core java videos
    * compare chronicle-logger vs async log4j with jmh (implement testing like it high-throughput trading system)
    * https://www.youtube.com/watch?v=CnRtbtis79U (Алексей Шипилёв — Shenandoah: сборщик мусора, который смог)
    * https://www.youtube.com/watch?v=iGRfyhE02lA (Владимир Иванов — G1 Garbage Collector)
    * https://www.youtube.com/watch?v=c1jVn5Sm8Uw (Алексей Шипилёв – Shenandoah GC 2.0)
    * https://www.youtube.com/watch?v=iB2N8aqwtxc (Алексей Шипилёв — Прагматика Java Memory Model)
    * https://www.youtube.com/watch?v=FL7_lxJbX0o (Иван Землянский — Аерон. High performance-транспорт для low latency-микросервисов)
    * https://real-logic.co.uk/about.html (videos by Martin Thompson)
    * https://www.infoq.com/presentations/mechanical-sympathy
    * http://www.coralblocks.com/index.php/state-of-the-art-distributed-systems-with-coralmq (sequencer architecture)
* java low latency
    * The Art of Multiprocessor Programming (check both editions)
    * run time DI (spring) vs compile time DI (dagger)
    * java low latency logging (Log4j2 async use lmax disruptor inside)
    * http://java-performance.info/hashmap-overview-jdk-fastutil-goldman-sachs-hppc-koloboke-trove-january-2015 (goldman sachs using https://github.com/leventov/Koloboke as low latency collections)
    * check all the test for lamx disruptor to get real examples of usage (https://github.com/LMAX-Exchange/disruptor/tree/master/src/test/java/com/lmax/disruptor)
    * aeron vs aeron-cluster
    * netty for low latency (how it compares to lmax/aeron)
    * chronicle queue/map (how it works inside)
-----------------------------------------------------------------------------------------------------------------------
* https://javarevisited.blogspot.com/2019/04/top-10-hadoop-tutorials-for-big-data-developers.html
* https://www.youtube.com/watch?v=7Er4oGWpmWs
* Hadoop The Definitive Guide
* Hadoop Application Architectures
* High Performance Spark
* HBase in Action
* https://dev.to/scrummastert/aws-certified-data-analytics-vs-big-data-what-s-the-difference-5aol
* https://dev.to/scrummastert/re-invent-2020-part-ii-data-sessions-reviewed-1n47
-----------------------------------------------------------------------------------------------------------------------
* create cf redshift enhanced vpc routing and send data inside vpc between redhshift & s3 and view vpc flow logs (you have 2 month free trial)
* create redshift data api and compare to standard redshift access
* create glue workflow `AWS::Glue::Workflow` and call aws batch when etl complete
* migrate rds to s3 using glue etl (https://aws.amazon.com/blogs/database/how-to-extract-transform-and-load-data-for-analytic-processing-using-aws-glue-part-2)
* Try Athena & Aws Glue with cloudformation/cloudtrail-s3.yml (combine all json files into one. Find who put object into s3)
* athena federated query (from multiple sources). ELT using athena federated (read from multiple sources and store in s3)
* glue etl job vs athena etl job vs athena udf
* create cloudsearch/elasticsearch clusters and try to put logs from ec2 there
* try emr on t2 (with different engines hive/hbase/presto/spark)
* kinesis firehose real example (with cf template)
* use kinesis sdk and try java data streaming. In all example firehose consume data from data streams, but can we directly send data to it without data streams?