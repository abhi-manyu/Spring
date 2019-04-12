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
    <h2>u r successfully registered</h2>
       Roll no is : ${stu.rolno}<br>
       username : <mark>${stu.name}</mark><br>
       password : <mark>${stu.password}</mark><br>
    country u reside is : ${stu.country}<br>
    skills acquired : ${stu.course}
</body>
</html>