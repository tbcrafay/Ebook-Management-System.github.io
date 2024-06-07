<%-- 
    Document   : index
    Created on : Jun 1, 2024, 10:10:48 AM
    Author     : Abdul Rafay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-book: Index</title>
        <%@include file="all_components/allCss.jsp" %>
        <style type="text/css">
            .back-img {
                background: url("img/b.jpeg");
                height: 50vh;
                width: 100%;
                background-size: cover;
                background-repeat: no-repeat;
            }
            .crd-ho:hover {
                background-color: #fcf7f7;
            }
        </style>
    </head>
    <body style="background-color: #fcf7f7;">
        <!-- navbar -->
        <%@include file="all_components/navbar.jsp" %>
        <!-- background image/home -->
        <div class="container-fluid back-img">
            <h2 class="text-center text-danger">E-book Management System</h2>
        </div>

        <!-- start Recent Books row -->
        <div class="container">
            <h3 class="text-center"> Available Books </h3>
            <div class="row">

                <div class="col-md-4 mt-2">
                    <div class="card crd-ho p-0">
                        <div class="card-body text-center">
                            <img alt="" src="books/java.jpeg" style="height: 150px; width:200px; " class="img-thumblin">
                            <p>Java Programming</p>
                            <p>Balguruswamy</p>
                            <p>Categories: new</p>
                            <div class="row ">
                                <a href="" class="btn-danger btn btn-sm p-1 ml-1"><i class="fa-solid fa-cart-plus"></i>Add Cart</a>
                                <a href="" class="btn-danger btn btn-sm p-1 ml-1">View Details</a>
                                <a href="" class="btn-danger btn btn-sm p-1 ml-1">299</a>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-4 mt-2">
                    <div class="card crd-ho p-0">
                        <div class="card-body text-center">
                            <img alt="" src="books/java.jpeg" style="height: 150px; width:200px; " class="img-thumblin">
                            <p>Java Programming</p>
                            <p>Balguruswamy</p>
                            <p>Categories: new</p>
                            <div class="row">
                                <a href="" class="btn-danger btn btn-sm p-1 ml-1"><i class="fa-solid fa-cart-plus"></i>Add Cart</a>
                                <a href="" class="btn-danger btn btn-sm p-1 ml-1">View Details</a>
                                <a href="" class="btn-danger btn btn-sm p-1 ml-1">299</a>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-4 mt-2">
                    <div class="card crd-ho p-0">
                        <div class="card-body text-center">
                            <img alt="" src="books/java.jpeg" style="height: 150px; width:200px; " class="img-thumblin">
                            <p>Java Programming</p>
                            <p>Balguruswamy</p>
                            <p>Categories: new</p>
                            <div class="row">
                                <a href="" class="btn-danger btn btn-sm p-1 ml-1"><i class="fa-solid fa-cart-plus"></i>Add Cart</a>
                                <a href="" class="btn-danger btn btn-sm p-1 ml-1">View Details</a>
                                <a href="" class="btn-danger btn btn-sm p-1 ml-1">299</a>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="text-center mt-1 " style="margin-left: 500px; margin-right: 500px" >
                    <a href="" class="btn btn-danger btn-sm text-white"> View All </a>
                </div>


            </div>
        </div> 
        <!-- End Recent Books row -->

<!-- Start Upcoming Books row -->
<!-- End Upcoming Books row -->

<!-- Start Old Books row -->
<!-- End Old Books row -->

<!-- Footer-->

<%@include file="all_components/footer.jsp" %>
    

    </body>
</html>
