package fa.training.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author TuanLM16
 *
 * vip pzo 123
 */
@Entity
@Table(name = "eip_m_company")
public class EipMCompany {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
	private int companyId;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "company_name_kana")
	private String companyNameKana;
	@Column(name = "zipcode")
	private String zipcode;
	@Column(name = "address")
	private String address;
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "fax_number")
	private String faxNumber;
	@Column(name = "url")
	private String url;
	@Column(name = "ipaddress")
	private String ipaddress;
	@Column(name = "port")
	private Integer port;
	@Column(name = "ipaddress_internal")
	private String ipaddressInternal;
	@Column(name = "port_internal")
	private String portInternal;
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "update_date")
	private Date updateDate;
	@OneToMany(mappedBy = "eipMCompany")
	private List<TurbineUser> tubineUsers;
	@OneToMany(mappedBy = "eipMCompany")
	private List<EipMPost> eipMPosts;

	/**
	 * 
	 */
	public EipMCompany() {
		super();
	}

	/**
	 * @param companyName
	 * @param companyNameKana
	 * @param zipcode
	 * @param address
	 * @param telephone
	 * @param faxNumber
	 * @param url
	 * @param ipaddress
	 * @param port
	 * @param portInternal
	 * @param createDate
	 * @param updateDate
	 * @param tubineUsers
	 */

	public String getIpaddressInternal() {
		return ipaddressInternal;
	}

	/**
	 * @param companyName
	 * @param companyNameKana
	 * @param zipcode
	 * @param address
	 * @param telephone
	 * @param faxNumber
	 * @param url
	 * @param ipaddress
	 * @param port
	 * @param ipaddressInternal
	 * @param portInternal
	 * @param createDate
	 * @param updateDate
	 * @param tubineUsers
	 * @param eipMPosts
	 */
	public EipMCompany(String companyName, String companyNameKana, String zipcode, String address, String telephone,
			String faxNumber, String url, String ipaddress, Integer port, String ipaddressInternal, String portInternal,
			Date createDate, Date updateDate, List<TurbineUser> tubineUsers, List<EipMPost> eipMPosts) {
		super();
		this.companyName = companyName;
		this.companyNameKana = companyNameKana;
		this.zipcode = zipcode;
		this.address = address;
		this.telephone = telephone;
		this.faxNumber = faxNumber;
		this.url = url;
		this.ipaddress = ipaddress;
		this.port = port;
		this.ipaddressInternal = ipaddressInternal;
		this.portInternal = portInternal;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.tubineUsers = tubineUsers;
		this.eipMPosts = eipMPosts;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyNameKana() {
		return companyNameKana;
	}

	public void setCompanyNameKana(String companyNameKana) {
		this.companyNameKana = companyNameKana;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getPortInternal() {
		return portInternal;
	}

	public void setPortInternal(String portInternal) {
		this.portInternal = portInternal;
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

	public List<TurbineUser> getTubineUsers() {
		return tubineUsers;
	}

	public void setTubineUsers(List<TurbineUser> tubineUsers) {
		this.tubineUsers = tubineUsers;
	}

	public List<EipMPost> getEipMPosts() {
		return eipMPosts;
	}

	public void setEipMPosts(List<EipMPost> eipMPosts) {
		this.eipMPosts = eipMPosts;
	}

	public void setIpaddressInternal(String ipaddressInternal) {
		this.ipaddressInternal = ipaddressInternal;
	}

	@Override
	public String toString() {
		return "EipMCompany [companyId=" + companyId + ", companyName=" + companyName + ", companyNameKana="
				+ companyNameKana + ", zipcode=" + zipcode + ", address=" + address + ", telephone=" + telephone
				+ ", faxNumber=" + faxNumber + ", url=" + url + ", ipaddress=" + ipaddress + ", port=" + port
				+ ", ipaddressInternal=" + ipaddressInternal + ", portInternal=" + portInternal + ", createDate="
				+ createDate + ", updateDate=" + updateDate + ", tubineUsers=" + tubineUsers + ", eipMPosts="
				+ eipMPosts + "]";
	}

	/**
	 * @param companyName
	 * @param companyNameKana
	 * @param zipcode
	 * @param address
	 * @param telephone
	 * @param faxNumber
	 * @param url
	 * @param ipaddress
	 * @param port
	 * @param ipaddressInternal
	 * @param portInternal
	 * @param createDate
	 * @param updateDate
	 * @param tubineUsers
	 */
	

}
