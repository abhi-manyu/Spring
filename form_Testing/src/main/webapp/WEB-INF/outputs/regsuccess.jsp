<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   ID   : ${reg.id}<br>
   name : ${reg.name}<br>
   courses : ${reg.courses}<br>
   Address : ${reg.add.flatNo}<br>${reg.add.pgName}, ${reg.add.layout}<br>${reg.add.pin}
</body>
</html>