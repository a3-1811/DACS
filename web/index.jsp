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

    <jsp:include page="header.jsp" ></jsp:include>
    <!-- Banner -->
    <section class="banner  flex jc-c ai-c container">
            <div class="banner__text">
                <h2 class="title">Website đặt Coffee & Cake hàng đầu ĐNÁ</h2>
                <p><i class="fa fa-quote-left" aria-hidden="true"></i> Sự hài lòng của bạn là mục tiêu của chúng tôi !<i class="fa fa-quote-right" aria-hidden="true"></i> <span class="author">CEO & Founder 3 Que</span></p>
                <a href="#" class="button" id="btnSearch">Bạn đang tìm kiếm gì?</a>
            </div>
            <div class="banner__img">
            </div>
        </div>
    </section>

    <!-- Services -->
    <section class="services container mt-5">
        <h1 class="main_title">CAM KẾT DỊCH VỤ</h1>
        <div class="services__items flex jc-sa ai-c mt-3">
            <div class="services__item">
                <div class="item-content">
                    Giao hàng tận cửa
                </div>
                <img src="./app/img/giaohang.jpg" alt="">
                <div class="item-detail">
                   Dù bạn ở văn phòng hay chung cư cao tầng, thậm chí không có thang máy, đảm bảo giao hàng tận cửa, bạn không cần dừng công việc để xuống lấy hàng!
                </div>
            </div>
            <div class="services__item">
                <img src="./app/img/tannoi.jpg" alt="">
                <div class="item-content">
                    Giao đúng sản phẩm, đúng hẹn
                </div>
                <div class="item-detail">
                    Chỉ cần chọn mốc giờ khi đặt hàng, cam kết giao đúng sản phẩm, đúng hẹn. Nếu thiếu hàng giao trễ dù chỉ 1 phút, hoàn tiền.
                 </div>
            </div>
            <div class="services__item">
                <div class="item-content">
                    Sự hài lòng
                </div>
                <img src="./app/img/hailong.png" alt="">
                <div class="item-detail">
                    Nhân viên giao hàng cuả shop rất mong muốn trao sự hài lòng đến bạn, vì thế sẽ luôn mỉm cười, mở lời chào, lời cảm ơn khi bạn nhận hàng.
                 </div>
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
