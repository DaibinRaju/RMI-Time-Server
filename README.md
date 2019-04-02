# RMI-Time-Server
This RMI server returns the current server time on request by a client.

For running this rmi example,  
  
1) compile all the java files  
  
javac *.java  
  
2)create stub and skeleton object by rmic tool  
  
rmic TimerRemote  
  
3)start rmi registry in one command prompt  
  
rmiregistry 5000  
  
4)start the server in another command prompt  
  
java MyServer  
  
5)start the client application in another command prompt  
  
java MyClient  
