<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
  h2 {
	color: red;
}
.response {
	text-align: center;
	background-color: silver;
	width: 8cm;
	margin-left: 7cm;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <div class="response">
      <h2 >Registration failed</h2>
       ${signfail}${warn}
  </div>
<jsp:include page="/signup.jsp" />
</body>
</html>