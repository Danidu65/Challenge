package com.example.demo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CustomerSelvet" , urlPatterns = "/customer")
public class CustomerSelvet extends HttpServlet {

        @Override
        public void init(ServletConfig config) throws ServletException {
            System.out.println();
        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String code = req.getParameter("code");

        }
}
