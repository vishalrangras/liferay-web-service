/**
 * EmailAttachmentSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ihg.me2.model;

public class EmailAttachmentSoap  implements java.io.Serializable {
    private long EMAIL_ATTACHMENT_ID;

    private java.lang.String attachmentFileName;

    private java.lang.Object attachmentFileText;

    private java.util.Calendar createTimestamp;

    private java.lang.String createUserId;

    private long emailReminderId;

    private java.util.Calendar lastUpdateTimestamp;

    private java.lang.String lastUpdateUserId;

    private long primaryKey;

    public EmailAttachmentSoap() {
    }

    public EmailAttachmentSoap(
           long EMAIL_ATTACHMENT_ID,
           java.lang.String attachmentFileName,
           java.lang.Object attachmentFileText,
           java.util.Calendar createTimestamp,
           java.lang.String createUserId,
           long emailReminderId,
           java.util.Calendar lastUpdateTimestamp,
           java.lang.String lastUpdateUserId,
           long primaryKey) {
           this.EMAIL_ATTACHMENT_ID = EMAIL_ATTACHMENT_ID;
           this.attachmentFileName = attachmentFileName;
           this.attachmentFileText = attachmentFileText;
           this.createTimestamp = createTimestamp;
           this.createUserId = createUserId;
           this.emailReminderId = emailReminderId;
           this.lastUpdateTimestamp = lastUpdateTimestamp;
           this.lastUpdateUserId = lastUpdateUserId;
           this.primaryKey = primaryKey;
    }


    /**
     * Gets the EMAIL_ATTACHMENT_ID value for this EmailAttachmentSoap.
     * 
     * @return EMAIL_ATTACHMENT_ID
     */
    public long getEMAIL_ATTACHMENT_ID() {
        return EMAIL_ATTACHMENT_ID;
    }


    /**
     * Sets the EMAIL_ATTACHMENT_ID value for this EmailAttachmentSoap.
     * 
     * @param EMAIL_ATTACHMENT_ID
     */
    public void setEMAIL_ATTACHMENT_ID(long EMAIL_ATTACHMENT_ID) {
        this.EMAIL_ATTACHMENT_ID = EMAIL_ATTACHMENT_ID;
    }


    /**
     * Gets the attachmentFileName value for this EmailAttachmentSoap.
     * 
     * @return attachmentFileName
     */
    public java.lang.String getAttachmentFileName() {
        return attachmentFileName;
    }


    /**
     * Sets the attachmentFileName value for this EmailAttachmentSoap.
     * 
     * @param attachmentFileName
     */
    public void setAttachmentFileName(java.lang.String attachmentFileName) {
        this.attachmentFileName = attachmentFileName;
    }


    /**
     * Gets the attachmentFileText value for this EmailAttachmentSoap.
     * 
     * @return attachmentFileText
     */
    public java.lang.Object getAttachmentFileText() {
        return attachmentFileText;
    }


    /**
     * Sets the attachmentFileText value for this EmailAttachmentSoap.
     * 
     * @param attachmentFileText
     */
    public void setAttachmentFileText(java.lang.Object attachmentFileText) {
        this.attachmentFileText = attachmentFileText;
    }


    /**
     * Gets the createTimestamp value for this EmailAttachmentSoap.
     * 
     * @return createTimestamp
     */
    public java.util.Calendar getCreateTimestamp() {
        return createTimestamp;
    }


    /**
     * Sets the createTimestamp value for this EmailAttachmentSoap.
     * 
     * @param createTimestamp
     */
    public void setCreateTimestamp(java.util.Calendar createTimestamp) {
        this.createTimestamp = createTimestamp;
    }


    /**
     * Gets the createUserId value for this EmailAttachmentSoap.
     * 
     * @return createUserId
     */
    public java.lang.String getCreateUserId() {
        return createUserId;
    }


    /**
     * Sets the createUserId value for this EmailAttachmentSoap.
     * 
     * @param createUserId
     */
    public void setCreateUserId(java.lang.String createUserId) {
        this.createUserId = createUserId;
    }


    /**
     * Gets the emailReminderId value for this EmailAttachmentSoap.
     * 
     * @return emailReminderId
     */
    public long getEmailReminderId() {
        return emailReminderId;
    }


    /**
     * Sets the emailReminderId value for this EmailAttachmentSoap.
     * 
     * @param emailReminderId
     */
    public void setEmailReminderId(long emailReminderId) {
        this.emailReminderId = emailReminderId;
    }


    /**
     * Gets the lastUpdateTimestamp value for this EmailAttachmentSoap.
     * 
     * @return lastUpdateTimestamp
     */
    public java.util.Calendar getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }


    /**
     * Sets the lastUpdateTimestamp value for this EmailAttachmentSoap.
     * 
     * @param lastUpdateTimestamp
     */
    public void setLastUpdateTimestamp(java.util.Calendar lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }


    /**
     * Gets the lastUpdateUserId value for this EmailAttachmentSoap.
     * 
     * @return lastUpdateUserId
     */
    public java.lang.String getLastUpdateUserId() {
        return lastUpdateUserId;
    }


    /**
     * Sets the lastUpdateUserId value for this EmailAttachmentSoap.
     * 
     * @param lastUpdateUserId
     */
    public void setLastUpdateUserId(java.lang.String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }


    /**
     * Gets the primaryKey value for this EmailAttachmentSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this EmailAttachmentSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailAttachmentSoap)) return false;
        EmailAttachmentSoap other = (EmailAttachmentSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.EMAIL_ATTACHMENT_ID == other.getEMAIL_ATTACHMENT_ID() &&
            ((this.attachmentFileName==null && other.getAttachmentFileName()==null) || 
             (this.attachmentFileName!=null &&
              this.attachmentFileName.equals(other.getAttachmentFileName()))) &&
            ((this.attachmentFileText==null && other.getAttachmentFileText()==null) || 
             (this.attachmentFileText!=null &&
              this.attachmentFileText.equals(other.getAttachmentFileText()))) &&
            ((this.createTimestamp==null && other.getCreateTimestamp()==null) || 
             (this.createTimestamp!=null &&
              this.createTimestamp.equals(other.getCreateTimestamp()))) &&
            ((this.createUserId==null && other.getCreateUserId()==null) || 
             (this.createUserId!=null &&
              this.createUserId.equals(other.getCreateUserId()))) &&
            this.emailReminderId == other.getEmailReminderId() &&
            ((this.lastUpdateTimestamp==null && other.getLastUpdateTimestamp()==null) || 
             (this.lastUpdateTimestamp!=null &&
              this.lastUpdateTimestamp.equals(other.getLastUpdateTimestamp()))) &&
            ((this.lastUpdateUserId==null && other.getLastUpdateUserId()==null) || 
             (this.lastUpdateUserId!=null &&
              this.lastUpdateUserId.equals(other.getLastUpdateUserId()))) &&
            this.primaryKey == other.getPrimaryKey();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getEMAIL_ATTACHMENT_ID()).hashCode();
        if (getAttachmentFileName() != null) {
            _hashCode += getAttachmentFileName().hashCode();
        }
        if (getAttachmentFileText() != null) {
            _hashCode += getAttachmentFileText().hashCode();
        }
        if (getCreateTimestamp() != null) {
            _hashCode += getCreateTimestamp().hashCode();
        }
        if (getCreateUserId() != null) {
            _hashCode += getCreateUserId().hashCode();
        }
        _hashCode += new Long(getEmailReminderId()).hashCode();
        if (getLastUpdateTimestamp() != null) {
            _hashCode += getLastUpdateTimestamp().hashCode();
        }
        if (getLastUpdateUserId() != null) {
            _hashCode += getLastUpdateUserId().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailAttachmentSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.me2.ihg.com", "EmailAttachmentSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMAIL_ATTACHMENT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EMAIL_ATTACHMENT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentFileText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentFileText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailReminderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailReminderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdateTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdateUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
