/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Lis
 */
@WebService(serviceName = "WebServiceSuma")
public class WebServiceSuma {

   

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Sumar")
    public Integer Sumar(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        int c;
        c=a+b;
        //TODO write your implementation code here:
        return c;
    }
    
    

}
