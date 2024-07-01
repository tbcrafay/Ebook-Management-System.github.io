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
 * @author Muhammad Bashir
 */
@WebServlet("/editbooks")
public class EditServlet extends HttpServlet {

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
	    /* int id = Integer.parseInt(request.getParameter("id"));
	    String bookName = request.getParameter("bname");
	    String author = request.getParameter("author");
	    String price = request.getParameter("price");
	    String status = request.getParameter("bstatus");

	    BookDtls b = new BookDtls();

	    b.setBookId(id);
	    b.setBookName(bookName);
	    b.setAuthor(author);
	    b.setPrice(price);
	    b.setStatus(status);

	    BookDAOImpl dao = new BookDAOImpl(DBConnect.getConn());
	    boolean f = dao.updateEditBooks(b); */

	    int id = Integer.parseInt(request.getParameter("id"));
	    BookDAOImpl dao = new BookDAOImpl(DBConnect.getConn());

	    // Retrieve existing book details (modify as needed)
	    BookDtls b = (BookDtls) request.getAttribute("bookDetails");


	    // Update fields based on form data
	    String bookName = request.getParameter("bname");
	    b.setBookName(bookName != null && !bookName.isEmpty() ? bookName : b.getBookName());
	    String author = request.getParameter("author");
	    b.setAuthor(author != null && !author.isEmpty() ? author : b.getAuthor());
	    String price = request.getParameter("price");
	    b.setPrice(price != null && !price.isEmpty() ? price : b.getPrice());
	    String status = request.getParameter("bstatus");
	    b.setStatus(status != null && !status.isEmpty() ? status : b.getStatus());

	    // Update book in database (modify as needed)
	    boolean updateSuccessful = dao.updateEditBooks(b);

	    // Handle success/error (modify as needed)
	    if (updateSuccessful) {
		// Redirect to success page
		response.sendRedirect("admin/all_book.jsp");
	    } else {
		// Handle update error (e.g., display error message in edit_book.jsp)
		request.setAttribute("errorMessage", "Error updating book details!");
		request.getRequestDispatcher("edit_book.jsp").forward(request, response);
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
