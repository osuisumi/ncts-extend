/**
 * TermUserScore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.gdjsw.m;

public class TermUserScore  implements java.io.Serializable {
    private java.lang.String courseId;

    private java.lang.String result;

    private int score;

    private java.lang.String status;

    private java.lang.String termId;

    private java.lang.String userId;

    public TermUserScore() {
    }

    public TermUserScore(
           java.lang.String courseId,
           java.lang.String result,
           int score,
           java.lang.String status,
           java.lang.String termId,
           java.lang.String userId) {
           this.courseId = courseId;
           this.result = result;
           this.score = score;
           this.status = status;
           this.termId = termId;
           this.userId = userId;
    }


    /**
     * Gets the courseId value for this TermUserScore.
     * 
     * @return courseId
     */
    public java.lang.String getCourseId() {
        return courseId;
    }


    /**
     * Sets the courseId value for this TermUserScore.
     * 
     * @param courseId
     */
    public void setCourseId(java.lang.String courseId) {
        this.courseId = courseId;
    }


    /**
     * Gets the result value for this TermUserScore.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this TermUserScore.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the score value for this TermUserScore.
     * 
     * @return score
     */
    public int getScore() {
        return score;
    }


    /**
     * Sets the score value for this TermUserScore.
     * 
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }


    /**
     * Gets the status value for this TermUserScore.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TermUserScore.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the termId value for this TermUserScore.
     * 
     * @return termId
     */
    public java.lang.String getTermId() {
        return termId;
    }


    /**
     * Sets the termId value for this TermUserScore.
     * 
     * @param termId
     */
    public void setTermId(java.lang.String termId) {
        this.termId = termId;
    }


    /**
     * Gets the userId value for this TermUserScore.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this TermUserScore.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TermUserScore)) return false;
        TermUserScore other = (TermUserScore) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.courseId==null && other.getCourseId()==null) || 
             (this.courseId!=null &&
              this.courseId.equals(other.getCourseId()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            this.score == other.getScore() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.termId==null && other.getTermId()==null) || 
             (this.termId!=null &&
              this.termId.equals(other.getTermId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getCourseId() != null) {
            _hashCode += getCourseId().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        _hashCode += getScore();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTermId() != null) {
            _hashCode += getTermId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TermUserScore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://m.gdjsw.cn", "termUserScore"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "termId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
