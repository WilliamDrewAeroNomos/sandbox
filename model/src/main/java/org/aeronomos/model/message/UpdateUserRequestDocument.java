/*
 * An XML document type.
 * Localname: UpdateUserRequest
 * Namespace: http://model.aeronomos.org/message
 * Java type: org.aeronomos.model.message.UpdateUserRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.aeronomos.model.message;


/**
 * A document containing one UpdateUserRequest(@http://model.aeronomos.org/message) element.
 *
 * This is a complex type.
 */
public interface UpdateUserRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateUserRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5F30A05E1E71D0431DA3AB33BAD823E9").resolveHandle("updateuserrequest07c4doctype");
    
    /**
     * Gets the "UpdateUserRequest" element
     */
    org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest getUpdateUserRequest();
    
    /**
     * Sets the "UpdateUserRequest" element
     */
    void setUpdateUserRequest(org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest updateUserRequest);
    
    /**
     * Appends and returns a new empty "UpdateUserRequest" element
     */
    org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest addNewUpdateUserRequest();
    
    /**
     * An XML UpdateUserRequest(@http://model.aeronomos.org/message).
     *
     * This is a complex type.
     */
    public interface UpdateUserRequest extends org.aeronomos.model.commonTypes.MessageType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateUserRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5F30A05E1E71D0431DA3AB33BAD823E9").resolveHandle("updateuserrequestf5ddelemtype");
        
        /**
         * Gets the "User" element
         */
        org.aeronomos.model.user.UserType getUser();
        
        /**
         * Sets the "User" element
         */
        void setUser(org.aeronomos.model.user.UserType user);
        
        /**
         * Appends and returns a new empty "User" element
         */
        org.aeronomos.model.user.UserType addNewUser();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest newInstance() {
              return (org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.aeronomos.model.message.UpdateUserRequestDocument newInstance() {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.aeronomos.model.message.UpdateUserRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.aeronomos.model.message.UpdateUserRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.aeronomos.model.message.UpdateUserRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
