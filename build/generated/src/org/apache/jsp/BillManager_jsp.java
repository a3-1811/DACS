package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BillManager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./app/dist/css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./app/dist/css/owl.theme.default.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./app/dist/css/style.css\">\n");
      out.write("        <title>Coffee & Cakes Shop</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Dashbroad for user -->\n");
      out.write("            <section class=\"user history-main container flex\">\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <!-- 25% -->\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navDashbroad.jsp", out, false);
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"content\" style=\"overflow-y: scroll;\">\n");
      out.write("                    <!-- 75% -->\n");
      out.write("                    <h3>Danh sách đơn hàng</h3>\n");
      out.write("                    <table>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>ID</td>\n");
      out.write("                                <td>Ngày đặt</td>\n");
      out.write("                                <td>Người đặt</t>\n");
      out.write("                                <td>Địa chỉ</td>\n");
      out.write("                                <td>Tổng tiền</td>\n");
      out.write("                                <td>Trạng thái</td>\n");
      out.write("                                <td>Hoàn thành</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            @foreach (var item in Model)\n");
      out.write("                            {\n");
      out.write("                            <tr>\n");
      out.write("                                <td>@item.idBill</td>\n");
      out.write("                                <td>@item.Date.Value.ToShortDateString()</td>\n");
      out.write("                                <td>@item.Name</td>\n");
      out.write("                                <td>@item.Address</td>\n");
      out.write("                                <td>@String.Format(CultureInfo.CurrentCulture, \"{0:C0}\", @item.Total)</td>\n");
      out.write("                                @if (item.Status.Value)\n");
      out.write("                                {\n");
      out.write("                                <td class=\"susscess\">Success</td>\n");
      out.write("                                }\n");
      out.write("                                else\n");
      out.write("                                {\n");
      out.write("                                <td class=\"pending\">Pending</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <div class=\"iconBox\">\n");
      out.write("                                        <a href=\"@Url.Action(\"Complete\",\"Home\", new { idBill = item.idBill })\"><i class=\" check fa fa-check\"></i></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                                }\n");
      out.write("                            </tr>\n");
      out.write("                            }\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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
