<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header class="flex jc-c ai-c">
    <nav class="container flex jc-sb ai-c">
        <a href="index" class="logo">CCS</a>
        <a id="btnToggle" href="#" class="toggle hide-for-desktop">
            <span></span>
            <span></span>
            <span></span>
        </a>
        <ul class="menu flex jc-sb ai-c hide-for-mobile">
            <li class="acv"><a href="index">Trang chủ</a></li>
            <li><a href="products">Sản phẩm</a></li>
                <c:if test="${sessionScope.acc != null}">
                <li><a href="dashbroad">Tài khoản</a></li>
                </c:if>
            <form action="search" method="POST"><li class="searchBox"><input placeholder="Bạn đang tìm gì?" name="txtKeyWord" type="text"><button type="submit"><i class="fa fa-search" aria-hidden="true"></i></button></li></form>
        </ul>
        <div class="status hide-for-mobile">
            <c:if test="${sessionScope.acc == null}">
                <a href="login.jsp" ><i class="fa fa-user-circle" aria-hidden="true"></i>Đăng nhập</a>
            </c:if>
            <c:if test="${sessionScope.acc != null}">
                <a href="logout" ><i class="fa fa-sign-out-alt"></i>Đăng xuất</a>
                <a href="carts" ><i class="fa fa-shopping-cart" aria-hidden="true"></i>Giỏ hàng<span class="number">${sessionScope.number}</span></a>
            </c:if>
        </div>
        <div class="sub-menu hide-for-desktop">
            <ul class="menu flex jc-sb ai-c">
                <li class="acv"><a href="index">Trang chủ</a></li>
                <li><a href="products">Sản phẩm</a></li>
                    <c:if test="${sessionScope.acc != null}">
                    <li><a href="dashbroad">Tài khoản</a></li>
                    </c:if>
                <form action="search" method="POST"><li class="searchBox"><input placeholder="Bạn đang tìm gì?" name="txtKeyWord" type="text"><button type="submit"><i class="fa fa-search" aria-hidden="true"></i></button></li></form>
            </ul>
            <div class="status">
                <c:if test="${sessionScope.acc == null}">
                    <a href="login.jsp" ><i class="fa fa-user-circle" aria-hidden="true"></i>Đăng nhập</a>
                </c:if>
                <c:if test="${sessionScope.acc != null}">
                    <a href="logout" ><i class="fa fa-sign-out-alt"></i>Đăng xuất</a>
                    <a href="carts" ><i class="fa fa-shopping-cart" aria-hidden="true"></i>Giỏ hàng <span class="number">${sessionScope.number}</span></a>
                </c:if>
            </div>
        </div>
    </nav>
</header>