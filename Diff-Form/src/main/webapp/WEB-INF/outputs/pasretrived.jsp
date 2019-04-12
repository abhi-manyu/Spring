<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>reset ur password here</h2>
          <font style="color: red;">${mesg}</font>
         <form action="./setpassword">
           enter ur new Password : <input type="text" name="pass"/><br>
           confirm your new password : <input type="password" name="cpass"/><br>
           <input type="reset" value="clear" />
           <input type="submit" value="set Password" />
         </form>
</body>
</html>