package fa.training.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author TuanLM16
 *
 * vip pzo 123
 */
@Entity
@Table(name = "turbine_user")
public class TurbineUser {
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(name = "login_name")
	private String loginName;
	@Column(name = "password_value")
	private String passwordValue;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "confirm_value")
	private String confirmValue;
	@Column(name = "modified")
	private Date modified;
	@Column(name = "created")
	private Date created;
	@Column(name = "last_login")
	private Date lastLogin;
	@Column(name = "disabled")
	private String disabled;
	@Column(name = "object_data")
	private String objectData;
	@Column(name = "password_changed")
	private Date passwordChanged;
	@ManyToOne
	@JoinColumn(name = "company_id")
	private EipMCompany eipMCompany;
	@ManyToOne
	@JoinColumn(name = "position_id")
	private EipMPosition eipMPosition;
	@Column(name = "in_telephone")
	private String inTelephone;
	@Column(name = "out_telephone")
	private String outTelephone;
	@Column(name = "cellular_phone")
	private String cellularPhone;
	@Column(name = "cellular_email")
	private String cellularEmail;
	@Column(name = "cellular_uid")
	private String cellularUid;
	@Column(name = "first_name_kana")
	private String firstNameKana;
	@Column(name = "last_name_kana")
	private String lastNameKana;
	@Column(name = "photo")
	private String photo;
	@Column(name = "has_photo")
	private String hasPhoto;
	@Column(name = "has_photo_smartphone")
	private String hasPhotoSmartPhone;
	@Column(name = "photo_modified_smartphone")
	private Date photoModifiedSmartPhone;
	@Column(name = "tutorial_forbid")
	private String tutorialForbid;
	@Column(name = "migrate_version")
	private String migrateVersion;
	@Column(name = "created_user_id")
	private Integer createdUserId;
	@Column(name = "updated_user_id")
	private Integer updatedUserId;
	@Column(name = "departments")
	private String[] departments;

	/**
	 * 
	 */
	public TurbineUser() {
		super();
	}

	/**
	 * @param loginName
	 * @param passwordValue
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param confirmValue
	 * @param modified
	 * @param created
	 * @param lastLogin
	 * @param disabled
	 * @param objectData
	 * @param passwordChanged
	 * @param eipMCompany
	 * @param eipMPosition
	 * @param inTelephone
	 * @param outTelephone
	 * @param cellularPhone
	 * @param cellularEmail
	 * @param cellularUid
	 * @param firstNameKana
	 * @param lastNameKana
	 * @param photo
	 * @param hasPhoto
	 * @param hasPhotoSmartPhone
	 * @param photoModifiedSmartPhone
	 * @param tutorialForbid
	 * @param migrateVersion
	 * @param createdUserId
	 * @param updatedUserId
	 */

	public int getUserId() {
		return userId;
	}

	/**
	 * @param loginName
	 * @param passwordValue
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param confirmValue
	 * @param modified
	 * @param created
	 * @param lastLogin
	 * @param disabled
	 * @param objectData
	 * @param passwordChanged
	 * @param eipMCompany
	 * @param eipMPosition
	 * @param inTelephone
	 * @param outTelephone
	 * @param cellularPhone
	 * @param cellularEmail
	 * @param cellularUid
	 * @param firstNameKana
	 * @param lastNameKana
	 * @param photo
	 * @param hasPhoto
	 * @param hasPhotoSmartPhone
	 * @param photoModifiedSmartPhone
	 * @param tutorialForbid
	 * @param migrateVersion
	 * @param createdUserId
	 * @param updatedUserId
	 * @param departments
	 */
	public TurbineUser(String loginName, String passwordValue, String firstName, String lastName, String email,
			String confirmValue, Date modified, Date created, Date lastLogin, String disabled, String objectData,
			Date passwordChanged, EipMCompany eipMCompany, EipMPosition eipMPosition, String inTelephone,
			String outTelephone, String cellularPhone, String cellularEmail, String cellularUid, String firstNameKana,
			String lastNameKana, String photo, String hasPhoto, String hasPhotoSmartPhone, Date photoModifiedSmartPhone,
			String tutorialForbid, String migrateVersion, Integer createdUserId, Integer updatedUserId,
			String[] departments) {
		super();
		this.loginName = loginName;
		this.passwordValue = passwordValue;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.confirmValue = confirmValue;
		this.modified = modified;
		this.created = created;
		this.lastLogin = lastLogin;
		this.disabled = disabled;
		this.objectData = objectData;
		this.passwordChanged = passwordChanged;
		this.eipMCompany = eipMCompany;
		this.eipMPosition = eipMPosition;
		this.inTelephone = inTelephone;
		this.outTelephone = outTelephone;
		this.cellularPhone = cellularPhone;
		this.cellularEmail = cellularEmail;
		this.cellularUid = cellularUid;
		this.firstNameKana = firstNameKana;
		this.lastNameKana = lastNameKana;
		this.photo = photo;
		this.hasPhoto = hasPhoto;
		this.hasPhotoSmartPhone = hasPhotoSmartPhone;
		this.photoModifiedSmartPhone = photoModifiedSmartPhone;
		this.tutorialForbid = tutorialForbid;
		this.migrateVersion = migrateVersion;
		this.createdUserId = createdUserId;
		this.updatedUserId = updatedUserId;
		this.departments = departments;
	}

	public String[] getDepartments() {
		return departments;
	}

	public void setDepartments(String[] departments) {
		this.departments = departments;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPasswordValue() {
		return passwordValue;
	}

	public void setPasswordValue(String passwordValue) {
		this.passwordValue = passwordValue;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmValue() {
		return confirmValue;
	}

	public void setConfirmValue(String confirmValue) {
		this.confirmValue = confirmValue;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getDisabled() {
		return disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public String getObjectData() {
		return objectData;
	}

	public void setObjectData(String objectData) {
		this.objectData = objectData;
	}

	public Date getPasswordChanged() {
		return passwordChanged;
	}

	public void setPasswordChanged(Date passwordChanged) {
		this.passwordChanged = passwordChanged;
	}

	public EipMCompany getEipMCompany() {
		return eipMCompany;
	}

	public void setEipMCompany(EipMCompany eipMCompany) {
		this.eipMCompany = eipMCompany;
	}

	public EipMPosition getEipMPosition() {
		return eipMPosition;
	}

	public void setEipMPosition(EipMPosition eipMPosition) {
		this.eipMPosition = eipMPosition;
	}

	public String getInTelephone() {
		return inTelephone;
	}

	public void setInTelephone(String inTelephone) {
		this.inTelephone = inTelephone;
	}

	public String getOutTelephone() {
		return outTelephone;
	}

	public void setOutTelephone(String outTelephone) {
		this.outTelephone = outTelephone;
	}

	public String getCellularPhone() {
		return cellularPhone;
	}

	public void setCellularPhone(String cellularPhone) {
		this.cellularPhone = cellularPhone;
	}

	public String getCellularEmail() {
		return cellularEmail;
	}

	public void setCellularEmail(String cellularEmail) {
		this.cellularEmail = cellularEmail;
	}

	public String getCellularUid() {
		return cellularUid;
	}

	public void setCellularUid(String cellularUid) {
		this.cellularUid = cellularUid;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getLastNameKana() {
		return lastNameKana;
	}

	public void setLastNameKana(String lastNameKana) {
		this.lastNameKana = lastNameKana;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getHasPhoto() {
		return hasPhoto;
	}

	public void setHasPhoto(String hasPhoto) {
		this.hasPhoto = hasPhoto;
	}

	public String getHasPhotoSmartPhone() {
		return hasPhotoSmartPhone;
	}

	public void setHasPhotoSmartPhone(String hasPhotoSmartPhone) {
		this.hasPhotoSmartPhone = hasPhotoSmartPhone;
	}

	public Date getPhotoModifiedSmartPhone() {
		return photoModifiedSmartPhone;
	}

	public void setPhotoModifiedSmartPhone(Date photoModifiedSmartPhone) {
		this.photoModifiedSmartPhone = photoModifiedSmartPhone;
	}

	public String getTutorialForbid() {
		return tutorialForbid;
	}

	public void setTutorialForbid(String tutorialForbid) {
		this.tutorialForbid = tutorialForbid;
	}

	public String getMigrateVersion() {
		return migrateVersion;
	}

	public void setMigrateVersion(String migrateVersion) {
		this.migrateVersion = migrateVersion;
	}

	public Integer getCreatedUserId() {
		return createdUserId;
	}

	public void setCreatedUserId(Integer createdUserId) {
		this.createdUserId = createdUserId;
	}

	public Integer getUpdatedUserId() {
		return updatedUserId;
	}

	public void setUpdatedUserId(Integer updatedUserId) {
		this.updatedUserId = updatedUserId;
	}

	@Override
	public String toString() {
		return "TurbineUser [userId=" + userId + ", loginName=" + loginName + ", passwordValue=" + passwordValue
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", confirmValue="
				+ confirmValue + ", modified=" + modified + ", created=" + created + ", lastLogin=" + lastLogin
				+ ", disabled=" + disabled + ", objectData=" + objectData + ", passwordChanged=" + passwordChanged
				+ ", inTelephone=" + inTelephone + ", outTelephone=" + outTelephone + ", cellularPhone=" + cellularPhone
				+ ", cellularEmail=" + cellularEmail + ", cellularUid=" + cellularUid + ", firstNameKana="
				+ firstNameKana + ", lastNameKana=" + lastNameKana + ", photo=" + photo + ", hasPhoto=" + hasPhoto
				+ ", hasPhotoSmartPhone=" + hasPhotoSmartPhone + ", photoModifiedSmartPhone=" + photoModifiedSmartPhone
				+ ", tutorialForbid=" + tutorialForbid + ", migrateVersion=" + migrateVersion + ", createdUserId="
				+ createdUserId + ", updatedUserId=" + updatedUserId + "]";
	}

}
