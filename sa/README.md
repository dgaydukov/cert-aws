# AWS Solutions Architect & Security Specialty certification

### Description
Here is my experience of taking 3 certifications:
* [SAA-C02](https://aws.amazon.com/certification/certified-solutions-architect-associate)
* [SAP-C01](https://aws.amazon.com/certification/certified-solutions-architect-professional)
* [SCS-C01](https://aws.amazon.com/certification/certified-security-specialty)
All 3 are in same document, cause security tightly related to all other services. So you can use this guide to prepare to either solutions architect exam or security specialty exam.
Personally I would advise going to solutions architect first (both associate & pro), cause it would give you deep understanding of how cloud works.
So my roadmap is SAA => SAP => Security. I think it would be useful to pass professional first, cause again you would have deep understanding of how cloud works under-the-hood. 
Associate tier give you just superficial knowledge, you would just know that some services exists and what they do. Professional on the other hand will give you deep insight into each service, of what they do, and most importantly why they do it this way.
In real exam I didn't meet any questions regarding `Rekognition`, but there are few in whizlabs mock exams. So I think due to ML exam all ML related questions are moved there. Yet it can still be useful to learn few ML services when you prepare for SAP exam.

### Contents
* [Solutions Architect & Security Specialty Tips](https://github.com/dgaydukov/cert-aws/blob/master/sa/files/sa.md)

### Useful Links
* [Mock exam SAA](https://www.whizlabs.com/aws-solutions-architect-associate)
* [Mock exam SAP](https://www.whizlabs.com/aws-solutions-architect-professional)
* [Mock exam SCS](https://www.whizlabs.com/aws-certified-security-specialty)
* [Free questions](https://www.examtopics.com/exams/amazon)

### TODO
https://www.theverge.com/22310188/nft-explainer-what-is-blockchain-crypto-art-faq
nobody trailer
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
* create aws microsoft AD and see how it works + add aws sso with this ad + use ADFS to add AD to iam as identity provider and assume role (so you can access aws without iam user). cf template iam create identity provider with both saml & openId connect, and with cognito/aws AD (by the way learn how AD works internally)
* create iam identity federation with this AD and with Cognito
* clientVPN with security as microsoft AD
* read nmap book && scan wifi (https://habr.com/ru/post/224955)
* Github Project:
    * add logic to `sa/cloudformation/custom-resource/handler.yml` to update `ResponseURL` (pre-sign s3 url)
    * add resource handler to validate ACM Certificate, so you can automate `sa/cloudformation/elb-asg-route53-acm.yml` template, no more need to manually update route53 record
    * use spot instance to handle sqs, use `AWS::Events::Rule` to catch termination notice and put message into second queue. Monitor second queue, when instance would be stopped - stop requesting new messages from queue, finish processing remaining messages and quit
    * create asg based on sqs queue size using custom metric backlogPerInstance (https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html). Create same but using spot fleet instead of asg (https://aws.amazon.com/blogs/compute/dynamic-scaling-with-ec2-spot-fleet)
    * create elb end-to-end encryption, with nginx on ec2 which offload ssl to cloudHSM