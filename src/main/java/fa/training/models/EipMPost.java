package fa.training.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author TuanLM16
 *
 * vip pzo 123
 */
@Entity
@Table(name = "eip_m_post")
public class EipMPost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "post_id")
	private int postId;
	@Column(name = "post_name")
	private String postName;
	@Column(name = "zipcode")
	private String zipcode;
	@Column(name = "address")
	private String address;
	@Column(name = "in_telephone")
	private String inTelephone;
	@Column(name = "out_telephone")
	private String outTelephone;
	@Column(name = "fax_number")
	private String faxNumber;
	@Column(name = "group_name")
	private String groupName;
	@Column(name = "sort")
	private Integer sort;
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "update_date")
	private Date updateDate;
	@ManyToOne
	@JoinColumn(name = "company_id")
	private EipMCompany eipMCompany;
	@OneToOne(mappedBy = "eipMPost")
	private TurbineGroup turbineGroup;

	/**
	 * 
	 */
	public EipMPost() {
		super();
	}

	/**
	 * @param postName
	 * @param zipcode
	 * @param address
	 * @param inTelephone
	 * @param outTelephone
	 * @param faxNumber
	 * @param groupName
	 * @param sort
	 * @param createDate
	 * @param updateDate
	 * @param eipMCompanies
	 */

	public int getPostId() {
		return postId;
	}

	/**
	 * @param postName
	 * @param zipcode
	 * @param address
	 * @param inTelephone
	 * @param outTelephone
	 * @param faxNumber
	 * @param groupName
	 * @param sort
	 * @param createDate
	 * @param updateDate
	 * @param eipMCompany
	 */
	public EipMPost(String postName, String zipcode, String address, String inTelephone, String outTelephone,
			String faxNumber, String groupName, Integer sort, Date createDate, Date updateDate,
			EipMCompany eipMCompany) {
		super();
		this.postName = postName;
		this.zipcode = zipcode;
		this.address = address;
		this.inTelephone = inTelephone;
		this.outTelephone = outTelephone;
		this.faxNumber = faxNumber;
		this.groupName = groupName;
		this.sort = sort;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.eipMCompany = eipMCompany;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public EipMCompany getEipMCompany() {
		return eipMCompany;
	}

	public void setEipMCompany(EipMCompany eipMCompany) {
		this.eipMCompany = eipMCompany;
	}

	@Override
	public String toString() {
		return "EipMPost [postId=" + postId + ", postName=" + postName + ", zipcode=" + zipcode + ", address=" + address
				+ ", inTelephone=" + inTelephone + ", outTelephone=" + outTelephone + ", faxNumber=" + faxNumber
				+ ", groupName=" + groupName + ", sort=" + sort + ", createDate=" + createDate + ", updateDate="
				+ updateDate + ", eipMCompany=" + eipMCompany + ", turbineGroup=" + turbineGroup + "]";
	}
	

}
