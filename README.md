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
* https://docs.aws.amazon.com/vpc/latest/userguide/Carrier_Gateway.html
* Identity federation (AD - saml, or social providers - openId connect)
* cloudformation template iam create identity provider'
* https://aws.amazon.com/single-sign-on/faqs/
* rewrite template comments to multi-line description https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-description-structure.html
* https://aws.amazon.com/opsworks/stacks/faqs/ (and how it differ from beanstalk)
-----------------------------------------------Advanced-----------------------------------------------
* create aws microsoft AD and see how it works
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