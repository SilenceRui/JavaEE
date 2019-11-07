package com.test.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Silence
 * @creat 2019-10-30  21:35
 */
@WebServlet("/CookieTest")
public class CookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
//        获取当前时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String time = simpleDateFormat.format(date);
        System.out.println(time);
//        获取cookie
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {

                if ("lastTime".equals(cookie.getName())) {
                    String lastTime = cookie.getValue();
                    lastTime = URLDecoder.decode(lastTime, "utf-8");
                    response.getWriter().write("欢迎回来，上次访问时间为：" + lastTime);
                }
            }
        } else {
            response.getWriter().write("欢迎访问本网站！");
        }
        time = URLEncoder.encode(time, "utf-8");
        Cookie cookie = new Cookie("lastTime", time);
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
