Exceptionhandling In CDI
==========================================================================
Author: Herbert Koeglsperger  
Level: Intermediate  
Technologies: CDI, JAX-RS  
Summary: Demonstrates Exceptionhandling in CDI with REST as UI
Target Product: WildFly  

What is it?
-----------
Just a basic demonstration of exception-Handling in CDI environment

System requirements
-------------------

I tried it out with Wildfly 10 ;-)


Start the WildFly Server
-------------------------

1. Open a command prompt and navigate to the root of the WildFly directory.
2. The following shows the command line to start the server:

        For Linux:   WILDFLY_HOME/bin/standalone.sh
        For Windows: WILDFLY_HOME\bin\standalone.bat

 
Build and Deploy the Quickstart
-------------------------

mvn clean install wildfly:deploy



Run the Quickstart
-------------------------------------

 -> MyApplicationException will be catched in SomeWorker.java
 curl -X GET "http://localhost:8080/exceptionhandling/rest/1" -H "accept: application/json"

 -> MyRuntimeException will be not catched in SomeWorker.java
curl -X GET "http://localhost:8080/exceptionhandling/rest/123456" -H "accept: application/json"

 -> MyException will be catched in in SomeWorker.java
curl -X GET "http://localhost:8080/exceptionhandling/rest/123o" -H "accept: application/json"


Debug the Application
------------------------------------

Use remote debugging .

