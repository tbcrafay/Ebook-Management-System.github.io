<%-- 
    Document   : login
    Created on : Jun 7, 2024, 10:38:28 PM
    Author     : Abdul Rafay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-book: Login</title>
        <%@include file="all_components/allCss.jsp" %>
    </head>
    <body style="background-color: #f0f1f2;"> 
         <%@include file="all_components/navbar.jsp" %>
         
         
          <div class="container p-2">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">
                            
                            <h4 class="text-center">Login Here: </h4>
                            <p> <!-- just a gap in b/w! -->  </p>
                            <form>
                                
                                
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required">
                                    
                                </div>                               
                                
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1" required="required">
                                </div>
                                
                                <div class="text-center">
                                    <button type="submit" class="btn btn-primary"> Login</button> <br>
                                    <a href="register.jsp">Create Account</a>
                                </div>
                                
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>
         
         
         
         
         
         
         <%@include file="all_components/footer.jsp" %>
    </body>
</html>
