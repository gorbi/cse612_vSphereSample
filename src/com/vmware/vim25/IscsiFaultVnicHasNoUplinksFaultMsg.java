
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "IscsiFaultVnicHasNoUplinksFault", targetNamespace = "urn:vim25")
public class IscsiFaultVnicHasNoUplinksFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private IscsiFaultVnicHasNoUplinks faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public IscsiFaultVnicHasNoUplinksFaultMsg(String message, IscsiFaultVnicHasNoUplinks faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public IscsiFaultVnicHasNoUplinksFaultMsg(String message, IscsiFaultVnicHasNoUplinks faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.IscsiFaultVnicHasNoUplinks
     */
    public IscsiFaultVnicHasNoUplinks getFaultInfo() {
        return faultInfo;
    }

}
