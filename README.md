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
* [Udemy Jon Bonso's exam](https://www.udemy.com/course/aws-certified-solutions-architect-associate-amazon-practice-exams-saa-c02)
* [AWS Well-Architected](https://aws.amazon.com/architecture/well-architected) - read all whitepapers here
* [SAP Exam Learning Path](https://jayendrapatil.com/aws-certified-solution-architect-professional-exam-learning-path)
* Read all FAQ & user guide for every AWS service


### TODO
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
* add cf template for iam database authentication (then go to public ec2 and try to access db with both regular username/password and iam token)
* create cf template with dynamodb vpc endpoint and access dynamodb from ec2 in private subnet (add scaling policy to dynamoDb)
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
* Create custom cloudwatch metric and alarm based on this metric
* Create lambda and cloudwatch rule to run lambda every minute (scheduled lambda)
* Create auto-scale group with ec2 httpd (but store data in efs, this would guarantee that if instance launched in another AZ data won't be lost)
* Add do sleep while enf not enabled (instead of just sleep for 10 sec) to all cloudformation templates that use efs
* Create auto-scale group with single ec2 and eip and after terminate associate same eip to new ec2 (in launch config userdata add ability to associate eip to current ec2 + you need role for ec2 to be able to associate eip to itself)
* Simple elb with 2 ec2 from 2 private subnets (use nat gateway to install httpd)
* Rewrite cf templates random httpd to display privateIP
* Add auto-scaling example for specific time range with `AWS::AutoScaling::ScheduledAction`
+ add based on number of messages in sqs
* cloudformation template iam create identity provider with both saml & openId connect, and with cognito/aws AD (by the way learn how AD works internally)
* try to create aws sso user with permission set and add 1 free app, and then try to login to both aws console & this app
* Create vpc with custom DHCP options set and create ec2 instance and see it private/public domain name
* Deploy java app using opsworks stacks
-----------------------------------------------Advanced-----------------------------------------------
* create aws microsoft AD and see how it works
* create iam identity federation with this AD and with Cognito
* ClientVPN with security as microsoft AD
* ClientVPN add nat instance so internet would work without tunnel split (yet check it also with tunnel split, and your IP would be different)
* create custom vpn server in ec2 and try to connect to it (do both use oepnvpn server ami and any ami (OpenVPN Access Server from marketplace which is free tier, in this case you should configure it through browser admin panel) + manually configure openvpn server)
* vpc endpoint service (add ec2 (with basic httpd service)+NLB and share it to vpc from another region)
* route 53 resolver
* transit gateway - add on-premise network imitated by third vpc (https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html - guide to add on-premise, https://theithollow.com/2018/12/12/setup-aws-transit-gateway)
* put spring app into ECS and EKS and compare the difference (try fargate too)
* Try maximum automate site-to-site vpn cloudformation template (try to extract somehow all IP addresses and PSK secret string and put it into ec2 userdata for VpnServer)
* Try some other vpn server in on-premise site of site-to-site vpn
* Install ec2 with openswan and use it as personal vpn server
* Try Athena & Aws Glue tutorials
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