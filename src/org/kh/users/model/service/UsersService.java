package org.kh.users.model.service;

import java.util.ArrayList;

import org.kh.users.model.vo.CheckVo;
import org.kh.users.model.vo.SearchVo;
import org.kh.users.model.vo.UserVo;

public interface UsersService {
	public ArrayList<UserVo> checkUserList(CheckVo check);

	public ArrayList<UserVo> searchUserList(SearchVo sv);

	public ArrayList<UserVo> search2UserList(UserVo uv);

	ArrayList<UserVo> search3UserList(String[] check);
}
