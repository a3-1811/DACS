
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

            <!-- Dashbroad for user -->
            <section class="user history-main container flex">
                <div class="nav">
                    <!-- 25% -->
                <jsp:include page="navDashbroad.jsp"></jsp:include>
                </div>
                <div class="content">
                    <!-- 75% -->
                    <h3>Lịch sử mua hàng</h3>
                    <table class="history">
                        <tr>
                            <th>Mã đơn hàng</th>
                            <th>Ngày mua</th>
                            <th>Sản phẩm</th>
                            <th>Tổng tiền</th>
                            <th>Trạng thái</th>
                        </tr>
                    <c:forEach items="${list}" var="o">
                        <tr>
                            <td>${o.idBill}</td>
                            <td>${o.ngayMua}</td>
                            <td>${o.tenSP} x${o.soLuong}</td>
                            <td><fmt:formatNumber value="${o.tongTien}" type="currency"/></td>
                            <c:if test="${o.trangThai == false}">
                                <td class="pending">Đang giao</td>
                            </c:if>
                            <c:if test="${o.trangThai == true}">
                                <td class="susscess">Thành công</td>
                            </c:if>
                        </tr>
                    </c:forEach>

                </table>
            </div>
        </section>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
