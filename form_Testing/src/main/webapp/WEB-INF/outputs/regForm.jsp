<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
   #errors{
      color: red;
      font-weight: bold;
   }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form:form action="./register" method="post" modelAttribute="reg">
      <table>
          <caption style="color: red;">qualification details</caption>
          <tr>
            <td>enter id : </td>
            <td><form:input path="id"/></td>
            <td><form:errors path="id" id="errors"/></td>
          </tr>
          <tr>
            <td>enter name : </td>
            <td><form:input path="name"/></td>
            <td><form:errors path="name" id="errors" /></td>
          </tr>
          <tr>
            <td>enter ur valid mail id : </td>
            <td><form:input path="mail"/></td>
            <td><form:errors path="mail" /></td>
          </tr>
          <tr>
            <td>enter courses : </td>
            <td>
               <form:checkbox path="courses" name="courses" value="java" />java<br>
               <form:checkbox path="courses" name="courses" value="Spring" />Spring<br>
               <form:checkbox path="courses" name="courses" value="Hibernate" />Hibernate<br>
               <form:checkbox path="courses" name="courses" value="HTML/CSS" />HTML/CSS<br>
               <form:checkbox path="courses" name="courses" value="REST" />REST
            </td>
            <td><form:errors path="courses" id="errors" /></td>
          </tr>
           <tr>
               <td>enter the flat number : </td>
               <td><form:input path="add.flatNo"/>
           </tr>
           <tr>
               <td>enter the PG name : </td>
               <td><form:input path="add.pgName"/>
           </tr>
           <tr>
               <td>enter the lay out : </td>
               <td><form:input path="add.layout"/>
           </tr>
           <tr>
               <td>enter zip address : </td>
               <td><form:input path="add.pin"/>
           </tr>
           <tr>
               <td><input type="reset" value="clear" /></td>
               <td><input type="submit" value="Register" /></td>
           </tr>
      </table>
   </form:form>
</body>
</html>