# Solutions Architect Tips

### Content
1. [Basics](#basics)
* 1.1 [Free Tier & Cost Management](#free-tier--cost-management)
* 1.2 [Region, AZ, Edge Location](#region-az-edge-location)
* 1.3 [AWS Well-Architected Framework](#aws-well-architected-framework)
* 1.4 [What is DevOps](#what-is-devops)
* 1.5 [AWS Tagging](#aws-tagging)
* 1.6 [AWS LoadBalancer vs App LoadBalancer](#aws-loadbalancer-vs-app-loadbalancer)
* 1.7 [Ingress vs Egress](#ingress-vs-egress)
* 1.8 [Bastion vs JumpServer](#bastion-vs-jumpserver)
* 1.9 [Disaster Recovery](#disaster-recovery)
* 1.10 [ENI, ENA, EFA](#eni-ena-efa)
* 1.11 [Shared Responsibility](#shared-responsibility)
* 1.12 [SaaS vs PaaS vs IaaS/IAC](#saas-vs-paas-vs-iaasiac)
* 1.13 [Virtualization and Containerization](#virtualization-and-containerization)
* 1.14 [Pure Serverless](#pure-serverless)
* 1.15 [AMI vs Snapshot](#ami-vs-snapshot)
* 1.16 [AWS CLI](#aws-cli)
* 1.17 [Useful Linux Commands](#useful-linux-commands)
* 1.18 [Redirect 301 vs 302](#redirect-301-vs-302)
* 1.19 [crontab](#crontab)
* 1.20 [MySql Index Design](#mysql-index-design)
2. [Networking](#networking)
* 2.1 [NIC](#nic)
* 2.2 [Hub, Switch, Router](#hub-switch-router)
* 2.3 [Network Topology](#network-topology)
* 2.4 [OSI Network Model](#osi-network-model)
* 2.5 [High Level Protocols](#high-level-protocols)
* 2.6 [Low Level Protocols](#low-level-protocols)
* 2.7 [SOA and CAA](#soa-and-caa)
* 2.8 [SSL vs TLS vs HTTPS](#ssl-vs-tls-vs-https)
* 2.9 [Routing](#routing)
* 2.10 [MTU & Jumbo frame](#mtu--jumbo-frame)
* 2.11 [Nmap](#nmap)
* 2.12 [Stunnel](#stunnel)
* 2.13 [Docker networking & iptables](#docker-networking--iptables)
3. [Services](#services)
* 3.1 [Corretto](#corretto)
* 3.2 [CloudFormation](#CloudFormation)
* 3.3 [IAM](#iam)
* 3.4 [S3](#s3)
* 3.5 [Glacier](#glacier)
* 3.6 [EFS](#efs)
* 3.7 [EBS](#ebs)
* 3.8 [Instance Store](#ec2-instance-store)
* 3.9 [CloudFront](#cloudfront)
* 3.10 [Kinesis](#kinesis)
* 3.10 [Lambda](#lambda)
* 3.11 [Step Functions](#step-functions)
* 3.12 [EMR](#emr)
* 3.13 [Glue](#glue)
* 3.14 [DynamoDB](#dynamodb)
* 3.15 [QuickSight](#quicksight)
* 3.16 [EC2](#ec2)
* 3.17 [Athena](#athena)
* 3.18 [Organizations](#organizations)
* 3.19 [Well-Architected Tool](#well-architected-tool)
* 3.20 [VPC](#vpc)
* 3.21 [Elastic Beanstalk](#elastic-beanstalk)
* 3.22 [DMS](#dms)
* 3.22 [ELB](#elb)
* 3.23 [CloudWatch](#CloudWatch)
* 3.23 [KMS](#kms)
* 3.23 [Route53](#route53)
* 3.24 [RDS](#rds)
* 3.25 [SQS](#sqs)
* 3.26 [API Gateway](#api-gateway)
* 3.26 [Cognito](#cognito)
* 3.27 [CodePipeline(CodeCommit/CodeBuild/CodeDeploy)](#codepipelinecodecommitcodebuildcodedeploy)
* 3.28 [Storage Gateway](#storage-gateway)
* 3.29 [ECS](#ecs)
* 3.30 [EKS](#eks)
* 3.31 [Fargate](#fargate)
* 3.32 [ElastiCache](#elasticache)
* 3.33 [Systems Manager](#systems-manager)
* 3.34 [Config](#config)
* 3.35 [Aurora](#aurora)
* 3.36 [CloudTrail](#cloudtrail)
* 3.37 [Certificate Manager](#certificate-manager)
* 3.38 [Cloud9](#cloud9)
* 3.39 [CodeStar](#codestar)
* 3.40 [Rekognition](#rekognition)
* 3.41 [Global Accelerator](#global-accelerator)
* 3.42 [FSx](#fsx)
* 3.43 [VPN](#vpn)
* 3.44 [Directory Service](#directory-service)
* 3.45 [Wavelength](#wavelength)
* 3.46 [SSO](#sso)
* 3.47 [OpsWorks](#opsworks)
* 3.48 [SWF](#swf)
* 3.49 [Data Pipeline](#data-pipeline)
* 3.50 [ElasticSearch & CloudSearch](#ElasticSearch--cloudsearch)
* 3.51 [SageMaker](#sagemaker)
* 3.52 [Lake Formation](#lake-formation)
* 3.53 [Application Discovery Service](#application-discovery-service)
* 3.54 [Artifact](#artifact)
* 3.55 [Server Migration Service](#server-migration-service)
* 3.56 [Resource Access Manager](#resource-access-manager)
* 3.57 [DataSync](#datasync)
* 3.58 [Transfer Family](#transfer-family)
* 3.59 [SNS](#sns)
* 3.60 [AppSync](#appsync)
* 3.61 [Service Catalog](#service-catalog)
* 3.62 [Inspector](#inspector)
* 3.63 [Neptune](#neptune)
* 3.64 [Greengrass](#greengrass)
* 3.65 [WAF & Shield](#waf--shield)
* 3.66 [Trusted Advisor](#trusted-advisor)
* 3.67 [CloudHSM](#cloudhsm)
* 3.68 [Polly](#polly)
* 3.69 [MQ](#mq)
* 3.70 [X-Ray](#x-ray)
* 3.71 [WorkDocs](#workdocs)
* 3.71 [WorkSpaces](#workspaces)
* 3.72 [Batch](#batch)
* 3.73 [DocumentDB](#documentdb)
* 3.74 [Keyspaces](#keyspaces)
* 3.75 [Cloud Development Kit](#cloud-development-kit)
* 3.76 [EventBridge](#eventbridge)
* 3.76 [Managed Blockchain](#managed-blockchain)
* 3.77 [GuardDuty](#guardduty)
* 3.78 [Secrets Manager](#systems-manager)







### Basics
###### Free Tier & Cost Management
To pass cert and more generally to understand how it works you should get some hands-on experience. But aws can be costly at times, so aws provide so called [free tier](https://aws.amazon.com/free) to play and see how it works.
Basically there are a few options:
* always free - services that always would be free
* 12 month sign-up free - services for free for the first 12 month after sing-up
* random proposals - some random limited features that can be available at some time
So to start I would suggest to create aws account (it's free) and play with free tier. You can use almost 90% of what you need in free tier.
There are 2 types of billing alarms
* CloudWatch billing alarm
* aws budget - has more settings than CloudWatch, can warn based on forecast spend for a month, quarter or year
You can check difference in `sa/cloudformation/cw-alarm-budget.yml`.
You can view your costs by going to `My Billing DashBoard`, there you would see total incurred cost divided by services (for example 2$ for EC2).
You can go to `Bills` on the left menu and there you would see detailed info on what exactly cost and how much. 

###### Region, AZ, Edge Location
There are different geographic regions across the globe where aws data centers are located. One region is divided between several AZ (availability zone).
Each regions is completely independent and connected through Internet (no private cables between regions).
Each AZ is isolated within a regions, but connected through low-latency links (not through public Internet).
AZ name is region + az identifier like `us-east-1a`. AZ consists of one or more discrete data centers. 
To distribute load equally AZ letter is different for every account (for accountA letter `a` point to AZ1, but for accountB letter `a` point to another AZ2, so by this equal distribution of loads across different AZ is achieved)
LZ (local zone) - extension of region closer to your users.
Edge location - A site that CloudFront uses to cache copies of your content for faster delivery to users at any location

###### AWS Well-Architected Framework
It describes best practices to deliver app to aws cloud, based on 5 pillars:
* operational excellence - running and monitoring systems to deliver business value, and continually improving processes and procedures
* security - protecting information & systems
* reliability - ability to prevent, and quickly recover from failures to meet business and customer demand
* performance efficiency - using computing resources efficiently
* cost optimization - avoiding un-needed costs

###### What is DevOps
DevOps is implementation of agile to ops team.
Before agile developers write code and throw it to ops team. After agile developers started to make more changes, but ops still take a lot of time to go to prod.
Here come agile for operations, which become DevOps. Basic concepts of DevOps are:
* Infrastructure as code (TerraForm or CloudFormation) - treat infrastructure the same way developers treat code
* ci/cd pipeline (Jenkins or CodeCommit/CodeBuild/CodeDeploy/CodePipeline) - enable the automated deployment of production-ready application code.
Continuous deployment is continuous delivery that deploys to production (delivery more general term, refer to any deployment).
* Automation (Elastic Beanstalk/OpsWorks) - setup, configuration, deployment, and support of infrastructure and the applications that run on it
* Monitoring (CloudWatch/CloudTrail)
* Security (IAM)
Dev side of DevOps is responsible for:
* code building
* code coverage
* unit testing
* packaging
* deployment
Ops side of DevOps is responsible for:
* provisioning
* configuration
* orchestration
* deployment

###### AWS Tagging
Tags - metadata that describes resources, a simple key-value pair (value can be empty), that used for:
* organize/search/filter your resources by tags
* cost allocation (cost explorer can use tags to break down costs by tags)
* automation (start/stop dev env during non-business hours to reduce costs)
* iam supports tag-based conditions
Tags should be used consistently, otherwise there is no point.
Default tag `Name` should be used for every resource for easier cost balance calculation

###### AWS LoadBalancer vs App LoadBalancer
ELB (Elastic Load Balancer) - aws load balancer that includes 3 types
* ALB (Application Load Balancer) - used for http/https request
* NLB (Network Load Balancer) - used for any tcp request
* CLB (Classic Load Balancer) - old lb, now mostly outdated
App loadbalancer (in our case spring app) - is EC2 instance with Eureka (Service Discovery) + Ribbon (Load Balancer) - a separate spring app 
that discovers all instances and allows you to use human readable names instead of urls.
There are 2 types of proxy
* forward proxy - sits in front of client and redirect client's request to server, yet client can still directly connect to server. Use cases:
    * protect identity/privacy
    * avoid country/region blocks
* reverse proxy - sits in front of server and hides server from the client, client can't directly connect to server, cause server is shielded by reverse proxy. User cases:
    * load balancing
    * security (by implementing WAF you can filter on proxy level all unwanted requests, so they don't even go to your app server)
    * cpu offload (for example you should response with gzip, your app server can response with plain text but nginx would convert it to gzip)


###### Ingress vs Egress
Ingress - traffic that enters an entity, so it's a request sent from public Internet to private cloud.
Egress - traffic that exits an entity, so all traffic (data) that leaves your VPC into public internet.
Traffic often is translated using NAT in and out of a private network like the cloud.
So to simplify ingress - request, egress - response.

###### Bastion vs JumpServer
They both serve the same purpose - to separate private network from public traffic. Usually you connect to it through SSH and from there you can connect to any private machine in the network.
Bastion - outside your security zone (DNS/VPN/FTP server).
JumpServer - used to manage other servers (only SSH access to JumpServer available).
But in the essence both are the same as both provide access to internal resources not available to outside users.
Bastion VPN server - selected users can connect to vpn using IpSec protocol and now they can request all internal resources from their local machine
Bastion SSH server - selected users can connect using ssh protocol and from this server they can access all internal resources

###### Disaster Recovery
There are 2 main concepts of DR
* RTO (Recovery Time Objective) - how fast can you recover your infra (if RTО is 5 hours => at 2 am AZ was flooded, at 7 am you have fully running infra in another AZ/region)
* RPO (Recovery Point Objective) - to which point can you recover (you make backups every hour, at 1.30 AZ was flooded, so your RPO - 1 hour)
There are 4 types of DR in aws
* backup and restore - you store all you backups on tape (e.g. using iron mountain)
* pilot light - you have replica of your main infra, but it always down. So when disaster happen you just start everything. White it's down every 1-3 month you update it (run ec2, install patches..)
* warm standby - constantly running scaled in version of your main infra
* multi site - the fastest cause we constantly have complete copy running in another region
HA vs DR
* HA - run some ec2 in another AZ and use elb to forward request to this AZ. In case one AZ fail you can still use your service. Yet this won't protect against whole region failure
* DR - run some critical stuff in another region and use route53 failover to this region. But major part is restored once you start DR. When we talk about DR we usually assume entire region goes down.
HA vs FT
* HA (High availability) - system can recover with short downtime. Example - start new ec2 from ami and use ebs from down ec2 in case of failure.
* FT (fault tolerance) - system continue provide services even in case of failures. You build FT by introducing redundancy. Example - add elb + asg.
Availability vs. Durability on ebs example
* Availability - ebs available 99.9% time, but in case of AZ failure it won't be available (cause ebs is linked to subnet/AZ). But when AZ becomes again available your data won't be lost.
* Durability - ebs 11 9 durable (after dot we have 11 nines), that means if you have 1000 volumes you can expect to lose 1 volume per year.

###### ENI, ENA, EFA
ENI (elastic network interface) - logical networking component in a VPC that represents a virtual network card that has attributes:
* primary private IPv4 (from VPC range)
* public IPv4 (changes after stop/start)
* elastic IPv4 (static public IP, won't be changed after stop/start)
* IPv6, mac-address, security groups and so on...
You can create ENI by going to `EC2 => Network & Security => Network interfaces` and create network interface and attach/detach it to ec2 instance.
Every instance in VPC has a default ENI - primary network interface, you can't detach it. You can create new and attach. Number of ni that can be attached to ec2 depends on it's size (more computing power - more ni can be attached).
Both ENA & EFA are ENI that provide some advanced networking
* ENA (Elastic Network Adapter) - ENI that provides enhanced networking capabilities. There is a selected [set of instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking-ena.html#ena-requirements) that support ena. You can ssh to ec2 and run `modinfo ena` if you see response your ENI is ENA.
When you need several ec2 to have low latency & high network throughput it's better to put them into cluster PG, instead of just adding ean to each of them.
* EFA (Elastic Fabric Adapter) - ENA + OS bypass hardware interface (without involving the instance kernel) that use hardware-provided reliable transport communication.
    * allows HPC applications to communicate to talk with each other with low latency and higher throughput than traditional TCP channels.
    * EFA can only be attached at launch or to stopped instance
    * best suited for HPC/ML. HPC applications - a group of ec2 instances that perform some high load logic. They are written using MPI (Message Passing Interface) and require fast communication between instances
    * OS-bypass traffic is limited to a single subnet. In other words, EFA traffic cannot be sent from one subnet to another. Normal IP traffic from the EFA can be sent from one subnet to another

###### Shared Responsibility
AWS use concept of shared responsibility
* aws manages security of the cloud (physical devices, datacenters)
* you manage security in the cloud (route table, NACL, SG)

###### SaaS vs PaaS vs IaaS/IAC 
* SaaS (Software as a Service) - if you want to use third-party software like some crm, but don't want to have it staff to install it to every computer in your office, you can just use web-service of such crm. In this case crm completely managed by someone else,
you just can access it from web browser without need to run it and support. Usually it refers to end-user applications (crm, office365, ELK stack).
* PaaS (Platform as a Service) - in this case you develop you application (writing code) and just deploy your code without worry about infrastructure. For example if you are using spring framework, you can use [cloud foundry](https://cloud.spring.io/spring-cloud-cloudfoundry/reference/html)
and just deploy your code, and it will provide everything else (container, java, spring framework). BeanStalk - good example where you just upload your code and aws provision all required infra for you.
* IaaS (Infrastructure as a Service) - good example is aws that provides infrastructure (like container/networking/storage/database) as services to end users. Comparing with PaaS/SaaS users of IaaS responsible for managing infrastructure themselves. 
The best practice is to use IAC (Infrastructure as a code) - an idea that you should code how you want to build your infrastructure. For example to run you microservice app you need to have 3 containers. 
Of course you can manually create all of them, install all needed software there and deploy it. But you can also add script file that would do it all automatically. Most popular tools is Aws CloudFormation and Terraform.

###### Virtualization and Containerization
Hyperviser is VMM (Virtual Machine Monitor), that runs VM. It works as mediator between virtual OS and hardware. By acting as mediator we can run several virtual OS on one hardware at the same time.
This is the main advantage, cause one OS can run on one hardware only at the same time (cause you can have have several OS installed on disk and run one at a time).
Originally hypervisors developed to give multiple users simultaneous access to computers that performed batch processing. But over time other solutions for many users/single machine problem appeared including time sharing.
So virtualization is a simulation of physical hardware for virtual OS.
Containerization on the other hand is like os-level virtualization. Instead of creating a complete new OS, container share resources with host os, but have it's own file system, and by doing so divide itself from main OS.
Hyper-V - Windows Server Virtualization, server computer running Hyper-V can be configured to expose individual virtual machines to one or more networks.
Virtual machine like ec2 is part of physical machine in aws datacenter. It's isolated from other virtual machines by hypervisor or alike software. 
* Host - physical machine where all virtual machines are located
* Guest - virtual machine

###### Pure Serverless
With aws serverless you can build complete backend application without writing code(like java) or using any framework (like spring). 
For example you can use `API Gateway` to set up a few api endpoints. Then you can use `aws lambda` to set up some logic to handle these endpoints. Then you can use `sns` to send some notification/emails.
As you see without writing any application code we can have a simple backend application. But the truth is that this is only good for very simple app, usually for POC (proof of concept).
The reason is once your application become more complex it would be very hard to ensure that everything is working fine, cause you have no tests. 
So the conclusion is very simple. Use aws serverless only for POC, or when you want quickly to startup, then you can also create a lot of mock api so your team can start to interact with it.
But once your system become more complex you will definitely need to use some programming like java/spring to have a good software architecture of your product and good test coverage that would ensure that nothing would be broken after changes.
Moreover it can be expensive in certain cases. Consider situation where you have 1 lambda that need internet access to do some stuff (like captcha verification or ip address check).
For this you need NAT, cause your lambda can't just get internet access from private subnet inside VPC. So you go and create nat gateway, and your lambda can now access internet.
But in the end of the month you get a bill for 50 cents for lambda + 35$ for Nat Gateway. The reason is that Nat Gateway price per hour is 0.045$ + you also paying per GB transfer through your Nat, 
but for the example let's imagine that you transfer tiny amount of 100mb per month. So instead of having cheap serverless you pay 35.5$ per month, just your lambda sometime can get internet access.
When [aws support got pressed](https://forums.aws.amazon.com/thread.jspa?threadID=234959) over the issue, the proposed instead of Nat Gateway create custom Nat Instance (ec2 running with nat), and it would cost only 10$.
But this idea to run additional ec2 to have internet access for single lambda upends serverless. Why do you need lambdas in the first place, when you can just put app into ec2 itself?

###### AMI vs Snapshot
AMI is region specific (so to use it from another region you should copy it) and same ami will have different AMI_ID in different regions.
There are 2 types of AMI
* instance-store - copy of the root instance-store volume + metadata in s3
* ebs-boot - ebs snapshot + metadata (architecture, kernel, AMI name, description, block device mappings)
Most ami are of second type (ebs-boot). If you need to launch new ec2 from snapshot, you should first convert snapshot into ami and then just launch ami.
You can't remove snapshot if it has ami created from it, yet after you de-register ami you can delete snapshot. That means inside aws ami is just logical representation of snapshot.
Linux AMI virtualization types
* HVM (Hardware Virtual Machine) - means that virtualization technology using hardware extensions for faster access to resources
* PV (paravirtual) - boot with a special boot loader called PV-GRUB, which starts the boot cycle and then chain loads the kernel specified in the menu.lst
AMI doesn't include kernel, it's loaded from AKI (Amazon Kernel Image).
In November 2017 new virtualization came out as Nitro (combines a KVM-based hypervisor with customized hardware (ASICs) aiming to provide a performance that is indistinguishable from bare metal machines)

###### AWS CLI
CLI (Command Line Interface) - can be useful to quickly automate some aws manual tasks. Internally it just convert cli calls into aws API calls and wrap results into useful format.
`help` is very useful command working with cli.
```
aws help # show all available services
aws <service> help # show all available actions to perform on selected service
aws <service> <action> help # shaw all avaialble action options to perform for specified action 
```
Service endpoint - you use it to connect to aws services. When you are using cli/sdk it automatically get api url for service you are going to use.
Endpoint url built like `protocol://service.region.amazonaws.com` (for example `https://dynamodb.us-east-1.amazonaws.com`).
Since s3 is global service but has region, 5 urls are possible:
* default url without region        `https://s3.amazonaws.com/www.aumingo.com/index.html`
* default url with region           `https://s3.us-east-1.amazonaws.com/www.aumingo.com/index.html`
* bucket name first without region  `https://www.aumingo.com.s3.amazonaws.com/index.html`
* bucket name first with region     `https://www.aumingo.com.s3.us-east-1.amazonaws.com/index.html`
* static website                    `http://www.aumingo.com.s3-website-us-east-1.amazonaws.com`
Note that all this urls can be divided into 2 types:
* path-style - can be:
    * global - https://s3.amazonaws.com/bucket_name
    * regional - https://s3.us-east-1.amazonaws.com/bucket_name
* virtual-hosted - you add your bucket name first
Note that path style is [deprecating soon](https://aws.amazon.com/blogs/aws/amazon-s3-path-deprecation-plan-the-rest-of-the-story). The reason is that millions of bucket hit same dns record, and it can create a bottleneck.
There is no way to set https for static website.
FIPS endpoint - endpoint that use a TLS software library that complies with Federal Information Processing Standards.
So for kms you have 2 endpoints:
* `kms.us-east-1.amazonaws.com`
* `kms-fips.us-east-1.amazonaws.com`
Basic commands
```
# get available regions
aws ec2 describe-regions

# get available AZ
aws ec2 describe-availability-zones --region=us-east-1
```
Query command `--query` uses JMESPath (query language for JSON)
```
# show imageId of first image
aws ec2 describe-images --query "Images[0].ImageId"

# show instanceId and name
aws ec2 describe-instances  --query="Reservations[*].Instances[*].{Instance:InstanceId,Name:Tags[?Key=='Name']|[0].Value}"

# show state for all images
aws ec2 describe-images --query "Images[*].State"

# list mfa devices
aws iam list-virtual-mfa-devices
```
Create new profile to access aws services from console `aws configure --profile awssa`.
There are 3 env variables that overwrites `~/.aws/config` settings
```
export AWS_ACCESS_KEY_ID=123
export AWS_SECRET_ACCESS_KEY=123
export AWS_DEFAULT_REGION=us-west-2
```
Although default region for `awssa` profile is `us-east-1` (you can check it by `aws configure get region`), if you set region as env var `AWS_DEFAULT_REGION=us-west-1`, and then run `aws configure list`
```
Name                    Value             Type    Location
----                    -----             ----    --------
profile               awssa               manual    --profile
region                us-west-1              env    AWS_DEFAULT_REGION
```
So whenever you run any command with this profile and don't specify region (by setting `--region=us-east-1`), region from env var is used (not from your config setting).
To remove it just unset the variable `unset AWS_DEFAULT_REGION`, and now if you run `aws configure list` you will see that region is taken from config
```
Name                    Value             Type    Location
----                    -----             ----    --------
profile               awssa           manual        --profile
region                us-east-1      config-file    ~/.aws/config
```
And you can run commands from console and default region from config file will be used.
You can set or unset aws env vars in `~/.bashrc` file.
* Get account Id
```
# get arn
aws iam get-user --query "User.Arn"

# get arn + userId
aws sts get-caller-identity
```
* S3 (create presigned url, make file public for 30 sec) `aws s3 presigned s3://my-CloudFormation-template-example/data.txt --expires-in 30`
* CloudFormation
```
# create stack
aws CloudFormation create-stack --stack-name=mystack --template-body=file://sa/cloudformation/condition.yml --region=us-east-1
# update stack and pass params
aws CloudFormation update-stack --stack-name=mystack --template-body=file://sa/cloudformation/condition.yml --parameters=ParameterKey=Env,ParameterValue=prod --region=us-east-1
# if you are creating a stack that create iam resouce you should explicitly tell to CloudFormation that it's ok to create iam resources
aws CloudFormation update-stack --stack-name=logs --template-body=file://sa/cloudformation/ec2-logs.yml --region=us-east-1 --capabilities=CAPABILITY_IAM
```

###### Useful Linux Commands
* List all userNames `cut -d: -f1 /etc/passwd`
* Get all groups by userName `groups uName`
* Get userId `id -u uName`
* Get groupId by groupName `cut -d: -f3 < <(getent group gName)`
* Get groupId by groupName `cut -d: -f3 < <(getent group gName)`
* Get number of cores `nproc` - total number of cores, `lscpu` - total info about cpu cores
* Imitate processor load `stress --cpu 8 --timeout 30` - load 8 cores for 30 sec

###### Redirect 301 vs 302
There are 2 main codes of redirects (HTTP method can also change)
* 301 (permanent) - resource was moved permanently and browser should no longer request old url
* 302 (temporary) - resource was temporary moved to new url, so browser should continue request old url
Redirects without changing http method. They basically the same as 301/302 only difference is that here HTTP method (GET/POST/PUT..) can't change
* 307 (temporary)
* 308 (permanent)

###### crontab
crontab notation is used in many places, including:
* ASG scheduled action
In a crontab command, the fields are: `* * * * *`
```
minute of the hour
hour of the day
day of the month
month of the year
day of the week (0-6, Sunday to Saturday)
year (1970-2099) - not required, only supported by modern versions
```
You can also see `files/images/crontab.png`
Combining these 5 you can create anything from 1 min to 1 year:
* Run job every minute `* * * * *`
* Run job once in a year `0 0 1 1 *` => At 00:00 on 1st of January
* Run job 10 min past every hour: `10 * * * *`
* Run job 10,20 min past every hour: `10,20 * * * *`
* Run job every 10 min: `10,20,30,40,50 * * * *` => `*/10 * * * *` (short notation)
* Run job every day at 5.30 `30 17 * * *`
* Run job At 12.05,12.10 on 10th of every month and day should be Monday: `5,10 0 10 * 1`

###### MySql Index Design
File stored in memory in a sequence of blocks. Each block knows where next is located. 
Usually blocks go one after another, but can be scattered around - fragmentation, in this case performance is donwgraded (that's why there are a lot of tools - defragmentators that may expedite your system).
If you search column without index, then mysql would extract all rows in table (yup since it's not columnar it would extract all table from memory), filter your column and return result. As you see - highly ineffective.
Index - create a sorted column representation, and when you search by column for which we have index, only values from that index would be extracted from memory.
So now most important question on designing - on which columns to put indexes. Of course you can put it on all columns, but don't forget that indexes have their own overhead - memory.
Best rule - analyze your query pattern and create indexes for all columns that are participate in `WHERE/ORDER BY` clauses.
Unique index - means after first match mysql won't proceed in searching. MySql support only 1 index per query, so if you have multiple columns in `WHERE` clause - you have to use composite index.
The order of columns in composite index is very important. It should go from low to high cardinality.
Suppose we have age and gender. For each age value - on average 100 rows, but for each gender - 5000. So age_gender index is better than gender_age.
Cause in first case index first filter by age, and leave 100 values, and then filter by gender.

### Networking
###### NIC
NIC (Network interface controller) - hardware component to connect computer to network. It implements electronic circuit that operates on both physical & data link layers using either Ethernet/Wi-Fi protocols.
If you NIC is inside network that using hub, than hub sends all packets to all pc connected to the network. But you NIC process only those that are intended for it (NIC check MAC address, and if it corresponds to address of NIC it sends frame further to CPU).
Promiscuous mode - you turn off MAC address check, and all packets that are sent to NIC (regardless of destination MAC address) are forwarded to CPU to process. This mode is turned off by default, can be useful for traffic sniffing.
Traffic sniffing - catch all traffic and analyze it, best tool is [WireShark](https://www.wireshark.org).
You can detect promiscuous mode by sending a ping (ICMP echo request) with the wrong MAC address but the right IP address. In normal mode NIC would drop packet, but in promiscuous - you would get response.
It is not possible for ec2 running in promiscuous mode to receive/sniff traffic that is intended for a different virtual instance.
Since most modern networks using switch, and it sends data directly to special pc (compare to hub which just replicate packet to everybody in the network), just turning promiscuous mode won't help much, 
cause switch will route only those packets that are only designated for your NIC, so you can't sniff all network traffic. Hopefully Managed switches provide Port Mirroring (ability to mirror all incoming packets to some specific port, port - is not tcp/udp port but physical connection nest inside switch)
If your switch is not managed and you can't turn on port mirroring in the switch you can employ ARP-Spoofing.
ARP is used to by switches to get mac address by ip address. So switch basically sends ARP requests to all connected devices, and if IP address in ARP request match device IP address, device responds with MAC address.
Key here is that switch has no way to verify response. So for all ARP your host can response with it's onw mac address. In this case all packets that switch receives would be transmitted to your host.
But to operate normally your host should retransmit these packets to their respective owners. In this case you basically embed your host between switch and all other devices. So you can sniff all traffic.

###### Hub, Switch, Router
* Hub (концентратор) - device that connects multiple computers in LAN (local area network) and propagate any packet sent from one computer to all other. Today mostly outdated, people use switch instead. Works on the physical layer (Layer 1) of OSI. 
* Bridge (мост) - connect several hubs into single network. Works on OSI layer 2. As hubs, mostly outdated today.
* Switch (коммутатор) - device that connects multiple computers in LAN, but knows exactly where to send packet of data, 
it has internal table where it store which port takes which mac address, and at first it sends ARP to get mac addresses, but once table is full it just sends packet to desired node. Works on the data link layer (Layer 2) of OSI.
* Router (маршрутизатор) - small computer that can route the network traffic. Usually used to connect networks such as LAN/WAN. Works on (Layer 3).
* L3 Switch (L3 коммутатор) - switch that can route traffic, work faster than router.
There are 2 types of Port
* Physical port - one inside switch/router is the nest where you plug in your network cable
* Logical port - one inside OS, and it allows OS to route different protocols for the same IP address

###### Network Topology
Network Topology - is how your computers are arranges and connected with each other. There are 2 types of topology:
* Physical - how devices are physically connected
* Logical - how are packets sent inside network
Types of topology
* Bus (single line) - we have one cable and all computers are connected to it. Disadvantage - if line disruption happens the whole network is broken. Outdated today.
* Ring - all computers are connected into a ring. Every computer is connected to 2 neighbors. To secure against disruption there is bidirectional-ring network, where all computers connected with 2 cables instead of 1. Outdated today. 
* Star - all computers are connected to a single switch.
* Tree - all computers forming a tree with single node(computer or switch) at the top. The difference from star is physical structure.
* Mesh - all computers are connected to each other. The advantage is high level of security for failures, but disadvantage is that for n computers you need n! direct connections.
* Hybrid - composed of 2 or more other topologies.

###### OSI Network Model
There are 7 levels in OSI model, here is the list from lowest to upper:
* Physical layer - how data are physically transferred. Basically they are translated from electrical/light signals into sequence of bits. There are 3 ways:
    * Twisted pair (медная витая пара) - data transferred by means of electrical signals in copper
    * Optical Fiber - transfer data by light inside cable
    * WiFi - transfer data without cable using radio waves
* Data Link layer - transfer data inside local network, validate packets. Ethernet and Mac-addresses are on this level.
* Network layer - transfer data between different networks. IP (Internet Protocol) address is checked on this level.
* Transport layer - here you can actually transfer data using ports. TCP/UDP works on this level.
* Session layer - establish and destroy connection between 2 hosts.
* Presentation layer - encode/decode information passed between 2 hosts.
* Application layer - apps works on this level by using HTTP/FTP
On each of this layer passed information is called different.
* Application/Presentation/Session - PDU
* Transport - TCP - segments, UDP - datagramm
* Network - packets
* Data Link - frames
OSI model is not used in practice, only for education purpose, cause it has been developing for 7 years, and many other models were born. One of them is TCP/IP model. In has 4 levels
* Application layer - include Application/Presentation/Session from OSI
* Transport layer - Transport layer in OSI
* Internet layer - Network layer in OSI
* Link layer - Data Link + Physical in OSI
There were other models like AppleTalk or IPX/SPX, but they were outdated and nowadays only TCP/IP is mostly used. It also called sometimes DoD (department of defense) cause it was originally developed by USA defense department.

###### High Level Protocols
To better understand these protocols you can download [Cisco Packet Tracer](https://www.netacad.com/courses/packet-tracer) that can help you build networks and see how it all works.
* HTTP (HyperText Transport Protocol, 80)/HTTPS(HyperText Transport Protocol Secure, 443) - client-server data exchange. headers are
```
GET / HTTP/1.1
Host: 192.168.1.10
```
* DNS (Domain Name System, 53) - hostname-to-ip resolver. In linux we have `/etc/hosts` - basically same local dns that resolve hostnames. It has priority over external dns server
* DHCP (Dynamic Host Configuration Protocol, 67/68) - allows to dynamically set IP-address, subnet, dns name to remote hosts
It uses connectionless service model using UDP. It is implemented with two UDP port numbers for its operations which are the same as for the bootstrap protocol (BOOTP). UDP port number 67 is the destination port of a server, and UDP port number 68 is used by the client.
* POP3 (Post Office Protocol Version 3, 110, POP3S-995) - work on get-and-delete principle. Client connect to server, download new mails, and sent delete message to server
* IMAP (Internet Message Access Protocol, 143) - more complex analogy of pop3, don't remove messages from server
* SMTP (Simple Mail Transfer Protocol, 25) - send mail to mail server. Don't cofuse IMAP/POP3 - read email from mailServer, SMTP - send email to mailServer
* Telnet (terminal network, 23) - allows to communicate with remote OS by sending unencrypted text data. Nowadays mostly outdated and replaced by ssh
* SSH (Secure Shell, 22) - like telnet, but exchange encrypted data
* FTP (File Transfer Protocol, 20) - transfer file to server, unsecured. You can use FTPS(port 21) or FTPS (port 22) for secure file transfer 

###### Low Level Protocols
* ICMP (Internet Control Message Protocol) - located at network layer - error reporting and query service.
Ping command use ICMP echo to determine availability of some destination
* Mac address - unique address of every network device, consists of 48 bits (12 symbols), first 24 - set by IEEE, another 24 - by manufacturer (example: 005555.001234).
* ARP (Address Resolution Protocol) - used to discover link layer address (mac-address) associated with given network layer address (ip-address). For for IPv4. You can play with in in linux by `arp --help`.
* NDP (Neighbor Discovery Protocol) - same as ARP, only for IPv6
* NAT (Network Address Translation) - if you have 1 public IP address that's visible to whole world, and also have a private network with lots of computers there, and you want to route specific request to some computer in your network your router will use NAT. 
It will change headers in packet and resend it to particular IP address inside private network.
When you make request from your private ip address 192.168.0.1 to google.com, your router will substitute your ip with it's public ip address. Google will respond to router public ip address and router will got this response, and then will redirect this response back to your machine.
* IP address - divided between public and private (used for local networks) 
Private networks:
10.0.0.0 — 10.255.255.255, subnet mask => 255.0.0.0 (10/8, 24 bits), mostly used in work-related networks.
172.16.0.0 — 172.31.255.255, subnet mask => 255.240.0.0 (172.16/12, 20 bits), mostly not used anywhere.
192.168.0.0 — 192.168.255.255 subnet mask => 255.255.0.0 (192.168/16, 16 bits), mostly used in home-related networks.
* Subnet mask - used to divide ip address into 2 parts: network + host. 
192.168.0.0/16 - first 16 bytes - network, last - ip address, totally there can be 2**16=65536 ip addresses.
192.168.0.0/24 - first 24 bytes - network, last 8 - ip address totally 2**8 = 256 ip addresses.
192.168.0.0/28 - first 28 bytes - network, last 4 - ip address, totally 2**5 = 16 ip addresses.
So by knowing subnet mask we can determine if 2 ip addresses are on the same network.
In every network first/last addresses are: 
* first (all zeros, 0) - specifies network
* last (all ones, 255) - broadcast a message to every host on a network (ARP)
Gateway - router specified on a host, which links the host's subnet to other networks. For ordinary users gateway - Internet provider, cause it connects them to Internet.
Gateways regulate traffic between two dissimilar networks, while routers regulate traffic between similar networks
Default gateway - ip address of router for particular network (for every network including Internet, router will have it's own ip address)
When you send packet, tcp/ip will use subnet mask to determine if ip address in the same subnet, in this case it will send packet further, if false - it will send it to default gateway.
There are 2 types of networks:
* Classful - there are 5 classes of network:
    * A - subnet /8, first octet => 0-127
    * B - subnet /16, first octet => 128-191
    * C - subnet /24, first octet => 192-223
    * D (multicast) - first octet => 224-239. It is reserved for multicast and cannot be used for regular unicast traffic
    * E (reserved) - first octet => 240-255. It is reserved and cannot be used on the public Internet
* CIDR (Classless Inter-Domain Routing) - replace classful network (A-D classes) and allocate ip-addresses without bind it to any class network.
There are 2 ways how IP address space is assigned within each organization:
* VLSM (Variable Length Subnet Mask) - when we divide a network into subnet with different length
* FLSM (Fixed Length Subnet Masks) - all networks within your infra are the same size. So if you have 2 networks and one is 200 and another is 20, both would be /24 size.
As you already guess most private networks on-premise and on aws vpc are built using CIDR+VLSM
Suppose we have a network 192.168.0.1/24 - totally 254 addresses(actually total - 256, but first and last are reserved)
We need to divide it into 4 subnets with 10, 50, 2 and 20 hosts. Although we can equally divide our network on 4 and have 64 ip-addresses in each, it's better not to give way more than needed
In this case we can divide it on min power 2. 
10 => 16(2**4)
2 => 4 (2**2)
50 => 64(2**6)
20 => 32(2**5)
* Routing table - a list of ip-addresses and subnet masks of all networks connected to the router, stored in router RAM.
* VPN (Virtual Private Network) - encrypted connection(also called tunnel) over public network (usually Internet) between 2 or more private networks. It encrypt packet, add new headers.
Split tunnel. By default all traffic (both to external resources like google.com and to on-premise network) goes through vpn tunnel. But this can be a problem, cause it may overload tunnel.
To solve this issue there is split of tunnel so based on destination packets are go either though vpn tunnel or directly to internet (take a look at `files/images/vpn-split-tunneling.svg`)
* iSCSI (Internet Small Computer Systems Interface) - transport layer protocol, works above TCP. Initiator (server) packages SCSI commands into network packets, and sends it to Target (remote storage).
For all subnets you shouldn't use first & last address
* first address - network identification (refers to the subnet itself and is used for routing purposes)
Look at the binary representations for the ip address and the subnet mask. In the process of determining the route they are binary combined with AND. 1&0=0, 1&1=1, 0&0=0. The network part of the address remains unaffected, but the host part becomes all-zero. If you could use the .0 address for a host too, how would you different it from the net?
* last address - broadcast (network devices use it to send messages to all other devices in this network)
So for /24 network you can have totally 256-2 = 254 IP addresses.
But in cloud (every cloud, not just aws) 3 IP addresses also would be gone (router, DHCP, DNS) so totally you have 254-3 = 251.
But in real network you probably gonna have this 3 ip taken also (but you can also host them in one machine)

###### SOA and CAA
SOA (Start of Authority) - record in DNS containing administrative info about zone, email, last update time.
You can use dig (domain information groper) utility to group(grip/get) information about dns
You can get it by `dig SOA +multiline google.com`, email is `root@amazon.com`
```
amazon.com.		900 IN SOA dns-external-master.amazon.com. root.amazon.com. (
				2010126527 ; serial
				180        ; refresh (3 minutes)
				60         ; retry (1 minute)
				3024000    ; expire (5 weeks)
				60         ; minimum (1 minute)
				)

```
CAA (Certification Authority Authorization) - list of autorities who can issue certificates for this domain. You can run `dig CAA +multiline google.com`
```
google.com.		86400 IN CAA 0 issue "pki.goog"
```

###### SSL vs TLS vs HTTPS
SSL (Secure Sockets Layers) - outdated protocol not used today. TLS (Transport Layer Security) - main security protocol used today.
So you can call TLS more updated & secure version of SSL. But we still call our digital certs as SSL certificates, but in reality when you buy SSL certificate from DigiCert you are buying most up-to-date TLS certificate.
HTTPS means that our HTTP traffic is secured by TLS protocol with SSL(TLS) certificate.
CA (Certificate Authority) - entity that issues digital trusted certificates (certifies the ownership of a public key by the named subject of the certificate).
Certificate prevents man-in-the-middle attack by encrypting all packets sent to server with certificate's public key, and on the server side everything is decrypted using private key.
There are public (low ubiquity, issues certificates for free, like [Let's encrypt](https://letsencrypt.org/getting-started/)) and commercial(high ubiquity, charge you for issuing certificate) CA out there.
Ubiquity - quantity of internet browsers, other devices and applications which trust a particular CA.
SSL certificates are verified and issued by a CA. If you are using aws, everything is done inside, and certificate is generated for you.
But you can also generate public/private keys using `openssl`, and then generate CSR and reqeust CA to issue certificate for you.
CSR (Certificate Signing Request) - request signed with private key that contains vital information about your organization and domain, so it
is an encrypted block of text that includes your organization’s information, such as country, email address, fully qualified domain name, etc. It is sent to the Certificate Authority when applying for an SSL certificate.
Most detailed info [here](https://letsencrypt.org/how-it-works/)

###### Routing
Routing - process to select path between different networks using 5 addressing method (association)
* `unicast` - one-to-one between a sender and destination (each destination address uniquely identifies a single receiver endpoint)
* `broadcast` - one-to-all (single datagram from one sender is routed to all of the possibly multiple endpoints associated with the broadcast address)
* `multicast` - one-to-many (datagrams are routed simultaneously in a single transmission to many recipients)
* `anycast` - one-to-nearest (datagrams are routed to any single member of a group of potential receivers that are all identified by the same destination address)
it allows for multiple machines to share same IP address, and send user request based of the user proximity to server.
So if one datacenter would go offline, anycast would forward user to the next closest datacenter.
It's based on BGP and AS. With unicast path would lead to one destination, no matter what distance is.
* `geocast` - delivery of information to a group of destinations in a network identified by their geographical locations
Routing protocol:
* EGP (External Gateway Protocol) - based on based on tree-like (i.e., hierarchical) topologies.
As internet grows EGP become inefficient to find the quickest route, so new protocol was developed
AS (Autonomous System) architecture (represented by unique number called an ASN).
Each AS controls a collection of connected routing prefixes, representing a range of IP addresses. It then determines the routing policy inside the network.
* BGP (Border Gateway Protocol) - makes internet to work.
It works like GPS (the best route is determined by different factors, such as traffic congestion, roads temporarily closed for maintenance, etc).
BGP is designed to exchange routing and reachability information between autonomous systems on the Internet

###### MTU & Jumbo frame
PDU (Protocol data unit) - single unit of information transmitted between 2 computers. At each layer PDU has it's own name
* TCP - segment
* UDP - datagram
* IP - packet
MTU (Maximum transmission unit) - max size of PDU that can be transferred in single network layer transaction. MTU for Ethernet is 1500 bytes.
Jumbo frame - ethernet frame with more than 1500 bytes MTU, usually up to 9000.
The idea is that it's easy to process the contents of single large frame instead of many smaller frames.
You can test all of this with `ping` command
```
# by default 84 bytes of data transfered
ping google.com
# PING google.com (172.217.161.142) 56(84) bytes of data.

# 1500 is max size
ping -s 1472 google.com
# PING google.com (172.217.161.142) 1472(1500) bytes of data.

# if you try more, ping won't work
ping -s 1473 google.com
#PING google.com (172.217.161.142) 1473(1501) bytes of data.

# you can force to run large frame
ping -M do -s 9000 google.com
# PING google.com (172.217.161.142) 9000(9028) bytes of data.
# ping: local error: Message too long, mtu=1500
```

###### Nmap
Nmap (Network Mapper) - free and open-source utility for network discovery and security auditing.
First you have to install it `sudo apt-get install nmap -y`. After check version `nmap --version`.
Nmap - utility to listen and check for available ports. Create ec2 in public network with all icmp and ssh open in SG.
Then you can scan ports `nmap -Pn 34.207.196.102`. `-Pn` - just check port, without pinging host machine first (useful if icmp protocol turned off by SG).
```
Starting Nmap 7.60 ( https://nmap.org ) at 2020-08-14 10:21 HKT
Nmap scan report for ec2-34-207-196-102.compute-1.amazonaws.com (34.207.196.102)
Host is up (0.25s latency).
Not shown: 999 filtered ports
PORT   STATE SERVICE
22/tcp open  ssh

Nmap done: 1 IP address (1 host up) scanned in 20.69 seconds
```
Nmap check for which port app exist. So even if you open all traffic in SG, namp would show only those ports that have underlying app.
So in SG you just open ports, if no app exists for this port in ec2, nmap won't see it, cause there is nobody to talk with.

###### Stunnel
Stunnel - open source project to use TLS for tunneling (for services that don't provide ssh, like SMTP port 25). 
So you can use `stunnel` but you have to install it manually and configure, but mount helper already provide it under the hood.
You can invoke it from inetd or directly in daemon mode (edit `/etc/services`)
Super-server - daemon that runs on linux, listen specific ports and when socket opened (connection established) starts server. Examples: sshd/inetd/httpd
inetd (internet service daemon) - linux super-server that listens incoming connection and starting servers. You write setting in `/etc/inetd.conf` on which port which program to run, like
`telnet  stream  tcp6    nowait  root    /usr/sbin/telnetd      telnetd -a` - open telnet.

###### Docker networking & iptables
iptables - linux firewall, this utility pre-installed on most linux distributions, yet you can also install it manually `sudo apt-get install iptables`.
You can check it by `sudo iptables -L -n` - list using numeric notation (IP addresses instead of dns names). Since firewall required root permission to manage, you have to use `sudo` when modifying firewall (of course you can call `iptables --help` without `sudo`). 
There are 3 types of chain:
* input - control incoming connections (if you want ssh to machine, input chain should have proper record to allow port 22)
* forward (router/NAT) - control incoming connections not destined for localhost
* output - control outcoming connections
Policy can be of 2 types `sudo iptables -L|grep policy`:
* ACCEPT - accept all connections. You can configure to accept all incoming connections `iptables --policy INPUT ACCEPT`. Then you can deny based on IP or port.
* DROP - deny all connections
There are 3 types of responses:
* Accept - allow connection
* Drop - drop connection (best if you want pretend like server doesn't exists)
* Reject - explicitly send reject message to client
Below an example how to work:
```
# block all connections from particular IP range (if you want single IP just set /32, or don't set IP mask at all)
iptables -A INPUT -s 10.10.0.0/24 -j DROP
# block connection for specific port for single IP
iptables -A INPUT -p tcp --dport ssh -s 10.10.0.0 -j DROP
# block specific port for all IP
iptables -A INPUT -p tcp --dport ssh -j DROP
# remove rule to block port 80
iptables -D INPUT -p tcp --dport 80 -j DROP
```
There are 2 ways to add rule:
* `-I` - add into line number (by default 1) - so add in the beginning
* `-A` - append rule to the end
Rules are stateless (like NACL), so if you want to allow ssh connection, you have to modify both input/output. Same way if you want to access internet on port 80 from machine you should allow both output/input traffic.
But you can imitate state by creating 2 rules, input and output, and allow only established connections to output.
Below example allows to create new connection to input, but for output only traffic for already established connection may flow. You are not allowed to ssh from machine.
```
iptables -A INPUT -p tcp --dport ssh -s 10.10.0.0 -m state --state NEW,ESTABLISHED -j ACCEPT
iptables -A OUTPUT -p tcp --sport 22 -d 10.10.0.0 -m state --state ESTABLISHED -j ACCEPT
```
Once you add changes they apply immediately, but when you reboot your pc, they would be scrapped. If you want to add them permanently you should save them explicitly `sudo /sbin/iptables-save`.
SG vs iptables:
* SG - infra level of security. Be default all closed. Stateful. Takes effect prior to iptables.
* iptables - os level of security. By default all open. Stateless.
Custom chains - you can create your own custom chains
```
# create new custom chain
sudo iptables -N MYCHAIN
# create reference from input chain (your custom chain rules would be called just after INPUT chain)
sudo iptables -A INPUT -j MYCHAIN
# see which custom chain follows after which 
iptables -L  -n --line-numbers
```
There are 4 types if iptables:
* filter - 3 chains:
    * input
    * forward
    * output
* NAT
    * prerouting (destination NAT) - alter packet when packet was received
    * postrouting (source NAT) - alter packet before it leaves
    * output 
* mange
    * prerouting
    * output
    * forward
    * input
    * postrouting
* raw
    * prerouting
    * output
To view specific route table you can `iptabls -t filter/nat/mangle/raw -L`. If you don't specify table option, `filter` table is used by default.
Masquerade - special target in nat table, hiding address translation (so private hosts can connect to internet through NAT server).
Note that docker modifies iptables. When you run docker `docker run -d -p 8080:80 nginx`. If you run `iptables -L -n` you will see, that docker add entry into iptables.
```
Chain DOCKER (1 references)
target     prot opt source               destination         
ACCEPT     tcp  --  0.0.0.0/0            172.17.0.3           tcp dpt:80
```
Note that by default you open this port to everybody. If you want it to be open only for localhost you should run it `docker run -d -p 127.0.0.1:8080:80 nginx`.
Note that if you open port for anybody, you can't close it just by modifying iptables. If you add `iptables -A INPUT -p tcp --dport 8080 -j DROP` you can still access port 8080 from outside.
The reason is that docker modify 2 tables filters and nat. If you run `iptables -t nat -L -n`, you will see
```
Chain DOCKER (2 references)
target     prot opt source               destination          
DNAT       tcp  --  0.0.0.0/0            0.0.0.0/0            tcp dpt:8080 to:172.17.0.3:80
```
You can resolve it by adding `iptables -I FORWARD -p tcp --dport 80 -j DROP`.
So to summirize - there are 2 ways to block outside access to your exposed docker port:
* expose it only to localhost `docker run -d -p 127.0.0.1:8080:80 nginx`
* expose to everybody but block access from iptables `iptables -I FORWARD -p tcp --dport 80 -j DROP` or add it to docker chain `iptables -I DOCKER-USER -p tcp --dport 80 -j DROP`
Docker add 2 custom chains `DOCKER-USER & DOCKER` and ensures that all incoming requests are validated by this chain first.
If you want your rules to be evaluated before docker rules add them to `DOCKER-USER` chain.
You can run docker with `--iptables=false`, this would prevent docker from modifying iptables. But this will break docker networking.

There are several networking drivers that you can specify in `network_mode` prop:
* bridge - default driver, use when your containers need to communicate with one another.
Containers connected to same bridge can communicate with each other, while to be isolated from all other containers.
* host - use host machine networking. You don't need to use port binding in this case, cause your docker port would be available as host port.
* overlay - create network between instances run from different docker daemons (or between swarm and standalone docker)

### Services
###### Corretto 
It's free amazon implementation of Java SE specification.
As you know there are confusion around java SE. Oracle provides 2 java se implementations
* OpenJDK - free
* OracleJDK - paid
Yet there are some features in OpenJDK that can be of charge. that's why you may want to use other java se implementations like
* Amazon Corretto
* AdoptOpenJDK
* Azul Zulu
If you are still confuse you can take a look at [java is still free](https://www.infoq.com/news/2018/09/java-support-options-sept18)

###### CloudFormation 
It's aws solution to IAC. There are 2 concepts:
* template - json/yaml file with describe desired infrastructure
* stack - template deployed to cloud (you can run commands like describe/list/create/update stack). If you create/update stack and errors occur all would be rolled back and you can be notified by SNS
SAM (Serverless Application Model) - framework to build serverless apps, provide a shorthand syntax to write IAC using yaml templates. Later it anyway transformed into CF full template, so you can just learn CF and stick with it.
[sam local](https://github.com/aws/aws-sam-cli) - cli tool to test lambda locally, simulate s3/dynamoDB/kinesis/sns, it uses built-in CodeBuild/CodeDeploy to build and deploy app to cloud.
Supported formats are JSON/YAML. Resource naming is supported not for all product, this is due to possible naming conflicts (when you update template, some resources would be recreated, but if names are not updated error would happen).
To assign real name, you use stack + logical name, this ensures unique names. You can add deletion policy (for example you delete stack and want to preserve s3 buckets and take RDS snapshot).
CF Registry - managed service that lets you register, use, and discover AWS and third party resource providers. You can use conditions inside templates (for example create ec2 based on input params).
Don't confuse nested stack and imported stack:
* nested stack - you put one stack into another (main) by using `AWS::CloudFormation::Stack` and create only 1 stack (main). And this stack would create dependent first. It's the same as have 1 file, you just separate code, yet in aws your stacks would be divided into main and nested.
* imported stack (Cross-Stack References) - you create 2 separate stacks with different names, and inside main you call resources from dependee stack by using `!ImportValue !Sub "${stackName}-SubnetID"`.
In both cases your first stack should export resources, by using `Outputs`, that you want to use in main stack.
By default CF use the same permission as user has (so if user can't create ec2 instances and template should create new ec2, this template would fail).
But you can assign IAM role to CF, and in this case it would use permissions from this role. To create stack with assumed role you should pass param to cli like `--role-arn={youRoleForCloudFormationARN}`.
If you don't specify `role-arn`, aws will use previous role. If it first time it will use temporary session that is generated from user (one who is creating the stack) credentials.
For multi-env deployment (where you have dev/prod env or more) you should use single reusable template file (don't create new template file for each env, cause you will end up in a mess). 
You can achieve reusability by adding params/mappings/conditions section into your template. Then you just create 2 stacks with different names (dev/prod) and different params but with single template file.
Use dynamic references, never store secrets in your stack template. If you need secrets you should store them in aws secrets and just reference them from your template by using `'{{resolve:service-name:reference-key}}'`.
Good practice is to set params constraints, by using `AllowedValues`. In this way you are guarantee that param would be some expected value.
You can create rules with CF Guard (cfn-guard - open source CLI tool) that can ensure that your stack is compliant (for example: all ebs volumes should be only encrypted). In case rule failed, stack won't be created.
Best practice is to divide your infra into several stacks. There are 2 approaches:
* multi-layered architecture - horizontal structure where one layer depends upon another by using nested stacks (you divide all your services into 3 stacks - networking/computing/rds => computing layer depends on networking, cause you create ec2 instances in some vpc and subnet)
* SOA (service-oriented architecture) - you stacks are separated not by technical layers but by services (each service has a separate stack with it's own networking/computing/rds).
Layered Architecture usually has 3 layers:
* Presentations (controllers)
* Business Logic (services)
* Database (models/domain objects/dto)
Presentation depends(can access) on Business Logic and it depends(can access) on Database, but no the other way around.
There are other 2 types of architecture:
* hexagonal
* onion
But generally they resemble layered style, only difference they divide core (domain objects + services) and outer object (ui, database) and they are connected by using port (on core side) + adapter (on outer side)
AWS-specific parameter types: If you need to pass param as ec2 key name, you can pass it as string, but if this key doesn't exist, you template would be half-created and aborted. 
This is what for aws specific param types. If you set param type, not just `string`, but `AWS::EC2::KeyPair::KeyName`
CF would first check that the key with such name exists (in region), and only after this would start to create your stack. 
Name of ssh key is not the only one, here is full list of [AWS-specific parameter types](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-specific-parameter-types)
Internally CF is nothing but a service that parse your JSON/YAML, creates dependency graph and turn it into aws API calls (from bottom to top so dependencies would work).
CF uses declarative approach, cause you declare how your stack should look like, you are not telling what CF should do to in order to build it (imperative approach).
DD (Drift Detection) - find difference between template values and actual property values in aws (can happen if someone change resource directly from console/cli). 
DD only checks values explicitly set in template, it doesn't check default values (so if you change some default property directly from console/cli, DD won't find it).
If you want include default props into DD result you should add all these default properties into CF template.
Macros - allows you to customize templates. You write lambda that execute before template run and modify it (substitute variables, add new fields to objects). There are 2 types:
* template level - applied to whole template (all parameters/resources)
* snippet level - applied to single resource
Custom resource - ability to create resource not supported by cf. When cf execute templates, and meet custom resource it call your lambda with your custom logic run. You can use it:
* provision aws resource not supported by cf, like dynamodb global table, [full list](https://github.com/cfntools/cloudformation-gaps/projects/1)
* provision non-aws resource with cf, like github webhook (in case you want to use github for your ci/ci instead of codeCommit)
* provision something not related to infra, like run migrations
Custom resource handler - executed in async callback model, that means cf run it but doesn't wait for response, instead you are given pre-sign s3 url, where you have to upload json result once you are done.
As with all resources you have to implement logic for these 3 steps: create/update/delete. You can use [this node.js library](https://github.com/andrew-templeton/cfn-lambda) to simplify writing custom resource handler.
You create custom resource with `Type: Custom::YouCustomResourceName` with at least one property `ServiceToken: {LAMBDA_ARN}`. When cf execute your lambda you are given event with `ResponseURL` - s3 pre-sign url where you have to put json after execution.
Example of event for lambda
```
{
    "RequestType": "Create",
    "ServiceToken": "arn:aws:lambda:us-east-1:{ACCOUNT_ID}:function:example-CustomResourceLambda-4RWJOUFLIPGA",
    "ResponseURL": "https://cloudformation-custom-resource-response-useast1.s3.amazonaws.com/...",
    "StackId": "arn:aws:cloudformation:us-east-1:{ACCOUNT_ID}:stack/example/85e457b0-1383-11eb-a18a-0e09773e6f3f",
    "RequestId": "5d022657-3843-4f4e-8b6b-a04ed99f49a7",
    "LogicalResourceId": "GithubWebhook",
    "ResourceType": "Custom::GithubWebhook",
    "ResourceProperties": {
        "ServiceToken": "arn:aws:lambda:us-east-1:{ACCOUNT_ID}:function:example-CustomResourceLambda-4RWJOUFLIPGA",
        "Tags": [
            {
                "Value": "example-GithubWebhook",
                "Key": "Name"
            }
        ],
        "Name": "GithubWebhook"
    }
}
```
Make sure you have logic to update `ResponseURL`, otherwise stack that use your lambda would be stuck in `UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS` state. 
Description - first level tag, where you can put template description, max size 1024 symbols (if you try to exceed limit you will got exception `An error occurred (ValidationError) when calling the UpdateStack operation: Template format error: 'Description' length is greater than 1024.`)

###### IAM
There are 3 types of permission:
* user - permission for single iam entity
* group - collection of permissions that you can assign. Used to define users. One user can belong to multiple groups. It's a best practice to use group even if you have one user in it.
* role - collection of permissions for specific aws service (for example ec2 can connect to s3 without any secret key). You can also create role for user, but user will have to assume this role
EC2 role access - you can add (for example bucket write access) role to ec2 instance. Instance Profile - container for an IAM role that you can use to pass role information to an EC2.
IAM user - `who am I` & `what can I do`. But role is just `what can I do`. So for ec2 to use role it should become type of iam instance, that's why we create instance profile.
When you create ec2 role from console, instance profile automatically created with same name. But if you are using CLI/CloudFormation you have to manually create it `AWS::IAM::InstanceProfile` and assign it to ec2 using `IamInstanceProfile`.
With role you should provide Access token and Session Token
So if user is assigned to 2 groups he would get all permissions from 2 groups at the same time, but if he assigned 2 roles, he can use only one at a time (by assuming one role)
There are 2 types of tokens:
* Access token - combination of Access Key ID (20 chars) + Secret Access Key (40 characters)
aws prevents replay attack by using timestamp in signature and if request older that 15 min, it's rejected.
* Session Token - temporary session token to authenticate
Policy - define the permissions for a user, group, or role. Resource is defined with following format `"arn:aws:service:region:account-id:[resourcetype:]resource"`.
Resource examples:
```
Amazon S3 Bucket        arn:aws:s3:us-east-1:ACCOUNT_ID:my_aws_bucket/*
IAM User                arn:aws:iam:us-east-1:ACCOUNT_ID:user/Jack
Amazon DynamoDB Table   arn:aws:dynamodb:us-east-1:ACCOUNT_ID:table/myTable
```
Don't confuse:
* AssumeRole - ability of principal to assume other role for himself
* PassRole - ability of principal create resource (lambda/ec2) and pass role to this resource
If principal doesn't have `PassRole` permission, and try to create ec2 with role, he will get `is not authorized to perform: iam:PassRole on resource`. 
Below example of policy to allow principal to create only ec2 with only specific role
```
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": "iam:PassRole",
            "Resource": "arn:aws:::{ACCOUNT_ID}:role/MyInstanceRole",
            "Condition": {
                "StringEquals": {"iam:PassedToService": "ec2.amazonaws.com"}
            }
        }
    ]
}
```
Don't confuse:
* Notaction - opposite of Action, can be used with Allow/Deny
Notaction+Allow - add access to all actions except those under Notaction
Good example to allow all actions on s3 except delete bucket:
```
"Effect": "Allow",
"NotAction": "s3:DeleteBucket",
"Resource": "arn:aws:s3:::*",
```
NotAction+Deny - deny access to all actions except those under Notaction. Notice that this action doesn't give any rights on actions inside Notaction. You still should add explicit allow. 
It only explicitly deny to all other actions except those under Notaction.
* Deny - type of Effect
same way you can use NotAction/NotResource/NotPrincipal.
For example if you want to limit s3 to specific users. Of course you can create deny for all current users, but in this case once somebody add new user with `s3:*` action, he will get access.
So instead of explicitly deny to all users you can use Deny+NotPrincipal. In this case you would deny to all users except your desired user.
This approach is bit difficult for roles, cause role principal is defined by 2 arn:
* role arn -              arn:aws:iam::{ACCOUNT_ID}:role/roleName
* assumed role user arn - arn:aws:sts::{ACCOUNT_ID}:assumed-role/roleName/roleSessionName  (roleSessionName - can be changed depending who is assuming this role)
The problem is that Principal/NotPrincipal doesn't support wildcard. But you can use conditions
```
Effect: Deny
Principal: "*"
Action: "s3:*"
Resource: [arn:aws:s3:::MyExampleBucket, arn:aws:s3:::MyExampleBucket/*]
Condition:
    StringNotLike
        aws:userId": [AROAEXAMPLEID:*, 111111111111]
```
Here we set role with wildcard and root, in case role would be deleted (otherwise access to bucket would be lost). You can use both roleId and userId here:
* get roleId `aws iam get-role --role-name=rolename` - extract Role.RoleId
* get userId `aws iam get-user --user-name=username` - extract User.UserId
Role for user:
* create role `S3Viewer` of type: Another AWS Account (enter desired accountID or your own) and assign policy  `AmazonS3ReadOnlyAccess`
* create new policy `AssumeS3ViewerRole`
```
{
    "Version": "2012-10-17",
    "Statement": {
        "Effect": "Allow",
        "Action": "sts:AssumeRole",
        "Resource": "arn:aws:iam::ACCOUNT_ID:role/S3Viewer"
    }
}
```
* create user `jack` with both console & programmatic access, and  attach `AssumeRoleForS3` & `AmazonEC2ReadOnlyAccess` policies to it
* add user to cli `aws configure --profile=jack`
* You can run `aws ec2 describe-instances --profile=jack` and see results. But if you run `aws s3 ls --profile=jack` you will got error, cause your user has not permission to view buckets
* You can get temporal credential for role by `aws sts assume-role --role-arn=arn:aws:iam::ACCOUNT_ID:role/S3Viewer --role-session-name=mysession --profile=jack`
```
{
    "Credentials": {
        "AccessKeyId": "...",
        "SecretAccessKey": "...",
        "SessionToken": "...",
        "Expiration": "2020-07-15T08:20:57Z"
    },
    "AssumedRoleUser": {
        "AssumedRoleId": "...:mysession",
        "Arn": "arn:aws:sts::ACCOUNT_ID:assumed-role/S3Viewer/mysession"
    }
}
```
Note `...` - some secret code
* If you need constant access add to `~/.aws/config`
```
[profile jackS3Viewer]
region = us-east-1
role_arn = arn:aws:iam::ACCOUNT_ID:role/S3Viewer
source_profile = jack
```
Now if you run `aws s3 ls --profile=jackS3Viewer` you get a list of buckets, but if you run `aws ec2 describe-instances --profile=jackS3Viewer` you got `UnauthorizedOperation`, cause this role can only view s3 buckets.
* To use assumed role from SDK you have to use `AWSSecurityTokenService` to get temporary credentials, [example here](https://docs.aws.amazon.com/AmazonS3/latest/dev/AuthUsingTempSessionTokenJava.html)
So in Spring you just create 2 configs (based on Profile) and in local config add this logic to obtain temporal credentials. This way will allows for local development
You can also create a policy to forbid deletion of s3 for example. In this case evan administrator/root can't delete a bucket.
When you work with beanstalk, it creates bucket to store files with such a policy. So even if you are admin you can't just delete it.
If you want to delete it you should go to permission->bucket policy and remove this policy. After this you can easily delete a bucket.
```
{
    "Effect": "Deny",
    "Principal": {
        "AWS": "*"
    },
    "Action": "s3:DeleteBucket",
    "Resource": "arn:aws:s3:::you-bucket-name"
}
```
You can create policy that allows some action only with MFA, for this you should add mfa condition
You can assume only 1 role at a time. So if you want to assume 2 roles, it would be 2 different set of permissions, you can't make any union operation on them.
Moreover in cli you can add profiles only for single role. If you try to add profile for 2 or more roles like
```
[profile jackViewer]
region = us-east-1
role_arn = arn:aws:iam::ACCOUNT_ID:role/S3Viewer
role_arn = arn:aws:iam::ACCOUNT_ID:role/Ec2Viewer                                         
source_profile = jack
```
When you try to run any command you will get `configparser.DuplicateOptionError: While reading from '/home/diman/.aws/config' [line 38]: option 'role_arn' in section 'profile jackViewer' already exists`
So [as explained here](https://stackoverflow.com/questions/48876077/assume-multiple-aws-iam-roles-are-a-single-time) role assuming is one at a time operation, and in case you need union (like you need to load 2 athena tables from 2 accounts)
you have to use some sort of custom loader (using java sdk) and load them one by one assuming one role at a time.
If you need really fine-grained control you can create policy to access s3 or ec2 by name or tag, and divide access based on evn (For example all dev s3/ec2 can be accessed for dev role, but prod only to admin)
Yet there are some limitation, [take a look](https://stackoverflow.com/a/18956581), to work with s3 buckets you need to add `ListAllMyBuckets` for all buckets. So if you want to create a policy to work with single bucket
```
{
    "Statement": [
        {
            "Effect": "Allow",
            "Action": "s3:ListAllMyBuckets",
            "Resource": "arn:aws:s3:::*"
        },
        {
            "Effect": "Allow",
            "Action": "s3:*",
            "Resource": [
                "arn:aws:s3:::bucket-name",
                "arn:aws:s3:::bucket-name/*"
            ]
        }
    ]
}
```
You can restrict any resource by 2FA using
* MultiFactorAuthPresent (existence) - if user used 2FA. The key is only present when the user authenticates with short-term credentials, for long-term value=null.
* MultiFactorAuthAge (duration) - numeric value how long ago short-term credentials with 2FA were created. If credentials were created without 2FA, value=null.
Limit access by number of seconds, when otp code was set. `"Condition":{"NumericLessThan":{"aws:MultiFactorAuthAge":"30"}}` - set restriction that would allow access only if you enter 2FA 30 or less seconds from the time of the api call
Examples:
* Allow/`"Condition":{"Bool":{"aws:MultiFactorAuthPresent":"true"}}` - true if user used 2FA
* Deny/`"Condition":{"BoolIfExists":{"aws:MultiFactorAuthPresent":"false"}}` - true if user not used 2FA
because for short-term without 2FA value=false -> false=false => true, for long-term without 2FA value=null -> immediately return true
* Allow/`"Condition":{"Null":{"aws:MultiFactorAuthAge":"false"}}` - null check if condition key is present. true - key doesn't exist. false - key present and not null.
* Deny/`"Condition":{"Null":{ "aws:MultiFactorAuthAge":true}}` - true if 2FA not present. Null evaluates to true if key value is null.
Anti-pattern:
* Allow/`"Condition":{"Null":{"aws:MultiFactorAuthPresent":"false"}}` true if request made with temp-credentials (even without 2FA), false for all long-term credentials
* Deny/`"Condition":{"Bool":{"aws:MultiFactorAuthPresent":"false"}}` true if use not used 2FA with short-term credentials, false with long-term (users would be able to access resources without 2FA with just simple long-term credentials)
because for short-term without 2FA value=false -> false=false => true, for long-term without 2FA - null!=false => false
[See here](https://github.com/dgaydukov/cert-spring5/blob/master/files/spring5.md#aws-access-with-2fa) java details.
`getSessionToken` api require that you supply OTP code, otherwise you get AccessDeniedException. There is no iam permission for this call. All users with valid MFA can call this api
Please notice that although 2FA required to login to console, if you are using cli/sdk and you just add access policy without 2FA condition, you can access these resources without 2FA.
To avoid this, it's better not to assign access policy to user/group, but instead assign them to role, and add `{"Bool": {"aws:MultiFactorAuthPresent": "true"}}` condition to role.
In this case you have single point of entry - role with 2FA.
short term vs long term credentials:
* long term - your aws accessId/accessKey that you generate for iam user. They always stay the same
* short term - aws accessId/accessKey/sessionToken - that generated by api `get-session-token/sts-assume-role` and valid for certain duration like 1 hour
User would still be able to list all buckets.
Due to this limitations, sometimes it's better to create multiple aws accounts (dev/prod) to divide access, and make sure that nobody from developers has access to prod env.
You can define permissions by assigning policies to group/user. There are 2 types of policy
* aws managed - most common policies created by aws (for example s3/ec2 access and so on...)
* managed by you - custom policies created by end user
Permission evaluation:
* by default deny is applied
* if any explicit deny found evaluation is stopped and deny applied
* if any explicit allow found evaluation continue until it's find deny - then deny applied, or not found deny - allow applied
* if neither deny/allow find than default deny applied
Federation - process to move authentication/authorization into third party to handle, so you get token from user which you verify against third party provider.
Identity federation - grant to external identities ability to secure access aws (both management console & API) without creating iam users. External identities can be of 3 types (2 created from iam console by adding identity provider, 1 from cognito):
* SAML - corporate IdP (microsoft AD, aws AD). ADFS (Active Directory Federation Services) - used to connect AD to iam using SAML protocol. When you create role choose SAML type.
* OpenId Connect - web IdP (cognito, facebook, google or any other openId connect). When you create role choose web identity type.
* cognito IdP - use cogntio identity to get temporary aws credentials (you don't need to identity provider through iam console). When create role choose web identity type and select cognito as IdP~~~~~~~~
FU (Federated user) - user of such external identity who can access aws services but don't have corresponding iam user (so it managed outside aws iam)
FU can access aws management console in 2 ways
* programmatically request security credentials and put them into sign-in request to the AWS
* post SAML assertion directly to [AWS sign-in](https://signin.aws.amazon.com/saml)
But both allows federated user to access the console without having to sign in with a user name and password
FU assume iam role and can access aws resources based on this role. Access is intersection of 2 policies (one passed within request + another from iam role).
So FU request access with some policy attached and his iam role also has some policy they intersect and this is his policy inside aws.
Principal - IAM identity (user/group/role) that can interact with aws
* can be permanent/temporary
* can be represented by human/application
* can be root user / iam user / role
Policy - json file with permission which you attach to IAM identity or aws resource (some resources can have it's own access policy, like s3 bucket policy - where you can define which user which action should take).
Resource policy - policy for single resource:
* s3 bucket policy
* SQS Access Control
Main difference between identity and resource policy is that identity policy doesn't have `Principal` attribute, cause you link it to some iam identity which would be it's principal.
Contrary to this resource policy have `Principal` attribute where you define to which user this policy is applied. Generally you should use identity policies cause you can define access to multiple resources there, where for resource policy access is limited to this resource only.
One example where resource policy is useful is when you need to add simple way to grant cross-account access to your S3 environment without creating iam role.
Evaluating of identity-based & resource-based policies:
* if at lease 1 explicit allow in either one or in both => allow
* explicit deny always overwrites all allows (so if you have deny in one and allow in another, deny will always overwrite)
There are 6 policy types:
* Identity-based policies - for iam identity
* Resource-based policies - define policies separately for aws resources like s3 bucket policy (not all resources support this)
* Permissions boundaries - same policy as for identity, but added not as permission policy to iam identity but as permission boundary. Specify what permission user can potentially have.
Don't confuse resource-based policy and resource-level permission:
* resource-based policy - separate policy, added directly to resource and using `Principal` attribute to denote who can access this policy
* resource-level permission - `Resource` attribute for identity-based policy, indicates to which particular resources to apply this policy (not relevant to resource-based cause it's applied to specified resource already)
Note that not all action support resource-level permission. So if you create a policy to allow users to launch ec2 in specific region
```
Effect: Allow
Action: [ec2:*]
Resource: arn:aws:ec2:us-east-1:{ACCOUNT_ID}:instance/*
```
This won't work, cause `ec2:*` specified all actions, but not all ec2 actions support resource. So that's why this policy doesn't achive desired result.
Instead you should specify actions:
```
Effect: Allow
Action: [ec2:RunInstances, ec2:TerminateInstances, ec2:StopInstances, ec2:StartInstances]
Resource: arn:aws:ec2:us-east-1:{ACCOUNT_ID}:instance/*
```
But user still can't launch new instance in us-east-1 (although he can stop/start/terminate).
```
Effect: Allow
Action: [ec2:RunInstances]
Resource: [arn:aws:ec2:us-east-1:{ACCOUNT_ID}:instance/*",
            "arn:aws:ec2:us-east-1:{ACCOUNT_ID}:key-pair/*",
            "arn:aws:ec2:us-east-1:{ACCOUNT_ID}:security-group/*",
            "arn:aws:ec2:us-east-1:{ACCOUNT_ID}:volume/*",
            "arn:aws:ec2:us-east-1::image/ami-*"]
```
This policy will allow launch new instances in us-east-1 region.
So they don't actually give these permissions but merely state that this identity can potentially have up to these permission.
So the actual permission are calculated as intersection of permission policy & permission boundary. Whenever you create new iam identity (user/group/role) you can add actual permissions and permission boundaries.
The idea behind is that you can delegate responsibility to others (you can create policy that would allow identity to create iam users only with certain boundary => so all newly created users would have your predefined boundary, [example](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html#access_policies_boundaries-delegate))
* Organizations SCPs - AWS Organizations service control policy limit permissions that identity-based policies or resource-based policies grant to entities
* ACL (Access control lists) - control which principals in other accounts can access the resource to which the ACL is attached (so they only cross-account, cannot grant permissions to entities within the same account)
* Session policies - limit the permissions that the role or user's identity-based policies grant to the session
Condition operator - use it to set condition to policy:
* `...IfExists` - add it to the end of any condition operator name except `Null`. If key is present - process request as specified, if not - return true
* `Null` - if condition value is present. Only 2 values are possible: true - key doens't exists => policy evaluated to true, false - key exists => policy evaluated to false.
* `Bool` - if condition value is true or false. 
Condition key - a key that can be used in condition block:
* global keys - those started with `aws:` prefix. [List of global condition keys](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_condition-keys.html)
* service-specific key - started with prefix based on service like `iam:` or `sts:`. [Full list of service-specific condition keys](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html#context_keys_table)
ABAC (attribute-based access control) - policy conditions basically allows you to create access control based on attributes.
Policy version - required if you are using variables (like `${aws:username}`. If you leave version, variables are treated like literal values.

###### S3
S3 (Simple Storage Service) used for:
* store and distribute static web content (cause each object in s3 has unique http url)
* origin store for CDN (content delivery network) like CloudFront
* fast-growing websites to store user content (cause no storage provision is required, s3 enlarge automatically)
* host static websites
* data store for computation results, analytics, video transcoding
* durable & secure storage for backups and archives
Anti-pattern
* standalone posix filesystem (better to use EFS)
* when you need to search/filter data by some criteria (better to use RDS/DynamoDB/CloudSearch/ELK)
* data updated very frequently (better to use EBS/RDS/DynamoDB)
* archives with infrequent access (better to use Glacier)
* dynamic web-sites (better to use EC2/EFS)
You can upload/download file by parts
* multipart upload - your large file uploaded as parts, and on server they are assembled into single file
* partial download - use `Range` HTTP header in a GET request, you can retrieve a specific range of bytes from s3
```
# return full page => <h1>Hello world</h1>
curl https://my-test-s3-bucket-1.s3.amazonaws.com/index.html 

# get first 2 bytes (range is inclusive) => <h
curl -H "Range: bytes=0-1" https://my-test-s3-bucket-1.s3.amazonaws.com/index.html

# you can also use short form
curl -r 0-1 https://my-test-s3-bucket-1.s3.amazonaws.com/index.html
# both requests return 2 headers
# < Content-Range: bytes 0-1/20
# < Content-Length: 2
```
S3 security
* use s3/custom encryption to encrypt data before storing them on s3 and decrypt them when you download them
* use versioning to preserve, retrieve, and restore every version of every object stored in your Amazon S3 bucket
* enable mfa delete for bucket - it's part of versioning. So you can just enable versioning or enable versioning + mfa delete (you can't enable mfa delete without enable versioning).
mfa delete can be enabled only from cli (currently no way to enable it from web console). You should use root account (so you should activate mfa first for root account) cause only the bucket owner (root account) can enable MFA Delete.
`aws s3api put-bucket-versioning --bucket=my2fadeletebucket --versioning-configuration Status=Enabled,MFADelete=Enabled --mfa "arn:aws:iam::{ACCOUNT_ID}:mfa/root-account-mfa-device 882794" --profile=root`
If you use cli, don't forget to clean it after you set up mfa delete. Since mfa delete automatically enable versioning, if you just delete file it adds additional version with delete marker.  If you want permanently delete file you have to delete specific version.
You can't delete version from console, if you try you get `You can’t delete object versions because Multi-factor authentication (MFA) delete is enabled for this bucket. To modify MFA delete settings, use the AWS CLI, AWS SDK, or the Amazon S3 REST API.`. 
If you try to delete from cli without 2fa you will get `An error occurred (AccessDenied) when calling the DeleteObject operation: Mfa Authentication must be used for this request`. 
If you supply 2fa and run `aws s3api delete-object --bucket=my2fadeletebucket --key=dummy.pdf --version-id=hZaCTAcGEMX9tzF6MUfAq4obRq_AhWk8 --mfa="arn:aws:iam::{ACCOUNT_ID}:mfa/user2fa 547063" --profile=user2fa`
you will get `An error occurred (AccessDenied) when calling the DeleteObject operation: This operation may only be performed by the bucket owner`.
So only root user can delete versions from now on.
* use access logging to track who/which bucket/what action was executed on s3
Although s3 is object-based storage, you can easily emulate OS by creating objects like `path1/path2/file1`
S3/S3 IA/Glacier - replicate data across 3 AZ go guarantee data won't be lost in case of emergency.
There are 3 ways to secure buckets:
* use ACL (old feature) - to use this user should have permission to `s3:PutBucketAcl`.
acl can be applied to bucket or object. To read object you should apply acl directly to object, bucket acl are not inhereted to objects automatically.
acl can only add list/read/write access, no way to set deny. If you use acl + bucket policy, explicit deny overwrites all allows and acl too.
* use bucket policy (json file with policies)
* use iam policy
You can also turn on lifecycle management (move you files to glacier after 30 days)
Pre-sign url - use cli/sdk to create url with key, that is accessible for limited time, for:
* download - anybody can download file within some time
* upload - anybody can upload file into this url within some time
S3 is global service, although you assign a region to a bucket, you see all buckets across all regions
S3 accidental delete protection:
* add 2FA delete - user will need to enter 2FA code in order to delete
* add versioning - when file is deleted, new version `mark delete` is added, but original file is still stored with some version
Suppose we have 2 versions A and B (current) and delete file. In this case we would have A, B, C (mark delete, current). As you see file is preserved with some version.
Eventual consistency - since put/read is atomic, you won't read partially updated file, so you will either read old file or new file. Because s3 replicate data across several AZ, sometimes just after write you can read old file, but after some time new file would be available.
Although bucket name is global across all regions, you still select region when you create bucket, and actual data is stored in that particular region.
Using bucket policy you can specify from which ip (CIDR notation) and at what time you allow to access data.
Server access logs - you can enable them and see who is accessing your s3 (IP address/time/action(get/post/put)/response)
Event notification - you can send events (sns/sqs/lambda) base on s3 action (get/post/put). Take a look at `sa/cloudformation/s3-event.yml` for more details. There we call lambda when file was uploaded. Below is event exampmle
```
{
    "Records": [
        {
            "eventVersion": "2.1",
            "eventSource": "aws:s3",
            "awsRegion": "us-east-1",
            "eventTime": "2020-11-13T02:06:44.875Z",
            "eventName": "ObjectCreated:Put",
            "userIdentity": {
                "principalId": "AWS:AIDAXW6JAMSCQ5XBYR3LP"
            },
            "requestParameters": {
                "sourceIPAddress": "{USER_IP_ADDRESS}"
            },
            "responseElements": {
                "x-amz-request-id": "512C48E624067F44",
                "x-amz-id-2": "fbGuJV2V2IZy2QbmgWHPB/6nuNnMAjQus8nWaad+cBdskEEtr8BzX/qZDj2PfE2uoEDObOgfiPiAAAckICqL4f/w8J2KHikx"
            },
            "s3": {
                "s3SchemaVersion": "1.0",
                "configurationId": "a1f4ef63-00a3-4fad-ab27-e2ac99c8996b",
                "bucket": {
                    "name": "event-us-east-1-my-s3-policy-bucket-123",
                    "ownerIdentity": {
                        "principalId": "A2AZQBHGMZ77N2"
                    },
                    "arn": "arn:aws:s3:::event-us-east-1-my-s3-policy-bucket-123"
                },
                "object": {
                    "key": "yukon.pdf",
                    "size": 20597,
                    "eTag": "ff71372d153e50f36013168082e78b66",
                    "sequencer": "005FADEA3CBBC21AC1"
                }
            }
        }
    ]
}
```
Randomized named worked better cause when names are sequential all data store in the same place and it's harder to extract it. But you no longer have to randomize prefix naming for performance, and can use sequential date-based naming for your prefixes
To achieve better performance you should to use random names for objects, but [it's no longer required](https://aws.amazon.com/about-aws/whats-new/2018/07/amazon-s3-announces-increased-request-rate-performance). 
Storage Classes - can be configured at the object level and a single bucket can contain objects stored across Standard/Intelligent/Standard-IA/Single-Zone-IA
You can also use S3 Lifecycle policies to:
* automatically transition objects between storage classes without any application changes
* remove partially uploaded files (they are not removed by default, so if you don't have this policy you risk being spammed by these files)
Storage Class Analysis - filters that helps analyse access pattern for whole bucket or list of objects (go to management->analytics to analyze objects)
* Standard - low latency, high throughput, 3 AZ replication
* RRS (Reduced Redundancy Storage) - for non-critical data, durability - 4 nines - 99.99%. !important => s3 standard is cheaper now, so rrs is outdated, don't use it.
* Intelligent - when you don't know access pattern. It has 2 access types - frequent/infrequent, and based on access pattern moves objects between these 2 types and save money
* Standard-IA
* Single-Zone-IA - store data only inside single AZ
* Glacier - 4h to read data
* Glacier Deep Archive - 12h to read data
TA (Transfer Acceleration) - fast (up to 5 times) file transfer over long distances between on-premise and s3, by using CloudFront edge locations, so when you upload file to s3, it first goes to nearest edge location, and from there transferred to s3 using aws internal network.
To use TA your app should use `.s3-accelerate.amazonaws.com/.s3-accelerate.dualstack.amazonaws.com` endpoints. You can also use standard endpoints to access s3. So you can use different endpoints for standard and accelerated s3 access.
So use TA if you have geographically distributed customers or you constantly moves GB/TB of data across continents. If you file less than 1GB you should use CloudFront’s PUT/POST, otherwise use TA.
If you need to transfer large amount of data from single space, SnowBall can be a good option, cause TA is mostly for many users from different locations.
TA doesn't cache data in edge location, so if you want low latency then it's better to use plain cf distribution, cause in this case all files would be cached in all edge locations.
Replication - automatic & asynchronous copy of data between 2 s3 buckets, can be within same account or between different aws accounts. There are 2 types:
* SRR (Same-Region replication)
* CRR (Cross-Region replication)
CORS - ability to load data from `non-static url`. So for example if you use domain name to host content you may get error when try to load html/javascript files from s3. To get rid of error enable cors.
Below rule allows POST/DELETE cors requests from example.com origin. 
```
<CORSConfiguration>
 <CORSRule>
   <AllowedOrigin>http://www.example.com</AllowedOrigin>
   <AllowedMethod>POST</AllowedMethod>
   <AllowedMethod>DELETE</AllowedMethod>
   <AllowedHeader>*</AllowedHeader>
 </CORSRule>
</CORSConfiguration>
```
Useful elements:
* `AllowedMethod` can be one of GET/PUT/POST/DELETE/HEAD, if request is non-simple, OPTIONS automatically would work for such request (you shouldn't and can't add OPTIONS to AllowedMethod tag).
* `AllowedHeader` - specifies which headers are allowed in a preflight request in `Access-Control-Request-Headers` header
* `ExposeHeader` - header in the response that you want customers to be able to access from their applications
Object Lock - store objects using WORM (write-once-read-many), so you can prevent objects to be deleted/overwritten for some time or indefinitely. There are two retention modes:
* Governance mode - you can set permission to alter retention period or delete object (can be used for testing purpose before implementing compliance mode)
* Compliance mode - there is no way to delete/overwrite object in this mode, even for root user
In version enabled bucket each version can have it's own retention period. So you can update/delete object, but can't remove underlying versions.
You can retrieve (restoration) objects in s3 console (not glacier console, cause there is no vault created in glacier for lifecycle policy), specify number of days copy would be available in s3. Retrieval Options:
* bulk - 5-12 hours, cheapest
* standard - 3-5 hours
* expedited - 1-5 min, most expensive
When you restore object you should specify: Number of days the restored copy is available - during this time, when you go to object you would be able to download it using it normal url.
Policy to allow cloudTrail write
```
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Principal": {
                "Service": "cloudtrail.amazonaws.com"
            },
            "Action": "s3:GetBucketAcl",
            "Resource": "arn:aws:s3:::my-test-s3-bucket-1"
        },
        {
            "Effect": "Allow",
            "Principal": {
                "Service": "cloudtrail.amazonaws.com"
            },
            "Action": "s3:PutObject",
            "Resource": "arn:aws:s3:::my-test-s3-bucket-1/*",
            "Condition": {
                "StringEquals": {
                    "s3:x-amz-acl": "bucket-owner-full-control"
                }
            }
        }
    ]
}
```
`x-amz-acl` - special header that give full control to owner of account. So you have to call putObject with `aws s3 cp example.jpg s3://awsexamplebucket --acl bucket-owner-full-control`.
Versioning - if turn on, when you make any operation update/delete it create new version:
* update - old object stored with some version, new object created with new version. If you run get - you will get latest version, if you run get with version - you got your object.
* delete - object marked with delete marker, it still stored with some version. If you run get - you will get 404, if you run get with version - you got your object. 
You can't add delete marker, only if you use versioning and delete file, s3 add this market itself. 
You can permanently remove real object by specifying it's versionID in DELETE request. If you DELETE a delete marker, s3 would add another delete marker on top of this (so you have 2 versioned delete markers).
You can permanently remove delete marker by specifying it's versionID in DELETE request. In this case delete marker would be removed and from now simple GET request would return latest version of object (only object owner can DELETE delete marker).
presigned url access - determined by access of creator of such url:
* if creator of such url has read access - you can use this url to read
* if creator of such url can write - you can put object by this url
SSE (server side encryption) can be of 3 types:
* sse-s3 - keys are managed by s3
* sse-kms - keys are managed by kms (you select single key either managed by aws like aws/s3 or your CMK)
* sse-c - encrypt/decrypt with customer key - you have to provide key for every request get/put and s3 manage encryption (when you put object s3 encrypt it using provided key, when you get object - s3 decrypt object with your key from request). You have to use https + cli/sdk.
You provide key in [headers for each request](https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeysSSEUsingRESTAPI.html), when you use cli/sdk it's automatically done.
So when you have a requirement that customer want to manage key with sse you have to use this third option. In this case s3 manages encryption/decryption but you manage keys.
s3 cross-account access - there are 3 ways:
* use s3 resource policy - you will need to add policy in account B for user to be able to access bucket.
```
Version: 2012-10-17
Statement:
  - Effect: Allow
    Principal:
      AWS: arn:aws:iam::{ACCOUNT_B}:user/accountBusername
    Action:
      - s3:GetObject
      - s3:PutObject
      - s3:PutObjectAcl
    Resource:
      - arn:aws:s3:::AccountABucketName/*
```
* use s3 acl - use below xml policy to give cross-account access
```
<AccessControlPolicy xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <Owner>
    <ID>AccountACanonicalUserID</ID>
    <DisplayName>AccountADisplayName</DisplayName>
  </Owner>
  <AccessControlList>
    <Grant>
      <Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="CanonicalUser">
        <ID>AccountBCanonicalUserID</ID>
        <DisplayName>AccountBDisplayName</DisplayName>
      </Grantee>
      <Permission>FULL_CONTROL</Permission>
    </Grant>
  </AccessControlList>
</AccessControlPolicy>
```
* use iam cross-account role - create role in account A with ability to assume role for account B and policy to access s3 bucket
Read/write limits:
* 5500 GET per prefix
* 3500 POST/PUT/DELETE per prefix
So same rules as for dynamoDB (where read/writes per partition), so you can get unlimited read/write by creating many prefixes (number is not limited).

###### Glacier
Glacier - low-cost tape-drive storage value with $0.007 per gigabyte per month. Used to store backups that you don't need frequently.
Access to data can take from few minutes to a few hours. You store data as archives.
Vault - same as bucket for s3, actual place where your archives are stored. You control access by using iam identity or vault policy.
Vault Lock - compliance control policy like WORM (write-once-read-many) where you put object only once and lock applied and you can't overwrite it
Anti-pattern:
* rapidly changing data (use EBS/EFS/RDS/DynamoDB)
* immediate access (use S3)
You can also use multipart upload to speed up upload by dividing large files into chunks. Just like s3 you can use REST API to work with glacier
You can set up s3 lifecycle, after which objects from s3 would be moved to glacier (but to view/restore them you should use s3 console, cause there is no explicit vault for them in glacier, if you go to glacier console you see nothing)
You can retrieve up to 5% of your average monthly storage for free each month (rated daily), above this you are charged additional fee
Glacier Select - ability to run sql query directly in archive without prior retrieving of full archive. So now you can find only what you need instead of restoring full archive. 
Soon it would be integrated with Athena and Redshift Spectrum. Archives must be stored as uncompressed csv files. 
To query data you have to create select job and specify output s3 bucket where results would be delivered once job is completed.
You [can't upload file into glacier from console](https://docs.aws.amazon.com/amazonglacier/latest/dev/getting-started-upload-archive.html). So if you want to upload you have to use CLI/SDK.
For many cli commands you hve to pass `--account-id`, this is strange cause your credentials that you use to authenticate your requests already include accountId. Even documentation explicitly states `This value must match the AWS account ID associated with the credentials used to sign the request`.
So it looks like some relict from previous releases. But good thing we can use `-` instead of passing 12 digit number every time.
```
# list all vaults
aws glacier list-vaults --account-id=-
# upload file to vault. You get archiveId in response, which you should store in you db, so you can retreive this archive by it's id
aws glacier upload-archive --account-id=- --vault-name=test --body=file.txt
# command to initiate a job to get vault inventory (list of archives in a vault) - which is updated once per day. Save jobId by which you can retreive results when job is done
aws glacier initiate-job --account-id=- --vault-name=test --job-parameters='{"Type": "inventory-retrieval"}'
# you can list all current and recently complted jobs. After job is completed it would stay in this list for some time, but would be eventually removed from the list
aws glacier list-jobs --account-id=- --vault-name=test
# get job result. Depending on job type result can be downloaded file or inventory list. Job should be completed, otherwise you get error: The job is not currently available for download
aws glacier get-job-output --account-id=- --vault-name=test --job-id={JOB_ID} result.json
```
There is no lifecycle rules for glacier, they only available in s3.

###### EFS
EFS (Elastic File System) - delivers simple network filesystem for EC2. It supports NFSv4/4.1 (Network file system).
System size is grow as you add more files to file system. It allows parallel access from multiple EC2 within the same region.
It accessed by EC2 using mount targets which are created by AZ. If you need temporary storage EFS not the best option, look at EC2 Local Instance Store.
Mount helper - `amazon-efs-utils` utility that defines a new network file system type, called efs, which you can use with `mount` command
There are 2 performance modes (plz note that they both equivalent in term of price, so you can choose any, no price effect):
* General (if you need less then 7k file operation per second) - better to use if you need low latency
* Max I/O (if thousands of ec2 access same efs) - provide high I/O for trade-off of latency - not best scenario if low latency is required
There are 2 throughput modes:
* bursting - throughput scales as your efs size grows
* provisioned - you can provision desired throughput regardless of efs size (use it if amount of data is low, but access is high)
Notice that performance mode can be chosen during creation, and can't be changed after.
When you create efs it creates mount target in each az. Instances in each az talk to efs by using this mount targets.
To mount efs to ec2, mount helper should be installed and running `sudo yum install -y amazon-efs-utils`. You can mount it by `sudo mount -t efs fs-bc0a413f:/ ./mnt`.
For some AMI (Amazon Linux/RHEL/Ubuntu) it's already installed, you just need to start it. You can check the status by `sudo service nfs status`
By default anybody can read, but root (UID 0) user can write. You can also use Access Points to create dirs in your efs for different users to read/write.
You can also do `sudo chmod 777 /mnt/efs/` to give access to anybody to read/write. To check if directory is mounted to efs run `df /mnt/efs/`.
EFS has only 2 storage classes: standard & IA.
Lifecycle policy - move infrequently accessed files into Infrequent Access (IA) storage class after some period (For example file hasn't been access for 7 days, let's move it).
There are 2 types of encryption:
* encryption at rest - created by default when you create new efs, use kms to encrypt data before write them on disk. Be default `aws/elasticfilesystem` key is used. You can also choose your own CMK.
You can force iam user to create efs only with encryption enabled. You should assign following iam policy to this user with special condition
```
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": "elasticfilesystem:CreateFileSystem",
            "Condition": {
                "Bool": {
                    "elasticfilesystem:Encrypted": "true"
                }
            },
            "Resource": "*"
        }
    ]
}
```
* encryption in transit - you should enable TLS when you mount folder with mount helper which initialize `stunnel` to use tls. You should add tls option when you mount system `sudo mount -t efs -o tls fs-bc0a413f:/ ./mnt`.
When you mount using tls, it would be mounted to localhost using stunnel. If you run `df -hT` you will see
```
fs-a1bee823.efs.us-east-1.amazonaws.com:/ nfs4      8.0E     0  8.0E   0% /mnt/efs
127.0.0.1:/                               nfs4      8.0E     0  8.0E   0% /mnt/pnt
```
If you run `mount | column -t | grep nfs4`
```
fs-a1bee823.efs.us-east-1.amazonaws.com:/  on  /mnt/efs                         type  nfs4        (rw,relatime,vers=4.1,rsize=1048576,wsize=1048576,namlen=255,hard,noresvport,proto=tcp,timeo=600,retrans=2,sec=sys,clientaddr=10.100.1.148,local_lock=none,addr=10.100.1.9)
127.0.0.1:/                                on  /mnt/pnt                         type  nfs4        (rw,relatime,vers=4.1,rsize=1048576,wsize=1048576,namlen=255,hard,noresvport,proto=tcp,port=20391,timeo=600,retrans=2,sec=sys,clientaddr=127.0.0.1,local_lock=none,addr=127.0.0.1)
```
As you see it mounted on port `port=20391`, which is port of stunnel.
IAM access:
* by default efs open to anybody
* you can set efs resource policy to deny all access and create iam role to allow (role would overwrite resource policy) and then assign this role to specific ec2
* You must use tls when access with iam: `sudo mount -t efs -o tls,iam file-system-id efs-mount-point/`
You can set up resource policy so you can mount only with tls enabled
```
Statement:
  - Effect: Allow
    Action:
      - "elasticfilesystem:Client*"
    Principal: '*'
    Condition:
      Bool:
        "aws:SecureTransport": true
```
So if you run without tls you would get `mount.nfs4: Operation not permitted`

###### EBS
EBS (Elastic Block Storage) - simple block storage for EC2. After EBS is attached to EC2 you can format it with desired file system.
It automatically replicated within AZ to provide higher durability (yet if AZ failed it would be unaccessible).
Most AMI (Amazon Machine Images) are backed by Amazon EBS, and use an EBS volume to boot EC2 instances.
You can attach multiple EBS to single EC2, but single EBS can only be attached to 1 EC2 at the same time.
EBS allows to create point-in-time snapshots (backup) and store them in s3.
You can make snapshot available to other aws accounts so they can create ec2 from it.
Snapshots are store in amazon s3 bucket (not in your bucket, so you don't have full control of it, you can't go to bucket and download snapshot) yet you can:
* create & delete
* recover
* copy to other region
If you copy snapshot with another CMK - complete new non-incremental copy of snapshot is created.
When you take snapshot of running ebs, it would be available immediately (there is no delay).
But when you recover snapshot ebs is read immediately, but data is loaded lazily.
IOPS vs Throughput vs Bandwidth
* IOPS - number of read/write operations per second, good for transactional db where we need to make lot of small writes
    * General Purpose SSD (gp2) - boot volumes, low-latency apps
    * Provisioned IOPS SSD (io1) - transactional & NoSql db
* Throughput - number of bits read/written per second
    * Throughput Optimized HDD (st1) - log processing, big data, data warehouse, kafka, media transcoding. 
    * Cold HDD (sc1) - file sharing, archive storage. 
Type    Size           IOPS                    Throughput
gp2     1GB-16TB       16,000 (16 KiB I/O)     250 MiB/s
io1     4GB-16TB       64,000 (16 KiB I/O)     1,000 MiB/s
st1     500GB-16TB     500 (1 MiB I/O)         500 MiB/s
sc1     500GB-16TB     250 (1 MiB I/O)         250 MiB/s
Now you see that IOPS is for many writes of small data, but Throughput for small number of writes but of large amount. But in the end total throughput is approx the same.
* Bandwidth - pipe, throughput - water running through pipe
EBS Volume Types
* HDD (large streaming workloads where throughput (measured in MiB/s) is a better performance measure than IOPS.
It has a platter and actuator arm that moves around platter and read/write (just like cd player) since to read/write arm should have a lots of movement - it's bad for high I/O
* SSD (frequent read/write operations with small I/O size) - like a flash card, no moving parts
You can use `iostat/blktrace/btt` to examine volume performance.
Nitro Card for EBS - provides same speed for both encrypted & unencrypted volumes. So there is no trade-off between speed & security.
Since you can't encrypt volume after you attached it to ec2, so in order to create encrypted volume for running ec2 you have to:
1. take snapshot of unencrypted volume
2. create copy and tick `encryption option`
3. create ami from encrypted snapshot
4. run new ec2 from created ami & remove current ec2
Root ebs is already mounted, but if you add second/third and so on... you have to manually mount them (instance store is mounted automatically although root is still ebs)
```
# create new fs
sudo mkfs -t ext4 /dev/xvdb

# create dir and mount
sudo mkdir /mnt/volume
sudo mount /dev/xvdb /mnt/volume

# check mounted devices
df -h

# check write & read performance (first we write 1GB file to mounted ebs, then we read it)
sudo dd if=/dev/zero of=/mnt/volume/tmpfile bs=1M count=1024
sudo dd if=/mnt/volume/tmpfile of=/dev/null bs=1M count=1024
```
Multi-volume snapshots - point-in-time snapshots for all ebs volumes attached to an ec2. After creation each snapshot treated as separate one.
It's a best practice to tag multi-volume snapshots so you can manage them as single entity.
DLM (Data Lifecycle Manager) - manage the lifecycle of ebs snapshot. If you combine it with CloudWatch and CloudTrail you get complete backup solution for ebs.
You can create/manage snapshots manually but using DLM is best practice. DLM execute snapshot management based on policies defined when you create dlm.
When you create snapshot policy you have to enter:
* resource type: VOLUME - for single ebs volume, INSTANCE - for all ebs volumes for ec2 (multi-volume snapshot)
* target tags - tags for ebs volume or ec2 instance for which this policy would be applied
* schedules - start time when run snapshot creation. You have 1 mandatory schedule and 3 optional - so you can create snapshots at different frequency using single policy.
If several schedules trigger at the same time, DLM will create only 1 snapshot.
* retention - how to retain, you can use either based on total count (retain last 5 snapshots) or age (for how long you would like to keep snapshots)
Snapshot deletion may not reduce costs, cause snapshot is incremental backup, and if other snapshot use same data, when you delete snapshot - you in no way change total size.
Suppose we have 3 snapshots:
* A - 10GB
* B - 4GB (4GB was overwritten)
* C - 2GB (2GB of new data has been added)
So totally - 16GB.
If you remove A - only 4GB would be removed, cause 6 is still used by others.
If you remove B - nothing would be removed, cause 4GB of B is still used by latest snapshot.

###### EC2 Instance Store
Similar to EBS, but located on the same machine as EC2 (EBS connected through network), available only during lifetime of EC2.
So it's not durable, once EC2 instance stop/restart/fail all data would be lost.
It's not available for all ec2 types, only for [some of them](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes)
You still have to use at lease 1 EBS + additional instance store. For some types you can select to remove instance store, but ebs should be present always.
So you can't create ec2 without ebs. It's differ from EBS cause it's directly attach to machine (ebs connected via network) and provide lowest latency.

###### CloudFront
CloudFront is a CDN (content delivery/distribution network) - that speed up the distribution of your data using edge locations.
When user request content, CF use nearest edge location and deliver cached version, it's faster than transfer data directly from data center.
If content not in cache, CF retrieve it directly from s3 or HTTP and cache it. CF is not durable storage, it's just an edge cache.
To work with CF you should create origin server Then you add you origin server to CF, and CF generate link for you.
Origin server can be:
* static (s3)
* dynamic (ec2/elb or any other on-premise http server, also called custom origin)
Later when user request this link CF check the closest edge location for data, and if found in cache - return, if not request it from origin server and cache it.
To ensure origin availability you can add backup origin and configure CF in case it get 4xx/5xx response from main origin, to use backup origin.
Edge cache is smart, it can remove less popular content to make room for other data.
You can also use Geo Restriction to specify at which countries content should be 403 (Forbidden), you can also add custom error code and message.
You can control expire date (when CF will check origin server for new version) by setting cache control header (by default 24 hours).
You can delete item from CF by:
* delete it from origin server, and when expire date come it would be deleted from CF
* use invalidating api to remove file from CF immediately
CF doesn't cache following requests: POST/PUT/DELETE/PATCH. By default cache is stored for 24 hours, but you can evict it by calling invalidation API.
You can also use versioning (`/v1/img/test.png`). In this case once you update your site users will use new versions that not in CF, and edge location will download it from origin server.
You can serve content from multiple origin servers. Field-Level Encryption - encrypt user's upload data and transfer these encrypted data to your origin.
Lambda Edge - lambda functions that allows you to override behavior of request/response to your cf edge locations. You can solve common tasks like only cognito authenticated user can view content or visitor prioritization on a website.
You create single lambda in 1 region, and associate it with cf distribution. After this all global requests are handled by this lambda. There are 4 types of lambda edge:
* viewer request - when CF receive request from user
* origin request - before CF forward request to origin server
* origin response - when CF receive response from origin server
* viewer response - before CF responds to viewer
You can protect CF data by using:
* Signed url (like presigned s3 url) - temporary access to CF data. Support both web & RTMP distribution.
* Signed cookie - you can access multiple CF objects with same signed cookie. So use this method if you want to have access to multiple files with same cookie, and want to use standard url (without any signature as url params). Not supported for RTMP distribution.
When creating signed url/cookie you can set 3 params:
* end-datetime   (mandatory) - we need to know when access to particular file is over
* start-datetime (optional)
* ip-address     (optional) - single IP address or IP range
In order to create presigned url you need to create CF keypair. You can do it only as root account (iam user won't work in this case). Login as root, go to `Account=>Security Credentials`, from there go to `CloudFront key pairs` and create new key pair.
Don't confuse it with ec2 key pairs and with CF public key. They both for different purpose.
You can make CF private by setting `Restrict Viewer Access` to yes (in this case you can also set which accounts can create signed urls, so other accounts can also generate urls to access data).
So if you restrict access and try to access url you got error `Missing Key-Pair-Id query parameter or cookie value`.
You can create presigned url with following command `aws cloudfront sign --url=https://d3l9m9kf4m2kpm.cloudfront.net/info.html --key-pair-id=APKAJDZCS7VF4FG32EWA  --private-key=file://cfkey.pem  --date-less-than=2020-08-19` (this command is local and doesn't call aws api, so we don't need to pass profile)
This will create signed url by which you can access your data from CF.
You can also use CF to distribute dynamic content (like ec2/api requests). Although at first it seems unreasonable cause for every dynamic request CF should forward it to underlying ec2.
But the point is that such a request from user goes to closest edge location and terminates there. From there on it goes not through public internet but through aws cross-region private link.
That improve speed and give security. As you see this is basically the same as Global Accelerator.
You have 2 types of distribution: 
* web - static web content (files/pics)
* RTMP - streaming media
If you create distribution to be accessed from dns name you should add all possible urls to cname in CF. If you are going to access it from example.com/www.example.com/photos.example.com, all 3 dns names should be added to Cname names when you create distribution.
OAI (Origin Access Identity) - CF user that can access origin. To access s3 from CF you should add bucket policy (but you don't need to allow public access).
But if you do this user can access your s3 files by s3 url like `https://my-test-s3-bucket-1.s3.amazonaws.com/info.html`. But if you want that your s3 objects to be accessed only by CF url like `https://d1vyzpsqe05sg1.cloudfront.net/info.html`
You should add bucket policy to your bucket like
```
{
    "Version": "2008-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Principal": {
                "AWS": "arn:aws:iam::cloudfront:user/CloudFront Origin Access Identity E27OQ9NRS1N0QR"
            },
            "Action": "s3:GetObject",
            "Resource": "arn:aws:s3:::my-test-s3-bucket-1/*"
        }
    ]
}
```
You can also achieve the same by updating bucket acl, and it's more granular cause you can add permission to each object separately.
It's granular cause you can't add read to all objects, only list. So if you want to read the object you should go to that object and add `Read` permission to it explicitly.
When you set OAI from console you can set `update bucket policy` and aws will itself add such policy to your s3 bucket. Of course you can do it manually, or edit it after this.
In this case your s3 bucket is not public, but can be accessed only by cf user with OAI=E27OQ9NRS1N0QR.
Accelerated file upload - you can enable POST/PUT/PATCH methods for your cf distribution, and so accelerate file uploads. So now you upload your files to nearest cf edge location and from there it's uploaded to s3/ec2 using aws internal low-latency network.
There are 3 ways to limit access to cf:
* using presigned url/cookie
* use geo-restriction (whitelist/blacklist specific countries)
* use WAF for all other restriction (for example whitelist/blacklist by IP)
If you run PCI-compliant or HIPAA-compliant workloads you should:
* enable cf access logs - save all request to access cf data
* save all management cf request to CloudTrail
Anti-pattern
* all users access website from specific location
* all users use vpn to access website (users in different locations, but from aws they will use single location of vpn server)
Canned vs custom policy (you write a policy statement in JSON format that specifies the restrictions on the signed URL) for signed url/cookie:
* canned - date and time that users can no longer access your content
* custom - canned policy + reuse policy for multiple files by using wildcard characters in the Resource object, date and time that users can begin to access your content, IP range of users who can access, signed URL includes a base64-encoded version of the policy
So for basic need you can use either canned/custom, but if you want more elaborate restriction (multiple files, IP address, start using after certain date, wildcard) you have to use custom policy.
Origin Failover - ability to fail over to second origin in case first origin is unavailable or return specific status:
* create distribution with 2 origins
* create origin group for distribution and configure origin failover policy there
* cf always route requests to primary, only if it get fail status it route it to second origin
* you can configure cf request timeout (by default 3 times for 10 sec each)

###### Kinesis
It is a platform for streaming data on AWS, making it easy to load and analyze streaming data.
With Kinesis, you can ingest real-time data such as application logs, website clickstreams, IoT telemetry into your databases, data lakes, and data warehouses, or build your own real-time applications using this data
* kineiss firehose (near real time) - load massive volumes of streaming data into AWS (you can configure lambda to transform you data before loading). Receives stream data and stores it in s3/RedShift/ElasticSearch
It's near real time because it takes data from data streams in real time, buffer them and then sends batches of data into storage (s3/dynamoDB).
* kineiss streams (real time, it's also data storage - data stored there durable for specified period) - ability to process the data in the stream. Stream for processing data it can't load data directly to s3/redshift - additional processing required, firehose - for storing data directly in s3/redshift
Just like fifo/groupId when you send message to kinesis you add partitionKey - determined into which shard to put your record
Yet there is no deduplicateId, so you can have duplicates inside shards. You can scale throuhgput for shard by dividing single shard into 2 by dividing partitionKey.
Consumer decide from which shard to read, they query kinesis, get list of shards, pick one, and start reading using iterator.
* kineiss Analytics - analyze streaming data real time with:
    * sql - run sql queries to process data
    * apache flink - use java/scala to process & analyze data
AntiPattern:
* Small scale consistent throughput (Kinesis Data Streams is designe and optimized for large data throughput)
* Long-term data storage and analytics (By default Kinesis Data Streams stores data 24 hours, you can extend retention up to 168 hours (7 days), if you need longer you should considered RDS/DynamoDb/S3/Glacier)
Auto-scaling:
* app auto scaling - CloudWatch alarm + App Auto Scaling + api gateway + lambda (that actually change number of shards) - you have to use CloudFormation template to set it up (you can set it up manually for testing)
* [kinesis auto scaling utility](https://github.com/awslabs/amazon-kinesis-scaling-utils) - you can deploy it as beanstalk (or java server) and it will monitor CloudWatch to dynamically scale out/in your shards
Queue vs Streaming:
* queue (not reactive) - you have to poll data, once it polled it removed from queue
* streaming (reactive) - many consumer notify of changes, events stay for long time (not deleted)
Write and Read to stream with java:
* [KPL (Kinesis Producer Library)](https://github.com/awslabs/amazon-kinesis-producer) - allows you to write to kinesis data streams (c++ code, but use java binding)
It has built-in batching & multithreading logic to collect many small events, batch them and send to kinesis
If you use KCL to retrieve message from kineiss that consist of multiple KPL records, you can use KPL on client side to retrieve these records
It emits throughput/error/other metrics to cloudWatch, uses async architecture - so call to put record returns immediately with `Future` object from KPL
* [KCL (Client Library Consumer)](https://github.com/awslabs/amazon-kinesis-client) - allows you to read from kinensis data streams (java library)
Kinesis vs Kafka vs Apache Storm (kinesis & kafka are message brokers - middleman between data streaming source and it's consumers):
* kafka - data stored in Kafka Partition, config store - Apache Zookeeper, replica instances - can be configured
* kinesis - data stored in Shards, config store - DynamoDB, synchronously replicates across 3 AZ
* storm - middleman between hadoop (which works with batches only) and streaming source. It takes incoming stream, organize data into packages and sends it to hadoop for further processing. Data sources are called spouts and each processing node is a bolt.
You can view kinesis video using following api:
* GetMedia API (real-time api with low latency) - you have to build your own player to view video from this api using [Stream Parser Library](https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/parser-library.html)
To upload video to kinesis you should use PutMedia api and upload mkv files. MKV (matroshka) - multimedia container formats
* HLS (HTTP Live Streaming) - you can use for live playback or to view archived video. You can use third-party player `Video.js/Google Shaka Player` to display stream using HLS streaming session URL.
You can also play back video by typing the HLS streaming session URL in the Location bar of the Safari/Edge browsers.
* MPEG-DASH (Dynamic Adaptive Streaming over HTTP) - same as HLS, just different format
* GetClip API - use it to download clip (MP4) with archived/on-demand media from video stream over the time range
 

###### Lambda
Lambda - piece of code that can be executed without any server env (just write code in python/javascript and it will run).
Lambda can be directly triggered by AWS services such as s3/DynamoDB/Kinesis Streams/SNS/CloudWatch
Lambda are billed per request, so it's better for some small simple tasks. If you have highload with 10m hits per day, run simple ec2 is cheaper.
AntiPattern:
* Long Running Applications (Lambda max time is 900sec (15 min). If you need some long running jobs you should consider EC2)
* Dynamic Websites (it's better to use some programming language like java/node.js and deploy it to EC2)
* Stateful Applications (Lambda is stateless, if you need state it's better to create app in java/node.js and deploy it ot EC2 + RDS/DynamoDb)
Cold Start - when you first run your code aws create new execution context (download code, set up env vars, load code) and it can take from few millisec to a few sec. When you run it for second and consecutive time, there is no delay.
By default lambda runs in no VPC (so it has internet access), if you want your lambda to talk with other services you should put it into VPC, if your lambda need internet access you have to configure nat for it.
Lambda doesn't run `npm install`. So if you add new package you have to build it locally, create `.zip` file with your project (including `node_modules`) and upload it to aws lambda.
Global state - lambda can run on the same container or on new container (aws shuts down inactive containers after ~20 minutes, so after this new call will run lambda on new container).
So when lambda run on the same container global variables (those outside handler function) can be leaked between invocations.
```
const messages = [];
exports.handler = async (event) => {
    messages.push(event);
};
```
So if different users call it with some personal info, other can see it. Yet if we wait for 20-30 min and then rerun it, messages would be empty.
There are a few solutions:
* don't use global variables (if you need some global state - store in in DynamoDB)
* v8 isolate (VM instance with its own heap) - so every lambda is wrapped into vm instance
There are few ways to store state:
* dynamoDB/s3
* lambda tags - since you can have up to 50 tags per resource, you can store some state in tags
* global variable (not recommended) - if you run your lambda every minute, technically it should be executed in same container, so your global variable should persist

###### Step Functions
Step Functions - visual tool that allows you to build complex logic based on lambda and EC2 calls. They can also help overcome lambda max 900sec execution time, by joining several lambdas into one execution flow.
If you have several lambdas that need to be called one after another, you can build this directly into lambdas, but it can be difficult to manage, so it's better to use some orchestration tool where you can create a sequence of calls.

###### EMR
EMR (Elastic Map Reduce) - highly distributed computing framework for data processing and storing, using Apache Hadoop as its distributed data processing engine.
It's good if you have some stored data in s3 and want to process it. If you have real-time data stream it's better to use kinesis.
It's open source java framework supports data-intensive distributed apps running on large clusters of commodity hardware. Hive/Pig/HBase are packages that run on top of Hadoop.
It reduces large workload into smaller jobs and distribute it between EC2 instances of Hadoop cluster (good for big data analyses).
Hadoop is basically 2 things: HDFS + Computation/Processing framework (MapReduce - hadoop api name)
There are 2 types of storage:
* HDFS (Hadoop Distributed File System) - data replicated across several instances. Data can be stored on EBS or instance store
* EMRFS (EMR File System) - implementation of HDFS that can store data in s3
There are 2 types of cluster:
* persistent - runs continuously, should use HDFS
* transient - do some work and stop, should use EMRFS, so data won't be lost after cluster is stopped or terminated
Hadoop vs Spark:
Hadoop - just storage system (HDFS) + api by which you can process this info. 
But hadoop api is not fast enough to process big data and here come spark which can help to expedite data processing.
If you want to run spark on cluster (for testing purposes you can run it on local machine) you need cluster manager.
There are 2 cluster managers - yarn/mesos. Since yarn is built into hadoop you need hadoop to run spark. But you can use mesos and run spark without hadoop.
Cluster manager - coordinate code execution on different machines. You can use spring+java+spark to have all features of java/spring to write good code for spark.
Data Locality - process data on the machines where they are located instead of transfer all data to single machine and precess them there.
AntiPattern:
* Small data sets (EMR for large processing, if your dataset is small enough for one machine/thread it's better to use EC2 or Lambda)
* ACID transaction requirements (if you need this it's better to use RDS instead of Hadoop)
There are several engines you can run on top of emr:
* Hive - data warehouse, you can write SQL-like queries to extract data from Hadoop
* Hbase - open-source, NoSQL key/value column-oriented database built on top of HDFS
* Presto - open-source in-memory distributed SQL query engine developed by Facebook. So it's good for ad-hoc sql analytics
* Spark - general purpose execution framework that is able to run multiple different workloads such as ETL/ML
Presto faster than spark cause it doesn't care about fault-tolerance. If one of the Presto worker nodes experiences a failure (say, shuts down) in most cases queries that are in progress will abort and need to be restarted.
Spark supports mid-query fault-tolerance and can recover from such a situation but in order to do that, it needs to do some extra bookkeeping and essentially "plan for failure". That overhead results in slower performance when your cluster does not experience any faults.

###### Glue
Glue - fully managed ETL (extract, transform, load) to catalog/clean/enrich/move your data. Consist of:
* Data Catalog - central metadata repository. Consist of:
    * trigger - you can create trigger to fire on cron or when some events done. With it you can create a chain of etl jobs. Can be of 3 types:
        * scheduled - run on cron
        * conditional - based on some condition (run third job when 2 other completed)
        * on-demand - manually activate your trigger
* ETL engine - autogenerate ETL code in python/scala for integration with apache spark
* scheduler - handles dependency resolution/job monitoring/retries
Glue crawlers scan various data stores you own to automatically infer schemas and partition structure and populate the Glue Data Catalog with corresponding table definitions and statistics.
You can then directly query your data lake with Athena and Redshift Spectrum.
AntiPattern:
* Streaming data (Glue is batch oriented, minimum interval is 5 min, so for streaming data Kinesis is better choice)
* NoSQL Databases (Glue doesn't support NoSQL databases as source)
Job - glue can run ETL on s3 and load it to any other target.
Job Bookmark - glue use it to keep track of processed data. When you add more data to s3, glue won't run etl for whole bucket again, but only changes that were added.

###### DynamoDB
DynamoDB - fully managed, highly available out of the box(there is no such thing as multi-AZ deployment and read replica) NoSQL key-value/document database, kind of mongo, but aws proprietary solution. Stores data across 3 AZ. 
It's serverless, so if you have to choose between DynamoDB/RDS if you are building serverless app - dynamoDB your best choice. NoSql terminology: row - item, cell - attribute, primary key - partition key + sort key.
If you come from relational to NoSql you must forget:
* normalization - this came from time when storage was expensive, right now compute is expensive so it's better to denormalize data to spend less time on computing
* joins - you can't join table in NoSql
* single table per entity - you have a collection of entities per table in NoSql. Table is not single object like in relational model, but a collection of heterogeneous objects, products+users+orders can be store in single NoSql table.
NoSql tables build on distributed hash tables, so time complexity of most queries is O(1)
One-to-many:
* relational - authors, books (has authorId as foreign key)
* nosql - partitionKey as one key (authorId), and sortKey (bookId) as key from second table
Many-to-many:
* relational- authors, books, author_book - special table to store auhorId+bookId
* nosql - create 1 primary key with partition key + sort key and second primary key where you swap partition and sort key.
Partition key should have a large number of distinct values relative to the number of items in the table (customerId for orders table - there are many distinct customers comparing to total number of orders).
This is because max RCU (read capacity unit) - 3000, WCU (write capacity unit) - 1000 per partition. So if you choose wrong partition key and make a lot of request to single partition you will get `ProvisionedThroughputExceededException`.
That's why you should have equal distribution across partition key. Best practices to select partition key:
* use high cardinality attr - email/customerId/orderId/productId
* use composite attr - combine several attr into single string to be used as key
* add random key to partition key
When you build NoSql schema you should:
* create ERD (entity relations diagram) - same as for relational db, define entities and relations between them
* define access pattern - how data would be accessed
* design PK + GSI
You can store many entities in the same table:
users + profiles(one-to-one) + orders(one-to-many) + order_items (one-to-many)
* partitionKey - USER#userId, ITEM#itemId
* sortKey - for profile - PROFILE#profileId, for order - ORDER#orderId - it's a good practice to add prefixes to keys. + ORDER#orderId - for PK with ITEM
So we have 2 SK with same ORDER#orderID, one - for users, another for items. To speed up access create GSI - inverted index
and now you have partitionKey - ORDER#orderID, sortKey - USER#userID/ITEM#itemID.
If you have several address for single user, just add them as json attribute - until you have access pattern by address (like found all users by single address)
So you store both profiles and orders in the same table, yet they have different attributes.
Partition Key (mandatory) - it's used for key-value access pattern, should be unique value.
Sort key (optional) - range query access pattern. Example: customerId - partitionKey, orderDate - sortKey.
So if you store only category in table, you have simple primary key = categoryName.
If you store category+articles in single table you have composite primary key = partitionKey (categoryName) + sortKey (articleName).
If you have composite primary key:
* write/update/delete - must provide full key (both partition & sort keys)
* query - can provide only partition or both
Don't use filter expression - it's scans the whole table and filter it based on your request.
If you need to filter on other that PK columns, create GSI for filtered columns.
Composite Sort Key - GSI with partitionKey stays the same, but sortKey is new attribute by which you want to filter. You can also include other attributes into this sortKey.
For example status+date - DELIVERED#2020-05-05, and now you can filter by status and date.
If you want to filter just by attribute without partitionKey. This is problem for dynamoDB, cause it designed in such way that you should narrow all queries to some partitionKey and then filter on sortKey.
You create sparse key and use scan to search by single attribute without partitionKey.
Data Partitioning:
* DynamoDB horizontally shards tables into one or more partitions across multiple servers.
* Partition allocation of storage for a table, backed by solid state drives (SSDs) and automatically replicated across multiple AZ.
* Partition management occurs automatically in the background by DynamoDb.
* Hot partition - when one partition receive way more traffic than all other (if write throughput is 4k, and you have 4 partitions. Each get 500 writes, but fourth get 2k. Although totally you have 4k, but because they are not evenly distribute you got throttle on fourth partition).
* Adaptive Capacity - in case you got some hot partitions, DynamoDB try to rebalance your data, so it would be evenly stored across all partitions.
Main reason to use NoSql against relation db is that you can scale horizontally.
With relational db the scale is vertical (add more compute/memory to single node). If you try to scale horizontally relational db you have to use 2PC (2 phase commit protocol - distributed algorithm that support atomic transaction between 2 nodes) to support transaction atomicity.
Simplified 2 phase commit is:
* TC (transaction coordinator) sends commit requests to 2 nodes
* both nodes decided can they execute commit or not and send results (yes/no) back to TC
* if both answered yes, TC send request to execute commit
As you guessed the problem is the more nodes you add the slower is communication to decide should they all run transaction.
So the good solution is to use db that doesn't adhere to these guidelines (transactionless db or NoSql).
There are 4 types of NoSql db:
* key-value (DynamoDB)
* document (DynamoDB/documentDB)
* columnar (RedShift)
* graph (Neptune)
Since DynamoDb is multi-AZ by default there is no automatic backup (like rds have), but you can use on-demand backup/restore logic.
DynamoDb just like s3 is not in vpc, so you can either:
* access it from internet using some url
* access it from private subnet using vpc gateway endpoint
Although dynamoDb is proprietary solution with closed source code there are 2 options for local dev (don't use them in production, cause it only for dev purposes, api is the same, but underlying design is different, they not suitable for prod highload):
* download aws version for developers
* use it from localstack
GSI (Global Secondary Index) - special read-only table created by dynamoDb to simplify search for indexed fields. Index speed up search but require more memory to store itself. You should configure separate read/write capacity for this.
It's a way to have DynamoDB replicate the data in your table into a new structure using a different primary key schema. This makes it easy to support additional access patterns
LSI (Local Secondary Index) - same partition as primary key, but different sort key. You can have one per table and create when table is created, just like primary key. It uses the same read/write capacity as table.
Scanning - like `select * from` operation in RDS, just go over all records.
DynamoDb just like s3 is eventual consistent, so if you update data and read it right away you can get old value (cause items are persisted on multiple machines, and depending from what machine you read you can get stale data).
You can disable eventual consistency by setting `ConsistentRead: true`. In this case `getItem/query/scan` operations would always return correct value, but reads would take longer time.
To read data of size:
* less than 4KB - 1 SCR (strongly consistent read)
* more than 4KB - 2 SCR
* eventually consistent read takes half the capacity of a SCR 
Throughput is of 2 types:
* read (`ReadCapacityUnits: 5`) - 5 SCR per second (if you have more then dynamoDb will throttle them, if you have too much they would be just rejected)
* write (`WriteCapacityUnits: 5`) - 5 writes per second 
You can increase throughput as much as you want but decrease up to 9 times per day. It's the only db that grow/shrink based on load.
DynamoDB Streams - captures a time-ordered sequence of item-level changes in a DynamoDB table and durably stores the information for up to 24 hours.
AWS maintains separate endpoints for DynamoDB and DynamoDB Streams. Streams can be enabled or disabled for an Amazon DynamoDB table.
Stream records are organized into groups, also referred to as shards. With streams you can:
* build transactional system (based on insert/update/delete records from one table do some operation in another)
* log/audit/aggregate data
* replicate data to another regions for query purpose using DynamoDB Cross-Region Replication Library
Streams useful for:
* replicating
* update elasticache (so your cache would be always updated to latest state of db)
* in case your app need to know about all updates
Cache problems:
* invalidation - how you guarantee that once db write happens, you update cache
* race condition - if 2 thread update db and update cache they may update db & cache in different order (in db you would have value from thread 1 and in cache from thread 2)
* cold start - if you reboot your server, now every request is cache miss (you have to request db)
So dynamoDB streams can nicely solve these 3 problems. Kafka also use this concept of streams inside for replication data across nodes.
Notice that relational db also has kind of streams internally for replication/indexing(when you add data your index automatically rebuilt), it just doesn't expose this stream as api.
Cold start can be solved if you have stream, you just go to the beginning and read all items sequintially & concurrently.
Streams are also useful if you want:
* analytics - user add 2 items to a cart and then remove - final state doesn't change, but for analytics it may be useful
* point-in-time query
One problem is schema evolution - solution to use avro format, and for each message include schema version
DAX (DynamoDB Accelerator) - in-memory cache for dynamoDb, can expedite up to 10 times. The benefit is that you don't have to modify source code, you just enable cache and it works.
Global Tables (cross-region replication) - multi-region/master db that automatically replicates across multiple regions. It's multiple replica tables (one per region) that DynamoDB treats as a single unit.
When app write data to replica table in one region, dynamoDb propagate changes to all regions, so if one region would be unavailable your app continue to work normally.
Multi-master replication ensures that updates propagate to all regions and that data eventually consistent.
AutoScaling - ability to change write/read throughput according to current load:
* you can set write/read throughput, but it's hard to predict exact values in advance, moreover your load maybe changing
* automatically applied to table/GSI created from console
* you can create scaling policy with target utilization (percentage of consumed provisioned throughput at a point in time)
* App Auto Scaling - uses tracking policy to adjust write/read capacity
So if you have write problems with db you should:
* RDS - add SQS queue in front of db to throttle write requests
* dynamoDB - use auto scale to scale accordingly to load
If you have read problems:
* RDS - add elasticache, add sharding (it would actually help in both read and write)
* dynamoDB - dax, auto scale
Transaction - you can use `TransactWriteItems/TransactGetItems` to run up to 25 PutItem/UpdateItem/DeleteItem/GetItem operations. During transaction items not blocked, dynamoDB supports only serializable isolation level.
There are batch operations like `BatchGetItem` (read up to 100 items at once) and `BatchWriteItem` (write up to 25 items at once). There are 2 difference between transact and batch api:
* for transact you pay twice
* for transact either all success or all rollbacked, for batch some may succeed, some may fail. So for batch is up to you to handle errors.
Transaction Idempotency - you can supply `ClientRequestToken` with `TransactWriteItem`, so dynamoDB would handle this request as idempotent.
If item modified outside of running tx, tx is cancelled & exception is thrown. Tx avaialble only within region, and not supported for global tables.
In tx you are priced twice for each read/write, cause dynamoDB call 2 times read/write, first - to prepare tx, second - to commit tx.
Limitations - dynamoDB won’t let you write a query that won’t scale, that's why it has some limitations, but they all make sense:
* max result in single Query/Scan operation shouldn't exceed 1MB. So if your query has more than 1MB output, dynamoDB returns `LastEvaluatedKey`
* it doesn't support aggregation query (min/max/avg). If you need this you should manage it on app level, when you write queries
`FilterExpression` - allows you to further filter query response. But keep in mind, since dynamoDB max return 1MB, you can't just issue filter on whole table and expect result, just like with sql.
If you have 1GB of data, and only 20 rows out of whole table can be filtered with such query, you have to run 1000 queries, and accumulate all rows into list.
So first query may return 0 rows, cause it just fetch first 1MB of data, then apply your filter, and nothing was returned, cause there were no items within this 1MB that falls under filter expression.
So you have to plan in advance you db usage pattern, in case you need filter on price, add it as sort key, or local index, or GSI.
Single-table design - NoSql design pattern where you put all your database into single table. The main reason for using a single table in dynamoDB is to retrieve multiple, heterogenous item types using a single request
For example you can store users/profile/orders in single table. UserId - would be primary key, profile/orders - would be sort key. There are 2 downsides of such design:
* there is no way to add new access pattern (for example if you want to get all orders above 100$, you will need to redesign your table)
* no easy way to export data fro analytics (dynamoDB is OLTP, designed to handle unlimited number of small transactions)
Anti-pattern:
* using GraphQL + dynamoDB. Reason is that graphQL using resolver, and make many queries to dynamoDB instead of single query

###### RedShift
Database vs Data Warehouse:
* relational db (single source) - OLTP (Online Transaction Processing) - store current transactions and quick access to them
* warehouse (multiple sources)) - OLAP (Online Analytical Processing) - store large quantities of historical data
Redshift support both JDBC (Jave Database Connectivity) and ODBC (Open Database Connectivity):
* odbc - introduced by Microsoft in 1992, platform dependent - only for windows, procedural as most of the code in C/C++
* jdbc - introduced by SUN in 1997, platform-independent, purely object-oriented type driver
RedShift - relational (based on industry-standard PostgreSQL) data warehouse, fully-managed, petabyte-scale, massively parallel.
It delivers fast query and I/O performance for virtually any size dataset by using columnar storage technology while parallelizing and distributing queries across multiple nodes.
It's fully transactional but implements only serializable isolation level. So if you have big workflow that do lot's of modification, wrap it into transaction, cause otherwise redshift will use new transaction for every change.
Columnar storage more faster for aggregation operations. If you need to do sum/average in row storage you have to scan all pages to get result it's a lot of IO, but with columnar you get single IO to get whole column.
Zone maps - in-memory data structures that store column's min/max value, so when you make query it's checked can data possibly be in this block, if not block is not scanned.
Column data persisted to 1MB immutable blocks. Data sorting used to optimize zone maps, columns that you use for filtering should have low cardinality. 
So if you have column with high cardinality (timestamp with millisec) there is no point to add such column to sort key, it won't improve performance.
Redshift only supports Single-AZ deployments. It uses MPP (Massively Parallel Processing) by automatically distribute data/query load across all nodes.
Single-node can be used to quickly set up cluster and grow later. Multi-node requires leader (who gets client connection and queries) and a few compute nodes, that actually execute load.
Cluster - consist of leader node (take the query) + 1 or more compute nodes (execute query in parallel).
Compute node consists of node slices (depending on type of node there can be 2/16/32 slices within single node), they are kind of virtual compute node, and these slices actually do computational work.
WLM (Workload Management) - queue to prioritize queries. Each query assigned to queue, and based on queue priority - executed (for example fast-running queries would be run before long-running queries)
SQA (Short query acceleration) - when query in queue, redshift determine that this query will run short time, and put it into beginning of queue, so it would be executed first.
Concurrency Scaling - if turned on, add transient cluster (take incremental snapshot to s3 and spin new cluster form it in seconds, we can take incremental cause backup automatically enabled so we already have full snapshot) when queues are full.
For every 24 hours of running cluster you accrue 1 hour of free transient cluster.
Just like rds, RedShift supports snapshots (both automatic and manual). Internally each node using ebs to store data, but you can create s3 backups.
Cross-Region Snapshot - automated or manual copy of data into another aws region. If you created encrypted db (select KMS encryption when you create cluster), you can't transfer keys between regions (KMS bound to region where it was created).
In this case you have to configure snapshot copy grant - redshift would create snapshot, decrypt it, then copy to another region and encrypt it with KMS key from that region.
For encryption it uses four-tier hierarchy of encryption keys. These keys are: master/cluster/database/data encryption keys
Redshift Spectrum - allows you to query data in s3, it's serverless just like Athena, so you pay for resources you consume.
So it basically allows you to separate storage & compute. You can also use it to insert data into redshift from s3. It different from Athena, cause it allows you to join current redshift tables with data from s3.
Under the hood there is a fleet of thousands Redshift Spectrum nodes spread across multiple AZ. Query is submitted to leader node of your Redshift cluster (it optimize/compile/push the query to the compute nodes).
Compute nodes submit requests to redshift spectrum, spectrum create thousands of ec2 and query data from s3 and return it back to cluster. So with spectrum you can store frequently access data in redshift and IA data in s3 and create join of these 2 datasets.
Distribution style (`DISTSTYLE` - primary goal in selecting it, to evenly distribute the data throughout the cluster for parallel processing) - when you load data into table, redshift distributes the rows to each of the compute nodes:
* AUTO - start with ALL style, if table grows beyond certain limit, switch to EVEN.
* ALL - copy of the entire table is distributed to every node. It is for small tables, less than 3million records.
* EVEN - leader node distributes the rows across the slices in a round-robin fashion. Use it when a table does not participate in joins or when there is not a clear choice between KEY/ALL distribution
* KEY - rows are distributed according to the values in one column (this column must be defined as a `DISTKEY`), leader node places matching values on the same node slice. This similar to partitionKey in NoSql.
Key is good if you have some foreign key (like departmentId in employee table) and so all employees for particular department would be stored in single slice.
Enhanced VPC routing - forces `COPY/UNLOAD` traffic between your cluster and your data repositories through your VPC. These allows you to use:
* all features of vpc
* vpc flow logs for `COPY/UNLOAD` commands
* vpc endpoint (route traffic between s3 & redshift)
Migration:
* lift-and-shift - is a bad practice cause performance depends on distkey/sortkey/dataCompression and when you just move you current warehouse without redesigning tables you won't get query performance.
* best practice - to denormalize data if you migrate from heavily normalized database.
Table design important upfront, cause for mysql/aurora you can create table and when you query pattern changes you just add index, but there is no indexes in redshift
Changing distkey/sortkey will require table rebuilding. Primary/Foreign/Unique keys are not enforced, so you can add duplicating entry into primary key, yet some query patterns can benefit from these constraints, so if you can enforce them from your app it's better to do so.
You can insert data by single/bulk insert - bad practice cause you will use leader node for this. So you can use `copy` command to load data directly into slices.
`COPY` - load data into redshift, best performance when you specify source as s3 bucket, automatically compress data before insertion. Best practice to use as many input files as slices in the cluster (if you use single file - single slice would copy all other would sit idle)
Optimal file size 1MB-1GB. If file size too small - lots of time is overhead to request file from s3, if too large - then you may get 99% uploaded and then failed.
Managed Storage (`RA3` compute type) - decouple storage & compute, each node can support up to 64TB compressed storage. RA3 - redshift analytics + S3. DC2 - dense compute. DS2 - dense storage, now outdated.
Compression applied independently for each column (totally 13 types of compression), we able to do this because redshift - columnar storage.
AZ64 - aws own compression encoding algorithm designed with high compression value and improved query processing. For int/date - use AZ64, char/varchar - LZO/ZSTD.
Deduuplication/Upsert (update + insert):
* use `copy` to load data into staging table from s3
* remove duplicates from prod table
* insert data from staging table into prod table
```
BEGIN; # start transaction, cause it's batch of operations
CREATE TEMP TABLE staging(LIKE prod); # copy distkey/sortkey from prod table
COPY staging from s3://bucket/data.csv COMPUPDATE OFF; # disable compression to speed up insertion
DELETE from prod p USING staging s on p.user_id=s.user_id;
INSET INTO prod SELECT * FROM staging;
COMMIT; 
```
For large copy (billions of records) use `ALTER TABLE APPEND` instead of `INSERT INTO SELECT`
`VACCUM` do 2 things:
* remove deleted records (when we delete records they are marked for deletion, but actual removal happens later)
* globally sort tables

###### QuickSight
QuickSight - BI (business intelligence) tool, for building visualizations, perform ad-hoc analysis (can connect to all aws data sources).
It's used inside aws infra, so it's for internal users only (not for external). You can load data form s3/athena/rds/redshift/dynamoDB.

###### EC2
EC2 (Elastic Compute Cloud) - web service that provides resizable (you can stop instance, change its type and start it with new capacity) compute capacity
AntiPattern:
* Managed Service (if you need database, or some other service that is provided by aws, you would better to use it, like RDS)
* Lack of Expertise or Resources (if your team lack expertise or resource installing and managing some service like database, again if aws provide such service it's better to use aws managed service)
You connect to ec2:
* linux - use private key to ssh (port 22) to ec2
* windows - use private key to decrypt admin password and connect by RDP (port 3389) using this password
Types of EC2:
* On-demand (0% discount) - you got server at any time, and there is no commitment from your (you can terminate it after any time)
* Reserved (40-60% discount) - you commit to run a server for 1/3 years
    RI scope:
        * regional - ri belong to some region. You can change az for this instance
        * zonal - ri tied to specific az. You can't change az for this instance
    RI type:
        * standard - 75% discount, can't change RI(reserved instance) attributes
        * convertible - 54% discount, you can change RI attribute (for example after month you find out you need more compute capacity)
        * scheduled - you reserve instance for specific time period (one day for every week)
    With RI you can modify: instance size (within the same instance family) / AZ / merge 2 into 1 (2 * t2.small => t2.large), or split one into 2 smaller. Yet you can't change OS.
* Spot (50-90% discount) - no commitment from aws (you bid for a cheaper price, and if any instance is available you got it, but you pay not what you bid, but the second highest bid). Once spot price exceeds your bill, ec2 would be terminated within 2 min.
There are 2 spot termination policies:
    * amazon termination - when spot price exceeds bid price, amazon automatically terminate your instances. In this case you don't pay for extra minutes, it all rounded to hours. (so if you used for 1 hour 30 min - you would pay for 1 hour only)
    * user termination - when you terminate spot instances for any reason - you pay full amount up to minutes (so if you used for 1 hour 30 min - you would pay for 90 minutes usage)
* Dedicated (can be on-demand or reserved) - your ec2 instance runs on physically separate hardware
There are 3 types of IP address:
* private - your instance is not available from outside, only from within your VPC
* public (dynamic - cause it changes when you stop/start instance) - you instance is available from outside
* elastic(static - doesn't change) - public IP that you can assign to any instance. If you stop/terminate it would persist and you would pay for it.
Source/destination checks:
* instance must be a source/destination of any traffic it sends/receive
* each ec2 performs it by default
* if your instance is NAT instance - it not a source/destination, it just a proxy to other instances. That's why for Nat instance you should disable it.
There are several instance types. You can get full view [here](https://www.ec2instances.info):
* C (good for CPU load)
* R (good for RAM load)
* M (middle between cpu & ram)
* I (good for I/O operations)
* G (good for GPU)
* T2/T3 (burstable type) - good performance for a short time (burst) - if you overuse this burst your performance will downgrade. When you cpu not bursting, you earn `burst credit` (you can view it in CloudWatch), once it hits 100% load, burst is turned on and you pay with your credit once your credit is 0, performance downgrade.
* T2/T3 unlimited burst (you pay for extra burst credit)
It usually takes longer time to stop instance then to reboot. The reason is when you stop it does some clean up by removing dns name, public IPv4, private IPv4, IPv6, ec2 instance store.
2 types of scaling:
* vertical - enlarge instance capacity, need downtime. Stop instance, go to `instance settings => change instance type` and select new instance type, then start it.
Stopping is required cause Amazon has to move the VM to a different piece of hardware with the available resources for the size change. If you are using CF template and change `InstanceType` there, CF smart enough to stop/change/start your instance (so it won't create new one with new instance type).
* horizontal - add more instances, no need for downtime
ASG (auto-scaling group) - allows you to horizontally scale you system. If you delete ASG all instances of it's type would be deleted. There are 4 types:
* manual scaling - manually change number of mix/max/desired instances in asg, so it would add/remove ec2 accordingly
* predictive scaling (proactive approach) - dynamically change number of running instances based on ML algorithms that would predict load on the next 48 hours, based on previous load
* dynamic or on-demand scaling (reactive approach) - dynamically change number of running instances based on some params:
    * Simple scaling - scale based on a single scaling adjustment.
    * Step scaling - same as several simple policies joined together by steps.
    Suppose you want to increase number of ec2 based on cpu utilization, and have following rules:
    0% < cpu < 30% -- add 1 ec2
    30% < cpu < 60% -- add 2 ec2
    cpu > 60% -- add 3 ec2
    Of course you can create 3 simple policy and 3 CloudWatch alarm for each step. But it too much, so it's better to have 1 alarm and 1 step policy.
    Be aware that step policy `MetricIntervalLowerBound/MetricIntervalUpperBound` add this value to value from CloudWatch alarm. So if you don't want you should leave lower bound, cause you are not allowed to set negative values  (take a look at `CloudFormation/asg-simple-step.yml`)
    * Target tracking scaling - scale based on a target value for a specific metric (ASG create CloudWatch alarms that trigger the scaling policy). So if you don't want to mess with alarms and want smart system that can scale out/in based on some metric you should use it.
    With this smart policy CloudWatch alarm and step adjustment policy created behind the scene, and manage number of ec2 based on target:
        * `ASGAverageCPUUtilization` - based on cpu consumption
        * `ALBRequestCountPerTarget` - based on number of requests for elb
        * `ASGAverageNetworkIn/ASGAverageNetworkOut` - based on average number of bytes
* Scheduled scaling - specify changing of min/max instances based on some scheduled value (for example you know your peak hours every day), crontab notation is used for this.
You can also create your own custom metrics. But it should change based on number of instances (latency is bad and won't work, cause adding/removing instances doesn't directly affect response time)
If you have single ec2 and you need to deploy java project there, you can just ssh there and put .jar file directly. But if you are managing a fleet of ec2 using ASG you would better to use efs and put your .jar there, so whenever new ec2 is started it would take this .jar and run your app.
Types of scaling:
* scale up - remove current instance and create new one with bigger compute/memory capacity
* scale down - remove current instance and create new one with lesser compute/memory capacity
* scale out - add one or more instances
* scale in - remove one or more instances
Cooldown period - prevent ASG from adding/removing instances before the effects of previous activities are visible, so it helps to prevent the initiation of an additional scaling activity based on stale metrics.
Lifecycle hooks - you can execute some logic after ASG create new instance (useful when you don't have ready-to-use AMI and need to tune instance after creation), see `CloudFormation/asg-sqs-hook.yml`.
lifecycle hook puts the instance into a wait state (Pending:Wait or Terminating:Wait). The instance is paused until you continue or the timeout period ends. 
Yet if you launch instance it will become available immediately and can serve requests. When you launch new instance you can receive sqs message
```
{
  "LifecycleHookName": "asg-ScaleOutHook-VH7PGTZ201TI",
  "AccountId": "{YOUR_ACCOUNT_ID}",
  "RequestId": "7395d14c-d028-458a-2649-2ac9a3c24aa3",
  "LifecycleTransition": "autoscaling:EC2_INSTANCE_LAUNCHING",
  "AutoScalingGroupName": "asg-VPC-A-ASG",
  "Service": "AWS Auto Scaling",
  "Time": "2020-09-03T09:03:06.567Z",
  "EC2InstanceId": "i-0d2c7deb9eaf6507f",
  "LifecycleActionToken": "c2cf8cb6-6b7f-45c8-bd9e-240c52c86b08"
}
```
When you terminate instance it will wait for `HeartbeatTimeout` (default 1 hour) and only after this terminated
```
{
  "LifecycleHookName": "asg-ScaleInHook-1X3I4VRP056CX",
  "AccountId": "{YOUR_ACCOUNT_ID}",
  "RequestId": "ed35d14c-f6de-9dbf-3319-244af435d1a9",
  "LifecycleTransition": "autoscaling:EC2_INSTANCE_TERMINATING",
  "AutoScalingGroupName": "asg-VPC-A-ASG",
  "Service": "AWS Auto Scaling",
  "Time": "2020-09-03T09:13:09.206Z",
  "EC2InstanceId": "i-0d2c7deb9eaf6507f",
  "LifecycleActionToken": "1bc18789-bbe5-41ad-8c2e-14ef6bf9ef62"
}
```
To complete you should call `aws autoscaling complete-lifecycle-action --lifecycle-action-result=CONTINUE --instance-id=i-01b8eb322fb0e88e7 --lifecycle-hook-name=asg-ScaleInHook-1X3I4VRP056CX --auto-scaling-group-name=asg-VPC-A-ASG`
Termination policy - customizing how asg would terminate your instances:
* Default
* OldestInstance - remove oldest instances first, useful when you're upgrading the instances
* OldestLaunchConfiguration - remove instances that have the oldest launch configuration, useful when you're updating a group and phasing out the instances from a previous configuration
* NewestInstance - remove newest instance first, useful when you're testing a new launch configuration but don't want to keep it
* ClosestToNextInstanceHour - remove instances that are closest to the next billing hour
* OldestLaunchTemplate - remove instances that have the oldest LT
* AllocationStrategy - remove instances to align the remaining instances to the allocation strategy for the type of instance that is terminating (either a Spot Instance or an On-Demand Instance)
LT (launch template) vs LC (launch configuration):
* LC (old version) - immutable (you can create one LC and if you want to add change you have to add second LC). Only basic ec2 settings are supported.
* LT (new version) - you can have multiple versions in single template. You can have advanced features like subnetID, multiple instance types, dedicated hosts and so on.
ASG support both LC & LT (see `sa/cloudformation/asg-launch-template.yml`). Yet spot fleet supports only LT.
ASG with both on-demand & spot instances:
* You can't use launch config, cause it only support on-demand (by default) or spot (add `SpotPrice: 0.002` to `AWS::AutoScaling::LaunchConfiguration`).
If you try to asg + launch config with spot, and no spot instances can be fetch you will get exception: `Launching a new EC2 instance. Status Reason: Your Spot request price of 0.002 is lower than the minimum required Spot request fulfillment price of 0.0038. Launching EC2 instance failed.`.
If you can't fetch spot instances, your asg would be without instances, yet it will continue try to create instance. So far it looked like it would try to fetch every time increase number of two, so fetch 1,2,4,8,16,32 minutes. See screenshot from my pc `sa/files/images/asg-activity-history.png`.
Administrative suspension - aws would terminate launch attempts if asg failed to launch instance for 24 hours.
You can also set suspension to (launch/terminate). In this case asg won't try to attempt to launch/terminate instances. Pay attention if you suspend termination, spot instances would be terminated anyway
* You have to use launch template. But don't hardcode spot into launch template with:
```
InstanceMarketOptions:
  MarketType: spot
  SpotOptions:
    MaxPrice: 0.002
```
In this case your launch template would be only for spot instances. And if you try to use this template with ASG, it would have same effect like launch config. ASG would try in vain to launch spot instances.
Use `MixedInstancesPolicy` of ASG. But remove spot from launch template. If you try to use both you would get error: 
`Incompatible launch template: You cannot use a launch template that is set to request Spot Instances (InstanceMarketOptions) when you configure an Auto Scaling group with a mixed instances policy. Add a different launch template to the group and try again.`
Take a look at `sa/cloudformation/asg-on-demand-spot.yml` for exact template how to use asg + launch template to have both on-demand & spot instances.
`UpdatePolicy` - attribute in cf to update asg in case launchConfig/launchTemplate changed. By default if you change template/config only newly created instance would use latest version, currently running ec2 won't be replaced.
But you can use this policy to gradually replace all currently running ec2. There are 3 policies to replace running ec2 in case of config/template update:
* AutoScalingReplacingUpdate - create new asg with instances built from new template, and after creation finished, remove old one (during creation process you basically have 2 asg).
If you set `WillReplace: true`, add `CreationPolicy`. If nwe asg can't be created for some reason using this policy, it will be removed and you will use current asg (with old version instances).
```
UpdatePolicy:
  AutoScalingReplacingUpdate:
    WillReplace: true
```
* AutoScalingRollingUpdate - update instances in current asg, you can specify do you update one-by-one or by batches
* AutoScalingScheduledAction - applied when asg has scheduled action fired. If you use it, then when scheduled action fired, MinSize/MaxSize/DesiredCapacity would be taken from asg not from scheduled action.
```
UpdatePolicy:
  AutoScalingScheduledAction:
    IgnoreUnmodifiedGroupSizeProperties: true
```
Spot fleet `AWS::EC2::SpotFleet` - a fleet (group of 1 or more ec2 instances) of spot instances. You can create requests of 2 types:
* request - create single request. If it failed, or if you remove instances, nothing would happen.
* maintain - maintain request perpetually. If it failed or if you remove instances, request would automatically add new (in case it can fetch spot instances from the pool)
You can use `AWS::Events::Rule` to catch termination event 2 minutes before aws would terminate your instance. Below is event example:
```
{
    "version": "0",
    "id": "12345678-1234-1234-1234-123456789012",
    "detail-type": "EC2 Spot Instance Interruption Warning",
    "source": "aws.ec2",
    "account": "{ACCOUNT_ID}",
    "time": "yyyy-mm-ddThh:mm:ssZ",
    "region": "us-east-1",
    "resources": ["arn:aws:ec2:us-east-1:{ACCOUNT_ID}:instance/i-1234567890abcdef0"],
    "detail": {
        "instance-id": "i-1234567890abcdef0",
        "instance-action": "hibernate/stop/terminate" # one of three
    }
}
```
Ec2 Fleet `AWS::EC2::EC2Fleet` - allows you to create fleet for on-demand, reserved, spot instances. You specify max number of instances and aws create and maintain (in case you terminate on-demand it would be recreated, in case aws terminate spot it would try to fetch other spot) these instances for you.
You can configure SNS to get notification when your ASG scales out/in or replace unhealthy instance.
LC (launch configuration) - template that ASG uses to launch new instances. One ASG use one LC. You can't modify LC, if you need to change some params you should create new LC and update your ASG.
You can use on-demand or spot instances in LC, in case of spot you should set bid price in LC. ASG can launch your instances across multiple AZ but only within same region.
Unhealthy instance can be determine by 2 healthchecks:
* ec2 healthcheck (default check for asg, check only status of instance itself) - use it if you don't use elb
* elb healthcheck - more elaborated check (for example to check if instance return status 200)
There are 2 ways to create asg in cf:
* ScalingPolicy - create scaling policy (only suitable for ec2 scaling policy)
* ScalingPlan - create scaling policy for asg, but can also be used to create scaling policy for:
    * ASG
    * spot fleet
    * ecs
    * dynamoDB (table & GSI)
    * aurora replicas
ASG troubleshoot:
* more than 1 policy triggered by single event -> in this case asg launch policy with the greater impact (if one policy add 2 ec2 and another 4 -> 4 ec2 would be added)
* scale-out and scale-in triggered by single event -> in this case scale-out wins
Hibernation (suspend-to-disk) - like OS sleep command, temporary store RAM in ebs volume, and restore RAM from ebs on wake-up (ebs volume must be large enough to store RAM and be encrypted). When wake-up happens:
* ram is restored from ebs
* all running processes are resumed
* all attached data volumes are reattached
If instance takes long time to bootstrap you can pre-warm it:
* launch it with hibernation enabled
* bring it to desired state
* hibernate it until you need it
You are not charged for hibernated instance in stop state, but you are charged for ebs/elasticIP. If you have custom AMI, you should first enable hibernation for it, by installing `ec2-hibinit-agent`.
You can't hibernate instance in ASG/ECS, instance root volume store (only with ebs store, cause instance root volume would be flushed when instances moved to stop state), more that 150GB RAM or for more than 60 days. 
If you try to hibernate instance in ASG, it will mark it as unhealthy (cause from asg perspective instance is stopped), terminate it and launch new replacement.
There are 2 types of fleet:
* spot - list of spot ec2 instances you can request
* ec2 - list of spot/on-demand/reserved instances you can request

###### Athena
Athena is an interactive query service that makes it easy to analyze data in Amazon S3 using standard SQL. It uses presto under the hood. Presto - good solution if you need to connect to multiple data sources.
You don’t need to load your data into Athena, as it works directly with data stored in S3. It integrates with Amazon QuickSight for easy visualization. It uses managed data catalog (aws glue - ETL tool) to store tables you create from s3.
AntiPattern:
* Enterprise Reporting and Business Intelligence (for enterprise level it's better to use RedShift, query engine in Redshift has been optimized to perform especially well on data warehouse workloads)
* ETL Workloads (for etl you should use EMR/Glue)
Be careful cause each time you run query athena scan your s3, so each query would cost some money.
There are 3 types of aws services:
* ec2 - you manage your server (like install mysql there)
* managed server - aws manages server for yourself (like rds, you just tell how big server you want, aws provision it)
* serverless/clusterless - aws hides away server from you (athena - you just write query and don't care how many servers would be needed to execute it)
Because you pay for each query based on the amount of scanned data, you can reduce costs by:
* data partition - reduce amount of scanned data for each query. Athena uses hive for partitioning. You can partition by any key, good practice to partition based on date/location.
You specify partition in WHERE clause, so athena scan only this single partition instead of whole bucket. It can also help avoid errors, cause if data not partitioned and you run query against whole bucket you may get exceptions.
* use workgroups - you can separate users/apps and set limits on amount of data each query or the entire workgroup can process, and to track costs. Use iam policy to control access to it.

###### Organizations
Organizations - service that allows to tie several accounts to master account and centrally manage them (billing, services, policies), so it basically collection of AWS accounts that you can organize into a hierarchy and manage centrally.
Master Account - aws account from which you create your organization. From there you can also create/invite/delete other accounts. It's charged to pay all bills by all accounts. Once chosen, you can't change master account.
As long as you have organization and your account - master account, it can't accept invitation to join other organizations. If you want it to become member account, you have to delete your organization first.
OU (Organization Unit) - group of accounts under one name, can be used to build hierarchical structure. Account can be a member of only 1 organization/OU at a time. OU can be a member of only 1 OU at a time.
Typical use case is to have 2 accounts (dev + prod) to separate concerns, but to manage them from single one. There are 2 types of policies:
* SCP (Service Control Policy) - policy you can apply to a group of aws accounts, defines service actions (like run EC2 instance), it follows the same rules as IAM policies.
You can attach a policy to the root/OU/account. SCP limits IAM permissions (if you create SCP to block ec2 creation for all accounts, even root user form child account won't be able to launch any ec2 except for t2.micro)
Order of execution - most restrictive policies take precedence. It never grant permission, they work like permission boundary - defining max set of permission accounts in organization can have.
It will never limit permission to internal user of current account who has permission to access resources (for these purposes you have to use permission boundary).
* TP (Tag policy) - set of rules regarding tags (which resource should have which tags).
Feature sets (you select it when you create organization) - how your organization manage its accounts:
* Consolidated billing - provides only shared billing functionality (you can't define SCP/TP with this type)
* all - consolidating bulling + all available features 
You can switch from consolidated billing to all by just updating org (there is no need to delete & create org).
Both types provide discounts:
* s3 - more you use - less you pay, so in case of single bill aws treats all accounts as single, so all s3 usage is calculated and paid by single account
* ec2 - suppose accountA has 6 RI, accountB - 0. During some hour accountA - used 3 instances, B - also 3. B was using on-demand, but because of single bill and A has 3 not used RI, it would be calculated as 6 RI. So you won't pay anything for B on-demand instances.
This would work if B launched same type of ec2 in the same AZ as RI from accountA.
* rds - same as ec2, but only dbType(oracle/mysql)/instanceType/launchType(multi-AZ) should match.
RI (Reserved instances) - 2 reports:
* utilization - how many % of total RI are actually used
* coverage - how much % of overall instance usage covered by RI. So when it drops below 50% you should investigate which of on-demand instances are running 24/7 and possibly replace it with RI.

###### Well-Architected Tool
Well-Architected Tool is a aws service that allows you to validate your current infrastructure against 5 pillars of well-architected framework.
It works by creating a workload (collection of resources and code that make up a cloud application) and then run this workload against 5 pillars.
The tool will evaluate your workload and provide an improvement plan with a prioritized list of issues. It's free of charge, you only pay for underlying aws resources.

###### VPC
VPC (Virtual private cloud) - a kind of internal network in on-premises. You can have some servers inside and they won't be accessible outside of vpc.
You have complete control over your virtual networking environment, including selection of your own IP ranges, creation of subnets, and configuration of route tables and network gateways.
By default every account has default VPC (and default subnet for each AZ), so if you don't create any other, and create EC2 directly, default VPC would be used.
Amazon VPC consists of:
* VPC - private network, logically isolated from other networks in aws cloud. Can span across multiple AZ. Instances in different AZ charged $0.01 per GB for data transfer. Size should be /28 - /16 (so from 16-65535, actual size would be -5 from each subnet)
* Subnet - private sub-network inside VPC. Can reside only within single AZ. For each subnet 5 IP are automatically taken. 4 from the start + last.
    * 1 - network address
    * 2 - vpc router
    * 3 - dns server
    * 4 - reserved for future use
    * last - broadcast address
    So if you have subnet of diff size - you have to subtract 5 to get total size
    * /24 => 256-5=251
    * /28 => 16-5=11
    * /29 => 8-5=3
    * /30 => 4-5=-1
    That's why minimum size should be /28 (cause for /29 you got size 3, there is no point in such a network)
* RT (Route table) - set of rules (routes) to determine where network traffic from your VPC is directed. Single RT can be associated with multiple subnets, but single subnet can be associated to one RT only.
When you create vpc, default RT is created and all subnets by default assigned to this RT, yet if you go to this RT you will see that subnets are not explicitly associated with it.
That is because this RT - is default. If you create new RT and associate subnet with it, or implicitly associate default RT with subnet, you will see that RT has this association.
Every RT has routes with 2 fields (if you want to get to such destination go to this target).
* IGW (Internet Gateway) - entry point between your VPC and Internet. It allows EC2 in VPC directly access Internet. You can use public IP or elastic IP(won't change after stop/start) to both communicate with Internet and receive requests from outside web-servers.
* NAT Gateway - Network address resolution service in private subnet to access the Internet. Instances from private subnets use NAT gateway to access Internet. Nat allows outbound communication, but doesn't allows machines on the Internet to access instances inside VPC.
Since Nat GateWay created per AZ for HA it's suggested to create it in every AZ where you have instances. In this case single AZ failure will not block internet access from other private networks. With IGW you have both outbound and inbound access, 
but with Nat - only outbound (your instance can access Internet, but is unaccessable from Internet).
Nat gateway/instance can't route traffic through: vpc peering, site-to-site vpn, direct connect, so it can't be used by resources on the other side of these connections.
Moreover vpc peering can't use NAT instance/gateway, IGW or VPG.
* Virtual private gateway - VPC+VPN
* Peering Connection - create private secure connection between 2 VPC
* Egress-only Internet Gateway - egress(going out) only access from VPC to Internet over IPv6
Old terminology
* VPC = VRF (virtual routing and forwarding)
* Subnet = VLAN
EC2-to-EC2 communication through public IP:
* When inside same Region - inside aws network
* When in different Regions that connected with VPC peering - inside aws network
* When in different Regions - not guaranteed to communicate inside aws network (probably communicate through Internet)
SG (Security group) - also called virtual firewall, decide which traffic (both inbound & outbound) on which port to allow to ec2. By default all inbound traffic blocked, all outbound traffic allowed.
Some firewalls let you filter on source ports, but SG - only on destination ports. So you can't say allow only tcp requests coming from port 80.
* inbound - check traffic based on source (source -  IP address or SG)
* outbound - check traffic based on destination (destination - IP address or SG)
Working with SG rules and ping you can notice interesting thing:
* You run ping, it waits cause there is no icmp rule. You add icmp rule and ping starts to work.
* Ping is running in console. You remove icmp rule from SG, but ping continue. If you stop it and run again it wouldn't work, cause there is no ping rule.
If you read [Connection tracking](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-security-groups.html#security-group-connection-tracking) everything becomes clear. Cause connection is stateful, SG doesn't track outbound traffic. 
So when icmp rule was enabled, ping established connection, and outbound traffic started to flow. Once you remove icmp rule, you can't establish new ping connection, but old one established before can continue receive responses (outbound traffic - which is not tracked due to statefulness of SG).
SG vs NACL:
* SG (stateful filtering) operate at instance level, specify which traffic is allowed to/from EC2. You can set source as CIDR or SG (in this case only instances from this SG can access your instance)
* NACL (stateless filtering) operates at subnet level and evaluate traffic that enter/exit subnet. Don't filter traffic inside same subnet.
Evaluation order: starting from lowest to highest without overwriting each other. In example once we hit rule #90 it was applied, and later rule #100 will not overwrite it.
Or you can also think that rules are evaluated in decreasing order by overwriting each other. Suppose you want to allow all traffic except http:
```
90  - tcp - 80    - DENY
100 - all traffic - ALLOW
```
You can only assign one NACL to one subnet, yet you can assign many SG to same ec2. You can't block specific IP with SG, you need to use NACL.
Stateful - if you send request from your ec2 you will got response even if SG doesn't have any outbound rules
If you set up NACL (let's say for ssh) you should also add outbound rules (cause nacl are stateless). But for ssh outbound port is not 22, it's ephemeral port - When a client connects to a server, a random port from the ephemeral port range (1024-65535) becomes the client's source port.
When you create VPC, default SG created automatically. It allows inbound traffic from instances with default SG (source - SG_ID), and all outbound traffic. 
That's why if you create ec2 and rds and assign to both of them default SG, ec2 can access rds, cause from rds perspective ec2 SG - source of RDS SG.
So if you need 2 ec2 to talk with each other you can assign both of them same SG where source is ID of this SG - this means traffic allowed from any instance of the same SG
To monitor traffic you can use:
* VPC flow logs (it includes information about allowed and denied traffic, source and destination IP addresses, ports, protocol number, packet and byte counts, and an action: accept or reject). You can configure it for:
    * vpc - flow logs would be for all ENI in whole vpc
    * subnet - flow logs would be written for all ENI in this subnet
    * network interface - flow logs would be written only for this particular ENI
    `${version} ${account-id} ${interface-id} ${srcaddr} ${dstaddr} ${srcport} ${dstport} ${protocol} ${packets} ${bytes} ${start} ${end} ${action} ${log-status}`
    `2 123456789010 eni-1235b8ca123456789 172.31.16.139 172.31.16.21 20641 22 6 20 4249 1418530010 1418530070 ACCEPT OK` (SSH traffic (destination port 22, TCP protocol) to network interface eni-1235b8ca123456789 in account 123456789010 was allowed)
    As you see there is no actual payload, only fact that somebody try to send some tcp/udp message to someone. If you want actual payload you should use Traffic Mirroring.
    So use it to troubleshoot connectivity and security issues, make sure that the network access rules are working as expected
* VPC traffic mirroring (it copies traffic and send it to NLB with a UDP listener, so it includes actual body). Provides deeper insight into the network traffic by analyzing traffic content (payload).
VPC peering:
* you can create peering between VPC in 2 regions or in 2 accounts (in this case one account should accept peering request from another)
* traffic of peering within same region is not encrypted, but isolated, just like traffic between 2 EC2 in the same VPC
* traffic of peering between different regions is encrypted
multiple VPC connection (3 ways):
* vpc peering (2014) - connect 2 vpc to each other (requester -> request access to acceptor). Peering is non-transitive connection type (basically it's one-to-one). 
So if A has a peering with B, and B has a peering with C, A has no access to C, in order for them to access each other you have to create peering between them too.
It's good when you need to connect 2 or 3 vpc, but in case you have to connect 10 vpc, that means you would have to create `n*(n-1)/2` peering connection between each and every vpc.
Good news is that peering can be cross-account and cross-region. Basic CloudFormation example here `CloudFormation/advanced-networking/vpc-peering.yml`. If you want just to connect 2 services from 2 vpc without exposing all other services you should use PrivateLink.
* transit vpc (2016) - a way to connect multiple vpc (form different regions) and your on-premises data center without creating hundreds of peering connections. It's not aws service, it's just a concept or architecture how you should design such a transit vpc that would connect all other vpc with each other.
The idea is to create one vpc with ec2 and IGW and install there some software from Cisco/Aviatrix (software is commercial, you buy ami with Cisco Cloud Services Router 1000V Series).
Implicit drawback is cost: since you pay for every traffic exiting (egress) your VPC, if you use transit vpc as single internet gateway, all other vpc would access internet from it. So fo each internet access you would pay twice
first - egress traffic from vpc (that goes to transit vpc), second - egress traffic from transit vpc itself (from there it goes to public internet).
underneath it's all these vpc and on-premises centers are connected to each other through vpn and transit vpc basically works as vpn server and routing this vpn traffic.
* transit gateway (2018) - it's aws managed service that works like transit vpc, but don't have all it's complexity of installing and configuring. 
You create TGW and then just attach VPC/VPN configurations and add route tables. VPN ECMP (Equal Cost Multipath) support - you can enable when you create TGW, vpn connection must use dynamic routing
Connect vpc to on-premise network (2 ways):
* site-to-site VPN. Route propagation allows a virtual private gateway to automatically propagate routes to the route tables - so you don't need to manually update RT (works for both static & dynamic routing)
After running `CloudFormation/advanced-networking/site-to-site-vpn.yml` you will have to manually go to site-to-site vpn and download configuration (select openswan as router).
Then update values from here (left, right, and last line for `/etc/ipsec.d/aws.secrets`). After you will be able to ping ec2 in private vpc
```
# left - on-premise, right - aws vpc side
sudo su
echo "net.ipv4.ip_forward = 1
net.ipv4.conf.default.rp_filter = 0
echo net.ipv4.conf.default.accept_source_route = 0" >> /etc/sysctl.conf
service network restart
echo "conn Tunnel1
    authby=secret
    auto=start
    left=%defaultroute
    leftid=3.237.1.182
    right=52.6.121.143
    type=tunnel
    ikelifetime=8h
    keylife=1h
    phase2alg=aes128-sha1;modp1024
    ike=aes128-sha1;modp1024
    keyingtries=%forever
    keyexchange=ike
    leftsubnet=10.100.0.0/16
    rightsubnet=10.200.0.0/16
    dpddelay=10
    dpdtimeout=30
    dpdaction=restart_by_peer" > /etc/ipsec.d/aws.conf
echo '3.237.1.182 52.6.121.143: PSK "wCfcjn4X6xF895fHM3Tgq6XvSPiEuBcp"' > /etc/ipsec.d/aws.secrets
service ipsec restart
```
* DX (Direct Connect) - private connection between aws region and you (aws router to your on-premise router) or your ISP (internet service provider). For HA use redundant second connection, in case first failed.
    DX vs VPN:
    * dx - private connection between on-premise and aws region. Use it if you need high bandwidth.
    * vpn - IPSec connection over the Internet between on-premise and vpc. It's slower than dx since it use public internet. But secure/cheaper & can be setup very quickly. 
You can use vpn above dx, but it's redundant, cause dx is already secured. Best practice to configure vpn as failover for dx (in case it failed).
LAG (Link Aggregation Groups) - ability to order multiple direct connect ports and manage them as single larger connection (max number is 4 ports, port types should be the same, all 1GB, or all 10GB). LAG connections operate in Active/Active mode.
DXG (Direct Connect Gateway) - grouping of VGW (virtual private gateways) and VIF (private virtual interfaces). Multi-account DXG allows to associate up to 10 VPC (from different accounts) or up to 3 Transit Gateway.
Direct Connect and DCG support both 1500 and 9001 MTU (you can also modify it if you need). DX VIF - you have to create one of the following VIF to start using dx:
* private - access vpc using private IP
* public - access all aws public services using public IP. If you want to use vpn over dx you have to create this VIF.
* transit - access vpc Transit Gateway associated with dx
Don't confuse 3 links:
* VPC PrivateLink - expose aws services (except s3/dynamoDb who are using gateway endpoint) or private ec2 to vpc in the same or other aws account, by adding eni inside vpc for exposed service.
If you have 3 vpc and ec2 in each of them, and you want to connect these 3 ec2 you can use either PrivateLink or vpc peering. PrivateLink is better solution, cause it allows you to connect only these 3 ec2, without exposing all other services from these vpc to each other.
Yet keep in mind that vpc endpoint can't be cross-region. So your 3 vpc from above example should be in the same region.
* VPC ClassicLink (before 2013 there were no default VPC and all EC2 where launched in flat network shared with other aws users) - allows to connect your VPC with ec2 classic, ec2 becomes a member of VPC SG.
* VPC Link - connect API GateWay to private ec2.
VPC Endpoint - private connection to AWS services without IGW/NAT/VPN. It make sure all traffic goes inside aws network. There are 2 types:
* Gateway endpoint — target for a route in your route table for traffic destined to a supported AWS service (s3/dynamoDB)
* Interface endpoint — ENI with a private IP address from the IP range of your subnet that serves as an entry point for traffic destined to a supported service.
So instead of calling public dns name of some service, aws creates ENI inside your subnet, and so you don't need internet access anymore. You can directly call this private IP since it's inside your vpc.
Using this enables you to connect to services powered by AWS PrivateLink (so basically all aws services + your custom created via endpoint services, except those in gateway endpoint).
Endpoint services - you create some service (ec2) and add NLB(not application/classic lb), and other aws accounts can connect to your service via interface endpoint.
So using this you can create private service provider that would provide some logic to other aws accounts on vpc-to-vpc basis.
Of course you can access your NLB form the internet (you should have at least one RT with internet gateway route to access NLB/ALB by dns name), but using PrivateLink will ensure that all traffic is within aws, and no traverse the internet (same as this service running inside your vpc),
and to access your service from PrivateLink you don't need to have internet gateway (cause all traffic inside aws and doesn't go to outside Internet). So you can access service (ec2) of one vpc from another without vpc peering/IGW/VPN.
If you share your service with aws marketplace you can get vanity dns name like `us-east-1.vpce.mycoolsite.com`. 
By default ec2 instances dns name is disabled (only ip address is given). You can enable it for vpc by going to `Actions=>Edit DNS Hostname`.
You can change subnet setting `Actions=>Modify auto-assign IP settings` and in this case when you create ec2, it would by default select subnet settings (enable/disable auto-assign public IP address). Of course you can also change it on ec2 level.
VPC Tenancy:
* multi-tenant (virtual isolation) - you share your instances on the same server as other aws clients, you instance is divided by virtualization
* single-tenant (dedicated, physical isolation) - you get completely separate hardware (can be useful if you have regulatory requirements)
EC2 Tenancy - you can set it for individual ec2:
* shared (accessible only if vpc tenancy = multi-tenant) - instance runs on shared hardware
* dedicated - instance runs on single-tenant hardware. After launch you can change only from dedicated to host and vice versa.
* host - instance runs on a Dedicated Host, which is an isolated server with configurations that you can control
3 layers of security:
* vpc layer - route tables define which traffic to allow
* subnet layer - NACL decide which traffic to allow
* ec2 layer - SG
PG (Placement group) - create ec2 in underlying hardware in such a way as to avoid correlated failures:
* cluster - packs instances close together inside AZ (good when you need high speed node-to-node communication, used in HPC apps). t2.micro can't be placed into cluster PG
* partition (up to 7 per AZ) - spread instances between different hardware partitions (so group in instances inside one partition don't share any hardware with group of instances from another partition)
* spread - strictly place instances into distinct hardware to reduce correlated failures
Prefix list - set of one or more CIDR blocks (can be used in SG as `SourcePrefixListId` to define not single CIDR range but a set of them).
If you want your ec2 to be accessed from elb you should put `SourceSecurityGroupId` id of SG for elb (in this way only elb or whoever has same SG can access ec2).
DHCP options sets - set of rules how to create private domain name. When you create new vpc, default DHCP set would be linked to it. It also add dns server into your vpc to determine dns rules.
You can crete your custom set and link it to any vpc. You can also remove DHCP set form vpc, in this case no dns name would be created.
If you want to change vpc DHCP set you can do it only after you've created vpc, go to `Actions=>Edit DHCP options set` and select another set or remove it from vpc. 
Yet if you unlink DHCP from default vpc, and try to create ec2, it will still use default dhcp rules and add public/private dns names.

###### Elastic Beanstalk
Imagine you have spring boot app that use mysql and you want to deploy it to aws, what you have to do:
1. create vpc/subnet/IGW/RT
2. create mysql RDS - for test/dev env you should create db inside beanstalk, but for prod it's better to create separate rds instance, so your db not coupled to lifecycle of your beanstalk env
You should store connection string/password in s3, since anybody with access to eb can view beanstalk env vars. But from s3 you only grant ec2 instance profile access to read file.
3. create EC2
4. ssh to ec2, install java, copy your jar file, and run it passing all env vars
Quite a lot for a start. Imagine if we have a tool where you can just say that you want java app, mysql db, set env vars and upload jar file, and all infra would be built for you.
Welcome beanstalk - aws service where you can say what you want and beanstalk will build all infrastructure for you (using CloudFormation under the hood). After successful deployment you can see your rds/ec2/elb and configure them separately.
Beanstalk - PaaS that mange deployment, provisioning, load-balancing, auto-scaling, health monitoring. Best suited when you need quickly deploy something and don't want to learn about other aws services.
It keeps the provisioning of building blocks (EC2/RDS/ELB/Auto Scaling/CloudWatch), deployment of applications, and health monitoring abstracted from the user so they can just focus on writing code.
You simply upload a `.war/.jar` (in case of java) file, and beanstalk run tomcat server for you and deploy your app. Yet developer has a right to manage all infrastructure provided by beanstalk.
Keep in mind that for prod deployment it's better to use your own CloudFormation script and manage infra with it, eb is good for testing purposes, PoC.
With EB you shouldn't worry about java installed on ec2, if you select java it would automatically install it into ec2 and use Corretto as jdk (same true for other popular env like node.js/tomcat and so on..)
You can use EB with Docker:
* single - you deploy docker file or built image. Use this when you want one docker per ec2 instance. If docker instance crushed/killed EB would restart it automatically.
* multicontainer - in this case eb would manage ecs cluster for you. So you don't need to manually create ecs and decide how many nodes should be running there.

###### DMS
Database Migration Service - used for easy migration between different db (like from MySql to DynamoDB), and also for data replication. Use it to migrate any supported db into s3 using `csv/parquet` format.
There are 2 types of conversion:
* engine conversion - homogeneous, when source and target - same db (for example both are mysql)
* SCT (Schema Conversion Tool) - heterogeneous, for converting between existing schemas. It's a separate software that you install in on-premise or ec2 and run.
So you download it and verify checksum, install jdbc drives for 2 databases
To run migration you need:
* create replication instance - instance that would run migration (download from source, transform, upload to destination). Use multi-AZ deployment, in this case if during middle of migration your replication instance failed for some reason, migration would continue with failover instance. 
Otherwise there is a risk that migration would be half-completed. You should put replication instance into the same vpc as your source or target, but you can use different vpc and connect them with vpc peering.
* specify source and target endpoints
* create & monitor tasks

###### ELB
ELB (Elastic Load Balancing) - is a proxy that accept traffic (using listeners) from clients and route it to targets (usually EC2), so it basically distribute your traffic between different ec2 instances and holds 2 connections:
* from client to elb
* from elb to ec2
There are 2 types of elb:
* internal (having only private IP)
* external (facing internet, having both public & private IP)
Listener - is a protocol + port for which you got incoming requests. There are 3 types of elb:
* Application (osi level 7) - if you need to balance http/https. Also supports websocket & secure websocket
* Network (ose level 4) - if you need to balance TCP/UDP
* Classic - if you need to balance classic (without VPC) EC2 instance
ALB+NLB - you register target in targets group and route traffic to target groups. CLB - you register instances within LB.
Target group can be of 3 types: ec2/container/list of IP (IP can be seated inside vpc or anywhere).
If you enable AZ for ELB, it creates lb node in AZ, after this traffic goes to this node. The best practice to have 1 node in each AZ.
If you have not equal number of EC2 in different AZ (let's say 2 in az1, and 8 in az2) then you should enable cross-zone balancing.
In this case each elb will route all traffic into 10 instances, so each instances will get 10% of traffic. But if you disable cross-zone balancing, then 50% in first zone would be divided between 2 instances (so each got 25%) and 50% from az2 would be divided in 8 instances (so each got 8.25% traffic). With ALB cross-zone balancing enabled by default.
Connection draining - makes sure that any back-end instances you have deregistered will complete requests in progress before the deregistration process starts. It's useful if you use ALB+ASG. in this case if asg decide to remove instance due to low load, elb will wait for this timeout to finish all current requests, but will not route any new requests.
When timeout over, elb will forcibly close all connections. It's enabled by default, value from 0-3600, default - 300sec.
```
TG:
  Type: AWS::ElasticLoadBalancingV2::TargetGroup
  Properties:
    TargetGroupAttributes:
    - Key: deregistration_delay.timeout_seconds
      Value: 600
```
ELB (except NLB) has sticky session - you can bind user's session to specific ec2 and every time this user hit elb he goes to the same ec2. To use this send `AWSELB` cookie and elb remember to which ec2 instance to route request.
There is no concept of sticky session on NLB, cause on level 4 there is no cookies, so no way to track connections. Yet nlb selects target group  using a flow hash algorithm. It bases the algorithm on:
* protocol
* source IP address and source port
* destination IP address and destination port
* TCP sequence number
Routes each individual TCP connection to a single target for the life of the connection. The TCP connections from a client have different source ports and sequence numbers, and can be routed to different targets.
So if you open new tab, that would mean that new port is opened, in this case nlb would see it as new connection and could route request to different ec2.
XFF (X-Forward-For) - header of original IP address of user (cause your ec2 would see IP of LB).
Health Check - you can monitor health of ec2 and always redirect user to healthy ec2 (ELB doesn't kill unhealthy ec2). There are 3 types of health checks:
* EC2 health check - watches for instance availability from hypervisor/networking point of view. For example, in case of a hardware problem, the check will fail. Also, if an instance was misconfigured and doesn't respond to network requests, it will be marked as faulty.
* ELB health check (1 heath check inside that check port status `AWS::ElasticLoadBalancingV2::TargetGroup`) - verifies that a specified TCP port on an instance is accepting connections OR a specified web page returns 2xx code. Thus ELB health checks are a little bit smarter and verify that actual app works instead of verifying that just an instance works.
* Custom health check - If your application can't be checked by simple HTTP request and requires advanced test logic, you can implement a custom check in your code and set instance health though API
You can set asg healthcheck by:
```
ASG:
    Type: AWS::AutoScaling::AutoScalingGroup
    Properties:
      HealthCheckType: ELB # means asg would monitor both ec2 & elb healthchecks, and replace instance if either one failed
```
ALB Request Routing - you can redirect user to different ec2 based on request attributes (subdomains, headers, url params..)
Listener Rule - can forward request but not change. So if you have a rule `/api => EC2_1, /internal => EC2_2`. That means EC2_1 should have url `/api` and EC2_2 should have url `/internal`.
Since we can modify rules, you can use elb to hide some api endpoints. For example you can create 2 rules like:
* rule-1 - forward /api requests to /api endpoint in your app
* default rule - always return 403
So with this only `/api` endpoint would be available. All other endpoints would return 403.
Access logs - contains clientIP/latency/request path/response - can be collected by CloudWatch and analyzed later. If you have problems with ELB you have to analyze access logs, cause vpc flow logs don't provide desired info (like request path or server response).
You can use elb with ec2 from private subnet. For this you should have public subnet within same AZ as private subnet and NAT. In this case you ec2 would be completely hidden behind elb.
TLS Listener - used by nlb for secure connection. To use it you must:
* deploy 1 server certificate (from ACM) - terminate the front-end connection and decrypt requests from clients, before sending decrypted data to TG
* select security policy (TLS negotiation configuration) - combination of protocols and ciphers. Negotiate TLS connections between a client and nlb. Custom policies not supported.
Protocol - establish secure connection between nlb and client. Cipher - encryption algorithm. NLB doesn't support TLS renegotiation. NLB doesn't support RSA cert larger than 2048bit
Security policy doesn't depend on protocol. You can have 10 TLS listeners with different protocols, but 1 security policy with default settings.
Smart certificate selection - nlb support multiple certificates per tls connection:
* when you create nlb from console you can specify only default certificate
* after you can go to `listeners=>View/edit certificates=>add certificate` to add other certificates
* if hostname match single cert - use this cert, otherwise - use best cert client can support
SNI (Server Name Indication) - host multiple tls application, each with it's own (or multiple) ssl certificate behind single ELB, which would choose optimal certificate for each client.
You can create multi-vpc elb, but if you want to route traffic to multiple vpc, better for each vpc to have single elb, and use route53 to route traffic to multiple elb.
Yet if you want to use single elb to multiple vpc, you should use vpc peering and for target group set `TargetType: ip` and set list of private IP addresses to `TargetDescription.Id` attribute.
End-to-end encryption - usually we terminate ssl on elb and from there we send traffic to ec2 using http, cause anyway from elb traffic is inside vpc, so it's secured.
But if you want, you can implement encrypted communication end-to-end. For this you need to add TargetGroup that forward traffic to ec2 using https. In this case you need some kind of nginx in your ec2 to terminate ssl there.
```
TG:
  Type: AWS::ElasticLoadBalancingV2::TargetGroup
  Properties:
    Port: 443
    Protocol: HTTPS
```
s3 logs - you can store elb logs in s3 and analyze it later with athena - below example would store all elb logs in specified s3 bucket:
```
  ELB:
    Type: AWS::ElasticLoadBalancingV2::LoadBalancer
    Properties:
      LoadBalancerAttributes:
        - Key: access_logs.s3.enabled
          Value: true
        - Key: access_logs.s3.bucket
          Value: s3_bucket_location
```

###### CloudWatch
CloudWatch - monitoring service for aws resources and apps running in aws cloud. IAM permission for CloudWatch are given to a resource as a whole (so you can't give access for only some of EC2, you give either for all EC2 instances or none).
You can also use CloudWatch to create alarms (for example you get 5 errors, and you want to notify developer). Alarms are integrated with SNS (so you can send email, put message to SQS and so on).
Many aws resources (EC2, RDS, and so on) automatically send metrics to CloudWatch. You can also send your custom metrics. Metrics can't be deleted, but expire automatically.
By default ec2 monitoring interval is 5min, but you can enable detailed monitoring (second step when you create ec2) and data would be flow every 1 min.
In ec2 you can create alarm too (when cpu goes above 80% - stop instance). If you want to track ec2 memory/cpu usage you have to install CloudWatch agent into ec2.
By default alarm call only ec2 actions (stop/start/terminate/recover). There are 2 ways you can add your logic (see details `sa/cloudformation/cw-alarm-lambda.yml`):
* create alarm and call lambda through sns (cause you can't call lambda directly from alarm) - execute logic in lambda
In this case in your lambda you should have only business logic (like add new ec2). Validation logic would be inside alarm (for example when cpu more than 80%), but you are limited for alarms (there is no alarm to validate that port return 200)
* create scheduled rule and call lambda every minute - in this case you should have business & validation logic inside lambda. Yet you are not limited and can create any type of validation (for example check that port returns 200)

###### KMS
Key Management Service - a service for generating/storing/auditing keys. If you have a lot of encryption it's better to use central key management service.
You start working with KMS by creating CMK (customer master keys), or if you are using encryption from other aws resource, it would create CMK automatically for you.
You can import only symmetric keys. But you can't export symmetric/asymmetric private key.
KMS keys are region specific (you can't transfer them into another region), so if you create key in one region you can't get it by accessing endpoint for another region.
CMK Rotation - automatic (once per year) change of underlying backing key without change logical resource. 
Yet previous backing key is stored perpetually until you delete cmk, so all data encrypted with previous key can easily be decrypted. But for all new encryption new key is used.
Data Key (limited to a region) - generated by CMK and used to encrypt data larger than 4KB (CMK can encrypt only less than 4KB) and be used outside KMS.
Envelope encryption - you encrypt data with data key, then encrypt data key with master key (stored securely by kms).
Access to key is a combination of key policy (resource policy) + iam policy. Any explicit deny always overwrite allow. Compare to other resources to add access to kms you must add key policy (with or without iam policy).
As other resource policy, key policy include `Principal` - who is using policy statement, and `Resource` - which is always `*` - which means this CMK. When you create CMK from:
* cli - if you don't provide any custom policy, default is created which gives full access to root user.
* console - you can choose users/roles from current account or any root user from other aws account which would have full access. Also root user is given full access.
It's best practice to give root user full access. Cause if you give some user full access, then delete this user, you can't use cmk. You must contact aws support.
So compare to other services cmk doesn't implicitly allow access to root user, you have to add it explicitly.
KMS vs CloudHSM:
* cloudHSM - your personal key encryption hardware in aws cloud
* kmd - shared hardware tenancy, you have your own partition inside shared with other aws customers
When you use kms for every policy (for example read policy for s3) you have to add `kms:Decrypt`, so s3 would have access to kms in order to decrypt data. So if you provide only s3 read without kms, s3 won't decrypt your data and you can't read it.

###### Route53
Route53 - is amazon DNS service that help to transform domain name into IP address. It's called 53, cause 53 - port of DNS.
You can buy hostname from any provider and register it within Route53, after this Route53 gives you 4 TLD (Top-Level Domain) that you put into your hostname provider, so end user will request your domain, it will got to your provider, and from there to aws. Route53 supports wildcards (subdomains).
Route53 also supports:
* WRR (Weighted Round Robin) where you can assign weight ans divide your traffic (for example you have new feature and want only 25% of users to use it).
* LBR (Latency Based Routing), in case you have aws resources in multiple regions, route53 will redirect users to region with lowest latency.
With Route53 you can also have private DNS name within your VPC, and such a name would be unaccesable outside VPC.
Heath check - a check that requested resource is available (can be used for any endpoint in the internet). DNS Failover - return result only if health check is fine.
For health checks route53 use health checkers that resides in different locations and don't communicate with one another (that's why your instance can be requested several times during specified interval)
Then route53 check if more than 18% of checkers are success, it considers endpoint healthy, otherwise unhealthy.
DNS responses use:
* UDP if size less than 512 KB
* TCP is size exceeds 512 KB
Routing policy:
* Simple - default policy to link domain to any aws serivce (elb/ec2/beanstalk)
* Failover - in case one ec2 fail, to redirect traffic to second one
* Geolocation - redirect traffic based on user location to record set with nearest geographic aws region
* Geoproximity - you choose region and set bias value, and based on this value region border is drawn then traffic goes according to these drawn by you borders
* Latency - redirect traffic to the region that provides the lowest latency.
* Multivalue answer - simple routing policy + healthcheck. You can set up to 8 instances, and if first become unavailable traffic goes to random one out of other 7.
Route53 gives different answers to different DNS resolvers. If a web server becomes unavailable after a resolver caches a response, client software can try another IP address in the response.
* Weighted - 90% of traffic to one ec2, 10 to second. Ideal for blue-green deployment (so you can route 10% for new version, see how it works, and then route all requests to new version and 0 to old).
Weight - int value from 0 (no traffic) to 255. Percentage calculated by weightNumber/totalWeight.
Hosted zone - route53 concept of domain. For each of your domain you have 1 hosted zone where you can have records. There are 2 types:
* public - available through the internet
* private - available inside vpc
Records set - subdomains of your hosted zone. You can easily route any record set to any aws services (s3/elb/cloudFront).
You can create route53 health check for dns failover (you can also choose String matching and not just ensure that response is 200 http status, but check actual content of response)
Apex domain - second level domain (example.com). All other like www.example.com, test.example.com - are third level domains
Alias record - way route53 allows you to bind domain (both apex and any subdomain) to dns record of s3/elb/cloudfront/beanstack/api_gateway/vpc_endpoint (by default you should add IP address, but IP associated with these services can be changed due to scaling up/down)
Alias is not the same as CNAME record. Internally route53 will substitute alias with appropriate IP address for `A` record. Of course you can take dns name of (let's say elb) and create CNAME record for this dns, and it would work the same way as alias for A record.
But alias can be assigned to root domain, CNAME can't, only for subdomains. This is the main difference. So alias is better cause it gives IP. Alias automatically changes IP address in case it was changed in aws (suppose you have alias for elb dns, and elb ip has been changed => aws would change dns A record and propagate it to all dns servers)
A record with Alias for elb `dig elb.aumingo.com`
```
elb.aumingo.com.	60	IN	A	52.202.13.14
elb.aumingo.com.	60	IN	A	34.194.253.144
```
CNAME record with custom dns for elb `dig elb2.aumingo.com`
```
elb2.aumingo.com.	300	IN	CNAME	elb.aumingo.com.
elb.aumingo.com.	59	IN	A	52.202.13.14
elb.aumingo.com.	59	IN	A	34.194.253.144
```
CNAME record with elb dns `dig elb3.aumingo.com`
```
elb3.aumingo.com.	300	IN	CNAME	elb-alb-1qtyacrlf2pd7-248530498.us-east-1.elb.amazonaws.com.
elb-alb-1qtyacrlf2pd7-248530498.us-east-1.elb.amazonaws.com. 59	IN A 34.194.253.144
elb-alb-1qtyacrlf2pd7-248530498.us-east-1.elb.amazonaws.com. 59	IN A 52.202.13.14
```
DNS record types
* A - you should assign IPv4 address (blog.example.com A 3.50.51.52)
* AAAA - maps subdomain to IPv6
* CNAME - you can assign another subdomain (blog.example.com CNAME test.my.com). Classic example when you support both apex & www domain, `A` record for example.com pointing to the server IP address and `CNAME` record for www.example.com pointing to example.com (but not other way around, cause you can't add CNAME record to apex domain)
* MX (Mail eXchange) - tells email delivery agents where they should deliver your email
* TXT - some text
* SOA - singular Start of Authority record kept at the top level of the domain. SOA and NS records are mandatory to be present at the root domain.
* NS - list of dns servers associated with name
* SPF (Sender Policy Framework) - used by mail servers to combat spam. This record tells a mail server what IP addresses are authorized to send an email from your domain name
* PTR (pointer record) - reverse of A record, used in reverse DNS lookups (when you type IP address and want to get dns name)
You can't assign CNAME to apex domain - the reason is simple. We can have a chain of subdomains all with CNAME records
```
test.example.com => test1.example.com
test1.example.com => test2.example.com
test2.example.com => test3.example.com
```
But sooner or later it should end with some apex domain. And since apex domain can't be CNAME we would get desired IP address. So if you could assign CNAME to apex domain that would meant that CNAME could be endless.
FQDN (Fully Qualified Domain Name) - complete name of domain ending with dot - indicating the root, like `aws.amazon.com.`.
Name Server - translates dns into IP address using Zone Files (text file that contains mappings between dns name and IP address). They are distributed all across the world.
Steps of DNS resolution (when you type dns name in browser):
* check host file `/etc/hosts`
* check local dns cache
* contact dns server to resolve IP
There are 13 RS (Root Servers) registered by ICANN. When RS receive request it redirects it to TLD (top level domain, like .com, .edu..) Server.
TLD Server will find IP address of second level domain, but if you are using third or more level domain it will contact Domain Level Name Server to get IP address of third or more level domain.
Route53 Resolver - helps to query on-premise dns from vpc and vice versa (used mostly for hybrid apps). There are 2 endpoints:
* inbound - forward dns query from on-premise to vpc
* outbound - forward dns query from vpc to on-premise dns resolver
For both types, IP are private, so in order to work you have to connect your network to vpc through direct connect or VPN.

###### RDS
RDS (Relational Database Service) - aws managed service, that make it easy install/operate relational database in the cloud. It helps easily scale compute resources or storage associated with your db, simplifies replication.
if you want to import data you have to:
* dump data to you local machine
* copy dump to some ec2/s3 in same vpc
* pump data into rds from ec2/s3
There are 2 ways to backup:
* automatic backup - snapshots takes by RDS daily, retained for limited period (by default 7 days). First snapshot contains full db instance, subsequent - incremental taking only what has been changed.
Volume snapshot - take daily during backup window + store transaction logs every 5 min - this allow for point-in-time recovery. If you disable automatic backup and then re-enable it, you will be able to recover point-in-time starting from the time when you re-enable automatic backup
* manual backup - full snapshot taken by user at any time manually (recover to the time when snapshot was taken).
multi-AZ (failover) for HA:
* primary - you main db that performs read/write
* standby - replica db that has most recent updates from primary. You can't use it for reads, the only purpose is failover - when primary fails, your standby becomes primary, so you won't even notice failure. Replication is synchronous.
You have no control for standby, so you can't promote it to be read replica. Since Aurora stores data across 3 AZ, if master is failed, it would automatically recreated in another AZ, so for aurora you don't need to set up stand-by replica.
Read replica (replica db only for reading) for horizontal scaling:
* write to master and read from replica
* can be cross-AZ and cross-region
* implemented using db (mysql or other) native asynchronous replication, that's why lag can occur, comparing with multi-AZ replication (synchronous replication)
* can be promoted to become master database.
Although you can use read replica for HA, it's recommended to use multi-AZ, cause it's syncronous and would guarantee that in case of fail, db in another AZ is most up-to-date (with read replica you can get some lag, and ended up with stale data on promoting it to master).
Enhanced monitoring - allows you to view all metrics with 1 sec granularity. Get current database `SELECT DATABASE() FROM DUAL;`.
RDS Proxy - database proxy that helps:
* pooling & sharing db connections (useful for serverless, when you constantly open and close connections)
* reduce db failover time for 66%
* enforce IAM access to db
When you reboot you can option to restart rds in new AZ
There are 3 types of groups:
* Subnet group - a list of VPC subnets (you should have at least 2 subnets in 2 different AZ) where rds would create your db.
* PG (Parameter Group) - a list of db config values that can be applied to 1 or many rds instances (for example you can increase a number of connections to rds here). You can't modify default PG (that would be created when you create db instance). If you want custom params add them to new pg and associate it with db.
* OP (Option group) - a list of features that are available for db instance. By default empty op is assigned when you create db, you can't modify it, but you can create new op - add options, and assign it to db.
    There are 2 types of options:
    * persistent - can't be removed from an op while DB instances are associated with this op
    * permanent - can never be removed from 
    There are 2 options available for mysql (for other engines other options available):
    * MariaDB Audit Plugin - records db activity like users logging or queries
    * MySQL memcached - enables apps to use InnoDB tables in a manner similar to NoSQL key-value data stores
You can enable encryption when you create db, but once created you can't enable it. So if you create unencrypted db and want to turn on encryption you have to take snapshot encrypt it and create new encrypted db from it, then remove old db.
IAM db auth - you can add db user and use iam user to authenticate to your db. You still have your initial username/password and can you them to access db, but you can also use temporary tokens generated by `aws rds generate-db-auth-token` command to get token and to access your db using this token (token would be valid for 15 min).
On-premise to rds data migration:
* copy dump to s3 and from s3 import into rds (you can also use ec2, but create new ec2 for this purpose in to wise, yet this would work: copy dump to ec2 within same vpc as rds, go to ec2, connect from there to rds, and pump data into rds)
* use DMS for more complex scenario
You can create encrypted rds only during creation time. If you created unencrypted db and want to encrypt it you should:
* create db snapshot
* copy snapshot
* encrypt copied snapshot
* recreate encrypted db from encrypted snapshot
If you have problems with writes and need more capacity you have 2 options:
* use sqs queue to offload writes, if you need to continue to use your current db
* switch to dynamoDB (if you don't need relational model)
Sharding (horizontal partitioning/scaling) - split data into smaller subsets and distribute them across a number of physically separated db servers (shards).
You can take a look here [mysql sharding example](https://github.com/dgaydukov/cert-spring5/blob/master/files/spring5.md#mysql-sharding) with java/spring.
Share-nothing model - each shard has same hardware and db engine configuration, but they don't know about each other. So there is no single point of failure, if one shard is down, no other shards affected.
Disadvantage - because data now separated between shards, you have to re-design your query approach. Because of this sharding is not best solution for OLAP.
So each shard represented as separate RDS with multi-AZ failover and/or read replica. To distribute data across different shards you can use list/range/hash partitioning.
Single table can also be partitioned by some key. Each shard contains table with partitions, app read this table from each shard and then app build mapping/routing logic in app layer like if productId in 1-100 - use shard1, otherwise use shard2.
ReSharding - adding more shards or splitting one shards into multiple in case of scale-out or merging several shards into one in case of scale-in.
Scale-out is pretty simple with RDS, you just create read replica, promote it to standalone db and then use 2 databases as 2 shards (since Aurora read replica use same storage you have to clone database to achieve the same).
If you think that sharding is looks like NoSql you are right, and if you got limit with relational db and using shards, it may be the better option to use NoSql, cause with sharding you have to modify your source code to support multiple db.
Storage autoscaling - when you create db you can enable it. Once enabled it would automatically add more storage capacity when free space would be less than 10%. It would be incremented in chunks of 5GB each, until it reach max auto scale capacity.
`IS NULL / IS NOT NULL` - use it when you want to check if column null or not null. Comparison operators like `<>` or `!=` won't work when you compare with null, cause null is absence of value.
In SQL, anything you evaluate/compute with `NULL` results into `UNKNOWN`, that's why if you are using `select * from my_column != null` you will get 0 results, although you have many rows where `my_column` not null.
Read replica vs elasticache - they both solve same problem but for different purposes:
* read replica - when your data constantly changing
* elasticache - since it's a cache if data constantly changing you have to constantly clear the cache - which basically remove advantages of cache
Security group:
* `AWS::EC2::SecurityGroup` - use if your rds resides inside vpc
* `AWS::RDS::DBSecurityGroup` - use if you are using old classic ec2 (without vpc)
SSL connection (use `sa/cloudformation/rds-multi-az.yml` template to test it out):
* by default ssl enabled in rds. Connect to rds and run:
```
MySQL [mydb]> SHOW VARIABLES LIKE '%ssl%';
+---------------+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| Variable_name | Value                                                                                                                                                                                                                                                                                   |
+---------------+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| have_openssl  | YES                                                                                                                                                                                                                                                                                     |
| have_ssl      | YES                                                                                                                                                                                                                                                                                     |
| ssl_ca        | /rdsdbdata/rds-metadata/ca-cert.pem                                                                                                                                                                                                                                                     |
| ssl_capath    |                                                                                                                                                                                                                                                                                         |
| ssl_cert      | /rdsdbdata/rds-metadata/server-cert.pem                                                                                                                                                                                                                                                 |
| ssl_cipher    | ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-SHA384:ECDHE-RSA-AES128-SHA256:ECDHE-RSA-AES256-SHA:ECDHE-RSA-AES128-SHA:AES256-GCM-SHA384:AES128-GCM-SHA256:AES256-SHA:AES128-SHA:DHE-RSA-AES128-SHA:DHE-RSA-AES256-SHA:DHE-DSS-AES128-SHA:DHE-DSS-AES256-SHA |
| ssl_crl       |                                                                                                                                                                                                                                                                                         |
| ssl_crlpath   |                                                                                                                                                                                                                                                                                         |
| ssl_fips_mode | OFF                                                                                                                                                                                                                                                                                     |
| ssl_key       | /rdsdbdata/rds-metadata/server-key.pem                                                                                                                                                                                                                                                  |
+---------------+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
10 rows in set (0.00 sec)
```
To see whether you session use ssl or not run `status` or `\s`
```
MySQL [mydb]> status
--------------
mysql  Ver 15.1 Distrib 5.5.68-MariaDB, for Linux (x86_64) using readline 5.1

Connection id:		    13
Current database:	    mydb
Current user:		    admin@10.100.1.222
SSL:			        Not in use
Current pager:		    stdout
Using outfile:		    ''
Using delimiter:	    ;
Server:			        MySQL
Server version:		    8.0.20 Source distribution
Protocol version:	    10
Connection:		        rm19odgxd4k3dhx.cmeydtld5sy2.us-east-1.rds.amazonaws.com via TCP/IP
Server characterset:	utf8mb4
Db     characterset:	utf8mb4
Client characterset:	utf8
Conn.  characterset:	utf8
TCP port:		        3306
Uptime:			        16 min 40 sec

Threads: 3  Questions: 9688  Slow queries: 0  Opens: 278  Flush tables: 3  Open tables: 184  Queries per second avg: 9.688
```
As you see `SSL: Not in use`, that means our current connection is not using ssl.
* In order to use ssl you ust download certificate and connect using cert
```
wget https://s3.amazonaws.com/rds-downloads/rds-ca-2019-root.pem
mysql -u admin -p'admin123' -h {RDS_ENDPOINT} -D mydb --ssl-ca=rds-ca-2019-root.pem
```
After you connect if you run status again you will see
```
MySQL [mydb]> \s
--------------
mysql  Ver 15.1 Distrib 5.5.68-MariaDB, for Linux (x86_64) using readline 5.1

Connection id:		    23
Current database:	    mydb
Current user:		    admin@10.100.1.222
SSL:			        Cipher in use is ECDHE-RSA-AES256-GCM-SHA384
Current pager:		    stdout
Using outfile:		    ''
Using delimiter:	    ;
Server:			        MySQL
Server version:		    8.0.20 Source distribution
Protocol version:	    10
Connection:		        rm19odgxd4k3dhx.cmeydtld5sy2.us-east-1.rds.amazonaws.com via TCP/IP
Server characterset:	utf8mb4
Db     characterset:	utf8mb4
Client characterset:	utf8
Conn.  characterset:	utf8
TCP port:		        3306
Uptime:			        49 min 54 sec

Threads: 3  Questions: 11063  Slow queries: 0  Opens: 279  Flush tables: 3  Open tables: 185  Queries per second avg: 3.695
```
Now you can see `SSL: Cipher in use is ECDHE-RSA-AES256-GCM-SHA384` that your connection using ssl.
* You can require ssl for specific user:
```
# connect to db
mysql -u admin -p'admin123' -h {RDS_ENDPOINT} -D mydb
# create user with ssl required
CREATE USER 'ssl_user'@'%' IDENTIFIED BY 'password' REQUIRE SSL;
GRANT ALL PRIVILEGES ON mydb.* TO 'ssl_user'@'%';
FLUSH PRIVILEGES;
# try to connect without ssl, you will get: ERROR 1045 (28000): Access denied for user 'user3'@'10.100.1.222' (using password: YES)
mysql -u ssl_user -p'password' -h {RDS_ENDPOINT} -D mydb --ssl-ca=rds-ca-2019-root.pem
# now connect using ssl
mysql -u ssl_user -p'password' -h {RDS_ENDPOINT} -D mydb --ssl-ca=rds-ca-2019-root.pem
```
IAM auth - you can access db not with username/password but by using iam permission (use `sa/cloudformation/rds-multi-az.yml` to test it out):
* by default it disabled
* you should explicitly enable it by setting `EnableIAMDatabaseAuthentication: true` in cf template (you can also enable it from cli)
* it can only work over ssl (it won't work without secure connection)
* You first create user then role with policy to this user:
```
# first create user
CREATE USER mydbuser IDENTIFIED WITH AWSAuthenticationPlugin AS 'RDS';
GRANT ALL PRIVILEGES ON mydb.* TO 'mydbuser'@'%';
# get access token and connect
TOKEN=$(aws rds generate-db-auth-token --hostname {RDS_ENDPOINT} --port 3306 --username mydbuser --region=us-east-1)
mysql -h {RDS_ENDPOINT} --user=mydbuser --password=$TOKEN --ssl-ca=rds-ca-2019-root.pem
```
If you want to build resource for role you should pass not rdsID, but `DbiResourceId`, so you can't use `Resource: !Sub arn:aws:rds-db:${AWS::Region}:${AWS::AccountId}:dbuser:${MultiAzMysqlDb}/mydbuser`.
Below is example of fetching 2 of them. And there is no way to fetch resourceId from cf `AWS::RDS::DBInstance`, that's why we use `*`.
```
aws rds describe-db-instances --query "DBInstances[*].[DBInstanceIdentifier,DbiResourceId]"
[
    [
        "rm19odgxd4k3dhx",
        "db-K7WGNELFM45SMZJAJMDI7T4F2E"
    ]
]
```
Materialized view:
* simple - just a wrapper on top of query
* materiazlied - temporary table

###### SQS
Payload vs attributes:
* payload - body usually json, can be encrypted
* attributes - key/value pair, always unencrypted.
So when you decide where to put data keep encryption in mind.
SQS (Simple Queue Service) - managed service that provide asynchronous decoupling and publisher/subscriber (queue) model. There are 2 types:
* standard - ordering is not guaranteed, no limit to number of messages (you should implement custom protection against duplicates)
* FIFO (first in, first out) - ordering is guaranteed, limit - 300 messages per second. There a few concept specific to this queue:
    * you have to provide deduplicationID (used for deduplication of sent messages) & groupID (specifies that a message belongs to a specific message group, group messages always processed one by one) with each message you send
    * Exactly-once processing - if you send message with same deduplicationID within 5 min deduplication interval (it's fixed, you can't change it), message won't be received by queue. You can either set-up content-based deduplication (use hash of contect to calculate deduplicationID) or send deduplicationID manually
    * Receive request attempt ID - used for deduplication of ReceiveMessage calls
    * Sequence number - assigned to each messages by sqs
But you can also use standard queue (unordered) but place order field into each message, and by this you imitate order.
It guarantee at-least-once delivery. you can use Amazon SQS Java Messaging Library that implements the JMS 1.1 specification and uses Amazon SQS as the JMS provider.
DLQ (Dead letter queue) - a special queue that receives messages from other queue after some unsuccessful attempt to process it. Used to isolate messages that can't be processed for later analysis.
When you create a queue you can specify dlq (it should be the same type, for standard - standard dlq, for fifo - fifo dlq) with max retry. So after your queue consume message 3 times (and you max retry is 3) and not delete it, it would automatically moved to dlq.
You can get time-in-queue (time how long message has been in queue) by subtracting SentTimestamp attribute from current time. In anonymous access SenderId - IP address of sender (otherwise accountId).
When you set dlq for sqs queue, it got attribute `RedrivePolicy: {"deadLetterTargetArn":"arn:aws:sqs:us-east-1:ACCOUNT_ID:my_dlq","maxReceiveCount":"3"}`
`SqsMessageDeletionPolicy.NO_REDRIVE` - would remove message if no redrive policy (dlq) specified. But if it specified messages won't be deleted automatically, you have to manually remove them from code. If message is not deleted several times (max retry), it would be moved to dlq.
You can read more about no_redrive policy [here](https://github.com/dgaydukov/cert-spring5/blob/master/files/spring5.md#aws-sqs-and-no_redrive-deletion-policy) with example in java/spring.
If queue is empty:
* short polling (default) - returns immediately with no results. Only possible way if single thread poll multiple queues, in this case long polling for one empty queue would block other queues, but it generally bad design.
* long polling - wait till message got into queue, or polling timeout (by default 20 sec) expires (save SQS cost, cause reduce number of empty receives). It's better to always use this type of polling.
Retention period - how long message stays in queue until removed by sqs. 60 seconds - 14 days, default - 4 days.
Visibility Timeout (0 sec - 12 hours, default - 30 sec) - once you app consume a message it becomes invisible to others. But until your app explicitly delete message, it won't be deleted.
For fifo if message in visibility timeout, no other consumer can get second massage with same groupId. So we need to wait until message processed, after any consumer can process other messages of this group. So you got order but no guarantee who is going to process next message (can be any consumer).
You can get twice same message if:
* received message is not deleted during `VisibilityTimeout` (time during which you should handle message and delete it from queue), you can [read more](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html#changing-message-visibility-timeout)
* `DeleteMessage` operation doesn't delete it on all nodes (since sqs is distributed system it may happen that one node was unavailable for short time and didn't get delete message, then it will deliver message again) - very rare
You can solve double-delivery problem by making processing request idempotent (no matter how many times it called you always return same result). Generally idempotency solve a lot of problem in distributed systems.
SQS is not replace for message broker like Rabbit/Kafka cause it doesn't support a lot of functionality that message brokers support like routing or message priorities. So it's incorrect to compare sqs to kafka, just like compare DynamoDB to MySQL.
DLQ (dead-letter queue) - queue with messages that failed to processed after n retries (otherwise some messages would retry forever, but you can specify param, so after 10 retry message goes to this queue, and not tried to retry again).
Each message has 3 unique attributes:
* QueueURL - url of sqs queue
* MessageId - unique id generated by sqs after you send message to queue
* ReceiptHandle - special ID by which you can delete message. Each time you receive message from queue, sqs generates it for you. So you can delete message only after you read it.
```
{
    "Messages": [
        {
            "MessageId": "29340194-279a-4752-af7a-e71e2e5b012a",
            "ReceiptHandle": "29340194-279a-4752-af7a-e71e2e5b012a#a4dd1399-61da-45ae-a0fc-d711b772ba9d",
            "MD5OfBody": "79bcbc1d34bcbf4c3de6877dc2994a0f",
            "Body": "{}"
        }
    ]
}
```
Although you can use iam to control access to sqs, it's better to use access control. Give access to another account.
```
{   
   "Version": "2012-10-17",
   "Statement" : [{
      "Effect": "Allow",           
      "Principal": {
         "AWS": [
            "111122223333"
         ]
      },
      "Action": [
         "sqs:SendMessage",
         "sqs:ReceiveMessage"
      ], 
      "Resource": "arn:aws:sqs:us-east-2:444455556666:queue2"  
   }]
}
```
You can send messages:
* 256KB - normal sqs message
* up to 2GB - using java library, [message is stored in s3](https://aws.amazon.com/about-aws/whats-new/2015/10/now-send-payloads-up-to-2gb-with-amazon-sqs)
Metric to use in auto scaling group (each sqs queue sends metrics to CW every 5 min):
* `ApproximateAgeOfOldestMessage` - age of the oldest message in queue. Useful when you have time bound for each message to handle.
* `ApproximateNumberOfMessagesVisible` - current queue length. Useful when you want to auto scale based on number of messages in queue
* `ApproximateNumberOfMessagesNotVisible` - total number of messages including in-flight (those that has been polled by app but not yet deleted)
Take a look at `sa/cloudformation/asg-target-sqs-size-based.yml` how to use asg + sqs queue
Batching - ability to send/receive batch of up to 10 messages:
* use `SendMessageBatch/DeleteMessageBatch/ChangeMessageVisibilityBatch` operations. `ReceiveMessage` - receive both single/batch.
* reduce costs - since sqs is charged per request, and you can batch up to 10 messages, you can save on costs
* you need to change app logic - for sender to batch messages before sending, to receiver wait longer and process a list of messages instead of 1
You can have multiple queues running at the same time. For example:
* high priority queue with on-demand instances
* low priority queue with spot instances

###### API Gateway
AGW - managed api service that makes it easy to publish/manage api at any scale. It can:
* support both HTTP(S) and WebSocket
* use built-in cache system to minimize load to backend
* meter/throttle traffic to your backend. You can throttle per client by supplying access key to clients (so vip clients can get more throttling than others)
* security (allow access only to EC2 with specific IAM role, allow only specific cognito users, allow to those who pass Lambda authorizer)
* DDoS (distributed denial-of-service) attack prevention
* caching (you backend won't be called every time, for some request cache would be returned)
* monitoring (integration with CloudWatch can set up some alarms)
* all endpoints are HTTPS, you can't create unsecure http
* send both websocket & http calls
You can also use AGW with openApi to quickly generate api endpoints and underlying models. 
Stage - like a tag, allows your api have multiple versions, like dev stage - myapi.com/dev/users.
Don't use stages for differente environments, but instead use different aws accounts for different env.
Real use case for stages is if you need to support different versions of api for prod at the same time.
You can add documentation to your api and expose it as swagger file. AGW can generate client-side SSL certificate, and you backend can get public key, so it can verify that requests are coming from AGW.
AGW calls are supported by CloudFront, so your api is highly available.
CORS (Cross-origin resource sharing) - request made to another domain/subdomain of the same domain/port/protocol. Take a look [here](https://github.com/dgaydukov/cert-spring5/blob/master/files/spring5.md#cors) with java/spring.
There are 2 types:
* simple - you should add `Access-Control-Allow-Origin` header in response. Request simple if:
    * it's GET/HEAD/POST, for POST it should include `Origin` header in request
    * content type is `text/plain`/`multipart/form-data`/`application/x-www-form-urlencoded`
    * there is no custom headers
* non-simple. CORS protocol require browser to send pre-flight OPTIONS request (it must have 3 headers: Origin/Access-Control-Request-Method/Access-Control-Request-Headers) for all non-simple cors requests.
To support cors, api should response to this pre-flight request with 3 headers: 
* `Access-Control-Allow-Methods` - methods which are allow to be executed
* `Access-Control-Allow-Headers` - indicate which HTTP headers can be used during the actual request
* `Access-Control-Allow-Origin` - actual origin that allows to call request
To enable cors for AGW you have to add support to OPTIONS request with 3 headers and for simple request just add single `Access-Control-Allow-Origin` header.
There are 3 types of AGW:
* edge-optimized - use CloudFront edge location to more your api closer to your users
* regional - run in specific region
* private - accessible only from within vpc
There are 5 integration types:
* lambda - 2 modes:
    * proxy - AGW wrap original request with some metadata, but don't modify response
    * direct integration - AGW modify request/response based on VTL (velocity template language) written by user.
* http - connect to any http(s) endpoints
* mock - response without backend service (mostly used for cors options request)
* aws service - connect to over 100 aws services
* Vpc Link - connect AGW to any resource inside private vpc
Resource policy - just like iam policy you can specify on the AGW level who can access which api based on:
* aws account
* IP range (you can use waf to blacklist by IP, cause to apply these rule you have to deploy agw)
* vpc or vpc endpoints
Http vs Rest api:
* rest api (AWS::ApiGateway)- old version, currently offers more features and full control over API requests and responses. Consists of 3 parts:
    * integration - lambda, http backend or any aws service - 2 types:
        * custom - if you want to throw errors you should add mapping to integration response and codes (400/500) to method response. Otherwise agw would return 200 even for errors
        * proxy - you should send response codes from lambda
    * request flow - logic before request reach integration. There are 3 parts:
        * auth - optional step:
            * authorization check - 3 ways:
                * iam (`authorizationType=AWS_IAM`) - add iam access key for each request. Then iam policy evaluate does user has access to this api
                Below an example of allowing call GET /pets endpoint.
                 ```
                {
                  "Version": "2012-10-17",
                  "Statement": [
                    {
                      "Effect": "Allow",
                      "Action": "execute-api:Invoke",
                      "Resource": "arn:aws:execute-api:us-east-1:account-id:api-id/*/GET/pets"
                    }
                  ]
                } 
                ```
                * cognito authorizer (`authorizationType=COGNITO_USER_POOLS`) - authroize using conginto user pool access token
                * lambda/custom authorizer (`authorizationType=CUSTOM`) - write you own lambda where you set auth rules
            * api key check - pass api key (that you can generate from api gateway) as http header `x-api-key`.
            Usage plan - set throttling/limits based on api key (so you can have different users with different keys with different usage plans).
            Auth check runs before api key check. You can use both of them or only 1.
        * method request - use it to validate request. You should do validation on this step, even before your api reach your lambda, if you validate on lambda you pay for it (even if validation failed and much of lambda not executed).
        AWS::ApiGateway::RequestValidator (set what you want to validate requestparam/body or both), Method.RequestParameters(validate headers/querystrings) + Method.RequestModels (validate body)
        * integration request - here you can transform request using VTL before sending it to integration.
        passthrough behavior - how api gateway handle request for `Content-type` that not defined in `Integration.RequestTemplates`:
        * NEVER - if no match, never proceed request to integration. `curl -H 'Content-type: text/xml' -H 'user-id: 1' --data '{"name":"jack","age":30}' {API_URL}/custom?status=1 -v` => `415 {"message": "Unsupported Media Type"}`.
         If match found use it for VTL request transformation and proceed to integration.
        * WHEN_NO_MATCH - if no match, proceed to integration. If match found use it for VTL request transformation and proceed to integration.
        * WHEN_NO_TEMPLATES -  if no templates at all has been defined, proceed to integration. If at least one defined work as NEVER
        There are 2 types of proxy for rest api:
        * proxy resource - url path as proxy, 2 types:
            * /user/{userId} - this is just capture single variable
            * /api/{proxy+} - capture all possible paths after /api and redirect all of them to lambda or http backend
        * proxy integration - pass intact request to awsService/lambda/httpBackend without using VTL, so you skip integration request altogether and pass your request to integration as it is
    * response flow - logic after integration responds:
        * integration response - reverse of integration request. Here you take message from integration and modify it.
        If you are using proxy integration, both integration request/response are not used.
        If you are using mock integration, here you should define body, response status and headers you want to return.
        You can use VTL, add `IntegrationResponses.ResponseTemplates` to define `Content-type` for which you can write VTL template, that would transform response from integration
        * method response - here you can modify response from integration response. You must set `MethodResponses` with at least 1 `StatusCode`.
        If you set headers in `IntegrationResponses.ResponseParameters`, you have to add headers with any value (usually false - idea is to put something) to `MethodResponses.ResponseParameters`
* http api (AWS::ApiGatewayV2) - new version, cheaper. There is no mock integration, only lambda
[AWS::ApiGateway::GatewayResponse](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html) - useful if you need to return cors (or other) headers when http error happened.
For example you can return cors headers, in case of some error, so browser won't be confused, [list of errors](https://docs.aws.amazon.com/apigateway/latest/developerguide/supported-gateway-response-types.html)

###### Cognito
Cognito - managed user service that add user sing-in/sign-up/management email/phone verification/2FA logic. There are 2 pools:
* User Pool - a directory with users' profiles, you can set up password strength, kind of IdP (Identity Provider)
You can migrate your users into cognito, but password won't be migrated. If you want to migrate them with password you need to add special logic to your app:
when user signin to your app - you signin him within cognito, if user doesn't exist in cognito you sign-up him with username/password.
Cognito also support SAML or OpenID Connect, social identity providers (such as Facebook, Twitter, Amazon) and you can also integrate your own identity provider.
* Identity Pool - temporary credentials to access aws services. If your users don't need to access aws resources, you don't need identity pool, user pool would be enough.
You can use users from User Pool or Federated Pool (Facebook, Google) as users to whom give temporary credentials.
You pay for MAU (monthly active users) - user who within a month made some identity operation signIn/singUp/tokenRefresh/passwordChange.
Free tier - 50k MAU per month. You can call `AssumeRoleWithWebIdentity` to get temporary credentials.
So you can singin to user_pool but you can use user_pool id token to get aws credentials from identity_pool
There are 3 types of cognito tokens (with accord to OpenID):
* id token - jwt token that has personal user info (name, email, phone). So you shouldn't use it outside your backend, cause it includes sensitive info. Usually id token = access token + user's personal details.
* access token - jwt token that includes user's access rights. You can use it outside your backend to get access to other services. Live of id/access token is limited, usually to 1 hour, and that's why you should use refresh token to prolong it.
* refresh token - use it to retrieve new ID and access tokens
Example creating users from cli:
```
# create user
aws cognito-idp sign-up --client-id={USER_POOL_CLIENT_ID} --username=john.doe@gmail.com --password=P@1ssword --user-attributes Name="email",Value="john.doe@gmail.com" Name="name",Value="John Doe"
# confirm user as admin (without confirmation password sent to eamil)
aws cognito-idp admin-confirm-sign-up --user-pool-id={USER_POOL_ID} --username=john.doe@gmail.com

# login & get idToken
aws cognito-idp initiate-auth --client-id={USER_POOL_CLIENT_ID} --auth-flow=USER_PASSWORD_AUTH --auth-parameters USERNAME=john.doe@gmail.com,PASSWORD=P@1ssword
# create cognito identity id
aws cognito-identity get-id --identity-pool-id={IDENTITY_POOL_ID} --logins cognito-idp.us-east-1.amazonaws.com/{USER_POOL_ID}={ID_TOKEN}
# get temporary aws credentials
aws cognito-identity get-credentials-for-identity --identity-id={IDENTITY_ID} --logins cognito-idp.us-east-1.amazonaws.com/{USER_POOL_ID}={ID_TOKEN}
```

###### CodePipeline(CodeCommit/CodeBuild/CodeDeploy)
CodePipeline - aws ci/cd tool, like jenkins. There are following stages:
* source stage - select what can be source: CodeCommit/ECR/S3/Bitbucket/Github
* build stage - what app would build your project: CodeBuild/Jenkins
* deploy stage - what provider would deploy app: 
    * CodeDeploy - use this tool to build some complex custom deployment
    * BeanStalk - use it if you need quick deployment option or you already use beanstalk. You need to have some infra for deployment, like ec2/elb, if you don't CodeDeploy not the best choice, use beanstalk instead.
    * OpsWorks
    * ECS - result run in ecs cluster
    * S3 - result just copied to s3
    * CloudFormation - result should be yml/json script that would be launched by cf
Pipeline execution - can be started in 2 ways:
* manual - you start it manually from console/cli
* automatic - start it based on some event:
    * CloudWatch Events (CodeCommit/S3/ECR) - default when you create pipeline from console with CodeCommit/S3/ECR as source
    * periodic checks (CodeCommit/S3/GitHub) - default when you create pipeline from cli with CodeCommit/S3/GitHub as source.
    Not recommended. If you create from cli, remove periodic checks by setting `PollForSourceChanges=false`. Use either CloudWatch events or webhooks.
    * webhooks (GitHub) - default when you create pipeline from console with github as source

###### Storage Gateway
Storage Gateway - hybrid storage that connects on-premises storage with cloud storage. The main idea is that you still use your on-premise storage (so don't lose that investment) and use cloud at the same time.
The basic idea is that you can manage aws cloud storage the same way (by using same protocols) as you are using your on-premise storage. There are 3 types:
* File - store & retrieve files in S3 using NFS(Network File System)/SMB(Server Message Block) (these objects can also be directly accessed from S3). You app read/write files using storage gateways as file server, which in turn translate it into S3 read/write requests.
You should have only storage gateway to be able to modify s3, otherwise if you overwrite file added by gateway, you would get unpredictable behavior when gateway try to read it.
File storage gateway (just like efs but only for s3, but you mount it the same way as efs) use local disk for 2 purposes: 
    * save uploaded files there and asynchronously upload them to s3
    * store frequently accessed files for low-latency access (cache)
The size of such disk should depend upon max possible file uploaded and how much data you want to store in cache
* Tape - cloud base VTL (Virtual Tape Library), used by your backup apps. Tape translate your app requests into Glacier.
* Volume - provide iSCSI target, where you can create block storage and mount it to on-premise/EC2 instances.
    * cached model - primary data in S3, frequently accessed data in on-premise.
    * stored mode - primary data in on-premise, but you have snapshots in s3 (data transfer is async).
Volume Gateways compress data before that data is transferred to AWS and while stored in AWS. Although data stored in s3, you can't directly access it through s3 api.
Storage Gateway optimize data transfer to cloud by using
* intelligent buffering
* upload/bandwidth management
* multi-part upload (in case of S3)
Storage gateway available as:
* virtual server (software) - you install it in your on-premise
* hardware appliance - you but it and use in your on-premise

###### ECS
ECS (Elastic Container Service) - docker container management service to run apps on a managed cluster of Amazon EC2 instances. It eliminate the need to operate container management infra (like kubernetes). There are 2 ways to create cluster:
* Networking only - Fargate is managing/orchestrating your cluster
* EC2 Linux/Windows + Networking - you manage EC2 cluster yourself
Cluster is just a VPC, subnets (by default 2), group of ec2 instances (in case of Fargate it manages instances by itself)
After you've created cluster you add tasks (task definition) - it just a docker containers that would run on one of your ec2 machines.
There are several network modes:
* awsvpc - every task get ENI with private ip address, just like any ec2 instance
* bridge - docker's default network type. All containers connected to bridge can communicate with each other
* host - container is exposed to host (if you docker has port 80, this port would be accessible from host)
[ECS Container Agent](https://github.com/aws/amazon-ecs-agent) - special software that included in ecs ami (specially built for ecs) for ec2, that help ec2 to communicate with ecs cluster.
You can install it into your own ec2, and by doing this to be able to connect your running ec2 to ecs cluster.
Launch type - type of infra on which your tasks/services hosted:
* fargate (self-managed) - run containerized applications without the need to provision/manage the backend infra
* ec2 (managed by you) - run containerized applications on a cluster of ec2 that you manage
Auto Scaling:
* ecs publish CloudWatch metrics with cpu/memory usage
* use App Auto Scaling to scale out/in your ecs based on CloudWatch events

###### EKS
EKS (Elastic Kubernetes Service, also called ECS (Elastic Container Service) for Kubernetes) - manages service that runs kubernetes cluster (so you don't need to deploy it from scratch).
* provisions/manages Kubernetes control plane and worker nodes for you
* runs 3 master nodes in 3 AZ for HA
* detect & replace unhealthy masters and patch/update kuber version
eks cluster consists of 2 vpc:
* eks-managed vpc - where kuber control plane (control plane nodes that run the kuber software, such as `etcd` and the kuber API server) resides
* customer-managed vpc - vpc created by you, where nodes resides
Docker - is a tool to quickly create and manage containers (like create/stop/start/destroy). But if you have many containers and they all should interact with each other you need some system to manage all of this.
Kubernetes - orchestration tool, helps to manage a group of containers. On container level kuber can use docker or any other container tool. Cluster - working deployment of kuber, consists of 2 parts:
* control plane - components that control cluster + cluster's state & configuration:
    * kube-apiserver - REST API webserver to communicate with control plane. You can use kubectl/kubeadm cli tools to send commands to it or send REST requests directly.
    * kube-scheduler - schedules pod to appropriate compute nodes
    * kube-controller-manager - there are several controllers that:
        * monitor pod health
        * request scheduler to restart pod
        * create account & api tokens
    * etcd - key/value database to store configs
* compute machines - nodes where pods are running:
    * pod - single container or series of tightly coupled containers
    * kubelet - tiny app installed on each compute node to take commands from control plane
    * kube-proxy - handle network communication
kubectl vs kubelet
* kubectl - cli tool to talk with control plane (under the hood it generate REST API calls and send them to control plane)
* kubelet - app running in each compute node, that manages it and take calls from control plane
EKS Control plane:
* runs a single tenant kuber control plane for each cluster, control plane infrastructure is not shared across clusters or aws accounts. 
* runs in aws account (not yours) and provide API endpoints to you, yet compute nodes are running in your vpc.
* uses vpc network policies to restrict traffic between control plane components to within a single cluster (so clusters can't reach other clusters).
* put eni (called Requester-managed network interfaces) into your vpc, so control plane can communicate with compute nodes
* consists of at least two API server nodes and three etcd nodes that run across three Availability Zones within a Region.
There are 4 ways you can create eks cluster:
* use aws console - good way to learn, not good for prod
* use CloudFormation template - best case for prod
* use `aws eks` cli - this can be a bit complex, cause for eks cluster you should:
    * create iam role for eks cluster
    * create vpc (with subnets, RT, SG)
    * create cluster `aws eks create-cluster --name=prod --role-arn={EKS_CLUSTER_ROLE} --resources-vpc-config subnetIds=subnet-6782e71e,subnet-e7e761ac,securityGroupIds=sg-6979fe18`
    * choose how you would provision compute nodes (using nodegroup or fargate). Suppose you choose nodegroup
    * create role for nodegroup
    * create nodegroup `aws eks create-nodegroup --cluster-name=prod --node-role={EC2_ROLE} --nodegroup-name=my --subnets subnetIds=subnet-6782e71e,subnet-e7e761ac`
* use `eksctl` cli - it hides all the complexity of `eks` command and allows you to create cluster with single command `eksctl create cluster` (it also add a lot of stuff like tagging subnets)
To auto-scale cluster you can:
* deploy [Cluster Autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler)
To auto-scale pods:
* [vertical](https://github.com/kubernetes/autoscaler/tree/master/vertical-pod-autoscaler) - kuber change pod based on cpu usage (so add more cpu or less)
* [horizontal](https://kubernetes.io/docs/tasks/run-application/horizontal-pod-autoscale/) - kuber change number of pods running based on cpu load
Cluster endpoint access:
* public - cluster api accessible from public internet and compute nodes access cluster over public internet
* private - cluster api accessible from within vpc and compute nodes access cluster vpc-to-vpc (traffic stays within aws network)
* public and private - cluster api accessible from public internet but compute nodes access cluster vpc-to-vpc
CNI (Container Network Interface) - allows the pod to have same IP address as ec2. Consists of 2 parts:
* L-IPAM daemon - create secondaray network interface and attach it to ec2. When number of pods exceeds number of IP for eni, assign another eni.
Different instance type support different number of secondary private IP (m5.large instance type supports three network interfaces and ten private IP addresses for each network interface - totally 30 private IP addresses).
* [CNI plug-in](https://github.com/aws/amazon-vpc-cni-k8s/blob/master/docs/cni-proposal.md) - assign same IP to pod
SNAT (source network address translation) - allows pod to communicate with outside world using ec2 public IP.

###### Fargate
Fargate is serverless compute engine for containers running in ECS/EKS, it removes the need to provision and manage servers. It's not a separate product, you should use it with either ecs/eks, otherwise there is no point in it.
You should use it when you don't want to manually provision your EC2 instances. If you need greater control over EC2 (for security or customization), it's better to avoid using it, and instead manually provision EC2 instances.
For eks fargate every pod is single ec2 with SG.

###### ElastiCache
ElastiCache - manages service that runs Memcached/Redis server nodes in cloud. It automates common administrative tasks required to operate a distributed in-memory key-value environment, consists of:
* node - smallest building block - network-attached RAM
* shard (node group) - primary node and zero or more read-replicas
* cluster (replication group) - group of shards
Vertical scaling - you can't scale existing cluster, you should spin up new cluster and redirect traffic there.
Memcached:
* cluster consists of up to 20 nodes, keys are distributed across nodes. If one node failed, data is lost. So memcached is best if you have data in db and just need a cache layer, and losing cache is not critical.
* stores objects as blobs, usually you put serialized result of db query
* new cluster (vertical scaling) starts empty
Redis:
* cluster consists of up to 15 shards (each shard is 1 primary and up to 5 replica nodes), so totally 15*6 = 90 nodes. So if you need data replication you should use redis. Replication is supported by only redis.
* support persisting in-memory data to disk
* supports blob/list/set/array as data types.
* can also sort/rank data (used for leaderboard)
* new cluster can be initialized from snapshot
Redis security - when you create redis cluster you can enable 2 types of security:
* encryption at-rest - you specify cmk to encrypt data while at rest
* encryption in-transit - you specify Redis AUTH Token (16-128 chars) that you will use for every request to redis
Caching strategies:
* Lazy loading - populate cache on-demand (first hit - request data from db, all subsequent reads - take directly from cache).
For this to work you should set TTL (time to live) to ensure that you always have last data (so if you ttl - 1 month, data would be stored in cache for 1 month, although they have been updated in underlying db after 2 minutes).
* Write through - whenever update happened you first update cache and then db (or first update dy and then async update of cache)
Downside if cache is not big enough, when new data arrived, LRU (least recently used) data is evicted from cache
Cache is implemented as key-value pair. So if you want to store leaderboard in cache you have to store sha256 of query as key and result of query as string value.
With cluster you distribute load across nodes/shards(in case of redis), it also protection against failure. If you have one node and it failed, your cache is failed, but if you have cluster of 10 nodes, and one node is failed, only 10% of cache is failed.
Redis cli examples (to get url open cluster and get primary node endpoint, don't use cluster endpoint):
```
# send ping to verify connection
redis-cli -h {REDIS_URL} ping
# connect to redis
redis-cli -h {REDIS_URL}
SET mykey myvalue
# store data with ttl of 5 seconds (after expired key would be null)
SET mykey myvalue EX 5
# get all available keys
KEYS *
```
There are 3 types of redis cluster in cf:
* AWS::ElastiCache::CacheCluster - create redis cluster with 1 node
* AWS::ElastiCache::ReplicationGroup - create redis cluster with replication (you can still have only 1 primary node, but usually 1 primary and many replicas)
* AWS::ElastiCache::GlobalReplicationGroup - global replication cluster (not supported, `An error occurred (ValidationError) when calling the UpdateStack operation: Template format error: Unrecognized resource types: [AWS::ElastiCache::GlobalReplicationGroup]`)

###### Systems Manager
SM (Systems Manager) - tool that helps you to manage your aws resources and automate some tasks on them.
When you create ec2 with SM agent role (this will give SM permission to interact with ec2), and later manage your ec2 from SM console (without need to connecting to instance with ssh), includes:
* document (json/yaml configuration as code) - allows you to set a series of actions to be performed on ec2. You can create your own documents or use provided by default, including collecting inventory/metrics, installing apps and so on.
* OpsCenter - place where ops team can view/resolve ops issues. It aggregates issues by creating OpsItems. On average OpsCenter reduce mean time resolution by 50%.
* Explorer - interactive dashboard
* Resource Groups - you can divide all your aws resources into groups (by tags) and view/manage resource of particular group
* AppConfig - you can test/deploy configuration into ec2/ecs/lambda
* Inventory - information about software installed on ec2 collected by SM (including: apps, files, network configs, updates an so on...)
* Automation - you can automate most common tasks for a group of aws resources
you can also update/patch your ami:
* Run Command - easy way to manage your ec2 instances without ssh/bastion. All actions made here are recorded by CloudTrail, so you can easily trace what happened
* Session Manager - browser cli that allow to interact with ec2 without ssh/bastion/opening inbound ports. 
It improves security, cause it doesn't require you to open inbound ssh port (22) to talk with ec2. You also don't need to operate bastion host.
For this to work you should assign a role to ec2 with policy `AmazonEC2RoleforSSM`. Internally ssh manager just ssh you as `ssm-user` with root privilege.

###### Config
Config - manages service that provides aws resources inventory, config history, change notification. When you turn it on it create config item for each resource.
It provides detailed view of the configuration of AWS resources in your AWS account (how the resources are related and how they were configured in the past so that you can see how the configurations and relationships change over time).
It integrated with cloudTrail, and record CloudTrailID for any resource change. Config Item - point-in-time record of aws resource, that include metadata, attributes, relationships, current configuration, and related events
Config Rule - desired configuration of resource that is evaluated against actual change (and report in case of mismatch). Conformance Pack - collection of config rules. There are 2 types of rules:
* managed - use one of many aws predefined rules to build your rule on top of it
* custom - you create rule from scratch and write your lambda that would be invoked by your rule to evaluate resource
CloudTrail - list of all api calls (cli & CF templates in the end are transformed into api calls). It stores point-in-time configuration of your aws resources.

###### Aurora
Aurora - mysql/postgres compatible (most app that works with mysql/postgres would switch with no problem to aurora) aws database solution. 
It's serverless - cause you can set-up min & max capacity and aurora would scale up/down based on load. You can also set up pause if aurora idle for specified time (like turn off if it's idle for more than 5 min). It's ideal for saving money in dev env, but don't use it in prod, cause wake up can be up to 30 sec.
Yet some features of mysql/postgres are not supported in aurora (like MyISAM storage engine). It runs 5x faster than mysql and 3x faster than postgres. And cost 1/10 of similar solution.
It replicates 6  copy of itself in at least 3 AZ (2 copies in each az) - so it's highly available. Backups and failover are done automatically. Self-healing storage - blocks are constantly checked and restored.
Aurora serverlsess - cheap version of aurora, pay only for what you use (aurora start up/down, scale up/down automatically base on your load).
You have 2 options to migrate to aurora
* use `mysqldump/pg_dump`, export data from mysql/postgres, and import it into aurora
* use RDS DB Snapshot migration
Min storage is 10GB, incrementing by 10GB up to 64TB.
There are 2 types of replica:
* aurora replica - aurora native same-region replica
* mysql replica - cross-region replica based on mysql binlog
Parallel Query - ability to distribute computational load across multiple instances.
You can call lambda from function & stored procedures for MySql Aurora:
* add iam role to allow db cluster to access lambda
* configure cluster to allow outbound connections to Lambda. This depends from your network config:
    * public cluster - it can access lambda through the internet - so no additional config required
    * private cluster - you have to add NAT gateway or lambda vpc endpoint so your cluster in private subnet can access lambda
You can also use s3 form MySql Aurora and you have to configure access to s3 same way as for lambda.

###### CloudTrail
CT - service that logs activity of your aws account (who made request, what params were passed, when and so on..). It's useful for compliance, when you need to ensure that only certain rules has ever been applied.
On average event appear in CT after 15 min after api call was made.
There are 3 types of logs
* management events - api calls to modify aws resources (create ec2/s3 and so on...)
* data events - api calls to modify actual data (s3 get/put/delete object + lambda calls)
* insights events - CT use ML (Machine Learning) to determine any anomaly (like spike in some api calls) and notify you.
By default:
* log files delivered within 15 minutes of account activity
* logs stored for 90 days and only management events stored. If you need longer you should create trail. Trail stores data in s3, you have to analyze it yourself (usually using Athena)
* trail viewable in region where it's created. for all-region trail - it's viewable in all regions.
* trail collects data from all regions. You can create single region trail [only from cli](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-create-and-update-a-trail-by-using-the-aws-cli-create-trail.html#cloudtrail-create-and-update-a-trail-by-using-the-aws-cli-examples-single), no way to create single-region trail from console. 
* trail created with GSE enabled (it's true for both when you create from console and from cli. Although when you create trail from cli you can specify `--no-include-global-service-events` not to include GSE into this trail)
When aws launch new region, in case of all region trail - new trail would be created in newly launched region.
* trail in s3  encrypted using SSE. You can set custom encryption with KMS.
Log file validation - guaranty that logs were not tampered with. When turn in, ct create a hash for each log file, and every hour store all these hashes in digest file in the same s3 bucket. 
Each digest file is signed with private key that generated by ct. You can download public keys with `list-public-keys` command, and validate signed files. But you have no access to private keys - they are managed by ct.
Private key is unique for each region within aws account. When you retrieve public keys you specify time range - 1 or more public keys may be returned. Mare sure your s3 bucket has correct write policy, otherwise CT won't be able to store logs there.
Organization trail - created by master account to log all events in all aws accounts for this organization (can be one/all region). You can deliver CT logs to CloudWatch, in this case CT would deliver logs to s3 & CloudWatch logs.
GSE (Global Service Events) - services like IAM/STS/CloudFront add logs to all trails that support GSE. It's turn on by default. You can turn it off only from cli/sdk.
* create trail `aws cloudtrail create-trail --name=multiRegionTrail --s3-bucket-name=my-test-s3-bucket-1 --is-multi-region-trail`
S3 bucket should have both `s3:GetBucketAcl/s3:PutObject` enabled in bucket policy, otherwise you got `Incorrect S3 bucket policy is detected for bucket`.
```
{
    "Name": "multiRegionTrail",
    "S3BucketName": "my-test-s3-bucket-1",
    "IncludeGlobalServiceEvents": true,
    "IsMultiRegionTrail": true,
    "TrailARN": "arn:aws:cloudtrail:us-east-1:ACCOUNT_ID:trail/multiRegionTrail",
    "LogFileValidationEnabled": false,
    "IsOrganizationTrail": false
}
```
* change trail to single region `aws cloudtrail update-trail --name=multiRegionTrail --no-is-multi-region-trail`.
In this case trail would remain in the region in which it was created, and all it's shadow trails in other regions would be removed.
```
{
    "Name": "multiRegionTrail",
    "S3BucketName": "my-test-s3-bucket-1",
    "IncludeGlobalServiceEvents": true,
    "IsMultiRegionTrail": false,
    "TrailARN": "arn:aws:cloudtrail:us-east-1:ACCOUNT_ID:trail/multiRegionTrail",
    "LogFileValidationEnabled": false,
    "IsOrganizationTrail": false
}
```
* Remove GSE `aws cloudtrail update-trail --name=multiRegionTrail --no-include-global-service-events`
* Change back to multi-region `aws cloudtrail update-trail --name=multiRegionTrail --is-multi-region-trail`
You get `Multi-Region trail must include global service events.`. So you should do both `aws cloudtrail update-trail --name=multiRegionTrail --is-multi-region-trail --include-global-service-events`. So You can't remove GSE from multi-region trail.

###### Certificate Manager
ACM (Amazon Certificate Manager) - service that allows you to create/deploy public/private SSL/TLS certificates.
ACM removes the time-consuming manual process of purchasing, uploading, and renewing SSL/TLS certificates.
There are 2 types of certificate
* public - issued by public CA, trusted by all browser by default. 
* private - issued by private CA. You can create your own private CA to manage all your private certificates. There are 3 modes to work
    * you can delegate management to ACM
    * you can manually distribute certificates to other services (like ec2), but ACM still renew your private certificates
    * you have complete control
ACM Private CA (Certificate Authority) - managed by aws private CA where you can create your private certificates.
Private CA handles the issuance, validation, and revocation of private certificates within a private network, compose of 2 
* private certificate
* CRL (Certificate Revocation List) - resources can check this list, that private certificate is valid one
Difference between public/private CA
* public - validate certificates in Internet. Can be used only with ELB/CloudFront/BeanStalk/API Gateway.
* private - validate certificates in private network. Can be used with any aws service (ec2).
Public certificate should have valid dns name, but private can have any desired name.
Self-signed certificate - certificate generated manually without CA (so no way to check if it's revoked or valid).
You can create certificate with multiple domain names or wildcard domain name (*.example.com).
Since public certificates proves domain identity, Amazon must verify that you own domain before issuing certificate. You can also use email validation.
DNS Validation - you modify your CNAME by adding some randomly generated token by ACM, that's how you prove that you own domain.
If you want to automatically renew your cert you shouldn't remove CNAME token, otherwise in order to renew you would have to run dns validation again.
Email validation - amazon sends email to the owner of domain that it obtains from whois service.
For successful issuing of public certificate DNS CAA should be empty or include one of: amazon.com, amazontrust.com, awstrust.com, or amazonaws.com
Public certs are free, but private CA - 400$ per month. You also pay for each private cert.

###### Cloud9
Cloud9 - cloud based IDE (integrated development environment) where you can run and execute your code. It basically a separate ec2 where you can install programs, write/build code, and work just like with your laptop.
So it basically IDE + linux. AWS CLI is preconfigured there. It's free but you pay for compute & storage, ec2+ebs. You can also connect cloud9 to on-premises server, in this case it's free.
When you close cloud9, after 30 min it automatically stops ec2. If you open again it restarts it.
Cloud9 provides aws lambda create/execute(locally)/deploy functions.

###### CodeStar
CodeStar - cloud based development service that allows you to build/deploy your code in aws. You can quickly set up continuous delivery.
You also got integration with jira out of the box. It's free, you pay for underlying resources (ec2, lambda, s3). You can use project dashboard to manage releases and see most recent activity. 
You can start cloud9 directly from CodeStar, and any code you commit in cloud9 automatically goes to CodeStart pipeline and deployed to ec2/beanstalk/s3

###### Rekognition
Rekognition - managed service that allows you to add powerful visual analysis to your app
* image - you can search/verify millions of images quickly (detects objects/scene/faces, search & compare faces, recognize texts or celebrities)
* video - you can extract motion pics from video/streams and analyse them (detect activity or inappropriate content, understand moving of people)
Rekognition using deep learning algos to determine image/video patterns. It is pre-trained for image and video recognition tasks (so you don't have to be ML expert to use it).
You can specify conditions (discard results with low confidence score) under which image would go for human moderation.
Terminology
* label - object/concept found in image based on description (for example, human/face/sun and so on..)
* confidence score - number 0-100 that indicates the probability that prediction is correct
Face recognition from video:
* upload video to kinesis video using `PutMedia`
* crete stream in rekognition using `CreateStreamProcessor` and provide 2 streams:
    * input - kinesis video stream
    * output - kinesis data stream (to store processed results)
Once created it will start automatically monitor kinesis video stream and consume videos for face recognition.
If you want to process images for face recognition:
* use s3 as source
* use ec2 to call `DetectFaces` api to process single image and store results in s3/redshift

###### Global Accelerator
GA allows you to create 2 static anycast IP addresses and routing users to nearest server to them.
You can create 2 ec2 from 2 regions and create GA for it. When user try to access it by IP he would be routed to the nearest region.
You can use [speed tool](https://speedtest.globalaccelerator.aws/) to see how GA would speed up routing. Apart from this GA can also allow traffic control (how much traffic direct to a particular region).
GA also has healthchecks, so in case one region become unhealed all requests would be routed to nearest healthy location.
Even if you are using single region, GA can still help you, cause it will route traffic to nearest aws region to user, and from there request would go through aws global network (which is faster than through the internet) to region with your ec2.
ELB provides load balancing within 1 region, GA provides traffic management across multiple Regions. So if you have all your load in one region ELB would be enough, no need to use GA, but if you have global distribution of services
across multiple regions, than definitely you have to use GA. In this case you can have several ELB for each region, and they are set as targets for GA.
CloudFront duplicates your data across different edge locations, but GA only route your request to nearest location to you.
Example of creating 2 ec2 in 2 different regions + GA that have both of them as endpoints
```
# create ec2 in singapore
aws CloudFormation create-stack --stack-name=ga --template-body=file://sa/cloudformation/global-accelerator/ap-southeast-1-ec2.yml --region=ap-southeast-1

# get ec2 id
aws CloudFormation describe-stacks --stack-name=ga --query "Stacks[0].Outputs[0].OutputValue" --region=ap-southeast-1 

# create ec2 and ga in us-east-1 region
aws CloudFormation create-stack --stack-name=ga --template-body=file://sa/cloudformation/global-accelerator/us-east-1-ec2-ga.yml --parameters=ParameterKey=SingaporeEc2Id,ParameterValue={instanceId}
```
Now you can access them using GA IP address, by using it you would be routed to the closest region. Now you can also terminate instance in closest region, and by doing this GA IP would be routed to second region.
Healthchecks are already built into endpoints, so you don't need to explicitly define them.

###### FSx
FSx - file system for windows and lustre. File system is accessible from inside aws. If you want to access it from on-premises you have to use direct connect or VPN.
Lustre - distributed file system for cluster computing (portmanteau word derived from Linux and cluster).
Generally FSx is cheaper than EFS (cause EFS provides 100% durability with multi-AZ deployment). FSx Lustre on average more faster then EFS
FSx for Windows - fully managed, highly reliable, and scalable file storage using SMB protocol. File Share - specific folder inside file system.
FSx mostly for windows, EFS - for linux. FSx integrated with windows AD (AWS AD or windows native AD) and windows users can use there AD identity to access resources on FSx.
By default FSx replicates data in single AZ for durability, but you can create Multi-AZ FSx go ensure data durability and failover in case of AZ damage. You can also create backups and store them in s3.
Lustre - open source high-performance file system (good for HPC, video processing, financial modeling, genome sequencing), it provides two deployment options:
* scratch - temporary storage and shorter-term processing of data. Data is not replicated and does not persist if a file server fails
* persistent - long-term storage (data automatically replicated within single AZ)
You can access FSx lustre from
* linux (install the open-source Lustre client on that instance)
Minimum size for Lustre is 1.2TB
Lustre has integration with s3 so you can access objects from s3 as files

###### VPN
On the high level vpn server is just bastion server but for end users. Bastion server is for developers/administrators, you explicitly access it though ssh, and from there you access all internal resources.
With vpn server everything the same, only difference - connecting is hide before some user-friendly program, like [openvpn client](https://openvpn.net/download-open-vpn), but once connected, end user has all the same access to all internal resources. 
When you access resources in both cases it looks like you are accessing them from inside vpc, and thus you can add SG rule to allow not all public IP addresses (`0.0.0.0/0`) but only CIDR addresses of vpn server allocated CIDR block, or from bastion server internal IP.
AWS VPN consists of 3 services:
* AWS Client VPN - connect users to aws vpc or on-premises network
* AWS Site-to-Site VPN (has 2 tunnels for redundancy) - connect your on-premises network with vpc
Redundant site-to-site vpn - create 2 customer gateways (with 2 separate devices in on-premise) and 2 vpn to single virtual private gateway.
* CloudHub - allows multiple sites (that all connected to your vpc) to communicate with each other (they already can communicate with vpc using site-to-site vpn). To establish it you must:
    * use single VGW
    * use separate customer gateway for each site and assign unique BGP ASN (Autonomous System Number) for each
    * each site should have non-overlapping IP range (VGW acts as hub and re-advertise these ranges to other sites, so they communicate with each other)
    * create site-to-site vpn for each site but with same virtual gateway (many CGW to single VGW)
Both of them using IPSec protocol (encrypt all IP packets of data before sending over the internet and decrypt them back on receiving).
Client VPN endpoint - allows end users to access aws network over TLS. Target network (vpc subnet) - network that you associate with VPN endpoint, so end users can access it.
You create vpn endpoint, associate it with target network and distribute vpn config file with end users. End user download openVpn and using your config connect to vpc.
When you create client vpn you can enable split-tunnel.
There are 3 ways for authentication for client vpn
* AWS Directory Service - your users in AD can just use vpn and be automatically authenticated cause they use AD
* Certificate-based authentication
* Federated Authentication using SAML-2.0
You can connect vpc to on-premise using Hardware VPN connection via the virtual private gateway.
There are 2 types of Site-to-Site VPN connections
* statically routed VPN connection 
* dynamically-routed VPN connection
Aws supports Phase 1 and Phase 2 of Diffie-Hellman groups.
Accelerated Site-to-Site VPN - achieve faster package delivery by using not public internet but aws global network (so packet goes to closest aws region datacenter and from there goes to desired aws region inside fast aws global network).
You can create certs. Don't forget to set Common Name (e.g. server FQDN or YOUR name) => it's domain name
```
1. Generate the CA:
openssl req -out ca.pem -new -x509 
(This creates two files: the CA file "ca.pem" and its private key "privkey.pem".)

2. Create a serial file:
echo "00" > serial.srl

3. Generate the server certificate and key:
openssl genrsa -out server.key 1024
openssl req -key server.key -new -out server.req
openssl x509 -req -in server.req -CA ca.pem -CAkey privkey.pem -CAserial serial.srl -out server.pem

4. Generate the client certificate and key:
openssl genrsa -out client.key 1024 
openssl req -key client.key -new -out client.req
openssl x509 -req -in client.req -CA ca.pem -CAkey privkey.pem -CAserial serial.srl -out client.pem
```
Then upload them and use `CloudFormation/advanced-networking/client-vpn.yml` update params as server/client ACM ID.
Download config and add 
* `<cert></cert>` - certificate from client.pem file
* `<key></key>` - private key from client.key file
Remove `remote-cert-tls server` from `*.ovpn` file, otherwise you got `ERROR: Certificate does not have key usage extension`
After run `sudo openvpn --config ~/Downloads/downloaded-client-config.ovpn`
After you can ping private ec2 from your local machine

###### Directory Service
DS (Directory Service) - hierarchical structure to store/search/manipulate objects, so users can locate resources no matter where they are stored.
In software engineering, a directory is a map between names and values. It allows the lookup of named values, similar to a dictionary.
DS - is a standard, AD - implementation of DS by microsoft.
AD (Active Directory) - microsoft DS that additionally provides SSO/LDAP so user can have roles/authentication to access resources, it stores users/computers/printers in company's network and provides access/roles to users.
AD provides centralize authorization and authentication to network resources, it also stores network resources and users information like computer, printers, users, users groups, organizational units, passwords information.
LDAP (Lightweight Directory Access Protocol, port 389, don't confuse with RDP - 3389) is an application protocol for querying and modifying items in directory service providers like AD.
Objects in AD grouped into domains. Tree - collection of one or more domains. Forest - collection of trees that share common global catalog.
Domain Controller - windows server that runs AD.
AWS DS - managed service replicated across multiple AZ. There are 3 types of aws ds
* AWS Managed Microsoft AD - microsoft AD completely deployed in cloud and managed there
Trust Relationship - you can build it between aws microsoft AD and your on-premise microsoft AD, and store your users/passwords in your on-premise AD
but use aws microsoft AD to access aws services based on users from on-premises AD. 
So you can use it as either standalone AD or as trust relationship to on-premise AD.
* deployed in 2 AZ
* connected to VPC
* backups automatically taken once per day
* EBS by default encrypted
* failed domain controllers automatically replaced in the same AZ using the same IP address
* simple AD - Linux-Samba AD deployed & managed in the cloud
you can singIn to aws management console with simple AD account
it doesn't support trust relationship, schema extension, multi-factor auth.
* AD Connector - connector to redirect all request to your on-premises AD. So it basically directory gateway that forward requests to on-premise AD.

###### Wavelength
Wavelength combines 5G networks with aws compute/storage services. You should use it when you want your aws services to be accessed from mobile devices with low latency.
Wavelength Zone - aws infra (compute/storage) deployed directly to telecom provider's datacenter so traffic reach aws infra without leaving provider network.
Carrier gateway - provides connection between subnet in Wavelength zone and telecom carrier (provider). So it provides NAT service from subnet IP range to provider's IP range.
Local Zone - aws solution where aws services are located locally near your end-users providing low latency.
Outpost - aws rack with compute/memory devices that you install on-premises and run it through aws management console.

###### SSO
SSO (Single Sing On) - aws service that allows central access to multiple aws accounts. You can use it as identity store or as connector to your existing identity stores (like microsoft AD).
To work with sso you should create aws organization (sso won't work without organization created). With sso you can access:
* multiple aws accounts (using aws organizations)
* SAML-enabled cloud applications (Salesforce/Office365)
* custom-built apps
Cognito is not supported IdP for sso. You can enable 2FA for SSO users:
* use mobile app with TOTP (time-based one time passcode)
* send TOTP to email address - don't use this option if users use sso to access their email - you got chicken & egg problem. To access email they first need to access sso for which they should provide code that was sent to email
2FA auth methods:
* disabled - 2FA is disabled for all users
* always-on - 2FA always enabled for all users
* context-aware - default mode, sso analyze sign-in context (browser, location, and devices) to determine if previously trusted context is used. If yes not 2fa code required, otherwise user must use new 2fa code.
sso user permission are set by permission set (kind of managed policy for sso), so based on this decided which action user is allowed to do in aws. 
Just like with iam user your sso user can access both aws management console and aws cli.
If you need access to third-party apps you can add applications to your sso under `application` menu. Just configure app and your user would be able to sign in into it.
Permission set - level of access that users/groups has to aws account, stored in sso and provisioned as IAM roles. User can have multiple sets.
You can configure 2 permission sets:
* Session Duration - time for which user can be logged in for aws, 1(default) - 12hours. After specified time user automatically logged out

###### OpsWorks
OpsWorks - config management service that provides managed instances of Chef/Puppet which help automate servers' configuration/deployment/management. There are 3 solutions:
* OpsWorks Stacks
* OpsWorks for Chef Automate
* OpsWorks for Puppet Enterprise
OpsWorks Stacks - manages apps and servers in aws and on-premises, you model your app as stack containing different layers (elb, rds, ec2).
You run Chef recipes using Chef Solo to automate package installation/deployment/management of your stack.
So it helps you provision/manage your app in aws using Chef solo installed in one of ec2. 
Difference with other platform:
* stacks - config management platform (using Chef to automate deployment/management, has less service coverage, just the most basic like vpc/iam/ec2/elb/cloudWatch). Best practice to have separate stack for each env (dev/prod).
* beanstalk - app management platform (you just upload code and beanstalk configure everything else use it's own CF templates)
* cloudFormation - infra management platform. If you need to provision a lot of resources use CloudFormation, if you have something like LAMP stack use beanstalk
OpsWorks Stacks create lifecycle events and on each of them some recipes could be executed (default events - setup/configure/deploy/undeploy/shutdown).
OpsWorks for Chef Automate - fully managed Chef server and automation tools for ci/cd. You can migrate to it from Stacks, but you would need to rewrite some recipes, but most recipes would work without any change.
OpsWorks for Puppet Enterprise - managed Puppet Enterprise server and automation tools for ci/cd (including orchestration/provisioning/deploying services in ec2)

###### SWF
Simple Workflow Service - coordinate work (tasks) across distributed apps. With SWF you don't need to use messaging system, cause tasks works as messages.
SWF offers rich SDK for quick development. To coordinate tasks, you write a program that gets the latest state of each task from Amazon SWF and uses it to initiate subsequent tasks.
Task - any invocation within app (code execution, web-server call, human action), they processed by workers, that take tasks, execute it and return result back.
Decider i-s a program that controls the coordination of tasks (ordering/concurrency/scheduling).
You can build your own coordination system, but you should take care that
* tasks may fail, timeout, require restarts
* tracking and visualizing tasks can be challenging
* you must ensure that some tasks assigned only once, and tracked all the way down
So of course you can reinvent the wheel, but it's better to use ready solutions like SWF.

###### Data Pipeline
DP - ELT tool that simplify data movement/processing in aws, integrates with on-premise and cloud-based storage systems.
You can transfer data between RDS/S3/EMR/DynamoDB. Pipeline - runs activities (common tasks) on data nodes. Data node - location where pipeline reads data or where it writes data.
Example of DP:
* extract log data from on-premise to s3
* launch transient Amazon EMR cluster, load s3 data, transform it and load transformed data to s3
* copy transformed data from s3 to RedShift

###### ElasticSearch & CloudSearch
ES - open source search service, it's usually a part of ELK stack
CS - search service like ElasticSearch, but aws proprietary development. With cs you can search txt/json/pdf/html/cvs/xls documents (so you can use it to search for scanned pdf documents too).
You should store your data in s3 and then use CS to search this textual data.
ES has 2 types of nodes
* data nodes - nodes that upload data to ebs and search data
* master nodes - increase cluster stability by performing cluster management tasks. For prod you should use 3 master nodes.
CS vs ES
* CS can use s3/DynamoDB, ES - only ebs
ELK stack consists of 3 parts
* ElasticSearch - log searching
* LogStash - log collection from ec2 to ElasticSearch cluster
* Kibana - data visualization tool (visualize data from ElasticSearch)
Fluentd vs LogStash:
* has internal in-memory system, so no need for additional tools like redis / internal queue limited to 20 events, so it needs redis to work normally
* uses standard built-in parsers (JSON, regex, csv) / use external plugins to parse log
* Logs are directly shipped from STDOUT without requiring an extra log file / need extra plugin to extract logs from docker
Above comparison shows that for kuber it's better to use Fluentd, due to its built-in Docker logging driver and parser

###### SageMaker
It's managed service, running JN, that provides ability to build, train, and deploy ML models quickly.
JN (Jupyter Notebook) - interactive computing environment, single document where you can run code, display the output, and also add explanations, formulas, charts.
SageMaker has 15 built-in ML algorithms, but you can also use your own.

###### Lake Formation
DL (Data Lake) - scalable central repository of large quantities and varieties of data, both structured and unstructured. There are a few steps
* ingesting and cataloging data from a variety of sources
* data is enriched, combined, and cleaned before analysis
You can use dms to convert db into s3 and replace read replica with data lake. But if you have many updates you should use Redshift/Hive
LF (Lake Formation) - integrated data lake service where you ingest/clean/catalog/transform/secure your data and make it available for analysis and ML.
LF provides you single console to ingest you data and then use other aws services like ML/EMR/RedShift to transform and query your data.
FindMatches ML Transform - solves 2 problems
* Data Deduplication - identify conceptually the same data using fuzzy logic (it's easy remove duplicates when you have some key like productSKU, but if not you should employ some logic to do this)
* Record Linkage - join 2 databases using fuzzy join (again it's easy to join by some key, but if you don't have such a key you should employ some logic to do this)
LF discover all available sources s3/RDS/on-premise db/CloudTrail, ingest it and transform into s3 in data formats for optimized performance and cost.
LF also manages granular access to your s3 bucket, and can give access to it to all other data analytics services (so you have central place to manage all access).
Hadoop Data Formats:
* Avro - row-based data format, data schema is stored as JSON.
* ORC - row columnar data format highly optimized for reading, writing, and processing data in Hive. Files are made of stripes of data where each stripe contains index, row data, and footer.
* Parquet - row columnar data format, files consist of row groups, header, and footer. Specialized in efficiently storing and processing nested data types.

###### Application Discovery Service
ADS collects and presents data about running apps and help understand the configuration, usage, and behavior of them for migration purposes. 
With data collected by this service you can perform a TCO (Total Cost of Ownership) and calculate is it reasonable to migrate to cloud.
There are 2 types of operation mode
* agent-based - install the Application Discovery Agent on servers and virtual machines (VMs) to collect data
Agent captures system configuration/performance/running processes/details of the network connections between systems
Agent uses HTTPS/TLS to transmit data to the ADS
Agent can be operated in an offline test mode that writes data to a local file so customers can review collected data before enabling online mode
* agent-less - VMware customers collect VM configuration and performance profiles without deploying the AWS Application Discovery Agent on each host
You need to install AgentLess Connector as OVA (Open Virtual Appliance) package on VMware vCenter.

###### Artifact
Artifact - portal that provides customers with ability to download AWS security and compliance documents, such as AWS ISO certifications, Payment Card Industry (PCI), and System and Organization Control (SOC) reports.
There are 2 types of docs: agreements (you can accept it or terminate, so 2 statuses - active/inactive) / report

###### Server Migration Service
SMS - agentless service that helps migrate on-premise workload to aws, significant enhancement of ec2 VM Import. You can migrate virtual machines from VMware vSphere, Windows Hyper-V, or Microsoft Azure to aws.
Connector - pre-configured FreeBSD virtual machine that you install in your on-premise. This connector replicate volumes into ami and transfer it into aws using TLS.
SMS schedule/coordinate/track incremental replication of many on-premise instances, so helping you to make large-scale server migrations.

###### Resource Access Manager
RAM - helps securely share your resources across AWS accounts or within your Organization. Shared resources can't be re-shared.
To share resources, you create a Resource Share, give it a name, add one or more of your resources to it, and grant access to other AWS accounts.
Account iam policy & scp applied to shared resource same way they are applied to provisioned resource in that account.
There are 2 types of sharing:
* sharing with organization - share resource with whole organization or with OU. For this to work master account should enable resource sharing within organization. If it's not done you can't share resources with organization, but you can still use individual sharing.
* individual sharing - share resource with individual account

###### DataSync
DataSync - online data transfer service that simplifies/automates/accelerates copying large amounts of data to and from s3/efs/FSx over the internet/Direct Connect.
How it works:
* uses a purpose-built network protocol and scale-out architecture to accelerate transfer to and from AWS.
* automatically scales and handles moving files and objects, scheduling data transfers, monitoring the progress of transfers, encryption, verification of data transfers, and notifying customers of any issues
If you want to migrate on-premise data to aws you should:
* make an initial copy of your entire dataset
* schedule subsequent incremental transfers of changing data until the final cut-over from on-premises to AWS
During migration DataSync:
* includes encryption and integrity validation to help make sure your data arrives securely, intact, and ready to use
* can schedule your migration to run during off-hours, limit network bandwidth to offload network
* can preserve metadata between storage systems that have similar metadata structures
* can use filters to include/exclude specific set of files
* migrate archive data directory to Glacier
* can build your data lake, by automating the transfer of valuable on-premises data sets to s3
* performs integrity checks to ensure transferred data is correspond to source data, by calculating file checksum and compare it with on-premise file checksum
* you can monitor transfer progress in CloudWatch (how many files and total volume)
* ensure file transfer even if some interruption (like network problem). In this case DataSync will resume file transfer and complete it after failed attempt
* use direct connect + vpc endpoint so data transfer happens inside vpc and doesn't go outside aws network
To transfer data you should do 3 things
* Deploy a DataSync agent in on-premise VM. Agent can be installed on ec2 by using AMI.
* Create a data transfer task
* start transfer
When you transfer data from s3 to some destination, DataSync first retrieve all files, so for Standard-IA/One-Zone-IA retrieval incur additional fees.
When to use it:
* storage gateway: use datasync to quickly migrate data to s3 and storage gateway to retain access to s3 data from on-premise
* snowball: key difference from snow family is that datasync - online transfer, white snowball - for offline
* S3 TA: if your app already integrated with s3 it's better to use s3 TA, otherwise (or if you have other than s3 destination) use datasync
* Transfer Family: if you have FTP/SFTP it's better to use TF, otherwise use datasync
You can turn off integrity check for initial transfer if data in source are constantly changing - this would expedite initial sync, and then turn it on after finish initial transfer.

###### Transfer Family
TF - 3 services for transfer from on-premise into s3:
* FTP (File Transfer Protocol) - network protocol for the transfer of data, use separate channel for control and data transfers.
Control channel is open until terminated or inactivity timeout, the data channel is active for the duration of the transfer.
* FTPS (FTP over SSL) - secure extension for FTP, allows encryption of both the control and data channel connections either concurrently or independently
* SFTP (SSH FTP) - network protocol for secure transfer of data over the internet, required single channel for commands and data. It's newer than FTPS so it's better to use it for new projects.
If you want any of these protocols and want to move data to aws you have to host and manage your own file transfer service, so TF solve this problem by providing managed file transfer service.
After creating TF you get:
* always-on server endpoint enabled for FTP/SFTP/FTPS. Endpoint can be accessible from within vpc or from public internet.
FTP endpoint will only be available inside vpc cause it's not secure. If you need internet facing endpoint choose FTPS/SFTP.
You can also create single endpoint that supports multiple protocols (yet if one of the supported protocol FTP - endpoint would be accessible only within vpc).
* set up users by integrating with microsoft AD, LDAP, any custom identity provider
* assign IAM role to provide access to s3 bucket

###### SNS
Simple Notification Service - allows you to send notification to sqs/email/http/sms/lambda/mobilePush. It uses pub-sub model, so notification is pushed to consumer, no need for polling.
Message Filtering - allows to subscriber create a filter and receive not all messages from sns, but only subset that conforms to filter.
There are 2 types of emails:
* json-email - in case emails are processing by some api, then whole email body would be json
* email - in case emails are processing by end users, who view them in their mail client (with html, links and so on)
SNS supports only standard sqs queue (not FIFO). You can subscribe multiple sqs/lambda to sns, so when message sent by sns it would be pushed to all subscribed sqs queues or lambdas.
Subscription registration - topic must confirm subscription before starting to get messages to prevent spamming. So you should confirm that you own api/sqs/email:
* http(s) - sns POST the confirmation message (containing a token) to the specified URL, your api should call `/ConfirmSubscription` with this token.
* email(email-json) - sns send email with link, use should click the link
* sqs - sns sends challenge message containing a token, you should call `/ConfirmSubscription` api to confirm you have access to sqs queue
SNS is durable storage, it stores message across several AZ before confirming message receipt.
Destination retry - if http destination unavailable you can configure retry numbers. For lambda/sqs retry is forever, you can be sure that message would be delivered there.
Just like sqs, sns may occasionally deliver message trice due to distributed nature, so try to design your subscribers to be idempotent.
If subscriber unavailable for specified retry number (for example http method was removed from your api), message would be discarded.
There are 2 types of sms:
* transactional - sms would be delivered over routes with the highest delivery reliability (otp or pin code)
* promotional - sent over routes that have a reasonable delivery reliability, but cheaper than transactional
Multiple size of sms is 140 chars, if size exceeds this, sns split message into several messages.
Mobile push notification can be sent to mobile devices where your app is installed and user allowed push notification.
Direct addressing - you can push notification to single subscriber instead of pushing to all subscribers.
SNS vs SQS:
* sns - push based, consumer don't need to poll data, data would be pushed to them
You can use fanout - push single messages into multiple subscribers (push 1 message to 5 sqs queues).
To implement fanout with pure sqs you would need to write complex sync logic (so polling queue should check if all other queue read this message, and only in this case remove message from fanout queue using dynamoDB - as you see a lot of work).
* sqs - poll based, once message in queue, consumer need to poll it, handle and remove from queue
SNS vs SES for email sending - although both can be used to send emails, there are some differences
* sns - for sending emails for developers in case some failures
    * body limit - 8KB, so you can't send attachments
    * to receive emails user must be subscribed to email topic
* ses - sending emails for end users
    * supports custom email header fields, and many MIME types
    
###### AppSync
AppSync- allows developers to manage/synchronize mobile app data across devices, access/modify data when mobile device in offline state, so basically your app can work in offline mode.
It supports Android/iOS/JavaScript. You can use open source clients to connect to AppSync GraphQL endpoint to fetch/save data. You can use dynamoDB/ElasticSearch/Lambda as data sources for AppSync.

###### Service Catalog
SC helps IT administrators & devops create/manage aws resources to end users. So you can control which users have access to which products.
So end users only need IAM role to access SC itself, and from there they can create aws resources that are allowed in SC for them.
You can manage all aws resources manually and create access policy to each user for each resources. But can create SC with a set of aws resources and add access to it to user. 
And this user will get access to all resources inside SC. You create portfolio add products and gran users permissions to chosen portfolio.
End users have simple portal where they can discover allowed services (products) and launch them.
Portfolio - collection of products. Product - cloudFormation template with a list of aws resources. Users then can launch any product in portfolio.
You can share portfolio with other aws accounts. By using cloudFormation params you can customize user experience (for example end users can choose what type of ec2 instance to run).
Product has versioning, so end users can choose new version or update their stack to new version.

###### Inspector 
It's automated security assessment service that test the network accessibility of your ec2 and apps running on them.
You install agent on your OS, and it collects data and send it to inspector for analyzing. Assessment template - configuration based on which inspector validates your system.

###### Neptune
It's fully-manages graph database (not relational) service optimized for storing billions of relationships and querying the graph with milliseconds latency. 
It's ACID compliant with immediate consistency. It's uses operational technology (lifecycle management, encryption-at-rest with KMS) shared with RDS.
It replicates all data 6 times across 3 AZ (neptune divide your storage on 10GB chunk and replicate each chunk 6 times).
Automated backups enabled by default. You can take manual snapshot any time. You can restore snapshot only into new database.
You can also share snapshot with other aws accounts. It runs inside vpc so you can use NACL/SG to secure neptune instance.
It's best suited for: recommendation engines, fraud detection, knowledge graphs. 
It support 2 types of graph (buy you can use both types of query language at the same time):
* Property Graph - which use Apache TinkerPop Gremlin graph traversal language - neptune provides Gremlin Websocket Server
* RDF (Resource Description Framework) - which use SPARQL (declarative query language, looks like sql) neptune provides SPARQL 1.1 Protocol REST endpoint
Gremlin - imperative/declarative graph traversal language. TinkerPop/Gremlin to graph db - the same as jdbc/sql for relational db.
Cluster - one or more db instances + cluster volume. Made up of 2 types of instances:
* primary - support read/write, does all data modification in cluster volume
* replica - connected to the same volume and does only read operations. Neptune uses Multi-AZ, so in fail, read replica would be promoted to primary.
There is always 1 master and up to 15 read replica (yet you can read from master too). Each instance using the same storage but evaluate query independantly.
Replication lag is < 10ms. Automatic Failover time = 60sec to promote read replica into master. If you don't have read replica, in case of failover neptune will create new master, cause underlying srorage persists.
Yet it will take some time, so if you want fast failover it's better to have at least 1 read replica and send read query there from time-to-time to keep it warm.
It stores all data in special format `Subject/Predicate/Object/Graph` - so basically 4 column tables. Indexes are built automatically.

###### Greengrass
It allows your devices process the data they generate locally, while still taking advantage of AWS services when an internet connection is available.
You can use programming language and then install this software on Raspberry Pi.
So you can have aws lambda, wrap it into greengrass and then ship it ot IoT device. Of course if device in offline mode, and lambda use dynamoDB, calls would fail.
Local Resource - buses/peripherals that are physically present on the device. You can also build ML model with SageMaker Nero and then install into device.

###### WAF & Shield
3 security services joined under single tab in aws:
* waf (web application firewall) - you add rules that allow/deny/count web requests based on conditions that you define. Conditions are: HTTP header/body, URL string, SQL injection, XSS (for example you can block specific user-agents).
Underlying service send request to waf, waf validate it based on rules you defined and instruct you service to block/allow request to proceed. It's integrated with CloudFront/ALB/Api Gateway.
Rate-Base Rule - allows you to set a number of allowed request per IP address during predefined time (100 requests per 5 min - once this IP send 101 request, it would be blocked, until 5 min period ends, and new starts).
Managed Rule - default rules that automatically updated by AWS Marketplace security Sellers, protects against common known issues.
In case of rule fail you can configure CloudFront to show error page. Rules take a minute to propagate worldwide. It inspects both HTTP/HTTPS traffic.
* shield - provides protection against DDoS (Distributed Denial of Service) attack. There are 2 types of this service:
    * standard - free, activated by default for all accounts. Protect all aws infra (layer 3 and 4) against most common attacks like SYN/UDP floods or reflection attacks.
    * advanced - paid, protect against more sophisticated attacks, like layer 7 HTTP & DNS floods. It constantly monitors network traffic and provides near real-time notifications of suspected DDoS incidents.
You can use shield to protect on-premise servers. For this use aws endpoint with shield in front of your on-premise server. Shield notify about attack by sending metrics to CloudWatch.
* FM (Firewall Manager) - tool that makes it easier for you to configure your WAF rules and vpc SG across your accounts. So if you have single account no need to use FM, but if you have aws organization with many accounts
it's better to use single tool to configure waf across all accounts, cause FM integrated with organization so have a single place to quickly respond to incidents.

###### Trusted Advisor
It reviews your account and makes recommendations for saving money, improving system performance, closing security gaps.
It includes a list of checks in the categories of cost optimization, security, fault tolerance, performance, service limits.
If you turn it on you will got weekly email notifications regarding what can be improved (you can exclude resources on which you don't want to get notified).
So basically if you want improve performance/efficiency you should use trusted advisor + CloudWatch.

###### CloudHSM
CloudHSM (Hardware Security Module) - dedicated HSM instances within aws cloud. You can securely generate/store/manage cryptographic keys.
HSM provides secure key storage and cryptographic operations within a tamper-resistant hardware device.
Cluster - contains multiple devices across AZ/subnet in single region. You can't create single device, only cluster with 1 or more devices.
Since devices created in sunbets you need to have vpc in order to use CloudHSM. Daily backups are automatically taken and stored in s3 (bucket must be in the same region as cluster).
All backups encrypted with 2 types of keys:
* EBK (ephemeral backup key) - generated inside HSM when backup is taken. Used to encrypt backup. Encrypted backup include encrypted EBK.
* PBK (persistent backup key) - used by HSM to encrypt EBK. Generated based on 2 other keys:
    * MKBK (manufacturer key backup key) - permanently embedded in the HSM hardware by manufacturer
    * AKBK (AWS key backup key) - installed in the HSM during intitial setup by aws CloudHSM.
You can use with database or with nginx to off-load ssl. Best practice to sync all keys at least in 2 devices in separate AZ.
It's built with physical and logical tamper-protection, so it trigger key deletion (zeroization) in case of breach.

###### Polly
It turns text into lifelike speech. You can supply polly with either simple text or SSML format.
Pronunciation lexicon - enable you to customize pronunciation of words. You can create/store lexicon in region (so if you want to use one lexicon in 2 regions, you have to create second lexicon in second region and copy first).
Lexicon is written using xml-like language of PLS (Pronunciation Lexicon Specification) W3C recommendation.
You can apply up to 5 lexicons to single text. If more that 1 lexicon contains the same grapheme, first applied would be used. So if you want at different texts use different grapheme you should change lexicon order.
Below is grapheme example:
```
<lexicon>
  <lexeme> 
    <grapheme>S3</grapheme>
    <alias>Simple Storage Service</alias>
  </lexeme>
</lexicon>
```
SSML (Speech Synthesis Markup Language) - xml-like language to define text to be pronounced by polly.
There are several reserved chars in ssml like `"&'<>`. Main tag is `<speak/>`, you should put your text inside it.
To emphasize you can use `<emphasis>` tag with `value` attr:
* strong - increase the volume and slow the speaking rate so that the speech is louder and slower
* moderate - same as strong but less strong
* reduced - decrease the volume and speed up the speaking rate. Speech is softer and faster
Example of using ssml:
```
<speak>
     I already told you I <emphasis level="strong">really like</emphasis> that person.
</speak>
```

###### MQ
MQ (Message queue) - managed Apache ActiveMQ message broker. It stores data in EFS and provides HA. It provides both push-based and poll-based messaging model.
Selector (like filter in sns) - can filter messages for different consumers. Exclusive consumer - all messages from queue goes to single consumer.
Message group - all messages with same JMSXGroupID header goes to same consumer. There are 2 types of delivery mode:
* persistent - message broker should persist message on disk before deliver it to consumer
* non-persistent - stored in RAM
MQ vs SQS:
* sqs - simple queue with post/poll options only
* mq - complex solution with message routing, fanouts, distribution lists, that supports AMQP/JMS protocols

###### X-Ray
it's distributed tracing tool (like zipkin & jaeger) that:
* helps developers analyze/debug production/distributed apps built using microservices.
* provides an end-to-end view of requests as they travel through your app, and shows a map of underlying components
with x-ray you can:
* build service map - by tracking request inside your app, x-ray builds map of services
* find errors and bugs - x-ray find all bugs by analyzing responses to all requests
key concepts:
* agent - can be installed into ec2 and collect logs there to send them to x-ray for analysis
* sampling - you can collect info only about small set of requests to be cost-effective (so if you want to test x-ray with cost-optimized you must sampling at low rate)
* filter expression - can be used to filter all requests from x-ray

###### WorkDocs
It's managed/secure storage & share service with strong administrative controls. Users can comment on files, send them to others, upload new versions.
You can use wd from web browser or install special app for ios/android/desktop. By default all uploaded files are private, but users can share their file with other users.
Users use directory credentials to access wd. If you already have active directory you can integrate it, otherwise wd will create new directory for you in the cloud.
You can mound your drive to WorkSpaces and have access to all your document from there.
Users don't need aws account, yet wd admin need aws account. To remove user form wd you have to remove user from directory.
There are 4 roles in wd:
* admin (paid) - has administrative permissions for wd including user & settings management
* power user (paid) - can be given special set of permission by admin
* user (paid) - can save files and collaborate with others
* guest user (unpaid) - can only view files
Power user and just user called managed users.
Admin can set following permissions:
* public share - who can create publicly shared links: no one / only power users / all managed users
* external invitee - who can invite external users to wd: no one / only power users / all managed users

###### WorkSpaces
It's managed/secure cloud desktop. Don't confuse with cloud9 which is web IDE, where ws is complete desktop (you can install any IDE there).
Users can use their browser or special desktop client to user ws. To authenticate they should use directory service. If you have directory you can integrate it with ws, otherwise ws would create new directory for you.

###### Batch
It's a set of batch management tools that allows to run hundreds of thousands of batch computing jobs on AWS. Resources are dynamically provisioned.
It handles job execution and compute resource management and you can concentrate on code. It's best suited for: deep learning, genomics analysis, image processing, media transcoding, bash scripting.
You simply submit jobs to batch and it provision ec2 or spot fleet and run your jobs there. Job Definition - specify params, env vars, RAM & CPU number requirements.
It uses ecs to execute containerized jobs, so ecs agent should be installed on ec2 (you can use ecs ami or create your own).
When you create your own ami, it should include:
* linux of latest version
* docker daemon running
* ECS container agent
* awslogs log driver with `ECS_AVAILABLE_LOGGING_DRIVERS` env var

###### DocumentDB
It's fully managed, mongo-compatible document database service. You can store/query json data.
MongoDB-compatible - means your current apps that using mongo, can be easily migrated to DocumentDB (which implements Apache 2.0 open source MongoDB 3.6 API).
You can easily migrate your mongo to DocumentDB with DMS. It replicates each chunk of data 6 times across 3 AZ.
Read - 8KB, write - 4KB. If you write 1 KB it counts as single IO. Yet concurrent write operations with size less than 4kb, are batched to reduce cost.
min size - 10GB, max - 64TB. It automatically grows by 10GB chunks. Automated backups are enabled by default.
Cluster can scale up to 1M reads per sec with up to 15 read replicas (read replica use same underlying storage updated by master). It doesn't support cross region replica (all replicas in same region only).

###### Keyspaces
It's managed Apache Cassandra–compatible (you can run Cassandra workloads using the same Cassandra Query Language (CQL)) database service. 

###### Cloud Development Kit
CDK - open-source software development framework for writing cloud infra as code using c#/java/python/typescript. Under the hood cdk compiles code into CloudFormation template and run it in aws.
You use cdk cli to interact with cdk. Take a look at [examples](https://github.com/aws-samples/aws-cdk-examples). Construct Library - packages solution (maven/npm) for specific CloudFormation construct.
You should have node.js installed, then run `npm install -g aws-cdk` (if you want specific version per project install it without `-g` option into project dir).
```
# get all available commands
cdk --help

# get help for specific command
cdk list --help

# create empty java app
cdk init --language=java
```
When you create project only single core dependency in pom.xml
```
<dependency>
    <groupId>software.amazon.awscdk</groupId>
    <artifactId>core</artifactId>
    <version>1.66.0</version>
</dependency>
```
Yet for [each CloudFormation template they have separate dependency](https://mvnrepository.com/artifact/software.amazon.awscdk) so for example if you want to build ec2+elb+asg you have to add these to your pom.xml
```
<dependency>
    <groupId>software.amazon.awscdk</groupId>
    <artifactId>ec2</artifactId>
    <version>1.66.0</version>
</dependency>
<dependency>
    <groupId>software.amazon.awscdk</groupId>
    <artifactId>autoscaling</artifactId>
    <version>1.66.0</version>
</dependency>
<dependency>
    <groupId>software.amazon.awscdk</groupId>
    <artifactId>elasticloadbalancingv2</artifactId>
    <version>1.66.0</version>
</dependency>
```
To build json file from your java code, run `cdk synth > template.yml`. This will create 2 files. in cdk.out - JSON, and template.yml - YAML.
CDK vs SAM vs CloudFormation:
* CDK - write templates using programming language
* SAM - limited CDK only for serverless
* CloudFormation - write templates using YAML/JSON
My conclusion it's better to use native CloudFormation YAML template then generated one. Even though it's nice to write java code, you have more control with native template.

###### EventBridge
It's a service that can deliver aws/custom events to any aws service. There are 2 types of events:
* event pattern - aws/custom service will send event to eventBridge, which would resend it to target
* schedule - call target (aws service) on some schedule
It's built upon CloudWatch events, uses the same api, but extends it into custom events. But you can still build event-driven solution based on CloudWatch events.
There are over 90 services that act as source, and 15 services that can be a target.
Schema Registry - collection of schemas. Schema - json structure of event (with all fields and tyeps and possible values, like phone number - 10 digits).
Cross-account event - you can configure event that it generated in one account and sent into another.
EventBridge vs SNS
* eventBrdige - body - only json, target - 15 services, native integration with many third-party services (like zendesk)
* sns - kind of limited version of EventBridge, body - any format, target - 6 services

###### Managed Blockchain
Blockchain network - peer-to-peer network running a decentralized blockchain framework. When you create blockchain you choose type (hyperledger/etherium) and version and create first member.
Other members can be added later by voting process. Blockchain active as long as at least 1 member there, as long as this is the case nobody, even creator can't delete blockchain.
There are 2 types of members:
* same account - just send invitation
* other aws account - create network invitation for another account
Aws account and creator don't own network. For any changes there should be voting process between all network members.
Peer node - when member join network it should have at least 1 peer node which store copy of distributed ledger with all transactions.
Each blockchain has unique identifier `ResourceID.MemberID.NetworkID.managedblockchain.AWSRegion.amazonaws.com:PortNumber`. Port depends on blockcahin framework you are using.
Yet this link is private, so members should have vpc and use vpc privatelink to access blockchain endpoint.

###### GuardDuty
It's thread management tools that helps to protect aws accounts/workloads/data by analazying data from cloudTrail/vpc flowLogs/dns logs using ML.
It's regional service, so all collected data is aggregated/analyzied within region. It doesn't store any data, once data is analyzied it discarded.
threat intelligence - list of malicious IP addresses maintained by aws and third-party partners.

###### Secrets Manager
SM allows you to rotate/manage/retrieve db credentials, API keys, and other secrets throughout their lifecycle. You can encrypt secrets at rest using kms (you can choose your own, otherwise SM create new kms for you).
To retrieve secrets, you simply replace secrets in plain text in your app with code to pull in those secrets programmatically using the Secrets Manager APIs.
You use iam to control which users/roles have access to which stores. SM can store json, so you can store any text up to 64KB.
Key rotation for RDS/DocumentDB/RedShift supported out-of-the-box. You can add key rotation to oracle on ec2 by modifying sample lambda.
You can configure cw events to be nofified when SM rotate credentials. SM never store plaintext secrets to any persistant layer.
This can be ideal for lambda evn vars, cause they are shown in lambda console. Moreover you can use lambda in private subnet without internet access and still be able to access SM with privatelink (create vpc endpoint for SM).