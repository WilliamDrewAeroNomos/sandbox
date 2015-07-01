/*
 * XML Type:  MessageType
 * Namespace: http://model.aeronomos.com/common-types
 * Java type: com.aeronomos.model.commonTypes.MessageType
 *
 * Automatically generated - do not modify.
 */
package com.aeronomos.model.commonTypes.impl;
/**
 * An XML MessageType(@http://model.aeronomos.com/common-types).
 *
 * This is a complex type.
 */
public class MessageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.aeronomos.model.commonTypes.MessageType
{
    private static final long serialVersionUID = 1L;
    
    public MessageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UUID$0 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/common-types", "uuid");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/common-types", "name");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/common-types", "type");
    private static final javax.xml.namespace.QName CREATETIMEMSECS$6 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/common-types", "createTimeMSecs");
    private static final javax.xml.namespace.QName SOURCE$8 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/common-types", "source");
    private static final javax.xml.namespace.QName TIMETOLIVEMSECS$10 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/common-types", "timeToLiveMSecs");
    private static final javax.xml.namespace.QName STATUS$12 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/common-types", "status");
    private static final javax.xml.namespace.QName SUCCESS$14 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/common-types", "success");
    private static final javax.xml.namespace.QName ERRORDESCRIPTION$16 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/common-types", "errorDescription");
    private static final javax.xml.namespace.QName SESSIONHANDLE$18 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/common-types", "sessionHandle");
    private static final javax.xml.namespace.QName SIMULATIONEXECUTIONHANDLE$20 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/common-types", "simulationExecutionHandle");
    
    
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
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$4);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "createTimeMSecs" element
     */
    public java.util.Calendar getCreateTimeMSecs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATETIMEMSECS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "createTimeMSecs" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreateTimeMSecs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATETIMEMSECS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "createTimeMSecs" element
     */
    public void setCreateTimeMSecs(java.util.Calendar createTimeMSecs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATETIMEMSECS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATETIMEMSECS$6);
            }
            target.setCalendarValue(createTimeMSecs);
        }
    }
    
    /**
     * Sets (as xml) the "createTimeMSecs" element
     */
    public void xsetCreateTimeMSecs(org.apache.xmlbeans.XmlDateTime createTimeMSecs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATETIMEMSECS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATETIMEMSECS$6);
            }
            target.set(createTimeMSecs);
        }
    }
    
    /**
     * Gets the "source" element
     */
    public java.lang.String getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" element
     */
    public org.apache.xmlbeans.XmlString xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(java.lang.String source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$8);
            }
            target.setStringValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" element
     */
    public void xsetSource(org.apache.xmlbeans.XmlString source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$8);
            }
            target.set(source);
        }
    }
    
    /**
     * Gets the "timeToLiveMSecs" element
     */
    public java.math.BigInteger getTimeToLiveMSecs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMETOLIVEMSECS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeToLiveMSecs" element
     */
    public org.apache.xmlbeans.XmlInteger xgetTimeToLiveMSecs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TIMETOLIVEMSECS$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "timeToLiveMSecs" element
     */
    public void setTimeToLiveMSecs(java.math.BigInteger timeToLiveMSecs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMETOLIVEMSECS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMETOLIVEMSECS$10);
            }
            target.setBigIntegerValue(timeToLiveMSecs);
        }
    }
    
    /**
     * Sets (as xml) the "timeToLiveMSecs" element
     */
    public void xsetTimeToLiveMSecs(org.apache.xmlbeans.XmlInteger timeToLiveMSecs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TIMETOLIVEMSECS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TIMETOLIVEMSECS$10);
            }
            target.set(timeToLiveMSecs);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$12);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$12);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "success" element
     */
    public boolean getSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUCCESS$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "success" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUCCESS$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "success" element
     */
    public void setSuccess(boolean success)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUCCESS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUCCESS$14);
            }
            target.setBooleanValue(success);
        }
    }
    
    /**
     * Sets (as xml) the "success" element
     */
    public void xsetSuccess(org.apache.xmlbeans.XmlBoolean success)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUCCESS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUCCESS$14);
            }
            target.set(success);
        }
    }
    
    /**
     * Gets the "errorDescription" element
     */
    public java.lang.String getErrorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESCRIPTION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESCRIPTION$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "errorDescription" element
     */
    public void setErrorDescription(java.lang.String errorDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESCRIPTION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORDESCRIPTION$16);
            }
            target.setStringValue(errorDescription);
        }
    }
    
    /**
     * Sets (as xml) the "errorDescription" element
     */
    public void xsetErrorDescription(org.apache.xmlbeans.XmlString errorDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESCRIPTION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORDESCRIPTION$16);
            }
            target.set(errorDescription);
        }
    }
    
    /**
     * Gets the "sessionHandle" element
     */
    public java.lang.String getSessionHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONHANDLE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sessionHandle" element
     */
    public com.aeronomos.model.commonTypes.UUIDType xgetSessionHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.commonTypes.UUIDType target = null;
            target = (com.aeronomos.model.commonTypes.UUIDType)get_store().find_element_user(SESSIONHANDLE$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sessionHandle" element
     */
    public void setSessionHandle(java.lang.String sessionHandle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONHANDLE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SESSIONHANDLE$18);
            }
            target.setStringValue(sessionHandle);
        }
    }
    
    /**
     * Sets (as xml) the "sessionHandle" element
     */
    public void xsetSessionHandle(com.aeronomos.model.commonTypes.UUIDType sessionHandle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.commonTypes.UUIDType target = null;
            target = (com.aeronomos.model.commonTypes.UUIDType)get_store().find_element_user(SESSIONHANDLE$18, 0);
            if (target == null)
            {
                target = (com.aeronomos.model.commonTypes.UUIDType)get_store().add_element_user(SESSIONHANDLE$18);
            }
            target.set(sessionHandle);
        }
    }
    
    /**
     * Gets the "simulationExecutionHandle" element
     */
    public com.aeronomos.model.commonTypes.SimulationExecutionHandleType getSimulationExecutionHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.commonTypes.SimulationExecutionHandleType target = null;
            target = (com.aeronomos.model.commonTypes.SimulationExecutionHandleType)get_store().find_element_user(SIMULATIONEXECUTIONHANDLE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "simulationExecutionHandle" element
     */
    public boolean isNilSimulationExecutionHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.commonTypes.SimulationExecutionHandleType target = null;
            target = (com.aeronomos.model.commonTypes.SimulationExecutionHandleType)get_store().find_element_user(SIMULATIONEXECUTIONHANDLE$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "simulationExecutionHandle" element
     */
    public void setSimulationExecutionHandle(com.aeronomos.model.commonTypes.SimulationExecutionHandleType simulationExecutionHandle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.commonTypes.SimulationExecutionHandleType target = null;
            target = (com.aeronomos.model.commonTypes.SimulationExecutionHandleType)get_store().find_element_user(SIMULATIONEXECUTIONHANDLE$20, 0);
            if (target == null)
            {
                target = (com.aeronomos.model.commonTypes.SimulationExecutionHandleType)get_store().add_element_user(SIMULATIONEXECUTIONHANDLE$20);
            }
            target.set(simulationExecutionHandle);
        }
    }
    
    /**
     * Appends and returns a new empty "simulationExecutionHandle" element
     */
    public com.aeronomos.model.commonTypes.SimulationExecutionHandleType addNewSimulationExecutionHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.commonTypes.SimulationExecutionHandleType target = null;
            target = (com.aeronomos.model.commonTypes.SimulationExecutionHandleType)get_store().add_element_user(SIMULATIONEXECUTIONHANDLE$20);
            return target;
        }
    }
    
    /**
     * Nils the "simulationExecutionHandle" element
     */
    public void setNilSimulationExecutionHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.commonTypes.SimulationExecutionHandleType target = null;
            target = (com.aeronomos.model.commonTypes.SimulationExecutionHandleType)get_store().find_element_user(SIMULATIONEXECUTIONHANDLE$20, 0);
            if (target == null)
            {
                target = (com.aeronomos.model.commonTypes.SimulationExecutionHandleType)get_store().add_element_user(SIMULATIONEXECUTIONHANDLE$20);
            }
            target.setNil();
        }
    }
}
