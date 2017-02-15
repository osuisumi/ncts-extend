/**
 * UserTeacher.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.gdjxjy.glpt;

public class UserTeacher  extends cn.com.gdjxjy.glpt.BaseVO  implements java.io.Serializable {
    private java.lang.String adminDuty;

    private java.util.Calendar certDt;

    private java.lang.String certNo;

    private java.util.Calendar certPeriod;

    private java.lang.String certSubject;

    private java.lang.String certType;

    private java.lang.String certUnit;

    private java.lang.String chineseLevel;

    private java.lang.String computerLevel;

    private java.lang.String contractType;

    private java.util.Calendar engageDt;

    private java.lang.String expertStage;

    private java.lang.String expertSubject;

    private java.lang.String foreignLevel;

    private java.util.Calendar grantDt;

    private java.lang.String highCollege;

    private java.lang.String highDegree;

    private java.lang.String highDegreeCollege;

    private java.lang.String highDiploma;

    private java.lang.String highSubject;

    private java.lang.String homePage;

    private java.lang.String insurance;

    private java.lang.String jobCategory;

    private java.lang.String jobLevel;

    private java.lang.String orgWork;

    private java.lang.String position;

    private java.math.BigDecimal postType;

    private java.lang.String receiveTrain;

    private java.util.Calendar retiredDt;

    private java.lang.String salary;

    private java.lang.String studentFree;

    private java.lang.String teachStage;

    private java.lang.String teachSubject;

    private java.lang.String teacherCollege;

    private java.lang.String teacherNo;

    private java.lang.String teacherSpecial;

    private java.lang.String techDuty;

    private java.lang.String title;

    private java.util.Calendar titleDt;

    private java.lang.String trainName;

    private java.lang.String trainUnit;

    private java.lang.String userId;

    private java.util.Calendar workDt;

    public UserTeacher() {
    }

    public UserTeacher(
           java.util.Calendar createTime,
           java.lang.String creator,
           java.lang.String isDeleted,
           java.util.Calendar updateTime,
           java.lang.String updatedby,
           float version,
           java.lang.String adminDuty,
           java.util.Calendar certDt,
           java.lang.String certNo,
           java.util.Calendar certPeriod,
           java.lang.String certSubject,
           java.lang.String certType,
           java.lang.String certUnit,
           java.lang.String chineseLevel,
           java.lang.String computerLevel,
           java.lang.String contractType,
           java.util.Calendar engageDt,
           java.lang.String expertStage,
           java.lang.String expertSubject,
           java.lang.String foreignLevel,
           java.util.Calendar grantDt,
           java.lang.String highCollege,
           java.lang.String highDegree,
           java.lang.String highDegreeCollege,
           java.lang.String highDiploma,
           java.lang.String highSubject,
           java.lang.String homePage,
           java.lang.String insurance,
           java.lang.String jobCategory,
           java.lang.String jobLevel,
           java.lang.String orgWork,
           java.lang.String position,
           java.math.BigDecimal postType,
           java.lang.String receiveTrain,
           java.util.Calendar retiredDt,
           java.lang.String salary,
           java.lang.String studentFree,
           java.lang.String teachStage,
           java.lang.String teachSubject,
           java.lang.String teacherCollege,
           java.lang.String teacherNo,
           java.lang.String teacherSpecial,
           java.lang.String techDuty,
           java.lang.String title,
           java.util.Calendar titleDt,
           java.lang.String trainName,
           java.lang.String trainUnit,
           java.lang.String userId,
           java.util.Calendar workDt) {
        super(
            createTime,
            creator,
            isDeleted,
            updateTime,
            updatedby,
            version);
        this.adminDuty = adminDuty;
        this.certDt = certDt;
        this.certNo = certNo;
        this.certPeriod = certPeriod;
        this.certSubject = certSubject;
        this.certType = certType;
        this.certUnit = certUnit;
        this.chineseLevel = chineseLevel;
        this.computerLevel = computerLevel;
        this.contractType = contractType;
        this.engageDt = engageDt;
        this.expertStage = expertStage;
        this.expertSubject = expertSubject;
        this.foreignLevel = foreignLevel;
        this.grantDt = grantDt;
        this.highCollege = highCollege;
        this.highDegree = highDegree;
        this.highDegreeCollege = highDegreeCollege;
        this.highDiploma = highDiploma;
        this.highSubject = highSubject;
        this.homePage = homePage;
        this.insurance = insurance;
        this.jobCategory = jobCategory;
        this.jobLevel = jobLevel;
        this.orgWork = orgWork;
        this.position = position;
        this.postType = postType;
        this.receiveTrain = receiveTrain;
        this.retiredDt = retiredDt;
        this.salary = salary;
        this.studentFree = studentFree;
        this.teachStage = teachStage;
        this.teachSubject = teachSubject;
        this.teacherCollege = teacherCollege;
        this.teacherNo = teacherNo;
        this.teacherSpecial = teacherSpecial;
        this.techDuty = techDuty;
        this.title = title;
        this.titleDt = titleDt;
        this.trainName = trainName;
        this.trainUnit = trainUnit;
        this.userId = userId;
        this.workDt = workDt;
    }


    /**
     * Gets the adminDuty value for this UserTeacher.
     * 
     * @return adminDuty
     */
    public java.lang.String getAdminDuty() {
        return adminDuty;
    }


    /**
     * Sets the adminDuty value for this UserTeacher.
     * 
     * @param adminDuty
     */
    public void setAdminDuty(java.lang.String adminDuty) {
        this.adminDuty = adminDuty;
    }


    /**
     * Gets the certDt value for this UserTeacher.
     * 
     * @return certDt
     */
    public java.util.Calendar getCertDt() {
        return certDt;
    }


    /**
     * Sets the certDt value for this UserTeacher.
     * 
     * @param certDt
     */
    public void setCertDt(java.util.Calendar certDt) {
        this.certDt = certDt;
    }


    /**
     * Gets the certNo value for this UserTeacher.
     * 
     * @return certNo
     */
    public java.lang.String getCertNo() {
        return certNo;
    }


    /**
     * Sets the certNo value for this UserTeacher.
     * 
     * @param certNo
     */
    public void setCertNo(java.lang.String certNo) {
        this.certNo = certNo;
    }


    /**
     * Gets the certPeriod value for this UserTeacher.
     * 
     * @return certPeriod
     */
    public java.util.Calendar getCertPeriod() {
        return certPeriod;
    }


    /**
     * Sets the certPeriod value for this UserTeacher.
     * 
     * @param certPeriod
     */
    public void setCertPeriod(java.util.Calendar certPeriod) {
        this.certPeriod = certPeriod;
    }


    /**
     * Gets the certSubject value for this UserTeacher.
     * 
     * @return certSubject
     */
    public java.lang.String getCertSubject() {
        return certSubject;
    }


    /**
     * Sets the certSubject value for this UserTeacher.
     * 
     * @param certSubject
     */
    public void setCertSubject(java.lang.String certSubject) {
        this.certSubject = certSubject;
    }


    /**
     * Gets the certType value for this UserTeacher.
     * 
     * @return certType
     */
    public java.lang.String getCertType() {
        return certType;
    }


    /**
     * Sets the certType value for this UserTeacher.
     * 
     * @param certType
     */
    public void setCertType(java.lang.String certType) {
        this.certType = certType;
    }


    /**
     * Gets the certUnit value for this UserTeacher.
     * 
     * @return certUnit
     */
    public java.lang.String getCertUnit() {
        return certUnit;
    }


    /**
     * Sets the certUnit value for this UserTeacher.
     * 
     * @param certUnit
     */
    public void setCertUnit(java.lang.String certUnit) {
        this.certUnit = certUnit;
    }


    /**
     * Gets the chineseLevel value for this UserTeacher.
     * 
     * @return chineseLevel
     */
    public java.lang.String getChineseLevel() {
        return chineseLevel;
    }


    /**
     * Sets the chineseLevel value for this UserTeacher.
     * 
     * @param chineseLevel
     */
    public void setChineseLevel(java.lang.String chineseLevel) {
        this.chineseLevel = chineseLevel;
    }


    /**
     * Gets the computerLevel value for this UserTeacher.
     * 
     * @return computerLevel
     */
    public java.lang.String getComputerLevel() {
        return computerLevel;
    }


    /**
     * Sets the computerLevel value for this UserTeacher.
     * 
     * @param computerLevel
     */
    public void setComputerLevel(java.lang.String computerLevel) {
        this.computerLevel = computerLevel;
    }


    /**
     * Gets the contractType value for this UserTeacher.
     * 
     * @return contractType
     */
    public java.lang.String getContractType() {
        return contractType;
    }


    /**
     * Sets the contractType value for this UserTeacher.
     * 
     * @param contractType
     */
    public void setContractType(java.lang.String contractType) {
        this.contractType = contractType;
    }


    /**
     * Gets the engageDt value for this UserTeacher.
     * 
     * @return engageDt
     */
    public java.util.Calendar getEngageDt() {
        return engageDt;
    }


    /**
     * Sets the engageDt value for this UserTeacher.
     * 
     * @param engageDt
     */
    public void setEngageDt(java.util.Calendar engageDt) {
        this.engageDt = engageDt;
    }


    /**
     * Gets the expertStage value for this UserTeacher.
     * 
     * @return expertStage
     */
    public java.lang.String getExpertStage() {
        return expertStage;
    }


    /**
     * Sets the expertStage value for this UserTeacher.
     * 
     * @param expertStage
     */
    public void setExpertStage(java.lang.String expertStage) {
        this.expertStage = expertStage;
    }


    /**
     * Gets the expertSubject value for this UserTeacher.
     * 
     * @return expertSubject
     */
    public java.lang.String getExpertSubject() {
        return expertSubject;
    }


    /**
     * Sets the expertSubject value for this UserTeacher.
     * 
     * @param expertSubject
     */
    public void setExpertSubject(java.lang.String expertSubject) {
        this.expertSubject = expertSubject;
    }


    /**
     * Gets the foreignLevel value for this UserTeacher.
     * 
     * @return foreignLevel
     */
    public java.lang.String getForeignLevel() {
        return foreignLevel;
    }


    /**
     * Sets the foreignLevel value for this UserTeacher.
     * 
     * @param foreignLevel
     */
    public void setForeignLevel(java.lang.String foreignLevel) {
        this.foreignLevel = foreignLevel;
    }


    /**
     * Gets the grantDt value for this UserTeacher.
     * 
     * @return grantDt
     */
    public java.util.Calendar getGrantDt() {
        return grantDt;
    }


    /**
     * Sets the grantDt value for this UserTeacher.
     * 
     * @param grantDt
     */
    public void setGrantDt(java.util.Calendar grantDt) {
        this.grantDt = grantDt;
    }


    /**
     * Gets the highCollege value for this UserTeacher.
     * 
     * @return highCollege
     */
    public java.lang.String getHighCollege() {
        return highCollege;
    }


    /**
     * Sets the highCollege value for this UserTeacher.
     * 
     * @param highCollege
     */
    public void setHighCollege(java.lang.String highCollege) {
        this.highCollege = highCollege;
    }


    /**
     * Gets the highDegree value for this UserTeacher.
     * 
     * @return highDegree
     */
    public java.lang.String getHighDegree() {
        return highDegree;
    }


    /**
     * Sets the highDegree value for this UserTeacher.
     * 
     * @param highDegree
     */
    public void setHighDegree(java.lang.String highDegree) {
        this.highDegree = highDegree;
    }


    /**
     * Gets the highDegreeCollege value for this UserTeacher.
     * 
     * @return highDegreeCollege
     */
    public java.lang.String getHighDegreeCollege() {
        return highDegreeCollege;
    }


    /**
     * Sets the highDegreeCollege value for this UserTeacher.
     * 
     * @param highDegreeCollege
     */
    public void setHighDegreeCollege(java.lang.String highDegreeCollege) {
        this.highDegreeCollege = highDegreeCollege;
    }


    /**
     * Gets the highDiploma value for this UserTeacher.
     * 
     * @return highDiploma
     */
    public java.lang.String getHighDiploma() {
        return highDiploma;
    }


    /**
     * Sets the highDiploma value for this UserTeacher.
     * 
     * @param highDiploma
     */
    public void setHighDiploma(java.lang.String highDiploma) {
        this.highDiploma = highDiploma;
    }


    /**
     * Gets the highSubject value for this UserTeacher.
     * 
     * @return highSubject
     */
    public java.lang.String getHighSubject() {
        return highSubject;
    }


    /**
     * Sets the highSubject value for this UserTeacher.
     * 
     * @param highSubject
     */
    public void setHighSubject(java.lang.String highSubject) {
        this.highSubject = highSubject;
    }


    /**
     * Gets the homePage value for this UserTeacher.
     * 
     * @return homePage
     */
    public java.lang.String getHomePage() {
        return homePage;
    }


    /**
     * Sets the homePage value for this UserTeacher.
     * 
     * @param homePage
     */
    public void setHomePage(java.lang.String homePage) {
        this.homePage = homePage;
    }


    /**
     * Gets the insurance value for this UserTeacher.
     * 
     * @return insurance
     */
    public java.lang.String getInsurance() {
        return insurance;
    }


    /**
     * Sets the insurance value for this UserTeacher.
     * 
     * @param insurance
     */
    public void setInsurance(java.lang.String insurance) {
        this.insurance = insurance;
    }


    /**
     * Gets the jobCategory value for this UserTeacher.
     * 
     * @return jobCategory
     */
    public java.lang.String getJobCategory() {
        return jobCategory;
    }


    /**
     * Sets the jobCategory value for this UserTeacher.
     * 
     * @param jobCategory
     */
    public void setJobCategory(java.lang.String jobCategory) {
        this.jobCategory = jobCategory;
    }


    /**
     * Gets the jobLevel value for this UserTeacher.
     * 
     * @return jobLevel
     */
    public java.lang.String getJobLevel() {
        return jobLevel;
    }


    /**
     * Sets the jobLevel value for this UserTeacher.
     * 
     * @param jobLevel
     */
    public void setJobLevel(java.lang.String jobLevel) {
        this.jobLevel = jobLevel;
    }


    /**
     * Gets the orgWork value for this UserTeacher.
     * 
     * @return orgWork
     */
    public java.lang.String getOrgWork() {
        return orgWork;
    }


    /**
     * Sets the orgWork value for this UserTeacher.
     * 
     * @param orgWork
     */
    public void setOrgWork(java.lang.String orgWork) {
        this.orgWork = orgWork;
    }


    /**
     * Gets the position value for this UserTeacher.
     * 
     * @return position
     */
    public java.lang.String getPosition() {
        return position;
    }


    /**
     * Sets the position value for this UserTeacher.
     * 
     * @param position
     */
    public void setPosition(java.lang.String position) {
        this.position = position;
    }


    /**
     * Gets the postType value for this UserTeacher.
     * 
     * @return postType
     */
    public java.math.BigDecimal getPostType() {
        return postType;
    }


    /**
     * Sets the postType value for this UserTeacher.
     * 
     * @param postType
     */
    public void setPostType(java.math.BigDecimal postType) {
        this.postType = postType;
    }


    /**
     * Gets the receiveTrain value for this UserTeacher.
     * 
     * @return receiveTrain
     */
    public java.lang.String getReceiveTrain() {
        return receiveTrain;
    }


    /**
     * Sets the receiveTrain value for this UserTeacher.
     * 
     * @param receiveTrain
     */
    public void setReceiveTrain(java.lang.String receiveTrain) {
        this.receiveTrain = receiveTrain;
    }


    /**
     * Gets the retiredDt value for this UserTeacher.
     * 
     * @return retiredDt
     */
    public java.util.Calendar getRetiredDt() {
        return retiredDt;
    }


    /**
     * Sets the retiredDt value for this UserTeacher.
     * 
     * @param retiredDt
     */
    public void setRetiredDt(java.util.Calendar retiredDt) {
        this.retiredDt = retiredDt;
    }


    /**
     * Gets the salary value for this UserTeacher.
     * 
     * @return salary
     */
    public java.lang.String getSalary() {
        return salary;
    }


    /**
     * Sets the salary value for this UserTeacher.
     * 
     * @param salary
     */
    public void setSalary(java.lang.String salary) {
        this.salary = salary;
    }


    /**
     * Gets the studentFree value for this UserTeacher.
     * 
     * @return studentFree
     */
    public java.lang.String getStudentFree() {
        return studentFree;
    }


    /**
     * Sets the studentFree value for this UserTeacher.
     * 
     * @param studentFree
     */
    public void setStudentFree(java.lang.String studentFree) {
        this.studentFree = studentFree;
    }


    /**
     * Gets the teachStage value for this UserTeacher.
     * 
     * @return teachStage
     */
    public java.lang.String getTeachStage() {
        return teachStage;
    }


    /**
     * Sets the teachStage value for this UserTeacher.
     * 
     * @param teachStage
     */
    public void setTeachStage(java.lang.String teachStage) {
        this.teachStage = teachStage;
    }


    /**
     * Gets the teachSubject value for this UserTeacher.
     * 
     * @return teachSubject
     */
    public java.lang.String getTeachSubject() {
        return teachSubject;
    }


    /**
     * Sets the teachSubject value for this UserTeacher.
     * 
     * @param teachSubject
     */
    public void setTeachSubject(java.lang.String teachSubject) {
        this.teachSubject = teachSubject;
    }


    /**
     * Gets the teacherCollege value for this UserTeacher.
     * 
     * @return teacherCollege
     */
    public java.lang.String getTeacherCollege() {
        return teacherCollege;
    }


    /**
     * Sets the teacherCollege value for this UserTeacher.
     * 
     * @param teacherCollege
     */
    public void setTeacherCollege(java.lang.String teacherCollege) {
        this.teacherCollege = teacherCollege;
    }


    /**
     * Gets the teacherNo value for this UserTeacher.
     * 
     * @return teacherNo
     */
    public java.lang.String getTeacherNo() {
        return teacherNo;
    }


    /**
     * Sets the teacherNo value for this UserTeacher.
     * 
     * @param teacherNo
     */
    public void setTeacherNo(java.lang.String teacherNo) {
        this.teacherNo = teacherNo;
    }


    /**
     * Gets the teacherSpecial value for this UserTeacher.
     * 
     * @return teacherSpecial
     */
    public java.lang.String getTeacherSpecial() {
        return teacherSpecial;
    }


    /**
     * Sets the teacherSpecial value for this UserTeacher.
     * 
     * @param teacherSpecial
     */
    public void setTeacherSpecial(java.lang.String teacherSpecial) {
        this.teacherSpecial = teacherSpecial;
    }


    /**
     * Gets the techDuty value for this UserTeacher.
     * 
     * @return techDuty
     */
    public java.lang.String getTechDuty() {
        return techDuty;
    }


    /**
     * Sets the techDuty value for this UserTeacher.
     * 
     * @param techDuty
     */
    public void setTechDuty(java.lang.String techDuty) {
        this.techDuty = techDuty;
    }


    /**
     * Gets the title value for this UserTeacher.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this UserTeacher.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the titleDt value for this UserTeacher.
     * 
     * @return titleDt
     */
    public java.util.Calendar getTitleDt() {
        return titleDt;
    }


    /**
     * Sets the titleDt value for this UserTeacher.
     * 
     * @param titleDt
     */
    public void setTitleDt(java.util.Calendar titleDt) {
        this.titleDt = titleDt;
    }


    /**
     * Gets the trainName value for this UserTeacher.
     * 
     * @return trainName
     */
    public java.lang.String getTrainName() {
        return trainName;
    }


    /**
     * Sets the trainName value for this UserTeacher.
     * 
     * @param trainName
     */
    public void setTrainName(java.lang.String trainName) {
        this.trainName = trainName;
    }


    /**
     * Gets the trainUnit value for this UserTeacher.
     * 
     * @return trainUnit
     */
    public java.lang.String getTrainUnit() {
        return trainUnit;
    }


    /**
     * Sets the trainUnit value for this UserTeacher.
     * 
     * @param trainUnit
     */
    public void setTrainUnit(java.lang.String trainUnit) {
        this.trainUnit = trainUnit;
    }


    /**
     * Gets the userId value for this UserTeacher.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UserTeacher.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the workDt value for this UserTeacher.
     * 
     * @return workDt
     */
    public java.util.Calendar getWorkDt() {
        return workDt;
    }


    /**
     * Sets the workDt value for this UserTeacher.
     * 
     * @param workDt
     */
    public void setWorkDt(java.util.Calendar workDt) {
        this.workDt = workDt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserTeacher)) return false;
        UserTeacher other = (UserTeacher) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adminDuty==null && other.getAdminDuty()==null) || 
             (this.adminDuty!=null &&
              this.adminDuty.equals(other.getAdminDuty()))) &&
            ((this.certDt==null && other.getCertDt()==null) || 
             (this.certDt!=null &&
              this.certDt.equals(other.getCertDt()))) &&
            ((this.certNo==null && other.getCertNo()==null) || 
             (this.certNo!=null &&
              this.certNo.equals(other.getCertNo()))) &&
            ((this.certPeriod==null && other.getCertPeriod()==null) || 
             (this.certPeriod!=null &&
              this.certPeriod.equals(other.getCertPeriod()))) &&
            ((this.certSubject==null && other.getCertSubject()==null) || 
             (this.certSubject!=null &&
              this.certSubject.equals(other.getCertSubject()))) &&
            ((this.certType==null && other.getCertType()==null) || 
             (this.certType!=null &&
              this.certType.equals(other.getCertType()))) &&
            ((this.certUnit==null && other.getCertUnit()==null) || 
             (this.certUnit!=null &&
              this.certUnit.equals(other.getCertUnit()))) &&
            ((this.chineseLevel==null && other.getChineseLevel()==null) || 
             (this.chineseLevel!=null &&
              this.chineseLevel.equals(other.getChineseLevel()))) &&
            ((this.computerLevel==null && other.getComputerLevel()==null) || 
             (this.computerLevel!=null &&
              this.computerLevel.equals(other.getComputerLevel()))) &&
            ((this.contractType==null && other.getContractType()==null) || 
             (this.contractType!=null &&
              this.contractType.equals(other.getContractType()))) &&
            ((this.engageDt==null && other.getEngageDt()==null) || 
             (this.engageDt!=null &&
              this.engageDt.equals(other.getEngageDt()))) &&
            ((this.expertStage==null && other.getExpertStage()==null) || 
             (this.expertStage!=null &&
              this.expertStage.equals(other.getExpertStage()))) &&
            ((this.expertSubject==null && other.getExpertSubject()==null) || 
             (this.expertSubject!=null &&
              this.expertSubject.equals(other.getExpertSubject()))) &&
            ((this.foreignLevel==null && other.getForeignLevel()==null) || 
             (this.foreignLevel!=null &&
              this.foreignLevel.equals(other.getForeignLevel()))) &&
            ((this.grantDt==null && other.getGrantDt()==null) || 
             (this.grantDt!=null &&
              this.grantDt.equals(other.getGrantDt()))) &&
            ((this.highCollege==null && other.getHighCollege()==null) || 
             (this.highCollege!=null &&
              this.highCollege.equals(other.getHighCollege()))) &&
            ((this.highDegree==null && other.getHighDegree()==null) || 
             (this.highDegree!=null &&
              this.highDegree.equals(other.getHighDegree()))) &&
            ((this.highDegreeCollege==null && other.getHighDegreeCollege()==null) || 
             (this.highDegreeCollege!=null &&
              this.highDegreeCollege.equals(other.getHighDegreeCollege()))) &&
            ((this.highDiploma==null && other.getHighDiploma()==null) || 
             (this.highDiploma!=null &&
              this.highDiploma.equals(other.getHighDiploma()))) &&
            ((this.highSubject==null && other.getHighSubject()==null) || 
             (this.highSubject!=null &&
              this.highSubject.equals(other.getHighSubject()))) &&
            ((this.homePage==null && other.getHomePage()==null) || 
             (this.homePage!=null &&
              this.homePage.equals(other.getHomePage()))) &&
            ((this.insurance==null && other.getInsurance()==null) || 
             (this.insurance!=null &&
              this.insurance.equals(other.getInsurance()))) &&
            ((this.jobCategory==null && other.getJobCategory()==null) || 
             (this.jobCategory!=null &&
              this.jobCategory.equals(other.getJobCategory()))) &&
            ((this.jobLevel==null && other.getJobLevel()==null) || 
             (this.jobLevel!=null &&
              this.jobLevel.equals(other.getJobLevel()))) &&
            ((this.orgWork==null && other.getOrgWork()==null) || 
             (this.orgWork!=null &&
              this.orgWork.equals(other.getOrgWork()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.postType==null && other.getPostType()==null) || 
             (this.postType!=null &&
              this.postType.equals(other.getPostType()))) &&
            ((this.receiveTrain==null && other.getReceiveTrain()==null) || 
             (this.receiveTrain!=null &&
              this.receiveTrain.equals(other.getReceiveTrain()))) &&
            ((this.retiredDt==null && other.getRetiredDt()==null) || 
             (this.retiredDt!=null &&
              this.retiredDt.equals(other.getRetiredDt()))) &&
            ((this.salary==null && other.getSalary()==null) || 
             (this.salary!=null &&
              this.salary.equals(other.getSalary()))) &&
            ((this.studentFree==null && other.getStudentFree()==null) || 
             (this.studentFree!=null &&
              this.studentFree.equals(other.getStudentFree()))) &&
            ((this.teachStage==null && other.getTeachStage()==null) || 
             (this.teachStage!=null &&
              this.teachStage.equals(other.getTeachStage()))) &&
            ((this.teachSubject==null && other.getTeachSubject()==null) || 
             (this.teachSubject!=null &&
              this.teachSubject.equals(other.getTeachSubject()))) &&
            ((this.teacherCollege==null && other.getTeacherCollege()==null) || 
             (this.teacherCollege!=null &&
              this.teacherCollege.equals(other.getTeacherCollege()))) &&
            ((this.teacherNo==null && other.getTeacherNo()==null) || 
             (this.teacherNo!=null &&
              this.teacherNo.equals(other.getTeacherNo()))) &&
            ((this.teacherSpecial==null && other.getTeacherSpecial()==null) || 
             (this.teacherSpecial!=null &&
              this.teacherSpecial.equals(other.getTeacherSpecial()))) &&
            ((this.techDuty==null && other.getTechDuty()==null) || 
             (this.techDuty!=null &&
              this.techDuty.equals(other.getTechDuty()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.titleDt==null && other.getTitleDt()==null) || 
             (this.titleDt!=null &&
              this.titleDt.equals(other.getTitleDt()))) &&
            ((this.trainName==null && other.getTrainName()==null) || 
             (this.trainName!=null &&
              this.trainName.equals(other.getTrainName()))) &&
            ((this.trainUnit==null && other.getTrainUnit()==null) || 
             (this.trainUnit!=null &&
              this.trainUnit.equals(other.getTrainUnit()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.workDt==null && other.getWorkDt()==null) || 
             (this.workDt!=null &&
              this.workDt.equals(other.getWorkDt())));
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
        if (getAdminDuty() != null) {
            _hashCode += getAdminDuty().hashCode();
        }
        if (getCertDt() != null) {
            _hashCode += getCertDt().hashCode();
        }
        if (getCertNo() != null) {
            _hashCode += getCertNo().hashCode();
        }
        if (getCertPeriod() != null) {
            _hashCode += getCertPeriod().hashCode();
        }
        if (getCertSubject() != null) {
            _hashCode += getCertSubject().hashCode();
        }
        if (getCertType() != null) {
            _hashCode += getCertType().hashCode();
        }
        if (getCertUnit() != null) {
            _hashCode += getCertUnit().hashCode();
        }
        if (getChineseLevel() != null) {
            _hashCode += getChineseLevel().hashCode();
        }
        if (getComputerLevel() != null) {
            _hashCode += getComputerLevel().hashCode();
        }
        if (getContractType() != null) {
            _hashCode += getContractType().hashCode();
        }
        if (getEngageDt() != null) {
            _hashCode += getEngageDt().hashCode();
        }
        if (getExpertStage() != null) {
            _hashCode += getExpertStage().hashCode();
        }
        if (getExpertSubject() != null) {
            _hashCode += getExpertSubject().hashCode();
        }
        if (getForeignLevel() != null) {
            _hashCode += getForeignLevel().hashCode();
        }
        if (getGrantDt() != null) {
            _hashCode += getGrantDt().hashCode();
        }
        if (getHighCollege() != null) {
            _hashCode += getHighCollege().hashCode();
        }
        if (getHighDegree() != null) {
            _hashCode += getHighDegree().hashCode();
        }
        if (getHighDegreeCollege() != null) {
            _hashCode += getHighDegreeCollege().hashCode();
        }
        if (getHighDiploma() != null) {
            _hashCode += getHighDiploma().hashCode();
        }
        if (getHighSubject() != null) {
            _hashCode += getHighSubject().hashCode();
        }
        if (getHomePage() != null) {
            _hashCode += getHomePage().hashCode();
        }
        if (getInsurance() != null) {
            _hashCode += getInsurance().hashCode();
        }
        if (getJobCategory() != null) {
            _hashCode += getJobCategory().hashCode();
        }
        if (getJobLevel() != null) {
            _hashCode += getJobLevel().hashCode();
        }
        if (getOrgWork() != null) {
            _hashCode += getOrgWork().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getPostType() != null) {
            _hashCode += getPostType().hashCode();
        }
        if (getReceiveTrain() != null) {
            _hashCode += getReceiveTrain().hashCode();
        }
        if (getRetiredDt() != null) {
            _hashCode += getRetiredDt().hashCode();
        }
        if (getSalary() != null) {
            _hashCode += getSalary().hashCode();
        }
        if (getStudentFree() != null) {
            _hashCode += getStudentFree().hashCode();
        }
        if (getTeachStage() != null) {
            _hashCode += getTeachStage().hashCode();
        }
        if (getTeachSubject() != null) {
            _hashCode += getTeachSubject().hashCode();
        }
        if (getTeacherCollege() != null) {
            _hashCode += getTeacherCollege().hashCode();
        }
        if (getTeacherNo() != null) {
            _hashCode += getTeacherNo().hashCode();
        }
        if (getTeacherSpecial() != null) {
            _hashCode += getTeacherSpecial().hashCode();
        }
        if (getTechDuty() != null) {
            _hashCode += getTechDuty().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTitleDt() != null) {
            _hashCode += getTitleDt().hashCode();
        }
        if (getTrainName() != null) {
            _hashCode += getTrainName().hashCode();
        }
        if (getTrainUnit() != null) {
            _hashCode += getTrainUnit().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getWorkDt() != null) {
            _hashCode += getWorkDt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserTeacher.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://glpt.gdjxjy.com.cn", "userTeacher"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminDuty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adminDuty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chineseLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chineseLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computerLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "computerLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engageDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "engageDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expertStage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expertStage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expertSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expertSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grantDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highCollege");
        elemField.setXmlName(new javax.xml.namespace.QName("", "highCollege"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highDegree");
        elemField.setXmlName(new javax.xml.namespace.QName("", "highDegree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highDegreeCollege");
        elemField.setXmlName(new javax.xml.namespace.QName("", "highDegreeCollege"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highDiploma");
        elemField.setXmlName(new javax.xml.namespace.QName("", "highDiploma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "highSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insurance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insurance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgWork");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveTrain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiveTrain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retiredDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retiredDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studentFree");
        elemField.setXmlName(new javax.xml.namespace.QName("", "studentFree"));
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
        elemField.setFieldName("teacherCollege");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teacherCollege"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teacherNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teacherNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teacherSpecial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teacherSpecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("techDuty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "techDuty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titleDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trainUnit"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
