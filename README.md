# springcloud2.01
springcloud2.0 + feigen+zuul+eurake+zipkin一整套代码，并且已经实际跑通。


一，rabbitmq的安装
  1，先安装erlang
   >> wget http://erlang.org/download/otp_src_21.0.tar.gz
   >>  tar  -zxvf  *.tar.gz
   >>  yum -y install make gcc gcc-c++ kernel-devel m4 ncurses-devel openssl-devel unixODBC-deve
  
    >>./configure --prefix=/usr/local/erlang --with-ssl -enable-threads -enable-smmp-support -enable-kernel-poll --enable-hipe --without-javac
    >> make 和 make install
    >>添加环境 
    
   2，安装rabbitmq 
     下载网址  http://www.rabbitmq.com/download.html
     注意下载与erlang匹配版本  erlang otp_21.0 区配 rabbitmq-server-3.7.8-1.el7.noarch.rpm
     >> rpm -ivh --nodeps rabbitmq-server-3.6.0-1.noarch.rpm
     >>./rabbitmq-server –detached 后台启动
     >> ./rabbitmq-plugins enable rabbitmq_management 启动后台插件
     
     


二，zipkin的安装

1，
   curl -sSL https://zipkin.io/quickstart.sh | bash -s
   java -jar zipkin.jar --zipkin.collector.rabbitmq.addresses=xxxxx --zipkin.collector.rabbitmq.password=rabbitmq --zipkin.collector.rabbitmq.username=rabbit
   
2， 源码编译安装
  2.1 get the latest source
      git clone https://github.com/openzipkin/zipkin
      cd zipkin
  
  2.2  build the server and also make its dependencies
     ./mvnw -DskipTests --also-make -pl zipkin-server clean install
  2.3 run the zipkin
     java -jar ./zipkin-server/target/zipkin-server-*exec.jar 
  
  配合rabbit启动参数如下
nohup java -jar ./zipkin-server/target/zipkin-server-2.11.13-SNAPSHOT-exec.jar -Xmx128M -Xms128M  --zipkin.collector.rabbitmq.addresses=14.17.81.102 --zipkin.collector.rabbitmq.username=rabbit --zipkin.collector.rabbitmq.password=rabbitmq  >zipkin.log 2>&1 &

其他参数
 http://file.xuahua.com/images/zipkin.png
  



