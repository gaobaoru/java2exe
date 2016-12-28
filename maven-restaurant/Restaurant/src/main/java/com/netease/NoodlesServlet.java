package com.netease;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//log4j relative package
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.netease.Kitchen;

public class NoodlesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		String vegetable = request.getParameter("vegetable");
		//创建日志对象和记录日志
		Logger log = Logger.getLogger(NoodlesServlet.class);
		log.info("the input vegetable is " + vegetable);

		String noodles = Kitchen.makeNoodles(vegetable);
		writer.println(noodles);
	}
}

