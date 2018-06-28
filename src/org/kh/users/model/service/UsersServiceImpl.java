package org.kh.users.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.kh.common.SQLsessionTemplate;
import org.kh.users.model.dao.UsersDAOImpl;
import org.kh.users.model.vo.CheckVo;
import org.kh.users.model.vo.SearchVo;
import org.kh.users.model.vo.UserVo;

public class UsersServiceImpl implements UsersService {

	public UsersServiceImpl() {
	}

	@Override
	public ArrayList<UserVo> checkUserList(CheckVo check) {
		SqlSession session = SQLsessionTemplate.getSqlSession();
		ArrayList<UserVo> aList = new UsersDAOImpl().checkUserList(session, check);
		return aList;
	}

	@Override
	public ArrayList<UserVo> searchUserList(SearchVo sv) {
		SqlSession session = SQLsessionTemplate.getSqlSession();
		ArrayList<UserVo> aList = new UsersDAOImpl().searchUserList(session, sv);
		return aList;
	}

	@Override
	public ArrayList<UserVo> search2UserList(UserVo uv) {
		SqlSession session = SQLsessionTemplate.getSqlSession();
		ArrayList<UserVo> aList = new UsersDAOImpl().search2UserList(session, uv);
		return aList;
	}

	@Override
	public ArrayList<UserVo> search3UserList(String[] check) {
		SqlSession session = SQLsessionTemplate.getSqlSession();
		ArrayList<UserVo> aList = new UsersDAOImpl().search3UserList(session, check);
		return aList;
	}

}
