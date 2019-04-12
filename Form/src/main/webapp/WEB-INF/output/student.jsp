<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   
   <body>
      <h2>Student Information</h2>
      <form:form method = "POST" action = "./addStudent" modelAttribute="studentadd">
         <table>
            <tr>
               <td>enter ur id : </td>
               <td><form:input path = "id" /></td>
            </tr>
            <tr>
               <td>enter ur name : </td>
               <td><form:input path = "name" /></td>
            </tr>
            <tr>
               <td>enter ur age : </td>
               <td><form:input path = "age" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>