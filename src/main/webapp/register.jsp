<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALUMINI_REGISTRATION</title>
<link rel="stylesheet" href=/css/style.css">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
  <link rel="stylesheet" href="css/bootstrap-social.css">
   <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">

</head>
<body style="text-align:center" class="bg-indigo-100">
	<jsp:include page="header.jsp"/>
	<div class="s1">
	<div>
			<br><br><h1 style="text-align:center; font-size:36px; font-style: monospace;"><b>ALUMINI REGISTRATION</b></h1>
			<br>
			<br>
	</div>
	<div >
	<br><br>
		<form  action="/save-user" method="post">
		<c:if test="${not empty error }">
						<div class= "alert alert-danger">
							<c:out value="${error }"></c:out>
							</div>
					</c:if>
			<label for="Name"><b>Name    :</b></label>
    		<input type="text" placeholder="Enter Name" name="Name" id="Name" required>
    			<br><br>
    			
    			<label for="email"><b>Email   :</b></label>
    		<input type="text" placeholder="Enter Email" name="email" id="email" required>
			<br><br>
			
					
  		    <label for="pass"><b>Password:</b></label>
    		<input type="password" placeholder="Enter Password" name="password" id="password" required>
    		<br><br>
    		
    		<label for="pass"><b>Confirm Password:</b></label>
    		<input type="password" placeholder="Enter Password" name="confirmpassword" id="confirmpassword" required>
    		<br><br>
    		
    		
   	 		<label for="College"><b>College :</b></label>
    		<input type="text" placeholder="Enter College Name" name="College" id="College" required>
    			<br><br>
    		
    		
    		
   	 		<label for="District"><b>District:</b></label>
    		<input type="text" placeholder="Enter your District" name="District" id="District" required>
    		<br><br>
    		
    			
    
			
    		
    		
  			<input type="submit" class="btn btn-blue text-xl hover:text-blue-300"  value="SUBMIT">
    		<br><br>
    		
    		Already registered then please login..
    		<a href="/login">LogIn</a>
    		  
</form>
</div>
</div>
<jsp:include page="footer.jsp"/>

</body>
</html>