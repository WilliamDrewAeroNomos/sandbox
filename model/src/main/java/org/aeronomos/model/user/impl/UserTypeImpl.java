/*
 * XML Type:  UserType
 * Namespace: http://model.aeronomos.org/user
 * Java type: org.aeronomos.model.user.UserType
 *
 * Automatically generated - do not modify.
 */
package org.aeronomos.model.user.impl;
/**
 * An XML UserType(@http://model.aeronomos.org/user).
 *
 * This is a complex type.
 */
public class UserTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.aeronomos.model.user.UserType
{
    private static final long serialVersionUID = 1L;
    
    public UserTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UUID$0 = 
        new javax.xml.namespace.QName("http://model.aeronomos.org/user", "uuid");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://model.aeronomos.org/user", "name");
    private static final javax.xml.namespace.QName DATECREATED$4 = 
        new javax.xml.namespace.QName("http://model.aeronomos.org/user", "date-created");
    private static final javax.xml.namespace.QName DATEACTIVATED$6 = 
        new javax.xml.namespace.QName("http://model.aeronomos.org/user", "date-activated");
    private static final javax.xml.namespace.QName ACTIVE$8 = 
        new javax.xml.namespace.QName("http://model.aeronomos.org/user", "active");
    private static final javax.xml.namespace.QName ROLE$10 = 
        new javax.xml.namespace.QName("http://model.aeronomos.org/user", "role");
    private static final javax.xml.namespace.QName DATEDEACTIVATED$12 = 
        new javax.xml.namespace.QName("", "date-deactivated");
    
    
    /**
     * Gets the "uuid" element
     */
    public java.lang.String getUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uuid" element
     */
    public org.aeronomos.model.commonTypes.UUIDType xgetUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.commonTypes.UUIDType target = null;
            target = (org.aeronomos.model.commonTypes.UUIDType)get_store().find_element_user(UUID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "uuid" element
     */
    public void setUuid(java.lang.String uuid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UUID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UUID$0);
            }
            target.setStringValue(uuid);
        }
    }
    
    /**
     * Sets (as xml) the "uuid" element
     */
    public void xsetUuid(org.aeronomos.model.commonTypes.UUIDType uuid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.commonTypes.UUIDType target = null;
            target = (org.aeronomos.model.commonTypes.UUIDType)get_store().find_element_user(UUID$0, 0);
            if (target == null)
            {
                target = (org.aeronomos.model.commonTypes.UUIDType)get_store().add_element_user(UUID$0);
            }
            target.set(uuid);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public org.aeronomos.model.user.NameType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.user.NameType target = null;
            target = (org.aeronomos.model.user.NameType)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.aeronomos.model.user.NameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.user.NameType target = null;
            target = (org.aeronomos.model.user.NameType)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.aeronomos.model.user.NameType)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.aeronomos.model.user.NameType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.user.NameType target = null;
            target = (org.aeronomos.model.user.NameType)get_store().add_element_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "date-created" element
     */
    public java.util.Calendar getDateCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECREATED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "date-created" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATECREATED$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "date-created" element
     */
    public void setDateCreated(java.util.Calendar dateCreated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECREATED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATECREATED$4);
            }
            target.setCalendarValue(dateCreated);
        }
    }
    
    /**
     * Sets (as xml) the "date-created" element
     */
    public void xsetDateCreated(org.apache.xmlbeans.XmlDateTime dateCreated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATECREATED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATECREATED$4);
            }
            target.set(dateCreated);
        }
    }
    
    /**
     * Gets the "date-activated" element
     */
    public java.util.Calendar getDateActivated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEACTIVATED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "date-activated" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateActivated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEACTIVATED$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "date-activated" element
     */
    public void setDateActivated(java.util.Calendar dateActivated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEACTIVATED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEACTIVATED$6);
            }
            target.setCalendarValue(dateActivated);
        }
    }
    
    /**
     * Sets (as xml) the "date-activated" element
     */
    public void xsetDateActivated(org.apache.xmlbeans.XmlDateTime dateActivated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEACTIVATED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATEACTIVATED$6);
            }
            target.set(dateActivated);
        }
    }
    
    /**
     * Gets the "active" element
     */
    public boolean getActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVE$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "active" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "active" element
     */
    public void setActive(boolean active)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVE$8);
            }
            target.setBooleanValue(active);
        }
    }
    
    /**
     * Sets (as xml) the "active" element
     */
    public void xsetActive(org.apache.xmlbeans.XmlBoolean active)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ACTIVE$8);
            }
            target.set(active);
        }
    }
    
    /**
     * Gets array of all "role" elements
     */
    public org.aeronomos.model.user.RoleType[] getRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLE$10, targetList);
            org.aeronomos.model.user.RoleType[] result = new org.aeronomos.model.user.RoleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "role" element
     */
    public org.aeronomos.model.user.RoleType getRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.user.RoleType target = null;
            target = (org.aeronomos.model.user.RoleType)get_store().find_element_user(ROLE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "role" element
     */
    public int sizeOfRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$10);
        }
    }
    
    /**
     * Sets array of all "role" element
     */
    public void setRoleArray(org.aeronomos.model.user.RoleType[] roleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roleArray, ROLE$10);
        }
    }
    
    /**
     * Sets ith "role" element
     */
    public void setRoleArray(int i, org.aeronomos.model.user.RoleType role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.user.RoleType target = null;
            target = (org.aeronomos.model.user.RoleType)get_store().find_element_user(ROLE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(role);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role" element
     */
    public org.aeronomos.model.user.RoleType insertNewRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.user.RoleType target = null;
            target = (org.aeronomos.model.user.RoleType)get_store().insert_element_user(ROLE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    public org.aeronomos.model.user.RoleType addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.aeronomos.model.user.RoleType target = null;
            target = (org.aeronomos.model.user.RoleType)get_store().add_element_user(ROLE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "role" element
     */
    public void removeRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$10, i);
        }
    }
    
    /**
     * Gets the "date-deactivated" attribute
     */
    public java.util.Calendar getDateDeactivated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEDEACTIVATED$12);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "date-deactivated" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateDeactivated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEDEACTIVATED$12);
            return target;
        }
    }
    
    /**
     * True if has "date-deactivated" attribute
     */
    public boolean isSetDateDeactivated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATEDEACTIVATED$12) != null;
        }
    }
    
    /**
     * Sets the "date-deactivated" attribute
     */
    public void setDateDeactivated(java.util.Calendar dateDeactivated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEDEACTIVATED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEDEACTIVATED$12);
            }
            target.setCalendarValue(dateDeactivated);
        }
    }
    
    /**
     * Sets (as xml) the "date-deactivated" attribute
     */
    public void xsetDateDeactivated(org.apache.xmlbeans.XmlDateTime dateDeactivated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEDEACTIVATED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEDEACTIVATED$12);
            }
            target.set(dateDeactivated);
        }
    }
    
    /**
     * Unsets the "date-deactivated" attribute
     */
    public void unsetDateDeactivated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATEDEACTIVATED$12);
        }
    }
}
