
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "PatchInstallFailedFault", targetNamespace = "urn:vim25")
public class PatchInstallFailedFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private PatchInstallFailed faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public PatchInstallFailedFaultMsg(String message, PatchInstallFailed faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public PatchInstallFailedFaultMsg(String message, PatchInstallFailed faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.PatchInstallFailed
     */
    public PatchInstallFailed getFaultInfo() {
        return faultInfo;
    }

}
