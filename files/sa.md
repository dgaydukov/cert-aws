# Solutions Architect Tips

### Content
1. [Basics](#basics)
* 1.1 [Aws Free Tier](#aws-free-tier)
2. [Services](#services)
3. [Networking](#networking)
* 3.1 [Hub, Switch, Router](#hub-switch-router)
* 3.2 [Network Topology](#network-topology)
* 3.3 [OSI Network Model](#osi-network-model)
4. [Miscellaneous](#miscellaneous)
* 4.1 [IaaC vs IaaS vs PaaS vs SaaS](#iaac-vs-iaas-vs-paas-vs-saas)
* 4.2 [Virtualization and Containerization](#virtualization-and-containerization)
* 4.3 [Docker and Kubernetes](#docker-and-kubernetes)
* 4.4 [Pure Serverless](#pure-serverless)

### Basics

###### Aws Free Tier 
To pass cert and more generally to understand how it works you should get some hands-on experience. But aws can be costly at times, so aws provide so called [free tier](https://aws.amazon.com/free) to play and see how it works.
Basically there are a few options:
* always free - services that always would be free
* 12 month sign-up free - services for free for the first 12 month since sing-up
* random proposals - some random limited features that can be available at some time

So to start I would suggest to create aws account (it's free) and play with free tier. You can use almost 90% of what you need in free tier.





### Services



### Networking

###### Hub, Switch, Router
* Hub (концентратор) - device that connects multiple computers in LAN (local area network) and propagate any packet sent from one computer to all other. Today mostly outdated, people use switch instead. Works on the physical layer (Layer 1) of OSI.
* Switch (коммутатор) - device that connects multiple computers in LAN, but knows exactly where to send packet of data. Works on the data link layer (Layer 2) of OSI.
* Router (маршрутизатор) - small computer that can route the network traffic. Usually used to connect not computers, but networks such as LAN/WAN. Works on (Layer 3).


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
    * Twisted pair (copper) - data transferred by means of electrical signals
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


### Miscellaneous
###### SaaS vs PaaS vs IaaS/IAC 
SaaS (Software as a Service) - if you want to use third-party software like some crm, but don't want to have it staff to install it to every computer in your office you can just use web-service of such crm. In this case crm completely managed by someone else,
you just can access it from web browser without need to run it and support.

PaaS (Platform as a Service) - in this case you develop you application (writing code) and just deploy your code without worry about infrastructure. For example if you are using spring framework, you can use [cloud foundry](https://cloud.spring.io/spring-cloud-cloudfoundry/reference/html/)
and just deploy your code, and it will provide everything else (container, java, spring framework).


IaaS (Infrastructure as a Service) - good example is aws that provides infrastructure (like container/networking/storage/database) as services to end users. Compare to other 2 PaaS/SaaS users of IaaS responsible for managing infrastructure themselves. 
The best practice is to use IAC (Infrastructure as a code) - is an idea that you should code how you want to build your infrastructure. For example to run you microservice app you need to have 3 containers. 
Of course you can manually create all of them, install all needed software there and deploy it. But you can also add script file that would do it all automatically. Most popular tools is Aws CloudFormation and Terraform.

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









