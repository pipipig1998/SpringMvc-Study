package com.pipizhu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        //1、获取前端数据
        //2、调用业务层
        //3、视图转发或者重定向

        String method = req.getParameter("method");
        if (method.equals("add"))
            req.getSession().setAttribute("msg","执行了add方法");

        if(method.equals("delete"))
            req.getSession().setAttribute("msg","执行了delete方法");
        req.getRequestDispatcher("/Spring_01_servlet_war_exploded/test.jsp").forward(req,resp);
        return;
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
