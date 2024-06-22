<%-- 
    Document   : home
    Created on : Jun 20, 2024, 5:20:32 PM
    Author     : Abdul Rafay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<%@page isELIgnored= "false"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Admin: Home</title>
        <%@include file="allCss.jsp" %>
        <style type="text/css">
            a{
                text-decoration: none;
                color: black;
            }
            a:hover {
                text-decoration: none;
                color: black;
            }
        </style>
    </head>
    <body>
        <%@include file="navbar.jsp" %>

        <div class="container">
            <div class="row p-5">
                <div class="col-md-3">
                    <a href="add_book.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <i class="fas fa-plus-square fa-3x text-primary"></i> <br>
                                <h4>Add Book </h4>
                                ----------------
                            </div>
                        </div>
                    </a>    
                </div>

                <div class="col-md-3">
                    <a href="all_book.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <i class="fas fa-book-open fa-3x text-warning"></i> <br>
                                <h4>All Book </h4>
                                ------------------
                            </div>
                        </div>
                    </a>
                </div>

                <div class="col-md-3">
                    <a href="Orders.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <i class="fas fa-box-open fa-3x text-danger"></i> <br>
                                <h4>Orders </h4>
                                ------------------
                            </div>
                        </div>
                    </a>
                </div>

                <div class="col-md-3">
                    <a href="#">
                        <div class="card">
                            <div class="card-body text-center">
                                <i class="fas fa-sign-out-alt fa-3x text-primary"></i> <br>
                                <h4>Log Out </h4>
                                ------------------
                            </div>
                        </div>
                    </a>    
                </div>


            </div>
        </div>
        
        <div style="margin-top: 100px">
            <%@include file="footer.jsp"%>
        </div>
    </body>
</html>
