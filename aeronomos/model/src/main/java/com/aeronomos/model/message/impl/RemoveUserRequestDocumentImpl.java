/*
 * An XML document type.
 * Localname: RemoveUserRequest
 * Namespace: http://model.aeronomos.com/message
 * Java type: com.aeronomos.model.message.RemoveUserRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.aeronomos.model.message.impl;
/**
 * A document containing one RemoveUserRequest(@http://model.aeronomos.com/message) element.
 *
 * This is a complex type.
 */
public class RemoveUserRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.aeronomos.model.message.RemoveUserRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RemoveUserRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOVEUSERREQUEST$0 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/message", "RemoveUserRequest");
    
    
    /**
     * Gets the "RemoveUserRequest" element
     */
    public com.aeronomos.model.message.RemoveUserRequestDocument.RemoveUserRequest getRemoveUserRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.message.RemoveUserRequestDocument.RemoveUserRequest target = null;
            target = (com.aeronomos.model.message.RemoveUserRequestDocument.RemoveUserRequest)get_store().find_element_user(REMOVEUSERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RemoveUserRequest" element
     */
    public void setRemoveUserRequest(com.aeronomos.model.message.RemoveUserRequestDocument.RemoveUserRequest removeUserRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.message.RemoveUserRequestDocument.RemoveUserRequest target = null;
            target = (com.aeronomos.model.message.RemoveUserRequestDocument.RemoveUserRequest)get_store().find_element_user(REMOVEUSERREQUEST$0, 0);
            if (target == null)
            {
                target = (com.aeronomos.model.message.RemoveUserRequestDocument.RemoveUserRequest)get_store().add_element_user(REMOVEUSERREQUEST$0);
            }
            target.set(removeUserRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RemoveUserRequest" element
     */
    public com.aeronomos.model.message.RemoveUserRequestDocument.RemoveUserRequest addNewRemoveUserRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.message.RemoveUserRequestDocument.RemoveUserRequest target = null;
            target = (com.aeronomos.model.message.RemoveUserRequestDocument.RemoveUserRequest)get_store().add_element_user(REMOVEUSERREQUEST$0);
            return target;
        }
    }
    /**
     * An XML RemoveUserRequest(@http://model.aeronomos.com/message).
     *
     * This is a complex type.
     */
    public static class RemoveUserRequestImpl extends com.aeronomos.model.commonTypes.impl.MessageTypeImpl implements com.aeronomos.model.message.RemoveUserRequestDocument.RemoveUserRequest
    {
        private static final long serialVersionUID = 1L;
        
        public RemoveUserRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USER$0 = 
            new javax.xml.namespace.QName("http://model.aeronomos.com/message", "User");
        
        
        /**
         * Gets the "User" element
         */
        public com.aeronomos.model.user.UserType getUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.aeronomos.model.user.UserType target = null;
                target = (com.aeronomos.model.user.UserType)get_store().find_element_user(USER$0, 0);
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
        public void setUser(com.aeronomos.model.user.UserType user)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.aeronomos.model.user.UserType target = null;
                target = (com.aeronomos.model.user.UserType)get_store().find_element_user(USER$0, 0);
                if (target == null)
                {
                    target = (com.aeronomos.model.user.UserType)get_store().add_element_user(USER$0);
                }
                target.set(user);
            }
        }
        
        /**
         * Appends and returns a new empty "User" element
         */
        public com.aeronomos.model.user.UserType addNewUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.aeronomos.model.user.UserType target = null;
                target = (com.aeronomos.model.user.UserType)get_store().add_element_user(USER$0);
                return target;
            }
        }
    }
}
