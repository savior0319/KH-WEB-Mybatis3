package org.kh.users.model.vo;

public class CheckVo {

	private String chId, chPw, chName, chAddr;

	public CheckVo() {
	}

	public CheckVo(String chId, String chPw, String chName, String chAddr) {
		super();
		this.chId = chId;
		this.chPw = chPw;
		this.chName = chName;
		this.chAddr = chAddr;
	}

	@Override
	public String toString() {
		return "Check [chId=" + chId + ", chPw=" + chPw + ", chName=" + chName + ", chAddr=" + chAddr + "]";
	}

	public String getChId() {
		return chId;
	}

	public void setChId(String chId) {
		this.chId = chId;
	}

	public String getChPw() {
		return chPw;
	}

	public void setChPw(String chPw) {
		this.chPw = chPw;
	}

	public String getChName() {
		return chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}

	public String getChAddr() {
		return chAddr;
	}

	public void setChAddr(String chAddr) {
		this.chAddr = chAddr;
	}
}
