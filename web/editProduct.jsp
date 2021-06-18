

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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

        <<jsp:include page="header.jsp"></jsp:include>


            <!-- Dashbroad for user -->
            <section class="user container flex">
                <div class="nav">
                    <!-- 25% -->
                <jsp:include page="navDashbroad.jsp"></jsp:include>
                </div>
                <div class="content">
                    <!-- 75% -->
                    <h3>Chỉnh sửa sản phẩm</h3>
                    <form class="edit" action="editPD" method="POST" enctype="multipart/form-data">
                        <div class="inputBox">
                            <label for="">Tên sản phẩm</label>
                            <input type="text" name="ten" value="${pd.name}" autocomplete="off" required="true">
                    </div>
                    <div class="inputBox">
                        <label for="">Mô tả</label>
                        <textarea name="moTa"  cols="30" rows="10" required="true">${pd.descriptions}</textarea>
                    </div>
                    <div class="inputBox">
                        <label for="">Giá</label>
                        <input type="number" name="gia" value="${pd.price}" onkeypress='return event.charCode >= 48 && event.charCode <= 57 && event.target.value.length <= 8' required="true">
                    </div>
                    <div class="inputBox">
                        <label for="">Danh mục:</label>
                        <select name="danhMuc" id="" >
                            <c:forEach items="${listCT}" var="o">
                                <c:if test="${pd.categoryId == o.id}" >
                                    <option value="${o.id}" selected="true">${o.name}</option>
                                </c:if>
                                <c:if test="${pd.categoryId != o.id}" >
                                    <option value="${o.id}" >${o.name}</option>
                                </c:if>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="inputBox">
                        <input type="hidden" value="${pd.id}" name="id"/>
                        <label for="">Hình ảnh:</label>
                        <input type="file" name="hinhAnh" id="fileUpload" accept="image/png, image/jpeg">
                    </div>
                    <button type="submit">Cập nhật</button>
                </form>
            </div>
        </section>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
