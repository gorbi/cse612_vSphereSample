
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "IscsiFaultVnicIsLastPathFault", targetNamespace = "urn:vim25")
public class IscsiFaultVnicIsLastPathFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private IscsiFaultVnicIsLastPath faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public IscsiFaultVnicIsLastPathFaultMsg(String message, IscsiFaultVnicIsLastPath faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public IscsiFaultVnicIsLastPathFaultMsg(String message, IscsiFaultVnicIsLastPath faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.IscsiFaultVnicIsLastPath
     */
    public IscsiFaultVnicIsLastPath getFaultInfo() {
        return faultInfo;
    }

}
