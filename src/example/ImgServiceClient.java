package example;

import com.webservice.imgservice.ImageBean;
import com.webservice.imgservice.ImgServiceImplServiceLocator;
import com.webservice.imgservice.ImgServiceImpl_PortType;

public class ImgServiceClient {
    public static void main(String[] argv) {
        try {
            ImgServiceImplServiceLocator locator = new ImgServiceImplServiceLocator();
//          Activator service = locator.get();
            // If authorization is required
            //((HelloWorldSoapBindingStub)service).setUsername("user3");
            //((HelloWorldSoapBindingStub)service).setPassword("pass3");
            // invoke business method
//          service.businessMethod();

            ImgServiceImpl_PortType img_portType = locator.getImgServiceImpl();
//            img_portType.deleteByid(1);
            ImageBean imageBean=img_portType.findByid(183);
            System.out.println("发布者姓名："+imageBean.getName());
            System.out.println("图片名称："+imageBean.getName());
            System.out.println("图片在数据库存贮的虚拟路径："+imageBean.getSrc());
            System.out.println("发布日期："+imageBean.getDate());
            System.out.println("发布者IP地址："+imageBean.getIp());
            System.out.println("图片大小："+imageBean.getSize()+"k");
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
