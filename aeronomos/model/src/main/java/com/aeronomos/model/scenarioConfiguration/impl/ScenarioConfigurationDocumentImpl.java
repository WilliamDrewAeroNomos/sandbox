/*
 * An XML document type.
 * Localname: ScenarioConfiguration
 * Namespace: http://model.aeronomos.com/scenario-configuration
 * Java type: com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package com.aeronomos.model.scenarioConfiguration.impl;
/**
 * A document containing one ScenarioConfiguration(@http://model.aeronomos.com/scenario-configuration) element.
 *
 * This is a complex type.
 */
public class ScenarioConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScenarioConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCENARIOCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/scenario-configuration", "ScenarioConfiguration");
    
    
    /**
     * Gets the "ScenarioConfiguration" element
     */
    public com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration getScenarioConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration target = null;
            target = (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration)get_store().find_element_user(SCENARIOCONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ScenarioConfiguration" element
     */
    public void setScenarioConfiguration(com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration scenarioConfiguration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration target = null;
            target = (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration)get_store().find_element_user(SCENARIOCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration)get_store().add_element_user(SCENARIOCONFIGURATION$0);
            }
            target.set(scenarioConfiguration);
        }
    }
    
    /**
     * Appends and returns a new empty "ScenarioConfiguration" element
     */
    public com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration addNewScenarioConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration target = null;
            target = (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration)get_store().add_element_user(SCENARIOCONFIGURATION$0);
            return target;
        }
    }
    /**
     * An XML ScenarioConfiguration(@http://model.aeronomos.com/scenario-configuration).
     *
     * This is a complex type.
     */
    public static class ScenarioConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration
    {
        private static final long serialVersionUID = 1L;
        
        public ScenarioConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UUID$0 = 
            new javax.xml.namespace.QName("http://model.aeronomos.com/scenario-configuration", "uuid");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://model.aeronomos.com/scenario-configuration", "name");
        private static final javax.xml.namespace.QName LOGICALSTARTTIMEMSECS$4 = 
            new javax.xml.namespace.QName("http://model.aeronomos.com/scenario-configuration", "logicalStartTimeMSecs");
        private static final javax.xml.namespace.QName DESCRIPTION$6 = 
            new javax.xml.namespace.QName("http://model.aeronomos.com/scenario-configuration", "description");
        private static final javax.xml.namespace.QName DEFAULTDURATIONWITHINSTARTUPPROTOCOLMSECS$8 = 
            new javax.xml.namespace.QName("http://model.aeronomos.com/scenario-configuration", "defaultDurationWithinStartupProtocolMSecs");
        private static final javax.xml.namespace.QName DURATIONFEDERATIONEXECUTIONMSECS$10 = 
            new javax.xml.namespace.QName("http://model.aeronomos.com/scenario-configuration", "durationFederationExecutionMSecs");
        private static final javax.xml.namespace.QName DURATIONTOWAITFORJOINSIMULATIONRESPONSEMSECS$12 = 
            new javax.xml.namespace.QName("", "durationToWaitForJoinSimulationResponseMSecs");
        private static final javax.xml.namespace.QName DURATIONTOWAITFORREGISTERSUBSCRIPTIONRESPONSEMSECS$14 = 
            new javax.xml.namespace.QName("", "durationToWaitForRegisterSubscriptionResponseMSecs");
        private static final javax.xml.namespace.QName DURATIONTOWAITFORREGISTERTORUNRESPONSEMSECS$16 = 
            new javax.xml.namespace.QName("", "durationToWaitForRegisterToRunResponseMSecs");
        private static final javax.xml.namespace.QName DURATIONTOWAITFORSTARTSIMULATIONDIRECTIVEMSECS$18 = 
            new javax.xml.namespace.QName("", "durationToWaitForStartSimulationDirectiveMSecs");
        private static final javax.xml.namespace.QName DURATIONTOWAITAFTERTERMINATIONMSECS$20 = 
            new javax.xml.namespace.QName("", "durationToWaitAfterTerminationMSecs");
        
        
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
         * Gets the "logicalStartTimeMSecs" element
         */
        public long getLogicalStartTimeMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALSTARTTIMEMSECS$4, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "logicalStartTimeMSecs" element
         */
        public org.apache.xmlbeans.XmlLong xgetLogicalStartTimeMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(LOGICALSTARTTIMEMSECS$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "logicalStartTimeMSecs" element
         */
        public void setLogicalStartTimeMSecs(long logicalStartTimeMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALSTARTTIMEMSECS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGICALSTARTTIMEMSECS$4);
                }
                target.setLongValue(logicalStartTimeMSecs);
            }
        }
        
        /**
         * Sets (as xml) the "logicalStartTimeMSecs" element
         */
        public void xsetLogicalStartTimeMSecs(org.apache.xmlbeans.XmlLong logicalStartTimeMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(LOGICALSTARTTIMEMSECS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(LOGICALSTARTTIMEMSECS$4);
                }
                target.set(logicalStartTimeMSecs);
            }
        }
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$6);
                }
                target.set(description);
            }
        }
        
        /**
         * Gets the "defaultDurationWithinStartupProtocolMSecs" element
         */
        public long getDefaultDurationWithinStartupProtocolMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTDURATIONWITHINSTARTUPPROTOCOLMSECS$8, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "defaultDurationWithinStartupProtocolMSecs" element
         */
        public org.apache.xmlbeans.XmlLong xgetDefaultDurationWithinStartupProtocolMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(DEFAULTDURATIONWITHINSTARTUPPROTOCOLMSECS$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "defaultDurationWithinStartupProtocolMSecs" element
         */
        public void setDefaultDurationWithinStartupProtocolMSecs(long defaultDurationWithinStartupProtocolMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTDURATIONWITHINSTARTUPPROTOCOLMSECS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTDURATIONWITHINSTARTUPPROTOCOLMSECS$8);
                }
                target.setLongValue(defaultDurationWithinStartupProtocolMSecs);
            }
        }
        
        /**
         * Sets (as xml) the "defaultDurationWithinStartupProtocolMSecs" element
         */
        public void xsetDefaultDurationWithinStartupProtocolMSecs(org.apache.xmlbeans.XmlLong defaultDurationWithinStartupProtocolMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(DEFAULTDURATIONWITHINSTARTUPPROTOCOLMSECS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(DEFAULTDURATIONWITHINSTARTUPPROTOCOLMSECS$8);
                }
                target.set(defaultDurationWithinStartupProtocolMSecs);
            }
        }
        
        /**
         * Gets the "durationFederationExecutionMSecs" element
         */
        public long getDurationFederationExecutionMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATIONFEDERATIONEXECUTIONMSECS$10, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "durationFederationExecutionMSecs" element
         */
        public org.apache.xmlbeans.XmlLong xgetDurationFederationExecutionMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(DURATIONFEDERATIONEXECUTIONMSECS$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "durationFederationExecutionMSecs" element
         */
        public void setDurationFederationExecutionMSecs(long durationFederationExecutionMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATIONFEDERATIONEXECUTIONMSECS$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATIONFEDERATIONEXECUTIONMSECS$10);
                }
                target.setLongValue(durationFederationExecutionMSecs);
            }
        }
        
        /**
         * Sets (as xml) the "durationFederationExecutionMSecs" element
         */
        public void xsetDurationFederationExecutionMSecs(org.apache.xmlbeans.XmlLong durationFederationExecutionMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(DURATIONFEDERATIONEXECUTIONMSECS$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(DURATIONFEDERATIONEXECUTIONMSECS$10);
                }
                target.set(durationFederationExecutionMSecs);
            }
        }
        
        /**
         * Gets the "durationToWaitForJoinSimulationResponseMSecs" attribute
         */
        public long getDurationToWaitForJoinSimulationResponseMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATIONTOWAITFORJOINSIMULATIONRESPONSEMSECS$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DURATIONTOWAITFORJOINSIMULATIONRESPONSEMSECS$12);
                }
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "durationToWaitForJoinSimulationResponseMSecs" attribute
         */
        public org.apache.xmlbeans.XmlLong xgetDurationToWaitForJoinSimulationResponseMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(DURATIONTOWAITFORJOINSIMULATIONRESPONSEMSECS$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_default_attribute_value(DURATIONTOWAITFORJOINSIMULATIONRESPONSEMSECS$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "durationToWaitForJoinSimulationResponseMSecs" attribute
         */
        public boolean isSetDurationToWaitForJoinSimulationResponseMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DURATIONTOWAITFORJOINSIMULATIONRESPONSEMSECS$12) != null;
            }
        }
        
        /**
         * Sets the "durationToWaitForJoinSimulationResponseMSecs" attribute
         */
        public void setDurationToWaitForJoinSimulationResponseMSecs(long durationToWaitForJoinSimulationResponseMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATIONTOWAITFORJOINSIMULATIONRESPONSEMSECS$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DURATIONTOWAITFORJOINSIMULATIONRESPONSEMSECS$12);
                }
                target.setLongValue(durationToWaitForJoinSimulationResponseMSecs);
            }
        }
        
        /**
         * Sets (as xml) the "durationToWaitForJoinSimulationResponseMSecs" attribute
         */
        public void xsetDurationToWaitForJoinSimulationResponseMSecs(org.apache.xmlbeans.XmlLong durationToWaitForJoinSimulationResponseMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(DURATIONTOWAITFORJOINSIMULATIONRESPONSEMSECS$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(DURATIONTOWAITFORJOINSIMULATIONRESPONSEMSECS$12);
                }
                target.set(durationToWaitForJoinSimulationResponseMSecs);
            }
        }
        
        /**
         * Unsets the "durationToWaitForJoinSimulationResponseMSecs" attribute
         */
        public void unsetDurationToWaitForJoinSimulationResponseMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DURATIONTOWAITFORJOINSIMULATIONRESPONSEMSECS$12);
            }
        }
        
        /**
         * Gets the "durationToWaitForRegisterSubscriptionResponseMSecs" attribute
         */
        public long getDurationToWaitForRegisterSubscriptionResponseMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATIONTOWAITFORREGISTERSUBSCRIPTIONRESPONSEMSECS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DURATIONTOWAITFORREGISTERSUBSCRIPTIONRESPONSEMSECS$14);
                }
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "durationToWaitForRegisterSubscriptionResponseMSecs" attribute
         */
        public org.apache.xmlbeans.XmlLong xgetDurationToWaitForRegisterSubscriptionResponseMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(DURATIONTOWAITFORREGISTERSUBSCRIPTIONRESPONSEMSECS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_default_attribute_value(DURATIONTOWAITFORREGISTERSUBSCRIPTIONRESPONSEMSECS$14);
                }
                return target;
            }
        }
        
        /**
         * True if has "durationToWaitForRegisterSubscriptionResponseMSecs" attribute
         */
        public boolean isSetDurationToWaitForRegisterSubscriptionResponseMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DURATIONTOWAITFORREGISTERSUBSCRIPTIONRESPONSEMSECS$14) != null;
            }
        }
        
        /**
         * Sets the "durationToWaitForRegisterSubscriptionResponseMSecs" attribute
         */
        public void setDurationToWaitForRegisterSubscriptionResponseMSecs(long durationToWaitForRegisterSubscriptionResponseMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATIONTOWAITFORREGISTERSUBSCRIPTIONRESPONSEMSECS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DURATIONTOWAITFORREGISTERSUBSCRIPTIONRESPONSEMSECS$14);
                }
                target.setLongValue(durationToWaitForRegisterSubscriptionResponseMSecs);
            }
        }
        
        /**
         * Sets (as xml) the "durationToWaitForRegisterSubscriptionResponseMSecs" attribute
         */
        public void xsetDurationToWaitForRegisterSubscriptionResponseMSecs(org.apache.xmlbeans.XmlLong durationToWaitForRegisterSubscriptionResponseMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(DURATIONTOWAITFORREGISTERSUBSCRIPTIONRESPONSEMSECS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(DURATIONTOWAITFORREGISTERSUBSCRIPTIONRESPONSEMSECS$14);
                }
                target.set(durationToWaitForRegisterSubscriptionResponseMSecs);
            }
        }
        
        /**
         * Unsets the "durationToWaitForRegisterSubscriptionResponseMSecs" attribute
         */
        public void unsetDurationToWaitForRegisterSubscriptionResponseMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DURATIONTOWAITFORREGISTERSUBSCRIPTIONRESPONSEMSECS$14);
            }
        }
        
        /**
         * Gets the "durationToWaitForRegisterToRunResponseMSecs" attribute
         */
        public long getDurationToWaitForRegisterToRunResponseMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATIONTOWAITFORREGISTERTORUNRESPONSEMSECS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DURATIONTOWAITFORREGISTERTORUNRESPONSEMSECS$16);
                }
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "durationToWaitForRegisterToRunResponseMSecs" attribute
         */
        public org.apache.xmlbeans.XmlLong xgetDurationToWaitForRegisterToRunResponseMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(DURATIONTOWAITFORREGISTERTORUNRESPONSEMSECS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_default_attribute_value(DURATIONTOWAITFORREGISTERTORUNRESPONSEMSECS$16);
                }
                return target;
            }
        }
        
        /**
         * True if has "durationToWaitForRegisterToRunResponseMSecs" attribute
         */
        public boolean isSetDurationToWaitForRegisterToRunResponseMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DURATIONTOWAITFORREGISTERTORUNRESPONSEMSECS$16) != null;
            }
        }
        
        /**
         * Sets the "durationToWaitForRegisterToRunResponseMSecs" attribute
         */
        public void setDurationToWaitForRegisterToRunResponseMSecs(long durationToWaitForRegisterToRunResponseMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATIONTOWAITFORREGISTERTORUNRESPONSEMSECS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DURATIONTOWAITFORREGISTERTORUNRESPONSEMSECS$16);
                }
                target.setLongValue(durationToWaitForRegisterToRunResponseMSecs);
            }
        }
        
        /**
         * Sets (as xml) the "durationToWaitForRegisterToRunResponseMSecs" attribute
         */
        public void xsetDurationToWaitForRegisterToRunResponseMSecs(org.apache.xmlbeans.XmlLong durationToWaitForRegisterToRunResponseMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(DURATIONTOWAITFORREGISTERTORUNRESPONSEMSECS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(DURATIONTOWAITFORREGISTERTORUNRESPONSEMSECS$16);
                }
                target.set(durationToWaitForRegisterToRunResponseMSecs);
            }
        }
        
        /**
         * Unsets the "durationToWaitForRegisterToRunResponseMSecs" attribute
         */
        public void unsetDurationToWaitForRegisterToRunResponseMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DURATIONTOWAITFORREGISTERTORUNRESPONSEMSECS$16);
            }
        }
        
        /**
         * Gets the "durationToWaitForStartSimulationDirectiveMSecs" attribute
         */
        public long getDurationToWaitForStartSimulationDirectiveMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATIONTOWAITFORSTARTSIMULATIONDIRECTIVEMSECS$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DURATIONTOWAITFORSTARTSIMULATIONDIRECTIVEMSECS$18);
                }
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "durationToWaitForStartSimulationDirectiveMSecs" attribute
         */
        public org.apache.xmlbeans.XmlLong xgetDurationToWaitForStartSimulationDirectiveMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(DURATIONTOWAITFORSTARTSIMULATIONDIRECTIVEMSECS$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_default_attribute_value(DURATIONTOWAITFORSTARTSIMULATIONDIRECTIVEMSECS$18);
                }
                return target;
            }
        }
        
        /**
         * True if has "durationToWaitForStartSimulationDirectiveMSecs" attribute
         */
        public boolean isSetDurationToWaitForStartSimulationDirectiveMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DURATIONTOWAITFORSTARTSIMULATIONDIRECTIVEMSECS$18) != null;
            }
        }
        
        /**
         * Sets the "durationToWaitForStartSimulationDirectiveMSecs" attribute
         */
        public void setDurationToWaitForStartSimulationDirectiveMSecs(long durationToWaitForStartSimulationDirectiveMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATIONTOWAITFORSTARTSIMULATIONDIRECTIVEMSECS$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DURATIONTOWAITFORSTARTSIMULATIONDIRECTIVEMSECS$18);
                }
                target.setLongValue(durationToWaitForStartSimulationDirectiveMSecs);
            }
        }
        
        /**
         * Sets (as xml) the "durationToWaitForStartSimulationDirectiveMSecs" attribute
         */
        public void xsetDurationToWaitForStartSimulationDirectiveMSecs(org.apache.xmlbeans.XmlLong durationToWaitForStartSimulationDirectiveMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(DURATIONTOWAITFORSTARTSIMULATIONDIRECTIVEMSECS$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(DURATIONTOWAITFORSTARTSIMULATIONDIRECTIVEMSECS$18);
                }
                target.set(durationToWaitForStartSimulationDirectiveMSecs);
            }
        }
        
        /**
         * Unsets the "durationToWaitForStartSimulationDirectiveMSecs" attribute
         */
        public void unsetDurationToWaitForStartSimulationDirectiveMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DURATIONTOWAITFORSTARTSIMULATIONDIRECTIVEMSECS$18);
            }
        }
        
        /**
         * Gets the "durationToWaitAfterTerminationMSecs" attribute
         */
        public long getDurationToWaitAfterTerminationMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATIONTOWAITAFTERTERMINATIONMSECS$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DURATIONTOWAITAFTERTERMINATIONMSECS$20);
                }
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "durationToWaitAfterTerminationMSecs" attribute
         */
        public org.apache.xmlbeans.XmlLong xgetDurationToWaitAfterTerminationMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(DURATIONTOWAITAFTERTERMINATIONMSECS$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_default_attribute_value(DURATIONTOWAITAFTERTERMINATIONMSECS$20);
                }
                return target;
            }
        }
        
        /**
         * True if has "durationToWaitAfterTerminationMSecs" attribute
         */
        public boolean isSetDurationToWaitAfterTerminationMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DURATIONTOWAITAFTERTERMINATIONMSECS$20) != null;
            }
        }
        
        /**
         * Sets the "durationToWaitAfterTerminationMSecs" attribute
         */
        public void setDurationToWaitAfterTerminationMSecs(long durationToWaitAfterTerminationMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATIONTOWAITAFTERTERMINATIONMSECS$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DURATIONTOWAITAFTERTERMINATIONMSECS$20);
                }
                target.setLongValue(durationToWaitAfterTerminationMSecs);
            }
        }
        
        /**
         * Sets (as xml) the "durationToWaitAfterTerminationMSecs" attribute
         */
        public void xsetDurationToWaitAfterTerminationMSecs(org.apache.xmlbeans.XmlLong durationToWaitAfterTerminationMSecs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(DURATIONTOWAITAFTERTERMINATIONMSECS$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(DURATIONTOWAITAFTERTERMINATIONMSECS$20);
                }
                target.set(durationToWaitAfterTerminationMSecs);
            }
        }
        
        /**
         * Unsets the "durationToWaitAfterTerminationMSecs" attribute
         */
        public void unsetDurationToWaitAfterTerminationMSecs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DURATIONTOWAITAFTERTERMINATIONMSECS$20);
            }
        }
    }
}
