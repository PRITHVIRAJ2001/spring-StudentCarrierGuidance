<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOG IN </title>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
  <link rel="stylesheet" href="css/bootstrap-social.css">
  <link rel="stylesheet" href="css/styles.css">
</head>
<body  class="bg-indigo-100">
      		<jsp:include page="header.jsp"/>
      		<div class="s1">		
		<div>
			<br><br><br><h1 class="loginTxt"><b>LOG IN</b></h1><br><br><br>
		</div>
		<br>
	<div>
	<div>
	${SPRING_SECURITY_LAST_EXCEPTION.message}
	<form action="/login-user" method="post" >
		<c:if test="${not empty error }">
						<div class= "alert alert-danger">
							<c:out value="${error }"></c:out>
							</div>
					</c:if>
		<label for="email" class="email"><b>Email   :</b></label>
   		<input type="text"  class="emailph" placeholder="Enter Email" name="email" id="email" required>
   		
   		
		<br><br>
		
		
    	<label for="pass" class="password"><b>Password:</b></label>
    	<input type="password" class="passwordph" placeholder="Enter Password" name="password" id="password" required>
    
    	<br><br>
    	
    	
    	<input type="submit" class="submit btn btn-blue hover:text-blue-300" value="SUBMIT">
    	
    	
    	<br><br><br><br>

		<p class="txtinlogin">New User? Please Register then login.
		<a href ="/register">Register</a></p>
		
	</form>
	</div>
	</div>
	</div>
<jsp:include page="footer.jsp"/>
  

</body>
</html>