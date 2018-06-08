package com.atguigu.javaweb;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("getServletConfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("getServletInfo");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init");
		String user = arg0.getInitParameter("user");
		System.out.println("user:" + user);
		Enumeration<String> names = arg0.getInitParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			System.out.println(name + ":" + arg0.getInitParameter(name));
		}
		String servletName = arg0.getServletName();
		System.out.println(servletName);
		
		// 获取 ServletContext 对象
		ServletContext servletContext = arg0.getServletContext();
		String driver = servletContext.getInitParameter("driver");
		System.out.println("dirver:" + driver);
		Enumeration<String> names2 = servletContext.getInitParameterNames();
		while (names2.hasMoreElements()) {
			String name = names2.nextElement();
			System.out.println("-->" + name);
		}
		
		String realPath =servletContext.getRealPath("/WEB-INF/web.xml");
		System.out.println(realPath);
		
		
		
		

	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service");

	}

	public HelloServlet() {
		System.out.println("helloservlet");
	}

}
