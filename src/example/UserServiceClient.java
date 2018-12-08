package example;

import com.webservice.userservice.User;
import com.webservice.userservice.UserServiceImplServiceLocator;
import com.webservice.userservice.UserServiceImpl_PortType;

public class UserServiceClient {
    public static void main(String[] argv) {
        try {
            UserServiceImplServiceLocator locator = new UserServiceImplServiceLocator();
            UserServiceImpl_PortType img_portType = locator.getUserServiceImpl();
            User user=img_portType.queryUser("李弟文");
            System.out.println(user.getNumber());
            System.out.println(user.getSex());
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
