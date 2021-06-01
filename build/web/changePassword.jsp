

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
            <h3>Đổi mật khẩu</h3>
            <p style="color: red">${mess}</p>
            <form action="changePassword" action="POST">
                <div class="inputBox">
                    <label for="">Mật khẩu cũ</label>
                    <input type="password" name="mkCu" >
                </div>
                <div class="inputBox">
                    <label for="">Mật khẩu mới</label>
                    <input type="password" name="mkMoi" >
                </div>
                <div class="inputBox">
                    <label for="">Nhập lại mật khẩu mới</label>
                    <input type="password" name="reMkMoi" >
                </div>
                <button type="submit">Cập nhật</button>
            </form>
        </div>
    </section>
    <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
