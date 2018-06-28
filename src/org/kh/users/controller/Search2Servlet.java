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
import org.kh.users.model.vo.UserVo;

@WebServlet(name = "Search2", urlPatterns = { "/search2" })
public class Search2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Search2Servlet() {
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

		String userName = request.getParameter("userName");
		String userAddr = request.getParameter("userAddr");

		UserVo uv = new UserVo();
		uv.setUserName(userName);
		uv.setUserAddr(userAddr);

		ArrayList<UserVo> aList = new UsersServiceImpl().search2UserList(uv);

		response.setContentType("text/html; charset=utf-8");
		if (!aList.isEmpty()) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/users/checkList.jsp");
			request.setAttribute("list", aList);
			dispatcher.forward(request, response);
		} else {
			response.getWriter().println("읽어오기 실패");
		}

	}

}
