
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementSpecPlacementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlacementSpecPlacementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="create"/>
 *     &lt;enumeration value="reconfigure"/>
 *     &lt;enumeration value="relocate"/>
 *     &lt;enumeration value="clone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlacementSpecPlacementType")
@XmlEnum
public enum PlacementSpecPlacementType {

    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("reconfigure")
    RECONFIGURE("reconfigure"),
    @XmlEnumValue("relocate")
    RELOCATE("relocate"),
    @XmlEnumValue("clone")
    CLONE("clone");
    private final String value;

    PlacementSpecPlacementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacementSpecPlacementType fromValue(String v) {
        for (PlacementSpecPlacementType c: PlacementSpecPlacementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
