/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-10-03 16:54:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Customer;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1727716940364L));
    _jspx_dependants.put("jar:file:/C:/Users/ACER/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098685890000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1727718915179L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1727972257172L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("Model.Customer");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"description\" content=\"Personal Profile Template\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"Profile, Portfolio, Personal, HTML\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Personal Profile | Template</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Font -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Lora:400,700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Cabin:400,500,600,700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Css Styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .profile-section {\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-card {\r\n");
      out.write("            box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .avatar {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 100px;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            object-fit: cover;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .edit-profile-btn {\r\n");
      out.write("            float: right;\r\n");
      out.write("            margin-top: -30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-control {\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("            color: #0b0b0b !important;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-info {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-info h3 {\r\n");
      out.write("            margin-bottom: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .edit-form {\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Popup Modal */\r\n");
      out.write("        .modal {\r\n");
      out.write("            display: none;\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            overflow: auto;\r\n");
      out.write("            background-color: rgba(0, 0, 0, 0.5);\r\n");
      out.write("            padding-top: 60px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .modal-content {\r\n");
      out.write("            margin: 5% auto;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border: 1px solid #888;\r\n");
      out.write("            width: 40%;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .close {\r\n");
      out.write("            color: #aaa;\r\n");
      out.write("            float: right;\r\n");
      out.write("            font-size: 28px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .close:hover,\r\n");
      out.write("        .close:focus {\r\n");
      out.write("            color: black;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("        .profile-info-data {\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Header Section Begin -->\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Lora:400,700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Cabin:400,500,600,700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Css Styles -->\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"assets/img/favicons/apple-touch-icon.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"assets/img/favicons/favicon-32x32.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"assets/img/favicons/favicon-16x16.png\">\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicons/favicon.ico\">\r\n");
      out.write("<link rel=\"manifest\" href=\"assets/img/favicons/manifest.json\">\r\n");
      out.write("<meta name=\"msapplication-TileImage\" content=\"assets/img/favicons/mstile-150x150.png\">\r\n");
      out.write("<meta name=\"theme-color\" content=\"#ffffff\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"assets/css/theme.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    .avatar-navbar {\r\n");
      out.write("        width: 40px;\r\n");
      out.write("        height: 40px;\r\n");
      out.write("        border-radius: 50%;\r\n");
      out.write("        object-fit: cover;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .profile-dropdown {\r\n");
      out.write("        display: none;\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        background-color: #f9f9f9;\r\n");
      out.write("        min-width: 160px;\r\n");
      out.write("        box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);\r\n");
      out.write("        z-index: 1;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .profile-dropdown ul {\r\n");
      out.write("        list-style-type: none;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .profile-dropdown ul li {\r\n");
      out.write("        padding: 12px 16px;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        display: block;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("        text-align: left;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .profile-dropdown ul li:hover {\r\n");
      out.write("        background-color: #f1f1f1;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .profile-dropdown ul li a {\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        color: black;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .profile-dropdown ul li a:hover {\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        color: black;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");

    Customer account = (Customer) session.getAttribute("account");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light fixed-top py-3 d-block\" data-navbar-on-scroll=\"data-navbar-on-scroll\">\r\n");
      out.write("    <div class=\"container\"><a class=\"navbar-brand d-inline-flex\" href=\"/\"><span class=\"text-light fs-2 fw-bold ms-2\">Watch</span></a>\r\n");
      out.write("        <button class=\"navbar-toggler collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse border-top border-lg-0 mt-4 mt-lg-0\" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("                <li class=\"nav-item px-2\"><a class=\"nav-link fw-bold active\" aria-current=\"page\" href=\"/\">WATCHES</a></li>\r\n");
      out.write("                <li class=\"nav-item px-2\"><a class=\"nav-link fw-bold\" href=\"#store\">STORE</a></li>\r\n");
      out.write("                <li class=\"nav-item px-2\"><a class=\"nav-link fw-bold\" href=\"#contact\">CONTACT</a></li>\r\n");
      out.write("                <li class=\"nav-item px-2\"><a class=\"nav-link fw-bold\" href=\"#header\">REQUEST VIRTUAL</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                ");
 if (account == null) { 
      out.write("\r\n");
      out.write("                    <li class=\"nav-item px-2\"><a class=\"nav-link fw-bold\" href=\"login.jsp\">LOGIN</a></li>\r\n");
      out.write("                    <li class=\"nav-item px-2\"><a class=\"nav-link fw-bold\" href=\"register.jsp\">REGISTER</a></li>\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                    <li class=\"nav-item px-2\"><img src=\"");
      out.print( account.getAvatar() );
      out.write("\" alt=\"avatar\" class=\"avatar-navbar\" id=\"avatar-navbar\"></li>\r\n");
      out.write("                    <div class=\"profile-dropdown\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"profile\">Profile</a></li>\r\n");
      out.write("                            <li><a href=\"logout\">Logout</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    document.getElementById(\"avatar-navbar\").addEventListener(\"click\", function () {\r\n");
      out.write("        document.getElementsByClassName(\"profile-dropdown\")[0].style.display = \"block\";\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    document.addEventListener(\"click\", function (e) {\r\n");
      out.write("        if (!e.target.matches('.avatar-navbar')) {\r\n");
      out.write("            var dropdowns = document.getElementsByClassName(\"profile-dropdown\");\r\n");
      out.write("            for (var d of dropdowns) {\r\n");
      out.write("                d.style.display = 'none';\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"vendors/@popperjs/popper.min.js\"></script>\r\n");
      out.write("<script src=\"vendors/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"vendors/is/is.min.js\"></script>\r\n");
      out.write("<script src=\"vendors/feather-icons/feather.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    feather.replace();\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"assets/js/theme.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300;700&amp;display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Header End -->\r\n");
      out.write("\r\n");
      out.write("<!-- Profile Section Begin -->\r\n");
      out.write("<section class=\"profile-section\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-8 offset-lg-2\">\r\n");
      out.write("                <div class=\"profile-card text-center\">\r\n");
      out.write("                    <!-- Avatar with click to change -->\r\n");
      out.write("                    <img src=\"");
      out.print( account.getAvatar() );
      out.write("\" alt=\"Avatar\" class=\"avatar\" id=\"avatar\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"profile-info\">\r\n");
      out.write("                        <h3>");
      out.print( account.getUserName() );
      out.write("</h3>\r\n");
      out.write("                        <button class=\"btn btn-primary edit-profile-btn\" id=\"editProfileBtn\">Edit Profile</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"profile-info-data\">\r\n");
      out.write("                        <p><strong>Email:</strong> ");
      out.print( account.getEmail() );
      out.write("</p>\r\n");
      out.write("                        <p><strong>Date of Birth:</strong> ");
      out.print( account.getDob() );
      out.write("</p>\r\n");
      out.write("                        <p><strong>Phone:</strong> ");
      out.print( account.getCusPhone() );
      out.write("</p>\r\n");
      out.write("                        <p><strong>Address:</strong> ");
      out.print( account.getAddress() );
      out.write("</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Form to Edit Profile -->\r\n");
      out.write("                    <form action=\"/profile\" id=\"editForm\" class=\"edit-form\" method=\"POST\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"name\">Full Name</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"name\" value=\"");
      out.print( account.getUserName() );
      out.write("\" name=\"name\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"email\">Email</label>\r\n");
      out.write("                            <input type=\"email\" class=\"form-control\" id=\"email\" value=\"");
      out.print( account.getEmail() );
      out.write("\" readonly name=\"email1\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"dob\">Date of Birth</label>\r\n");
      out.write("                            <input type=\"date\" class=\"form-control\" id=\"dob\" value=\"");
      out.print( account.getDob() );
      out.write("\" name=\"dob\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"phone\">Phone</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"phone\" value=\"");
      out.print( account.getCusPhone() );
      out.write("\" name=\"phone\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"address\">Address</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"address\" value=\"");
      out.print( account.getAddress() );
      out.write("\" name=\"address\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\">Save Changes</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" id=\"cancelEdit\">Cancel</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- Profile Section End -->\r\n");
      out.write("\r\n");
      out.write("<!-- Avatar Change Modal -->\r\n");
      out.write("<div id=\"avatarModal\" class=\"modal\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("        <span class=\"close\" id=\"closeModal\">&times;</span>\r\n");
      out.write("        <h4>Change Avatar</h4>\r\n");
      out.write("        <form method=\"post\" action=\"/change-avatar\" enctype=\"multipart/form-data\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"avatarUpload\">Upload New Avatar</label>\r\n");
      out.write("                <input type=\"file\" class=\"form-control-file\" id=\"avatarUpload\" name=\"avatarFile\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Upload</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<section class=\"py-0 pt-7\" id=\"contact\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-6 col-sm-4 col-xl-3 mb-3\">\r\n");
      out.write("        <h4 class=\"lh-lg fw-bold text-light\">WATCH</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-6 col-sm-4 col-xl-3 mb-3\">\r\n");
      out.write("        <h5 class=\"lh-lg fw-bold text-light\">MENU</h5>\r\n");
      out.write("        <ul class=\"list-unstyled mb-md-4 mb-lg-0\">\r\n");
      out.write("          <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none text-uppercase fw-bold\" href=\"#!\">Shipping Info</a></li>\r\n");
      out.write("          <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none text-uppercase fw-bold\" href=\"#!\">Refunds</a></li>\r\n");
      out.write("          <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none text-uppercase fw-bold\" href=\"#!\">How to Order</a></li>\r\n");
      out.write("          <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none text-uppercase fw-bold\" href=\"#!\">How to Track</a></li>\r\n");
      out.write("          <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none text-uppercase fw-bold\" href=\"#!\">Size Guides</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-6 col-sm-4 col-xl-3 mb-3\">\r\n");
      out.write("        <h5 class=\"mb-5\"></h5>\r\n");
      out.write("        <ul class=\"list-unstyled mb-md-4 mb-lg-0\">\r\n");
      out.write("          <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none text-uppercase fw-bold\" href=\"#!\">Contact Us</a></li>\r\n");
      out.write("          <li class=\"lh-lg\"><a class=\"text-800 text-decoration-none text-uppercase fw-bold\" href=\"#!\">my account</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-12 col-xl-3\">\r\n");
      out.write("        <h5 class=\"lh-lg fw-bold text-light text-uppercase\">Signup For our Latest News</h5>\r\n");
      out.write("        <div class=\"row input-group-icon mb-5\">\r\n");
      out.write("          <div class=\"col-12\">\r\n");
      out.write("            <form class=\"row row-cols-lg-auto g-0 align-items-center\">\r\n");
      out.write("              <div class=\"col-8 col-lg-9\">\r\n");
      out.write("                <label class=\"visually-hidden\" for=\"colFormLabel\">Username</label>\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <input class=\"rounded-end-0 form-control\" id=\"colFormLabel\" type=\"email\" placeholder=\"email address\" />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-4 col-lg-3\">\r\n");
      out.write("                <button class=\"btn btn-primary rounded-start-0\" type=\"submit\">Submit</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"border-bottom border-700\"></div>\r\n");
      out.write("    <div class=\"row flex-center my-3\">\r\n");
      out.write("      <div class=\"col-md-6 order-1 order-md-0\">\r\n");
      out.write("        <p class=\"my-2 text-800 text-center text-md-start\"> Made with&nbsp;\r\n");
      out.write("          <svg class=\"bi bi-suit-heart-fill\" xmlns=\"http://www.w3.org/2000/svg\" width=\"15\" height=\"15\" fill=\"#EB6453\" viewBox=\"0 0 16 16\">\r\n");
      out.write("            <path d=\"M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z\"></path>\r\n");
      out.write("          </svg>&nbsp;by&nbsp;<a class=\"text-500\" href=\"https://themewagon.com/\" target=\"_blank\">ThemeWagon </a>\r\n");
      out.write("        </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-6\">\r\n");
      out.write("        <div class=\"text-center text-md-end\"><a href=\"#!\"><span class=\"me-4\" data-feather=\"facebook\"></span></a><a href=\"#!\"> <span class=\"me-4\" data-feather=\"instagram\"></span></a><a href=\"#!\"> <span class=\"me-4\" data-feather=\"youtube\"></span></a><a href=\"#!\"> <span class=\"me-4\" data-feather=\"twitter\"></span></a></div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- end of .container-->\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- Js Plugins -->\r\n");
      out.write("<script src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    const editProfileBtn = document.getElementById('editProfileBtn');\r\n");
      out.write("    const editForm = document.getElementById('editForm');\r\n");
      out.write("    const cancelEdit = document.getElementById('cancelEdit');\r\n");
      out.write("    const avatar = document.getElementById('avatar');\r\n");
      out.write("    const avatarModal = document.getElementById('avatarModal');\r\n");
      out.write("    const closeModal = document.getElementById('closeModal');\r\n");
      out.write("\r\n");
      out.write("    editProfileBtn.addEventListener('click', function () {\r\n");
      out.write("        editForm.style.display = 'block';\r\n");
      out.write("        editProfileBtn.style.display = 'none';\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    cancelEdit.addEventListener('click', function () {\r\n");
      out.write("        editForm.style.display = 'none';\r\n");
      out.write("        editProfileBtn.style.display = 'block';\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    avatar.addEventListener('click', function () {\r\n");
      out.write("        avatarModal.style.display = 'block';\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    closeModal.addEventListener('click', function () {\r\n");
      out.write("        avatarModal.style.display = 'none';\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    window.onclick = function (event) {\r\n");
      out.write("        if (event.target === avatarModal) {\r\n");
      out.write("            avatarModal.style.display = 'none';\r\n");
      out.write("        }\r\n");
      out.write("    };\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
      // /profile.jsp(138,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty error}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <div class=\"alert alert-danger mt-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("                        ");
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
      // /profile.jsp(141,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty success}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <div class=\"alert alert-success mt-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${success}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("                        ");
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
}
