<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
  body {
	background-color: teal;
}
div {
	width: 10cm;
	background-color: olive;
	margin: 5cm;
	font-family: cursive;
	border-radius: 2cm;
}
table {
    width:10cm;
	padding: 1cm;
	text-align: center;
}
input[type=text],input[type=number] {
	width: 5cm;
	height: 1cm;
	font-size: 15px;
	font-family: cursive;
	border-radius: 10px;
	text-align: center;
}
input[type=submit] {
	width: 3cm;
	height: 1cm;
	font-size: 15px;
	font-family: cursive;
	background-color: #33ccff;
	border-radius: 1cm;
	cursor: pointer;
}
h5 {
	color: #ffff66;
	background-color: black;
}
</style>
</head>
<body>
  <div>
     <form action="./forgetpassword">
        <table>
           <tr>
             <td colspan=2><h5>don't know ur password ? let us help u</h5></td>
           </tr>
           <tr>
             <td>empl ID : </td>
             <td><input type="number" name="empid" required />
           </tr>
            <tr>
             <td>User name : </td>
             <td><input type="text" name="usern" required />
           </tr>
           <tr>
              <td></td>
              <td> <input type="submit" value="Get Password" /></td>
           </tr>
        </table>
     </form>
  </div>
</body>
</html>