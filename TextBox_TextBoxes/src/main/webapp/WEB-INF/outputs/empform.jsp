<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <form:form action="./hit" modelAttribute="emp">
         <table>
            <tr>
               <td>u want to receive new letter</td>
               <td><form:checkbox path="rcv_ofrs"/></td>
            </tr>
            <tr>
               <td>select ur skills : </td>
               <td>
                  <form:checkbox path="courses" value="core java" name="courses" />corejava
                  <form:checkbox path="courses" value="JSP/Servlet" name="courses" />jspServlet
                  <form:checkbox path="courses" value="Hibernate" name="courses" />Hibernate
                  <form:checkbox path="courses" value="Spring" name="courses" />Spring
                  <form:checkbox path="courses" value="REST" name="courses" />REST
               </td>
            </tr>
            <tr>
                <td><input type="reset" value="clear" /></td>
                <td><input type="submit" value="submit" /></td>
            </tr>
         </table>
      </form:form>
</body>
</html>