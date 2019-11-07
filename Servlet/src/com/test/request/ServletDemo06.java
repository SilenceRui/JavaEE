package com.test.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author Silence
 * @creat 2019-10-25  14:21
 */
@WebServlet("/ServletDemo06")
public class ServletDemo06 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取请求头数据user-agent
        String agent = req.getHeader("user-agent");
        if (agent.contains("Chrome")){
            System.out.println("通过谷歌访问...");
        }else if (agent.contains("Firefox")){
            System.out.println("通过火狐访问...");
        }

    }
}
