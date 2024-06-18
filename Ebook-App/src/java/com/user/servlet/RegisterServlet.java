/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.user.servlet;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.entity.User;
import com.DAO.UserDAOimpl;
import com.DB.DBConnect;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author Abdul Rafay
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle logic for GET requests here (e.g., display a registration form)

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle logic for POST requests here (e.g., process registration form data)
        try {
            String name = request.getParameter("fname");
            String email = request.getParameter("email");
            String phno = request.getParameter("phno");
            String password = request.getParameter("password");
            String check = request.getParameter("check");

            System.out.println(name + " " + email + " " + phno + " " + password + " " + check);

            User us = new User();
            us.setName(name);
            us.setEmail(email);
            us.setPhoneNumber(phno);
            us.setPassword(password);

            HttpSession session = request.getSession();

            if (check != null) {
                UserDAOimpl dao = new UserDAOimpl(DBConnect.getConn());
                boolean f = dao.userRegister(us);
                if (f) {
//                    System.out.println("User Regiestration Successful...");
                    session.setAttribute("succMsg", "User Registration Successful..");
                    response.sendRedirect("register.jsp");
                } else {

//                    System.out.println("Something went wrong on the server...");
                    session.setAttribute("failedMsg", "Something went wrong with the server..");
                    response.sendRedirect("register.jsp");
                }
            } else {
//                System.out.println("Please Agree Our Terms and Conditions..");
                session.setAttribute("uncheckedMsg", "Please Agree Our Terms and Conditions..");
                response.sendRedirect("register.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
