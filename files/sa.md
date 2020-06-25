# Solutions Architect Tips

### Content
1. [AWS Basics](#aws-basics)
* 1.1 [Free Tier & Cost Management](#free-tier--cost-management)
* 1.2 [Region, AZ, Edge Location](#region-az-edge-location)
* 1.3 [AWS Well-Architected Framework](#aws-well-architected-framework)
* 1.4 [What is DevOps](#what-is-devops)
* 1.5 [AWS Tagging](#aws-tagging)
* 1.6 [AWS LoadBalancer vs App LoadBalancer](#aws-loadbalancer-vs-app-loadbalancer)
* 1.7 [Egress vs Ingress](#egress-vs-ingress)
* 1.8 [AWS CLI](#aws-cli)
* 1.9 [Bastion vs JumpServer](#bastion-vs-jumpserver)
2. [Services](#services)
* 2.1 [Amazon Corretto](#amazon-corretto)
* 2.2 [AWS CloudFormation](#aws-cloudformation)
* 2.3 [AWS IAM](#aws-iam)
* 2.4 [AWS S3](#aws-s3)
* 2.5 [Amazon Glacier](#amazon-glacier)
* 2.6 [Amazon EFS](#amazon-efs)
* 2.7 [Amazon EBS](#amazon-ebs)
* 2.8 [Amazon EC2 local instance](#amazon-ec2-local-instance)
* 2.9 [Amazon CloudFront](#amazon-cloudfront)
* 2.10 [Amazon Kinesis](#amazon-kinesis)
* 2.10 [AWS Lambda](#aws-lambda)
* 2.11 [AWS Step Functions](#aws-step-functions)
* 2.12 [Amazon EMR](#amazon-emr)
* 2.13 [AWS Glue](#aws-glue)
* 2.14 [Amazon DynamoDB](#amazon-dynamodb)
* 2.15 [Amazon QuickSight](#amazon-quicksight)
* 2.16 [Amazon EC2](#amazon-ec2)
* 2.17 [Amazon Athena](#amazon-athena)
* 2.18 [AWS Organizations](#aws-organizations)
* 2.19 [AWS Well-Architected Tool](#aws-well-architected-tool)
* 2.20 [Amazon VPC](#amazon-vpc)
* 2.21 [AWS Elastic Beanstalk](#aws-elastic-beanstalk)
* 2.22 [AWS Database Migration Service](#aws-database-migration-service)
* 2.22 [Elastic Load Balancing](#elastic-load-balancing)
* 2.23 [Amazon CloudWatch](#amazon-cloudwatch)
* 2.23 [AWS Key Management Service](#aws-key-management-service)
* 2.23 [Amazon Route 53](#amazon-route-53)
* 2.24 [Amazon RDS](#amazon-rds)
* 2.25 [Amazon SQS](#amazon-sqs)
* 2.26 [Amazon API Gateway](#amazon-api-gateway)
* 2.26 [Amazon Cognito](#amazon-cognito)
* 2.27 [AWS CodePipeline(CodeCommit/CodeBuild/CodeDeploy)](#aws-codepipelinecodecommitcodebuildcodedeploy)
* 2.28 [AWS Storage Gateway](#aws-storage-gateway)
* 2.29 [Amazon ECS](#amazon-ecs)
* 2.30 [Amazon EKS](#amazon-eks)
* 2.31 [AWS Fargate](#aws-fargate)
* 2.32 [Amazon ElastiCache](#amazon-elasticache)
3. [Networking](#networking)
* 3.1 [Hub, Switch, Router](#hub-switch-router)
* 3.2 [Network Topology](#network-topology)
* 3.3 [OSI Network Model](#osi-network-model)
* 3.4 [High Level Protocols](#high-level-protocols)
* 3.5 [Low Level Protocols](#low-level-protocols)
4. [Miscellaneous](#miscellaneous)
* 4.1 [IaaC vs IaaS vs PaaS vs SaaS](#iaac-vs-iaas-vs-paas-vs-saas)
* 4.2 [Virtualization and Containerization](#virtualization-and-containerization)
* 4.3 [Docker and Kubernetes](#docker-and-kubernetes)
* 4.4 [Pure Serverless](#pure-serverless)










### AWS Basics
###### Free Tier & Cost Management
To pass cert and more generally to understand how it works you should get some hands-on experience. But aws can be costly at times, so aws provide so called [free tier](https://aws.amazon.com/free) to play and see how it works.
Basically there are a few options:
* always free - services that always would be free
* 12 month sign-up free - services for free for the first 12 month since sing-up
* random proposals - some random limited features that can be available at some time

So to start I would suggest to create aws account (it's free) and play with free tier. You can use almost 90% of what you need in free tier.

There are 2 types of billing alarms
* aws budget - has more settings than CloudWatch, can warn based on forecasted spend for a month, quarter or year
* CloudWatch billing alarm

You can view your costs by going to `My Billing DashBoard` => there you would see total incurred cost divided by services (for example 2$ for EC2).
You can go to `Bills` on the left menu and thee you would see detailed info on what exactly cost and how much. 


###### Region, AZ, Edge Location
There are different geographic regions across the globe where aws data centers are located. One region is divided between several AZ (availability zone).
Each regions is completely independent and connected through Internet (no private cables between regions).
Each AZ is isolated within a regions, but connected through low-latency links (not through public Internet).
AZ is regions + az identifier like `us-east-1a`. AZ consists of one or more discrete data centers.
LZ (local zone) - extension of region closer to your users.
Edge location - A site that CloudFront uses to cache copies of your content for faster delivery to users at any location



###### AWS Well-Architected Framework
It describes best practices to deliver app to aws cloud. Based on 5 pillars:
* operational excellence - running and monitoring systems to deliver business value, and continually improving processes and procedures
* security - protecting information & systems
* reliability - ability to prevent, and quickly recover from failures to meet business and customer demand
* performance efficiency - using computing resources efficiently
* cost optimization - avoiding un-needed costs


###### What is DevOps
DevOps is implementation of agile to ops team.
Before agile developers write code and throw it to ops team. After agile developers started to make more changes, but ops still take a lot of time to go to prod.
Here come agile for operations, which become DevOps. Basic concepts of DevOps are:
* Infrastructure as code (AWS CloudFormation) - treat infrastructure the same way developers treat code
* Continuous deployment (AWS CodeCommit/CodeBuild/CodeDeploy/CodePipeline) -  enable the automated deployment of production-ready application code.
Continuous deployment is continuous delivery that deploys to production (delivery more general term, refer to any deployment).
* Automation (AWS Elastic Beanstalk/OpsWorks) - setup, configuration, deployment, and support of infrastructure and the applications that run on it
* Monitoring (AWS CloudWatch/CloudTrail)
* Security (AWS IAM)
Dev side of DevOps is responsible for:
* code building
* code coverage
* unit testing
* packaging,
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
Defatut tag `Name` should be used for every resource for easier cost balance calculation


###### AWS LoadBalancer vs App LoadBalancer
ELB (Elastic Load Balancer) - aws load balancer that includes 3 types
* ALB (Application Load Balancer) - used for http/https request
* NLB (Network Load Balancer) - used for any tcp request
* CLB (Classic Load Balancer) - basic lb accross multiple EC2

App loadbalancer (in our case spring app) - is EC2 instance with Eureka(Service Discovery) + Ribbon(Load Balancer) - a separate spring app 
that discovers all instances and allows you to use human readable names instead of urls.

###### Egress vs Ingress
Egress - traffic that exits an entity, so all traffic (data) that leaves your VPC into public internet.
Ingress - traffic that enters an entity, so it's a request sent from public Internet to private cloud.
Traffic often is translated using NAT in and out of a private network like the cloud.
So to simplify egress- response, ingress - request.


###### AWS CLI
CLI (Command Line Interface) - can be useful to quickly automate some aws manual tasks.
First you need to add aws credentials `aws configure --profile awscert`, after you can run commands like `aws s3 ls --profile awscert`
You can get accountId `aws sts get-caller-identity --profile=awscert`
Create presign s3 file 
```
echo "hello world" > data.txt
aws s3 cp data.txt s3://my-cloudformation-template-example/ --profile=awscert
# make file public for 30 sec
aws s3 presign s3://my-cloudformation-template-example/data.txt --expires-in 30 --profile=awscert
```

###### Bastion vs JumpServer
They both serve the same purpose - to separate private network from public traffic. Usually you connect to it through SSH and from there you can connect to any private machine in the network.
Bastion - outside your security zone (DNS/VPN/FTP server)
JumpServer - used to manage other servers

Here is example of CloudFormation stack to run jump server
```
ssh -i mykey.pem -o IdentitiesOnly=yes ec2-user@3.92.236.6
ping google.com
ping 10.100.2.33
nano mykey.pem
chmod 400 mykey.pem
ssh -i mykey.pem ec2-user@10.100.2.33
ping google.com
```

### Services
###### Amazon Corretto 
[Amazon Corretto](https://aws.amazon.com/corretto/) - free amazon implementation of Java SE specification.
As you know there are confusion around java SE. Oracle provides 2 java se implementations
* OpenJDK - free
* OracleJDK - paid
Yet there are some features in OpenJDK that can be of charge. that's why you may want to use other java se implementations like
* Amazon Corretto
* AdoptOpenJDK
* Azul Zulu
If you are still confuse you can take a look at [java is still free](https://www.infoq.com/news/2018/09/java-support-options-sept18/)

###### AWS CloudFormation 
It's aws solution to IAC. There are 2 concepts
* Template - json/yaml file with desired infrastructure
* Stack - template deployed to cloud (you can run commands like describe/list/create/update stack). If you create/update stack and errors occur all would be rolled back and you would be notified by SNS
AWS SAM (Serverless Application Model) - framework to build serverless apps, provide a shorthand syntax to write IAC using yaml templates. Later it anyway transformed into CloudFormation full template, so you can just learn CloudFormation and stick with it.
Supported formats are JSON/YAML. Resource naming is supported not for all product, this is due to possible naming conflicts (when you update template, some resources would be recreated, but if names are not updated error would happen).
To assign real name CloudFormation use stack + logical name, this ensures unique names.
You can add deletion policy (for example you delete stack and want to preserve s3 buckets and take RDS snapshot).
CloudFormation Registry - managed service that lets you register, use, and discover AWS and third party resource providers.


###### AWS IAM
* In case you have one user who requires access to a specific resource, as a best practice, you should create a new AWS group for that access (in case new user would appear you would just assign him to this group)
* EC2 role access - you can add (for example bucket write access) role to ec2 instance
* Cross-account access - you can set up access for account B from account A

There are 2 types of permission
* group - collection of permissions that you can assign. Used to define users. One user can belong to multiple groups.
* role - collection of permissions for specific aws service (for example ec2 can connect to s3 without any secret key). Role can't be assign to user.

You can define permissions by assigning policies to group/user. There are 2 types of policy
* aws managed - most common policies created by aws (for example s3/ec2 access and so on...)
* managed by you - custom policies created by end user


###### AWS S3
S3 (Simple Storage Service) used for:
* store and distribute static web content (cause each object in s3 has unique http url)
* origin store for CDN (content delivery network) like aws CloudFront
* fast-growing websites to store user content (cause no storage provision is required, s3 enlarge automatically)
* host static websites
* data store for computation results, analytics, video transcoding
* durable & secure storage for backups and archives

When it's better not to use s3
* standalone posix filesystem (better to use EFS)
* when you need to search/filter data by some criteria (better to use RDS/DynamoDB/CloudSearch/ELK)
* data updated very frequently (better to use EBS/RDS/DynamoDB)
* archives with infrequent access (better to use Glacier)
* dynamic web-sites (better to use EC2/EFS)

S3 offers multipart upload, where your large file uploaded as parts, and on server they are assembled into single file.
You can enable cross-region replication for every bucket

S3 security
* use s3/custom encryption to encrypt data before storing them on s3 and decrypt them when you download them
* use versioning to preserve, retrieve, and restore every version of every object stored in your Amazon S3 bucket
* enable MFA for bucket delete
* use access logging to track who/which bucket/what action was executed on s3

Although s3 is object-based storage, you can easily emulate OS by creating objects like `path1/path2/file1`
S3/S3 IA/Glacier - replicate data across 3 AZ go guarantee data won't be lost in case of emergency.
Price is varied across regions, so make sure you choose right region.

There are 2 ways to secure buckets
* use ACL (old feature)
* use bucket policy (json file with policies)

You can also turn on lifecycle management (move you files to glacier after 30 days)
Presign url - use cli to create url with key, that is accessible for limited time. Can be
* download - anybody can download file within some time
* upload - anybody can upload file into this url within some time

Interface is global, so you assign a region to a bucket, but you see all your buckets across all regions


###### Amazon Glacier
Glacier - low-cost tape-drive storage value with  $0.007 per gigabyte per month. Used to store backups that you don't need frequently.
Access to data can take from few minutes to a few hours. You store data as archives.

When you should never use glacier
* rapidly changing data (use EBS/EFS/RDS/DynamoDB)
* immediate access (use S3)

You can also use multipart upload to speed up upload by dividing large files into chunks
Just like s3 you can use REST API to work with glacier
You can set up s3 lifecycle, after which objects from s3 would be moved to glacier (but to view them you should use s3 api, if you use glacier api you won't see this objects)
You can retrieve up to 5% of your average monthly storage for free each month (rated daily), above this you are charged additional fee

###### Amazon EFS
EFS (Elastic File System) - delivers simple network filesystem for EC2. It supports NFSv4/4.1 (Network file system).
System size is grow as you add more files to file system.
It allows parallel access from multiple EC2 within the same region
It accessed by EC2 using mount targets which are created by AZ
If you need temporary storage EFS not the best option, look at EC2 Local Instance Store
There are 2 performance model
* General (if you need less then 7k file operation per second) 
* Max I/O
AWS DataSync - service that make it faster transfer data between on-premise data and EFS

###### Amazon EBS
EBS (Elastic Block Storage) - simple block storage for EC2. After EBS is attached to EC2 you can format it with desired file system.
Most AMI (Amazon Machine Images) are backed by Amazon EBS, and use an EBS volume to boot EC2 instances.
You can attach multiple EBS to single EC2, but single EBS can only be attached to 1 EC2.
EBS allows to create point-in-time snapshots (backup) and store them in s3.

IOPS vs Throughput
* IOPS - number of read/write operations per second
    * General Purpose SSD (gp2)
    * Provisioned IOPS SSD (io1)
* Throughput - number of bits read/written per second
    * Throughput Optimized HDD (st1)
    * Cold HDD (sc1)

EBS Volume Types
* SSD (frequent read/write operations with small I/O size)
* HDD (large streaming workloads where throughput (measured in MiB/s) is a better performance measure than IOPS

###### Amazon EC2 local instance
Similar to EBS, but located on the same machine as EC2 (EBS connected through network), available only during lifetime of EC2.
So it's not durable, once EC2 instance stop/restart/fail all data would be lost.

###### Amazon CloudFront
CloudFront is a CDN (content delivery network) - that speed up the distribution of your data using edge locations.
When user request content, CF use nearest edge location and deliver cached version, it's faster that transfer data directly from data center.
If content not in cache, CF retrieve it directly from s3 or HTTP and cache it. CF is not durable storage, it's just an edge cache.
To work with CF you should create origin server (s3 in case of static content, ec2 - dynamic). Then you add you origin server to CF, and CF generate link for you.
Later when user request this link CF check the closest edge location for data, and if found in chane - return, if not request it from origin server and cache it.
To ensure origin availability you can add backup origin and configure CF in case it get 4xx/5xx response from main origin, to use backup origin.
Edge cache is smart, it can remove less popular content to make room for other data.
You can also use Geo Restriction to specify at which contries content should be 403 (Forbidden), you can also add custom error code and message.
You can control expire date (when CF will check origin server for new version) by setting cache control header (by default 24 hours).
You can delete item from CF by
* delete it from origin server, and when expire date come it would be deleted from CF
* use invalidating api to remove file from CF immediately
CF doesn't cache following requests: POST, PUT, DELETE, PATCH
Field-Level Encryption - encrypt user's upload data and transfer these encrypted data to your origin

###### Amazon Kinesis
It is a platform for streaming data on AWS, making it easy to load and analyze streaming data.
With Kinesis, you can ingest real-time data such as application logs, website clickstreams, IoT telemetry data, and more into your databases, data lakes, and data warehouses, or build your own real-time applications using this data
AntiPattern
* Small scale consistent throughput (Kinesis Data Streams is designed  and optimized for large data throughputs)
* Long-term data storage and analytics (By default Kinesis Data Streams stores data 24 hours, you can extend retention up to 7 days, if you need longer you should consired RDS/DynamoDb/S3/Glacier)


###### AWS Lambda
Lambda - piece of code that can be executed without any server env (just write code in javascript and it will run).
Lambda can be directly triggered by AWS services such as Amazon S3, DynamoDB, Amazon Kinesis Data Streams, Amazon Simple Notification Service (Amazon SNS), CloudWatch
AntiPattern
* Long Running Applications (Lambda max time is 900sec. If you need some long running jobs you should consider EC2)
* Dynamic Websites (although you can use Lambda to create static website, it's better to use some programming language like java/node.js and deploy it to EC2)
* Stateful Applications (Lambda is stateless, if you need state it's better to create app in java/node.js and deploy it ot EC2 + RDS/DynamoDb)


###### AWS Step Functions
Step Functions - visual tool that allows you to build complex logic based on lambda and EC2 calls.
They can also help overcome lambda max 900sec execution time, by joining several lambdas into one execution flow.


###### Amazon EMR
EMR (Elastic Map Reduce) - highly distributed computing framework for data processing and storing, using Apache Hadoop.
It reduces large workload into smaller jobs and distribute it between EC2 instances of Hadoop cluster (good for big data analyses).
AntiPattern
* Small data sets (EMR for large processing, if your dataset is small enough for one machine/thread it's better to use EC2 or Lambda)
* ACID transaction requirements (if you need this it's better to use RDS instead of Hadoop)

###### AWS Glue
Glue - fully managed ETL (extract, transform, load) to catalog/clean/enrich/move your data.
AWS Glue crawlers scan various data stores you own to automatically infer schemas and partition structure and populate the AWS Glue Data Catalog with corresponding table definitions and statistics.
You can then directly query your data lake with Amazon Athena and Amazon Redshift Spectrum.
AntiPattern
* Streaming data (Glue is batch oriented, minimum interval is 5 min, so for streaming data Kinesis is better choice)
* NoSQL Databases (Glue doesn't support NoSQL databases as source)

###### Amazon DynamoDB
DynamoDB - fully managed NoSQL database, like mongo, but aws proprietary solution

###### Amazon RedShift
RedShift - fully-managed, petabyte-scale data warehouse.
It delivers fast query and I/O performance for virtually any size dataset by using columnar storage technology while parallelizing and distributing queries across multiple nodes.
Redshift only supports Single-AZ deployments. It uses MPP (Massively Parallel Processing) by automatically distribute data/query load across all nodes.
Single-node can be used to quickly set up cluster and grow later. Multi-node requires leader (who gets client connection and queries) and a few compute nodes, that actually execute load.


###### Amazon QuickSight
QuickSight - BI (business intelligence) tool, for building visualizations, perform ad-hoc analysis (can connect to all aws data sources).


###### Amazon EC2
EC2 (Elastic Compute Cloud) - web service that provides resizable compute capacity
AntiPattern
* Managed Service (if you need database, or some other service that is provided by aws, you would better to use it, like RDS)
* Lack of Expertise or Resources (if your team lack expertise or resource installing and managing some service like database, again if aws provide such service it's better to use aws managed service)

Type of EC2
* On-demand (0% discount) - you got server at any time, and there is no commitment from your (you can terminate it after 10min)
* Reserved (40-60% discount) - you commit to run a server for 1-3 years
* Spot (50-90% discount) - not commitment from aws (you bid for a cheaper price, and if any instance is available you got it, but you pay not what you bid, but the second highest bid)

There are 3 types of IP address
* private IP - your instance is not available from outside, only from within your VPC (base on SG)
* public (dynamic - cause it changes) IP - you instance is available from outside. Given once to concrete instance, if you stop/start instance it may change
* elastic(static - doesn't change) IP - public IP that you can assign to any instance

source/destination checks
* instance must be a source/destination of any traffic it sends/receive
* each ec2 performs it by default
* if your instance is NAT instance - it not a source/destination, it just a proxy to other instances. That's why for Nat instance you should disable it.

ENI (elastic network interface) - logical networking component in a VPC that represents a virtual network card that has attributes:
* primary private IPv4 (from VPC range)
* public IPv4
* elastic IPv4
* IPv6, mac-address, security groups and so on...

You can create ENI by going to `EC2 => Network & Security => Network interfaces` and create network interface.
You can create ni (network interface) and attach/detach it to ec2 instance.
Every instance in VPC has a default ni - primary network interface, you can't detach it. You can create new and attach. Number of ni that can be attached to ec2 depends on it's size (more computing power - more ni can be attached).

###### Amazon Athena
Athena is an interactive query service that makes it easy to analyze data in Amazon S3 using standard SQL. 
You don’t need to load your data into Athena, as it works directly with data stored in S3. Athena integrates with Amazon QuickSight for easy visualization.
AntiPattern
* Enterprise Reporting and Business Intelligence (for enterprise level it's better to use RedShift, query engine in Redshift has been optimized to perform especially well on data warehouse workloads)
* ETL Workloads (for etl you should use EMR/Glue)

###### AWS Organizations
Organizations - service that allows to to tie several accounts to master account and centrally manage them (billing, services, policies)
Organization is a collection of AWS accounts that you can organize into a hierarchy and manage centrally.
Master Account - aws account from which you create your organization. From there you can also create/invite/delete other accounts. It's charged to pay all bills by all accounts. Once chosen, you can't change master account.
OU (Organization Unit) - group of accounts under one name, can be used to build hierarchical structure.
Account can be a member of only 1 organization/OU at a time. OU can be a member of only 1 OU at a time.
SCP (Service Control Policy) - policy you can apply to a group of aws accounts, defines service actions (like run EC2 instance), it follows the same rules as IAM policies.
You can attach a policy to the root/OU/account.


###### AWS Well-Architected Tool
Well-Architected Tool is a aws service that allows you to validate your current infrastructure against 5 pillars of well-arhitected framework.
It works by creating a workload (collection of resources and code that make up a cloud application) and then run this workload against 5 pillars.
The tool will evaluate your workload and provide an improvement plan with a prioritized list of issues.
It's free of charge, you only pay for underlying aws resources.


###### Amazon VPC
VPC (Virtual private cloud) - a kind of internal network in on-premises. You can have some servers inside and they won't be accessible outside of vpc.
You have complete control over your virtual networking environment, including selection of your own IP address ranges, creation of subnets, and configuration of route tables and network gateways.
By default every account has default VPC (and default subnet for each AZ), so if you don't create any other, and create EC2 directly, default VPC would be used.
Amazon VPC consists of
* VPC - private network, logically isolated from other networks in aws cloud. Can span across multiple AZ. Instances in different AZ charged $0.01 per GB for data transfer.
* Subnet - private sub-network inside VPC. Can reside only within single AZ.
* Route table - set of rules (routes) to determine where network traffic from your VPC is directed
* Internet Gateway - entry point between your VPC and Internet. It allows EC2 in VPC directly access Internet. You can use public IP or elastic IP to both communicate with Internet and receive requests from outside web-servers.
* NAT Gateway - Network address resolution service in private subnet to access the Internet. Instances without public IP use NAT gateway to access Internet. Nat allows outbound communication, but doesn't allows machines on the Internet to access instances inside VPC.
With IG you have both outbound and inbound access, but with Nat gateway - only outbound (your instance can access Internet, but is unaccessable from Internet)
* Virtual private gateway - VPC+VPN
* Peering Connection - create private secure connection between 2 VPC
* VPC Endpoints - private connection to AWS services without Internet Gateway/NAT/VPN. It make sure all traffic goes inside aws network.
* Egress-only Internet Gateway - egress(going out) only access from VPC to Internet over IPv6

EC2-to-EC2 communication through public IP
* When inside same Region - inside aws network
* When in different Regions that connected with VPC peering - inside aws network
* When in different Regions - not guaranteed to communicate inside aws network (probably communicate through Internet)

Security groups (SG) vs ACL
* SG specify which traffic is allowed to/from EC2
* ACL operates at subnet level and evaluate traffic that enter/exit subnet. Don't filter traffic inside same subnet.
* ACL - stateless filtering, SG - stateful (if traffic allowed inbound it also allowed outbound) filtering
You can't block specific IP with SG, you need to use NACL

To monitor traffic you can use
* VPC traffic mirroring (it copies traffic and send it to NLB with a UDP listener)
* VPC flow logs (it includes information about allowed and denied traffic, source and destination IP addresses, ports, protocol number, packet and byte counts, and an action: accept or reject)

VPC peering
* you can create peering between VPC in 2 regions or in 2 accounts (in this case one account should accept peering request from another)
* traffic of peering within same region is not encrypted, but isolated, just like traffic between 2 EC2 in the same VPC
* traffic of peering within different regions is encrypted

VPC ClassicLink
* before 2013 there were no default VPC and all EC2 where launched in flat network shared with other aws users
* allows to connect your VPC with EC2 classic, EC2 becomes a member of VPC Security Group

AWS PrivateLink
* allows you to connect your VPC to aws services (traffic goes inside aws)

By default ec2 instances dns name is disabled (only ip address is given). You can enable it for vpc by going to `Actions=>Edit DNS Hostname`.
You can change subnet setting `Actions=>Modify auto-assign IP settings` and in this case when you create ec2, it would by default select subnet settings (enable/disable auto-assign public IP address). Of course you can also change it on ec2 level.


###### AWS Elastic Beanstalk
Beanstalk - PaaS that mange deployment, provisioning, load-balancing, auto-scaling, health monitoring. Best suited when you need quickly deploy something and don't want to learn about other aws services.
It keeps the provisioning of building blocks (EC2/RDS/ELB/Auto Scaling/CloudWatch), deployment of applications, and health monitoring abstracted from the user so they can just focus on writing code
You simply upload a `.war` (in case of java) file, and beanstalk run tomcat server for you and deploy your app. Yet developer has a right to manage all infrastructure provided by beanstalk.
Using beanstalk you can:
* select OS
* select EC2 instance (on-demand, reserved, spot)
* ssh to EC2
* select RDS and configure it

Beanstalk underneath using: EC2, RDS, ELB, S3 (app files, server logs), SNS
Beanstalk is free, you pay for underlying resources (like EC2, S3) that you are actually use

###### AWS Database Migration Service
DMS - used for easy migration between different db (like from MySql to DynamoDB), and also for data replication.
DMS use SCT (Schema Conversion Tool) for converting between existing schemas.



###### Elastic Load Balancing
ELB - is a proxy that accept traffic (using listeners) from clients and route it to targets (usually EC2).
Listener - is a protocol + port for which you got incomming requests.
There are 3 types of elb:
* Application LB - if you need to balance http/https. Also supports websocket & secure websocket
* Network LB - if you need to balance TCP/UDP
* Classic LB - if you need to balance classic (without VPC) EC2 instance

ALB+NLB - you register target in targets group and route traffic to target groups. CLB - you register instances within LB.
If you enable AZ for ELB, it creates lb node in AZ, after this traffic goes to this node. The best practice to have 1 node in each AZ.
If you have not equal number of EC2 in different AZ (let's say 2 in az1, and 8 in az2) then you should enable cross-zone balancing.
In this case each lb will route it's 50% into 10 instances, so each instances will get 10% of traffic. But if you disable cross-zone balancing, then 50% in first zone would be divided between 2 instances (so each got 25%)
and 50% from az2 would be divided in 8 instances (so each got 8.25% traffic). With ALB cross-zone balancing enabled by default.

LB can be
* internal (having only private IP)
* external (facing internet, having both public & private IP)



###### Amazon CloudWatch
CloudWatch - monitoring service for aws resources and apps running in aws cloud. IAM permission for CloudWatch are given to a resource as a whole (so you can't give access for only some of EC2, you give either for all EC2 instances or none).
You can also use CloudWatch to create alarms (for example you get 5 errors, and you want to notify developer). Alarms are integrated with SNS (so you can send email, put message to SQS and so on).
Many aws resources (EC2, RDS, and so on) automatically send metrics to CloudWatch. You can also send your custom metrics. Metrics can't be deleted, but expire automatically.

###### AWS Key Management Service
KMS - a service for generating/storing/auditing keys. If you have a lot of encryption it's better to use central key management service.
You start working with KMS by creating CMK (customer master keys), or if you are using encryption from other aws resource, it would create CMK automatically for you.
You can import only symmetric keys. You can't export CMK symmetric key or asymmetric private key.



###### Amazon Route 53
Route53 - is amazon DNS service that help to transform domain name into IP address. It's called 53, cause 53 - port of DNS.
You can buy hostname from any provider and register it within Route53, after this Route53 gives you 4 TLD (Top-Level Domain) that you put into your hostname provider,
so end user will request your domain, it will got to your provider, and from there to aws. Route53 supports wildcards (subdomains).
Route53 also supports WRR (Weighted Round Robin) where you can assign weight ans divide your traffic (for example you have new feature and want only 25% of users to use it).
You can also use LBR (Latency Based Routing), in case you have aws resources in multiple regions, route53 will redirect users to region with lowest latency.
With Route53 you can also have private DNS name within your VPC, and such a name would be unaccesable outside VPC.
Heath check - a check that requested resource is available. DNS Failover - return result only if health check is fine.



###### Amazon RDS
RDS (Relational Database Service) - aws managed service, that make it easy install/operate relational database in the cloud.
* you can easily scale compute resources or storage associated with your db
* it's easy to update db software
* it simplifies replication

There are 2 ways to backup
* automatic backup - snapshots takes by RDS daily, retained for limited period (by default 7 days)
* db snapshot - taken by user

multi-AZ deployment:
* primary - you main db that performs read/write
* standby - replica db that has most recent updates from primary. You can't use it for reads, the only purpose is failover - when primary fails, your standby becomes primary, so you won't even notice failure. Replication is synchronous.
If you want to write to master and read from replica, RDS provide `read replica`. Read Replica implemented using db (mysql or other) native asynchronous replication, that's why lag can occur, comparing with multi-AZ replication
where writes are concurrent. You can also modify read replica to execute DDL (Data Definition Language) SQL queries.

Enhanced monitoring - allows you to view all metrics with 1 sec granularity

RDS Proxy - database proxy that helps
* pooling & sharing db connections (useful for serverless, when you constantly open and close connections``)
* reduce db failover time for 66%
* enforce IAM access to db


###### Amazon SQS
SQS (Simple Queue Service) - managed service that provide publisher/subscriber (queue) model. It provides FIFO (first-in, first-out) message ordering.
It guarantee at-least-once delivery. you can use Amazon SQS Java Messaging Library that implements the JMS 1.1 specification and uses Amazon SQS as the JMS provider.
Dead letter queue - a special queue that receives messages from other queue after some unsuccessful attempt to process it. Used to isolate messages that can't be processed for later analysis.
You can get time-in-queue (time how long message has been in queue) by subtracting SentTimestamp attribute from current time.
In anonymous access SenderId - IP address of sender (otherwise accountId).
If queue is empty
* short polling - returns immediately with no results. Only possible way if single thread poll multiple queues, in this case long polling for one empty queue would block other queues, but it generally bad design.
* long polling - wait till message got into queue, or polling timeout (by default 20 sec) expires (save SQS cost, cause reduce number of empty receives). It's better to always use this type of polling.
Message retention can be configured from 1 min to 14 days (by default - 4 days).


###### Amazon API Gateway
API Gateway - managed api service that makes it easy to publish/manage api at any scale. It can
* meter/throttle traffic to your backend
* security (allow access only to EC2 with specific IAM role, allow only specific cognito users, allow to those who pass Lambda authorizer)
* DDoS (distributed denial-of-service) attack prevention
* caching (you backend won't be called every time, for some request cache would be returned)
* monitoring (integration with cloudwatch can set up some alarms)
* all endpoints are HTTPS, you can't create unsecure http
* send both websocket & http calls

You can also use API Gateway with openApi to quickly generate api endpoints and underlying models.
Stage - like a tag, allows your api have multiple versions, like dev stage - myapi.com/dev/users.
You can add documentation to your api and expose it as swagger file.
Api Gateway can generate client-side SSL certificate, and you backend can get public key, so it can verify that requests are coming from Api Gateway.


###### Amazon Cognito
Cognito - managed user service that add user sing-in/sign-up/management email/phone verification, 2FA logic.
User Pool - a directory with users' profiles, you can set up password strength.
You can migrate your users into cognito, but password won't be migrated. If you want to migrate them with password you need to add special logic to your app:
when user signin to your app - you signin him within cognito, if user doesn't exist in cognito you sign-up him with username/password.
Cognito also support SAML or OpenID Connect, social identity providers (such as Facebook, Twitter, Amazon) and you can also integrate your own identity provider.
Identity Pool - where cognito stores federated identity (identity from third parties providers).
You pay for MAU (monthly active users) - user who within a month made some identity operation signIn/singUp/tokenRefresh/passwordChange.
Free tier - 50k MAU per month.


###### AWS CodePipeline(CodeCommit/CodeBuild/CodeDeploy)
CodePipeline - aws ci/cd tool, like jenkins.

###### AWS Storage Gateway
Storage Gateway - hybrid storage that connects on-premises storage with cloud storage. The main idea is that you still use your on-premise storage (so don't lose that investment) and use cloud at the same time.
The basic idea is that you can manage aws cloud storage the same way (by using same protocols) as you are using your on-premise storage.
There are 3 types
* File - store & retrieve files in S3 using NFS(Network File System)/SMB(Server Message Block) (these objects can also be directly accessed from S3). 
You app read/write files using storage gateways as file server, which in turn translate it into S3 read/write requests.
You should have only storage gateway to be able to modify s3, otherwise if you overwrite file added by gateway, you would get unpredictable behavior when gateway try to read it.
File storage gateway use local disk for 2 purposes: 
* save uploaded files there and asynchronously upload them to s3
* store frequently accessed files for low-latency access (cache)
The size of such disk should depend upon max possible file uploaded and how much data you want to store in cache
* Tape - cloud base VTL (Virtual Tape Library), used by your backup apps. Tape translate your app requests into Glacier.
* Volume - provide iSCSI target, where you can create block storage and mount it to on-premise/EC2 instances.
    * cached model - primary data in S3, frequently accessed data in on-premise.
    * stored mode - primary data in on-premise and in s3 full backup.
Volume Gateways compress data before that data is transferred to AWS and while stored in AWS. Although data stored in s3, you can't directly access it through s3 api.
Storage Gateway optimize data transfer to cloud by using
* intelligent buffering
* upload/bandwidth management
* multi-part upload (in case of S3)

Storage gateway available as:
* virtual server (software) - you install it in your on-premise
* hardware appliance - you but it and use in your on-premise


###### Amazon ECS
ECS (Elastic Container Service) - docker container management service to run apps on a managed cluster of Amazon EC2 instances. It eliminate the need to operate container management infra (like kubernetes).
There are 2 ways to create cluster
* Networking only - Fargate is managing/orchestrating your cluster
* EC2 Linux/Windows + Networking - you manage EC2 cluster yourself
Cluster is just a VPC, subnets (by default 2), group of EC2 instances (in case of Fargate it manages instances by itself)
After you've created cluster you add tasks (task definition) - it just a docker containers that would run on one of your ec2 machines.
There are several network modes:
* awsvpc - every task get ENI with private ip address, just like any ec2 instance
* bridge - docker's default network type. All containers connected to bridge can communicate with each other
* host - container is exposed to host (if you docker has port 80, this port would be accessible from host)

###### Amazon EKS
EKS (Elastic Kubernetes Service) - manages service that runs kubernetes cluster (so you don't need to deploy it from scratch).
It provisions/manages Kubernetes control plane and worker nodes for you.


###### AWS Fargate
Fargate is serverless compute engine for containers running in ECS/EKS, it removes the need to provision and manage servers.
You should use it when you don't want to manually provision your EC2 instances. 
If you need greater control over EC2 (for security or customization), it's better to avoid using it, and istread manually provision EC2 instances.


###### Amazon ElastiCache
ElastiCache - manages service that runs Memcached/Redis server nodes in cloud. 
It automates common administrative tasks required to operate a distributed in-memory key-value environment.
It consists of
* node - smallest building block - network-attached RAM
* shard - primary node and zero or more read-replicas
* cluster - group of shards



### Networking
###### Hub, Switch, Router
* Hub (концентратор) - device that connects multiple computers in LAN (local area network) and propagate any packet sent from one computer to all other. Today mostly outdated, people use switch instead. Works on the physical layer (Layer 1) of OSI. 
* Bridge (мост) - connect several hubs into single network. Works on OSI layer 2. As hubs mostly outdated today.
* Switch (коммутатор) - device that connects multiple computers in LAN, but knows exactly where to send packet of data, 
it has internal table where it store which port takes which mac address, and at first it sends ARP to get mac addresses, but once table is full it just send packet to desired node. Works on the data link layer (Layer 2) of OSI.
* Router (маршрутизатор) - small computer that can route the network traffic. Usually used to connect not computers, but networks such as LAN/WAN. Works on (Layer 3).
* L3 Switch (L3 коммутатор) - switch that can route traffic, work faster than router.
There are 2 types of Port
* Physical port - one inside switch/router is the nest where you plug in your network cable
* Logical port - one inside OS, and it allows OS to route different protocols for the same IP address

###### Network Topology
Network Topology - is how your computers are arranges and connected with each other. There are 2 types of topology:
* Physical - how devices are physically connected
* Logical - how are packets sent in our network

Types of topology
* Bus (single line) - we have one cable and all computers are connected to it. Disadvantage - if line disruption happens the whole network is broken. Outdated today.
* Ring - all computers are connected into a ring. Every computer is connected to 2 neighbors. To secure against disruption there is bidirectional-ring network, where all computers connected with 2 cables instead of 1. Outdated today. 
* Star - all computers are connected to a single switch.
* Tree - all computers forming a tree with single node(computer or switch) at the top. The difference from star is physical structure.
* Mesh - all computers are connected to each other. The advantage is high level of security for failures, but disadvantage is that for n computers you need n! direct connections.
* Hybrid - composed of 2 or more other topologies.


###### OSI Network Model
There are 7 levels in OSI model, here is the list from lowest to upper
* Physical layer - how data are physically transferred. Basically they are translated from electrical/light signals into sequence of bits. There are 3 ways exists
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
* Application/Presentation/Session - PDU (protocol data units)
* Transport - TCP - segments, UDP - datagramm
* Network - packets
* Data Link - frames

OSI model is not used in practice, only for education purpose, cause it has been developing for 7 years, and many other models were born. One of them is TCP/IP model. In has 4 levels
* Application layer - include Application/Presentation/Session from OSI
* Transport layer - Transport layer in OSI
* Internet layer - Network layer in OSI
* Link layer - Data Link + Physical in OSI

There were other models like AppleTalk or IPX/SPX, but they were outdated and nowdays only TCP/IP is mostly used. It also called sometimes DoD (department of defense) cause it was originally developed by USA defense department.


###### High Level Protocols
These protocols include: HTTP, DNS, DHCP, SMTP, POP3, Telnet, SSH, FTP.
To better understand these protocols you can download [Cisco Packet Tracer](https://www.netacad.com/courses/packet-tracer) that can help you build networks and see how it all works.

* HTTP(HyperText Transport Protocol, 80)/HTTPS(HyperText Transport Protocol Secure, 443) - client-server data exchange. headers are
```
GET / HTTP/1.1
Host: 192.168.1.10
```
* DNS(Domain Name System, 53) - hostname-to-ip resolver. In linux we have `/etc/hosts` - basically same local dns that resolve hostnames. It has priority over external dns server.
* DHCP(Dynamic Host Configuration Protocol) - allows to dynamically set IP-address, subnet, dns name to remote hosts.
* POP3(Post Office Protocol Version 3, 110, POP3S-995) - work on get-and-delete principle. Client connect to server, download new mails, and sent delete message to server.
* IMAP(Internet Message Access Protocol, 143) - more complex analogy of pop3, don't remove messages from server.
* SMTP(Simple Mail Transfer Protocol, 25) - send mail to mail server.
* Telnet(terminal network, 23) - allows to communicate with remote OS by sending unencrypted text data. Nowdays mostly outdated and replaced by ssh.
* SSH(Secure Shell, 22) - like telnet, but exchange encrypted data
* FTP(File Transfer Protocol, 20) - transfer file to server


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
There are 5 classes of network:
A - subnet /8, first octet => 0-127
B - subnet /16, first octet => 128-191
C - subnet /24, first octet => 192-223
In every network first(all zeros) and last (all ones) are 
0 - specifies network
255 - broadcast a message to every host on a network (ARP)
* Gateway - router specified on a host, which links the host's subnet to other networks. For ordinary users gateway - is Internet provider, cause it connects them to Internet.
Gateways regulate traffic between two dissimilar networks, while routers regulate traffic between similar networks
Default gateway - ip address in router for particular network (for every network including Internet router will have it's own ip address)
When you send packet, tcp/ip will use subnet mask to determine if ip address in the same subnet, it this is the case it will send packet futrher, if false - it will send it to default gateway.
* CIDR (Classless Inter-Domain Routing) - replace classful network (A-D classes) and allocate ip-addresses without bind it to any class network. Based on VLSM.
* VLSM (Variable Length Subnet Mask) - when we divide a network into subnet with different length.
Suppose we have a network 192.168.0.1/24 - totally 254 addresses(actually total - 256, but first and last are reserved)
We need to divide it into 4 subnets with 10, 50, 2 and 20 hosts. Although we can equally divide our network on 4 and have 64 ip-addresses in each, it's better not to give way more than needed
In this case we can divide it on min power 2. 
10 => 16(2**4)
2 => 4 (2**2)
50 => 64(2**6)
20 => 32(2**5)
* Routing table - a list of ip-addresses and subnet masks of all networks connected to the router, stored in router RAM.
* VPN (Virtual Private Network) - encrypted connection(also called tunnel) over public network (usually Internet) between 2 or more private networks.
It encrypt packet, add new headers.
* iSCSI (Internet Small Computer Systems Interface) - transport layer protocol, works above TCP. Initiator (server) packages SCSI commands into network packets, and sends it to Target (remote storage).

### Miscellaneous
###### SaaS vs PaaS vs IaaS/IAC 
SaaS (Software as a Service) - if you want to use third-party software like some crm, but don't want to have it staff to install it to every computer in your office you can just use web-service of such crm. In this case crm completely managed by someone else,
you just can access it from web browser without need to run it and support. Usually it refers to end-user applications.

PaaS (Platform as a Service) - in this case you develop you application (writing code) and just deploy your code without worry about infrastructure. For example if you are using spring framework, you can use [cloud foundry](https://cloud.spring.io/spring-cloud-cloudfoundry/reference/html/)
and just deploy your code, and it will provide everything else (container, java, spring framework).


IaaS (Infrastructure as a Service) - good example is aws that provides infrastructure (like container/networking/storage/database) as services to end users. Compare to other 2 PaaS/SaaS users of IaaS responsible for managing infrastructure themselves. 
The best practice is to use IAC (Infrastructure as a code) - is an idea that you should code how you want to build your infrastructure. For example to run you microservice app you need to have 3 containers. 
Of course you can manually create all of them, install all needed software there and deploy it. But you can also add script file that would do it all automatically. Most popular tools is Aws CloudFormation and Terraform.


* SaaS - mail service, ELK (elasticsearch, logstash, kibana) stack
* PaaS - beanstalk, spring cloudfoundry
* IaaS - almost all other aws services under networking, computing, storage

###### Virtualization and Containerization
Hyperviser is Virtual Machine Monitor (VMM), that runs VM. It works as mediator between virtual OS and hardware. By acting as mediator we can run several virtual OS on one hardware. This is the main advantage, cause one OS can run on one hardware only.
Originally hypervisors developped to give multiple users simultaneous access to computers that performed batch processing. But over time other solutions for many users/single machine problem appeared including time sharing.
So virtualization is a simulation of physical hardware for virtual OS.
Containerization on the other hand is like os-level virtualization. Instead of creating a complete new OS, container share resources with host os, but have it's own file system, and by doing so divide itself from main OS.


###### Docker and Kubernetes
Docker - is a tool to quickly create and manage containers (like create/stop/start/destroy). But if you have many containers and they all should interact with each other you need some system to manage all of this.
Kubernetes - is a tool to manage a group of containers. On container level kuber can use docker or any other container tool.
Deployed kubernetes environment - called cluster and consists of 2 parts
* control plane - components that control cluster + cluster's state & configuration
* compute machines - nodes where pods are running 


###### Pure Serverless
With aws serverless you can build complete backend application without writing code(like java) or using any framework (like spring). 
For example you can use `API Gateway` to set up a few api endpoints. Then you can use `aws lambda` to set up some logic to handle these endpoints. Then you can use `sns` to send some notification, and possible send emails.
As you see without writing any application code we can have a simple backend application. But the truth is that this is only good for very simple app, usually for POC (proof of concept).
The reason is once your application become more complex it would be very hard to ensure that everything is working fine, cause you have no tests. 
So the conclusion is very simple. Use aws serverless only for POC, or when you want quickly to startup, then you can also create a lot of mock api so your team can start to interact with it.
But once your system become more complex you will definately need to use some programming like java/spring to have a good software architecture of your product and good test coverage that would ensure that nothing would be broken after changes.

Moreover it can be expensive in certain cases. Consider situation where you have 1 lambda that need internet access to do some stuff (like captcha verification or ip address check).
For this you need NAT, cause your lambda can't just get internet access from private subnet inside VPC. So you go and create nat gateway, and your lambda can now access internet.
But in the end of the month you get a bill for 50 cents for lambda + 35$ for Nat Gateway. The reason is that Nat Gateway is prices per hour (0.045 on average, 0.065 for HK) + you also paying per GB transfer through your Nat, 
but for the example let's imagine that you transfer tiny amount of 100mb per month. So instead of having cheap serverless you pay 35.5$ per month, just your lambda sometime can get internet access.
When [aws support got pressed](https://forums.aws.amazon.com/thread.jspa?threadID=234959&start=0&tstart=0) over the issue, the proposed instead of Nat Gateway create custom Nat Instance (ec2 running with nat), and it would cost only 10$.
But this idea to run additional ec2 to have internet access for single lambda upends serverless. Why do you need lambdas in the first place, when you can just put them into ec2 itself?








