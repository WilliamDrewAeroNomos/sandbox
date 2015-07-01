/*
 * An XML document type.
 * Localname: UpdateUserRequest
 * Namespace: http://model.aeronomos.org/message
 * Java type: org.aeronomos.model.message.UpdateUserRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.aeronomos.model.message.impl;
/**
 * A document containing one UpdateUserRequest(@http://model.aeronomos.org/message) element.
 *
 * This is a complex type.
 */
public class UpdateUserRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.aeronomos.model.message.UpdateUserRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateUserRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEUSERREQUEST$0 = 
        new javax.xml.namespace.QName("http://model.aeronomos.org/message", "UpdateUserRequest");
    
    
    /**
     * Gets the "UpdateUserRequest" element
     */
    public org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest getUpdateUserRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest target = null;
            target = (org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest)get_store().find_element_user(UPDATEUSERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateUserRequest" element
     */
    public void setUpdateUserRequest(org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest updateUserRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest target = null;
            target = (org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest)get_store().find_element_user(UPDATEUSERREQUEST$0, 0);
            if (target == null)
            {
                target = (org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest)get_store().add_element_user(UPDATEUSERREQUEST$0);
            }
            target.set(updateUserRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateUserRequest" element
     */
    public org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest addNewUpdateUserRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest target = null;
            target = (org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest)get_store().add_element_user(UPDATEUSERREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UpdateUserRequest(@http://model.aeronomos.org/message).
     *
     * This is a complex type.
     */
    public static class UpdateUserRequestImpl extends org.aeronomos.model.commonTypes.impl.MessageTypeImpl implements org.aeronomos.model.message.UpdateUserRequestDocument.UpdateUserRequest
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateUserRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USER$0 = 
            new javax.xml.namespace.QName("http://model.aeronomos.org/message", "User");
        
        
        /**
         * Gets the "User" element
         */
        public org.aeronomos.model.user.UserType getUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.aeronomos.model.user.UserType target = null;
                target = (org.aeronomos.model.user.UserType)get_store().find_element_user(USER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "User" element
         */
        public void setUser(org.aeronomos.model.user.UserType user)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.aeronomos.model.user.UserType target = null;
                target = (org.aeronomos.model.user.UserType)get_store().find_element_user(USER$0, 0);
                if (target == null)
                {
                    target = (org.aeronomos.model.user.UserType)get_store().add_element_user(USER$0);
                }
                target.set(user);
            }
        }
        
        /**
         * Appends and returns a new empty "User" element
         */
        public org.aeronomos.model.user.UserType addNewUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.aeronomos.model.user.UserType target = null;
                target = (org.aeronomos.model.user.UserType)get_store().add_element_user(USER$0);
                return target;
            }
        }
    }
}
