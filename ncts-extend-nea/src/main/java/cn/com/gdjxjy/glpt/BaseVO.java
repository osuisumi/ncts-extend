/**
 * BaseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.gdjxjy.glpt;

public class BaseVO  implements java.io.Serializable {
    private java.util.Calendar createTime;

    private java.lang.String creator;

    private java.lang.String isDeleted;

    private java.util.Calendar updateTime;

    private java.lang.String updatedby;

    private float version;

    public BaseVO() {
    }

    public BaseVO(
           java.util.Calendar createTime,
           java.lang.String creator,
           java.lang.String isDeleted,
           java.util.Calendar updateTime,
           java.lang.String updatedby,
           float version) {
           this.createTime = createTime;
           this.creator = creator;
           this.isDeleted = isDeleted;
           this.updateTime = updateTime;
           this.updatedby = updatedby;
           this.version = version;
    }


    /**
     * Gets the createTime value for this BaseVO.
     * 
     * @return createTime
     */
    public java.util.Calendar getCreateTime() {
        return createTime;
    }


    /**
     * Sets the createTime value for this BaseVO.
     * 
     * @param createTime
     */
    public void setCreateTime(java.util.Calendar createTime) {
        this.createTime = createTime;
    }


    /**
     * Gets the creator value for this BaseVO.
     * 
     * @return creator
     */
    public java.lang.String getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this BaseVO.
     * 
     * @param creator
     */
    public void setCreator(java.lang.String creator) {
        this.creator = creator;
    }


    /**
     * Gets the isDeleted value for this BaseVO.
     * 
     * @return isDeleted
     */
    public java.lang.String getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this BaseVO.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.String isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the updateTime value for this BaseVO.
     * 
     * @return updateTime
     */
    public java.util.Calendar getUpdateTime() {
        return updateTime;
    }


    /**
     * Sets the updateTime value for this BaseVO.
     * 
     * @param updateTime
     */
    public void setUpdateTime(java.util.Calendar updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * Gets the updatedby value for this BaseVO.
     * 
     * @return updatedby
     */
    public java.lang.String getUpdatedby() {
        return updatedby;
    }


    /**
     * Sets the updatedby value for this BaseVO.
     * 
     * @param updatedby
     */
    public void setUpdatedby(java.lang.String updatedby) {
        this.updatedby = updatedby;
    }


    /**
     * Gets the version value for this BaseVO.
     * 
     * @return version
     */
    public float getVersion() {
        return version;
    }


    /**
     * Sets the version value for this BaseVO.
     * 
     * @param version
     */
    public void setVersion(float version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseVO)) return false;
        BaseVO other = (BaseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createTime==null && other.getCreateTime()==null) || 
             (this.createTime!=null &&
              this.createTime.equals(other.getCreateTime()))) &&
            ((this.creator==null && other.getCreator()==null) || 
             (this.creator!=null &&
              this.creator.equals(other.getCreator()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.updateTime==null && other.getUpdateTime()==null) || 
             (this.updateTime!=null &&
              this.updateTime.equals(other.getUpdateTime()))) &&
            ((this.updatedby==null && other.getUpdatedby()==null) || 
             (this.updatedby!=null &&
              this.updatedby.equals(other.getUpdatedby()))) &&
            this.version == other.getVersion();
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
        if (getCreateTime() != null) {
            _hashCode += getCreateTime().hashCode();
        }
        if (getCreator() != null) {
            _hashCode += getCreator().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getUpdateTime() != null) {
            _hashCode += getUpdateTime().hashCode();
        }
        if (getUpdatedby() != null) {
            _hashCode += getUpdatedby().hashCode();
        }
        _hashCode += new Float(getVersion()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://glpt.gdjxjy.com.cn", "baseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedby");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedby"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
