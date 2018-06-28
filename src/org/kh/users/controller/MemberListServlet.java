package org.kh.users.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.users.model.service.UsersServiceImpl;
import org.kh.users.model.vo.CheckVo;
import org.kh.users.model.vo.UserVo;

@WebServlet(name = "MemberList", urlPatterns = { "/memberList" })
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getParameter("utf-8");

		String chId = request.getParameter("chId");
		String chPw = request.getParameter("chPw");
		String chName = request.getParameter("chName");
		String chAddr = request.getParameter("chAddr");

		CheckVo cv = new CheckVo(chId, chPw, chName, chAddr);

		ArrayList<UserVo> aList = new UsersServiceImpl().checkUserList(cv);

		response.setContentType("text/html; charset=utf-8");
		if (!aList.isEmpty()) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/users/checkList.jsp");
			request.setAttribute("list", aList);
			dispatcher.forward(request, response);
		} else {
			response.getWriter().println("읽어오기 실패");
		}

		// String[] checkVal = request.getParameterValues("check");
		// for(int i = 0; i < checkVal.length; i++) {
		// System.out.println(checkVal[i]);
		// }
	}

}
