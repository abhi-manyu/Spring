<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form:form action="./dosignup" method="post" modelAttribute="usersign">
          enter ur unique id : <form:input path="id"/><form:errors path="id" /><br>
          enter ur name : <form:input path="name"/><form:errors path="name" /><br>
          enter ur address : <form:input path="address" /><form:errors path="address" /><br>
          <input type="submit" value="Sign up" />
    </form:form>
</body>
</html>