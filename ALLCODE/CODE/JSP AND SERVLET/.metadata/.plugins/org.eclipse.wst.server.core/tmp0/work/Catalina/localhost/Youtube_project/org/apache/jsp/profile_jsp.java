/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2024-03-08 05:56:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.blog.entities.User;
import com.tech.blog.entities.Message.*;
import com.tech.blog.entities.Message;
import com.tech.blog.dao.PostDao;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.entities.*;
import java.util.ArrayList;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.tech.blog.entities");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.tech.blog.entities.Message");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.tech.blog.helper.ConnectionProvider");
    _jspx_imports_classes.add("com.tech.blog.dao.PostDao");
    _jspx_imports_classes.add("com.tech.blog.entities.Message");
    _jspx_imports_classes.add("com.tech.blog.entities.User");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"Error_page.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
 User user=(User)session.getAttribute("currentUser"); if(user==null) {
                response.sendRedirect("Login_jsp.jsp"); } else { } 
      out.write("\r\n");
      out.write("                <!DOCTYPE html>\r\n");
      out.write("                <html>\r\n");
      out.write("\r\n");
      out.write("                <head>\r\n");
      out.write("                    <meta charset=\"UTF-8\">\r\n");
      out.write("                    <title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("                    <!-- this is css bootstrap -->\r\n");
      out.write("                    <link rel=\"stylesheet\"\r\n");
      out.write("                        href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\"\r\n");
      out.write("                        integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\"\r\n");
      out.write("                        crossorigin=\"anonymous\" />\r\n");
      out.write("                    <!-- this is font icon awensome -->\r\n");
      out.write("                    <link rel=\"stylesheet\"\r\n");
      out.write("                        href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("                    <link href=\"css/NewFile.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- from here we are using the clip path for that following link -->\r\n");
      out.write("                    <style>\r\n");
      out.write("                        .banner-background {\r\n");
      out.write("\r\n");
      out.write("                            clip-path: polygon(50% 0%, 100% 0, 100% 35%, 100% 92%, 80% 88%, 49% 96%, 20% 92%, 0 93%, 0% 35%, 0 0);\r\n");
      out.write("                        }\r\n");
      out.write("                    </style>\r\n");
      out.write("                </head>\r\n");
      out.write("\r\n");
      out.write("                <body>\r\n");
      out.write("\r\n");
      out.write("                    <!-- this is navbar starting -->\r\n");
      out.write("\r\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg navbar-dark userdefinecolor-background\">\r\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.jsp\"> <span class=\"fa fa-bullseye\"></span> techBlog</a>\r\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("                            data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\r\n");
      out.write("                            aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                            <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                                <li class=\"nav-item active\">\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\"> <span class=\"	fa fa-check-square\"></span> learnCode\r\n");
      out.write("                                        with Ritik <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\">Contact</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                \r\n");
      out.write("                                 <li class=\"nav-item\">\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\" data-toggle=\"modal\" data-target=\"#add-post-modal\">Post</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"nav-item dropdown\">\r\n");
      out.write("                                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\r\n");
      out.write("                                        data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                        Categories\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Programming Language</a>\r\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Project Implementation</a>\r\n");
      out.write("                                        <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Data Structure</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <ul class=\"navbar-nav mr-right\">\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("\r\n");
      out.write("                                    <!-- Button trigger modal -->\r\n");
      out.write("\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"#!\" data-toggle=\"modal\" data-target=\"#profile-model\">\r\n");
      out.write("                                        <span class=\"fa fa-user-circle\"></span>\r\n");
      out.write("                                        ");
      out.print( user.getName() );
      out.write("\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"LogOutServlet\"> <span\r\n");
      out.write("                                            class=\"fa fa-user-plus\"></span>logout</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </nav>\r\n");
      out.write("\r\n");
      out.write("                    <!-- this is ending of navbar -->\r\n");
      out.write("                   \r\n");
      out.write("					");

                                Message m = (Message) session.getAttribute("msg");
                                if (m != null) {
                            
      out.write("\r\n");
      out.write("                            <div class=\"alert ");
      out.print( m.getCssClass() );
      out.write("\" role=\"alert\">\r\n");
      out.write("                                ");
      out.print( m.getContent() );
      out.write("\r\n");
      out.write("                            </div> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            ");
        
                                    session.removeAttribute("msg");
                                }

                            
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- this is for main tag -->\r\n");
      out.write("\r\n");
      out.write("	<main>\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row mt-4\">\r\n");
      out.write("			<!-- first col -->\r\n");
      out.write("				<div class=\"col-md-4\">\r\n");
      out.write("				<!-- display all the categories of post -->\r\n");
      out.write("					<div class=\"list-group\">\r\n");
      out.write("					  <a href=\"#\" class=\"list-group-item list-group-item-action active\">\r\n");
      out.write("					    All posts\r\n");
      out.write("					  </a>\r\n");
      out.write("					  <a href=\"#\" class=\"list-group-item list-group-item-action\">java programming by hard code</a>\r\n");
      out.write("					  <!-- fetch the category from PostDao which take data from database.... -->\r\n");
      out.write("					  <!-- categories -->\r\n");
      out.write("					  ");


				        PostDao p = new PostDao(ConnectionProvider.getConnection());
						ArrayList<category> list1 = p.getAllcategories();
						
						for(category c:list1)
						{
						
      out.write("\r\n");
      out.write("						\r\n");
      out.write("						 <a href=\"#\" class=\"list-group-item list-group-item-action\">java programming by hard code</a>\r\n");
      out.write("						 <a href=\"#\" class=\"list-group-item list-group-item-action\"> ");
      out.print( c.getName() );
      out.write(" </a>\r\n");
      out.write("						");

						}
				       
				       
      out.write("\r\n");
      out.write("					  \r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			<!-- second col -->\r\n");
      out.write("				<div class=\"col-md-8\">\r\n");
      out.write("				<!-- display all posts -->\r\n");
      out.write("				\r\n");
      out.write("		\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("	\r\n");
      out.write("	</main>\r\n");
      out.write("<!-- end of main tag -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!-- this is profile model -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Modal -->\r\n");
      out.write("                    <div class=\"modal fade\" id=\"profile-model\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("                        aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                            <div class=\"modal-content\">\r\n");
      out.write("                                <div class=\"modal-header userdefinecolor-background text-white\">\r\n");
      out.write("                                    <h5 class=\"modal-title\" id=\"exampleModalLabel\"> profile details </h5>\r\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                                        <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"modal-body text-center\">\r\n");
      out.write("                                    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                                        <img alt=\"\" class=\"image-profile\" src=\"pics/");
      out.print(user.getProfile());
      out.write("\" width=\"80px\"\r\n");
      out.write("                                            height=\"60px\" style=\"border-radius:50%;\">\r\n");
      out.write("                                        <h5 class=\"modal-title\" id=\"profile_name\">\r\n");
      out.write("                                            ");
      out.print(user.getName() );
      out.write("\r\n");
      out.write("                                        </h5>\r\n");
      out.write("\r\n");
      out.write("                                        <!-- this is for display the details of user-- by table -->\r\n");
      out.write("\r\n");
      out.write("                                        <div id=\"profile-details\">\r\n");
      out.write("                                            <table class=\"table\">\r\n");
      out.write("                                                <tbody>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th scope=\"col\">id</th>\r\n");
      out.write("                                                        <th scope=\"col\">\r\n");
      out.write("                                                            ");
      out.print(user.getId() );
      out.write("\r\n");
      out.write("                                                        </th>\r\n");
      out.write("\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                </tbody>\r\n");
      out.write("                                                <tbody>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th scope=\"row\">Email</th>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            ");
      out.print(user.getEmail() );
      out.write("\r\n");
      out.write("                                                        </td>\r\n");
      out.write("\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th scope=\"row\">gender</th>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            ");
      out.print(user.getGender() );
      out.write("\r\n");
      out.write("                                                        </td>\r\n");
      out.write("\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th scope=\"row\">join date</th>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            ");
      out.print(user.getDateTime() );
      out.write("\r\n");
      out.write("                                                        </td>\r\n");
      out.write("\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th scope=\"row\">details </th>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            ");
      out.print(user.getAbout() );
      out.write("\r\n");
      out.write("                                                        </td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                </tbody>\r\n");
      out.write("                                            </table>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <!-- this is edit profile.. -->\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div id=\"profile-edit-details\" style=\"display:none;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <h3 class=\"mt-2\">please edit care fully</h3>\r\n");
      out.write("                                            \r\n");
      out.write("                                            <form action=\"ServletEdit\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("                                                <table class=\"table\">\r\n");
      out.write("\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td> ID:</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            ");
      out.print(user.getId() );
      out.write("\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td> Email:</td>\r\n");
      out.write("                                                        <td> <input type=\"email\" class=\"form-control\" name=\"user_email\"\r\n");
      out.write("                                                                value=\"");
      out.print( user.getEmail());
      out.write("\"></td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td> Name:</td>\r\n");
      out.write("                                                        <td> <input type=\"text\" class=\"form-control\" name=\"user_name\"\r\n");
      out.write("                                                                value=\"");
      out.print( user.getName());
      out.write("\"></td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td> Password:</td>\r\n");
      out.write("                                                        <td> <input type=\"password\" class=\"form-control\"\r\n");
      out.write("                                                                name=\"user_password\" value=\"");
      out.print( user.getPassword());
      out.write("\">\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td> choose pic:</td>\r\n");
      out.write("                                                        <td> <input type=\"file\" class=\"form-control\" name=\"user_image\">\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("\r\n");
      out.write("                                                </table>\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-outline-primary\">save</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"modal-footer\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                                    <button id=\"edit-profile-button\" type=\"button\" class=\"btn btn-primary\">Edit</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- this is end of profile model -->\r\n");
      out.write("\r\n");
      out.write("				<!-- this is for post modal  -->\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"add-post-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Provide the post details..</h5>\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("       <form id=\"add-post-form\" action=\"AddPostServlet\" method=\"post\">\r\n");
      out.write("       <div class=\"form-group\">\r\n");
      out.write("       <select class=\"form-control\" name=\"c_id\">\r\n");
      out.write("       <option selected >---select category---</option>\r\n");
      out.write("       <option>ritik</option>\r\n");
      out.write("       <!-- fetch the category from PostDao which take data from database.... -->\r\n");
      out.write("      ");

        PostDao postd = new PostDao(ConnectionProvider.getConnection());
		ArrayList<category> list = postd.getAllcategories();
		
		for(category c:list)
		{
		
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		<option value=\"");
      out.print(c.getCategory_id() );
      out.write('"');
      out.write(' ');
      out.write('>');
      out.print( c.getName() );
      out.write(" </option>\r\n");
      out.write("		");

		}
       
       
      out.write("\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("      \r\n");
      out.write("       <option>sharma</option>\r\n");
      out.write("       </select>\r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       <div class=\"form-group\">\r\n");
      out.write("       <input type=\"text\" name=\"pTitle\" placeholder=\"enter post Title\" class=\"form-control\"/>\r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("       <div class=\"form-group\">\r\n");
      out.write("       <textarea name=\"pContent\" class=\"form-control\" style=\"height:150px;\" placeholder=\"enter your content\"></textarea>\r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("       <div class=\"form-group\">\r\n");
      out.write("       <textarea name=\"pCode\" class=\"form-control\" style=\"height:150px;\" placeholder=\"enter your program(if any)\"></textarea>\r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("       <div class=\"form-group\">\r\n");
      out.write("       <label>Select your pic..</label>\r\n");
      out.write("       <br>\r\n");
      out.write("       <input type=\"file\"  name=\"pic\"/>\r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("      <div class=\"container text-center\">\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-outline-primary\">Post</button>\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("				\r\n");
      out.write("				<!-- this is end of post modal -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!-- java script bootstrap libraries -->\r\n");
      out.write("                    <script src=\"https://code.jquery.com/jquery-3.7.0.min.js\"\r\n");
      out.write("                        integrity=\"sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=\"\r\n");
      out.write("                        crossorigin=\"anonymous\"></script>\r\n");
      out.write("                    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"\r\n");
      out.write("                        integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\"\r\n");
      out.write("                        crossorigin=\"anonymous\"></script>\r\n");
      out.write("                    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"\r\n");
      out.write("                        integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\"\r\n");
      out.write("                        crossorigin=\"anonymous\"></script>\r\n");
      out.write("                    <script src=\"js/myjs.js\" type=\"text/javascript\"></script>\r\n");
      out.write("                    <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\r\n");
      out.write("                    <script>\r\n");
      out.write("\r\n");
      out.write("                        $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("                            let editStatus = false;\r\n");
      out.write("\r\n");
      out.write("                            $('#edit-profile-button').click(function () {\r\n");
      out.write("                                //		alert(\"button clicked to edit profile\")\r\n");
      out.write("\r\n");
      out.write("                                if (editStatus == false) {\r\n");
      out.write("                                    $(\"#profile-details\").hide()\r\n");
      out.write("                                    $(\"#profile-edit-details\").show();\r\n");
      out.write("                                    editStatus = true;\r\n");
      out.write("                                }\r\n");
      out.write("                                else {\r\n");
      out.write("                                    $(\"#profile-details\").show()\r\n");
      out.write("                                    $(\"#profile-edit-details\").hide();\r\n");
      out.write("                                    editStatus = false;\r\n");
      out.write("\r\n");
      out.write("                                }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                    </script>\r\n");
      out.write("	   <!-- now add post js  -->\r\n");
      out.write("	   <script>\r\n");
      out.write("	   // using the zquery to display the page loaded..\r\n");
      out.write("	   $(document).ready(function(e){\r\n");
      out.write("		   //alert(\"loaded..\")\r\n");
      out.write("		   // applying a listener..\r\n");
      out.write("		   $(\"#add-post-form\").on(\"submit\",function(event){\r\n");
      out.write("			   // this code gets called when form is submitted..\r\n");
      out.write("			   event.preventDefault();\r\n");
      out.write("			   \r\n");
      out.write("			   console.log(\"you have submitedd..\")\r\n");
      out.write("			   // fetching the data\r\n");
      out.write("			   let form = new FormData(this);\r\n");
      out.write("			   // sending the daata to servlet thorw ajex\r\n");
      out.write("			   // now requesting to server\r\n");
      out.write("			   $.ajax({\r\n");
      out.write("				   url:\"AddPostServlet\",\r\n");
      out.write("				   type:'POST',\r\n");
      out.write("				   data:form,\r\n");
      out.write("				   contentType: false, // Important for FormData\r\n");
      out.write("		            processData: false, // Important for FormData\r\n");
      out.write("		            success: function(data) {\r\n");
      out.write("		                // Success. Log the response.\r\n");
      out.write("		                console.log(data);\r\n");
      out.write("		                // to display the sms after post the post\r\n");
      out.write("		                if(data.trim() == \"data done\"){\r\n");
      out.write("		                	\r\n");
      out.write("		                	swal(\"Good job!\", \"You clicked the button!\", \"success\");\r\n");
      out.write("		                }else{\r\n");
      out.write("		                	swal(\"try again!\", \"Error on post servelt\", \"error\");\r\n");
      out.write("		                }\r\n");
      out.write("		            },\r\n");
      out.write("				   error:function(jqXHR,textStatus,errorThrown){\r\n");
      out.write("					   // error sms....\r\n");
      out.write("					   swal(\"try again!\", \"somthing went wrong\", \"error\");\r\n");
      out.write("				   }\r\n");
      out.write("			   })\r\n");
      out.write("			   \r\n");
      out.write("		   })\r\n");
      out.write("	   })\r\n");
      out.write("	   </script>\r\n");
      out.write("\r\n");
      out.write("                </body>\r\n");
      out.write("\r\n");
      out.write("                </html>");
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