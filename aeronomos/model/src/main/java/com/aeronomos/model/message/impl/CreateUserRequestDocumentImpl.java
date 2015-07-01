/*
 * An XML document type.
 * Localname: CreateUserRequest
 * Namespace: http://model.aeronomos.com/message
 * Java type: com.aeronomos.model.message.CreateUserRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.aeronomos.model.message.impl;
/**
 * A document containing one CreateUserRequest(@http://model.aeronomos.com/message) element.
 *
 * This is a complex type.
 */
public class CreateUserRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.aeronomos.model.message.CreateUserRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateUserRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEUSERREQUEST$0 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/message", "CreateUserRequest");
    
    
    /**
     * Gets the "CreateUserRequest" element
     */
    public com.aeronomos.model.message.CreateUserRequestDocument.CreateUserRequest getCreateUserRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.message.CreateUserRequestDocument.CreateUserRequest target = null;
            target = (com.aeronomos.model.message.CreateUserRequestDocument.CreateUserRequest)get_store().find_element_user(CREATEUSERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateUserRequest" element
     */
    public void setCreateUserRequest(com.aeronomos.model.message.CreateUserRequestDocument.CreateUserRequest createUserRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.message.CreateUserRequestDocument.CreateUserRequest target = null;
            target = (com.aeronomos.model.message.CreateUserRequestDocument.CreateUserRequest)get_store().find_element_user(CREATEUSERREQUEST$0, 0);
            if (target == null)
            {
                target = (com.aeronomos.model.message.CreateUserRequestDocument.CreateUserRequest)get_store().add_element_user(CREATEUSERREQUEST$0);
            }
            target.set(createUserRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateUserRequest" element
     */
    public com.aeronomos.model.message.CreateUserRequestDocument.CreateUserRequest addNewCreateUserRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.message.CreateUserRequestDocument.CreateUserRequest target = null;
            target = (com.aeronomos.model.message.CreateUserRequestDocument.CreateUserRequest)get_store().add_element_user(CREATEUSERREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateUserRequest(@http://model.aeronomos.com/message).
     *
     * This is a complex type.
     */
    public static class CreateUserRequestImpl extends com.aeronomos.model.commonTypes.impl.MessageTypeImpl implements com.aeronomos.model.message.CreateUserRequestDocument.CreateUserRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CreateUserRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
