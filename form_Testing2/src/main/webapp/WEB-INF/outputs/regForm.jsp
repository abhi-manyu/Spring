<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form:form action="./register" method="post" modelAttribute="reg">
      <table>
         <tr>
            <td>enter ur name : </td>
            <td><form:input path="name"/></td>
            <td><form:errors path="name"/></td>
         </tr>
      </table>
      
      
      <table>
         <tr>
            <td>enter ur flat no : </td>
            <td><form:input path="add.flatNo"/>
         </tr>
         <tr>
            <td>enter ur pg Name : </td>
            <td><form:input path="add.pgName"/>
         </tr>
         <tr>
            <td>enter name of ur layout : </td>
            <td><form:input path="add.layout"/>
         </tr>
         <tr>
            <td><input type="reset" value="clear" /></td>
            <td><input type="submit" value="submit" /></td>
         </tr>
      </table>
   </form:form>
</body>
</html>