/*
 * An XML document type.
 * Localname: messaging-configuration
 * Namespace: http://model.aeronomos.org/configuration
 * Java type: org.aeronomos.model.configuration.MessagingConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package org.aeronomos.model.configuration.impl;
/**
 * A document containing one messaging-configuration(@http://model.aeronomos.org/configuration) element.
 *
 * This is a complex type.
 */
public class MessagingConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.aeronomos.model.configuration.MessagingConfigurationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessagingConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGINGCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://model.aeronomos.org/configuration", "messaging-configuration");
    
    
    /**
     * Gets the "messaging-configuration" element
     */
    public org.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration getMessagingConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration target = null;
            target = (org.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration)get_store().find_element_user(MESSAGINGCONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "messaging-configuration" element
     */
    public void setMessagingConfiguration(org.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration messagingConfiguration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration target = null;
            target = (org.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration)get_store().find_element_user(MESSAGINGCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (org.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration)get_store().add_element_user(MESSAGINGCONFIGURATION$0);
            }
            target.set(messagingConfiguration);
        }
    }
    
    /**
     * Appends and returns a new empty "messaging-configuration" element
     */
    public org.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration addNewMessagingConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration target = null;
            target = (org.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration)get_store().add_element_user(MESSAGINGCONFIGURATION$0);
            return target;
        }
    }
    /**
     * An XML messaging-configuration(@http://model.aeronomos.org/configuration).
     *
     * This is a complex type.
     */
    public static class MessagingConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration
    {
        private static final long serialVersionUID = 1L;
        
        public MessagingConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGINGPORT$0 = 
            new javax.xml.namespace.QName("http://model.aeronomos.org/configuration", "messaging-port");
        private static final javax.xml.namespace.QName MESSAGINGTRANSPORT$2 = 
            new javax.xml.namespace.QName("http://model.aeronomos.org/configuration", "messaging-transport");
        private static final javax.xml.namespace.QName MESSAGINGHOST$4 = 
            new javax.xml.namespace.QName("http://model.aeronomos.org/configuration", "messaging-host");
        
        
        /**
         * Gets the "messaging-port" element
         */
        public int getMessagingPort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGINGPORT$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "messaging-port" element
         */
        public org.apache.xmlbeans.XmlInt xgetMessagingPort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MESSAGINGPORT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "messaging-port" element
         */
        public void setMessagingPort(int messagingPort)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGINGPORT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGINGPORT$0);
                }
                target.setIntValue(messagingPort);
            }
        }
        
        /**
         * Sets (as xml) the "messaging-port" element
         */
        public void xsetMessagingPort(org.apache.xmlbeans.XmlInt messagingPort)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MESSAGINGPORT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MESSAGINGPORT$0);
                }
                target.set(messagingPort);
            }
        }
        
        /**
         * Gets the "messaging-transport" element
         */
        public java.lang.String getMessagingTransport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGINGTRANSPORT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "messaging-transport" element
         */
        public org.apache.xmlbeans.XmlString xgetMessagingTransport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGINGTRANSPORT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "messaging-transport" element
         */
        public void setMessagingTransport(java.lang.String messagingTransport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGINGTRANSPORT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGINGTRANSPORT$2);
                }
                target.setStringValue(messagingTransport);
            }
        }
        
        /**
         * Sets (as xml) the "messaging-transport" element
         */
        public void xsetMessagingTransport(org.apache.xmlbeans.XmlString messagingTransport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGINGTRANSPORT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGINGTRANSPORT$2);
                }
                target.set(messagingTransport);
            }
        }
        
        /**
         * Gets the "messaging-host" element
         */
        public java.lang.String getMessagingHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGINGHOST$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "messaging-host" element
         */
        public org.apache.xmlbeans.XmlString xgetMessagingHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGINGHOST$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "messaging-host" element
         */
        public void setMessagingHost(java.lang.String messagingHost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGINGHOST$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGINGHOST$4);
                }
                target.setStringValue(messagingHost);
            }
        }
        
        /**
         * Sets (as xml) the "messaging-host" element
         */
        public void xsetMessagingHost(org.apache.xmlbeans.XmlString messagingHost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGINGHOST$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGINGHOST$4);
                }
                target.set(messagingHost);
            }
        }
    }
}
