package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("    <!-- Banner -->\n");
      out.write("    <section class=\"banner  flex jc-c ai-c container\">\n");
      out.write("            <div class=\"banner__text\">\n");
      out.write("                <h2 class=\"title\">Website đặt Coffee & Cake hàng đầu ĐNÁ</h2>\n");
      out.write("                <p><i class=\"fa fa-quote-left\" aria-hidden=\"true\"></i> Sự hài lòng của bạn là mục tiêu của chúng tôi !<i class=\"fa fa-quote-right\" aria-hidden=\"true\"></i> <span class=\"author\">CEO & Founder 3 Que</span></p>\n");
      out.write("                <a href=\"#\" class=\"button\" id=\"btnSearch\">Bạn đang tìm kiếm gì?</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"banner__img\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Services -->\n");
      out.write("    <section class=\"services container mt-5\">\n");
      out.write("        <h1 class=\"main_title\">CAM KẾT DỊCH VỤ</h1>\n");
      out.write("        <div class=\"services__items flex jc-sa ai-c mt-3\">\n");
      out.write("            <div class=\"services__item\">\n");
      out.write("                <div class=\"item-content\">\n");
      out.write("                    Giao hàng tận cửa\n");
      out.write("                </div>\n");
      out.write("                <img src=\"./app/img/giaohang.jpg\" alt=\"\">\n");
      out.write("                <div class=\"item-detail\">\n");
      out.write("                   Dù bạn ở văn phòng hay chung cư cao tầng, thậm chí không có thang máy, đảm bảo giao hàng tận cửa, bạn không cần dừng công việc để xuống lấy hàng!\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"services__item\">\n");
      out.write("                <img src=\"./app/img/tannoi.jpg\" alt=\"\">\n");
      out.write("                <div class=\"item-content\">\n");
      out.write("                    Giao đúng sản phẩm, đúng hẹn\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item-detail\">\n");
      out.write("                    Chỉ cần chọn mốc giờ khi đặt hàng, cam kết giao đúng sản phẩm, đúng hẹn. Nếu thiếu hàng giao trễ dù chỉ 1 phút, hoàn tiền.\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"services__item\">\n");
      out.write("                <div class=\"item-content\">\n");
      out.write("                    Sự hài lòng\n");
      out.write("                </div>\n");
      out.write("                <img src=\"./app/img/hailong.png\" alt=\"\">\n");
      out.write("                <div class=\"item-detail\">\n");
      out.write("                    Nhân viên giao hàng cuả shop rất mong muốn trao sự hài lòng đến bạn, vì thế sẽ luôn mỉm cười, mở lời chào, lời cảm ơn khi bạn nhận hàng.\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    <!-- Sản phẩm nổi bật -->\n");
      out.write("    <section class=\"products container mt-5\">\n");
      out.write("        <h1 class=\"main_title\">SẢN PHẨM ĐANG HOT <i class=\"fa fa-fire\" style=\"color: red;\"></i></h1>\n");
      out.write("        <div class=\"owl-carousel owl-theme mt-3\">\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div class=\"item\">\n");
          out.write("                <div class=\"item__content\">\n");
          out.write("                        <img src=\".");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                    <div class=\"item__content__hover\">\n");
          out.write("                        <a href=\"\" class=\"cart btn-detail\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i>Thêm vào giỏ</a>\n");
          out.write("                        <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"detail btn-detail\"><i class=\"fa fa-eye\"></i>Xem chi tiết</a>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"item__details\">\n");
          out.write("                    <a href=\"/\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                    <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" Vnđ</span>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
