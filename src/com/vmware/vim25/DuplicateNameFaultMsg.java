
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DuplicateNameFault", targetNamespace = "urn:vim25")
public class DuplicateNameFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DuplicateName faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public DuplicateNameFaultMsg(String message, DuplicateName faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public DuplicateNameFaultMsg(String message, DuplicateName faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.DuplicateName
     */
    public DuplicateName getFaultInfo() {
        return faultInfo;
    }

}
