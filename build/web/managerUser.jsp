
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
                <div class="content" style="overflow-y: scroll;">
                    <!-- 75% -->
                    <div class="nav-menu">
                        <h3>Quản lý người dùng</h3>
                        <form action="searchManagerUS"   method="Post" class="searchBox">
                            <input type="text" id="searchProducts" name="txtKeyWord">
                            <button type="submit">Tìm</button>
                        </form>
                        <a href="#" id="openModal"><i class="fa fa-plus-circle"></i>Add</a>
                    </div>
                    <table >
                        <thead>
                            <tr>
                                <th>Email</th>
                                <th>Tên User</th>
                                <th>Ngày sinh</th>
                                <th>SĐT</th>
                                <th>Thao tác</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${list}" var="o">
                            <tr>
                                <td>${o.email}</td>
                                <td>${o.name}</td>
                                <td>
                                    ${o.birthday}
                                </td>
                                <td>${o.phone}</td>
                                <td>
                                    <div class="iconBox">
                                        <a href="deleteUser?uid=${o.email}"><i class="fa fa-trash"></i></a>
                                    </div>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
            </div>
        </table>
    </div>
</section>
    <div class="modal ${isError == true ? "isOpen" : "isClose"}" id="modal">
    <div class="modal__header flex jc-sb ai-c">
        <h2>Add User</h2>
        <a  class="exit" href="#"><i class="fa fa-times"></i></a>
    </div>
        <div class="modal__body">
            <p style="color: red">${mess}</p>
            <form action="addUser" method="POST">
                <div class="groupBox">
                    <label for="">Tên người dùng</label>
                    <input name="name" type="text" autocomplete="off" required="true">
                </div>
                <div class="groupBox">
                    <label for="">Email</label>
                    <input  name="email" type="email" required="true" autocomplete="off" >
                </div>
                <div class="groupBox">
                    <label for="">Loại</label>
                    <select name="type" id="">
                        <option value="0">Người dùng</option>
                        <option value="1">Admin</option>
                    </select>
                </div>
                <div class="groupBox">
                    <label for="">SĐT</label>
                    <input name="sdt" type="text" onkeypress='return event.charCode >= 48 && event.charCode <= 57 && event.target.value.length <= 10' autocomplete="off" required="true"  >
                </div>
                <div class="groupBoxx" style="    width: 100%;
                     margin-top: 20px;">
                    <label for="">Mật khẩu</label>
                    <input style="width: 100% !important; display: block;
                           padding: 10px; " name="password" type="password" required="true">
                </div>
                <div class="modal__footer mt-3">
                    <button style="display: block;
                            background: green;
                            padding: 0.5rem 1.5rem;
                            outline: none;
                            border: 0;
                            cursor: pointer;
                            color: #fff;" id="openModal"><i class="fa fa-plus-circle"></i>Add</button>
                </div>
            </form>
        </div>
    </div>
       
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
