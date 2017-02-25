
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidIpmiLoginInfoFault", targetNamespace = "urn:vim25")
public class InvalidIpmiLoginInfoFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidIpmiLoginInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidIpmiLoginInfoFaultMsg(String message, InvalidIpmiLoginInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidIpmiLoginInfoFaultMsg(String message, InvalidIpmiLoginInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.InvalidIpmiLoginInfo
     */
    public InvalidIpmiLoginInfo getFaultInfo() {
        return faultInfo;
    }

}