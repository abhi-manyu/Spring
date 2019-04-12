<html>
<head>
  <style>
    body {
	background-color: teal;
}
.login {
	margin: 5cm;
	background-color: olive;
	text-align: center;
	width: 10cm;
	font-family: cursive;
	border-radius: 20px;
}
input[type=text],input[type=password],input[type=number] {
	height: 0.8cm;
	font-family: cursive;
	border-radius: 5px;
	background-color: silver;
	text-align: center;
}
table {
	text-align: center;
	padding: 1.5cm;
	width: 7cm;
}
input[type=submit],input[type=reset]
{
   height: 1cm;
   width: 2cm;
   border-radius: 10px;
   font-family: cursive;
   cursor: pointer;
}
input[type=submit]{
  background-color: blue;
}
input[type=reset]{
  background-color: red;
}
h2 {
	color: #66ccff;
	background-color: black;
}

  </style>
</head>
<body>
<div class=login>
 <form name="myForm" onsubmit="return validate()" action="./login" >
    <table>
       <tr>
          <td colspan=2><h2>Sign in plz</h2></td>
       </tr>
       <tr>
         <td>emp ID : </td>
         <td><input type="number" name="empid" placeholder="plz enter number only" required="required" /><br></td>
       </tr>
       <tr>
         <td>Username : </td>
         <td><input type="text" name="uname"  required="required" /><br></td>
       </tr>
       <tr>
          <td> Password :</td>
          <td><input type="password" name="pass" required="required" /><br></td>
       </tr>
       <tr>
           <td><input type="submit" value="login" onclick="validate()" onmouseover=
        	       "mouseOn(this)"  /></td>
           <td><input type="reset" value="clear" /></td>
       </tr>
       <tr>
         <td colspan=2><a href="signup.jsp">i m new user</a></td></tr>
         <tr>
         <td colspan=2><a href="forgetpassword.jsp">i don't know my password</a></td></tr>
    </table>
  </form>
</div>
<script>
     function validate()
     {
		 var pass=document.forms["myForm"]["pass"].value;
		 var pLength=pass.length;
		 if(pLength < 3)
		 {
		    alert("password length should be more than five character");
		    return false;
		 }
	 }
     function mouseOn(mOn)
     {
		 mOn.innerHTML="now click me";
	 }
</script>
</body>
</html>
