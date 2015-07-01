/*
 * XML Type:  MessageType
 * Namespace: http://model.aeronomos.com/common-types
 * Java type: com.aeronomos.model.commonTypes.MessageType
 *
 * Automatically generated - do not modify.
 */
package com.aeronomos.model.commonTypes;


/**
 * An XML MessageType(@http://model.aeronomos.com/common-types).
 *
 * This is a complex type.
 */
public interface MessageType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EAB18816739F4DB4078139F958F9369").resolveHandle("messagetype0c73type");
    
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
     * Gets the "type" element
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * Sets the "type" element
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Gets the "createTimeMSecs" element
     */
    java.util.Calendar getCreateTimeMSecs();
    
    /**
     * Gets (as xml) the "createTimeMSecs" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreateTimeMSecs();
    
    /**
     * Sets the "createTimeMSecs" element
     */
    void setCreateTimeMSecs(java.util.Calendar createTimeMSecs);
    
    /**
     * Sets (as xml) the "createTimeMSecs" element
     */
    void xsetCreateTimeMSecs(org.apache.xmlbeans.XmlDateTime createTimeMSecs);
    
    /**
     * Gets the "source" element
     */
    java.lang.String getSource();
    
    /**
     * Gets (as xml) the "source" element
     */
    org.apache.xmlbeans.XmlString xgetSource();
    
    /**
     * Sets the "source" element
     */
    void setSource(java.lang.String source);
    
    /**
     * Sets (as xml) the "source" element
     */
    void xsetSource(org.apache.xmlbeans.XmlString source);
    
    /**
     * Gets the "timeToLiveMSecs" element
     */
    java.math.BigInteger getTimeToLiveMSecs();
    
    /**
     * Gets (as xml) the "timeToLiveMSecs" element
     */
    org.apache.xmlbeans.XmlInteger xgetTimeToLiveMSecs();
    
    /**
     * Sets the "timeToLiveMSecs" element
     */
    void setTimeToLiveMSecs(java.math.BigInteger timeToLiveMSecs);
    
    /**
     * Sets (as xml) the "timeToLiveMSecs" element
     */
    void xsetTimeToLiveMSecs(org.apache.xmlbeans.XmlInteger timeToLiveMSecs);
    
    /**
     * Gets the "status" element
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    org.apache.xmlbeans.XmlString xgetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(org.apache.xmlbeans.XmlString status);
    
    /**
     * Gets the "success" element
     */
    boolean getSuccess();
    
    /**
     * Gets (as xml) the "success" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSuccess();
    
    /**
     * Sets the "success" element
     */
    void setSuccess(boolean success);
    
    /**
     * Sets (as xml) the "success" element
     */
    void xsetSuccess(org.apache.xmlbeans.XmlBoolean success);
    
    /**
     * Gets the "errorDescription" element
     */
    java.lang.String getErrorDescription();
    
    /**
     * Gets (as xml) the "errorDescription" element
     */
    org.apache.xmlbeans.XmlString xgetErrorDescription();
    
    /**
     * Sets the "errorDescription" element
     */
    void setErrorDescription(java.lang.String errorDescription);
    
    /**
     * Sets (as xml) the "errorDescription" element
     */
    void xsetErrorDescription(org.apache.xmlbeans.XmlString errorDescription);
    
    /**
     * Gets the "sessionHandle" element
     */
    java.lang.String getSessionHandle();
    
    /**
     * Gets (as xml) the "sessionHandle" element
     */
    com.aeronomos.model.commonTypes.UUIDType xgetSessionHandle();
    
    /**
     * Sets the "sessionHandle" element
     */
    void setSessionHandle(java.lang.String sessionHandle);
    
    /**
     * Sets (as xml) the "sessionHandle" element
     */
    void xsetSessionHandle(com.aeronomos.model.commonTypes.UUIDType sessionHandle);
    
    /**
     * Gets the "simulationExecutionHandle" element
     */
    com.aeronomos.model.commonTypes.SimulationExecutionHandleType getSimulationExecutionHandle();
    
    /**
     * Tests for nil "simulationExecutionHandle" element
     */
    boolean isNilSimulationExecutionHandle();
    
    /**
     * Sets the "simulationExecutionHandle" element
     */
    void setSimulationExecutionHandle(com.aeronomos.model.commonTypes.SimulationExecutionHandleType simulationExecutionHandle);
    
    /**
     * Appends and returns a new empty "simulationExecutionHandle" element
     */
    com.aeronomos.model.commonTypes.SimulationExecutionHandleType addNewSimulationExecutionHandle();
    
    /**
     * Nils the "simulationExecutionHandle" element
     */
    void setNilSimulationExecutionHandle();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.aeronomos.model.commonTypes.MessageType newInstance() {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.aeronomos.model.commonTypes.MessageType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.aeronomos.model.commonTypes.MessageType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.aeronomos.model.commonTypes.MessageType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.aeronomos.model.commonTypes.MessageType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.aeronomos.model.commonTypes.MessageType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.aeronomos.model.commonTypes.MessageType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.aeronomos.model.commonTypes.MessageType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.aeronomos.model.commonTypes.MessageType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.aeronomos.model.commonTypes.MessageType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.aeronomos.model.commonTypes.MessageType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.aeronomos.model.commonTypes.MessageType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.aeronomos.model.commonTypes.MessageType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.aeronomos.model.commonTypes.MessageType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.aeronomos.model.commonTypes.MessageType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.aeronomos.model.commonTypes.MessageType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.aeronomos.model.commonTypes.MessageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.aeronomos.model.commonTypes.MessageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.aeronomos.model.commonTypes.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
