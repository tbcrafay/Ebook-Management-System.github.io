<%-- 
    Document   : add_book
    Created on : Jun 21, 2024, 8:07:21 PM
    Author     : Abdul Rafay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                            <h4 class="text-center"> Add Books</h4>
                            <form action="../AdminAddBookServlet" method="post" enctype="multipart/form-data" style="width: 500px;">    
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Book Name</label>
                                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" name="bname">

                                </div>    

                                <div class="form-group">
                                    <label for="exampleInputEmail1">Author Name</label>
                                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" name="author">

                                </div>   

                                <div class="form-group">
                                    <label for="exampleInputEmail1">Price</label>
                                    <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" name="price">

                                </div>    


                                <div class="form-group"> 
                                    <label for="inputState">Book Categories </label>
                                    <select id="inputState" name="btype" class="form-control">
                                        <option selected>--Select--</option>
                                        <option value="New">New Book</option>
                                    </select>
                                </div>

                                <div class="form-group"> 
                                    <label for="inputState">Book Status </label>
                                    <select id="inputState" name="bstatus" class="form-control">
                                        <option selected>--Select--</option>
                                        <option value="Active">Active</option>
                                        <option value="Inactive">Inactive</option>
                                    </select>
                                </div>

                                <div class="form-group">
                                    <label for="exampleFormControlFile1">Upload Photo</label>
                                    <input name="bimg" type="file" class="form-control-file" id="exampleFromControlFile1">
                                </div>

                                <button  type="submit" class="btn btn-primary text-center">Add</button>

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
