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
* 1.8 [Bastion vs JumpServer](#bastion-vs-jumpserver)
* 1.9 [Disaster Recovery](#disaster-recovery)
* 1.9 [ENI, ENA, EFA](#eni-ena-efa)
2. [Services](#services)
* 2.1 [Corretto](#corretto)
* 2.2 [CloudFormation](#cloudformation)
* 2.3 [IAM](#iam)
* 2.4 [S3](#s3)
* 2.5 [Glacier](#glacier)
* 2.6 [EFS](#efs)
* 2.7 [EBS](#ebs)
* 2.8 [Instance Store](#ec2-instance-store)
* 2.9 [CloudFront](#cloudfront)
* 2.10 [Kinesis](#kinesis)
* 2.10 [Lambda](#lambda)
* 2.11 [Step Functions](#step-functions)
* 2.12 [EMR](#emr)
* 2.13 [Glue](#glue)
* 2.14 [DynamoDB](#dynamodb)
* 2.15 [QuickSight](#quicksight)
* 2.16 [EC2](#ec2)
* 2.17 [Athena](#athena)
* 2.18 [Organizations](#organizations)
* 2.19 [Well-Architected Tool](#well-architected-tool)
* 2.20 [VPC](#vpc)
* 2.21 [Elastic Beanstalk](#elastic-beanstalk)
* 2.22 [Database Migration Service](#database-migration-service)
* 2.22 [ELB](#elb)
* 2.23 [CloudWatch](#cloudwatch)
* 2.23 [Key Management Service](#key-management-service)
* 2.23 [Route53](#route53)
* 2.24 [RDS](#rds)
* 2.25 [SQS](#sqs)
* 2.26 [API Gateway](#api-gateway)
* 2.26 [Cognito](#cognito)
* 2.27 [CodePipeline(CodeCommit/CodeBuild/CodeDeploy)](#codepipelinecodecommitcodebuildcodedeploy)
* 2.28 [Storage Gateway](#storage-gateway)
* 2.29 [ECS](#ecs)
* 2.30 [EKS](#eks)
* 2.31 [Fargate](#fargate)
* 2.32 [ElastiCache](#elasticache)
* 2.33 [Systems Manager](#systems-manager)
* 2.34 [Config](#config)
* 2.35 [Aurora](#aurora)
* 2.36 [CloudTrail](#cloudtrail)
* 2.37 [Certificate Manager](#certificate-manager)
* 2.38 [Cloud9](#cloud9)
* 2.39 [CodeStar](#codestar)
* 2.40 [Rekognition](#rekognition)
* 2.41 [EC2 Auto Scaling](#ec2-auto-scaling)
* 2.42 [Global Accelerator](#global-accelerator)
* 2.43 [FSx](#fsx)
* 2.44 [VPN](#vpn)
* 2.45 [Directory Service](#directory-service)
* 2.46 [Wavelength](#wavelength)
* 2.47 [SSO](#sso)
* 2.48 [OpsWorks](#opsworks)
* 2.49 [SWF](#swf)
* 2.50 [Data Pipeline](#data-pipeline)
3. [Networking](#networking)
* 3.1 [NIC](#nic)
* 3.2 [Hub, Switch, Router](#hub-switch-router)
* 3.3 [Network Topology](#network-topology)
* 3.4 [OSI Network Model](#osi-network-model)
* 3.5 [High Level Protocols](#high-level-protocols)
* 3.6 [Low Level Protocols](#low-level-protocols)
* 3.7 [SOA and CAA](#soa-and-caa)
* 3.8 [SSL vs TLS vs HTTPS](#ssl-vs-tls-vs-https)
* 3.9 [Routing](#routing)
* 3.10 [MTU & Jumbo frame](#mtu--jumbo-frame)
4. [Miscellaneous](#miscellaneous)
* 4.1 [SaaS vs PaaS vs IaaS/IAC](#saas-vs-paas-vs-iaasiac)
* 4.2 [Virtualization and Containerization](#virtualization-and-containerization)
* 4.3 [Docker and Kubernetes](#docker-and-kubernetes)
* 4.4 [Pure Serverless](#pure-serverless)
* 4.5 [AMI vs Snapshot](#ami-vs-snapshot)
* 4.6 [AWS CLI](#aws-cli)
* 4.7 [Useful Linux Commands](#useful-linux-commands)
* 4.8 [Redirect 301 vs 302](#redirect-301-vs-302)
* 4.9 [Nmap](#nmap)









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
To distribute load equally AZ letter is different for every account (for accountA letter `a` point to AZ1, but for accountB letter `a` point to another AZ, so by this equal distribution of loads across different AZ is achieved)
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

App loadbalancer (in our case spring app) - is EC2 instance with Eureka (Service Discovery) + Ribbon (Load Balancer) - a separate spring app 
that discovers all instances and allows you to use human readable names instead of urls.

###### Egress vs Ingress
Egress - traffic that exits an entity, so all traffic (data) that leaves your VPC into public internet.
Ingress - traffic that enters an entity, so it's a request sent from public Internet to private cloud.
Traffic often is translated using NAT in and out of a private network like the cloud.
So to simplify egress- response, ingress - request.


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

###### Disaster Recovery
There are 2 main concepts of DR
* RTO (Recovery Time Objective) - how fast can you recover your infra (if RTО is 5 hours => at 2 am AZ was flooded, at 7 am you have fully running infra in another region)
* RPO (Recovery Point Objective) - to which point can you recover (you make backups every hour, at 1.30 AZ was flooded, so your RPO - 1 hour)

There are 2 types of DR in aws
* backup store - you store all you backups if tape (e.g. using iron mountain)
* pilot light - you have replica of your main infra, but it always down. So when disaster happen you just start everything. White it's down every 1-3 month you update it (run ec2, install patches..)
* warm standby - constantly running scaled in version of your main infra
* multi site

HA vs FT
* HA (High availability) - system can recover with short downtime
* FT (fault tolerance) - system continue provide services even in case of failures. You build FT by introducing redundancy.

Availability vs. Durability on ebs example
* Availability - ebs available 99.9% time, but in case of AZ failure it won't be available (cause ebs is linked to subnet/AZ). But when AZ becomes again available your data won't be lost.
* Availability - ebs 99.9% durable, that means if you have 1000 volumes you can expect to lose 1 volume per year.

###### ENI, ENA, EFA
ENI (elastic network interface) - logical networking component in a VPC that represents a virtual network card that has attributes:
* primary private IPv4 (from VPC range)
* public IPv4
* elastic IPv4 (static public IP, can't change after stop/start)
* IPv6, mac-address, security groups and so on...
You can create ENI by going to `EC2 => Network & Security => Network interfaces` and create network interface and attach/detach it to ec2 instance.
Every instance in VPC has a default ENI - primary network interface, you can't detach it. You can create new and attach. Number of ni that can be attached to ec2 depends on it's size (more computing power - more ni can be attached).

Both ENA & EFA are ENI that provide some advanced networking
* ENA (Elastic Network Adapter) - ENI that provides enhanced networking capabilities. There is a selected [set of instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking-ena.html#ena-requirements) that support ena. You can ssh to ec2 and run `modinfo ena` if you see response your ENI is ENA.
* EFA (Elastic Fabric Adapter) - ENA + OS bypass hardware interface (without involving the instance kernel) that use hardware-provided reliable transport communication.
It allows HPC applications to communicate to talk with each other with low latency and higher throughput than traditional TCP channels.
HPC applications - a group of ec2 instances that perform some high load logic. They are written using MPI (Message Passing Interface) and require fact communication between instances.
EFA ENIs can only be attached at launch or to stopped instances.


### Services
###### Corretto 
[AWS Corretto](https://aws.amazon.com/corretto) - free amazon implementation of Java SE specification.
As you know there are confusion around java SE. Oracle provides 2 java se implementations
* OpenJDK - free
* OracleJDK - paid
Yet there are some features in OpenJDK that can be of charge. that's why you may want to use other java se implementations like
* Amazon Corretto
* AdoptOpenJDK
* Azul Zulu
If you are still confuse you can take a look at [java is still free](https://www.infoq.com/news/2018/09/java-support-options-sept18)

###### CloudFormation 
It's aws solution to IAC. There are 2 concepts
* Template - json/yaml file with desired infrastructure
* Stack - template deployed to cloud (you can run commands like describe/list/create/update stack). If you create/update stack and errors occur all would be rolled back and you would be notified by SNS
AWS SAM (Serverless Application Model) - framework to build serverless apps, provide a shorthand syntax to write IAC using yaml templates. Later it anyway transformed into CloudFormation full template, so you can just learn CloudFormation and stick with it.
Supported formats are JSON/YAML. Resource naming is supported not for all product, this is due to possible naming conflicts (when you update template, some resources would be recreated, but if names are not updated error would happen).
To assign real name CloudFormation use stack + logical name, this ensures unique names.
You can add deletion policy (for example you delete stack and want to preserve s3 buckets and take RDS snapshot).
CloudFormation Registry - managed service that lets you register, use, and discover AWS and third party resource providers.
You can use conditions inside templates (for example create ec2 based on input params).

Don't confuse nested stack and imported stack
* nested stack - you put one stack into another (main) by using `AWS::CloudFormation::Stack` and create only 1 stack (main). And this stack would create dependent first. It's the same as have 1 file, you just separate code, yet in aws your stacks would be divided into main and nested.
* imported stack (Cross-Stack References) - you create 2 separate stacks with different names, and inside main you call resources from dependee stack by using `!ImportValue !Sub "${stackName}-SubnetID"`.
In both cases your first stack should export resources, by using `Outputs`, that you want to use in main stack.

By default CloudFormation use the same permission as user has (so if user can't create ec2 instances and create template that should create new ec2, this template would fail).
But you can assign IAM role to CloudFormation, and in this case it would use permissions from this role. To create stack with assumed role you should pass param to cli like `--role-arn={youRoleForCloudFormationARN}`.
If you don't specify `role-arn`, aws will use previous role. If it first time it will use temporary session that is generated from user (one who is creating the stack) credentials.

For multi-env deployment (where you have dev/prod env or more) you should use single reusable template file (don't create new template file for each env, cause you will end up in a mess). 
You can achieve reusability by adding params, mappings, conditions section into your template. Then you just create 2 stacks with different names (dev/prod) and different params but with single template file.

Nested stacks are mostly used when you need to reuse some common template. Suppose you have 3 templates and each of them using specific type of ec2. You can just duplicate code across 3 templates, but it ineffective.
It's better to create new template and use it as nested template for each of your 3 templates. Notice that you can't use just imported stack in this case - cause that would mean that only 1 instance of ec2 would be created
and shared between all 3 stacks, but what you need is each stack to have it's own instance, that's why here you should use nested stack.

Use dynamic references, never store secrets in your stack template. If you need secrets you should store them in aws secrets and just reference them from your template by using `'{{resolve:service-name:reference-key}}'`.

Good practice is to set params constraints. In this way you are guarantee that param would be some expected value.

You can create rules with CloudFormation Guard (cfn-guard - open source CLI tool) that can ensure that your stack is compliant (for example: all ebs volumes should be only encrypted).
In case rule failed, stack won't be created.

Best practice is to divide your infra into several stacks. There are 2 approaches
* multi-layered architecture - horizontal structure where one layer depends upon another by using nested stacks (you divide all your services into 3 stacks - networking/computing/rds => computing layer depends on networking, cause you create ec2 instances in some vpc and subnet)
* SOA (service-oriented architecture) - you stacks are separated not by technical layers but by services (each service has a separate stack with it's own networking/computing/rds).

Layered Architecture usually has 3 layers.
* Presentations (controllers)
* Business Logic (services)
* Database (models/domain objects/dto)
Presentation depends(can access) on Business Logic and it depends(can access) on Database, but no the other way around.
There are other 2 types of architecture
* hexagonal
* onion
But generally they resemble layered style, only difference they divide core (domain objects + services) and outer object (ui, database) and they are connected by using port (on core side) + adapter (on outer side)

AWS-specific parameter types: If you need to pass param as ec2 key name, you can pass it as string, but if this key doesn't exist, you template would be half-created and aborted.
It would be nice, if aws can first check if the key exists, and after this starts to create stack. This is what for aws specific param types. If you set param type, not just `string`, but `AWS::EC2::KeyPair::KeyName`
CF would first check that the key with such name exists (in region), and only after this would start to create your stack. 
Name of ssh key is not the only one, here is full list of [AWS-specific parameter types](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-specific-parameter-types)

Internally CF is nothing but a service that parse your JSON/YAML, creates dependency graph and turn it into aws API calls (from bottom to top so dependencies would work).
CF uses declarative approach, cause you declare how your stack should look like, you are not telling what CF should do to in order to build it (imperative approach).

###### IAM
* In case you have one user who requires access to a specific resource, as a best practice, you should create a new AWS group for that access (in case new user would appear you would just assign him to this group)
* EC2 role access - you can add (for example bucket write access) role to ec2 instance
* Cross-account access - you can set up access for account B from account A

There are 3 types of permission
* user - permission for single iam entity
* group - collection of permissions that you can assign. Used to define users. One user can belong to multiple groups.
* role - collection of permissions for specific aws service (for example ec2 can connect to s3 without any secret key). You can also create role for user, but user will have to assume this role
With role you should provide Access token and Session Token
So if user is assigned to 2 groups he would get all permissions from 2 groups at the same time, but if he assigned 2 roles, he can use only one at a time (by assuming one role)

Tokens
* Access token - combination of an access key ID (20 characters) and an access secret key (40 characters)
* Session Token - temporary session token to authenticate


Policy - define the permissions for a user, group, or role. Resource is defined with following format `"arn:aws:service:region:account-id:[resourcetype:]resource"`.
Resource examples:
```
Amazon S3 Bucket        arn:aws:s3:us-east-1:123456789012:my_aws_bucket/*
IAM User                arn:aws:iam:us-east-1:123456789012:user/Jack
Amazon DynamoDB Table   arn:aws:dynamodb:us-east-1:123456789012:table/myTable
```

Role for user
* create role `S3Viewer` of type: Another AWS Account (enter desired accountID or your own) and assign policy  `AmazonS3ReadOnlyAccess`
* create new policy `AssumeS3ViewerRole`
```
{
    "Version": "2012-10-17",
    "Statement": {
        "Effect": "Allow",
        "Action": "sts:AssumeRole",
        "Resource": "arn:aws:iam::ACCOUNT_ID:role/S3Viewer*"
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
Identity federation - grant to external identities ability to secure access aws (both management console & API) without creating iam users
External identities can be of 2 types
* corporate IdP (microsoft AD, aws AD)
* web IdP (cognito, facebook, google or any other openId connect)
FU (Federated user) - user of such external identity who can access aws services but don't have corresponding iam user (so it managed outside aws iam)
FU can access aws management console in 2 ways
* programmatically request security credentials and put them into sign-in request to the AWS
* post SAML assertion directly to [AWS sign-in](https://signin.aws.amazon.com/saml)
But both allows federated user to access the console without having to sign in with a user name and password
FU assume iam role and can access aws resources based on this role. Access is intersection of 2 policies (one passed within request + another from iam role).
So FU request access with some policy attached and his iam role also has some policy they intersect and this is his policy inside aws.

Principal - IAM identity (user/group/role) that can interact with aws
* can be permanent/temporary
* can be repesented by human/application
* can be root user / iam user / role
Policy - json file with permission which you attach to IAM identity or aws resource (some resources can have it's own access policy, like s3 bucket policy - where you can define which user which action should take).
Resource policy - policy for single resource:
* s3 bucket policy
* SQS Access Control
Main difference between identity and resource policy is that identity policy doesn't have `Principal` attribute, cause you link it to some iam identity which would be it's principal.
Contrary to this resource policy have `Principal` attribute where you define to which user this policy is applied. Generally you should use identity policies cause you can define access to multiple resources there, where for resource policy access is limited to this resource only.
One example where resource policy is useful is when you need to add simple way to grant cross-account access to your S3 environment without creating iam role.
There are 6 policy types
* Identity-based policies - for iam identity
* Resource-based policies - define policies separately for aws resources like s3 bucket policy (not all resources support this)
* Permissions boundaries - same policy as for identity, but added not as permission policy to iam identity but as permission boundary. Specify what permission user can potentially have.
So they don't actually give these permissions but merely state that this identity can potentially have up to these permission.
So the actual permission are calculated as intersection of permission policy & permission boundary. Whenever you create new iam identity (user/group/role) you can add actual permissions and permission boundaries.
The idea behind is that you can delegate responsibility to others (you can create policy that would allow identity to create iam users only with certain boundary => so all newly created users would have your predefined boundary, [example](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html#access_policies_boundaries-delegate))
* Organizations SCPs - AWS Organizations service control policy limit permissions that identity-based policies or resource-based policies grant to entities
* ACL (Access control lists) - control which principals in other accounts can access the resource to which the ACL is attached (so they only cross-account, cannot grant permissions to entities within the same account)
* Session policies - limit the permissions that the role or user's identity-based policies grant to the session

###### S3
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
< Content-Range: bytes 0-1/20
< Content-Length: 2
```
 
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

S3 accidental delete protection
* add 2FA delete - user will need to enter 2FA code in order to delete
* add versioning - when file is deleted new version `mark delete` is added, but original file is still stored with some version
Suppose we have 2 versions A and B (current) and delete file. In this case we would have A, B, C (mark delete, current). As you see file is still preserved with some version.

Eventual consistency - since put/read is atomic, you won't read partially updated file, so you will either read old file or new file, because of this sometimes just after write you can read old file, but after some time new file would be available.
Although bucket name is global across all regions, you still select region when you create bucket, and actual data is stored in that particular region.
Using bucket policy you can specify from which ip (CIDR notation) and at what time you allow to access data.

Server access logs - you can enable them and see who is accessing your s3 (IP address/time/action(get/post/put)/response)
Event notification - you can send events (sns/sqs/lambda) base on s3 action (get/post/put).
To achieve better performance you are adviced to use random names for objects, but [it's not longer required](https://aws.amazon.com/about-aws/whats-new/2018/07/amazon-s3-announces-increased-request-rate-performance). 
Randomized named worked better cause when names are sequential all data store in the same place and it's harder to extract it.

###### Glacier
Glacier - low-cost tape-drive storage value with  $0.007 per gigabyte per month. Used to store backups that you don't need frequently.
Access to data can take from few minutes to a few hours. You store data as archives.
Vault - same as bucket for s3, actual place where your archives are stored. You control access by using iam identity or vault policy.

When you should never use glacier
* rapidly changing data (use EBS/EFS/RDS/DynamoDB)
* immediate access (use S3)

You can also use multipart upload to speed up upload by dividing large files into chunks
Just like s3 you can use REST API to work with glacier
You can set up s3 lifecycle, after which objects from s3 would be moved to glacier (but to view them you should use s3 api, if you use glacier api you won't see this objects)
You can retrieve up to 5% of your average monthly storage for free each month (rated daily), above this you are charged additional fee

###### EFS
EFS (Elastic File System) - delivers simple network filesystem for EC2. It supports NFSv4/4.1 (Network file system).
System size is grow as you add more files to file system.
It allows parallel access from multiple EC2 within the same region
It accessed by EC2 using mount targets which are created by AZ
If you need temporary storage EFS not the best option, look at EC2 Local Instance Store
There are 2 performance model
* General (if you need less then 7k file operation per second) 
* Max I/O
AWS DataSync - service that make it faster transfer data between on-premise data and EFS

When you create efs it creates mount target in each az. Instances in each az talk to efs by using this mount targets.
To mount efs to ec2, NFS Client should be installed and running. You can install it by
```
sudo yum install -y amazon-efs-utils
sudo mount -t efs fs-bc0a413f:/ ./mnt
```
Some AMI (Amazon Linux/RHEL/Ubuntu) it's already installed, you just need to start it. You can check the status by `sudo service nfs status`
By default anybody can read, but root (UID 0) user can write. You can also use Access Points to create dirs in your efs for different users to read/write.
You can also do `sudo chmod 777 /mnt/efs/` to give access to anybody to read/write. To check if directory is mounted to efs run `df /mnt/efs/`.

###### EBS
EBS (Elastic Block Storage) - simple block storage for EC2. After EBS is attached to EC2 you can format it with desired file system.
It automatically replicated within AZ to provide higher durability (yet if AZ failed it would be unaccessible).
Most AMI (Amazon Machine Images) are backed by Amazon EBS, and use an EBS volume to boot EC2 instances.
You can attach multiple EBS to single EC2, but single EBS can only be attached to 1 EC2.
EBS allows to create point-in-time snapshots (backup) and store them in s3.

Snapshots are store in amazon s3 bucket (not in your bucket, so you don't have full control of it, you can't go to bucket and download snapshot) and amazon provides some services to you regarding snapshot
* create & delete
* recover
* copy to other region
When you take snapshot of running ebs, it would be available immediately (there is no delay).
But when you recover snapshot ebs is read immediately, but data is loaded lazyly.

IOPS vs Throughput vs Bandwidth
* IOPS - number of read/write operations per second
    * General Purpose SSD (gp2)
    * Provisioned IOPS SSD (io1)
* Throughput - number of bits read/written per second
    * Throughput Optimized HDD (st1)
    * Cold HDD (sc1)
* Bandwidth - pipe, throughput - water running through pipe

EBS Volume Types
* HDD (large streaming workloads where throughput (measured in MiB/s) is a better performance measure than IOPS - has a platter and 
actuator arm that moves around platter and read/write (just like cd player)
since to read/write arm should have a lots of movement - it's bad for high I/O
* SSD (frequent read/write operations with small I/O size) - like a flash card, no moving parts

Since you can't encrypt volume after you attached it to ec2, so in order to create encrypted volume for running ec2 you have to
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

Incremental Snapshots available only for rds for other types (ec2 instance store, efs you have to manully make backups)

###### EC2 Instance Store
Similar to EBS, but located on the same machine as EC2 (EBS connected through network), available only during lifetime of EC2.
So it's not durable, once EC2 instance stop/restart/fail all data would be lost.
It's not available for all ec2 types, only for [some of them](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes)
You still have to use at lease 1 EBS + additional instance store. For some types you can select to remove instance store, but ebs should be present always.
So you can't create ec2 without ebs.
It's differ from EBS cause it's directly attach to machine (ebs connected via network) and provide lowest latency.

###### CloudFront
CloudFront is a CDN (content delivery/distribution network) - that speed up the distribution of your data using edge locations.
When user request content, CF use nearest edge location and deliver cached version, it's faster that transfer data directly from data center.
If content not in cache, CF retrieve it directly from s3 or HTTP and cache it. CF is not durable storage, it's just an edge cache.
To work with CF you should create origin server (s3 in case of static content, ec2 - dynamic). Then you add you origin server to CF, and CF generate link for you.
Later when user request this link CF check the closest edge location for data, and if found in chane - return, if not request it from origin server and cache it.
To ensure origin availability you can add backup origin and configure CF in case it get 4xx/5xx response from main origin, to use backup origin.
Edge cache is smart, it can remove less popular content to make room for other data.
You can also use Geo Restriction to specify at which countries content should be 403 (Forbidden), you can also add custom error code and message.
You can control expire date (when CF will check origin server for new version) by setting cache control header (by default 24 hours).
You can delete item from CF by
* delete it from origin server, and when expire date come it would be deleted from CF
* use invalidating api to remove file from CF immediately
CF doesn't cache following requests: POST, PUT, DELETE, PATCH. By default cache is stored for 24 hours, but you can evict it by calling invalidation API.
You can also use versioning (`/v1/img/test.png`). In this case once you update your site users will use new versions that not in CF, and edge location will download it from origin server.
You can serve content from multiple origin servers.
Field-Level Encryption - encrypt user's upload data and transfer these encrypted data to your origin
Lambda Edge - lambda functions that allows you to override behavior of request/response to your cloudfront edge locations
(for example only cognito authenticated user can view content)
There are 4 types
* viewer request - when CF receive request from user
* origin request - before CF forward request to origin server
* origin response - when CF receive response from origin server
* viewer response - before CF responds to viewer

You can protect CF data by using 
* Signed url (like pre-signed s3 url) - temporary access to CF data (end-datetime is mandatory cause we need to know when access to particular file is over, start-datetime - optional).
* Signed cookie - you can access multiple CF objects with same signed cookie. So use this method if you want to have access to multiple files with same cookie, and want to use standard url (without any signature as url params).
In order to create pre-sign url you need to create CF keypair. You can do it only as root account (iam user won't work in this case). Login as root, go to `Account=>Security Credentials`, from there go to `CloudFront key pairs` and create new key pair.
Don't confuse it with ec2 key pairs and with CF public key. They both for different purpose.
You can make CF private by setting `Restrict Viewer Access` to yes (in this case you can also set which accounts can create signed urls, so other accounts can also generate urls to access data).
So if you restricted access and try to access url you got error `Missing Key-Pair-Id query parameter or cookie value`.
You can create pre-signed url with following command `aws cloudfront sign --url=https://d3l9m9kf4m2kpm.cloudfront.net/info.html --key-pair-id=APKAJDZCS7VF4FG32EWA  --private-key=file://cfkey.pem  --date-less-than=2020-08-19` (this command is local and doesn't call aws api, so we don't need to pass profile)
This will create signed url by which you can access your data from CF.

You can also use CF to distribute dynamic content (like ec2/api requests). Although at first it seems unreasonable cause for every dynamic request CF should forward it to underlying ec2.
But the point is that such a request from user goes to closest edge location and terminates there. From there on it goes not through public internet but through aws cross-region private link.
That improve speed and give security. As you see this is basically the same as Global Accelerator.

In order for CF to serve from s3 bucket, objects in s3 should be publicly available, otherwise CF won't serve them
You have 2 types of distribution
* web - static web content (files/pics)
* RTMP - streaming media

If you create distribution to be accessed from dns name you should add all possible urls to cname in CF.
Sof you are going to access it from example.com, www.example.com, photos.example.com, all these 3 dns names should be added to Cname names when you create distribution.

OAI (Origin Access Identity) - CF user that can access origin. To access s3 from CF you should policy on a bucket level (but you don't need to allow public access).
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
When you set OAI from cloudfront you can set `update bucket policy` and aws will itself add such policy to your s3 bucket. Of course you can do it manually, or edit it after this.
In this case your s3 bucket is public, but can be accessed only by cloudfornt user with OAI=E27OQ9NRS1N0QR.

###### Kinesis
It is a platform for streaming data on AWS, making it easy to load and analyze streaming data.
With Kinesis, you can ingest real-time data such as application logs, website clickstreams, IoT telemetry data, and more into your databases, data lakes, and data warehouses, or build your own real-time applications using this data
* Kinesis Firehose - load massive volumes of streaming data into AWS.
Receives stream data and stores it in s3/RedShift/ElasticSearch
* Kinesis Streams - build custom applications for more complex analysis of streaming data in real time
* Kinesis Analytics - analyze streaming data real time with standard SQL

AntiPattern
* Small scale consistent throughput (Kinesis Data Streams is designed  and optimized for large data throughputs)
* Long-term data storage and analytics (By default Kinesis Data Streams stores data 24 hours, you can extend retention up to 7 days, if you need longer you should considered RDS/DynamoDb/S3/Glacier)

Queue vs Streaming
* queue (not reactive) - you have to poll data, once it polled it removed from queue
* streaming (reactive) - many consumer notify of changes, events stay for long time (not deleted)

###### Lambda
Lambda - piece of code that can be executed without any server env (just write code in javascript and it will run).
Lambda can be directly triggered by AWS services such as Amazon S3, DynamoDB, Amazon Kinesis Data Streams, Amazon Simple Notification Service (Amazon SNS), CloudWatch
Lambda are billed per request, so it's better for some small simple tasks. If you have highload with 10m hits per day, run simple ec2 is cheaper.
AntiPattern
* Long Running Applications (Lambda max time is 900sec. If you need some long running jobs you should consider EC2)
* Dynamic Websites (although you can use Lambda to create static website, it's better to use some programming language like java/node.js and deploy it to EC2)
* Stateful Applications (Lambda is stateless, if you need state it's better to create app in java/node.js and deploy it ot EC2 + RDS/DynamoDb)
Cold Start - when you first run your lambda and aws search for idle server and run your lambda on this sever, delay may happen. 
When you first run your code aws create new execution context (download code, set up env vars, load code) and it can take from few millisec to a few sec.
When you run it for second and consecutive time, there is no delay.
By default lambda runs in no VPC (so it has internet access), if you want your lambda to talk with other services you should put it into VPC, if your lambda need internet access you have to configure nat for it.
Lambda doesn't run `npm install`. So if you add new package you have to build it locally, create `.zip` file with your project (including `node_modules`) and upload it to aws lambda.

###### Step Functions
Step Functions - visual tool that allows you to build complex logic based on lambda and EC2 calls.
They can also help overcome lambda max 900sec execution time, by joining several lambdas into one execution flow.


###### EMR
EMR (Elastic Map Reduce) - highly distributed computing framework for data processing and storing, using Apache Hadoop as its distributed data processing engine.
Hadoop is open source java framework supports data-intensive distributed apps running on large clusters of commodity hardware. Hive/Pig/HBase are packages that run on top of Hadoop.
It reduces large workload into smaller jobs and distribute it between EC2 instances of Hadoop cluster (good for big data analyses).
Hadoop is basically 2 things: HDFS + a Computation or Processing framework (MapReduce)
There are 2 types of storage
* HDFS (Hadoop Distributed File System) - data replicated across several instances. Data can be stored on EBS or instance store
* EMRFS (EMR File System) - implemetation of HDFS that can store data in s3

AntiPattern
* Small data sets (EMR for large processing, if your dataset is small enough for one machine/thread it's better to use EC2 or Lambda)
* ACID transaction requirements (if you need this it's better to use RDS instead of Hadoop)

###### Glue
Glue - fully managed ETL (extract, transform, load) to catalog/clean/enrich/move your data.
AWS Glue crawlers scan various data stores you own to automatically infer schemas and partition structure and populate the AWS Glue Data Catalog with corresponding table definitions and statistics.
You can then directly query your data lake with Amazon Athena and Amazon Redshift Spectrum.
AntiPattern
* Streaming data (Glue is batch oriented, minimum interval is 5 min, so for streaming data Kinesis is better choice)
* NoSQL Databases (Glue doesn't support NoSQL databases as source)

###### DynamoDB
DynamoDB - fully managed NoSQL key-value/document database, kind of mongo, but aws proprietary solution. Stores data across 3 AZ. 
NoSql terminology
* Row - item
* Cell - attribute
* Primary key - partition key + sort key.

Main reason to use NoSql against relation db is that you can scale horizontally.
With relational db the scale is vertical (add more compute/memory to single node). If you try to scale horizontally relational db you have to use 2PC to support transaction atomicity.
2PC (Two-phase commit protocol) - distributed algorithm that support atomic transaction between 2 nodes.
Simplified 2 phase commit is
* TC (transaction coordinator) sends commit requests to 2 nodes
* both nodes decided can they execute commit or not and send results (yes/no) back to TC
* if both answered yes, TC send request to execute commit
As you guessed the problem is the more nodes you add the slower is communication to decide should they all run transaction.
So the good solution is to use db that doesn't adhere to these guidelines (transactionless db or NoSql).

There are 4 types of NoSql db
* key-value (DynamoDB)
* document (DynamoDB)
* columnar (RedShift)
* graph (Neptune)

Since DynamoDb is multi-AZ by default there is no automatic backup (like rds have), but you can use on-demand backup/restore logic.
DynamoDb just like s3 is not in vpc, so you can either
* access it from internet using some url
* access it from private subnet using vpc gateway endpoint

To work with db (create/query tables) you should use SDK/CLI or management console.
Although dynamoDb is proprietary solution with closed source code there are 2 options for local development
* download aws version for developers
* use it from localstack
But don't use it in production, cause it only for dev purposes, api is the same, but underlying design is different (not suitable for prod highload).

DynamoDb Stream - stream that provide all write (create/update/delete) operations. It's useful for
* replicating
* elasticache (so your cache would be always updated to latest state of db)
* in case your app need to know about all updates

Global Secondary Index - special read-only table created by dynamoDb to simplify search for indexed fields. Index speed up search but require more memory to store itself
Local Secondary Index - same partition as primary key, but different sort key. You can have it only one and it must be created when table is created, just like primary key.
Scanning - like `select * from` operation in RDS, just go over all records.
DynamoDb just like s3 is eventual consistent, so if you update data and read it right away you can get old value (cause items are persisted on multiple machines, and depending from what machine you read you can get stale data).
You can disable eventual consistency by setting `ConsistentRead: true`. In this case `getItem/query/scan` operations would always return correct value, but reads would take longer time.
eventually consistent read takes half the capacity of a SCR (strongly consistent read).
To read data of size
* less than 4KB - 1 SCR
* more than 4KB - 2 SCR

Throughput is of 2 types
* read (`ReadCapacityUnits: 5`) - 5 SCR per second (if you have more then dynamoDb will throttle them, if you have too much they would be just rejected)
* write (`WriteCapacityUnits: 5`) - 5 writes per second 
You can increase throughput as much as you want but decrease up to 9 times per day.

It's the only db that grow/shrink based on load.

DynamoDB Streams - captures a time-ordered sequence of item-level modifications in a DynamoDB table and durably stores the information for up to 24 hours.
AWS maintains separate endpoints for DynamoDB and DynamoDB Streams. Streams can be enabled or disabled for an Amazon DynamoDB table.
Stream records are organized into groups, also referred to as shards. 

###### RedShift
Database vs Data Warehouse
* relational db (single source) - OLTP (Online Transaction Processing) - store current transactions and quick access to them
* warehouse (multiple sources)) - OLAP (Online Analytical Processing) - store large quantities of historical data

RedShift - fully-managed, petabyte-scale data warehouse. Redshift - relational db for OLAP, supports ODBC/JDBC, based on industry-standard PostgreSQL.
It delivers fast query and I/O performance for virtually any size dataset by using columnar storage technology while parallelizing and distributing queries across multiple nodes.
Redshift only supports Single-AZ deployments. It uses MPP (Massively Parallel Processing) by automatically distribute data/query load across all nodes.
Single-node can be used to quickly set up cluster and grow later. Multi-node requires leader (who gets client connection and queries) and a few compute nodes, that actually execute load.
Cluster - consist of leader node (take the query) + 1 or more compute nodes (execute query in parallel). 
WLM (Workload Management) - queue to prioritize queries.
Just like rds, RedShift supports snapshots (both automatic and manual).



###### QuickSight
QuickSight - BI (business intelligence) tool, for building visualizations, perform ad-hoc analysis (can connect to all aws data sources).


###### EC2
EC2 (Elastic Compute Cloud) - web service that provides resizable compute capacity
AntiPattern
* Managed Service (if you need database, or some other service that is provided by aws, you would better to use it, like RDS)
* Lack of Expertise or Resources (if your team lack expertise or resource installing and managing some service like database, again if aws provide such service it's better to use aws managed service)

Type of EC2
* On-demand (0% discount) - you got server at any time, and there is no commitment from your (you can terminate it after 10min)
* Reserved (40-60% discount) - you commit to run a server for 1-3 years
    * standard - 75% discount, can't change RI(reserved instance) attributes
    * convertible - 54% discount, you can change RI attribute (for example after month you find out you need more compute capacity)
    * scheduled - you reserve instance for specific time period (one day for every week)
* Spot (50-90% discount) - not commitment from aws (you bid for a cheaper price, and if any instance is available you got it, but you pay not what you bid, but the second highest bid)
once spot price exceeds your bill, ec2 would be terminated within 2 min
* Dedicated (can be on-demand or reserved) - your ec2 instance runs on physically separate hardware

With reserved instances you can modify
* instance size (within the same instance family)
* AZ
* merge 2 into 1 (2 * t2.small => t2.large), or split one into 2 smaller
You can't change OS

There are 3 types of IP address
* private IP - your instance is not available from outside, only from within your VPC (base on SG)
* public (dynamic - cause it changes) IP - you instance is available from outside. Given once to concrete instance, if you stop/start instance it may change
* elastic(static - doesn't change) IP - public IP that you can assign to any instance

source/destination checks
* instance must be a source/destination of any traffic it sends/receive
* each ec2 performs it by default
* if your instance is NAT instance - it not a source/destination, it just a proxy to other instances. That's why for Nat instance you should disable it.


There are several instance types. You can get full view [here](https://www.ec2instances.info)
* C (good for CPU load)
* R (good for RAM load)
* M (middle between cpu & ram)
* I (good for I/O operations)
* G (good for GPU)
* T2/T3 (burstable type) - good performance for a short time (burst) - if you overuse this burst your performance will downgrade
when you cpu not bursting, you earn `burst credit` (you can view it in CloudWatch), once it hits 100% load, burst is turned on and you pay with your credit
once your credit is 0, performance downgrade
* T2/T3 unlimited burst (you pay for extra burst credit)

It usually takes longer time to stop instance then to reboot. The reason is when you stop it does some clean up by removing dns name, public IPv4, private IPv4, IPv6, ec2 instance store.

2 types of scaling
* vertical - enlarge instance capacity, need downtime. Stop instance, go to instance settings => change instance type and select new instance type, then start it.
Stopping is required cause Amazon has to move the VM to a different piece of hardware with the available resources for the size change.
If you are using CF template and change `InstanceType` there, CF smart enough to stop/change/start your instance (so it won't create new one with new instance type).
* horizontal - add more instances, no need for downtime

ASG (auto-scaling group) - allows you scale up/down system based on some metric like
* ASGAverageCPUUtilization - based on cpu consumption
* ALBRequestCountPerTarget - based on number of requests for elb
* ASGAverageNetworkIn/ASGAverageNetworkOut - based on average number of bytes
You can also create your own custom metrics. But it should change based on number of instances (latency is bad and won't work, cause adding/removing instances doesn't directly affect response time)
If you have single ec2 and you need to deploy java project there, you can just ssh there and put .jar file directly. But if you are managing a fleet of ec2 using ASG you would better to use efs and put your .jar there, so whenever new ec2 is started it would take this .jar and run your app.

###### Athena
Athena is an interactive query service that makes it easy to analyze data in Amazon S3 using standard SQL. 
You don’t need to load your data into Athena, as it works directly with data stored in S3. Athena integrates with Amazon QuickSight for easy visualization.
It uses managed data catalog (aws glue - ETL tool) to store tables you create from s3.
AntiPattern
* Enterprise Reporting and Business Intelligence (for enterprise level it's better to use RedShift, query engine in Redshift has been optimized to perform especially well on data warehouse workloads)
* ETL Workloads (for etl you should use EMR/Glue)

###### Organizations
Organizations - service that allows to tie several accounts to master account and centrally manage them (billing, services, policies)
Organization is a collection of AWS accounts that you can organize into a hierarchy and manage centrally.
Master Account - aws account from which you create your organization. From there you can also create/invite/delete other accounts. It's charged to pay all bills by all accounts. Once chosen, you can't change master account.
OU (Organization Unit) - group of accounts under one name, can be used to build hierarchical structure.
Account can be a member of only 1 organization/OU at a time. OU can be a member of only 1 OU at a time.
Typical use case is to have 2 accounts (dev + prod) to separate concerns, but to manage them from single one.
There are 2 types of policies
* SCP (Service Control Policy) - policy you can apply to a group of aws accounts, defines service actions (like run EC2 instance), it follows the same rules as IAM policies.
You can attach a policy to the root/OU/account. SCP overwrites IAM permissions (if you create SCP to block ec2 creation for all accounts, even root user form child account won't be able to launch any ec2 except for t2.micro)
Order of execution - most restrictive policies take precedence.
* TP (Tag policy) - set of rules regarding tags (which resource should have which tags)

###### Well-Architected Tool
Well-Architected Tool is a aws service that allows you to validate your current infrastructure against 5 pillars of well-arhitected framework.
It works by creating a workload (collection of resources and code that make up a cloud application) and then run this workload against 5 pillars.
The tool will evaluate your workload and provide an improvement plan with a prioritized list of issues.
It's free of charge, you only pay for underlying aws resources.


###### VPC
VPC (Virtual private cloud) - a kind of internal network in on-premises. You can have some servers inside and they won't be accessible outside of vpc.
You have complete control over your virtual networking environment, including selection of your own IP address ranges, creation of subnets, and configuration of route tables and network gateways.
By default every account has default VPC (and default subnet for each AZ), so if you don't create any other, and create EC2 directly, default VPC would be used.
Amazon VPC consists of
* VPC - private network, logically isolated from other networks in aws cloud. Can span across multiple AZ. Instances in different AZ charged $0.01 per GB for data transfer. Size should be /16 - /28 (so from 16-65535)
* Subnet - private sub-network inside VPC. Can reside only within single AZ.
* RT (Route table) - set of rules (routes) to determine where network traffic from your VPC is directed
Single RT can be associated with multiple subnets, but single subnet can be associated to one RT only.
When you create vpc, default RT is created and all subnets by default assigned to this RT, yet if you go to this RT you will see that subnets are not explicitly associated with it.
That is because this RT - is default. If you create new RT and associate subnet with it, or implicitly associate default RT with subnet, you will see that RT has this association.
Every RT has routes with 2 fields (if you want to get to such destination go to this target)
* Internet Gateway - entry point between your VPC and Internet. It allows EC2 in VPC directly access Internet. You can use public IP or elastic IP(won't change after stop/start) to both communicate with Internet and receive requests from outside web-servers.
* NAT Gateway - Network address resolution service in private subnet to access the Internet. Instances without public IP use NAT gateway to access Internet. Nat allows outbound communication, but doesn't allows machines on the Internet to access instances inside VPC.
With IG you have both outbound and inbound access, but with Nat gateway - only outbound (your instance can access Internet, but is unaccessable from Internet)
* Virtual private gateway - VPC+VPN
* Peering Connection - create private secure connection between 2 VPC
* VPC Endpoints - private connection to AWS services without Internet Gateway/NAT/VPN. It make sure all traffic goes inside aws network.
* Egress-only Internet Gateway - egress(going out) only access from VPC to Internet over IPv6

Old terminology
* VPC == VRF (virtual routing and forwarding)
* Subnet == VLAN

EC2-to-EC2 communication through public IP
* When inside same Region - inside aws network
* When in different Regions that connected with VPC peering - inside aws network
* When in different Regions - not guaranteed to communicate inside aws network (probably communicate through Internet)

SG (Security group) - also called virtual firewall, decide which traffic (both inbound & outbound) on which port to allow to ec2.
* inbound - check traffic based on source (source -  IP address or SG)
* outbound - check traffic based on destination (destination - IP address or SG)
[Connection tracking](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-security-groups.html#security-group-connection-tracking)
Working with SG rules you can notice interesting phenomena.
* You run ping, it waits cause there is no icmp rule. You add icmp rule and ping starts to work.
* Ping is running in console. You remove icmp rule from SG, but ping continue. If you stop it and run again it wouldn't work, cause there is no ping rule.
If you read above link everything becomes clear. Cause connection is stateful, SG doesn't track outbound traffic. So when icmp rule was enabled, ping established connection, and outbound traffic
started to flow. Once you remove icmp rule, you can't establish new ping connection, but old one established before can continue receive responses (outbound traffic - which is not tracked due to statefulness of SG).

SG vs ACL
* SG operate at instance level, specify which traffic is allowed to/from EC2
You can set source as CIDR or other SG (in this case only instances from this SG can access your instance)
* NACL operates at subnet level and evaluate traffic that enter/exit subnet. Don't filter traffic inside same subnet.
Evaluation order: starting from lowest to highest without overwriting each other.
In example once we hit rule #90 it was applied, and later rule #100 will not overwrite it.
Or you can also think that rules are evaluated in decreasing order by overwriting each other
Suppose you want to allow all traffic except http
90  - tcp - 80    - DENY
100 - all traffic - ALLOW
stateless filtering, SG - stateful filtering
You can only assign one NACL to one subnet, yet you can assign many SG to same ec2
You can't block specific IP with SG, you need to use NACL
Stateful - if you send request from your ec2 you will got response even if SG doesn't have any outbound rules

If you set up NACL (let's say for ssh) you should also add outbound rules (cause nacl are stateless). But for ssh outbound port is not 22, it's ephemeral port - When a client connects to a server, a random port from the ephemeral port range (1024-65535) becomes the client's source port.

When you create VPC, default SG created automatically. It allows inbound traffic from instances with same SG (source - SG_ID), and all outbound traffic.
So if you need 2 ec2 to talk with each other you can assign both of them same SG where source is ID of this SG - this means traffic allowed from any instance of the same SG

To monitor traffic you can use
* VPC traffic mirroring (it copies traffic and send it to NLB with a UDP listener)
* VPC flow logs (it includes information about allowed and denied traffic, source and destination IP addresses, ports, protocol number, packet and byte counts, and an action: accept or reject)

VPC peering
* you can create peering between VPC in 2 regions or in 2 accounts (in this case one account should accept peering request from another)
* traffic of peering within same region is not encrypted, but isolated, just like traffic between 2 EC2 in the same VPC
* traffic of peering within different regions is encrypted

multiple VPC connection (3 ways)
* vpc peering (2014) - connect 2 vpc to each other (requester -> request access to accepter).
Peering is non-transitive connection type (basically it's one-to-one). So if A has a peering with B, and B has a peering with C, A has no access to C, in order for them to access each other you have to create peering between them too
It's good when you need to connect 2 or 3 vpc, but in case you have to connect 10 vpc, that means you would have to create `n*(n-1)/2` peering connection between each and every vpc.
Good news is that peering can be cross-account and cross-region. Basic cloudformation example here `cloudformation/advanced-networking/vpc-peering.yml`
* transit vpc (2016) - a way to connect multiple vpc (form different regions) and your on-premises data center without creating hundreds of peering connections.
Transit vpc is not aws service, it's just a concept or architecture how you should design such a transit vpc that would connect all other vpc with each other.
The idea is to create one vpc with ec2 and IGW and install there some software from Cisco/Aviatrix (software is commercial, you buy ami with Cisco Cloud Services Router 1000V Series).
Implicit drawback is cost: since you pay for every traffic exiting (egress) your VPC, if you use transit vpc as single internet gateway, all other vpc would access internet from it. So fo each internet access you would pay twice
first - egress traffic from vpc (that goes to transit vpc), second - egress traffic from transit vpc itself (from there it goes to public internet).
underneath it's all these vpc and on-premises centers are connected to each other through vpn and transit vpc basically works as vpn server and routing this vpn traffic.
* transit gateway (2018) - it's aws managed service that works like transit vpc, but don't have all it's complexity of installing and configuring.
You create TGW and then just attach VPC/VPN configurations and add route tables.

Connect vpc to on-premise network (2 ways)
* site-to-site VPN
Route propagation allows a virtual private gateway to automatically propagate routes to the route tables - so you don't need to manually update RT (works for both static & dynamic routing)
After running `cloudformation/advanced-networking/site-to-site-vpn.yml` you will have to manually go to site-to-site vpn and download configuration (select openswan as router).
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
* Direct Connect - private connection between aws region and you (aws router to your on-premise router) or your ISP (internet service provider).
LAG (Link Aggregation Groups) - ability to order multiple direct connect ports as manage them single larger connection (max number is 4 ports, port types should be the same, all 1GB, or all 10GB)
DCG (Direct Connect Gateway) - grouping of VGW (virtual private gateways) and VIF (private virtual interfaces). Multi-account DCG allows to associate up to 10 VPC (from different accounts) or up to 3 Transit Gateway.
Direct Connect and DCG support both 1500 and 9001 MTU (you can also modify it if you need).

VPC ClassicLink
* before 2013 there were no default VPC and all EC2 where launched in flat network shared with other aws users
* allows to connect your VPC with EC2 classic, EC2 becomes a member of VPC Security Group

VPC Endpoint
* endpoint services (used to call AWS PrivateLink) - you create some service (ec2) and add NLB(not application/classic lb), and other aws accounts can connect to your service via interface endpoint
So using this you can create private service provider that would provide some logic to other aws accounts on vpc-to-vpc basis
Of course you can access your NLB form the internet (you should have at least one RT with internet gateway route to access NLB/ALB by dns name), but using privatelink will ensure that all traffic is within aws , and no traverse the internet (same as this service running inside your vpc),
and to access your service from privatelink you don't need to have internet gateway (cause all traffic inside aws and doesn't go to outside Internet)
So you can access service (ec2) of one vpc from another without vpc peering/internet gateway/vpn
If you share your service with aws marketplace you can get vanity dns name like `us-east-1.vpce.mycoolsite.com`
* Gateway endpoint — target for a route in your route table for traffic destined to a supported AWS service (s3/dynamoDB)
* Interface endpoint — ENI with a private IP address from the IP address range of your subnet that serves as an entry point for traffic destined to a supported service.
So instead of calling public dns name of some service, aws create ENI inside your subnet, and so you don't need internet access anymore. You can directly call this private IP since it's inside your vpc.
Using this enables you to connect to services powered by AWS PrivateLink (so basically all aws services + your custom created via endpoint, except those in gateway endpoint, are aws privatelink)

By default ec2 instances dns name is disabled (only ip address is given). You can enable it for vpc by going to `Actions=>Edit DNS Hostname`.
You can change subnet setting `Actions=>Modify auto-assign IP settings` and in this case when you create ec2, it would by default select subnet settings (enable/disable auto-assign public IP address). Of course you can also change it on ec2 level.

VPC Tenancy
* multi-tenant (virtual isolation) - you share your instances on the same server as other aws clients, you instance is divided by virtualization
* single-tenant (dedicated, physical isolation) - you get completely separate hardware for you (can be useful if you have regulatory requirements)
EC2 Tenancy - you can set it for individual ec2 also.
* shared (accessible only if vpc tenancy = multi-tenant) - Your instance runs on shared hardware
* dedicated - Your instance runs on single-tenant hardware
* host - Your instance runs on a Dedicated Host, which is an isolated server with configurations that you can control
After launch you can change only from dedicated to host and vice versa.

Flow Logs - you can configure flow logs for
* vpc - flow logs would be for all ENI in whole vpc
* subnet - flow logs would be written for all ENI in this subnet
* network interface - flow logs would be written only for this particular ENI
Format of flow logs `${version} ${account-id} ${interface-id} ${srcaddr} ${dstaddr} ${srcport} ${dstport} ${protocol} ${packets} ${bytes} ${start} ${end} ${action} ${log-status}`
As you see there is no actual payload, only fact that somebody try to send some tcp/udp message to someone. If you want actual payload you should use Traffic Mirroring.
So use
* Flow Logs - troubleshoot connectivity and security issues, make sure that the network access rules are working as expected
* Traffic Mirroring - deeper insight into the network traffic by analyzing traffic content (payload)

3 layers of security
* vpc layer - route tables define which traffic to allow
* subnet layer - NACL decide which traffic to allow
* ec2 layer - SG

PG (Placement group) - create ec2 in underlying hardware in such a way as to avoid correlated failures. There are 2 types
* cluster - packs instances close together inside AZ (good when you need high speed node-to-node communication, used in HPC apps). t2.micro can't be placed into cluster PG
* partition (up to 7 per AZ) - spread instances between different hardware partitions (so group in instances inside one partition don't share any hardware with group of instances from another partition)
* spread - strictly place instances into distinct hardware to reduce correlated failures

Prefix list - set of one or more CIDR blocks (can be used in SG as `SourcePrefixListId` to define not single CIDR range but a set of them).
If you want your ec2 to be accessed from elb you should put `SourceSecurityGroupId` id of SG for elb (in this way only elb or whoever has same SG can access ec2).

DHCP options sets - set of rules how to create private domain name. When you create new vpc, default DHCP set would be linked to it. It also add dns server into your vpc to determine dns rules.
You can crete your custom set and link it to any vpc. You can also remove DHCP set form vpc, in this case no dns name would be created.
If you want to change vpc dhcp set you can do it only after you've created vpc, go to `Actions=>Edit DHCP options set` and select another set or remove it from vpc.
Yet if you unlink dhcp from default vpc, and try to create ec2, it will still use default dhcp rules and add public/private dns names.

###### Elastic Beanstalk
Imagine you have spring boot app that use mysql and you want to deploy it to aws, what you have to do
1. create vpc/subnet/IGW/RT
2. create mysql RDS
3. create EC2
4. ssh to ec2, install java, copy your jar file, and run it passing all env vars
Quite a lot for a start. Imagine if we have a tool where you can just say that you want java app, mysql db, set env vars and upload jar file, and all infra would be built for you.
Welcome beanstalk - aws service where you can say what you want and beanstalk will build all infrastructure for you.

Beanstalk - PaaS that mange deployment, provisioning, load-balancing, auto-scaling, health monitoring. Best suited when you need quickly deploy something and don't want to learn about other aws services.
It keeps the provisioning of building blocks (EC2/RDS/ELB/Auto Scaling/CloudWatch), deployment of applications, and health monitoring abstracted from the user so they can just focus on writing code
You simply upload a `.war/.jar` (in case of java) file, and beanstalk run tomcat server for you and deploy your app. Yet developer has a right to manage all infrastructure provided by beanstalk.
EB using cloudformation template that build your configuration. After successfull deployment you can see your rds/ec2/elb and configure them separately.
Keep in mind that for prod deployment it's better to use your own cloudformation script and manage infra with it, eb is good for testing purposes, PoC.
With EB you shouldn't worry about java installed on ec2, if you select java it would automatically install it into ec2 and use coretton as jdk (same true for other popular env like node.js/tomcat and so on..)

###### Database Migration Service
DMS - used for easy migration between different db (like from MySql to DynamoDB), and also for data replication.
DMS use SCT (Schema Conversion Tool) for converting between existing schemas.


###### ELB
ELB (Elastic Load Balancing) - is a proxy that accept traffic (using listeners) from clients and route it to targets (usually EC2), so it basically distribute your traffic between different ec2 instances.
ELB holds 2 connections
* from client to elb
* from elb to ec2
Listener - is a protocol + port for which you got incoming requests.
There are 3 types of elb:
* Application LB - if you need to balance http/https. Also supports websocket & secure websocket
* Network LB - if you need to balance TCP/UDP
* Classic LB - if you need to balance classic (without VPC) EC2 instance

ALB+NLB - you register target in targets group and route traffic to target groups. CLB - you register instances within LB.
If you enable AZ for ELB, it creates lb node in AZ, after this traffic goes to this node. The best practice to have 1 node in each AZ.
If you have not equal number of EC2 in different AZ (let's say 2 in az1, and 8 in az2) then you should enable cross-zone balancing.
In this case each lb will route it's 50% into 10 instances, so each instances will get 10% of traffic. But if you disable cross-zone balancing, then 50% in first zone would be divided between 2 instances (so each got 25%)
and 50% from az2 would be divided in 8 instances (so each got 8.25% traffic). With ALB cross-zone balancing enabled by default.

Connection draining - makes sure that any back-end instances you have deregistered will complete requests in progress before the deregistration process starts

LB can be
* internal (having only private IP)
* external (facing internet, having both public & private IP)

CLB has stick session - you can bind user's session to specific ec2 and every time this user hit CLB he goes to the same ec2.
It can also be enabled for ALB (for target group not for single ec2). Not available for NLB.

XFF (X-Forward-For) - header of original IP address of user (cause your ec2 would see IP of load balancer)

Health Check - you can monitor health of ec2 and always redirect user to healthy ec2 (ELB doesn't kill unhealthy ec2)
There are 3 types of health checks
* EC2 health check - watches for instance availability from hypervisor/networking point of view. For example, in case of a hardware problem, the check will fail. Also, if an instance was misconfigured and doesn't respond to network requests, it will be marked as faulty.
* ELB health check verifies that a specified TCP port on an instance is accepting connections OR a specified web page returns 2xx code. Thus ELB health checks are a little bit smarter and verify that actual app works instead of verifying that just an instance works.
* Custom health check. If your application can't be checked by simple HTTP request and requires advanced test logic, you can implement a custom check in your code and set instance health though API

ALB Request Routing - you can redirect user to different ec2 based on request attributes (subdomains, headers, url params..)

Listener Rule - can forward request but not change. So if you have a rule `/api => EC2_1, /internal => EC2_2`
That means EC2_1 should have url `/api` and EC2_2 should have url `/internal`.
Since we can modify rules, you can use elb to hide some api endpoints. For example you can create 2 rules like:
* rule-1 - forward /api requests to /api endpoint in your app
* default rule - always return 403
So with this only `/api` endpoint would be available. All other endpoints would return 403.

Usefule features
* cross-zone for eqaul load distribution across all instances, no matter in which AZ they are.
* Sticky Sessions - when you send `AWSELB` cookie and elb remember to which ec2 instance to route request

Health check can be
* ping
* connection attempt
* page that is checked periodically


###### CloudWatch
CloudWatch - monitoring service for aws resources and apps running in aws cloud. IAM permission for CloudWatch are given to a resource as a whole (so you can't give access for only some of EC2, you give either for all EC2 instances or none).
You can also use CloudWatch to create alarms (for example you get 5 errors, and you want to notify developer). Alarms are integrated with SNS (so you can send email, put message to SQS and so on).
Many aws resources (EC2, RDS, and so on) automatically send metrics to CloudWatch. You can also send your custom metrics. Metrics can't be deleted, but expire automatically.
By default ec2 monitoring interval is 5min, but you can enable detailed monitoring (second step when you create ec2) and data would be flow every 1 min.
In ec2 you can create alarm too (when cpu goes above 80% - stop instance).
If you want to track ec2 memory/cpu usage you have to install cloudwatch agent into ec2.

###### Key Management Service
KMS - a service for generating/storing/auditing keys. If you have a lot of encryption it's better to use central key management service.
You start working with KMS by creating CMK (customer master keys), or if you are using encryption from other aws resource, it would create CMK automatically for you.
You can import only symmetric keys. You can't export CMK symmetric key or asymmetric private key.



###### Route53
Route53 - is amazon DNS service that help to transform domain name into IP address. It's called 53, cause 53 - port of DNS.
You can buy hostname from any provider and register it within Route53, after this Route53 gives you 4 TLD (Top-Level Domain) that you put into your hostname provider,
so end user will request your domain, it will got to your provider, and from there to aws. Route53 supports wildcards (subdomains).
Route53 also supports WRR (Weighted Round Robin) where you can assign weight ans divide your traffic (for example you have new feature and want only 25% of users to use it).
You can also use LBR (Latency Based Routing), in case you have aws resources in multiple regions, route53 will redirect users to region with lowest latency.
With Route53 you can also have private DNS name within your VPC, and such a name would be unaccesable outside VPC.
Heath check - a check that requested resource is available. DNS Failover - return result only if health check is fine.
DNS responses use
* UDP if size less than 512 KB
* TCP is size exceeds 512 KB
Routing policy
* Simple - default policy to link domain to any aws serivce (elb/ec2/beanstalk)
* Failover - in case one ec2 fail, to redirect traffic to second one
* Geolocation - redirect traffic based on user location to record set with nearest geographic aws region
* Geoproximity - you choose region and set bias value, and based on this value region border is drawn then traffic goes according to these drawn by you borders
* Latency - redirect traffic to the region that provides the lowest latency.
* Multivalue answer - simple routing policy + healthcheck. You can set up to 8 instances, and if first become unavailable traffic goes to random one out of other 7
* Weighted - 90% of traffic to one ec2, 10 to second

Hosted zone - route53 concept of domain. For each of your domain you have 1 hosted zone where you can have records. There are 2 types of it:
* public - available through the internet
* private - available inside vpc
Records set - subdomains of your hosted zone. You can easily route any record set to any aws services (s3/elb/cloudFront)

You can create route53 health check for dns failover (you can also choose String matching and not just ensure that response is 200 http status, but check actual content of response)
Apex domain - second level domain (example.com). All other like www.example.com, test.example.com - are third level domains
Alias record - way route53 allows you to bind domain (both apex and any subdomain) to dns record of s3/elb/cloudfront/beanstack/api_gateway/vpc_endpoint (by default you should add IP address, but IP associated with these services can be changed due to scaling up/down)
Alias is not the same as CNAME record. Internally route53 will substitute alias with appropriate IP address for A record. Of course you can take dns name of (let's say elb) and create CNAME record for this dns, and it would work the same way as alias for A record.
But alias is better cause it gives IP. Alias automatically changes IP address in case it was changed in aws (suppose you have alias for elb dns, and elb ip has been changed => aws would change dns A record and propagate it to all dns servers)

A record with Alias for elb `dig elb.aumingo.com`
```
;; ANSWER SECTION:
elb.aumingo.com.	60	IN	A	52.202.13.14
elb.aumingo.com.	60	IN	A	34.194.253.144
```

CNAME record with custom dns for elb `dig elb2.aumingo.com`
```
;; ANSWER SECTION:
elb2.aumingo.com.	300	IN	CNAME	elb.aumingo.com.
elb.aumingo.com.	59	IN	A	52.202.13.14
elb.aumingo.com.	59	IN	A	34.194.253.144
```

CNAME record with elb dns `dig elb3.aumingo.com`
```
;; ANSWER SECTION:
elb3.aumingo.com.	300	IN	CNAME	elb-alb-1qtyacrlf2pd7-248530498.us-east-1.elb.amazonaws.com.
elb-alb-1qtyacrlf2pd7-248530498.us-east-1.elb.amazonaws.com. 59	IN A 34.194.253.144
elb-alb-1qtyacrlf2pd7-248530498.us-east-1.elb.amazonaws.com. 59	IN A 52.202.13.14
```


DNS record types
* A - you should assign IPv4 address (blog.example.com A 3.50.51.52)
* AAAA - maps subdomain to IPv6
* CNAME - you can assign another subdomain (blog.example.com CNAME test.my.com)
Classic example when you support both apex & www domain
An A record for example.com pointing to the server IP address
A CNAME record for www.example.com pointing to example.com (but not other way around, cause you can't add CNAME record to apex domain)
* MX (Mail eXchange) - tells email delivery agents where they should deliver your email
* TXT - some text
* SO - singular Start of Authority record kept at the top level of the domain
* NS - list of dns servers associated with name
* SPF (Sender Policy Framework) - used by mail servers to combat spam.
This record tells a mail server what IP addresses are authorized to send an email from your domain name
* PTR (pointer record) - reverse of A record, used in reverse DNS lookups (when you type IP address and want to get dns name)

You can't assign CNAME to apex domain - the reason is simple. We can have a chain of subdomains all with CNAME records
```
test.example.com => test1.example.com
test1.example.com => test2.example.com
test2.example.com => test3.example.com
...
```
But sooner or later it should end with some apex domain. And since apex domain can't be CNAME we would get desired IP address.
So if you could assign CNAME to apex domain that would meant that CNAME could be endless.
SOA and NS records are mandatory to be present at the root domain
FQDN (Fully Qualified Domain Name) - complete name of domain ending with dot - indicating the root, like `aws.amazon.com.`.
Name Server - translates dns into IP address using Zone Files (text file that contains mappings between dns name and IP address). They are distributed all across the world.

Steps of DNS resolution (when you type dns name in browser)
* check host file `/etc/hosts`
* check local dns cache
* contact dns server to resolve IP
There are 13 RS (Root Servers) registered by ICANN. When RS receive request it redirects it to TLD (top level domain, like .com, .edu..) Server.
TLD Server will find IP address of second level domain, but if you are using third or more level domain it will contact Domain Level Name Server to get IP address of third or more level domain.

###### RDS
RDS (Relational Database Service) - aws managed service, that make it easy install/operate relational database in the cloud.
* you can easily scale compute resources or storage associated with your db
* it's easy to update db software
* it simplifies replication

if you want to import data you have to
* dump data to you local machine
* copy dump to some ec2 in same vpc
* pump data into rds from ec2

There are 2 ways to backup
* automatic backup - snapshots takes by RDS daily, retained for limited period (by default 7 days)
* db snapshot - taken by user
You can recover snapshot on the moment taken or by point-in-time (cause rds keeps db change logs)

multi-AZ (failover) - HA:
* primary - you main db that performs read/write
* standby - replica db that has most recent updates from primary. You can't use it for reads, the only purpose is failover - when primary fails, your standby becomes primary, so you won't even notice failure. Replication is synchronous.
Since Aurora stores data across 3 AZ, if master is failed, it would automatically recreated in another AZ, so for aurora you don't need to set up stand-by replica.

Read replica (replica db only for reading) - horizontal scaling:
Use it if you want to write to master and read from replica. Read Replica implemented using db (mysql or other) native asynchronous replication, that's why lag can occur, comparing with multi-AZ replication
where writes are concurrent. Ycd prou can also modify read replica to execute DDL (Data Definition Language) SQL queries. You can promote read replica to become master database.

Enhanced monitoring - allows you to view all metrics with 1 sec granularity

RDS Proxy - database proxy that helps
* pooling & sharing db connections (useful for serverless, when you constantly open and close connections``)
* reduce db failover time for 66%
* enforce IAM access to db

When you reboot you can option to restart rds in new AZ

DB Subnet group - a list of VPC subnets (you should have at least 2 subnets in 2 different AZ) where rds would create your db.
DB Parameter Group - a list of db config values that can be applied to 1 or many rds instances

Get current database `SELECT DATABASE() FROM DUAL;`

You can enable encryption when you create db, but once created you can't enable it. So if you create unencrypted db and want to turn on encryption you have to take snapshot encrypt it and create new encrypted db from it, then remove old db.

IAM db auth - you can add db user and use iam user to authenticate to your db. You still have your initial username/password and can you them to access db, but you can also use temporary tokens generated by `aws rds generate-db-auth-token` command
to get token and to access your db using this token (token would be valid for 15 min).

On-premise to rds data migration:
* copy dump to s3 and from s3 import into rds (you can also use ec2, but create new ec2 for this purpose in to wise, yet this would work: copy dump to ec2 within same vpc as rds, go to ec2, connect from there to rds, and pump data into rds)
* use DMS for more complex scenario

###### SQS
SQS (Simple Queue Service) - managed service that provide asynchronous decoupling and publisher/subscriber (queue) model. There are 2 types
* standard - ordering is not guaranteed, no limit to number of messages (you should implement custom protection against duplicates)
* FIFO (first in, first out) - ordering is guaranteed, limit - 300 messages per second
But you can also use standard queue (unordered) but place order field into each message, and by this you imitate order.
It guarantee at-least-once delivery. you can use Amazon SQS Java Messaging Library that implements the JMS 1.1 specification and uses Amazon SQS as the JMS provider.
Dead letter queue - a special queue that receives messages from other queue after some unsuccessful attempt to process it. Used to isolate messages that can't be processed for later analysis.
You can get time-in-queue (time how long message has been in queue) by subtracting SentTimestamp attribute from current time.
In anonymous access SenderId - IP address of sender (otherwise accountId).
If queue is empty
* short polling (default) - returns immediately with no results. Only possible way if single thread poll multiple queues, in this case long polling for one empty queue would block other queues, but it generally bad design.
* long polling - wait till message got into queue, or polling timeout (by default 20 sec) expires (save SQS cost, cause reduce number of empty receives). It's better to always use this type of polling.
Message retention can be configured from 1 min to 14 days (by default - 4 days).
Visibility Timeout (0 sec - 12 hours, default - 30 sec) - once you app consume a message it becomes invisible to others. But until your app notify queue that it processed it message not deleted. So this timeout - is how long queue can wait.

You can get twice same message if
* received message is not deleted during `VisibilityTimeout` (time during which you should handle message and delete it from queue)
default timeout is 60 sec, you can [read more](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html#changing-message-visibility-timeout)
* `DeleteMessage` operation doesn't delete it on all nodes (since sqs is distributed system it may happen that one node was unavailable for short time and didn't get delete message, then it will deliver message again) - very rare
You can solve double-delivery problem by making processing request idempotent (no matter how many times it called you always return same result).
Generally idempotency solve a lot of problem in distributed systems.

SQS is not replace for message broker like Rabbit/Kafka cause it doesn't support a lot of functionality that message brokers support like routing or message priorities.
So it's incorrect to compare sqs to kafka, just like compare DynamoDB to MySQL.

DLQ (dead-letter queue) - queue with messages that failed to processed after n retries (otherwise some messages would retry forever, but you can specify param, so after 10 retry message goes to this queue, and not tried to retry again).

Each message has 3 unique attributes
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


###### API Gateway
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
Api Gateway calls are supported by CloudFront, so your api is highly available.


###### Cognito
Cognito - managed user service that add user sing-in/sign-up/management email/phone verification/2FA logic.
* User Pool - a directory with users' profiles, you can set up password strength, kind of IdP (Identity Provider)
You can migrate your users into cognito, but password won't be migrated. If you want to migrate them with password you need to add special logic to your app:
when user signin to your app - you signin him within cognito, if user doesn't exist in cognito you sign-up him with username/password.
Cognito also support SAML or OpenID Connect, social identity providers (such as Facebook, Twitter, Amazon) and you can also integrate your own identity provider.
* Identity Pool - temporary credentials to access aws services. If your users don't need to access aws resources, you don't need identity pool, user pool would be enough.
You pay for MAU (monthly active users) - user who within a month made some identity operation signIn/singUp/tokenRefresh/passwordChange.
Free tier - 50k MAU per month.


###### CodePipeline(CodeCommit/CodeBuild/CodeDeploy)
CodePipeline - aws ci/cd tool, like jenkins.

###### Storage Gateway
Storage Gateway - hybrid storage that connects on-premises storage with cloud storage. The main idea is that you still use your on-premise storage (so don't lose that investment) and use cloud at the same time.
The basic idea is that you can manage aws cloud storage the same way (by using same protocols) as you are using your on-premise storage.
There are 3 types
* File - store & retrieve files in S3 using NFS(Network File System)/SMB(Server Message Block) (these objects can also be directly accessed from S3). 
You app read/write files using storage gateways as file server, which in turn translate it into S3 read/write requests.
You should have only storage gateway to be able to modify s3, otherwise if you overwrite file added by gateway, you would get unpredictable behavior when gateway try to read it.
*File storage gateway (just like efs but only for s3, but you mount it the same way as efs) use local disk for 2 purposes: 
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

###### EKS
EKS (Elastic Kubernetes Service) - manages service that runs kubernetes cluster (so you don't need to deploy it from scratch).
It provisions/manages Kubernetes control plane and worker nodes for you.


###### Fargate
Fargate is serverless compute engine for containers running in ECS/EKS, it removes the need to provision and manage servers.
You should use it when you don't want to manually provision your EC2 instances. 
If you need greater control over EC2 (for security or customization), it's better to avoid using it, and istread manually provision EC2 instances.


###### ElastiCache
ElastiCache - manages service that runs Memcached/Redis server nodes in cloud. 
It automates common administrative tasks required to operate a distributed in-memory key-value environment.
It consists of
* node - smallest building block - network-attached RAM
* shard (node group) - primary node and zero or more read-replicas
* cluster (replication group) - group of shards
Vertical scaling - you can't scale existing cluster, you should spin up new cluster and redirect traffic there.

Memcached
* cluster consists of up to 20 nodes, keys are distributed across nodes. If one node failed, data is lost. So memcached is best if you have data in db and just need a cache layer, and losing cache is not critical.
* stores objects as blobs, usually you put serialized result of db query
* new cluster (vertical scaling) starts empty
Redis
* cluster consists of up to 15 shards (each shard is 1 primary and up to 5 replica nodes), so totally 15*6 = 90 nodes. So if you need data replication you should use redis. Replication is supported by only redis.
* support persisting in-memory data to disk
* supports blob/list/set/array as data types.
* can also sort/rank data (used for leaderboard)
* new cluster can be initialized from snapshot

Caching strategies
* Lazy loading - populate cache on-demand (first hit - request data from db, all subsequent reads - take directly from cache).
For this to work you should set TTL (time to live) to ensure that you always have last data (so if you ttl - 1 month, data would be stored in cache for 1 month, although they have been updated in underlying db after 2 minutes).
* Write through - whenever update happened you first update cache and then db (or first update dy and then async update of cache)
Downside if cache is not big enough, when new data arrived, LRU (least recently used) data is evicted from cache

Cache is implemented as key-value pair. So if you want to store leaderboard in cache you have to store sha256 of query as key and result of query as string value.
With cluster you distribute load across nodes/shards(in case of redis), it also protection against failure. If you have one node and it failed, your cache is failed, but if you have cluster of 10 nodes, and one node is failed, only 10% of cache is failed.


###### Systems Manager
SM (Systems Manager) - tool that helps you to manage your aws resources and automate some tasks on them:
* when you create ec2 with SM agent role (this will give SM permission to interact with ec2), and later manage your ec2 from SM console (without need to connecting to instance with ssh)
SM include
* document (json/yaml configuration as code) - allows you to set a series of actions to be performed on ec2. You can create your own documents or use provided by default,
including collecting inventory/metrics, installing apps and so on.
* OpsCenter - place where ops team can view/resolve ops issues. It aggregates issues by creating OpsItems. On average OpsCenter reduce mean time resolution by 50%.
* Explorer - interactive dashboard
* Resource Groups - you can divide all your aws resources into groups (by tags) and view/manage resource of particular group
* AppConfig - you can test/deploy configuration into ec2/ecs/lambda
* Inventory - information about software installed on ec2 collected by SM (including: apps, files, network configs, updates an so on...)
* Automation - you can automate most common tasks for a group of aws resources
you can also update/patch your ami
* Run Command - easy way to manage your ec2 instances without ssh/bastion. All actions made here are recorded by CloudTrail, so you can easily trace what happened
* Session Manager - browser cli that allow to interact with ec2 without ssh/bastion/opening inbound ports. 
It improves security, cause it doesn't require you to open inbound ssh port (22) to talk with ec2. You also don't need to operate bastion host.
For this to work you should assign a role to ec2 with policy `AmazonEC2RoleforSSM`. Internally ssh manager just ssh you as `ssm-user` with root privilege.


###### Config
Config - manages service that provides aws resources inventory, config history, change notification.
Config Rule - desired configuration of resource that is evaluated against actual change (and report in case of mismatch).
Conformance Pack - collection of config rules.

CloudTrail - list of all api calls (cli & CF templates in the end are transformed into api calls)
Config - store point-in-time configuration of your aws resources

###### Aurora
Aurora - mysql/postgres compatible (most app that works with mysql/postgres would switch with no problem to aurora) aws database solution. 
Yet some features of mysql/postgres are not supported in aurora (like MyISAM storage engine).
It runs 5x faster than mysql and 3x faster than postgres. And cost 1/10 of similar solution.
It replicates 6  copy of itself in at least 3 AZ (2 copies in each az) - so it's highly available.
Buckups and failover are done automatically. Self-healing storage - blocks are constantly checked and restored.
Aurora serverlsess - cheap version of aurora, pay only for what you use (aurora start up/down, scale up/down automatically base on your load).
You have 2 options to migrate to aurora
* use `mysqldump/pg_dump`, export data from mysql/postgres, and import it into aurora
* use RDS DB Snapshot migration
Min storage is 10GB, incrementing by 10GB up to 64TB.
There are 2 types of replica
* aurora replica - aurora native same-region replica
* mysql replica - cross-region replica based on mysql binlog
Parallel Query - ability to distribute computational load across multiple instances.

###### CloudTrail
CT - service that logs activity of your aws account (who made request, what params were passed, when and so on..). It's useful for compliance, when you need to ensure that only certain rules has ever been applied.
On average event appear in CT after 15 min after api call was made.
There are 3 types of logs
* management events - api calls to modify aws resources (create ec2/s3 and so on...)
* data events - api calls to modify actual data (s3 get/put/delete object + lambda calls)
* insights events - CT use ML (Machine Learning) to determine any anomaly (like spike in some api calls) and notify you.

By default logs stored for 90 days. If you need longer you should create trail. Trail stores data in s3, you have to analyze it yourself (usually using Athena).
All Regions trail - create trail in each region, but stores all record in s3 bucket of your current region.
Trail can log events from one region or from all regions. Log file validation - guaranty that logs were not tampered with. Mare sure your s3 bucket has correct write policy, otherwise CT won't be able to store logs there.
You can deliver CT logs to CloudWatch, in this case CT would deliver logs to s3 & CloudWatch logs.

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
You also got integration with jira out of the box. It's free, you pay for underlying resources (ec2, lambda, s3).
You can use project dashboard to manage releases and see most recent activity. 
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

###### EC2 Auto Scaling
* scale up - remove current instance and create new one with bigger compute/memory capacity
* scale out - add one or more instances
* scale down - remove current instance and create new one with lesser compute/memory capacity
* scale in - remove one or more instances

AS (Auto Scaling) - managed service that can create/delete ec2 instances to ensure that you always have a suitable number of running ec2 according to your load.
So when you need to manage a fleet of ec2 you should use AS, cause it helps you
* scale out - when load increases AS will create new ec2 instances
* scale in - once load is low AS will terminate redundant ec2
* check health - in case some ec2 is unhealthy for any reason, AS will terminate it and create new one

Fleet management - replacing of unhealthy instances
Dynamic scaling - scale up/down number of instances based on some metric (cpu/memory utilization)
Target tracking - you select metric and AS automatically track this metric and scale your fleet

ASG (Auto Scaling group) - a collection of same ec2 managed by AS. if you delete ASG all instances of it's type would be deleted.
You can configure SNS to get notification when your ASG scales out/in or replace unhealthy instance.
LC (launch configuration) - template that ASG uses to launch new instances. One ASG use one LC. You can't modify LC, if you need to change some params you should create new LC and update your ASG.
You can use on-demand or spot instances in LC, in case of spot you should set bid price in LC.
ASG can launch your instances across multiple AZ but only within same region.

lifecycle hooks - you can execute some logic after AS create new instance (useful when you don't have ready to use AMI and need to tune instance after creation).
Unhealthy instance can be determine by 2 healthchecks
* elb healthchek - you should use it if you use elb
* ec2 healthcheck - use it if you don't use elb

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
aws cloudformation create-stack --stack-name=ga --template-body=file://cloudformation/global-accelerator/ap-southeast-1-ec2.yml --profile=awssa --region=ap-southeast-1

# get ec2 id
aws cloudformation describe-stacks --stack-name=ga --query "Stacks[0].Outputs[0].OutputValue" --profile=awssa --region=ap-southeast-1 

# create ec2 and ga in us-east-1 region
aws cloudformation create-stack --stack-name=ga --template-body=file://cloudformation/global-accelerator/us-east-1-ec2-ga.yml --parameters=ParameterKey=SingaporeEc2Id,ParameterValue={instanceId} --profile=awssa
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
With vpn server everything the same, only difference - connecting is hide before some user-friendly program, like [openvpn client](https://openvpn.net/download-open-vpn), but once connected, end user has all
the same access to all internal resources. When you access resources in both cases it looks like you are accessing them from inside vpc, and thus you can add SG rule to allow not all public IP addresses (`0.0.0.0/0`)
but only CIDR addresses of vpn server allocated CIDR block, or from bastion server internal IP.

You can associate only one subnet per AZ

AWS VPN consists of 2 services
* AWS Site-to-Site VPN (has 2 tunnels for redundancy) - connect your on-premises network with vpc
* AWS Client VPN - connect users to aws vpc or on-premises network
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
Then upload them and use `cloudformation/advanced-networking/client-vpn.yml` update params as server/client ACM ID.
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
LDAP (Lightweight Directory Access Protocol) is an application protocol for querying and modifying items in directory service providers like AD.
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
Carrier gateway - provides connection between subnet in watelength zone and telecom carrier (provider). So it provides NAT service from subnet IP range to provider's IP range.

Local Zone - aws solution where aws services are located locally near your end-users providing low latency.
Outpost - aws rack with compute/memory devices that you install on-premises and run it through aws management console.

###### SSO
SSO (Single Sing On) - aws service that allows central access to multiple aws accounts. You can use it as identity store or as connector to your existing identity stores (like microsoft AD).
To work with sso you should create aws organization (sso won't work without organization created). With sso you can access
* multiple aws accounts (using aws organizations)
* SAML-enabled cloud applications (Salesforce/Office365)
* custom-built apps

Cognito is not supported IdP for sso.
You can enable 2FA for SSO users.

sso user permission are set by permission set (kind of managed policy for sso), so based on this decided which action user is allowed to do in aws. 
Just like with iam user your sso user can access both aws management console and aws cli.
If you need access to third-party apps you can add applications to your sso under `application` menu. Just configure app and your user would be able to sign in into it.

###### OpsWorks
OpsWorks - config management service that provides managed instances of Chef/Puppet which help automate servers' configuration/deployment/management.
There are 3 solutions
* OpsWorks Stacks
* OpsWorks for Chef Automate
* OpsWorks for Puppet Enterprise

OpsWorks Stacks - manages apps and servers in aws and on-premises, you model your app as stack containing different layers (elb, rds, ec2).
You run Chef recipes using Chef Solo to automate package installation/deployment/management of your stack.
So it helps you provision/manage your app in aws using Chef solo installed in one of ec2. 
Difference with other platform
* stacks - config management platform (using Chef to automate deployment/management, has less service coverage, just the most basic like vpc/iam/ec2/elb/cloudWatch)
* beanstalk - app management platform (you just upload code and beanstalk configure everything else use it's own CF templates)
* cloudFormation - infra management platform
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
You can transfer data between RDS/S3/EMR/DynamoDB. 
Pipeline - runs activities (common tasks) on data nodes.
Data node - location where pipeline reads data or where it writes data.
Example of DP
* extract log data from on-premise to s3
* launch transient Amazon EMR cluster, load s3 data, transform it and load transformed data to s3
* copy transformed data from s3 to RedShift


### Networking
###### NIC
NIC (Network interface controller) - hardware component to connect computer to network. It implements electronic circuit that operates on both physical & data link layers using either Ethernet/Wi-Fi protocols.
If you NIC is inside network that using hub, than hub sends all packets to all pc connected to the network. But you NIC process only those that are intended for it (NIC check MAC address, and if it corresponds to address of NIC it sends frame further to CPU).
Promiscuous mode - you turn off MAC address check, and all packets that are sent to NIC (regardless of destination MAC address) are forwarded to CPU to process. This mode is turned off by default, can be useful for traffic sniffing.
Traffic sniffing - catch all traffic and analyze it, best tool is [WireShark](https://www.wireshark.org).
You can detect promiscuous mode by sending a ping (ICMP echo request) with the wrong MAC address but the right IP address. In normal mode NIC would drop packet, but in promiscuous - you would get response.

Since most modern networks using switch, and it sends data directly to special pc (compare to hub which just replicate packet to everybody in the network), just turning promiscuous mode won't help much, 
cause switch will route only those packets that are only designated for your NIC, so you can't sniff all network traffic. Hopefully Managed switches provide Port Mirroring (ability to mirror all incoming packets to some specific port, port - is not tcp/udp port but a connection nest inside switch)
If your switch is not managed and you can't turn on port mirroring in the switch you can employ ARP-Spoofing.
ARP is used to by switches to get mac address by ip address. So switch basically sends ARP requests to all connected devices, and if IP address in ARP request match device IP address, device responds with MAC address.
Key here is that switch has no way to verify response. So for all ARP your host can response with it's onw mac address. In this case all packets that switch receives would be transmitted to your host.
But to operate normally your host should retransmit these packets to their respective owners. In this case you basically embed your host between switch and all other devices. So you can sniff all traffic.


###### Hub, Switch, Router
* Hub (концентратор) - device that connects multiple computers in LAN (local area network) and propagate any packet sent from one computer to all other. Today mostly outdated, people use switch instead. Works on the physical layer (Layer 1) of OSI. 
* Bridge (мост) - connect several hubs into single network. Works on OSI layer 2. As hubs, mostly outdated today.
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
* Application/Presentation/Session - PDU
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
;; ANSWER SECTION:
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

routing protocol
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
The idea is that it's easy to process the contents of single large frame instread of many smaller frames.

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

Virtual machine like ec2 is part of physical machine in aws datacenter. It's isolated from other virtual machines by hypervisor or alike software. 
* Host - physical machine where all virtual machines are located
* Guest - virtual machine

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
When [aws support got pressed](https://forums.aws.amazon.com/thread.jspa?threadID=234959) over the issue, the proposed instead of Nat Gateway create custom Nat Instance (ec2 running with nat), and it would cost only 10$.
But this idea to run additional ec2 to have internet access for single lambda upends serverless. Why do you need lambdas in the first place, when you can just put them into ec2 itself?


###### AMI vs Snapshot
AMI is region specific (so to use it from another region you should copy it) and same ami will have different AMI_ID in different regions.
There are 2 types of AMI
* instance-store - copy of the root instance-store volume + metadata in s3
* ebs-boot - ebs snapshot + metadata (architecture, kernel, AMI name, description, block device mappings)
Most ami are of second type (ebs-boot). If you need to launch new ec2 from snapshot, you should first convert snapshot into ami and then just launch ami.

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

Basic commands
```
# get available regions
aws ec2 describe-regions --profile=awssa

# get available AZ
aws ec2 describe-availability-zones --region=us-east-1 --profile=awssa
```

`--query` - use JMESPath - query language for JSON
```
# show imageId of first image
aws ec2 describe-images --query "Images[0].ImageId"

# show state for all images
aws ec2 describe-images --query "Images[*].State"
```

* Create new profile to access aws services from console
```
aws configure --profile awssa
```

* There are 3 env variables that overwrites `~/.aws/config` settings
```
export AWS_ACCESS_KEY_ID=123
export AWS_SECRET_ACCESS_KEY=123
export AWS_DEFAULT_REGION=us-west-2
```
Although default region for `awssa` profile is `us-east-1` (you can check it by `aws configure get region --profile=awssa`), if you set region as env var `AWS_DEFAULT_REGION=us-west-1`, and then run `aws configure list --profile=awssa`
```
      Name                    Value             Type    Location
      ----                    -----             ----    --------
   profile                    awssa           manual    --profile
access_key     ****************2JQS shared-credentials-file    
secret_key     ****************Y+na shared-credentials-file    
    region                us-west-1              env    AWS_DEFAULT_REGION
```
So whenever you run any command with this profile and don't specify region (by setting `--region=us-east-1`), region from env var is used (not from your config setting).
To remove it just unset the variable `unset AWS_DEFAULT_REGION`, and now if you run `aws configure list --profile=awssa` you will see that region is taken from config
```
      Name                    Value             Type    Location
      ----                    -----             ----    --------
   profile                    awssa           manual    --profile
access_key     ****************2JQS shared-credentials-file    
secret_key     ****************Y+na shared-credentials-file    
    region                us-east-1      config-file    ~/.aws/config
```
And you can run commands from console and default region from config file will be used.
You can set or unset aws env vars in `~/.bashrc` file.

* Get account Id
```
# get arn
aws iam get-user --query "User.Arn" --profile=awssa

# get arn + userId
aws sts get-caller-identity --profile=awssa
```

* S3 (create presign url) 
```
aws s3 cp cloudformation/vpc/nested/vpc-bastion.yml s3://my-cloudformation-template-bucket --profile=awssa
aws s3 cp cloudformation/vpc/nested/ec2-bastion.yml s3://my-cloudformation-template-bucket --profile=awssa

# make file public for 30 sec
aws s3 presign s3://my-cloudformation-template-example/data.txt --expires-in 30 --profile=awssa
```

* CloudFormation
```
# create stack
aws cloudformation create-stack --stack-name=mystack --template-body=file://cloudformation/condition.yml --profile=awssa --region=us-east-1
# update stack and pass params
aws cloudformation update-stack --stack-name=mystack --template-body=file://cloudformation/condition.yml --parameters=ParameterKey=Env,ParameterValue=prod --profile=awssa --region=us-east-1
# if you are creating a stack that create iam resouce you should explicitly tell to cloudformation that it's ok to create iam resources
aws cloudformation update-stack --stack-name=logs --template-body=file://cloudformation/ec2-logs.yml --profile=awssa --region=us-east-1 --capabilities=CAPABILITY_IAM
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

