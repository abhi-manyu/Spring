<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
   div {
	float: left;
	display: inline-block;
	margin-left: 20px;
	list-style-type: none;
}
#error{
   color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <font color="red"> ${infor} </font>
   <form:form action="./save" modelAttribute="stu" method="post">
      <table>
          <tr>
             <td>enter ur roll no : </td>
             <td><form:input path="rolno"/></td>
             <td><form:errors path="rolno" id="error" />
          </tr>
          <tr>
             <td>enter ur name : </td>
             <td><form:input path="name"/></td>
             <td><form:errors path="name" id="error"/>
          </tr>
          <tr>
             <td>enter ur secure password : </td>
             <td><form:input path="password"/></td>
             <td><form:errors path="password" id="error"/>
          </tr>
          <tr>
             <td>select ur country : </td>
             <td>
                <form:select path="country">
                   <form:option value="">--select--</form:option>
                   <form:option value="India">India</form:option>
                   <form:option value="China">China</form:option>
                   <form:option value="USA">USA</form:option>
                   <form:option value="RUSSIA">RUssia</form:option>
                   <form:option value="Austrellia">Austrellia</form:option>
                </form:select>
             </td>
             <td><form:errors path="country" id="error" />
          </tr>
          <tr>
             <td>select the skills : </td>
             <td>
                <div>
                       <h4>Development</h4>
                   <ul>
                      <li><form:checkbox path="course" value="java"/>java</li>
                      <li><form:checkbox path="course" value="Spring"/>Spring</li>
                      <li><form:checkbox path="course" value="Hibernate"/>Hibernate</li>
                      <li><form:checkbox path="course" value="HTML/CSS"/>HTML/CSS</li>
                      <li><form:checkbox path="course" value="RESTful"/>RESTful</li>
                   </ul>
                </div>
                <div>
                     <h4>Testing</h4>
                   <ul>
                      <li><form:checkbox path="course" value="selenium"/>selenium</li>
                      <li><form:checkbox path="course" value="Automation"/>Automation</li>
                      <li><form:checkbox path="course" value="Java"/>Java</li>
                      <li><form:checkbox path="course" value="HTML/CSS"/>HTML/CSS</li>
                      <li><form:checkbox path="course" value="Sql"/>Sql</li>
                   </ul>
                </div>
             </td>
             <td><form:errors path="course" id="error" /></td>
          </tr>
          <tr>
             <td></td>
             <td>
                 <input type="reset" value="clear" />
                  <input type="submit" value="save" />
             </td>
          </tr>
      </table>
   </form:form>
</body>
</html>