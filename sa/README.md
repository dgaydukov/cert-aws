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
Bit by Bit: An Illustrated History of Computers
Вторжение. Краткая история русских хакеров
Kingpin: How One Hacker Took Over the Billion-Dollar Cybercrime Underground
The Art of Multiprocessor Programming
https://en.wikipedia.org/wiki/Black_Swan_(film)
https://www.youtube.com/watch?v=CnRtbtis79U (Алексей Шипилёв — Shenandoah: сборщик мусора, который смог)
https://www.youtube.com/watch?v=iGRfyhE02lA (Владимир Иванов — G1 Garbage Collector)
https://www.youtube.com/watch?v=c1jVn5Sm8Uw (Алексей Шипилёв – Shenandoah GC 2.0)
https://www.youtube.com/watch?v=iB2N8aqwtxc (Алексей Шипилёв — Прагматика Java Memory Model)
https://www.youtube.com/watch?v=fU9hR3kiOK0 (dynamoDB streams)
https://mechanical-sympathy.blogspot.com
http://concurrencyfreaks.blogspot.com/
https://www.slideshare.net/trishagee/introduction-to-the-disruptor
https://martinfowler.com/articles/lmax.html
https://www.infoq.com/presentations/mechanical-sympathy
https://real-logic.co.uk/about.html (videos by Martin Thompson)
https://www.thorntech.com/2018/09/user-authentication-alb-cognito
----------------------------------------------------------------------------------------------
* add spring websocket broadcast
* try work spring boot with javax.websocket (SpringBootApplication with ServerEndpoint)
* run .war project in intellij
* kafka poll wait for specified timeout (don't return even if there are already messages)
* kafka cluster docker example
----------------------------------------------------------------------------------------------
+ s3 call lambda(custom api) when file is updated
+ ses vs sns on calling lambda when new message arrived
* RDS
+ create data pipeline to ELT from rds to s3
+ create cf template with aws config and see how you can manage config change (add config rule)
+ add `AWS::RDS::DBSecurityGroup` to rds
+ use ssl encryption with talking with rds mysql server
+ migrate rds into s3 using dms
* ELB
+ elb access logs store to s3 => trigger lambda to process logs and put them into elasticsearch
+ elb logs to s3
+ add HealthCheck to elb + default ec2 healthcheck from asg (https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html)
+ add Simple elb with 2 ec2 from 2 private subnets (use nat gateway to install httpd) https://stackoverflow.com/questions/22541895/amazon-elb-for-ec2-instances-in-private-subnet-in-vpc
+ add elb to 2 vpc (load traffic between 2 vpc)
+ elb to ec2 using https (https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/configuring-https-endtoend.html). By default elb terminate https traffic and forward to ec2 just http, since it's inside aws and can't be listened by anybody.
+ create elb with eks with several apps deployed there, and use elb path routing to route to eks nodeport. So we have single elb and multiple microservices in eks and all works (internal paths not exposed by elb, and can be accessed only inside eks cluster)
+ ecs + elb with dynamic port mapping
* try glacier select to csv archive
* add cf template for iam database authentication (then go to public ec2 and try to access db with both regular username/password and iam token)
* create cf template with dynamodb vpc endpoint and access dynamodb from ec2 in private subnet (add auto scaling to dynamoDb)
* connect 2 vpc with privatelink (access ec2 from one vpc from another)
* create custom vpn server in ec2 and try to connect to it (do both use oepnvpn server ami and any ami (OpenVPN Access Server from marketplace which is free tier, in this case you should configure it through browser admin panel) + manually configure openvpn server)
* vpc endpoint service (add ec2 (with basic httpd service)+NLB and share it to vpc from another region)
* route53 resolver
* create cognito identity with cognito user pool and other social providers (use basic java app to test it). Looks like cognito identity doesn't have it's own credentials but use credentials from IdP (https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html)
* add cross-account access to s3
* create codepipeline with cf template and use codedeploy/beanstalk as deploy stage (compare them)
* what is stronger bucket policy or acl (it should be that explicit deny always overwrites allow)
* iam policy with mfa condition to delete objects from s3
* transit gateway - add on-premise network imitated by third vpc (https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html - guide to add on-premise, https://theithollow.com/2018/12/12/setup-aws-transit-gateway)
* put spring app into ECS and EKS and compare the difference (try fargate too). Try auto scaling in eks/ecs
* Try maximum automate site-to-site vpn cloudformation template (try to extract somehow all IP addresses and PSK secret string and put it into ec2 userdata for VpnServer)
* Try some other vpn server in on-premise site of site-to-site vpn
* Install ec2 with openswan and use it as personal vpn server
* Try Athena & Aws Glue with cloudformation/cloudtrail-s3.yml (combine all json files into one. Find who put object into s3)
* athena federated query (from multiple sources). ELT using athena federated (read from multiple sources and store in s3)
* glue etl job vs athena etl job vs athena udf
* aws config cf template (check that ec2 is of specific type and alert when type has been changed)
* kinesis firehose real example (with cf template)
* enable connection draining and see how it works when you de-register instance or it failed
* create private hosted zone, see how it all works
* create kms and encrypt someting with it
* create cloudsearch/elasticsearch clusters and try to put logs from ec2 there
* create dynamodb lsi & gsi and compare them
* try emr on t2 (with different engines hive/hbase/presto/spark)
* create data lake with lake formation
* redshift enhanced vpc routing (send data inside vpc between redhshift & s3 and view vpc flow logs)
* configure alarm to start instance if it was stopped `cloudformation/ec2-cw-state-change.yml` + use lambda to store it in dynamodb
* deploy datasync agent on ec2 and imitate data transfer to s3
* create transfer family server endpoint ftps/sftp and transfer files to s3
* create vpc link and connect http api to ec2 in private subnet
* trigger lambda when dynamodb change happend with dynamodb streams
* create auto-scale group with ec2 httpd (but store data in efs, this would guarantee that if instance launched in another AZ data won't be lost)
* create auto-scale group with single ec2 and eip and after terminate associate same eip to new ec2 (in launch config userdata add ability to associate eip to current ec2 + you need role for ec2 to be able to associate eip to itself)
* try to create aws sso user with permission set and add 1 free app, and then try to login to both aws console & this app
* create vpc with custom DHCP options set and create ec2 instance and see it private/public domain name
* Deploy java app using opsworks stacks
* create aws microsoft AD and see how it works + add aws sso with this ad + use ADFS to add AD to iam as identity provider and assume role (so you can access aws without iam user). cf template iam create identity provider with both saml & openId connect, and with cognito/aws AD (by the way learn how AD works internally)
* create iam identity federation with this AD and with Cognito
* ClientVPN with security as microsoft AD
* ClientVPN add nat instance so internet would work without tunnel split (yet check it also with tunnel split, and your IP would be different)
* create site-to-site vpn with 2 locations so each of this can communicate with each other using VPN CloudHub (each location is imitated by separate vpc)
* use kinesis sdk and try java data streaming. In all example firehose consume data from data streams, but can we directly send dota to it without data streams?
* solve final test for saa
* Github Project: add logic to `sa/cloudformation/custom-resource/handler.yml` to update `ResponseURL` (pre-sign s3 url)
* Github Project: add resource handler to validate ACM Certificate, so you can automate `sa/cloudformation/elb-asg-route53-acm.yml` template, no more need to manually update route53 record
* Github Project: use spot instance to handle sqs, use `AWS::Events::Rule` to catch termination notice and put message into second queue. Monitor second queue, when instance would be stopped - stop requesting new messages from queue, finish processing remaining messages and quit
* Github Project: create asg based on sqs queue size using custom metric backlogPerInstance (https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html). Create same but using spot fleet instead of asg (https://aws.amazon.com/blogs/compute/dynamic-scaling-with-ec2-spot-fleet)