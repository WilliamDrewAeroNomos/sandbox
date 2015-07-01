/*
 * XML Type:  SimulationExecutionHandleType
 * Namespace: http://model.aeronomos.org/common-types
 * Java type: org.aeronomos.model.commonTypes.SimulationExecutionHandleType
 *
 * Automatically generated - do not modify.
 */
package org.aeronomos.model.commonTypes;


/**
 * An XML SimulationExecutionHandleType(@http://model.aeronomos.org/common-types).
 *
 * This is a complex type.
 */
public interface SimulationExecutionHandleType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SimulationExecutionHandleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5F30A05E1E71D0431DA3AB33BAD823E9").resolveHandle("simulationexecutionhandletype7382type");
    
    /**
     * Gets the "uuid" element
     */
    java.lang.String getUuid();
    
    /**
     * Gets (as xml) the "uuid" element
     */
    org.aeronomos.model.commonTypes.UUIDType xgetUuid();
    
    /**
     * Sets the "uuid" element
     */
    void setUuid(java.lang.String uuid);
    
    /**
     * Sets (as xml) the "uuid" element
     */
    void xsetUuid(org.aeronomos.model.commonTypes.UUIDType uuid);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType newInstance() {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.aeronomos.model.commonTypes.SimulationExecutionHandleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.aeronomos.model.commonTypes.SimulationExecutionHandleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
