<%@ page import="ucl.ac.uk.things.list" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Main List</title>
</head>
<body>

<div>
    <%type(list main = request.getAttribute("mainList"));%>
    <div>
        <h2><%=main.getName()%>
        </h2>
    </div>
</div>
<p><%=message%></p>
</body>
</html>