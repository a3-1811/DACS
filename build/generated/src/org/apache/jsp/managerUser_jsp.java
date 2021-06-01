package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managerUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Dashbroad for user -->\n");
      out.write("    <section class=\"admin container flex\">\n");
      out.write("        <div class=\"nav\">\n");
      out.write("            <!-- 25% -->\n");
      out.write("            <h4 class=\"name-user\">Chào Huy </h4>\n");
      out.write("            <ul>\n");
      out.write("                <li><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i><a href=\"#\">Thông tin tài khoản</a></li>\n");
      out.write("                <li><i class=\"fa fa-history\"></i><a href=\"\">Lịch sử mua hàng</a></li>\n");
      out.write("                <li><i class=\"fa fa-cart-arrow-down\" aria-hidden=\"true\"></i><a href=\"giohang.html\">Giỏ hàng</a></li>\n");
      out.write("                <li><i class=\"fa fa-key\"></i><a href=\"/user-doimk.html\">Đổi mật khẩu</a></li>\n");
      out.write("                <li><i class=\"fa fa-users-cog\"></i><a href=\"/\">Quản lý người dùng</a></li>\n");
      out.write("                <li><i class=\"fab fa-product-hunt\"></i><a href=\"/manager-products.html\">Quản lý sản phẩm</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\" style=\"overflow-y: scroll;\">\n");
      out.write("            <!-- 75% -->\n");
      out.write("            <div class=\"nav-menu\">\n");
      out.write("                <h3>Quản lý người dùng</h3>\n");
      out.write("                <form action=\"./manager-users.html\" class=\"searchBox\">\n");
      out.write("                    <input type=\"text\" id=\"searchProducts\" name=\"txtSearch\">\n");
      out.write("                    <button type=\"submit\">Tìm</button>\n");
      out.write("                </form>\n");
      out.write("                <a  class=\"delete\" href=\"\"><i class=\"fa fa-trash\"></i>Delete</a>\n");
      out.write("                <a href=\"#\" id=\"openModal\"><i class=\"fa fa-plus-circle\"></i>Add</a>\n");
      out.write("            </div>\n");
      out.write("            <table >\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"id\" id=\"checkAll\"></th>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Tên User</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>SĐT</th>\n");
      out.write("                        <th>Thao tác</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                      <tr>\n");
      out.write("                            <td><input type=\"checkbox\" name=\"id\" value=\"1\"></td>\n");
      out.write("                            <td>1</td>\n");
      out.write("                            <td>Nguyễn Quang Huy</td>\n");
      out.write("                            <td>\n");
      out.write("                                huybest10@gmail.com\n");
      out.write("                            </td>\n");
      out.write("                            <td>0392680723</td>\n");
      out.write("                            <td>\n");
      out.write("                               <div class=\"iconBox\">\n");
      out.write("                                <a href=\"delete?id=1\"><i class=\"fa fa-trash\"></i></a>\n");
      out.write("                               </div>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                </tbody>\n");
      out.write("                </div>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <div class=\"modal\" id=\"modal\">\n");
      out.write("        <div class=\"modal__header flex jc-sb ai-c\">\n");
      out.write("            <h2>Add User</h2>\n");
      out.write("            <a  class=\"exit\" href=\"#\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal__body\">\n");
      out.write("            <form action=\"\">\n");
      out.write("                <div class=\"groupBox\">\n");
      out.write("                    <label for=\"\">Tên người dùng</label>\n");
      out.write("                    <input name=\"name\" type=\"text\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"groupBox\">\n");
      out.write("                    <label for=\"\">Email</label>\n");
      out.write("                    <input  name=\"email\" type=\"text\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"groupBox\">\n");
      out.write("                    <label for=\"\">Loại</label>\n");
      out.write("                    <select name=\"type\" id=\"\">\n");
      out.write("                        <option value=\"\">Người dùng</option>\n");
      out.write("                        <option value=\"\">Admin</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"groupBox\">\n");
      out.write("                    <label for=\"\">SĐT</label>\n");
      out.write("                    <input name=\"sdt\" type=\"number\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"groupBoxx\" style=\"    width: 100%;\n");
      out.write("                margin-top: 20px;\">\n");
      out.write("                    <label for=\"\">Mật khẩu</label>\n");
      out.write("                    <input style=\"width: 100% !important; display: block;\n");
      out.write("                    padding: 10px; \" name=\"password\" type=\"password\" >\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal__footer mt-3\">\n");
      out.write("                <a href=\"#\" id=\"openModal\"><i class=\"fa fa-plus-circle\"></i>Add</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  ");
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
