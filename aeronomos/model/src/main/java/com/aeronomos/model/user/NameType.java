/*
 * XML Type:  NameType
 * Namespace: http://model.aeronomos.com/user
 * Java type: com.aeronomos.model.user.NameType
 *
 * Automatically generated - do not modify.
 */
package com.aeronomos.model.user;


/**
 * An XML NameType(@http://model.aeronomos.com/user).
 *
 * This is a complex type.
 */
public interface NameType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EAB18816739F4DB4078139F958F9369").resolveHandle("nametypede5dtype");
    
    /**
     * Gets the "first" element
     */
    java.lang.String getFirst();
    
    /**
     * Gets (as xml) the "first" element
     */
    org.apache.xmlbeans.XmlString xgetFirst();
    
    /**
     * Sets the "first" element
     */
    void setFirst(java.lang.String first);
    
    /**
     * Sets (as xml) the "first" element
     */
    void xsetFirst(org.apache.xmlbeans.XmlString first);
    
    /**
     * Gets the "last" element
     */
    java.lang.String getLast();
    
    /**
     * Gets (as xml) the "last" element
     */
    org.apache.xmlbeans.XmlString xgetLast();
    
    /**
     * Sets the "last" element
     */
    void setLast(java.lang.String last);
    
    /**
     * Sets (as xml) the "last" element
     */
    void xsetLast(org.apache.xmlbeans.XmlString last);
    
    /**
     * Gets the "middle" attribute
     */
    java.lang.String getMiddle();
    
    /**
     * Gets (as xml) the "middle" attribute
     */
    org.apache.xmlbeans.XmlString xgetMiddle();
    
    /**
     * True if has "middle" attribute
     */
    boolean isSetMiddle();
    
    /**
     * Sets the "middle" attribute
     */
    void setMiddle(java.lang.String middle);
    
    /**
     * Sets (as xml) the "middle" attribute
     */
    void xsetMiddle(org.apache.xmlbeans.XmlString middle);
    
    /**
     * Unsets the "middle" attribute
     */
    void unsetMiddle();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.aeronomos.model.user.NameType newInstance() {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.aeronomos.model.user.NameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.aeronomos.model.user.NameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.aeronomos.model.user.NameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.aeronomos.model.user.NameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.aeronomos.model.user.NameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.aeronomos.model.user.NameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.aeronomos.model.user.NameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.aeronomos.model.user.NameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.aeronomos.model.user.NameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.aeronomos.model.user.NameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.aeronomos.model.user.NameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.aeronomos.model.user.NameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.aeronomos.model.user.NameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.aeronomos.model.user.NameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.aeronomos.model.user.NameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.aeronomos.model.user.NameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.aeronomos.model.user.NameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.aeronomos.model.user.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
