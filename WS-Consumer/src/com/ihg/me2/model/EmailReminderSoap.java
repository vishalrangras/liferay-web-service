/**
 * EmailReminderSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ihg.me2.model;

public class EmailReminderSoap  implements java.io.Serializable {
    private java.util.Calendar createTimestamp;

    private java.lang.String createUserId;

    private java.lang.String emailBodyText;

    private long emailReminderId;

    private java.lang.String emailSubjectText;

    private java.util.Calendar lastUpdateTimestamp;

    private java.lang.String lastUpdateUserId;

    private long primaryKey;

    private int reminderNumber;

    private java.util.Calendar scheduleTimestamp;

    private java.lang.String statusCode;

    private java.lang.String submitterEmailId;

    private java.lang.String submitterName;

    public EmailReminderSoap() {
    }

    public EmailReminderSoap(
           java.util.Calendar createTimestamp,
           java.lang.String createUserId,
           java.lang.String emailBodyText,
           long emailReminderId,
           java.lang.String emailSubjectText,
           java.util.Calendar lastUpdateTimestamp,
           java.lang.String lastUpdateUserId,
           long primaryKey,
           int reminderNumber,
           java.util.Calendar scheduleTimestamp,
           java.lang.String statusCode,
           java.lang.String submitterEmailId,
           java.lang.String submitterName) {
           this.createTimestamp = createTimestamp;
           this.createUserId = createUserId;
           this.emailBodyText = emailBodyText;
           this.emailReminderId = emailReminderId;
           this.emailSubjectText = emailSubjectText;
           this.lastUpdateTimestamp = lastUpdateTimestamp;
           this.lastUpdateUserId = lastUpdateUserId;
           this.primaryKey = primaryKey;
           this.reminderNumber = reminderNumber;
           this.scheduleTimestamp = scheduleTimestamp;
           this.statusCode = statusCode;
           this.submitterEmailId = submitterEmailId;
           this.submitterName = submitterName;
    }


    /**
     * Gets the createTimestamp value for this EmailReminderSoap.
     * 
     * @return createTimestamp
     */
    public java.util.Calendar getCreateTimestamp() {
        return createTimestamp;
    }


    /**
     * Sets the createTimestamp value for this EmailReminderSoap.
     * 
     * @param createTimestamp
     */
    public void setCreateTimestamp(java.util.Calendar createTimestamp) {
        this.createTimestamp = createTimestamp;
    }


    /**
     * Gets the createUserId value for this EmailReminderSoap.
     * 
     * @return createUserId
     */
    public java.lang.String getCreateUserId() {
        return createUserId;
    }


    /**
     * Sets the createUserId value for this EmailReminderSoap.
     * 
     * @param createUserId
     */
    public void setCreateUserId(java.lang.String createUserId) {
        this.createUserId = createUserId;
    }


    /**
     * Gets the emailBodyText value for this EmailReminderSoap.
     * 
     * @return emailBodyText
     */
    public java.lang.String getEmailBodyText() {
        return emailBodyText;
    }


    /**
     * Sets the emailBodyText value for this EmailReminderSoap.
     * 
     * @param emailBodyText
     */
    public void setEmailBodyText(java.lang.String emailBodyText) {
        this.emailBodyText = emailBodyText;
    }


    /**
     * Gets the emailReminderId value for this EmailReminderSoap.
     * 
     * @return emailReminderId
     */
    public long getEmailReminderId() {
        return emailReminderId;
    }


    /**
     * Sets the emailReminderId value for this EmailReminderSoap.
     * 
     * @param emailReminderId
     */
    public void setEmailReminderId(long emailReminderId) {
        this.emailReminderId = emailReminderId;
    }


    /**
     * Gets the emailSubjectText value for this EmailReminderSoap.
     * 
     * @return emailSubjectText
     */
    public java.lang.String getEmailSubjectText() {
        return emailSubjectText;
    }


    /**
     * Sets the emailSubjectText value for this EmailReminderSoap.
     * 
     * @param emailSubjectText
     */
    public void setEmailSubjectText(java.lang.String emailSubjectText) {
        this.emailSubjectText = emailSubjectText;
    }


    /**
     * Gets the lastUpdateTimestamp value for this EmailReminderSoap.
     * 
     * @return lastUpdateTimestamp
     */
    public java.util.Calendar getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }


    /**
     * Sets the lastUpdateTimestamp value for this EmailReminderSoap.
     * 
     * @param lastUpdateTimestamp
     */
    public void setLastUpdateTimestamp(java.util.Calendar lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }


    /**
     * Gets the lastUpdateUserId value for this EmailReminderSoap.
     * 
     * @return lastUpdateUserId
     */
    public java.lang.String getLastUpdateUserId() {
        return lastUpdateUserId;
    }


    /**
     * Sets the lastUpdateUserId value for this EmailReminderSoap.
     * 
     * @param lastUpdateUserId
     */
    public void setLastUpdateUserId(java.lang.String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }


    /**
     * Gets the primaryKey value for this EmailReminderSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this EmailReminderSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the reminderNumber value for this EmailReminderSoap.
     * 
     * @return reminderNumber
     */
    public int getReminderNumber() {
        return reminderNumber;
    }


    /**
     * Sets the reminderNumber value for this EmailReminderSoap.
     * 
     * @param reminderNumber
     */
    public void setReminderNumber(int reminderNumber) {
        this.reminderNumber = reminderNumber;
    }


    /**
     * Gets the scheduleTimestamp value for this EmailReminderSoap.
     * 
     * @return scheduleTimestamp
     */
    public java.util.Calendar getScheduleTimestamp() {
        return scheduleTimestamp;
    }


    /**
     * Sets the scheduleTimestamp value for this EmailReminderSoap.
     * 
     * @param scheduleTimestamp
     */
    public void setScheduleTimestamp(java.util.Calendar scheduleTimestamp) {
        this.scheduleTimestamp = scheduleTimestamp;
    }


    /**
     * Gets the statusCode value for this EmailReminderSoap.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this EmailReminderSoap.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the submitterEmailId value for this EmailReminderSoap.
     * 
     * @return submitterEmailId
     */
    public java.lang.String getSubmitterEmailId() {
        return submitterEmailId;
    }


    /**
     * Sets the submitterEmailId value for this EmailReminderSoap.
     * 
     * @param submitterEmailId
     */
    public void setSubmitterEmailId(java.lang.String submitterEmailId) {
        this.submitterEmailId = submitterEmailId;
    }


    /**
     * Gets the submitterName value for this EmailReminderSoap.
     * 
     * @return submitterName
     */
    public java.lang.String getSubmitterName() {
        return submitterName;
    }


    /**
     * Sets the submitterName value for this EmailReminderSoap.
     * 
     * @param submitterName
     */
    public void setSubmitterName(java.lang.String submitterName) {
        this.submitterName = submitterName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailReminderSoap)) return false;
        EmailReminderSoap other = (EmailReminderSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createTimestamp==null && other.getCreateTimestamp()==null) || 
             (this.createTimestamp!=null &&
              this.createTimestamp.equals(other.getCreateTimestamp()))) &&
            ((this.createUserId==null && other.getCreateUserId()==null) || 
             (this.createUserId!=null &&
              this.createUserId.equals(other.getCreateUserId()))) &&
            ((this.emailBodyText==null && other.getEmailBodyText()==null) || 
             (this.emailBodyText!=null &&
              this.emailBodyText.equals(other.getEmailBodyText()))) &&
            this.emailReminderId == other.getEmailReminderId() &&
            ((this.emailSubjectText==null && other.getEmailSubjectText()==null) || 
             (this.emailSubjectText!=null &&
              this.emailSubjectText.equals(other.getEmailSubjectText()))) &&
            ((this.lastUpdateTimestamp==null && other.getLastUpdateTimestamp()==null) || 
             (this.lastUpdateTimestamp!=null &&
              this.lastUpdateTimestamp.equals(other.getLastUpdateTimestamp()))) &&
            ((this.lastUpdateUserId==null && other.getLastUpdateUserId()==null) || 
             (this.lastUpdateUserId!=null &&
              this.lastUpdateUserId.equals(other.getLastUpdateUserId()))) &&
            this.primaryKey == other.getPrimaryKey() &&
            this.reminderNumber == other.getReminderNumber() &&
            ((this.scheduleTimestamp==null && other.getScheduleTimestamp()==null) || 
             (this.scheduleTimestamp!=null &&
              this.scheduleTimestamp.equals(other.getScheduleTimestamp()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.submitterEmailId==null && other.getSubmitterEmailId()==null) || 
             (this.submitterEmailId!=null &&
              this.submitterEmailId.equals(other.getSubmitterEmailId()))) &&
            ((this.submitterName==null && other.getSubmitterName()==null) || 
             (this.submitterName!=null &&
              this.submitterName.equals(other.getSubmitterName())));
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
        if (getCreateTimestamp() != null) {
            _hashCode += getCreateTimestamp().hashCode();
        }
        if (getCreateUserId() != null) {
            _hashCode += getCreateUserId().hashCode();
        }
        if (getEmailBodyText() != null) {
            _hashCode += getEmailBodyText().hashCode();
        }
        _hashCode += new Long(getEmailReminderId()).hashCode();
        if (getEmailSubjectText() != null) {
            _hashCode += getEmailSubjectText().hashCode();
        }
        if (getLastUpdateTimestamp() != null) {
            _hashCode += getLastUpdateTimestamp().hashCode();
        }
        if (getLastUpdateUserId() != null) {
            _hashCode += getLastUpdateUserId().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += getReminderNumber();
        if (getScheduleTimestamp() != null) {
            _hashCode += getScheduleTimestamp().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getSubmitterEmailId() != null) {
            _hashCode += getSubmitterEmailId().hashCode();
        }
        if (getSubmitterName() != null) {
            _hashCode += getSubmitterName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailReminderSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.me2.ihg.com", "EmailReminderSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("emailBodyText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailBodyText"));
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
        elemField.setFieldName("emailSubjectText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailSubjectText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reminderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitterEmailId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitterEmailId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitterName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
