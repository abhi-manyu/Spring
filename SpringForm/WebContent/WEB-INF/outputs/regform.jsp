<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
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
              <td>enter ur ID : </td>
              <td><form:input path="id"/>
           </tr>
           <tr>
              <td>enter ur name : </td>
              <td><form:input path="name"/>
           </tr>
           <tr>
              <td>enter ur address : </td>
              <td><form:input path="address"/>
           </tr>
           <tr>
              <td>enter ur PHONE no : </td>
              <td><form:input path="phoneno"/>
           </tr>
           <tr>
               <td><input type="reset" value="clear" /></td>
               <td><input type="submit" value="Register" /></td>
           </tr>
        </table>
    </form:form>
</body>
</html>