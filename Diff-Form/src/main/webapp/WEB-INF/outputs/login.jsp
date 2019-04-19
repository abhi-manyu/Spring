<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#error{
  color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <font id="error">${error}</font>
    <form:form action="./login" modelAttribute="login">
       <table>
          <tr>
            <td>enter username : </td>
            <td><form:input path="username"/></td>
            <td><form:errors path="username" id="error" /></td>
          </tr>
          <tr>
            <td>enter password : </td>
            <td><form:password path="password"/></td>
            <td><form:errors path="password" id="error" /></td>
          </tr>
          <tr>
            <td><input type="reset" value="clear" /></td>
            <td><input type="submit" value="Login" /></td>
            <td>
                <a href="./disform">i forgot my password</a><br>
                <a href="./registerForm">i m a new user</a>
            </td>
          </tr>
       </table>
    </form:form>
</body>
</html>