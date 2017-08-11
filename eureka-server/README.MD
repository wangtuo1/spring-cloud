#spring-cloud/eureka-server
#author:wangtuo

设置eureka-server集群
启动指令:
  java -jar eureka-server.jar --spring.profiles.active=peer1
  java -jar eureka-server.jar --spring.profiles.active=peer2
  java -jar eureka-server.jar --spring.profiles.active=peer3
