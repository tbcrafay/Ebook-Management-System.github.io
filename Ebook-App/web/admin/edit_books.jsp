<%-- 
    Document   : add_book
    Created on : Jun 21, 2024, 8:07:21 PM
    Author     : Abdul Rafay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.entity.BookDtls" %>
<%@ page import="com.entity.BookDtls" %>
<%@ page import="com.DAO.BookDAOImpl"%>
<%@ page import="com.DB.DBConnect"%>
<%@ page import="java.util.List" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<%@page isELIgnored= "false"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin: Add Book</title>
        <%@include file="allCss.jsp" %>
    </head>
    <body style="background-color: #f0f2f2;">
        <%@include file="navbar.jsp" %>

        <div class="container">
            <div class="row p-5">
                <div class="col-md-4 offset-md-3">
                    <div class="card " style="width:553px;">
                        <div class="card-body">
                            <h4 class="text-center"> Edit Books</h4>
                            <!-- <c:ig test="${not empty succMsg}">
                            <p class="text-center text-success">${succMsg}</p>
                            <c:remove var="succMsg" scope="session" />
                            </c:if> 

                            <c:ig test="${not empty succMsg}">
                            <p class="text-center text-danger">${failedMsg}</p>
                            <c:remove var="succMsg" scope="session" />
                            </c:if> -->
                            <%
				int id = Integer.parseInt(request.getParameter("id"));
				BookDAOImpl dao = new BookDAOImpl(DBConnect.getConn());
				BookDtls b = dao.getBookById(id);
				request.setAttribute("bookDetails", b);
                            %>
                            <form action="../editbooks" method="post"  style="width: 500px;">   
				<input type="hidden" name="id" value="<%=b.getBookId()%>">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Book Name</label>
                                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" name="bname"value="<%=b.getBookName()%>" >

                                </div>    

                                <div class="form-group">
                                    <label for="exampleInputEmail1">Author Name</label>
                                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" name="author" value="<%=b.getAuthor()%>">

                                </div>   

                                <div class="form-group">
                                    <label for="exampleInputEmail1">Price</label>
                                    <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" name="price" value="<%=b.getPrice()%>">

                                </div>    




                                <div class="form-group"> 
                                    <label for="inputState">Book Status </label>
                                    <select id="inputState" name="bstatus" class="form-control">
                                        
					<%
					    if ("Active".equals(b.getStatus())) {
					%>
					<option value="Active">Active</option>
					<option value="Inactive">Inactive</option>
					<%
					} else {
					%>
					<option value="Active">Active</option>
					<option value="Inactive">Inactive</option>
					<%
					    }
					%>
                                    </select>
                                </div>

                                

                                <button  type="submit" class="btn btn-primary text-center">Update</button>

                            </form>


                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div style="margin-top: 100px">
            <%@include file="footer.jsp"%>
        </div>
    </body>
</html>
