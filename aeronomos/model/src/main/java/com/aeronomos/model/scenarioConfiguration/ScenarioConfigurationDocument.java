/*
 * An XML document type.
 * Localname: ScenarioConfiguration
 * Namespace: http://model.aeronomos.com/scenario-configuration
 * Java type: com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package com.aeronomos.model.scenarioConfiguration;


/**
 * A document containing one ScenarioConfiguration(@http://model.aeronomos.com/scenario-configuration) element.
 *
 * This is a complex type.
 */
public interface ScenarioConfigurationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScenarioConfigurationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EAB18816739F4DB4078139F958F9369").resolveHandle("scenarioconfiguration5c2adoctype");
    
    /**
     * Gets the "ScenarioConfiguration" element
     */
    com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration getScenarioConfiguration();
    
    /**
     * Sets the "ScenarioConfiguration" element
     */
    void setScenarioConfiguration(com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration scenarioConfiguration);
    
    /**
     * Appends and returns a new empty "ScenarioConfiguration" element
     */
    com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration addNewScenarioConfiguration();
    
    /**
     * An XML ScenarioConfiguration(@http://model.aeronomos.com/scenario-configuration).
     *
     * This is a complex type.
     */
    public interface ScenarioConfiguration extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScenarioConfiguration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EAB18816739F4DB4078139F958F9369").resolveHandle("scenarioconfiguration0f3celemtype");
        
        /**
         * Gets the "uuid" element
         */
        java.lang.String getUuid();
        
        /**
         * Gets (as xml) the "uuid" element
         */
        com.aeronomos.model.commonTypes.UUIDType xgetUuid();
        
        /**
         * Sets the "uuid" element
         */
        void setUuid(java.lang.String uuid);
        
        /**
         * Sets (as xml) the "uuid" element
         */
        void xsetUuid(com.aeronomos.model.commonTypes.UUIDType uuid);
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "logicalStartTimeMSecs" element
         */
        long getLogicalStartTimeMSecs();
        
        /**
         * Gets (as xml) the "logicalStartTimeMSecs" element
         */
        org.apache.xmlbeans.XmlLong xgetLogicalStartTimeMSecs();
        
        /**
         * Sets the "logicalStartTimeMSecs" element
         */
        void setLogicalStartTimeMSecs(long logicalStartTimeMSecs);
        
        /**
         * Sets (as xml) the "logicalStartTimeMSecs" element
         */
        void xsetLogicalStartTimeMSecs(org.apache.xmlbeans.XmlLong logicalStartTimeMSecs);
        
        /**
         * Gets the "description" element
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" element
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * Sets the "description" element
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" element
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Gets the "defaultDurationWithinStartupProtocolMSecs" element
         */
        long getDefaultDurationWithinStartupProtocolMSecs();
        
        /**
         * Gets (as xml) the "defaultDurationWithinStartupProtocolMSecs" element
         */
        org.apache.xmlbeans.XmlLong xgetDefaultDurationWithinStartupProtocolMSecs();
        
        /**
         * Sets the "defaultDurationWithinStartupProtocolMSecs" element
         */
        void setDefaultDurationWithinStartupProtocolMSecs(long defaultDurationWithinStartupProtocolMSecs);
        
        /**
         * Sets (as xml) the "defaultDurationWithinStartupProtocolMSecs" element
         */
        void xsetDefaultDurationWithinStartupProtocolMSecs(org.apache.xmlbeans.XmlLong defaultDurationWithinStartupProtocolMSecs);
        
        /**
         * Gets the "durationFederationExecutionMSecs" element
         */
        long getDurationFederationExecutionMSecs();
        
        /**
         * Gets (as xml) the "durationFederationExecutionMSecs" element
         */
        org.apache.xmlbeans.XmlLong xgetDurationFederationExecutionMSecs();
        
        /**
         * Sets the "durationFederationExecutionMSecs" element
         */
        void setDurationFederationExecutionMSecs(long durationFederationExecutionMSecs);
        
        /**
         * Sets (as xml) the "durationFederationExecutionMSecs" element
         */
        void xsetDurationFederationExecutionMSecs(org.apache.xmlbeans.XmlLong durationFederationExecutionMSecs);
        
        /**
         * Gets the "durationToWaitForJoinSimulationResponseMSecs" attribute
         */
        long getDurationToWaitForJoinSimulationResponseMSecs();
        
        /**
         * Gets (as xml) the "durationToWaitForJoinSimulationResponseMSecs" attribute
         */
        org.apache.xmlbeans.XmlLong xgetDurationToWaitForJoinSimulationResponseMSecs();
        
        /**
         * True if has "durationToWaitForJoinSimulationResponseMSecs" attribute
         */
        boolean isSetDurationToWaitForJoinSimulationResponseMSecs();
        
        /**
         * Sets the "durationToWaitForJoinSimulationResponseMSecs" attribute
         */
        void setDurationToWaitForJoinSimulationResponseMSecs(long durationToWaitForJoinSimulationResponseMSecs);
        
        /**
         * Sets (as xml) the "durationToWaitForJoinSimulationResponseMSecs" attribute
         */
        void xsetDurationToWaitForJoinSimulationResponseMSecs(org.apache.xmlbeans.XmlLong durationToWaitForJoinSimulationResponseMSecs);
        
        /**
         * Unsets the "durationToWaitForJoinSimulationResponseMSecs" attribute
         */
        void unsetDurationToWaitForJoinSimulationResponseMSecs();
        
        /**
         * Gets the "durationToWaitForRegisterSubscriptionResponseMSecs" attribute
         */
        long getDurationToWaitForRegisterSubscriptionResponseMSecs();
        
        /**
         * Gets (as xml) the "durationToWaitForRegisterSubscriptionResponseMSecs" attribute
         */
        org.apache.xmlbeans.XmlLong xgetDurationToWaitForRegisterSubscriptionResponseMSecs();
        
        /**
         * True if has "durationToWaitForRegisterSubscriptionResponseMSecs" attribute
         */
        boolean isSetDurationToWaitForRegisterSubscriptionResponseMSecs();
        
        /**
         * Sets the "durationToWaitForRegisterSubscriptionResponseMSecs" attribute
         */
        void setDurationToWaitForRegisterSubscriptionResponseMSecs(long durationToWaitForRegisterSubscriptionResponseMSecs);
        
        /**
         * Sets (as xml) the "durationToWaitForRegisterSubscriptionResponseMSecs" attribute
         */
        void xsetDurationToWaitForRegisterSubscriptionResponseMSecs(org.apache.xmlbeans.XmlLong durationToWaitForRegisterSubscriptionResponseMSecs);
        
        /**
         * Unsets the "durationToWaitForRegisterSubscriptionResponseMSecs" attribute
         */
        void unsetDurationToWaitForRegisterSubscriptionResponseMSecs();
        
        /**
         * Gets the "durationToWaitForRegisterToRunResponseMSecs" attribute
         */
        long getDurationToWaitForRegisterToRunResponseMSecs();
        
        /**
         * Gets (as xml) the "durationToWaitForRegisterToRunResponseMSecs" attribute
         */
        org.apache.xmlbeans.XmlLong xgetDurationToWaitForRegisterToRunResponseMSecs();
        
        /**
         * True if has "durationToWaitForRegisterToRunResponseMSecs" attribute
         */
        boolean isSetDurationToWaitForRegisterToRunResponseMSecs();
        
        /**
         * Sets the "durationToWaitForRegisterToRunResponseMSecs" attribute
         */
        void setDurationToWaitForRegisterToRunResponseMSecs(long durationToWaitForRegisterToRunResponseMSecs);
        
        /**
         * Sets (as xml) the "durationToWaitForRegisterToRunResponseMSecs" attribute
         */
        void xsetDurationToWaitForRegisterToRunResponseMSecs(org.apache.xmlbeans.XmlLong durationToWaitForRegisterToRunResponseMSecs);
        
        /**
         * Unsets the "durationToWaitForRegisterToRunResponseMSecs" attribute
         */
        void unsetDurationToWaitForRegisterToRunResponseMSecs();
        
        /**
         * Gets the "durationToWaitForStartSimulationDirectiveMSecs" attribute
         */
        long getDurationToWaitForStartSimulationDirectiveMSecs();
        
        /**
         * Gets (as xml) the "durationToWaitForStartSimulationDirectiveMSecs" attribute
         */
        org.apache.xmlbeans.XmlLong xgetDurationToWaitForStartSimulationDirectiveMSecs();
        
        /**
         * True if has "durationToWaitForStartSimulationDirectiveMSecs" attribute
         */
        boolean isSetDurationToWaitForStartSimulationDirectiveMSecs();
        
        /**
         * Sets the "durationToWaitForStartSimulationDirectiveMSecs" attribute
         */
        void setDurationToWaitForStartSimulationDirectiveMSecs(long durationToWaitForStartSimulationDirectiveMSecs);
        
        /**
         * Sets (as xml) the "durationToWaitForStartSimulationDirectiveMSecs" attribute
         */
        void xsetDurationToWaitForStartSimulationDirectiveMSecs(org.apache.xmlbeans.XmlLong durationToWaitForStartSimulationDirectiveMSecs);
        
        /**
         * Unsets the "durationToWaitForStartSimulationDirectiveMSecs" attribute
         */
        void unsetDurationToWaitForStartSimulationDirectiveMSecs();
        
        /**
         * Gets the "durationToWaitAfterTerminationMSecs" attribute
         */
        long getDurationToWaitAfterTerminationMSecs();
        
        /**
         * Gets (as xml) the "durationToWaitAfterTerminationMSecs" attribute
         */
        org.apache.xmlbeans.XmlLong xgetDurationToWaitAfterTerminationMSecs();
        
        /**
         * True if has "durationToWaitAfterTerminationMSecs" attribute
         */
        boolean isSetDurationToWaitAfterTerminationMSecs();
        
        /**
         * Sets the "durationToWaitAfterTerminationMSecs" attribute
         */
        void setDurationToWaitAfterTerminationMSecs(long durationToWaitAfterTerminationMSecs);
        
        /**
         * Sets (as xml) the "durationToWaitAfterTerminationMSecs" attribute
         */
        void xsetDurationToWaitAfterTerminationMSecs(org.apache.xmlbeans.XmlLong durationToWaitAfterTerminationMSecs);
        
        /**
         * Unsets the "durationToWaitAfterTerminationMSecs" attribute
         */
        void unsetDurationToWaitAfterTerminationMSecs();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration newInstance() {
              return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument.ScenarioConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument newInstance() {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.aeronomos.model.scenarioConfiguration.ScenarioConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
