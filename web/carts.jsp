<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
        <link rel="stylesheet" href="./app/dist/css/owl.carousel.min.css">
        <link rel="stylesheet" href="./app/dist/css/owl.theme.default.min.css">
        <link rel="stylesheet" href="./app/dist/css/style.css">
        <title>Coffee & Cakes Shop</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <section class="giohang container flex mt-3">
                <div class="list">
                    <!-- 70% -->
                    <h2 class="main_title">Giỏ hàng</h2>
                    <div class="list__content">
                          <c:if test="${sessionScope.number > 0}">
                              <c:forEach items="${list}" var="o">
                        <div class="item">
                            <div class="imgBox">
                                <img src=".${o.hinhSP}" alt="${o.tenSP}">
                            </div>
                            <div class="item__details">
                                <div class="detailBox">
                                    <h3>${o.tenSP}</h3>
                                    <p class="price"> <fmt:formatNumber value="${o.giaSP}" type="currency"/></p>
                                </div>
                                <div class="inputBox">
                                    <input type="button" value="-" >
                                    <input type="number" value="${o.soLuong}" min="1" max="99" >
                                    <input type="button" value="+" >
                                </div>
                                <div class="iconBox">
                                    <a href="deleteCart?pid=${o.idSP}"><i class="fa fa-times-circle"></i></a>
                                    <a href="updateCart?pid=${o.idSP}"><i class=" check fa fa-check"></i></a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    </c:if>
                    <c:if test="${sessionScope.number == 0}">
                        <div style="padding: 50px 0; text-align: center">
                            <h3 style="font-size: 30px; padding: 20px 0">GIỎ HÀNG BẠN CHƯA CÓ GÌ!</h3>
                        <a class="btn-detail" href="products" >Mua ngay</a>
                        </div>
                    </c:if>
                        
                </div>

            </div>
            <div class="checkout">
                <!-- 30% -->
                <h2 class="main_title">Thông tin thanh toán</h2>
                <div class="list__checkout">
                    <h3>Địa chỉ thanh toán:</h3>
                    <p>${sessionScope.acc.address}</p>
                    <c:forEach items="${list}" var="o">
                        <p>${o.tenSP} <span>x${o.soLuong}</span>: <fmt:formatNumber value="${o.giaSP*o.soLuong}" type="currency"/> </p>
                    </c:forEach>
                </div>
                <div class="footer__checkout">
                    <c:if test="${sessionScope.number > 0}">
                          <h2>Thành tiền: <fmt:formatNumber value="${tong}" type="currency"/></h2> 
                    <a href="thanhToan?email=${sessionScope.acc.email}" class="thanhToan">Thanh toán</a>
                    </c:if>
                  
                </div>
            </div>
        </section>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
