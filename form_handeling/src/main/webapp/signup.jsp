<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
  body{
   background-color: teal;
  }
  .signup {
	background-color: olive;
	width: 12.5cm;
	font-size: 15px;
	margin: 5cm;
	border-radius: 20px;
	font-size: 15px;
	font-family: cursive;
}
 
   table{
     width: 7cm;
     padding: 1.5cm;
     text-align: center;
   }
 
  input[type=text],input[type=number] {
	width: 5cm;
	height: 30px;
	font-size: 15px;
	font-family: cursive;
	border-radius: 10px;
	background-color:#ffff99 ;
	text-align: center;
	
}
input[type=password] {
	width: 5cm;
	height: 30px;
	border-radius: 10px;
	text-align: center;
}
input[type=submit]{
   height: 1cm;
   width: 2cm;
   cursor: pointer;
   background-color: green;
   border-radius: 10px;
}
input[type=reset]{
   height: 1cm;
   width: 2cm;
   cursor: crosshair;
   background-color: red;
   border-radius: 10px;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${warn}
  <div class="signup">
      <form name="signUpForm" onsubmit="return passwordValidate()" action="./signup">
         <table>
            <tr>
               <td>Employee ID : </td>
               <td> <input name="eid" type="number" placeholder="plz enter numbers only" 
                       required  /></td>
            </tr>
            <tr>
               <td>employeeName : </td>
               <td> <input name="enm" type="text" placeholder="enter full name" required /></td>
            </tr>
            <tr>
               <td>employee Salary : </td>
               <td><input type="text" name="esal" /></td>
            </tr>
            <tr>
               <td>employeeAddress : </td>
               <td> <input type="text" name="eadd" /></td>
            </tr>
            <tr>
               <td>companyName : </td>
               <td><input type="text" name="compnm" /></td>
            </tr>
            <tr>
               <td>emp Blood group : </td>
               <td><input type="text" name="bldgrp" /></td>
            </tr>
            <tr>
               <td>set ur password : </td>
               <td><input type="password" name="pass" title="length must be greater than five character"
                    required /></td>
            </tr>
            <tr>
               <td>confirm ur password : </td>
               <td><input type="text" name="cpass" placeholder="same as ur password" 
                         required /></td>
            </tr>
            <tr>
                <td><input type="submit" value="SignUp" onclick="passwordValidate()" /></td>
                <td><input type="reset" value="clear" /></td>
            </tr>
            <tr>
                <td colspan=2><a href="index.jsp">i alredy have an account</a></td>
            </tr>
         </table>
      </form>
  </div>
  <script>
      function passwordValidate()
      {
		  var password=document.forms["signUpForm"]["pass"].value;
		  var conPass=document.forms["signUpForm"]["cpass"].value;
		  if(!(password==conPass))
		  {
		      alert("password not matched");
		      return false;
		  }
	  }
  </script>
</body>
</html>