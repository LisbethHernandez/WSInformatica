/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.servicios;

/**
 *
 * @author Lis
 */

import java.net.URL;
import javax.faces.bean.ManagedBean;
import javax.xml.ws.WebServiceRef;
import suma.server.WebServiceSuma_Service;

@ManagedBean(name = "SumaBean")
public class SumaBean {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServerSuma/WebServiceSuma.wsdl")
    private WebServiceSuma_Service service;

    private String a;
    private String b;
    private String c;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void Sumar() {
        try {
            int vlrA = Integer.parseInt(a);
            int vlrB = Integer.parseInt(b);
            
            
            URL url = new URL("http://localhost:8080/ServerSuma/WebServiceSuma" + "?wsdl");
            
            suma.server.WebServiceSuma_Service servicio = new WebServiceSuma_Service(url);
            suma.server.WebServiceSuma wsSumaPort = service.getWebServiceSumaPort();
            int vlrC = wsSumaPort.sumar(vlrA, vlrB);
        
            c = "" + vlrC;

        } catch (Exception e) {
            c = "error en suma " + e.getMessage();
        }

    }
}
