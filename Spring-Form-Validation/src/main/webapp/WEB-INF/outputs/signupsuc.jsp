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
   <h2>sign up <span style="color: green;">successful</span></h2>
     <h4>ur details has been saved as follows : </h4>
       ur name : ${signup.name}<br>
       ur date of birth : ${signup.dob}<br>
       ur marks : ${signup.marks}<br>
       ur Address : ${signup.address}<br>
       ur password : ${signup.password}<br>
       ur city is : ${signup.city}<br>
       u have been enrolled for listed courses as : ${signup.courses}
</body>
</html>