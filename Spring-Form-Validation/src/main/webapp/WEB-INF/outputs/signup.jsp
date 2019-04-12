<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
    #middle{
       text-align: center;
    }
    #errors{
       color: red;
       font-weight: bold;
    }
</style>
</head>
<body>
      <font color="red"> ${error}</font>
   <form:form action="./doSignUp" method="post" modelAttribute="signup">
     <table>
        <tr>
           <td colspan="3" id="middle"><h2>do register here</h2></td>
        </tr>
        <tr>
           <td>enter ur regd no : </td>
           <td><form:input path="id"/></td>
           <td><form:errors path="id" id="errors" /></td>
        </tr>
        <tr>
           <td>enter ur name : </td>
           <td><form:input path="name"/></td>
           <td></td>
        </tr>
        <tr>
           <td>enter ur mark : </td>
           <td><form:input path="marks"/></td>
           <td></td>
        </tr>
        <tr>
           <td>enter ur Address : </td>
           <td><form:textarea path="address"></form:textarea></td>
           <td></td>
        </tr>
        <tr>
            <td>enter ur city : </td>
            <td>
                <form:select path="city" name="city">
                  <form:option value="">--select--</form:option>
                  <form:option value="Hidrabad">Hydrabad</form:option>
                  <form:option value="Bangalore">Bangalore</form:option>
                  <form:option value="Bhubaneswar">Bhubaneswar</form:option>
                  <form:option value="Mumbai">mimbai</form:option>
                  <form:option value="Kolkata">Kolkata</form:option> 
                </form:select>
            </td>
            <td><form:errors path="city" id="errors"/></td>
        </tr>
        <tr>
            <td>select ur desired courses : </td>
            <td>
               <form:checkbox path="courses" name="course" value="java"/>java<br>
               <form:checkbox path="courses" name="course" value="Spring"/>Spring<br>
               <form:checkbox path="courses" name="course" value="Hibernate"/>Hibernate<br>
               <form:checkbox path="courses" name="course" value="WebServices"/>WebServices<br>
               <form:checkbox path="courses" name="course" value="HTML/CSS"/>HTML/CSS<br>
               <form:checkbox path="courses" name="course" value="REST"/>REST<br>
            </td>
        </tr>
        <tr>
           <td>enter ur password : </td>
           <td><form:input path="password"/></td>
           <td><form:errors path="password" id="errors" /></td>
        </tr>
        <tr>
           <td>confirm ur password : </td>
           <td><form:input path="conPassword"/></td>
           <td><form:errors path="conPassword"  id="errors"/></td>
        </tr>
        <tr>
           <td></td>
           <td id="middle">
               <input type="reset" value="clear" />
               <input type="submit" value="Sign Up" />
           </td>
        </tr>
     </table>
   </form:form>
</body>
</html>