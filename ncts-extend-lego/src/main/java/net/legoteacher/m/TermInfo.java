/**
 * TermInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.legoteacher.m;

public class TermInfo  implements java.io.Serializable {
    private java.lang.String evalEndTime;

    private java.lang.String evalStartTime;

    private java.lang.String id;

    private java.lang.String pickEndTime;

    private java.lang.String pickStartTime;

    private java.lang.String regEndTime;

    private java.lang.String regStartTime;

    private java.lang.String teachStage;

    private java.lang.String teachSubject;

    private java.lang.String techEndTime;

    private java.lang.String techStartTime;

    private java.lang.String termName;

    public TermInfo() {
    }

    public TermInfo(
           java.lang.String evalEndTime,
           java.lang.String evalStartTime,
           java.lang.String id,
           java.lang.String pickEndTime,
           java.lang.String pickStartTime,
           java.lang.String regEndTime,
           java.lang.String regStartTime,
           java.lang.String teachStage,
           java.lang.String teachSubject,
           java.lang.String techEndTime,
           java.lang.String techStartTime,
           java.lang.String termName) {
           this.evalEndTime = evalEndTime;
           this.evalStartTime = evalStartTime;
           this.id = id;
           this.pickEndTime = pickEndTime;
           this.pickStartTime = pickStartTime;
           this.regEndTime = regEndTime;
           this.regStartTime = regStartTime;
           this.teachStage = teachStage;
           this.teachSubject = teachSubject;
           this.techEndTime = techEndTime;
           this.techStartTime = techStartTime;
           this.termName = termName;
    }


    /**
     * Gets the evalEndTime value for this TermInfo.
     * 
     * @return evalEndTime
     */
    public java.lang.String getEvalEndTime() {
        return evalEndTime;
    }


    /**
     * Sets the evalEndTime value for this TermInfo.
     * 
     * @param evalEndTime
     */
    public void setEvalEndTime(java.lang.String evalEndTime) {
        this.evalEndTime = evalEndTime;
    }


    /**
     * Gets the evalStartTime value for this TermInfo.
     * 
     * @return evalStartTime
     */
    public java.lang.String getEvalStartTime() {
        return evalStartTime;
    }


    /**
     * Sets the evalStartTime value for this TermInfo.
     * 
     * @param evalStartTime
     */
    public void setEvalStartTime(java.lang.String evalStartTime) {
        this.evalStartTime = evalStartTime;
    }


    /**
     * Gets the id value for this TermInfo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this TermInfo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the pickEndTime value for this TermInfo.
     * 
     * @return pickEndTime
     */
    public java.lang.String getPickEndTime() {
        return pickEndTime;
    }


    /**
     * Sets the pickEndTime value for this TermInfo.
     * 
     * @param pickEndTime
     */
    public void setPickEndTime(java.lang.String pickEndTime) {
        this.pickEndTime = pickEndTime;
    }


    /**
     * Gets the pickStartTime value for this TermInfo.
     * 
     * @return pickStartTime
     */
    public java.lang.String getPickStartTime() {
        return pickStartTime;
    }


    /**
     * Sets the pickStartTime value for this TermInfo.
     * 
     * @param pickStartTime
     */
    public void setPickStartTime(java.lang.String pickStartTime) {
        this.pickStartTime = pickStartTime;
    }


    /**
     * Gets the regEndTime value for this TermInfo.
     * 
     * @return regEndTime
     */
    public java.lang.String getRegEndTime() {
        return regEndTime;
    }


    /**
     * Sets the regEndTime value for this TermInfo.
     * 
     * @param regEndTime
     */
    public void setRegEndTime(java.lang.String regEndTime) {
        this.regEndTime = regEndTime;
    }


    /**
     * Gets the regStartTime value for this TermInfo.
     * 
     * @return regStartTime
     */
    public java.lang.String getRegStartTime() {
        return regStartTime;
    }


    /**
     * Sets the regStartTime value for this TermInfo.
     * 
     * @param regStartTime
     */
    public void setRegStartTime(java.lang.String regStartTime) {
        this.regStartTime = regStartTime;
    }


    /**
     * Gets the teachStage value for this TermInfo.
     * 
     * @return teachStage
     */
    public java.lang.String getTeachStage() {
        return teachStage;
    }


    /**
     * Sets the teachStage value for this TermInfo.
     * 
     * @param teachStage
     */
    public void setTeachStage(java.lang.String teachStage) {
        this.teachStage = teachStage;
    }


    /**
     * Gets the teachSubject value for this TermInfo.
     * 
     * @return teachSubject
     */
    public java.lang.String getTeachSubject() {
        return teachSubject;
    }


    /**
     * Sets the teachSubject value for this TermInfo.
     * 
     * @param teachSubject
     */
    public void setTeachSubject(java.lang.String teachSubject) {
        this.teachSubject = teachSubject;
    }


    /**
     * Gets the techEndTime value for this TermInfo.
     * 
     * @return techEndTime
     */
    public java.lang.String getTechEndTime() {
        return techEndTime;
    }


    /**
     * Sets the techEndTime value for this TermInfo.
     * 
     * @param techEndTime
     */
    public void setTechEndTime(java.lang.String techEndTime) {
        this.techEndTime = techEndTime;
    }


    /**
     * Gets the techStartTime value for this TermInfo.
     * 
     * @return techStartTime
     */
    public java.lang.String getTechStartTime() {
        return techStartTime;
    }


    /**
     * Sets the techStartTime value for this TermInfo.
     * 
     * @param techStartTime
     */
    public void setTechStartTime(java.lang.String techStartTime) {
        this.techStartTime = techStartTime;
    }


    /**
     * Gets the termName value for this TermInfo.
     * 
     * @return termName
     */
    public java.lang.String getTermName() {
        return termName;
    }


    /**
     * Sets the termName value for this TermInfo.
     * 
     * @param termName
     */
    public void setTermName(java.lang.String termName) {
        this.termName = termName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TermInfo)) return false;
        TermInfo other = (TermInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.evalEndTime==null && other.getEvalEndTime()==null) || 
             (this.evalEndTime!=null &&
              this.evalEndTime.equals(other.getEvalEndTime()))) &&
            ((this.evalStartTime==null && other.getEvalStartTime()==null) || 
             (this.evalStartTime!=null &&
              this.evalStartTime.equals(other.getEvalStartTime()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.pickEndTime==null && other.getPickEndTime()==null) || 
             (this.pickEndTime!=null &&
              this.pickEndTime.equals(other.getPickEndTime()))) &&
            ((this.pickStartTime==null && other.getPickStartTime()==null) || 
             (this.pickStartTime!=null &&
              this.pickStartTime.equals(other.getPickStartTime()))) &&
            ((this.regEndTime==null && other.getRegEndTime()==null) || 
             (this.regEndTime!=null &&
              this.regEndTime.equals(other.getRegEndTime()))) &&
            ((this.regStartTime==null && other.getRegStartTime()==null) || 
             (this.regStartTime!=null &&
              this.regStartTime.equals(other.getRegStartTime()))) &&
            ((this.teachStage==null && other.getTeachStage()==null) || 
             (this.teachStage!=null &&
              this.teachStage.equals(other.getTeachStage()))) &&
            ((this.teachSubject==null && other.getTeachSubject()==null) || 
             (this.teachSubject!=null &&
              this.teachSubject.equals(other.getTeachSubject()))) &&
            ((this.techEndTime==null && other.getTechEndTime()==null) || 
             (this.techEndTime!=null &&
              this.techEndTime.equals(other.getTechEndTime()))) &&
            ((this.techStartTime==null && other.getTechStartTime()==null) || 
             (this.techStartTime!=null &&
              this.techStartTime.equals(other.getTechStartTime()))) &&
            ((this.termName==null && other.getTermName()==null) || 
             (this.termName!=null &&
              this.termName.equals(other.getTermName())));
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
        if (getEvalEndTime() != null) {
            _hashCode += getEvalEndTime().hashCode();
        }
        if (getEvalStartTime() != null) {
            _hashCode += getEvalStartTime().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPickEndTime() != null) {
            _hashCode += getPickEndTime().hashCode();
        }
        if (getPickStartTime() != null) {
            _hashCode += getPickStartTime().hashCode();
        }
        if (getRegEndTime() != null) {
            _hashCode += getRegEndTime().hashCode();
        }
        if (getRegStartTime() != null) {
            _hashCode += getRegStartTime().hashCode();
        }
        if (getTeachStage() != null) {
            _hashCode += getTeachStage().hashCode();
        }
        if (getTeachSubject() != null) {
            _hashCode += getTeachSubject().hashCode();
        }
        if (getTechEndTime() != null) {
            _hashCode += getTechEndTime().hashCode();
        }
        if (getTechStartTime() != null) {
            _hashCode += getTechStartTime().hashCode();
        }
        if (getTermName() != null) {
            _hashCode += getTermName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TermInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://m.legoteacher.net", "termInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evalEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "evalEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evalStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "evalStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teachStage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teachStage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teachSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teachSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("techEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "techEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("techStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "techStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "termName"));
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
