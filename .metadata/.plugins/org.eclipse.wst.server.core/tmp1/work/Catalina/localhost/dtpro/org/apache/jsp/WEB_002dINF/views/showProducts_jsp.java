/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.24
 * Generated at: 2018-02-22 16:39:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/templates/header.jsp", Long.valueOf(1519295942963L));
    _jspx_dependants.put("/WEB-INF/views/templates/footer.jsp", Long.valueOf(1519203067898L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1518785686794L));
    _jspx_dependants.put("jar:file:/E:/DtProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/dtpro/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("jar:file:/E:/DtProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/dtpro/WEB-INF/lib/spring-security-taglibs-4.2.1.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1482320444000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-4.2.1.RELEASE.jar", Long.valueOf(1519291764013L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Bootstrap Example</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">WebSiteName</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("      <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("      ");
      if (_jspx_meth_security_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("       <li><a href=\"/dtpro/listProducts\">Products</a></li>\r\n");
      out.write("       ");
      if (_jspx_meth_security_005fauthorize_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("     <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("     ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("     ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("  \r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("  <h2>Available Products</h2>           \r\n");
      out.write("  <table class=\"table\">\r\n");
      out.write("    <thead>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <th>S. no</th>\r\n");
      out.write("        <th>Image</th>\r\n");
      out.write("        <th>Product name</th>\r\n");
      out.write("        <th>Quantity</th>\r\n");
      out.write("        <th>Price</th>\r\n");
      out.write("        <th>Description</th>\r\n");
      out.write("        <th>Category</th>\r\n");
      out.write("        <th>Action</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    \r\n");
      out.write("    <tbody>\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </tbody>\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <h3 class=\"footertext\">About Us:</h3>\r\n");
      out.write("            <br>\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                <center>\r\n");
      out.write("                  <img src=\"http://oi60.tinypic.com/w8lycl.jpg\" class=\"img-circle\" alt=\"the-brains\">\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <h4 class=\"footertext\">Programmer</h4>\r\n");
      out.write("                  <p class=\"footertext\">You can thank all the crazy programming here to this guy.<br>\r\n");
      out.write("                </center>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                <center>\r\n");
      out.write("                  <img src=\"http://oi60.tinypic.com/2z7enpc.jpg\" class=\"img-circle\" alt=\"...\">\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <h4 class=\"footertext\">Artist</h4>\r\n");
      out.write("                  <p class=\"footertext\">All the images here are hand drawn by this man.<br>\r\n");
      out.write("                </center>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                <center>\r\n");
      out.write("                  <img src=\"http://oi61.tinypic.com/307n6ux.jpg\" class=\"img-circle\" alt=\"...\">\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <h4 class=\"footertext\">Designer</h4>\r\n");
      out.write("                  <p class=\"footertext\">This pretty site and the copy it holds are all thanks to this guy.<br>\r\n");
      out.write("                </center>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("            <p><center><a href=\"#\">Contact Stuff Here</a> <p class=\"footertext\">Copyright 2014</p></center></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_security_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_security_005fauthorize_005f0_reused = false;
    try {
      _jspx_th_security_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_security_005fauthorize_005f0.setParent(null);
      // /WEB-INF/views/templates/header.jsp(22,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_security_005fauthorize_005f0.setAccess("hasRole('ROLE_ADMIN')");
      int _jspx_eval_security_005fauthorize_005f0 = _jspx_th_security_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_security_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("       <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("/admin/adding\">Admin</a></li>\r\n");
        out.write("       ");
      }
      if (_jspx_th_security_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
      _jspx_th_security_005fauthorize_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_security_005fauthorize_005f0, _jsp_getInstanceManager(), _jspx_th_security_005fauthorize_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_security_005fauthorize_005f1_reused = false;
    try {
      _jspx_th_security_005fauthorize_005f1.setPageContext(_jspx_page_context);
      _jspx_th_security_005fauthorize_005f1.setParent(null);
      // /WEB-INF/views/templates/header.jsp(26,7) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_security_005fauthorize_005f1.setAccess("hasRole('ROLE_ADMIN')");
      int _jspx_eval_security_005fauthorize_005f1 = _jspx_th_security_005fauthorize_005f1.doStartTag();
      if (_jspx_eval_security_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Page 1 <span class=\"caret\"></span></a>\r\n");
        out.write("         \r\n");
        out.write("        <ul class=\"dropdown-menu\">\r\n");
        out.write("          <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("/admin/showProducts\">Products</a></li>\r\n");
        out.write("          <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("/admin/showCategory\">Category</a></li>\r\n");
        out.write("          <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("/admin/showSuppliers\">Supplier</a></li>\r\n");
        out.write("        </ul>\r\n");
        out.write("      </li>\r\n");
        out.write("      ");
      }
      if (_jspx_th_security_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f1);
      _jspx_th_security_005fauthorize_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_security_005fauthorize_005f1, _jsp_getInstanceManager(), _jspx_th_security_005fauthorize_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/templates/header.jsp(38,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.userPrincipal.name==null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <li><a href=\"registerUser\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n");
          out.write("      <li><a href=\"login\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/templates/header.jsp(43,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.userPrincipal.name!=null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Welcome ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.userPrincipal.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" </a></li>\r\n");
          out.write("      <li><a href=\"");
          if (_jspx_meth_c_005furl_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
      // /WEB-INF/views/templates/header.jsp(45,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/j_spring_security_logout");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/showProducts.jsp(24,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/showProducts.jsp(24,5) '${prodList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${prodList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/showProducts.jsp(24,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("p");
      // /WEB-INF/views/showProducts.jsp(24,5) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("s");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("      <tr>\r\n");
            out.write("        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("        <td><img src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("/Resources/images/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.pImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" alt=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pro.pImg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(" class=\"img-responsive\" width=\"45\" height=\"70\"></td>\r\n");
            out.write("        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.pName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.pQuantity}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.pPrice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.pDescription}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.category.cName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("        <td>\r\n");
            out.write("        \t<a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("/admin/updateProduct/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.pId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" class=\"btn btn-success\">Update</a>\r\n");
            out.write("        \t<a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("/admin/deleteProduct/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.pId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" class=\"btn btn-danger\">Delete</a>\r\n");
            out.write("        </td>\r\n");
            out.write("      </tr>\r\n");
            out.write("      ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
