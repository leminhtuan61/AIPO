package fa.training.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author TuanLM16
 *
 * vip pzo 123
 */
@Entity
@Table(name = "turbine_group")
public class TurbineGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "group_id")
	private int groupId;
	@Column(name = "object_data")
	private byte objectData;
	@Column(name = "owner_id")
	private int ownerId;
	@Column(name = "group_alias_name")
	private String groupAliasName;
	@Column(name = "public_flag")
	private String publicFlag;
	@OneToOne
	@JoinColumn(name = "group_name")
	private EipMPost eipMPost;

	/**
	 * 
	 */
	public TurbineGroup() {
		super();
	}

	/**
	 * @param groupName
	 * @param objectData
	 * @param ownerId
	 * @param groupAliasName
	 * @param publicFlag
	 * @param eipMPost
	 */
	public TurbineGroup(byte objectData, int ownerId, String groupAliasName, String publicFlag, EipMPost eipMPost) {
		super();

		this.objectData = objectData;
		this.ownerId = ownerId;
		this.groupAliasName = groupAliasName;
		this.publicFlag = publicFlag;
		this.eipMPost = eipMPost;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public byte getObjectData() {
		return objectData;
	}

	public void setObjectData(byte objectData) {
		this.objectData = objectData;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getGroupAliasName() {
		return groupAliasName;
	}

	public void setGroupAliasName(String groupAliasName) {
		this.groupAliasName = groupAliasName;
	}

	public String getPublicFlag() {
		return publicFlag;
	}

	public void setPublicFlag(String publicFlag) {
		this.publicFlag = publicFlag;
	}

	public EipMPost getEipMPost() {
		return eipMPost;
	}

	public void setEipMPost(EipMPost eipMPost) {
		this.eipMPost = eipMPost;
	}

	@Override
	public String toString() {
		return "TurbineGroup [groupId=" + groupId + ", objectData=" + objectData + ", ownerId=" + ownerId
				+ ", groupAliasName=" + groupAliasName + ", publicFlag=" + publicFlag + ", eipMPost=" + eipMPost + "]";
	}
	

}
