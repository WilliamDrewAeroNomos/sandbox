/*
 * XML Type:  SimulationExecutionHandleType
 * Namespace: http://model.aeronomos.com/common-types
 * Java type: com.aeronomos.model.commonTypes.SimulationExecutionHandleType
 *
 * Automatically generated - do not modify.
 */
package com.aeronomos.model.commonTypes.impl;
/**
 * An XML SimulationExecutionHandleType(@http://model.aeronomos.com/common-types).
 *
 * This is a complex type.
 */
public class SimulationExecutionHandleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.aeronomos.model.commonTypes.SimulationExecutionHandleType
{
    private static final long serialVersionUID = 1L;
    
    public SimulationExecutionHandleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UUID$0 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/common-types", "uuid");
    
    
    /**
     * Gets the "uuid" element
     */
    public java.lang.String getUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uuid" element
     */
    public com.aeronomos.model.commonTypes.UUIDType xgetUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.commonTypes.UUIDType target = null;
            target = (com.aeronomos.model.commonTypes.UUIDType)get_store().find_element_user(UUID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "uuid" element
     */
    public void setUuid(java.lang.String uuid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UUID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UUID$0);
            }
            target.setStringValue(uuid);
        }
    }
    
    /**
     * Sets (as xml) the "uuid" element
     */
    public void xsetUuid(com.aeronomos.model.commonTypes.UUIDType uuid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.commonTypes.UUIDType target = null;
            target = (com.aeronomos.model.commonTypes.UUIDType)get_store().find_element_user(UUID$0, 0);
            if (target == null)
            {
                target = (com.aeronomos.model.commonTypes.UUIDType)get_store().add_element_user(UUID$0);
            }
            target.set(uuid);
        }
    }
}
