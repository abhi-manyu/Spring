<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ page isELIgnored="false" %>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>

      <h2>Submitted Student Information</h2>
      <table>
         <tr>
            <td>Name</td>
            <td>${studentadd.name}</td>
         </tr>
         <tr>
            <td>Age</td>
            <td>${studentadd.age}</td>
         </tr>
         <tr>
            <td>ID</td>
            <td>${studentadd.id}</td>
         </tr>
      </table>  
   </body>
</html>