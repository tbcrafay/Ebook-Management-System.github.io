<%-- 
    Document   : register
    Created on : Jun 7, 2024, 10:12:18 PM
    Author     : Abdul Rafay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-book: Register</title>
        <%@include file="all_components/allCss.jsp" %>
    </head>
    <body style="background-color: #f0f1f2;">
        <%@include file="all_components/navbar.jsp" %>

        <div class="container p-2">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">

                            <h4 class="text-center">Register Your ID</h4>
                            <p> <!-- just a gap in b/w! -->  </p>
                            
<!--                            
                            <c:if test="${not empty sessionScope.succkMsg}">
                                <div class="alert alert-danger" role="alert">
                                    ${sessionScope.succkMsg} 
                                </div>
                            </c:if> -->

<!--                            <c:if test="${not empty sessionScope.uncheckMsg}">
                                <div class="alert alert-danger" role="alert">
                                    ${sessionScope.uncheckMsg}
                                </div>
                            </c:if>-->
                            <form action="register" method="post"> <!-- it is method of connecting it to the reister.servlet -->
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Enter your name</label>
                                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" name="fname">

                                </div>

                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"required="required" name="email">

                                </div>

                                <div class="form-group">
                                    <label for="exampleInputEmail1">Phone number</label>
                                    <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" name="phno">

                                </div>

                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1" required="required" name="password">
                                </div>
                                <div class="form-check">
                                    <input type="checkbox" class="form-check-input" name="check" id="exampleCheck1">
                                    <label class="form-check-label" for="exampleCheck1">Agree Our Terms & Conditions</label>
                                </div>
                                <button type="submit" class="btn btn-primary"> Register</button>
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>




        <%@include file="all_components/footer.jsp" %>
    </body>
</html>
