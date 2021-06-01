
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h4 class="name-user">Chào ${sessionScope.acc.name} </h4>
<ul>
    <li><i class="fa fa-user-circle" aria-hidden="true"></i><a href="dashbroad">Thông tin tài khoản</a></li>
    <li><i class="fa fa-history"></i><a href="historyCart">Lịch sử mua hàng</a></li>
    <li><i class="fa fa-cart-arrow-down" aria-hidden="true"></i><a href="carts">Giỏ hàng</a></li>
    <li><i class="fa fa-key"></i><a href="changePassword.jsp">Đổi mật khẩu</a></li>
    <c:if test="${sessionScope.acc.isAdmin}">
         <li><i class="fa fa-users-cog"></i><a href="managerUser">Quản lý người dùng</a></li>
    <li><i class="fab fa-product-hunt"></i><a href="managerProduct">Quản lý sản phẩm</a></li>
     </c:if>
</ul>
