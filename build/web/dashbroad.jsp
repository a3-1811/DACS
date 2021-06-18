
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
    <section class="admin container flex">
        <div class="nav">
            <!-- 25% -->
            <jsp:include page="navDashbroad.jsp"></jsp:include>
        </div>
        <div class="content">
            <!-- 75% -->
            <h3>Thông tin tài khoản</h3>
            <form action="update" method="POST">
            <c:if test="${error.length() > 0}">
                <h3 style="color: red">${error}</h2>
            </c:if>
                <div class="inputBox">
                    <label for="">Họ tên</label>
                    <input type="text" name="ten" value="${sessionScope.acc.name}" autocomplete="none" required="true">
                </div>
                <div class="inputBox">
                    <label for="">Số điện thoại</label>
                    <input type="text" autocomplete="off" minlength="10" onkeypress='return event.charCode >= 48 && event.charCode <= 57 && event.target.value.length <= 9' name="sdt" value="${sessionScope.acc.phone}" required="true">
                </div>
                <div class="inputBox">
                    <label for="">Email</label>
                    <input type="email" name="email" value="${sessionScope.acc.email}" disabled="true" required="true">
                </div>
                <div class="inputBox">
                    <label for="">Giới tính</label>
                    <c:if test="${sessionScope.acc.gender}">
                        <input type="radio" name="gioiTinh"  value="nam" checked >
                        <label for="nam">Nam</label>
                        <input type="radio" name="gioiTinh" value="nu">
                        <label for="nu">Nữ</label>
                    </c:if>
                        <c:if test="${!sessionScope.acc.gender}">
                        <input type="radio" name="gioiTinh"  value="nam"  >
                        <label for="nam">Nam</label>
                        <input type="radio" name="gioiTinh" value="nu" checked>
                        <label for="nu">Nữ</label>
                    </c:if>
                </div>
                <div class="inputBox">
                    <label for="">Ngày sinh</label>
                    <input type="date" name="ngaySinh" value="${sessionScope.acc.birthday}" min="1970-01-01" max="${dt}" required="true">
                </div>
                <div class="inputBox">
                    <label for="">Địa chỉ</label>
                    <textarea name="diaChi"  cols="10" rows="3" required="true">${sessionScope.acc.address}</textarea>
                </div>
                <button type="submit">Cập nhật</button>
            </form>
        </div>
    </section>
    <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
