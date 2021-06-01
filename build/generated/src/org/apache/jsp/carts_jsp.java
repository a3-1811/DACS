package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <!-- Giỏ hàng -->\n");
      out.write("    <section class=\"giohang container flex mt-3\">\n");
      out.write("        <div class=\"list\">\n");
      out.write("            <!-- 70% -->\n");
      out.write("            <h2 class=\"main_title\">Giỏ hàng</h2>\n");
      out.write("            <div class=\"list__content\">\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"imgBox\">\n");
      out.write("                     <img src=\"./app/img/coffee/mochi.jpg\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item__details\">\n");
      out.write("                        <div class=\"detailBox\">\n");
      out.write("                            <h3>Mochi</h3>\n");
      out.write("                            <p class=\"price\">145.000 <sup>đ</sup></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputBox\">\n");
      out.write("                            <input type=\"button\" value=\"-\" >\n");
      out.write("                            <input type=\"number\" value=\"1\" min=\"1\" >\n");
      out.write("                            <input type=\"button\" value=\"+\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"iconBox\">\n");
      out.write("                            <i class=\"fa fa-times-circle\"></i>\n");
      out.write("                            <i class=\" check fa fa-check\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"imgBox\">\n");
      out.write("                     <img src=\"./app/img/coffee/mochi.jpg\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item__details\">\n");
      out.write("                        <div class=\"detailBox\">\n");
      out.write("                            <h3>Mochi</h3>\n");
      out.write("                            <p class=\"price\">145.000 <sup>đ</sup></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputBox\">\n");
      out.write("                            <input type=\"button\" value=\"-\" >\n");
      out.write("                            <input type=\"number\" value=\"1\" min=\"1\" >\n");
      out.write("                            <input type=\"button\" value=\"+\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"iconBox\">\n");
      out.write("                            <i class=\"fa fa-times-circle\"></i>\n");
      out.write("                            <i class=\" check fa fa-check\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><div class=\"item\">\n");
      out.write("                    <div class=\"imgBox\">\n");
      out.write("                     <img src=\"./app/img/coffee/mochi.jpg\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item__details\">\n");
      out.write("                        <div class=\"detailBox\">\n");
      out.write("                            <h3>Mochi</h3>\n");
      out.write("                            <p class=\"price\">145.000 <sup>đ</sup></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputBox\">\n");
      out.write("                            <input type=\"button\" value=\"-\" >\n");
      out.write("                            <input type=\"number\" value=\"1\" min=\"1\" >\n");
      out.write("                            <input type=\"button\" value=\"+\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"iconBox\">\n");
      out.write("                            <i class=\"fa fa-times-circle\"></i>\n");
      out.write("                            <i class=\" check fa fa-check\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"checkout\">\n");
      out.write("            <!-- 30% -->\n");
      out.write("            <h2 class=\"main_title\">Thông tin thanh toán</h2>\n");
      out.write("            <div class=\"list__checkout\">\n");
      out.write("                <h3>Địa chỉ thanh toán:</h3>\n");
      out.write("                <p>32 Nguyễn Thị Kiểu, Hiệp Thành, Quận 12, Thành phố Hồ Chí Minh, Phường Hiệp Thành, Quận 12, Hồ Chí Minh Việt Nam</p>\n");
      out.write("                <p>Mochi <span>X10</span>: 1.450.000 <sup>đ</sup></p>\n");
      out.write("                <p>Mochi <span>X10</span>: 1.450.000 <sup>đ</sup></p>\n");
      out.write("                <p>Mochi <span>X10</span>: 1.450.000 <sup>đ</sup></p>\n");
      out.write("                <p>Mochi <span>X10</span>: 1.450.000 <sup>đ</sup></p>\n");
      out.write("                <p>Mochi <span>X10</span>: 1.450.000 <sup>đ</sup></p>\n");
      out.write("            </div>\n");
      out.write("           <div class=\"footer__checkout\">\n");
      out.write("            <h2>Thành tiền: 7.100.000 <sup>đ</sup></h2>\n");
      out.write("            <a href=\"\" class=\"thanhToan\">Thanh toán</a>\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
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
