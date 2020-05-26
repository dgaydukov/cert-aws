# Solutions Architect Tips

### Content
10. [Miscellaneous](#miscellaneous)
* 10.1 [IaaC vs IaaS vs PaaS vs SaaS](#iaac-vs-iaas-vs-paas-vs-saas)
* 10.2 [Docker and Kubernetes](#docker-and-kubernetes)
* 10.3 [Docker and Kubernetes](#docker-and-kubernetes)



### Miscellaneous
###### IaaC vs IaaS vs PaaS vs SaaS
IaaC (Infrastructure as a code) - is an idea that you should code how you want to build your infrastructure. For example to run you microservice app you need to have 3 containers. Of course you can manually create all of them, install all needed software there and deploy it.
But you can also add script file that would do it all automatically. Most popular tools is Aws CloudFormation and Terraform.

IaaS (Infrastructure as a Service) - good example is aws that provides infrastructure (like container/networking/storage/database) as services to end users. Compare to other 2 PaaS/SaaS users of IaaS responsible for managing infrastructure themselves. The best practice is to use IaaC.

PaaS (Platform as a Service) - in this case you develop you application (writing code) and just deploy your code without worry about infrastructure. For example if you are using spring framework, you can use [cloud foundry](https://cloud.spring.io/spring-cloud-cloudfoundry/reference/html/)
and just deploy your code, and it will provide everything else (container, java, spring framework).

SaaS (Software as a Service) - if you want to use third-party software like some crm, but don't want to have it staff to install it to every computer in your office you can just use web-service of such crm. In this case crm completely managed by someone else,
you just can access it from web browser without need to run it and support.


###### Virtualization and Containerization
Hyperviser is Virtual Machine Monitor (VMM), that runs VM. It works as mediator between virtual OS and hardware. By acting as mediator we can run several virtual OS on one hardware. This is the main advantage, cause one OS can run on one hardware only.
Originally hypervisors developped to give multiple users simultaneous access to computers that performed batch processing. But over time other solutions for many users/single machine problem appeared including time sharing.
So virtualization is a simulation of physical hardware for virtual OS.
Containerization on the other hand is like os-level virtualization. Instead of creating a complete new OS, container share resources with host os, but have it's own file system, and by doing so divide itself from main OS.


###### Docker and Kubernetes
Docker - is a tool to quickly create and manage containers (like create/stop/start/destroy). But if you have many containers and they all should interact with each other you need some system to manage all of this.
Kubernetes - is a tool to manage a group of containers. On container level kuber can use docker or any other container tool.