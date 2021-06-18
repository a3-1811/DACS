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
    <!-- Categouries and product section -->
    <h1 class="main_title">COFFEE & CAKES<i class="fa fa-fire" style="color: red;"></i></h1>
    <section class="list_products flex container">
        <div class="left-side">
            <!-- Contain Categories 25%-->\
            <h3>Danh mục</h3>
            <ul>
            <c:forEach items="${listCT}" var="ct">
                <li><a href="categories?cid=${ct.id}">${ct.name}</a></li>
                </c:forEach>
            </ul>
        </div>
        <div class="right-side">
            <!-- Contains products 75% -->
            <div class="products__container">
            <c:forEach items="${listSP}" var="o">
                <div class="item-product">
                    <div class="item__content">
                            <img src=".${o.image}" alt="">
                        <div class="item__content__hover">
                            <a href="addToCart?pid=${o.id}&amount=1" class="cart btn-detail"><i class="fa fa-shopping-cart" aria-hidden="true"></i>Thêm vào giỏ</a>
                            <a href="detail?pid=${o.id}" class="detail btn-detail"><i class="fa fa-eye"></i>Xem chi tiết</a>
                        </div>
                    </div>
                    <div class="item-product__details">
                        <a href="/" >${o.name}</a>
                        <span><fmt:formatNumber value="${o.price}" type="currency"/></span>
                    </div>
                </div>
                </c:forEach>
            <c:if test="${listSP.size() <= 0}">
                <h1 style="color:#fff; font-size: 40px; position: absolute">Không tìm thấy sản phẩm phù hợp!</h2>
            </c:if>
            </div>
        </div>
    </section>





    <!-- Sản phẩm nổi bật -->
     <section class="products container mt-5">
        <h1 class="main_title">SẢN PHẨM ĐANG HOT <i class="fa fa-fire" style="color: red;"></i></h1>
        <div class="owl-carousel owl-theme mt-3">
        <c:forEach items="${listSP}" var="o">
                <div class="item">
                <div class="item__content">
                        <img src=".${o.image}" alt="">
                    <div class="item__content__hover">
                        <a href="addToCart?pid=${o.id}&amount=1" class="cart btn-detail"><i class="fa fa-shopping-cart" aria-hidden="true"></i>Thêm vào giỏ</a>
                        <a href="detail?pid=${o.id}" class="detail btn-detail"><i class="fa fa-eye"></i>Xem chi tiết</a>
                    </div>
                </div>
                <div class="item__details">
                    <a href="/" >${o.name}</a>
                    <span><fmt:formatNumber value="${o.price}" type="currency"/></span>
                </div>
            </div>
            </c:forEach>
        </div>
    </section>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
