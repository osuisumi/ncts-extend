/**
 * Department.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.gdjxjy.glpt;

public class Department  extends cn.com.gdjxjy.glpt.BaseVO  implements java.io.Serializable {
    private java.lang.String auditContent;

    private java.lang.String auditDept;

    private java.lang.String auditStatus;

    private java.util.Calendar auditTime;

    private java.lang.String auditUser;

    private java.lang.String city;

    private java.lang.String counties;

    private java.lang.String declareDept;

    private java.util.Calendar declareTime;

    private java.lang.String declareUser;

    private java.math.BigDecimal deptLevel;

    private java.lang.String deptName;

    private java.lang.String deptNo;

    private java.lang.String deptNoAttachment;

    private java.lang.String deptType;

    private java.lang.String id;

    private java.lang.String isUpdate;

    private java.lang.String linkAddress;

    private java.lang.String linkEmail;

    private java.lang.String linkMobile;

    private java.lang.String linkName;

    private java.lang.String linkPhone;

    private java.lang.String mainDeptId;

    private java.lang.String ownerIdcard;

    private java.lang.String ownerName;

    private java.lang.String parentDeptId;

    private java.lang.String parentId;

    private java.lang.String province;

    private java.lang.String remark;

    private java.lang.String sealImg;

    private java.lang.String signImg;

    private java.math.BigDecimal sortNo;

    private java.lang.String status;

    private java.lang.String trainRange;

    public Department() {
    }

    public Department(
           java.util.Calendar createTime,
           java.lang.String creator,
           java.lang.String isDeleted,
           java.util.Calendar updateTime,
           java.lang.String updatedby,
           float version,
           java.lang.String auditContent,
           java.lang.String auditDept,
           java.lang.String auditStatus,
           java.util.Calendar auditTime,
           java.lang.String auditUser,
           java.lang.String city,
           java.lang.String counties,
           java.lang.String declareDept,
           java.util.Calendar declareTime,
           java.lang.String declareUser,
           java.math.BigDecimal deptLevel,
           java.lang.String deptName,
           java.lang.String deptNo,
           java.lang.String deptNoAttachment,
           java.lang.String deptType,
           java.lang.String id,
           java.lang.String isUpdate,
           java.lang.String linkAddress,
           java.lang.String linkEmail,
           java.lang.String linkMobile,
           java.lang.String linkName,
           java.lang.String linkPhone,
           java.lang.String mainDeptId,
           java.lang.String ownerIdcard,
           java.lang.String ownerName,
           java.lang.String parentDeptId,
           java.lang.String parentId,
           java.lang.String province,
           java.lang.String remark,
           java.lang.String sealImg,
           java.lang.String signImg,
           java.math.BigDecimal sortNo,
           java.lang.String status,
           java.lang.String trainRange) {
        super(
            createTime,
            creator,
            isDeleted,
            updateTime,
            updatedby,
            version);
        this.auditContent = auditContent;
        this.auditDept = auditDept;
        this.auditStatus = auditStatus;
        this.auditTime = auditTime;
        this.auditUser = auditUser;
        this.city = city;
        this.counties = counties;
        this.declareDept = declareDept;
        this.declareTime = declareTime;
        this.declareUser = declareUser;
        this.deptLevel = deptLevel;
        this.deptName = deptName;
        this.deptNo = deptNo;
        this.deptNoAttachment = deptNoAttachment;
        this.deptType = deptType;
        this.id = id;
        this.isUpdate = isUpdate;
        this.linkAddress = linkAddress;
        this.linkEmail = linkEmail;
        this.linkMobile = linkMobile;
        this.linkName = linkName;
        this.linkPhone = linkPhone;
        this.mainDeptId = mainDeptId;
        this.ownerIdcard = ownerIdcard;
        this.ownerName = ownerName;
        this.parentDeptId = parentDeptId;
        this.parentId = parentId;
        this.province = province;
        this.remark = remark;
        this.sealImg = sealImg;
        this.signImg = signImg;
        this.sortNo = sortNo;
        this.status = status;
        this.trainRange = trainRange;
    }


    /**
     * Gets the auditContent value for this Department.
     * 
     * @return auditContent
     */
    public java.lang.String getAuditContent() {
        return auditContent;
    }


    /**
     * Sets the auditContent value for this Department.
     * 
     * @param auditContent
     */
    public void setAuditContent(java.lang.String auditContent) {
        this.auditContent = auditContent;
    }


    /**
     * Gets the auditDept value for this Department.
     * 
     * @return auditDept
     */
    public java.lang.String getAuditDept() {
        return auditDept;
    }


    /**
     * Sets the auditDept value for this Department.
     * 
     * @param auditDept
     */
    public void setAuditDept(java.lang.String auditDept) {
        this.auditDept = auditDept;
    }


    /**
     * Gets the auditStatus value for this Department.
     * 
     * @return auditStatus
     */
    public java.lang.String getAuditStatus() {
        return auditStatus;
    }


    /**
     * Sets the auditStatus value for this Department.
     * 
     * @param auditStatus
     */
    public void setAuditStatus(java.lang.String auditStatus) {
        this.auditStatus = auditStatus;
    }


    /**
     * Gets the auditTime value for this Department.
     * 
     * @return auditTime
     */
    public java.util.Calendar getAuditTime() {
        return auditTime;
    }


    /**
     * Sets the auditTime value for this Department.
     * 
     * @param auditTime
     */
    public void setAuditTime(java.util.Calendar auditTime) {
        this.auditTime = auditTime;
    }


    /**
     * Gets the auditUser value for this Department.
     * 
     * @return auditUser
     */
    public java.lang.String getAuditUser() {
        return auditUser;
    }


    /**
     * Sets the auditUser value for this Department.
     * 
     * @param auditUser
     */
    public void setAuditUser(java.lang.String auditUser) {
        this.auditUser = auditUser;
    }


    /**
     * Gets the city value for this Department.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Department.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the counties value for this Department.
     * 
     * @return counties
     */
    public java.lang.String getCounties() {
        return counties;
    }


    /**
     * Sets the counties value for this Department.
     * 
     * @param counties
     */
    public void setCounties(java.lang.String counties) {
        this.counties = counties;
    }


    /**
     * Gets the declareDept value for this Department.
     * 
     * @return declareDept
     */
    public java.lang.String getDeclareDept() {
        return declareDept;
    }


    /**
     * Sets the declareDept value for this Department.
     * 
     * @param declareDept
     */
    public void setDeclareDept(java.lang.String declareDept) {
        this.declareDept = declareDept;
    }


    /**
     * Gets the declareTime value for this Department.
     * 
     * @return declareTime
     */
    public java.util.Calendar getDeclareTime() {
        return declareTime;
    }


    /**
     * Sets the declareTime value for this Department.
     * 
     * @param declareTime
     */
    public void setDeclareTime(java.util.Calendar declareTime) {
        this.declareTime = declareTime;
    }


    /**
     * Gets the declareUser value for this Department.
     * 
     * @return declareUser
     */
    public java.lang.String getDeclareUser() {
        return declareUser;
    }


    /**
     * Sets the declareUser value for this Department.
     * 
     * @param declareUser
     */
    public void setDeclareUser(java.lang.String declareUser) {
        this.declareUser = declareUser;
    }


    /**
     * Gets the deptLevel value for this Department.
     * 
     * @return deptLevel
     */
    public java.math.BigDecimal getDeptLevel() {
        return deptLevel;
    }


    /**
     * Sets the deptLevel value for this Department.
     * 
     * @param deptLevel
     */
    public void setDeptLevel(java.math.BigDecimal deptLevel) {
        this.deptLevel = deptLevel;
    }


    /**
     * Gets the deptName value for this Department.
     * 
     * @return deptName
     */
    public java.lang.String getDeptName() {
        return deptName;
    }


    /**
     * Sets the deptName value for this Department.
     * 
     * @param deptName
     */
    public void setDeptName(java.lang.String deptName) {
        this.deptName = deptName;
    }


    /**
     * Gets the deptNo value for this Department.
     * 
     * @return deptNo
     */
    public java.lang.String getDeptNo() {
        return deptNo;
    }


    /**
     * Sets the deptNo value for this Department.
     * 
     * @param deptNo
     */
    public void setDeptNo(java.lang.String deptNo) {
        this.deptNo = deptNo;
    }


    /**
     * Gets the deptNoAttachment value for this Department.
     * 
     * @return deptNoAttachment
     */
    public java.lang.String getDeptNoAttachment() {
        return deptNoAttachment;
    }


    /**
     * Sets the deptNoAttachment value for this Department.
     * 
     * @param deptNoAttachment
     */
    public void setDeptNoAttachment(java.lang.String deptNoAttachment) {
        this.deptNoAttachment = deptNoAttachment;
    }


    /**
     * Gets the deptType value for this Department.
     * 
     * @return deptType
     */
    public java.lang.String getDeptType() {
        return deptType;
    }


    /**
     * Sets the deptType value for this Department.
     * 
     * @param deptType
     */
    public void setDeptType(java.lang.String deptType) {
        this.deptType = deptType;
    }


    /**
     * Gets the id value for this Department.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Department.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the isUpdate value for this Department.
     * 
     * @return isUpdate
     */
    public java.lang.String getIsUpdate() {
        return isUpdate;
    }


    /**
     * Sets the isUpdate value for this Department.
     * 
     * @param isUpdate
     */
    public void setIsUpdate(java.lang.String isUpdate) {
        this.isUpdate = isUpdate;
    }


    /**
     * Gets the linkAddress value for this Department.
     * 
     * @return linkAddress
     */
    public java.lang.String getLinkAddress() {
        return linkAddress;
    }


    /**
     * Sets the linkAddress value for this Department.
     * 
     * @param linkAddress
     */
    public void setLinkAddress(java.lang.String linkAddress) {
        this.linkAddress = linkAddress;
    }


    /**
     * Gets the linkEmail value for this Department.
     * 
     * @return linkEmail
     */
    public java.lang.String getLinkEmail() {
        return linkEmail;
    }


    /**
     * Sets the linkEmail value for this Department.
     * 
     * @param linkEmail
     */
    public void setLinkEmail(java.lang.String linkEmail) {
        this.linkEmail = linkEmail;
    }


    /**
     * Gets the linkMobile value for this Department.
     * 
     * @return linkMobile
     */
    public java.lang.String getLinkMobile() {
        return linkMobile;
    }


    /**
     * Sets the linkMobile value for this Department.
     * 
     * @param linkMobile
     */
    public void setLinkMobile(java.lang.String linkMobile) {
        this.linkMobile = linkMobile;
    }


    /**
     * Gets the linkName value for this Department.
     * 
     * @return linkName
     */
    public java.lang.String getLinkName() {
        return linkName;
    }


    /**
     * Sets the linkName value for this Department.
     * 
     * @param linkName
     */
    public void setLinkName(java.lang.String linkName) {
        this.linkName = linkName;
    }


    /**
     * Gets the linkPhone value for this Department.
     * 
     * @return linkPhone
     */
    public java.lang.String getLinkPhone() {
        return linkPhone;
    }


    /**
     * Sets the linkPhone value for this Department.
     * 
     * @param linkPhone
     */
    public void setLinkPhone(java.lang.String linkPhone) {
        this.linkPhone = linkPhone;
    }


    /**
     * Gets the mainDeptId value for this Department.
     * 
     * @return mainDeptId
     */
    public java.lang.String getMainDeptId() {
        return mainDeptId;
    }


    /**
     * Sets the mainDeptId value for this Department.
     * 
     * @param mainDeptId
     */
    public void setMainDeptId(java.lang.String mainDeptId) {
        this.mainDeptId = mainDeptId;
    }


    /**
     * Gets the ownerIdcard value for this Department.
     * 
     * @return ownerIdcard
     */
    public java.lang.String getOwnerIdcard() {
        return ownerIdcard;
    }


    /**
     * Sets the ownerIdcard value for this Department.
     * 
     * @param ownerIdcard
     */
    public void setOwnerIdcard(java.lang.String ownerIdcard) {
        this.ownerIdcard = ownerIdcard;
    }


    /**
     * Gets the ownerName value for this Department.
     * 
     * @return ownerName
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this Department.
     * 
     * @param ownerName
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the parentDeptId value for this Department.
     * 
     * @return parentDeptId
     */
    public java.lang.String getParentDeptId() {
        return parentDeptId;
    }


    /**
     * Sets the parentDeptId value for this Department.
     * 
     * @param parentDeptId
     */
    public void setParentDeptId(java.lang.String parentDeptId) {
        this.parentDeptId = parentDeptId;
    }


    /**
     * Gets the parentId value for this Department.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this Department.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the province value for this Department.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this Department.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }


    /**
     * Gets the remark value for this Department.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this Department.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the sealImg value for this Department.
     * 
     * @return sealImg
     */
    public java.lang.String getSealImg() {
        return sealImg;
    }


    /**
     * Sets the sealImg value for this Department.
     * 
     * @param sealImg
     */
    public void setSealImg(java.lang.String sealImg) {
        this.sealImg = sealImg;
    }


    /**
     * Gets the signImg value for this Department.
     * 
     * @return signImg
     */
    public java.lang.String getSignImg() {
        return signImg;
    }


    /**
     * Sets the signImg value for this Department.
     * 
     * @param signImg
     */
    public void setSignImg(java.lang.String signImg) {
        this.signImg = signImg;
    }


    /**
     * Gets the sortNo value for this Department.
     * 
     * @return sortNo
     */
    public java.math.BigDecimal getSortNo() {
        return sortNo;
    }


    /**
     * Sets the sortNo value for this Department.
     * 
     * @param sortNo
     */
    public void setSortNo(java.math.BigDecimal sortNo) {
        this.sortNo = sortNo;
    }


    /**
     * Gets the status value for this Department.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Department.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the trainRange value for this Department.
     * 
     * @return trainRange
     */
    public java.lang.String getTrainRange() {
        return trainRange;
    }


    /**
     * Sets the trainRange value for this Department.
     * 
     * @param trainRange
     */
    public void setTrainRange(java.lang.String trainRange) {
        this.trainRange = trainRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Department)) return false;
        Department other = (Department) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.auditContent==null && other.getAuditContent()==null) || 
             (this.auditContent!=null &&
              this.auditContent.equals(other.getAuditContent()))) &&
            ((this.auditDept==null && other.getAuditDept()==null) || 
             (this.auditDept!=null &&
              this.auditDept.equals(other.getAuditDept()))) &&
            ((this.auditStatus==null && other.getAuditStatus()==null) || 
             (this.auditStatus!=null &&
              this.auditStatus.equals(other.getAuditStatus()))) &&
            ((this.auditTime==null && other.getAuditTime()==null) || 
             (this.auditTime!=null &&
              this.auditTime.equals(other.getAuditTime()))) &&
            ((this.auditUser==null && other.getAuditUser()==null) || 
             (this.auditUser!=null &&
              this.auditUser.equals(other.getAuditUser()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.counties==null && other.getCounties()==null) || 
             (this.counties!=null &&
              this.counties.equals(other.getCounties()))) &&
            ((this.declareDept==null && other.getDeclareDept()==null) || 
             (this.declareDept!=null &&
              this.declareDept.equals(other.getDeclareDept()))) &&
            ((this.declareTime==null && other.getDeclareTime()==null) || 
             (this.declareTime!=null &&
              this.declareTime.equals(other.getDeclareTime()))) &&
            ((this.declareUser==null && other.getDeclareUser()==null) || 
             (this.declareUser!=null &&
              this.declareUser.equals(other.getDeclareUser()))) &&
            ((this.deptLevel==null && other.getDeptLevel()==null) || 
             (this.deptLevel!=null &&
              this.deptLevel.equals(other.getDeptLevel()))) &&
            ((this.deptName==null && other.getDeptName()==null) || 
             (this.deptName!=null &&
              this.deptName.equals(other.getDeptName()))) &&
            ((this.deptNo==null && other.getDeptNo()==null) || 
             (this.deptNo!=null &&
              this.deptNo.equals(other.getDeptNo()))) &&
            ((this.deptNoAttachment==null && other.getDeptNoAttachment()==null) || 
             (this.deptNoAttachment!=null &&
              this.deptNoAttachment.equals(other.getDeptNoAttachment()))) &&
            ((this.deptType==null && other.getDeptType()==null) || 
             (this.deptType!=null &&
              this.deptType.equals(other.getDeptType()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.isUpdate==null && other.getIsUpdate()==null) || 
             (this.isUpdate!=null &&
              this.isUpdate.equals(other.getIsUpdate()))) &&
            ((this.linkAddress==null && other.getLinkAddress()==null) || 
             (this.linkAddress!=null &&
              this.linkAddress.equals(other.getLinkAddress()))) &&
            ((this.linkEmail==null && other.getLinkEmail()==null) || 
             (this.linkEmail!=null &&
              this.linkEmail.equals(other.getLinkEmail()))) &&
            ((this.linkMobile==null && other.getLinkMobile()==null) || 
             (this.linkMobile!=null &&
              this.linkMobile.equals(other.getLinkMobile()))) &&
            ((this.linkName==null && other.getLinkName()==null) || 
             (this.linkName!=null &&
              this.linkName.equals(other.getLinkName()))) &&
            ((this.linkPhone==null && other.getLinkPhone()==null) || 
             (this.linkPhone!=null &&
              this.linkPhone.equals(other.getLinkPhone()))) &&
            ((this.mainDeptId==null && other.getMainDeptId()==null) || 
             (this.mainDeptId!=null &&
              this.mainDeptId.equals(other.getMainDeptId()))) &&
            ((this.ownerIdcard==null && other.getOwnerIdcard()==null) || 
             (this.ownerIdcard!=null &&
              this.ownerIdcard.equals(other.getOwnerIdcard()))) &&
            ((this.ownerName==null && other.getOwnerName()==null) || 
             (this.ownerName!=null &&
              this.ownerName.equals(other.getOwnerName()))) &&
            ((this.parentDeptId==null && other.getParentDeptId()==null) || 
             (this.parentDeptId!=null &&
              this.parentDeptId.equals(other.getParentDeptId()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.sealImg==null && other.getSealImg()==null) || 
             (this.sealImg!=null &&
              this.sealImg.equals(other.getSealImg()))) &&
            ((this.signImg==null && other.getSignImg()==null) || 
             (this.signImg!=null &&
              this.signImg.equals(other.getSignImg()))) &&
            ((this.sortNo==null && other.getSortNo()==null) || 
             (this.sortNo!=null &&
              this.sortNo.equals(other.getSortNo()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.trainRange==null && other.getTrainRange()==null) || 
             (this.trainRange!=null &&
              this.trainRange.equals(other.getTrainRange())));
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
        if (getAuditContent() != null) {
            _hashCode += getAuditContent().hashCode();
        }
        if (getAuditDept() != null) {
            _hashCode += getAuditDept().hashCode();
        }
        if (getAuditStatus() != null) {
            _hashCode += getAuditStatus().hashCode();
        }
        if (getAuditTime() != null) {
            _hashCode += getAuditTime().hashCode();
        }
        if (getAuditUser() != null) {
            _hashCode += getAuditUser().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCounties() != null) {
            _hashCode += getCounties().hashCode();
        }
        if (getDeclareDept() != null) {
            _hashCode += getDeclareDept().hashCode();
        }
        if (getDeclareTime() != null) {
            _hashCode += getDeclareTime().hashCode();
        }
        if (getDeclareUser() != null) {
            _hashCode += getDeclareUser().hashCode();
        }
        if (getDeptLevel() != null) {
            _hashCode += getDeptLevel().hashCode();
        }
        if (getDeptName() != null) {
            _hashCode += getDeptName().hashCode();
        }
        if (getDeptNo() != null) {
            _hashCode += getDeptNo().hashCode();
        }
        if (getDeptNoAttachment() != null) {
            _hashCode += getDeptNoAttachment().hashCode();
        }
        if (getDeptType() != null) {
            _hashCode += getDeptType().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIsUpdate() != null) {
            _hashCode += getIsUpdate().hashCode();
        }
        if (getLinkAddress() != null) {
            _hashCode += getLinkAddress().hashCode();
        }
        if (getLinkEmail() != null) {
            _hashCode += getLinkEmail().hashCode();
        }
        if (getLinkMobile() != null) {
            _hashCode += getLinkMobile().hashCode();
        }
        if (getLinkName() != null) {
            _hashCode += getLinkName().hashCode();
        }
        if (getLinkPhone() != null) {
            _hashCode += getLinkPhone().hashCode();
        }
        if (getMainDeptId() != null) {
            _hashCode += getMainDeptId().hashCode();
        }
        if (getOwnerIdcard() != null) {
            _hashCode += getOwnerIdcard().hashCode();
        }
        if (getOwnerName() != null) {
            _hashCode += getOwnerName().hashCode();
        }
        if (getParentDeptId() != null) {
            _hashCode += getParentDeptId().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getSealImg() != null) {
            _hashCode += getSealImg().hashCode();
        }
        if (getSignImg() != null) {
            _hashCode += getSignImg().hashCode();
        }
        if (getSortNo() != null) {
            _hashCode += getSortNo().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTrainRange() != null) {
            _hashCode += getTrainRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Department.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://glpt.gdjxjy.com.cn", "department"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditDept");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditDept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "counties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declareDept");
        elemField.setXmlName(new javax.xml.namespace.QName("", "declareDept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declareTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "declareTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declareUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "declareUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deptLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deptName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deptNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptNoAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deptNoAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deptType"));
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
        elemField.setFieldName("isUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainDeptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainDeptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerIdcard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerIdcard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentDeptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentDeptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("", "province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sealImg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sealImg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signImg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signImg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("trainRange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trainRange"));
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
