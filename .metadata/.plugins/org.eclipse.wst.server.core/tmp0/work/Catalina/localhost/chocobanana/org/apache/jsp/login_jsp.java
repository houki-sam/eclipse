/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-07-18 14:45:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/common/jsp/head.jsp", Long.valueOf(1595053434000L));
    _jspx_dependants.put("/common/jsp/nav.jsp", Long.valueOf(1595061311000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.servlet.http.HttpSession");
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPではGET、POST、またはHEADのみが許可されます。 JasperはOPTIONSも許可しています。");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
 String title_name = "はるみ通信販売" ;
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/chocobanana/common/css/top.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("<title>");
      out.print( title_name );
      out.write("</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-sm navbar-dark mb-3\" style=\"background-color:#d3d3d3;\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav4\" aria-controls=\"navbarNav4\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <a class=\"navbar-brand font-weight-bold\" href=\"/chocobanana\" style=\"color:#00336D\">はるみ通信販売</a>\n");
      out.write("        <div class=\"collapse navbar-collapse\">\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\n");
      out.write("            \t");
 if(request.isUserInRole("recept")){
      out.write("\n");
      out.write("\t                <li class=\"nav-item\">\n");
      out.write("\t                    <a class=\"nav-link\" href=\"/chocobanana/recept/menu\" style=\"color: #00336D\">注文受付</a>\n");
      out.write("\t                </li>\n");
      out.write("\t\t\t\t");
} if(request.isUserInRole("order")){
      out.write("\n");
      out.write("\t                <li class=\"nav-item\">\n");
      out.write("\t                    <a class=\"nav-link\" href=\"/chocobanana/order/menu\" style=\"color: #00336D\">発注</a>\n");
      out.write("\t                </li>\n");
      out.write("\t            ");
} if(request.isUserInRole("money")){
      out.write("\n");
      out.write("\t                <li class=\"nav-item\">\n");
      out.write("\t                    <a class=\"nav-link\" href=\"/chocobanana/money/menu\" style=\"color: #00336D\">請求入金</a>\n");
      out.write("\t                </li>\n");
      out.write("\t\t\t\t");
} 
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("            \t\n");
      out.write("            \t");
	HttpSession session1 = request.getSession(false);
            		if((String)request.getRemoteUser() != null) {
      out.write("\n");
      out.write("            \t\t<li class=\"nav-item\" >\n");
      out.write("            \t\t\t<a class=\"nav-link\" style=\"color: #00336D\">こんにちは");
      out.print((String)request.getRemoteUser() );
      out.write("</a>\n");
      out.write("            \t\t</li>\n");
      out.write("                \t<li class=\"nav-item\">\n");
      out.write("                \t\t<a href=\"/chocobanana/logout\">\n");
      out.write("                    \t\t<button class=\"btn\" style=\"background-color:#00336D;color: #fff;\">ログアウト</button>\n");
      out.write("                    \t</a>\n");
      out.write("                \t</li>\n");
      out.write("                ");
} else{
      out.write("\n");
      out.write("                \t<li class=\"nav-item\">\n");
      out.write("                \t<a href=\"/chocobanana/login/login\">\n");
      out.write("                    \t<button class=\"btn\" style=\"background-color:#00336D;color: #fff;\">ログイン</button>\n");
      out.write("                   \t</a>\n");
      out.write("                \t</li>\n");
      out.write("                ");
} 
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-3\"></div>\n");
      out.write("\t\t<div class=\"col-6\">\n");
      out.write("\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t<div class=\"card-header\">\n");
      out.write("\t\t\t\t\t<h4>ログイン</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t  \t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t<form class=\"form-signin\" action=\"");
      out.print( response.encodeURL("j_security_check"));
      out.write("\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<label for=\"inputEmail\" class=\"sr-only\">Email address</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\"  name=\"j_username\" id=\"inputEmail\" class=\"form-control mb-3\" placeholder=\"ユーザーID\" required=\"\" autofocus=\"\">\n");
      out.write("\t\t\t\t\t\t<label for=\"inputPassword\" class=\"sr-only\">Password</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\"  name=\"j_password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"パスワード\" required=\"\">\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-lg btn-block\" type=\"submit\" style=\"background-color:#00336D;color: #fff;\">サインイン</button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-lg btn-block mt-3\" type=\"submit\" style=\"background-color:#4D9BE8;color: #fff;\">戻る</button>\n");
      out.write("\t\t       \t</div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
}
