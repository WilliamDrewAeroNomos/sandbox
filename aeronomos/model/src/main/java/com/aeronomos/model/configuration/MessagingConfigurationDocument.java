/*
 * An XML document type.
 * Localname: messaging-configuration
 * Namespace: http://model.aeronomos.com/configuration
 * Java type: com.aeronomos.model.configuration.MessagingConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package com.aeronomos.model.configuration;


/**
 * A document containing one messaging-configuration(@http://model.aeronomos.com/configuration) element.
 *
 * This is a complex type.
 */
public interface MessagingConfigurationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessagingConfigurationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EAB18816739F4DB4078139F958F9369").resolveHandle("messagingconfiguration81fedoctype");
    
    /**
     * Gets the "messaging-configuration" element
     */
    com.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration getMessagingConfiguration();
    
    /**
     * Sets the "messaging-configuration" element
     */
    void setMessagingConfiguration(com.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration messagingConfiguration);
    
    /**
     * Appends and returns a new empty "messaging-configuration" element
     */
    com.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration addNewMessagingConfiguration();
    
    /**
     * An XML messaging-configuration(@http://model.aeronomos.com/configuration).
     *
     * This is a complex type.
     */
    public interface MessagingConfiguration extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessagingConfiguration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EAB18816739F4DB4078139F958F9369").resolveHandle("messagingconfigurationad05elemtype");
        
        /**
         * Gets the "messaging-port" element
         */
        int getMessagingPort();
        
        /**
         * Gets (as xml) the "messaging-port" element
         */
        org.apache.xmlbeans.XmlInt xgetMessagingPort();
        
        /**
         * Sets the "messaging-port" element
         */
        void setMessagingPort(int messagingPort);
        
        /**
         * Sets (as xml) the "messaging-port" element
         */
        void xsetMessagingPort(org.apache.xmlbeans.XmlInt messagingPort);
        
        /**
         * Gets the "messaging-transport" element
         */
        java.lang.String getMessagingTransport();
        
        /**
         * Gets (as xml) the "messaging-transport" element
         */
        org.apache.xmlbeans.XmlString xgetMessagingTransport();
        
        /**
         * Sets the "messaging-transport" element
         */
        void setMessagingTransport(java.lang.String messagingTransport);
        
        /**
         * Sets (as xml) the "messaging-transport" element
         */
        void xsetMessagingTransport(org.apache.xmlbeans.XmlString messagingTransport);
        
        /**
         * Gets the "messaging-host" element
         */
        java.lang.String getMessagingHost();
        
        /**
         * Gets (as xml) the "messaging-host" element
         */
        org.apache.xmlbeans.XmlString xgetMessagingHost();
        
        /**
         * Sets the "messaging-host" element
         */
        void setMessagingHost(java.lang.String messagingHost);
        
        /**
         * Sets (as xml) the "messaging-host" element
         */
        void xsetMessagingHost(org.apache.xmlbeans.XmlString messagingHost);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration newInstance() {
              return (com.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument newInstance() {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.aeronomos.model.configuration.MessagingConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.aeronomos.model.configuration.MessagingConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
