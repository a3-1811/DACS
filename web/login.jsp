
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

    <section class="content">
        <section class="login-header flex jc-c ai-c">
            <nav class="container flex jc-sb ai-c">
                <a href="index" class="logo">CCS</a>
                <a href="register.jsp"><i class="fa fa-plus-circle"></i>Đăng ký</a>
            </nav>
        </section>
        <section class="login-main">
            <div class="box">
                <h2 class="box__title">Đăng nhập</h2>
                <div class="box__body">
                    <p style="color: red">${mess}</p>
                    <form action="login" method="POST">
                        <input type="email" name="email" placeholder="Email address" required>
                        <input type="password" name="password" placeholder="Password" required>
                        <input type="submit" value="Đăng nhập">
                    </form>
                </div>
            </div>
        </section>
    </section>
</body>
</html>
