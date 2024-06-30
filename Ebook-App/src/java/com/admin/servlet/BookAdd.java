/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.admin.servlet;

import com.DAO.BookDAOImpl;
import com.DB.DBConnect;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import com.entity.BookDtls;
import jakarta.servlet.http.Part;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpSession;
import java.io.File;

/**
 *
 * @author Abdul Rafay
 */
@WebServlet("/add_book")
@MultipartConfig
public class BookAdd extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            String bookName = request.getParameter("bname");
            String author = request.getParameter("author");
            String price = request.getParameter("price");
            String categories = request.getParameter("btype");
            String status = request.getParameter("bstatus");
            Part part = request.getPart("bimg");
            String fileName = part.getSubmittedFileName();

            BookDtls b = new BookDtls(0, bookName, author, price, categories, status, fileName, "admin");
            System.out.println(b);

            BookDAOImpl dao = new BookDAOImpl(DBConnect.getConn());

            boolean f = dao.addBooks(b);

            HttpSession session = request.getSession();

            if (f) {

                String path = getServletContext().getRealPath("") + "books";

                File file = new File(path);

                part.write(path + File.separator + fileName);

                session.setAttribute("succMsg", "Book Added Successfully");
                response.sendRedirect("admin/add_book.jsp");
            } else {
                session.setAttribute("failedMsg", "Something wrong in the server");
                response.sendRedirect("admin/add_book.jsp");
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
