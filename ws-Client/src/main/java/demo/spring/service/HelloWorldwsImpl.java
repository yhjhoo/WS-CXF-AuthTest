
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package demo.spring.service;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2015-04-04T14:34:37.110+08:00
 * Generated source version: 2.7.11
 * 
 */

@javax.jws.WebService(
                      serviceName = "HelloWorldwsImplService",
                      portName = "HelloWorldwsImplPort",
                      targetNamespace = "http://service.spring.demo/",
                      wsdlLocation = "file:/home/yhjhoo/workspace_play/testWebservice/src/main/resources/HelloWorld.wsdl",
                      endpointInterface = "demo.spring.service.HelloWorldws")
                      
public class HelloWorldwsImpl implements HelloWorldws {

    private static final Logger LOG = Logger.getLogger(HelloWorldwsImpl.class.getName());

    /* (non-Javadoc)
     * @see demo.spring.service.HelloWorldws#sayHi(java.lang.String  arg0 )*
     */
    public java.lang.String sayHi(java.lang.String arg0) { 
        LOG.info("Executing operation sayHi");
        System.out.println(arg0);
        try {
            java.lang.String _return = "_return1073371556";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see demo.spring.service.HelloWorldws#sayPerson(demo.spring.service.PersonDto  arg0 )*
     */
    public demo.spring.service.PersonDto sayPerson(demo.spring.service.PersonDto arg0) { 
        LOG.info("Executing operation sayPerson");
        System.out.println(arg0);
        try {
            demo.spring.service.PersonDto _return = new demo.spring.service.PersonDto();
            _return.setAge(Integer.valueOf(294299151));
            _return.setName("Name-1912124313");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
