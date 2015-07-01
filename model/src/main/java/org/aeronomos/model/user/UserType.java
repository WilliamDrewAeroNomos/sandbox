/*
 * XML Type:  UserType
 * Namespace: http://model.aeronomos.org/user
 * Java type: org.aeronomos.model.user.UserType
 *
 * Automatically generated - do not modify.
 */
package org.aeronomos.model.user;


/**
 * An XML UserType(@http://model.aeronomos.org/user).
 *
 * This is a complex type.
 */
public interface UserType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5F30A05E1E71D0431DA3AB33BAD823E9").resolveHandle("usertype681atype");
    
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
     * Gets the "name" element
     */
    org.aeronomos.model.user.NameType getName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.aeronomos.model.user.NameType name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.aeronomos.model.user.NameType addNewName();
    
    /**
     * Gets the "date-created" element
     */
    java.util.Calendar getDateCreated();
    
    /**
     * Gets (as xml) the "date-created" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDateCreated();
    
    /**
     * Sets the "date-created" element
     */
    void setDateCreated(java.util.Calendar dateCreated);
    
    /**
     * Sets (as xml) the "date-created" element
     */
    void xsetDateCreated(org.apache.xmlbeans.XmlDateTime dateCreated);
    
    /**
     * Gets the "date-activated" element
     */
    java.util.Calendar getDateActivated();
    
    /**
     * Gets (as xml) the "date-activated" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDateActivated();
    
    /**
     * Sets the "date-activated" element
     */
    void setDateActivated(java.util.Calendar dateActivated);
    
    /**
     * Sets (as xml) the "date-activated" element
     */
    void xsetDateActivated(org.apache.xmlbeans.XmlDateTime dateActivated);
    
    /**
     * Gets the "active" element
     */
    boolean getActive();
    
    /**
     * Gets (as xml) the "active" element
     */
    org.apache.xmlbeans.XmlBoolean xgetActive();
    
    /**
     * Sets the "active" element
     */
    void setActive(boolean active);
    
    /**
     * Sets (as xml) the "active" element
     */
    void xsetActive(org.apache.xmlbeans.XmlBoolean active);
    
    /**
     * Gets array of all "role" elements
     */
    org.aeronomos.model.user.RoleType[] getRoleArray();
    
    /**
     * Gets ith "role" element
     */
    org.aeronomos.model.user.RoleType getRoleArray(int i);
    
    /**
     * Returns number of "role" element
     */
    int sizeOfRoleArray();
    
    /**
     * Sets array of all "role" element
     */
    void setRoleArray(org.aeronomos.model.user.RoleType[] roleArray);
    
    /**
     * Sets ith "role" element
     */
    void setRoleArray(int i, org.aeronomos.model.user.RoleType role);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role" element
     */
    org.aeronomos.model.user.RoleType insertNewRole(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    org.aeronomos.model.user.RoleType addNewRole();
    
    /**
     * Removes the ith "role" element
     */
    void removeRole(int i);
    
    /**
     * Gets the "date-deactivated" attribute
     */
    java.util.Calendar getDateDeactivated();
    
    /**
     * Gets (as xml) the "date-deactivated" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetDateDeactivated();
    
    /**
     * True if has "date-deactivated" attribute
     */
    boolean isSetDateDeactivated();
    
    /**
     * Sets the "date-deactivated" attribute
     */
    void setDateDeactivated(java.util.Calendar dateDeactivated);
    
    /**
     * Sets (as xml) the "date-deactivated" attribute
     */
    void xsetDateDeactivated(org.apache.xmlbeans.XmlDateTime dateDeactivated);
    
    /**
     * Unsets the "date-deactivated" attribute
     */
    void unsetDateDeactivated();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.aeronomos.model.user.UserType newInstance() {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.aeronomos.model.user.UserType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.aeronomos.model.user.UserType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.aeronomos.model.user.UserType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.aeronomos.model.user.UserType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.aeronomos.model.user.UserType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.aeronomos.model.user.UserType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.aeronomos.model.user.UserType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.aeronomos.model.user.UserType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.aeronomos.model.user.UserType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.aeronomos.model.user.UserType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.aeronomos.model.user.UserType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.aeronomos.model.user.UserType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.aeronomos.model.user.UserType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.aeronomos.model.user.UserType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.aeronomos.model.user.UserType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.aeronomos.model.user.UserType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.aeronomos.model.user.UserType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.aeronomos.model.user.UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
