/*
 * An XML document type.
 * Localname: ListSimulationDefinintionsRequest
 * Namespace: http://model.aeronomos.com/message
 * Java type: com.aeronomos.model.message.ListSimulationDefinintionsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.aeronomos.model.message.impl;
/**
 * A document containing one ListSimulationDefinintionsRequest(@http://model.aeronomos.com/message) element.
 *
 * This is a complex type.
 */
public class ListSimulationDefinintionsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.aeronomos.model.message.ListSimulationDefinintionsRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListSimulationDefinintionsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTSIMULATIONDEFININTIONSREQUEST$0 = 
        new javax.xml.namespace.QName("http://model.aeronomos.com/message", "ListSimulationDefinintionsRequest");
    
    
    /**
     * Gets the "ListSimulationDefinintionsRequest" element
     */
    public com.aeronomos.model.message.ListSimulationDefinintionsRequestDocument.ListSimulationDefinintionsRequest getListSimulationDefinintionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.message.ListSimulationDefinintionsRequestDocument.ListSimulationDefinintionsRequest target = null;
            target = (com.aeronomos.model.message.ListSimulationDefinintionsRequestDocument.ListSimulationDefinintionsRequest)get_store().find_element_user(LISTSIMULATIONDEFININTIONSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListSimulationDefinintionsRequest" element
     */
    public void setListSimulationDefinintionsRequest(com.aeronomos.model.message.ListSimulationDefinintionsRequestDocument.ListSimulationDefinintionsRequest listSimulationDefinintionsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.message.ListSimulationDefinintionsRequestDocument.ListSimulationDefinintionsRequest target = null;
            target = (com.aeronomos.model.message.ListSimulationDefinintionsRequestDocument.ListSimulationDefinintionsRequest)get_store().find_element_user(LISTSIMULATIONDEFININTIONSREQUEST$0, 0);
            if (target == null)
            {
                target = (com.aeronomos.model.message.ListSimulationDefinintionsRequestDocument.ListSimulationDefinintionsRequest)get_store().add_element_user(LISTSIMULATIONDEFININTIONSREQUEST$0);
            }
            target.set(listSimulationDefinintionsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ListSimulationDefinintionsRequest" element
     */
    public com.aeronomos.model.message.ListSimulationDefinintionsRequestDocument.ListSimulationDefinintionsRequest addNewListSimulationDefinintionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.aeronomos.model.message.ListSimulationDefinintionsRequestDocument.ListSimulationDefinintionsRequest target = null;
            target = (com.aeronomos.model.message.ListSimulationDefinintionsRequestDocument.ListSimulationDefinintionsRequest)get_store().add_element_user(LISTSIMULATIONDEFININTIONSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ListSimulationDefinintionsRequest(@http://model.aeronomos.com/message).
     *
     * This is a complex type.
     */
    public static class ListSimulationDefinintionsRequestImpl extends com.aeronomos.model.commonTypes.impl.MessageTypeImpl implements com.aeronomos.model.message.ListSimulationDefinintionsRequestDocument.ListSimulationDefinintionsRequest
    {
        private static final long serialVersionUID = 1L;
        
        public ListSimulationDefinintionsRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
