<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
  #error
  {
    color: red;
  }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <font color="red">${error}</font>
<h2>forgot ur passsword ? let us help u</h2>
   <form:form action="./findpassword" modelAttribute="forget">
      <table>
         <tr>
           <td>enter ur unique username : </td>
           <td><form:input path="username"/>
           <td><form:errors path="username" id="error" /></td>
         </tr>
         <tr>
            <td></td>
            <td>
              <input type="reset" value="clear" />
              <input type="submit" value="reset" /><br>
            </td>
            <td>
                <a href="./registerForm">i m a new user</a><br>
                <a href="./loginform">i know my password</a>
            </td>
         </tr>
      </table>
   </form:form>
</body>
</html>