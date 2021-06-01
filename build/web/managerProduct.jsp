
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
            <section class="admin container flex">
                <div class="nav">
                    <!-- 25% -->
                <jsp:include page="navDashbroad.jsp"></jsp:include>
                </div>
                <div class="content" style="overflow-y: scroll;">
                    <!-- 75% -->
                    <div class="nav-menu">
                        <h3>Quản lý sản phẩm</h3>
                        <form action="searchManagerPD" method="Post" class="searchBox">
                            <input type="text" id="searchProducts" name="txtKeyWord" value="${txt}">
                            <button type="submit">Tìm</button>
                        </form>
                        <a href="#" id="openModal"><i class="fa fa-plus-circle"></i>Add</a>
                    </div>
                    <table >
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Tên SP</th>
                                <th>Hình ảnh</th>
                                <th>Đơn giá</th>
                                <th>Thao tác</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${list}" var="o">
                            <tr>
                                <td>${o.id}</td>
                                <td>${o.name}</td>
                                <td>
                                    <div class="imgBox">
                                        <img src=".${o.image}" alt="">
                                    </div>
                                </td>
                                <td><fmt:formatNumber value="${o.price}" type="currency"/></td>
                                <td>
                                    <div class="iconBox">
                                        <a href="deleteProduct?pid=${o.id}"><i class="fa fa-trash"></i></a>
                                        <a href="editProduct?pid=${o.id}"><i class="check fa fa-wrench"></i></a>
                                    </div>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
            </div>
        </table>
    </div>
</section>

<div class="modal" id="modal">
    <div class="modal__header flex jc-sb ai-c">
        <h2>Add products</h2>
        <a  class="exit" href="#"><i class="fa fa-times"></i></a>
    </div>
    <div class="modal__body">
        <form  method="post" action="addProduct" enctype="multipart/form-data">
            <div class="groupBox">
                <label for="">Tên sản phẩm:</label>
                <input type="text" name="ten">
            </div>
            <div class="groupBox">
                <label for="">Giá sản phẩm:</label>
                <input type="text" name="gia" >
            </div>
            <div class="groupBox">
                <label for="">Danh mục:</label>
                <select name="danhMuc" id="">
                    <c:forEach items="${listCT}" var="i">
                        <option value="${i.id}">${i.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="groupBox">
                <label for="">Mô tả</label>
                <textarea name="moTa"  cols="30" rows="10" ></textarea>
            </div>
            <div class="groupBox">
                <label for="">Hình ảnh:</label>
                <input type="file"  size="60" name="hinhAnh" id="fileUpload" accept="image/png, image/jpeg">
            </div>
       
            <div class="modal__footer">
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
