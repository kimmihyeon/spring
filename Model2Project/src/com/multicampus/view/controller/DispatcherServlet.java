package com.multicampus.view.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		process(request, response);
	}

	private void process(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// 1. �������� ��û URI�κ��� path ������ �����Ѵ�.
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);
		
		// 2. ��û path�� �ش��ϴ� Controller�� �˻��Ѵ�.
		HandlerMapping mapping = new HandlerMapping();
		Controller ctrl = mapping.getController(path);  // new LoginController();
		
		// 3. �˻��� Controller�� �����ϰ� View ������ ���Ϲ޴´�.
		String viewPage = ctrl.handleRequest(request, response);
		
		// 4. ���ϵ� View ȭ������ �̵��Ѵ�.
		response.sendRedirect(viewPage);
	}

}
