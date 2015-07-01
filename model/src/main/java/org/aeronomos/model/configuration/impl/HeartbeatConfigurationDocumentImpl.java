/*
 * An XML document type.
 * Localname: heartbeat-configuration
 * Namespace: http://model.aeronomos.org/configuration
 * Java type: org.aeronomos.model.configuration.HeartbeatConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package org.aeronomos.model.configuration.impl;
/**
 * A document containing one heartbeat-configuration(@http://model.aeronomos.org/configuration) element.
 *
 * This is a complex type.
 */
public class HeartbeatConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.aeronomos.model.configuration.HeartbeatConfigurationDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeartbeatConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEARTBEATCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://model.aeronomos.org/configuration", "heartbeat-configuration");
    
    
    /**
     * Gets the "heartbeat-configuration" element
     */
    public org.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration getHeartbeatConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration target = null;
            target = (org.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration)get_store().find_element_user(HEARTBEATCONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "heartbeat-configuration" element
     */
    public void setHeartbeatConfiguration(org.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration heartbeatConfiguration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration target = null;
            target = (org.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration)get_store().find_element_user(HEARTBEATCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (org.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration)get_store().add_element_user(HEARTBEATCONFIGURATION$0);
            }
            target.set(heartbeatConfiguration);
        }
    }
    
    /**
     * Appends and returns a new empty "heartbeat-configuration" element
     */
    public org.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration addNewHeartbeatConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration target = null;
            target = (org.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration)get_store().add_element_user(HEARTBEATCONFIGURATION$0);
            return target;
        }
    }
    /**
     * An XML heartbeat-configuration(@http://model.aeronomos.org/configuration).
     *
     * This is a complex type.
     */
    public static class HeartbeatConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration
    {
        private static final long serialVersionUID = 1L;
        
        public HeartbeatConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTERVALBETWEENBEATSMSECS$0 = 
            new javax.xml.namespace.QName("http://model.aeronomos.org/configuration", "interval-between-beats-msecs");
        private static final javax.xml.namespace.QName GENERATEHEARTBEAT$2 = 
            new javax.xml.namespace.QName("http://model.aeronomos.org/configuration", "generate-heartbeat");
        
        
        /**
         * Gets the "interval-between-beats-msecs" element
         */
        public int getIntervalBetweenBeatsMsecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALBETWEENBEATSMSECS$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "interval-between-beats-msecs" element
         */
        public org.apache.xmlbeans.XmlInt xgetIntervalBetweenBeatsMsecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTERVALBETWEENBEATSMSECS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "interval-between-beats-msecs" element
         */
        public void setIntervalBetweenBeatsMsecs(int intervalBetweenBeatsMsecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALBETWEENBEATSMSECS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERVALBETWEENBEATSMSECS$0);
                }
                target.setIntValue(intervalBetweenBeatsMsecs);
            }
        }
        
        /**
         * Sets (as xml) the "interval-between-beats-msecs" element
         */
        public void xsetIntervalBetweenBeatsMsecs(org.apache.xmlbeans.XmlInt intervalBetweenBeatsMsecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTERVALBETWEENBEATSMSECS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INTERVALBETWEENBEATSMSECS$0);
                }
                target.set(intervalBetweenBeatsMsecs);
            }
        }
        
        /**
         * Gets the "generate-heartbeat" element
         */
        public boolean getGenerateHeartbeat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERATEHEARTBEAT$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "generate-heartbeat" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetGenerateHeartbeat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(GENERATEHEARTBEAT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "generate-heartbeat" element
         */
        public void setGenerateHeartbeat(boolean generateHeartbeat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERATEHEARTBEAT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERATEHEARTBEAT$2);
                }
                target.setBooleanValue(generateHeartbeat);
            }
        }
        
        /**
         * Sets (as xml) the "generate-heartbeat" element
         */
        public void xsetGenerateHeartbeat(org.apache.xmlbeans.XmlBoolean generateHeartbeat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(GENERATEHEARTBEAT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(GENERATEHEARTBEAT$2);
                }
                target.set(generateHeartbeat);
            }
        }
    }
}
