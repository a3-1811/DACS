
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
                    <h3>Xác nhận giao hàng</h3>
                    <table class="history">
                        <tr>
                            <th>ID</th>
                            <th>Ngày mua</th>
                            <th>Tên KH</th>
                            <th>Tổng tiền</th>
                            <th>SĐT</th>
                            <th>Trạng thái</th>
                            <th>Check để hoàn thành</th>
                        </tr>
                    <c:forEach items="${list}" var="o">
                        <tr >
                            <td>${o.id}</td>
                            <td>${o.ngauMua}</td>
                            <td>${o.tenKH}</td>
                            <td><fmt:formatNumber value="${o.tongTien}" type="currency"/></td>
                            <td>${o.sdt}</td>
                            <c:if test="${o.trangThai == false}">
                                <td class="pending">Đang giao</td>
                                <td style="text-align: center"><a href="checkBill?id=${o.id}"><i style="color: green" class=" check fa fa-check"></i></a></td>
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
