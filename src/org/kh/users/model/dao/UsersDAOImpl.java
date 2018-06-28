package org.kh.users.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kh.users.model.vo.CheckVo;
import org.kh.users.model.vo.SearchVo;
import org.kh.users.model.vo.UserVo;

@SuppressWarnings("all")
public class UsersDAOImpl implements UsersDAO {

	public UsersDAOImpl() {
	}

	@Override
	public ArrayList<UserVo> checkUserList(SqlSession session, CheckVo check) {
		List list = session.selectList("users.checkList", check);
		return (ArrayList<UserVo>) list;
	}

	@Override
	public ArrayList<UserVo> searchUserList(SqlSession session, SearchVo sv) {
		List list = session.selectList("users.searchList", sv);
		return (ArrayList<UserVo>) list;
	}

	@Override
	public ArrayList<UserVo> search2UserList(SqlSession session, UserVo uv) {
		List list = session.selectList("users.search2List", uv);
		return (ArrayList<UserVo>) list;
	}

	@Override
	public ArrayList<UserVo> search3UserList(SqlSession session, String[] check) {
		List list = session.selectList("users.search3List", check);
		return (ArrayList<UserVo>) list;
	}

}
