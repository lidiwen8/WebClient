package example;

import com.webservice.HelloWorldServiceLocator;
import com.webservice.HelloWorld_PortType;

import java.rmi.activation.Activator;

public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
          HelloWorld_PortType helloWorld_portType = locator.getHelloWorld();
          String message = helloWorld_portType.sayHelloWorldFrom("client1");
          System.out.println(message);
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }  
  }
}
