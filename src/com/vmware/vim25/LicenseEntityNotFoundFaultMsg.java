
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "LicenseEntityNotFoundFault", targetNamespace = "urn:vim25")
public class LicenseEntityNotFoundFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private LicenseEntityNotFound faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public LicenseEntityNotFoundFaultMsg(String message, LicenseEntityNotFound faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public LicenseEntityNotFoundFaultMsg(String message, LicenseEntityNotFound faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.LicenseEntityNotFound
     */
    public LicenseEntityNotFound getFaultInfo() {
        return faultInfo;
    }

}
