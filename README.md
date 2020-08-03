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


### Why do you need it.
There are 2 main reasons to get it.
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
* investigate bill
* vpc-to-vpc nat
* route53 resolver (its ip always 10.0.0.2)
* route table propogation
* transit gateway (https://theithollow.com/2018/12/12/setup-aws-transit-gateway)
* client vpn (connect to vpc from you remote laptop) + create association and configure authorization rule + upload keys created locally
you can associate only one subnet per AZ
associating subnet to vpn client endpoint => created eni inside subnet, so that's why from now on it looks like you are accessing all other vpc parts just like you are from inside vpc
downside is that if you see vpc logs, you won't see vpn client ip address (from client CIDR space) you will see it just like some ENI from subnet accesing other subnet resources
different client certificates for different clients
add ec2 security group ssh/icmp from cidr block of client vpn (since you connet to ec2 using client vpn, you will use not your public IP, but one allocated from vpn CIDR block). Source in SG should not be IP address by SG of vpnserver.
* site-to-site vpn (on-premise network imitated by vpc with ec2 and openswan + vpn gateway from vpc side)
* direct connect (https://aws.amazon.com/directconnect/faqs) (direct connection between your ISP and AWS)

-------------------------Advanced------------------------------------------
* create aws microsoft AD and see how it works
* create client vpn with security as microsoft AD
* create custom vpn server in ec2 and try to connect to it (do both use oepnvpn server ami and any ami (OpenVPN Access Server from marketplace which is free tier, in this case you should configure it through browser admin panel) + manually configure openvpn server)
* vpc endpoint service (add ec2 (with basic httpd service)+NLB and share it to vpc from another region)