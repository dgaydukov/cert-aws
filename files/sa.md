# Solutions Architect Tips

### Content
1. [AWS Basics](#aws-basics)
* 1.1 [Free Tier](#free-tier)
* 1.2 [Region and AZ](#region-and-az)
* 1.3 [AWS Well-Architected Framework](#aws-well-architected-framework)
* 1.4 [What is DevOps](#what-is-devops)
2. [Services](#services)
* 2.1 [Amazon Corretto](#amazon-corretto)
* 2.2 [AWS CloudFormation](#aws-cloudformation)
* 2.3 [AWS IAM](#aws-iam)
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

###### Free Tier 
To pass cert and more generally to understand how it works you should get some hands-on experience. But aws can be costly at times, so aws provide so called [free tier](https://aws.amazon.com/free) to play and see how it works.
Basically there are a few options:
* always free - services that always would be free
* 12 month sign-up free - services for free for the first 12 month since sing-up
* random proposals - some random limited features that can be available at some time

So to start I would suggest to create aws account (it's free) and play with free tier. You can use almost 90% of what you need in free tier.



###### Region and AZ 
There are different geographic regions across the globe where aws data centers are located. One region is divided between several AZ (availability zone).
Each regions is completely independent. Each AZ is isolated within a regions, but connected through low-latency links.
AZ is regions + az identifier like `us-east-1a`. AZ consists of one or more discrete data centers.
LZ (local zone) - extension of region closer to your users.


###### AWS Well-Architected Framework 
It describes best practices to deliver app to aws cloud. Based on 5 pillars:
* operational excellence
* security
* reliability
* performance efficiency
* cost optimization


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
I'ts aws solution to IAC. There are 2 concepts
* Template - json/yaml file with desired infrastructure
* Stack - template deployed to cloud (you can run commands like describe/list/create/update stack). If you create/update stack and errors occur all would be rolled back and you would be notified by SNS


###### AWS IAM
* In case you have one user who requires access to a specific resource, as a best practice, you should create a new AWS group for that access (in case new user would appear you would just assign him to this group)
* EC2 role access - you can add (for example bucket write access) role to ec2 instance
* Cross-account access - you can set up access for account B from account A

### Networking

###### Hub, Switch, Router
* Hub (концентратор) - device that connects multiple computers in LAN (local area network) and propagate any packet sent from one computer to all other. Today mostly outdated, people use switch instead. Works on the physical layer (Layer 1) of OSI. 
* Bridge (мост) - connect several hubs into single network. Works on OSI layer 2. As hubs mostly outdated today.
* Switch (коммутатор) - device that connects multiple computers in LAN, but knows exactly where to send packet of data, 
it has internal table where it store which port takes which mac address, and at first it sends ARP to get mac addresses, but once table is full it just send packet to desired node. Works on the data link layer (Layer 2) of OSI.
* Router (маршрутизатор) - small computer that can route the network traffic. Usually used to connect not computers, but networks such as LAN/WAN. Works on (Layer 3).
* L3 Switch (L3 коммутатор) - switch that can route traffic, work fater than router.


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
* Mac address - unique address of every network device, consists of 48 bits (12 symbols), first 24 - set by IEEE, another 24 - by manufacturer (example: 005555.001234).
* ARP (Address Resolution Protocol) - used to discover link layer address (mac-address) associated with given network layer address (ip-address). For for IPv4. You can play with in in linux by `arp --help`.
* NDP (Neighbor Discovery Protocol) - same as ARP, only for IPv6
* NAT (Network Address Translation) - if you have 1 public IP address that's visible to whole world, and also have a private network with lots of computers there, and you want to route specific request to some computer in your network your router will use NAT. 
It will change headers in packet and resend it to particular IP address inside private network.
When you make request from your private ip address 192.168.0.1 to google.com, your router will substitute your ip with it's public ip address. Google will respond to router public ip address and router will got this response, and then will redirect this response back to your machine.
* IP address - divided between public and private (used for local networks) 
Private networks:
10.0.0.0 — 10.255.255.255, subnet mask => 255.0.0.0 (10/8), mostly used in work-related networks.
172.16.0.0 — 172.31.255.255, subnet mask => 255.240.0.0 (172.16/12), mostly not used anywhere.
192.168.0.0 — 192.168.255.255 subnet mask => 255.255.0.0 (192.168/16), mostly used in home-related networks.
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

### Miscellaneous
###### SaaS vs PaaS vs IaaS/IAC 
SaaS (Software as a Service) - if you want to use third-party software like some crm, but don't want to have it staff to install it to every computer in your office you can just use web-service of such crm. In this case crm completely managed by someone else,
you just can access it from web browser without need to run it and support. Usually it refers to end-user applications.

PaaS (Platform as a Service) - in this case you develop you application (writing code) and just deploy your code without worry about infrastructure. For example if you are using spring framework, you can use [cloud foundry](https://cloud.spring.io/spring-cloud-cloudfoundry/reference/html/)
and just deploy your code, and it will provide everything else (container, java, spring framework).


IaaS (Infrastructure as a Service) - good example is aws that provides infrastructure (like container/networking/storage/database) as services to end users. Compare to other 2 PaaS/SaaS users of IaaS responsible for managing infrastructure themselves. 
The best practice is to use IAC (Infrastructure as a code) - is an idea that you should code how you want to build your infrastructure. For example to run you microservice app you need to have 3 containers. 
Of course you can manually create all of them, install all needed software there and deploy it. But you can also add script file that would do it all automatically. Most popular tools is Aws CloudFormation and Terraform.

AWS incompass all 3 of them
SaaS - mail service, ELK (elasticsearch, logstash, kibana) stack
PaaS - beanstalk
IaaS - almost all other services under networking, computing, storage

###### Virtualization and Containerization
Hyperviser is Virtual Machine Monitor (VMM), that runs VM. It works as mediator between virtual OS and hardware. By acting as mediator we can run several virtual OS on one hardware. This is the main advantage, cause one OS can run on one hardware only.
Originally hypervisors developped to give multiple users simultaneous access to computers that performed batch processing. But over time other solutions for many users/single machine problem appeared including time sharing.
So virtualization is a simulation of physical hardware for virtual OS.
Containerization on the other hand is like os-level virtualization. Instead of creating a complete new OS, container share resources with host os, but have it's own file system, and by doing so divide itself from main OS.


###### Docker and Kubernetes
Docker - is a tool to quickly create and manage containers (like create/stop/start/destroy). But if you have many containers and they all should interact with each other you need some system to manage all of this.
Kubernetes - is a tool to manage a group of containers. On container level kuber can use docker or any other container tool.


###### Pure Serverless
With aws serverless you can build complete backend application without writing code(like java) or using any framework (like spring). 
For example you can use `API Gateway` to set up a few api endpoints. Then you can use `aws lambda` to set up some logic to handle these endpoints. Then you can use `sns` to send some notification, and possible send emails.
As you see without writing any application code we can have a simple backend application. But the truth is that this is only good for very simple app, usually for POC (proof of concept).
The reason is once your application become more complex it would be very hard to ensure that everything is working fine, cause you have no tests. 
So the conclusion is very simple. Use aws serverless only for POC, or when you want quickly to startup, then you can also create a lot of mock api so your team can start to interact with it.
But once your system become more complex you will definately need to use some programming like java/spring to have a good software architecture of your product and good test coverage that would ensure that nothing would be broken after changes.









