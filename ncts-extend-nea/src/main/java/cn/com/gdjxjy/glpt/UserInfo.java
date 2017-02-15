/**
 * UserInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.gdjxjy.glpt;

public class UserInfo  implements java.io.Serializable {
    private cn.com.gdjxjy.glpt.Department department;

    private cn.com.gdjxjy.glpt.User user;

    private cn.com.gdjxjy.glpt.UserTeacher userTeacher;

    public UserInfo() {
    }

    public UserInfo(
           cn.com.gdjxjy.glpt.Department department,
           cn.com.gdjxjy.glpt.User user,
           cn.com.gdjxjy.glpt.UserTeacher userTeacher) {
           this.department = department;
           this.user = user;
           this.userTeacher = userTeacher;
    }


    /**
     * Gets the department value for this UserInfo.
     * 
     * @return department
     */
    public cn.com.gdjxjy.glpt.Department getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this UserInfo.
     * 
     * @param department
     */
    public void setDepartment(cn.com.gdjxjy.glpt.Department department) {
        this.department = department;
    }


    /**
     * Gets the user value for this UserInfo.
     * 
     * @return user
     */
    public cn.com.gdjxjy.glpt.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this UserInfo.
     * 
     * @param user
     */
    public void setUser(cn.com.gdjxjy.glpt.User user) {
        this.user = user;
    }


    /**
     * Gets the userTeacher value for this UserInfo.
     * 
     * @return userTeacher
     */
    public cn.com.gdjxjy.glpt.UserTeacher getUserTeacher() {
        return userTeacher;
    }


    /**
     * Sets the userTeacher value for this UserInfo.
     * 
     * @param userTeacher
     */
    public void setUserTeacher(cn.com.gdjxjy.glpt.UserTeacher userTeacher) {
        this.userTeacher = userTeacher;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserInfo)) return false;
        UserInfo other = (UserInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.userTeacher==null && other.getUserTeacher()==null) || 
             (this.userTeacher!=null &&
              this.userTeacher.equals(other.getUserTeacher())));
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
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getUserTeacher() != null) {
            _hashCode += getUserTeacher().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://glpt.gdjxjy.com.cn", "userInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://glpt.gdjxjy.com.cn", "department"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://glpt.gdjxjy.com.cn", "user"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTeacher");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userTeacher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://glpt.gdjxjy.com.cn", "userTeacher"));
        elemField.setMinOccurs(0);
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
