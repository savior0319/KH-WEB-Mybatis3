package org.kh.users.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.kh.users.model.vo.CheckVo;
import org.kh.users.model.vo.SearchVo;
import org.kh.users.model.vo.UserVo;

public interface UsersDAO {
	public ArrayList<UserVo> checkUserList(SqlSession session, CheckVo check);

	public ArrayList<UserVo> searchUserList(SqlSession session, SearchVo sv);

	public ArrayList<UserVo> search2UserList(SqlSession session, UserVo uv);

	ArrayList<UserVo> search3UserList(SqlSession session, String[] check);
}
