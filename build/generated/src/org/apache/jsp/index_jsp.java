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
      out.write("                <h2 class=\"title\">Website ?????t Coffee & Cake h??ng ?????u ??N??</h2>\n");
      out.write("                <p><i class=\"fa fa-quote-left\" aria-hidden=\"true\"></i> S??? h??i l??ng c???a b???n l?? m???c ti??u c???a ch??ng t??i !<i class=\"fa fa-quote-right\" aria-hidden=\"true\"></i> <span class=\"author\">CEO & Founder 3 Que</span></p>\n");
      out.write("                <a href=\"#\" class=\"button\" id=\"btnSearch\">B???n ??ang t??m ki???m g???</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"banner__img\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Services -->\n");
      out.write("    <section class=\"services container mt-5\">\n");
      out.write("        <h1 class=\"main_title\">CAM K???T D???CH V???</h1>\n");
      out.write("        <div class=\"services__items flex jc-sa ai-c mt-3\">\n");
      out.write("            <div class=\"services__item\">\n");
      out.write("                <div class=\"item-content\">\n");
      out.write("                    Giao h??ng t???n c???a\n");
      out.write("                </div>\n");
      out.write("                <img src=\"./app/img/giaohang.jpg\" alt=\"\">\n");
      out.write("                <div class=\"item-detail\">\n");
      out.write("                   D?? b???n ??? v??n ph??ng hay chung c?? cao t???ng, th???m ch?? kh??ng c?? thang m??y, ?????m b???o giao h??ng t???n c???a, b???n kh??ng c???n d???ng c??ng vi???c ????? xu???ng l???y h??ng!\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"services__item\">\n");
      out.write("                <img src=\"./app/img/tannoi.jpg\" alt=\"\">\n");
      out.write("                <div class=\"item-content\">\n");
      out.write("                    Giao ????ng s???n ph???m, ????ng h???n\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item-detail\">\n");
      out.write("                    Ch??? c???n ch???n m???c gi??? khi ?????t h??ng, cam k???t giao ????ng s???n ph???m, ????ng h???n. N???u thi???u h??ng giao tr??? d?? ch??? 1 ph??t, ho??n ti???n.\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"services__item\">\n");
      out.write("                <div class=\"item-content\">\n");
      out.write("                    S??? h??i l??ng\n");
      out.write("                </div>\n");
      out.write("                <img src=\"./app/img/hailong.png\" alt=\"\">\n");
      out.write("                <div class=\"item-detail\">\n");
      out.write("                    Nh??n vi??n giao h??ng cu??? shop r???t mong mu???n trao s??? h??i l??ng ?????n b???n, v?? th??? s??? lu??n m???m c?????i, m??? l???i ch??o, l???i c???m ??n khi b???n nh???n h??ng.\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    <!-- S???n ph???m n???i b???t -->\n");
      out.write("    <section class=\"products container mt-5\">\n");
      out.write("        <h1 class=\"main_title\">S???N PH???M ??ANG HOT <i class=\"fa fa-fire\" style=\"color: red;\"></i></h1>\n");
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
          out.write("                        <a href=\"\" class=\"cart btn-detail\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i>Th??m v??o gi???</a>\n");
          out.write("                        <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"detail btn-detail\"><i class=\"fa fa-eye\"></i>Xem chi ti???t</a>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"item__details\">\n");
          out.write("                    <a href=\"/\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                    <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" Vn??</span>\n");
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
