package org.kh.users.model.vo;

import java.sql.Date;

public class UserVo {
	
	private int userNo;
	private String userId, userPw, userName, userAddr;
	private Date regDate;
	
	@Override
	public String toString() {
		return "UserVo [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName
				+ ", userAddr=" + userAddr + ", regDate=" + regDate + "]";
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public UserVo(int userNo, String userId, String userPw, String userName, String userAddr, Date regDate) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userAddr = userAddr;
		this.regDate = regDate;
	}



	public UserVo() {
	}
	
	
	
}
