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
@Table(name = "eip_m_position")
public class EipMPosition {
	@Id
	@Column(name = "position_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int positionId;
	@Column(name = "position_name")
	private String positionName;
	@Column(name = "sort")
	private String sort;
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "update_date")
	private Date updateDate;
	@Column(name = "role")
	private String roles;
	@OneToMany(mappedBy = "eipMPosition")
	private List<TurbineUser> tubineUsers;

	/**
	 * @param positionId
	 * @param positionName
	 * @param sort
	 * @param createDate
	 * @param updateDate
	 * @param tubineUsers
	 */
	public EipMPosition(int positionId, String positionName, String sort, Date createDate, Date updateDate,
			List<TurbineUser> tubineUsers) {
		super();
		this.positionId = positionId;
		this.positionName = positionName;
		this.sort = sort;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.tubineUsers = tubineUsers;
	}

	/**
	 * @param positionName
	 * @param sort
	 * @param createDate
	 * @param updateDate
	 * @param tubineUsers
	 */
	public EipMPosition(String positionName, String sort, Date createDate, Date updateDate,
			List<TurbineUser> tubineUsers) {
		super();
		this.positionName = positionName;
		this.sort = sort;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.tubineUsers = tubineUsers;
	}

	/**
	 * 
	 */
	public EipMPosition() {
		super();
	}
	

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
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

	public List<TurbineUser> getTubineUsers() {
		return tubineUsers;
	}

	public void setTubineUsers(List<TurbineUser> tubineUsers) {
		this.tubineUsers = tubineUsers;
	}

	@Override
	public String toString() {
		return "EipMPosition [positionId=" + positionId + ", positionName=" + positionName + ", sort=" + sort
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + ", tubineUsers=" + tubineUsers + "]";
	}

}
