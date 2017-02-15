/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.gdjxjy.glpt;

public class User  extends cn.com.gdjxjy.glpt.BaseVO  implements java.io.Serializable {
    private java.lang.String avatar;

    private java.lang.String bornDate;

    private java.lang.String corrAddress;

    private java.lang.String email;

    private java.util.Calendar endTime;

    private java.lang.String homeAddress;

    private java.lang.String homePhone;

    private java.lang.String hometownCity;

    private java.lang.String hometownProvince;

    private java.lang.String id;

    private java.lang.String maritalStatus;

    private java.lang.String mobilePhone;

    private java.lang.String nation;

    private java.lang.String nationality;

    private java.lang.String officePhone;

    private java.lang.String paperworkNo;

    private java.lang.String paperworkType;

    private java.lang.String password;

    private java.lang.String passwordPlain;

    private java.lang.String politicsRole;

    private java.lang.String postCode;

    private java.lang.String realName;

    private java.math.BigDecimal roleCode;

    private java.lang.String sex;

    private java.util.Calendar startTime;

    private java.lang.String status;

    private java.lang.String userName;

    private java.lang.String userRole;

    public User() {
    }

    public User(
           java.util.Calendar createTime,
           java.lang.String creator,
           java.lang.String isDeleted,
           java.util.Calendar updateTime,
           java.lang.String updatedby,
           float version,
           java.lang.String avatar,
           java.lang.String bornDate,
           java.lang.String corrAddress,
           java.lang.String email,
           java.util.Calendar endTime,
           java.lang.String homeAddress,
           java.lang.String homePhone,
           java.lang.String hometownCity,
           java.lang.String hometownProvince,
           java.lang.String id,
           java.lang.String maritalStatus,
           java.lang.String mobilePhone,
           java.lang.String nation,
           java.lang.String nationality,
           java.lang.String officePhone,
           java.lang.String paperworkNo,
           java.lang.String paperworkType,
           java.lang.String password,
           java.lang.String passwordPlain,
           java.lang.String politicsRole,
           java.lang.String postCode,
           java.lang.String realName,
           java.math.BigDecimal roleCode,
           java.lang.String sex,
           java.util.Calendar startTime,
           java.lang.String status,
           java.lang.String userName,
           java.lang.String userRole) {
        super(
            createTime,
            creator,
            isDeleted,
            updateTime,
            updatedby,
            version);
        this.avatar = avatar;
        this.bornDate = bornDate;
        this.corrAddress = corrAddress;
        this.email = email;
        this.endTime = endTime;
        this.homeAddress = homeAddress;
        this.homePhone = homePhone;
        this.hometownCity = hometownCity;
        this.hometownProvince = hometownProvince;
        this.id = id;
        this.maritalStatus = maritalStatus;
        this.mobilePhone = mobilePhone;
        this.nation = nation;
        this.nationality = nationality;
        this.officePhone = officePhone;
        this.paperworkNo = paperworkNo;
        this.paperworkType = paperworkType;
        this.password = password;
        this.passwordPlain = passwordPlain;
        this.politicsRole = politicsRole;
        this.postCode = postCode;
        this.realName = realName;
        this.roleCode = roleCode;
        this.sex = sex;
        this.startTime = startTime;
        this.status = status;
        this.userName = userName;
        this.userRole = userRole;
    }


    /**
     * Gets the avatar value for this User.
     * 
     * @return avatar
     */
    public java.lang.String getAvatar() {
        return avatar;
    }


    /**
     * Sets the avatar value for this User.
     * 
     * @param avatar
     */
    public void setAvatar(java.lang.String avatar) {
        this.avatar = avatar;
    }


    /**
     * Gets the bornDate value for this User.
     * 
     * @return bornDate
     */
    public java.lang.String getBornDate() {
        return bornDate;
    }


    /**
     * Sets the bornDate value for this User.
     * 
     * @param bornDate
     */
    public void setBornDate(java.lang.String bornDate) {
        this.bornDate = bornDate;
    }


    /**
     * Gets the corrAddress value for this User.
     * 
     * @return corrAddress
     */
    public java.lang.String getCorrAddress() {
        return corrAddress;
    }


    /**
     * Sets the corrAddress value for this User.
     * 
     * @param corrAddress
     */
    public void setCorrAddress(java.lang.String corrAddress) {
        this.corrAddress = corrAddress;
    }


    /**
     * Gets the email value for this User.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this User.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the endTime value for this User.
     * 
     * @return endTime
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this User.
     * 
     * @param endTime
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the homeAddress value for this User.
     * 
     * @return homeAddress
     */
    public java.lang.String getHomeAddress() {
        return homeAddress;
    }


    /**
     * Sets the homeAddress value for this User.
     * 
     * @param homeAddress
     */
    public void setHomeAddress(java.lang.String homeAddress) {
        this.homeAddress = homeAddress;
    }


    /**
     * Gets the homePhone value for this User.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this User.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the hometownCity value for this User.
     * 
     * @return hometownCity
     */
    public java.lang.String getHometownCity() {
        return hometownCity;
    }


    /**
     * Sets the hometownCity value for this User.
     * 
     * @param hometownCity
     */
    public void setHometownCity(java.lang.String hometownCity) {
        this.hometownCity = hometownCity;
    }


    /**
     * Gets the hometownProvince value for this User.
     * 
     * @return hometownProvince
     */
    public java.lang.String getHometownProvince() {
        return hometownProvince;
    }


    /**
     * Sets the hometownProvince value for this User.
     * 
     * @param hometownProvince
     */
    public void setHometownProvince(java.lang.String hometownProvince) {
        this.hometownProvince = hometownProvince;
    }


    /**
     * Gets the id value for this User.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this User.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the maritalStatus value for this User.
     * 
     * @return maritalStatus
     */
    public java.lang.String getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this User.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(java.lang.String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the mobilePhone value for this User.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this User.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the nation value for this User.
     * 
     * @return nation
     */
    public java.lang.String getNation() {
        return nation;
    }


    /**
     * Sets the nation value for this User.
     * 
     * @param nation
     */
    public void setNation(java.lang.String nation) {
        this.nation = nation;
    }


    /**
     * Gets the nationality value for this User.
     * 
     * @return nationality
     */
    public java.lang.String getNationality() {
        return nationality;
    }


    /**
     * Sets the nationality value for this User.
     * 
     * @param nationality
     */
    public void setNationality(java.lang.String nationality) {
        this.nationality = nationality;
    }


    /**
     * Gets the officePhone value for this User.
     * 
     * @return officePhone
     */
    public java.lang.String getOfficePhone() {
        return officePhone;
    }


    /**
     * Sets the officePhone value for this User.
     * 
     * @param officePhone
     */
    public void setOfficePhone(java.lang.String officePhone) {
        this.officePhone = officePhone;
    }


    /**
     * Gets the paperworkNo value for this User.
     * 
     * @return paperworkNo
     */
    public java.lang.String getPaperworkNo() {
        return paperworkNo;
    }


    /**
     * Sets the paperworkNo value for this User.
     * 
     * @param paperworkNo
     */
    public void setPaperworkNo(java.lang.String paperworkNo) {
        this.paperworkNo = paperworkNo;
    }


    /**
     * Gets the paperworkType value for this User.
     * 
     * @return paperworkType
     */
    public java.lang.String getPaperworkType() {
        return paperworkType;
    }


    /**
     * Sets the paperworkType value for this User.
     * 
     * @param paperworkType
     */
    public void setPaperworkType(java.lang.String paperworkType) {
        this.paperworkType = paperworkType;
    }


    /**
     * Gets the password value for this User.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this User.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the passwordPlain value for this User.
     * 
     * @return passwordPlain
     */
    public java.lang.String getPasswordPlain() {
        return passwordPlain;
    }


    /**
     * Sets the passwordPlain value for this User.
     * 
     * @param passwordPlain
     */
    public void setPasswordPlain(java.lang.String passwordPlain) {
        this.passwordPlain = passwordPlain;
    }


    /**
     * Gets the politicsRole value for this User.
     * 
     * @return politicsRole
     */
    public java.lang.String getPoliticsRole() {
        return politicsRole;
    }


    /**
     * Sets the politicsRole value for this User.
     * 
     * @param politicsRole
     */
    public void setPoliticsRole(java.lang.String politicsRole) {
        this.politicsRole = politicsRole;
    }


    /**
     * Gets the postCode value for this User.
     * 
     * @return postCode
     */
    public java.lang.String getPostCode() {
        return postCode;
    }


    /**
     * Sets the postCode value for this User.
     * 
     * @param postCode
     */
    public void setPostCode(java.lang.String postCode) {
        this.postCode = postCode;
    }


    /**
     * Gets the realName value for this User.
     * 
     * @return realName
     */
    public java.lang.String getRealName() {
        return realName;
    }


    /**
     * Sets the realName value for this User.
     * 
     * @param realName
     */
    public void setRealName(java.lang.String realName) {
        this.realName = realName;
    }


    /**
     * Gets the roleCode value for this User.
     * 
     * @return roleCode
     */
    public java.math.BigDecimal getRoleCode() {
        return roleCode;
    }


    /**
     * Sets the roleCode value for this User.
     * 
     * @param roleCode
     */
    public void setRoleCode(java.math.BigDecimal roleCode) {
        this.roleCode = roleCode;
    }


    /**
     * Gets the sex value for this User.
     * 
     * @return sex
     */
    public java.lang.String getSex() {
        return sex;
    }


    /**
     * Sets the sex value for this User.
     * 
     * @param sex
     */
    public void setSex(java.lang.String sex) {
        this.sex = sex;
    }


    /**
     * Gets the startTime value for this User.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this User.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the status value for this User.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this User.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the userName value for this User.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this User.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userRole value for this User.
     * 
     * @return userRole
     */
    public java.lang.String getUserRole() {
        return userRole;
    }


    /**
     * Sets the userRole value for this User.
     * 
     * @param userRole
     */
    public void setUserRole(java.lang.String userRole) {
        this.userRole = userRole;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.avatar==null && other.getAvatar()==null) || 
             (this.avatar!=null &&
              this.avatar.equals(other.getAvatar()))) &&
            ((this.bornDate==null && other.getBornDate()==null) || 
             (this.bornDate!=null &&
              this.bornDate.equals(other.getBornDate()))) &&
            ((this.corrAddress==null && other.getCorrAddress()==null) || 
             (this.corrAddress!=null &&
              this.corrAddress.equals(other.getCorrAddress()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.homeAddress==null && other.getHomeAddress()==null) || 
             (this.homeAddress!=null &&
              this.homeAddress.equals(other.getHomeAddress()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.hometownCity==null && other.getHometownCity()==null) || 
             (this.hometownCity!=null &&
              this.hometownCity.equals(other.getHometownCity()))) &&
            ((this.hometownProvince==null && other.getHometownProvince()==null) || 
             (this.hometownProvince!=null &&
              this.hometownProvince.equals(other.getHometownProvince()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.nation==null && other.getNation()==null) || 
             (this.nation!=null &&
              this.nation.equals(other.getNation()))) &&
            ((this.nationality==null && other.getNationality()==null) || 
             (this.nationality!=null &&
              this.nationality.equals(other.getNationality()))) &&
            ((this.officePhone==null && other.getOfficePhone()==null) || 
             (this.officePhone!=null &&
              this.officePhone.equals(other.getOfficePhone()))) &&
            ((this.paperworkNo==null && other.getPaperworkNo()==null) || 
             (this.paperworkNo!=null &&
              this.paperworkNo.equals(other.getPaperworkNo()))) &&
            ((this.paperworkType==null && other.getPaperworkType()==null) || 
             (this.paperworkType!=null &&
              this.paperworkType.equals(other.getPaperworkType()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.passwordPlain==null && other.getPasswordPlain()==null) || 
             (this.passwordPlain!=null &&
              this.passwordPlain.equals(other.getPasswordPlain()))) &&
            ((this.politicsRole==null && other.getPoliticsRole()==null) || 
             (this.politicsRole!=null &&
              this.politicsRole.equals(other.getPoliticsRole()))) &&
            ((this.postCode==null && other.getPostCode()==null) || 
             (this.postCode!=null &&
              this.postCode.equals(other.getPostCode()))) &&
            ((this.realName==null && other.getRealName()==null) || 
             (this.realName!=null &&
              this.realName.equals(other.getRealName()))) &&
            ((this.roleCode==null && other.getRoleCode()==null) || 
             (this.roleCode!=null &&
              this.roleCode.equals(other.getRoleCode()))) &&
            ((this.sex==null && other.getSex()==null) || 
             (this.sex!=null &&
              this.sex.equals(other.getSex()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.userRole==null && other.getUserRole()==null) || 
             (this.userRole!=null &&
              this.userRole.equals(other.getUserRole())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAvatar() != null) {
            _hashCode += getAvatar().hashCode();
        }
        if (getBornDate() != null) {
            _hashCode += getBornDate().hashCode();
        }
        if (getCorrAddress() != null) {
            _hashCode += getCorrAddress().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getHomeAddress() != null) {
            _hashCode += getHomeAddress().hashCode();
        }
        if (getHomePhone() != null) {
            _hashCode += getHomePhone().hashCode();
        }
        if (getHometownCity() != null) {
            _hashCode += getHometownCity().hashCode();
        }
        if (getHometownProvince() != null) {
            _hashCode += getHometownProvince().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getNation() != null) {
            _hashCode += getNation().hashCode();
        }
        if (getNationality() != null) {
            _hashCode += getNationality().hashCode();
        }
        if (getOfficePhone() != null) {
            _hashCode += getOfficePhone().hashCode();
        }
        if (getPaperworkNo() != null) {
            _hashCode += getPaperworkNo().hashCode();
        }
        if (getPaperworkType() != null) {
            _hashCode += getPaperworkType().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPasswordPlain() != null) {
            _hashCode += getPasswordPlain().hashCode();
        }
        if (getPoliticsRole() != null) {
            _hashCode += getPoliticsRole().hashCode();
        }
        if (getPostCode() != null) {
            _hashCode += getPostCode().hashCode();
        }
        if (getRealName() != null) {
            _hashCode += getRealName().hashCode();
        }
        if (getRoleCode() != null) {
            _hashCode += getRoleCode().hashCode();
        }
        if (getSex() != null) {
            _hashCode += getSex().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserRole() != null) {
            _hashCode += getUserRole().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://glpt.gdjxjy.com.cn", "user"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avatar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avatar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bornDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bornDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corrAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hometownCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hometownCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hometownProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hometownProvince"));
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
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paperworkNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paperworkNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paperworkType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paperworkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordPlain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwordPlain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("politicsRole");
        elemField.setXmlName(new javax.xml.namespace.QName("", "politicsRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRole");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userRole"));
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
