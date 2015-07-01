/*
 * XML Type:  NameType
 * Namespace: http://model.aeronomos.org/user
 * Java type: org.aeronomos.model.user.NameType
 *
 * Automatically generated - do not modify.
 */
package org.aeronomos.model.user.impl;
/**
 * An XML NameType(@http://model.aeronomos.org/user).
 *
 * This is a complex type.
 */
public class NameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.aeronomos.model.user.NameType
{
    private static final long serialVersionUID = 1L;
    
    public NameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIRST$0 = 
        new javax.xml.namespace.QName("http://model.aeronomos.org/user", "first");
    private static final javax.xml.namespace.QName LAST$2 = 
        new javax.xml.namespace.QName("http://model.aeronomos.org/user", "last");
    private static final javax.xml.namespace.QName MIDDLE$4 = 
        new javax.xml.namespace.QName("", "middle");
    
    
    /**
     * Gets the "first" element
     */
    public java.lang.String getFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "first" element
     */
    public org.apache.xmlbeans.XmlString xgetFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "first" element
     */
    public void setFirst(java.lang.String first)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRST$0);
            }
            target.setStringValue(first);
        }
    }
    
    /**
     * Sets (as xml) the "first" element
     */
    public void xsetFirst(org.apache.xmlbeans.XmlString first)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRST$0);
            }
            target.set(first);
        }
    }
    
    /**
     * Gets the "last" element
     */
    public java.lang.String getLast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "last" element
     */
    public org.apache.xmlbeans.XmlString xgetLast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAST$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "last" element
     */
    public void setLast(java.lang.String last)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST$2);
            }
            target.setStringValue(last);
        }
    }
    
    /**
     * Sets (as xml) the "last" element
     */
    public void xsetLast(org.apache.xmlbeans.XmlString last)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LAST$2);
            }
            target.set(last);
        }
    }
    
    /**
     * Gets the "middle" attribute
     */
    public java.lang.String getMiddle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIDDLE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "middle" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMiddle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIDDLE$4);
            return target;
        }
    }
    
    /**
     * True if has "middle" attribute
     */
    public boolean isSetMiddle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MIDDLE$4) != null;
        }
    }
    
    /**
     * Sets the "middle" attribute
     */
    public void setMiddle(java.lang.String middle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIDDLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIDDLE$4);
            }
            target.setStringValue(middle);
        }
    }
    
    /**
     * Sets (as xml) the "middle" attribute
     */
    public void xsetMiddle(org.apache.xmlbeans.XmlString middle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIDDLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MIDDLE$4);
            }
            target.set(middle);
        }
    }
    
    /**
     * Unsets the "middle" attribute
     */
    public void unsetMiddle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MIDDLE$4);
        }
    }
}
