package com.will.model;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
/**
 * Created by william on 16/7/19.
 */

public class LoginVerification extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException {

        String inputName = request.getParameter("userName");
        String inputPassword = request.getParameter("userPassword");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (sqlInstance.isValidUser(inputName,inputPassword)) {
            out.println("Login Success!<br>");
        } else {
            out.println("Login Failed!<br>");
        }



        /*jsp page
        request.setAttribute("styles", result);

        RequestDispatcher view =
                request.getRequestDispatcher("result.jsp");

        view.forward(request, response);
        */

        /*
        Iterator it = result.iterator();
        while (it.hasNext()) {
            out.print("<br>try: " + it.next());
        }
        */
    }

}
