# AWS Solutions Architect certification

### Description
Here is my experience of taking 2 certifications, both associate & professional:
* [SAA-C02](https://aws.amazon.com/certification/certified-solutions-architect-associate)
* [SAP-C01](https://aws.amazon.com/certification/certified-solutions-architect-professional)

### Contents
* [Solutions Architect Tips](https://github.com/dgaydukov/cert-aws/blob/master/sa/files/sa.md)

### Useful Links
* [Mock exam SAA](https://www.whizlabs.com/aws-solutions-architect-associate)
* [Mock exam SAP](https://www.whizlabs.com/aws-solutions-architect-professional)
* [Free SAA questions](https://www.examtopics.com/exams/amazon/aws-certified-solutions-architect-associate-saa-c02)
* [Free SAP questions](https://www.examtopics.com/exams/amazon/aws-certified-solutions-architect-professional)

### TODO
add all certs & all documents with passing score into single folder
-----------------------------------------------------------------------------------------------------------------------
https://en.wikipedia.org/wiki/The_Laundromat_(film)
concurrentskiplistmap vs concurrenthashmap vs treemap
https://blogs.oracle.com/javamagazine/creating-a-java-off-heap-in-memory-database
check hibernate @Version (so read+write becomes atomic, and we can use db row locking) => solve race condition
synchronized on string java (is it anti-pattern)
java memory model - metaspace
move to guice for dependency injection
dependency injection works on load time or runtime
oracle partition
julu/jing low latency jdk
weakhashmap vs hashmap
bytebuffer vs byte[]
http://java-performance.info/hashmap-overview-jdk-fastutil-goldman-sachs-hppc-koloboke-trove-january-2015/
https://github.com/leventov/Koloboke
netty io (does it have lmax disruptor inside)
chronicle queue (is it same package as chorinicle map)
https://www.youtube.com/watch?v=-w6duQhWuVk
https://coingeek.com/bittrex-to-delist-privacy-coins-monero-zcash-and-dash
https://www.youtube.com/watch?v=UpeV4OqB6Us
aws reinvent CodeStar
https://sleek.com/hk/resources/offshore-companys-guide-to-tax-exemption-in-hong-kong (offshore company, no tax)
https://en.wikipedia.org/wiki/The_Picture_of_Dorian_Gray
https://www.youtube.com/watch?v=YVbdd8oOwOY
https://en.wikipedia.org/wiki/Mad_Max_Beyond_Thunderdome
https://en.wikipedia.org/wiki/Brotherhood_of_the_Wolf
https://en.wikipedia.org/wiki/Crying_Freeman_(film)
https://en.wikipedia.org/wiki/Groundhog_Day_(film)
https://en.wikipedia.org/wiki/The_Notebook (movie)
https://en.wikipedia.org/wiki/Unsane
https://en.wikipedia.org/wiki/500_Days_of_Summer
how lmax disruptor multi-cast works
check all the test for lamx disruptor (https://github.com/LMAX-Exchange/disruptor/tree/master/src/test/java/com/lmax/disruptor)
fix gradle project in intellij
enable AspectJ proxy mode for the @EnableAsync and provide a weaver (so you can call `@Async` from same class)
run .war project in intellij + run `javax.websocket` there
kafka poll wait for specified timeout (don't return even if there are already messages)
kafka cluster docker example
spring + hibernate sharding (https://docs.jboss.org/hibernate/shards/3.0/reference/en/html_single)
https://www.youtube.com/watch?v=CnRtbtis79U (Алексей Шипилёв — Shenandoah: сборщик мусора, который смог)
https://www.youtube.com/watch?v=iGRfyhE02lA (Владимир Иванов — G1 Garbage Collector)
https://www.youtube.com/watch?v=c1jVn5Sm8Uw (Алексей Шипилёв – Shenandoah GC 2.0)
https://www.youtube.com/watch?v=iB2N8aqwtxc (Алексей Шипилёв — Прагматика Java Memory Model)
https://real-logic.co.uk/about.html (videos by Martin Thompson)
https://mechanical-sympathy.blogspot.com
http://concurrencyfreaks.blogspot.com
http://bad-concurrency.blogspot.com
https://www.infoq.com/presentations/mechanical-sympathy
https://www.infoq.com/profile/Martin-Thompson
The Art of Multiprocessor Programming
Play Framework vs google guice vs spring
jooq vs hibernate
hibernate second level cache (how cache system works)
https://github.com/real-logic/aeron/tree/master/aeron-cluster
https://www.youtube.com/watch?v=FL7_lxJbX0o (Иван Землянский — Аерон. High performance-транспорт для low latency-микросервисов)
https://www.youtube.com/watch?v=lgyO9C9zdrg (Whats New in Spring Boot 2 4)
https://www.kaggle.com
https://www.youtube.com/watch?v=5wMAPUrd0ag
https://www.youtube.com/watch?v=o6u_Od27IFw
https://habr.com/ru/news/t/484264
-----------------------------------------------------------------------------------------------------------------------
add sites that helped to prepare to cert for java/spring/aws
убрать папку со стола с бумагами
print all certs with details & marks
move all java stuff into data analytics
remove security folder - have 1 for sa & security specialty
move all security services (iam/cognito/active_directory/ACM/kms/cloudhsm/inspector/macie/guardduty/waf/config/cloudtrail/artifact/RAM/security_hub         ) into fourth content type (call them security aws services)
add all java-low-latency tasks here and do them after security exam
cloudhsm to offload ssl/tls
cloudhsm encrypt oracle with transparent data encryption
https://www.youtube.com/watch?v=-ObImxw1PmI
we use symmetric encryption for s3 (envelope encyrption) cause it just faster than assymetric - also note that s3 doing all encryption, kms only encrypt/decrypt data key
this is due since kms run cloudhsm, it doesn't give master key, instead other service need to send chunk of data to kms, so kms would encrypt/decrypt it. That's why kms can encrypt only up to 4KB, cause sending gigabytes to kms just unfesable
kms runs cloudhsm behind the scene
aws reinforce talk
https://aws.amazon.com/macie/faq/
cross region s3 replication for encrypted bucket
https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html
elb to ec2 end-to-end https connection
get access to aws console/services through: iam+google vs cognito+google
why s3 static site not encrypted (it doesn't use https)
secrets manager for rds/redshift
cloudformation cfn-init (call ec2 instances)
scan other wifi
habr - articles about security
read nmap book
how system manager connect to ec2 (does it use ssh, what if ssh disabled? what if you disalbe any network access using iptables or firewall, will SM be able to connect)?
* connect 2 vpc with privatelink (access ec2 from one vpc from another)
* create vpc link and connect http api to ec2 in private subnet
* create custom vpn server in ec2 and try to connect to it (do both use oepnvpn server ami and any ami (OpenVPN Access Server from marketplace which is free tier, in this case you should configure it through browser admin panel) + manually configure openvpn server)
* vpc endpoint service (add ec2 (with basic httpd service)+NLB and share it to vpc from another region)
* create cognito identity with cognito user pool and other social providers (use basic java app to test it). Looks like cognito identity doesn't have it's own credentials but use credentials from IdP (https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html)
* redshift enhanced vpc routing (send data inside vpc between redhshift & s3 and view vpc flow logs)
* create cf template with dynamodb vpc endpoint and access dynamodb from ec2 in private subnet (add auto scaling to dynamoDb)
* create dynamodb lsi & gsi and compare them
* trigger lambda when dynamodb change happend with dynamodb streams (https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html)
* create codepipeline with cf template and use codedeploy/beanstalk as deploy stage (compare them) + create ci/ci pipeline use codestar
* transit gateway - add on-premise network imitated by third vpc (https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html - guide to add on-premise, https://theithollow.com/2018/12/12/setup-aws-transit-gateway)
* ecs + elb with dynamic port mapping (sa/cloudformation/ecs-elb.yml) + add fargate launch type
* eks + elb with elb path routing to route to eks nodeport
* Deploy spring app into ECS and EKS and compare the difference (try fargate too). Try auto scaling in eks/ecs
* Deploy spring app using opsworks stacks (take a look at https://docs.aws.amazon.com/opsworks/latest/userguide/gettingstarted-linux.html). Try to run 2 ec2 and update their ami without affecting performance
* Try maximum automate site-to-site vpn cloudformation template (try to extract somehow all IP addresses and PSK secret string and put it into ec2 userdata for VpnServer)
* Install ec2 with openswan and use it as personal vpn server
* create glue workflow `AWS::Glue::Workflow` and call aws batch when etl complete
* migrate rds to s3 using glue etl (https://aws.amazon.com/blogs/database/how-to-extract-transform-and-load-data-for-analytic-processing-using-aws-glue-part-2)
* Try Athena & Aws Glue with cloudformation/cloudtrail-s3.yml (combine all json files into one. Find who put object into s3)
* athena federated query (from multiple sources). ELT using athena federated (read from multiple sources and store in s3)
* glue etl job vs athena etl job vs athena udf
* create cloudsearch/elasticsearch clusters and try to put logs from ec2 there
* try emr on t2 (with different engines hive/hbase/presto/spark)
* deploy datasync agent on ec2 and imitate data transfer to s3
* try to create aws sso user with permission set and add 1 free app, and then try to login to both aws console & this app
* create vpc with custom DHCP options set and create ec2 instance and see it private/public domain name
* create aws microsoft AD and see how it works + add aws sso with this ad + use ADFS to add AD to iam as identity provider and assume role (so you can access aws without iam user). cf template iam create identity provider with both saml & openId connect, and with cognito/aws AD (by the way learn how AD works internally)
* create iam identity federation with this AD and with Cognito
* ClientVPN with security as microsoft AD
* ClientVPN add nat instance so internet would work without tunnel split (yet check it also with tunnel split, and your IP would be different)
* create site-to-site vpn with 2 locations so each of this can communicate with each other using VPN CloudHub (each location is imitated by separate vpc)
* use kinesis sdk and try java data streaming. In all example firehose consume data from data streams, but can we directly send data to it without data streams?
* kinesis firehose real example (with cf template)
* Github Project: add logic to `sa/cloudformation/custom-resource/handler.yml` to update `ResponseURL` (pre-sign s3 url)
* Github Project: add resource handler to validate ACM Certificate, so you can automate `sa/cloudformation/elb-asg-route53-acm.yml` template, no more need to manually update route53 record
* Github Project: use spot instance to handle sqs, use `AWS::Events::Rule` to catch termination notice and put message into second queue. Monitor second queue, when instance would be stopped - stop requesting new messages from queue, finish processing remaining messages and quit
* Github Project: create asg based on sqs queue size using custom metric backlogPerInstance (https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html). Create same but using spot fleet instead of asg (https://aws.amazon.com/blogs/compute/dynamic-scaling-with-ec2-spot-fleet)``