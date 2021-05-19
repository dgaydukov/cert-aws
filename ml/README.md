# AWS Big Data & Machine Learning certification

### Description
Here is my experience of taking machine learning specialty exam
* [MLS-C01](https://aws.amazon.com/certification/certified-machine-learning-specialty)
For ML we use separate file, cause Solutions Architect (both associate & pro) don't cover ML at all. There are a few questions about Polly in associate exam and some regarding Rekognition in professional. 
Other then that, ML is not covered by that exam, that's why we create separate folder & tips file for ML.
You can use this document to pass one of thee:
* aws big data specialty (deprecated & currently unavailable)
* aws data analytics specialty
* aws machine learning specialty
Bug again although you can take one of these 3 straight away, I would strongly encourage you to take SAA & SAP first. These 2 will give you deep understanding of what is cloud & how it works.
So if you data scientist or ML expert you should take at least SAA, but if you want more, take both, and then you can dive into any other certs.

### Contents
* [Big Data & Machine Learning Tips](https://github.com/dgaydukov/cert-aws/blob/master/ml/files/ml.md)

### Useful Links
* [Mock exam ML](https://www.whizlabs.com/aws-certified-machine-learning-specialty)
* [Free ML questions](https://www.examtopics.com/exams/amazon/aws-certified-machine-learning-specialty)

### TODO
* spring
    * kafka (since kafka is third-party it's better kafka topic to be under spring project)
        * https://docs.confluent.io/platform/current/schema-registry/index.html
        * kafka poll wait for specified timeout (don't return even if there are already messages)
        * kafka cluster docker example
    * https://www.youtube.com/watch?v=lgyO9C9zdrg (Whats New in Spring Boot 2 4)
    * Play Framework vs google guice vs spring
    * jooq vs hibernate
    * hibernate second level cache (how cache system works)
    * spring + hibernate sharding (https://docs.jboss.org/hibernate/shards/3.0/reference/en/html_single)
    * enable AspectJ proxy mode for the @EnableAsync and provide a weaver (so you can call `@Async` from same class)
    * move to guice for dependency injection (check if guice good for low-latency project if we need only DI)
    * check hibernate @Version (so read+write becomes atomic, and we can use db row locking) => solve race condition
    * sleuth tracing when several microservices call each other
    * log4j file appender log rotation
    * deferred response in spring
    * opentracing with spring (https://github.com/opentracing-contrib/java-spring-jaeger)
* aws
    * finish off `sa/cloudformation/codepipeline.yml` (build artifacts => to s3, and create deployment from s3 to ec2. And then rebuild it to use codepipeline)
    * ecs + elb with dynamic port mapping (sa/cloudformation/ecs-elb.yml) + add fargate launch type
    * eks + elb with elb path routing to route to eks nodeport
    * deploy spring app into ECS and EKS and compare the difference (try fargate too). Try auto scaling in eks/ecs
    * deploy spring app using opsworks stacks (take a look at https://docs.aws.amazon.com/opsworks/latest/userguide/gettingstarted-linux.html). Try to run 2 ec2 and update their ami without affecting performance
    * transit gateway - add on-premise network imitated by third vpc (https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html - guide to add on-premise, https://theithollow.com/2018/12/12/setup-aws-transit-gateway)
    * clientVPN add nat instance so internet would work without tunnel split (yet check it also with tunnel split, and your IP would be different)
    * create custom vpn server in ec2 and try to connect to it (do both use oepnvpn server ami and any ami (OpenVPN Access Server from marketplace which is free tier, in this case you should configure it through browser admin panel) + manually configure openvpn server)
    * create site-to-site vpn with 2 locations so each of this can communicate with each other using VPN CloudHub (each location is imitated by separate vpc)
    * try maximum automate site-to-site vpn cloudformation template (try to extract somehow all IP addresses and PSK secret string and put it into ec2 userdata for VpnServer)
    * try to create aws sso user with permission set and add 1 free app, and then try to login to both aws console & this app
    * create aws microsoft AD and see how it works + add aws sso with this AD + use ADFS to add AD to iam as identity provider and assume role (so you can access aws without iam user). cf template iam create identity provider with both saml & openId connect, and with cognito/aws AD (by the way learn how AD works internally)
    * create iam identity federation with this AD and with Cognito
    * clientVPN with security as microsoft AD
    * read nmap book && scan wifi (https://habr.com/ru/post/224955)
    * Github Project:
        * add logic to `sa/cloudformation/custom-resource/handler.yml` to update `ResponseURL` (pre-sign s3 url)
        * add resource handler to validate ACM Certificate, so you can automate `sa/cloudformation/elb-asg-route53-acm.yml` template, no more need to manually update route53 record
        * use spot instance to handle sqs, use `AWS::Events::Rule` to catch termination notice and put message into second queue. Monitor second queue, when instance would be stopped - stop requesting new messages from queue, finish processing remaining messages and quit
        * create asg based on sqs queue size using custom metric backlogPerInstance (https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html). Create same but using spot fleet instead of asg (https://aws.amazon.com/blogs/compute/dynamic-scaling-with-ec2-spot-fleet)
        * create elb end-to-end encryption, with nginx on ec2 which offload ssl to cloudHSM
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
* The Hundred-Page Machine Learning Book
* create account in https://www.kaggle.com
* https://www.youtube.com/watch?v=5wMAPUrd0ag (Data Science: Kaggle GRANDMASTER in 6 months)
* https://www.youtube.com/watch?v=o6u_Od27IFw (Как выигрывать любые Data Science соревнования)
* https://habr.com/ru/news/t/484264 (Скандал на конкурсе Kaggle)
* https://www.youtube.com/watch?v=PPLop4L2eGk&list=PLLssT5z_DsK-h9vYZkQkYNWcItqhlRJLN (Andrew Ng's Machine Learning Fundamentals course)
-----------------------------------------------------------------------------------------------------------------------
* pass big data cert test first