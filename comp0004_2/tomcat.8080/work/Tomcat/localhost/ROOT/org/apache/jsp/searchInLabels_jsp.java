/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2023-03-12 20:31:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import comp0004.model.element.ElementList;
import java.util.ArrayList;
import java.util.Collections;

public final class searchInLabels_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("comp0004.model.element.ElementList");
    _jspx_imports_classes.add("java.util.Collections");
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/meta.jsp", out, false);
      out.write("\r\n");
      out.write("    <title>List webapp</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .themed-grid-col {\r\n");
      out.write("            padding-top: .75rem;\r\n");
      out.write("            padding-bottom: .75rem;\r\n");
      out.write("            background-color: rgba(86, 61, 124, .15);\r\n");
      out.write("            border: 1px solid rgba(86, 61, 124, .2);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .themed-container {\r\n");
      out.write("            padding: .75rem;\r\n");
      out.write("            margin-bottom: 1.5rem;\r\n");
      out.write("            background-color: rgba(0, 123, 255, .15);\r\n");
      out.write("            border: 1px solid rgba(0, 123, 255, .2);\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <h2>Search results</h2>\r\n");
      out.write("    ");

        ArrayList<ArrayList<ElementList>> traces = (ArrayList<ArrayList<ElementList>>) request.getAttribute("traces");
    
      out.write("\r\n");
      out.write("    <div class=\"row themed-container\">\r\n");
      out.write("        <h3 class=\"text-center\">Found ");
      out.print(traces.size());
      out.write(" results.</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row fw-bold\">\r\n");
      out.write("        <div class=\"col-md-6 themed-grid-col\">\r\n");
      out.write("            Found element\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6 themed-grid-col\">\r\n");
      out.write("            Element trace\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");

        for (ArrayList<ElementList> array : traces) {
    
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-6 themed-grid-col\">\r\n");
      out.write("\r\n");
      out.write("            <h5>");
      out.print(array.get(0).getLabel());
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(array.get(0).getType());
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-md-6 themed-grid-col text-center\">\r\n");
      out.write("            ");

                Collections.reverse(array);
                String href;
                String label = "";
                for (ElementList element : array) {
                    if (element.getID() == 0)
                        href = "mainListView.html";
                    else
                        href = "itemListView.html?list=" + element.getID();
                    if (element.getID() != array.get(array.size() - 1).getID())
                        label = " -> ";
                    else
                        label = "";
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <a href=\"");
      out.print(href);
      out.write('"');
      out.write('>');
      out.print(element.getLabel());
      out.write("\r\n");
      out.write("            </a> ");
      out.print(label);
      out.write("\r\n");
      out.write("            ");


                }
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    ");

        }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <hr>\r\n");
      out.write("    <a href=\"mainListView.html\">Go back to the main list.</a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
}