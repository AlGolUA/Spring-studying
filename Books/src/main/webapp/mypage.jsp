<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 04.04.2017
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Title</title>
</head>
<body>
<h1>Hello</h1>
 ${someVariable} / ${BIGNAMEVariable}
<br/>
${name}
 <%
     out.print("Hello!");
 %>


</body>
</html>
