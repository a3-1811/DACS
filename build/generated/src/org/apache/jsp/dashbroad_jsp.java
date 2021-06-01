package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashbroad_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./app/dist/css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./app/dist/css/owl.theme.default.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./app/dist/css/style.css\">\n");
      out.write("    <title>Coffee & Cakes Shop</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <!-- Dashbroad for user -->\n");
      out.write("    <section class=\"admin container flex\">\n");
      out.write("        <div class=\"nav\">\n");
      out.write("            <!-- 25% -->\n");
      out.write("            <h4 class=\"name-user\">Chào Huy</h4>\n");
      out.write("            <ul>\n");
      out.write("                <li><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i><a href=\"#\">Thông tin tài khoản</a></li>\n");
      out.write("                <li><i class=\"fa fa-history\"></i><a href=\"\">Lịch sử mua hàng</a></li>\n");
      out.write("                <li><i class=\"fa fa-cart-arrow-down\" aria-hidden=\"true\"></i><a href=\"giohang.html\">Giỏ hàng</a></li>\n");
      out.write("                <li><i class=\"fa fa-key\"></i><a href=\"/user-doimk.html\">Đổi mật khẩu</a></li>\n");
      out.write("                <li><i class=\"fa fa-users-cog\"></i><a href=\"/\">Quản lý người dùng</a></li>\n");
      out.write("                <li><i class=\"fab fa-product-hunt\"></i><a href=\"/manager-products.html\">Quản lý sản phẩm</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <!-- 75% -->\n");
      out.write("            <h3>Thông tin tài khoản</h3>\n");
      out.write("            <form action=\"\">\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <label for=\"\">Họ tên</label>\n");
      out.write("                    <input type=\"text\" name=\"ten\" value=\"Quang Huy\" autocomplete=\"none\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <label for=\"\">Số điện thoại</label>\n");
      out.write("                    <input type=\"text\" name=\"sdt\" value=\"039268723\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <label for=\"\">Email</label>\n");
      out.write("                    <input type=\"text\" name=\"email\" value=\"Huybest10@gmail.com\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <label for=\"\">Giới tính</label>\n");
      out.write("                    <input type=\"radio\" name=\"gioiTinh\"  value=\"nam\" checked >\n");
      out.write("                    <label for=\"nam\">Nam</label>\n");
      out.write("                    <input type=\"radio\" name=\"gioiTinh\" value=\"nu\">\n");
      out.write("                    <label for=\"nu\">Nữ</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <label for=\"\">Ngày sinh</label>\n");
      out.write("                    <!-- max time = date.now -->\n");
      out.write("                    <input type=\"date\" name=\"ngaySinh\" value=\"2018-07-22\" min=\"1970-01-01\" max=\"2021-03-30\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <label for=\"\">Địa chỉ</label>\n");
      out.write("                    <textarea name=\"diaChi\"  cols=\"10\" rows=\"3\" >123 tổ lái tân bình</textarea>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\">Cập nhật</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
