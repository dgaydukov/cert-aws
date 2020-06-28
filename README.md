# AWS Solutions Architect certification


### Description
Here is my experience for taking [SAA-C02](https://aws.amazon.com/certification/certified-solutions-architect-associate) and [SAP](https://aws.amazon.com/certification/certified-solutions-architect-professional) certification.
You can also take a look at [Available AWS Certifications](https://aws.amazon.com/certification) for complete list of available certifications.
Compare to [java cert](https://github.com/dgaydukov/cert-ocpjp11) where you have to pass associate exam before passing professional, in aws you can 
[directly pass professional without passing associate](https://aws.amazon.com/about-aws/whats-new/2018/10/announcing-more-flexibility-for-aws-certification-exams) 
But since we get 50% discount after success [here](https://aws.amazon.com/certification/benefits/) 
and [here](https://aws.amazon.com/about-aws/whats-new/2019/02/new-aws-certification-policies-offer-more-choices-flexibility/) and since professional costs twice the associate, whatever pass you take you pay the same amount.
If you go with associate + professional => you pay 150 + 300 with 50% discount (so you will pay only 150 for second exam) = 300 totally. 
If you go straight to professional you just pay 300. But I would encourage you to take both, since during preparation for both of them you will learn a lot of new funny stuff.


### Why do you need it.
There are 2 main reasons to get it.
1. During preparation you will learn a lot of new stuff
2. It may help your career


### Contents
* [Solutions Architect Tips](https://github.com/dgaydukov/cert-aws-sa/blob/master/files/sa.md)


### Useful Links
* [Mock exam SAA](https://www.whizlabs.com/aws-solutions-architect-associate)
* [Mock exam SAP](https://www.whizlabs.com/aws-solutions-architect-professional)
* [Udemy Jon Bonso's exam](https://www.udemy.com/course/aws-certified-solutions-architect-associate-amazon-practice-exams-saa-c02/)
* [AWS Well-Architected](https://aws.amazon.com/architecture/well-architected/) - read all whitepapers here
* [SAP Exam Learning Path](https://jayendrapatil.com/aws-certified-solution-architect-professional-exam-learning-path/)
* Read all FAQ & user guide for every AWS service


### TODO
* add trading/prolog cert to a list
* can we start terminated ec2 (until it dissapered from list)
* create ec2 with instance volume only (without ebs)
* SG anywhere vs custom
* ssl vs tls
* session manager login not as user (ec2 role ssm)
* why stop ec2 long, but reboot - fast
* use efs with militple ec2 (install sudo yum -y install nfs-utils)
* ec2/elb healthcheck based on json value (status: up)
* https://aws.amazon.com/ec2/autoscaling/faqs/, scaling out/in/up - differences, asg vs elb
* curl http://ip_address/latest/userdata (get userdata from ec2)
* curl http://ip_address/latest/metadata (get ec2 metadata)
* https://aws.amazon.com/certificate-manager/faqs/
* rename all amazon=>aws titles in sa.md
* https://aws.amazon.com/cloud9/faqs/
* https://aws.amazon.com/rekognition/faqs/
* cloudformation divide vpc and nat (using nested stacks)
* turn on vpc/subnet/eni flow logs and view it
* create new NACL group (VPC=>Security=>Network ACLs) for public subnet (deny ssh in case someone misconfigure SG)
subnet can be associated with 1 NACL at a time
* cloudformation with s3 policies
* autoIP use subnet setting (enable) vs enable
* run ec2 without ebs
* snapshot-vs-ami for cross-region ec2 relocation
ami = snapshot + ec2 settings (launch permissions, ebs mapping)
* create nat-instance (main idea is for customizing nat, cause nat gateway is managed by aws). Comunity=>nat (select first ami), or configure your nat from scratch. 
Disable source/dest check. Add nat instance and nat gateway into separate cloudformation templates and call them from bastion
https://www.theguild.nl/cost-saving-with-nat-instances/
https://www.karlrupp.net/en/computer/nat_tutorial
* ec2 with public ip => reboot => check ip change. Use elastic ip (it should stay the same). Don't forget to remove after terminate ec2.
* vpc endpoint (access s3 from private ec2 that's not connected to nat gateway, with public https url -> aws will determine that you are using endpoint and will direct your traffic)
* elb with auto-scaling group
* route53 failover
* cross-region vpc peering
* vpc to on-premise (imitated by vpc + openswan) vpn connection (site-to-site vpn)
* rds read replica (cross-region) vs multi-az failover
* can you see building blocks (ec2/rds/elb) when using beanstalk
* cognito + api gateway + s3 serverless app (call cognito from java code from local machine vs from ec2)
* register domain on hostgator/godaddy/aws => check it on https://whois.net/. route53 -> register domain
* add free aws certificate to your domain
* vpc endpoint vs private link
* vpc endpoint gateway vs interface (for interface you need ENI)
* transit vpc
* vpc peering (non-transitive)
* transit gateway (connect multiple vpc to each other)
* client vpn (connect to vpc from you remote laptop)
* site-to-site vpn
* direct connect
* close some url pattern (/internal) on elb level (by SG, allow only from inside vpc)