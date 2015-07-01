/*
 * An XML document type.
 * Localname: heartbeat-configuration
 * Namespace: http://model.aeronomos.com/configuration
 * Java type: com.aeronomos.model.configuration.HeartbeatConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package com.aeronomos.model.configuration;


/**
 * A document containing one heartbeat-configuration(@http://model.aeronomos.com/configuration) element.
 *
 * This is a complex type.
 */
public interface HeartbeatConfigurationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HeartbeatConfigurationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EAB18816739F4DB4078139F958F9369").resolveHandle("heartbeatconfiguration7106doctype");
    
    /**
     * Gets the "heartbeat-configuration" element
     */
    com.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration getHeartbeatConfiguration();
    
    /**
     * Sets the "heartbeat-configuration" element
     */
    void setHeartbeatConfiguration(com.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration heartbeatConfiguration);
    
    /**
     * Appends and returns a new empty "heartbeat-configuration" element
     */
    com.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration addNewHeartbeatConfiguration();
    
    /**
     * An XML heartbeat-configuration(@http://model.aeronomos.com/configuration).
     *
     * This is a complex type.
     */
    public interface HeartbeatConfiguration extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HeartbeatConfiguration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EAB18816739F4DB4078139F958F9369").resolveHandle("heartbeatconfiguration5115elemtype");
        
        /**
         * Gets the "interval-between-beats-msecs" element
         */
        int getIntervalBetweenBeatsMsecs();
        
        /**
         * Gets (as xml) the "interval-between-beats-msecs" element
         */
        org.apache.xmlbeans.XmlInt xgetIntervalBetweenBeatsMsecs();
        
        /**
         * Sets the "interval-between-beats-msecs" element
         */
        void setIntervalBetweenBeatsMsecs(int intervalBetweenBeatsMsecs);
        
        /**
         * Sets (as xml) the "interval-between-beats-msecs" element
         */
        void xsetIntervalBetweenBeatsMsecs(org.apache.xmlbeans.XmlInt intervalBetweenBeatsMsecs);
        
        /**
         * Gets the "generate-heartbeat" element
         */
        boolean getGenerateHeartbeat();
        
        /**
         * Gets (as xml) the "generate-heartbeat" element
         */
        org.apache.xmlbeans.XmlBoolean xgetGenerateHeartbeat();
        
        /**
         * Sets the "generate-heartbeat" element
         */
        void setGenerateHeartbeat(boolean generateHeartbeat);
        
        /**
         * Sets (as xml) the "generate-heartbeat" element
         */
        void xsetGenerateHeartbeat(org.apache.xmlbeans.XmlBoolean generateHeartbeat);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration newInstance() {
              return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument newInstance() {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.aeronomos.model.configuration.HeartbeatConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.aeronomos.model.configuration.HeartbeatConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
