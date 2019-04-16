<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2> ${head} </h2>
     <form:errors path="user.*" />
   <form action="./register" method="post">
     enter ur roll no : <input type="number" name="rono" /><br>
     enter ur name : <input type="text" name="name" /><br>
     enter ur st.no : <input type="number" name="add.stNo"><br>
     enter ur flat name : <input type="text" name="add.flatName"><br>
     enter ur layout : <input type="text" name="add.layout"><br>
     enter ur pin: <input type="number" name="add.pin"><br>
     enter ur mobile no : <input type="text" name="add.mob"><br>
      <input type="submit" value="register" />
   </form>
</body>
</html>