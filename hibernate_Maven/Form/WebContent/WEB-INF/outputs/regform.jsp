<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="./register" modelAttribute="reg">
   <table>
       <tr>
          <td>enter roll no : </td>
          <td><form:input path="id"/></td>
          <td><form:errors path="id" /></td>
       </tr>
       <tr>
          <td>enter name : </td>
          <td><form:input path="name"/></td>
          <td><form:errors path="name" /></td>
       </tr>
       <tr>
           <td><input type="reset" value="clear" /></td>
           <td><input type="submit" value="register" /></td>
       </tr>
   </table>
</form:form>
</body>
</html>