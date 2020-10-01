# AWS Solutions Architect certification

### Description
Here is my experience for taking [SAA-C02](https://aws.amazon.com/certification/certified-solutions-architect-associate) and [SAP](https://aws.amazon.com/certification/certified-solutions-architect-professional) certification.
You can also take a look at [Available AWS Certifications](https://aws.amazon.com/certification) for complete list of available certifications.
Compare to [java cert](https://github.com/dgaydukov/cert-ocpjp11) where you have to pass associate exam before passing professional, in aws you can 
[directly pass professional without passing associate](https://aws.amazon.com/about-aws/whats-new/2018/10/announcing-more-flexibility-for-aws-certification-exams) 
But since we get 50% discount after success [here](https://aws.amazon.com/certification/benefits) 
and [here](https://aws.amazon.com/about-aws/whats-new/2019/02/new-aws-certification-policies-offer-more-choices-flexibility) and since professional costs twice the associate, whatever pass you take you pay the same amount.
If you go with associate + professional => you pay 150 + 300 with 50% discount (so you will pay only 150 for second exam) = 300 totally. 
If you go straight to professional you just pay 300. But I would encourage you to take both, since during preparation for both of them you will learn a lot of new funny stuff.

### Why do you need it
There are 2 main reasons to get it
1. During preparation you will learn a lot of new stuff
2. It may help your career

### Contents
* [Solutions Architect Tips](https://github.com/dgaydukov/cert-aws-sa/blob/master/files/sa.md)

### Useful Links
* [Mock exam SAA](https://www.whizlabs.com/aws-solutions-architect-associate)
* [Mock exam SAP](https://www.whizlabs.com/aws-solutions-architect-professional)
* [Free SAA questions](https://www.examtopics.com/exams/amazon/aws-certified-solutions-architect-associate-saa-c02)
* [Free SAP questions](https://www.examtopics.com/exams/amazon/aws-certified-solutions-architect-professional)

### TODO
----------------------------------------------------------------------------------------------
* sort out tax / bank address / account termination
----------------------------------------------------------------------------------------------
* print flash documents
* add to cert list https://www.openstack.org/coa & change mongodb cert for amazon database
* rename repo cert-aws-sa => cert-aws
* rename repo how-to-become-a-senior-js-developer => how-to-become-lead-architect
* redo repo into multiple cert repo with each cert with it's own directory. add main readme => explanation cause all certs relate to each other to some degree
* spring5: is it bad if we `http.csrf().disable()` or remove this line (why do we need such a line in the first place => if we don't use it post/put don't work without passing this token)
* spring5: what does it mean `sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)` (why do we need it)
* spring5: @Data on classes that extends each other (cause fileds from base class not in toString)
* spring5: spring & hibernate sharding (https://github.com/apache/shardingsphere)
* spring5: validate cors issue, compare simple vs non-simple requests, check how different headers like `Access-Control-Request-Method/Access-Control-Request-Headers` affect response 
check how cors on spring , why return cors not found instead of desired cors. 
withCredentials doesn't allow * as allowed_origin
test in firefox => it shows pre-flight OPTIONS request
* spring5: if SqsMessageDeletionPolicy.NO_REDRIVE remove message on success (without manual message deletion)
* https://docs.aws.amazon.com/managed-blockchain/latest/managementguide/network-components.html
* cf use mappings inside template
* kubelet vs kubectl
* https://docs.aws.amazon.com/eks/latest/userguide/getting-started.html
* does eks use the same vpc or create new and add vpc endpoint kuber eni into your vpc
* add secondary ip ranges to vpc (not directly related to eks, but can be useful => eks would use ip from these new range and won't drain your private ip addresses)
* ec2 instance assume role from another account
* add custom health check to elb
* use AWS::AutoScalingPlans::ScalingPlan to create asg based on predictive scaling (https://docs.aws.amazon.com/autoscaling/plans/userguide/what-is-aws-auto-scaling.html)
* add elb to 2 vpc (load traffic between 2 vpc)
* api gateway add cors example (both simple & non-simple) + add multiple cors headers
* add HealthCheck to elb + default ec2 healthcheck from asg (https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html)
* add vpc to `cloudformation/ec2-cw-recover-alarm.yml` (in case you run it in region where no default vpc)
* edit all current cf templates => rewrite efs from default SG to custom (cause it's better to explicitly control SG)
* edit all current cf templates => add SG to RDS with source as SG of webserver
* cf template that trigger lambda every 5 sec, and lambda check liveliness of ec2 (go to ec2 turn off httpd and see that logs are written to cloudwatch) + create alarm on error (more than 2 times send sns email)
+ add cloudwatch event (rule, source - aws.ec2, detailtype-runinstances) when new ec2 started and add tag owner with lambda inside vpc
* Create cf template with redis cache and ec2 to connect to this cache (SG with clientSG that attached to desired ec2)
```
sudo yum -y install --enablerepo=epel redis
redis-cli -h redis_ip_address
SET mykey myvalue
# store data with ttl of 5 seconds (after expired key would be null)
SET mykey myvalue EX 5
```
* try glacier select to csv archive
* add cf template for iam database authentication (then go to public ec2 and try to access db with both regular username/password and iam token)
* create cf template with dynamodb vpc endpoint and access dynamodb from ec2 in private subnet (add auto scaling to dynamoDb)
* rewrite template comments to multi-line description https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-description-structure.html
* connect 2 vpc with privatelink (access ec2 from one vpc from another)
* ELB access logs store to s3 => trigger lambda to process logs and put them into elasticsearch
* Create AWS::CloudWatch::Alarm and recover instance in case it stopped or port 80 not responding (find some standard cloudwatch metric for this, take template as base `cloudformation/ec2-cw-recover-alarm.yml`)
+ add alarm to send email in case of failure
+ add elb health check with
```
TargetGroup:
    Type: AWS::ElasticLoadBalancingV2::TargetGroup
    Properties:
    HealthCheckIntervalSeconds: 10
    HealthCheckProtocol: HTTP
    HealthCheckPath: /index.html
    HealthCheckTimeoutSeconds: 5
    HealthyThresholdCount: 3
    UnhealthyThresholdCount: 2
    Matcher:
        HttpCode: 200-299
```
* create custom vpn server in ec2 and try to connect to it (do both use oepnvpn server ami and any ami (OpenVPN Access Server from marketplace which is free tier, in this case you should configure it through browser admin panel) + manually configure openvpn server)
* vpc endpoint service (add ec2 (with basic httpd service)+NLB and share it to vpc from another region)
* route 53 resolver
* ecs + alb with dynamic port mapping
* create elb with eks with several apps deployed there, and use elb path routing to route to eks nodeport. So we have single elb and multiple microservices in eks and all works (internal pathes not exposed by elb, and can be accessed only inside eks cluster)
* sas vs sns on calling lambda when new message arrived
* s3 call lambda(custom api) when file is updated
* elb logs to s3
* asg with both on-demand and spot instances (when no spot avaialbe run on-demand)
* authenticate user on elb level using cognito
* elb to ec2 using https (https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/configuring-https-endtoend.html). By default elb terminate https traffic and forward to ec2 just http, since it's inside aws and can't be listened by anybody.
* add cross-account access to s3
* create codepipeline with cf template and use codedeploy/beanstalk as deploy stage (compare them)
* what is stronger bucket policy or acl
* iam policy with mfa condition to delete objects from s3
* add extensive comments to all cf templates
* transit gateway - add on-premise network imitated by third vpc (https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html - guide to add on-premise, https://theithollow.com/2018/12/12/setup-aws-transit-gateway)
* put spring app into ECS and EKS and compare the difference (try fargate too). Try auto scaling in eks/ecs
* Try maximum automate site-to-site vpn cloudformation template (try to extract somehow all IP addresses and PSK secret string and put it into ec2 userdata for VpnServer)
* Try some other vpn server in on-premise site of site-to-site vpn
* Install ec2 with openswan and use it as personal vpn server
* Try Athena & Aws Glue with cloudformation/cloudtrail-s3.yml (combine all json files into one. Find who put object into s3)
* aws config CF template (check that ec2 is of specific type and alert when type has been changed)
* Kinesis firehose real example (with cf template)
* enable connection draining and see how it works when you de-register instance or it failed
* create private hosted zone, see how it all works
* create both memcached/redis elasticache endgine and check how do they work (add snapshot to redis and recover from snapshot to new cluster, add redis replication group)
* cloudfront vs global accelerator for speed up of requests
* create data pipeline to ELT from rds to s3
* create cf template with aws config and see how you can manage config change (add config rule)
* add `AWS::RDS::DBSecurityGroup` to rds
* use ssl encryption with talking with rds mysql server
* create kms and encrypt someting with it
* create cloudsearch/elasticsearch clusters and try to put logs from ec2 there
* create dynamodb lsi & gsi and compare them
* try emr on t2 (with different engines hive/hbase/presto/spark)
* migrate rds into s3 using dms
* create data lake with lake formation
* request and run spot fleet
* use spot instance to handle sqs, when get termination notification, stop requesting new messages from queue, finish processing remaining messages and quit
* create sqs queue and spot fleet that monitory queue, run spot fleet based on queue load, shut down fleet if queue is empty
* redshift enhanced vpc routing (send data inside vpc between redhshift & s3 and view vpc flow logs)
* configure alarm to start instance if it was stopped `cloudformation/ec2-cw-state-change.yml` + use lambda to store it in dynamodb
* signin with userpool/identitypool (is signin the same or not)
* deploy datasync agent on ec2 and imitate data transfer to s3
* create transfer family server endpoint ftps/sftp and transfer files to s3
* create cognito identity with cognito user pool and other social providers (use basic java app to test it). Looks like cognito identity doesn't have it's own credentials but use credentials from IdP (https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html)
* create vpc link and connect http api to ec2 in private subnet
* trigger lambda when dynamodb change happend with dynamodb streams
* Create custom cloudwatch metric and alarm based on this metric
* Create lambda and cloudwatch rule to run lambda every minute (scheduled lambda)
* Create auto-scale group with ec2 httpd (but store data in efs, this would guarantee that if instance launched in another AZ data won't be lost)
* Add do sleep while enf not enabled (instead of just sleep for 10 sec) to all cloudformation templates that use efs
* Create auto-scale group with single ec2 and eip and after terminate associate same eip to new ec2 (in launch config userdata add ability to associate eip to current ec2 + you need role for ec2 to be able to associate eip to itself)
* Simple elb with 2 ec2 from 2 private subnets (use nat gateway to install httpd) https://stackoverflow.com/questions/22541895/amazon-elb-for-ec2-instances-in-private-subnet-in-vpc
* Rewrite cf templates random httpd to display privateIP
* Add auto-scaling example for specific time range with `AWS::AutoScaling::ScheduledAction`
+ add based on number of messages in sqs
* cloudformation template iam create identity provider with both saml & openId connect, and with cognito/aws AD (by the way learn how AD works internally)
* try to create aws sso user with permission set and add 1 free app, and then try to login to both aws console & this app
* Create vpc with custom DHCP options set and create ec2 instance and see it private/public domain name
* Deploy java app using opsworks stacks
* create aws microsoft AD and see how it works + add aws sso with this ad
* create iam identity federation with this AD and with Cognito
* ClientVPN with security as microsoft AD
* ClientVPN add nat instance so internet would work without tunnel split (yet check it also with tunnel split, and your IP would be different)
* create template with both cloudwatch & aws budget cost alarms (when your usage above 1$ and 5$)
* create site-to-site vpn with 2 locations so each of this can communicate with each other using VPN CloudHub (each location is imitated by separate vpc)
* solve final test for saa