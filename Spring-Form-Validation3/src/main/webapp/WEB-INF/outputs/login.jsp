<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
   #submit{
      text-align: center;
   }
   #error{
      color: red;
      font-weight: bold;
   }
</style>
</head>
<body>
  <form:form action="./login" method="post" modelAttribute="log">
     <table>
        <tr>
           <td colspan="3"><h3>plz log in here</h3></td>
        </tr>
        <tr>
           <td>enter ur username : </td>
           <td><form:input path="username" placeholder="same as ur email" /></td>
           <td><form:errors path="username" id="error" />
        </tr>
        <tr>
           <td>enter ur password : </td>
           <td><form:input path="password"/></td>
           <td><form:errors path="password" id="error" />
        </tr>
        <tr>
           <td></td>
           <td id="submit">
               <input type="reset" value="clear" />
               <input type="submit" value="Login" />
           </td>
           <td></td>
        </tr>
     </table>
  </form:form>
</body>
</html>