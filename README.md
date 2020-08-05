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
* client vpn (connect to vpc from you remote laptop) + create association and configure authorization rule + upload keys created locally + check split tunneling (when turned on internet should go without vpn => check by IP address)
+ add cert manager to cloudformation => https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html
generate key https://github.com/OpenVPN/easy-rsa 
chain - ca.crt file
- add different domain to client & server
- cert file - .crt file
- add authorization rule (destination - cidr of vpc)
- add routes for other vpc (if you have peered vpc you should add route)
```
./easyrsa init-pki
./easyrsa build-ca nopass
# build client and server certificate
```
* site-to-site vpn (on-premise network imitated by vpc with ec2 and openswan + vpn gateway from aws side)
- openswan doesn't support 2-tunnel vpn (try other vpn servers instead of swan like openvpn)
- CGW static-vs-dynamic routing
-------------------------Advanced------------------------------------------
* create aws microsoft AD and see how it works
* create client vpn with security as microsoft AD
* create custom vpn server in ec2 and try to connect to it (do both use oepnvpn server ami and any ami (OpenVPN Access Server from marketplace which is free tier, in this case you should configure it through browser admin panel) + manually configure openvpn server)
* vpc endpoint service (add ec2 (with basic httpd service)+NLB and share it to vpc from another region)
* route 53 resolver
* transit gateway - add on-premise network imitated by third vpc
https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html - guide to add on-premise
https://theithollow.com/2018/12/12/setup-aws-transit-gateway
* put spring app into ECS and EKS and compare the difference (try fargate too)