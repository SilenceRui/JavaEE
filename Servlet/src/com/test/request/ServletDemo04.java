package com.test.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Silence
 * @creat 2019-10-25  9:26
 */
@WebServlet("/ServletDemo04")
public class ServletDemo04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取请求方式
        String method = req.getMethod();
        System.out.println("method:\t"+method);
//        获取虚拟路径
        String contextPath = req.getContextPath();
        System.out.println("contextPath:\t"+contextPath);
//        获取servlet路径
        String servletPath = req.getServletPath();
        System.out.println("servletPath:\t"+servletPath);
//        获取get方式请求参数
        String queryString = req.getQueryString();
        System.out.println("queryString:\t"+queryString);
//        获取URI
        String requestURI = req.getRequestURI();
        System.out.println("requestURI:\t"+requestURI);
//        获取URL
        StringBuffer requestURL = req.getRequestURL();
        System.out.println("requestURL:\t"+requestURL);
//        获取协议及版本
        String protocol = req.getProtocol();
        System.out.println("protocol:\t"+protocol);
//        获取客户机IP地址
        String remoteAddr = req.getRemoteAddr();
        System.out.println("remoteAddr:\t"+remoteAddr);
    }
}
