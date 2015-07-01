/*
 * An XML document type.
 * Localname: UpdateUserRequest
 * Namespace: http://model.aeronomos.com/message
 * Java type: com.aeronomos.model.message.UpdateUserRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.aeronomos.model.message;


/**
 * A document containing one UpdateUserRequest(@http://model.aeronomos.com/message) element.
 *
 * This is a complex type.
 */
public interface UpdateUserRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateUserRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EAB18816739F4DB4078139F958F9369").resolveHandle("updateuserrequested61doctype");
    
    /**
     * Gets the "UpdateUserRequest" element
     */
    com.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest getUpdateUserRequest();
    
    /**
     * Sets the "UpdateUserRequest" element
     */
    void setUpdateUserRequest(com.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest updateUserRequest);
    
    /**
     * Appends and returns a new empty "UpdateUserRequest" element
     */
    com.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest addNewUpdateUserRequest();
    
    /**
     * An XML UpdateUserRequest(@http://model.aeronomos.com/message).
     *
     * This is a complex type.
     */
    public interface UpdateUserRequest extends com.aeronomos.model.commonTypes.MessageType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateUserRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EAB18816739F4DB4078139F958F9369").resolveHandle("updateuserrequestdb7aelemtype");
        
        /**
         * Gets the "User" element
         */
        com.aeronomos.model.user.UserType getUser();
        
        /**
         * Sets the "User" element
         */
        void setUser(com.aeronomos.model.user.UserType user);
        
        /**
         * Appends and returns a new empty "User" element
         */
        com.aeronomos.model.user.UserType addNewUser();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest newInstance() {
              return (com.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.aeronomos.model.message.UpdateUserRequestDocument newInstance() {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.aeronomos.model.message.UpdateUserRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.aeronomos.model.message.UpdateUserRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
