FROM centos:7

ENV VERSION 1.2

#RUN sudo yum update \ 
#	sudo dnf install python3 

RUN yum update -y \ 
	yum install -y python3 \
    yum install zip unzip

COPY ./zip_job.py /tmp

CMD hostnamectl \ 
	system("[ ! -e zip_job.py ]; echo $?")