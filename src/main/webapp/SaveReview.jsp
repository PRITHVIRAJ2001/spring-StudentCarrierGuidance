<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SAVE REVIEW</title>
<link rel="stylesheet" href=/css/style.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="s1"">
<c:choose>
<c:when test="${mode=='MODE_ENG1'}">

	<form method="post" action="/save-EngineeringReview">
Add Review:
		<textarea rows="5" cols="100" id="review" name="review"></textarea>
		<input type="submit" value="SUBMIT">
</form>v
	</c:when>
	
	
<c:when test="${mode=='MODE_ARTS1'}">

<form method="post" action="/save-ArtsReview">
Add Review:
		<textarea rows="5" cols="100" id="review" name="review"></textarea>
		<input type="submit" value="SUBMIT">
</form>
	</c:when>
	
	
<c:when test="${mode=='MODE_AGRI1'}">


<form method="post" action="/save-AgriReview">
Add Review:
		<textarea rows="5" cols="100" id="review" name="review"></textarea>
		<input type="submit" value="SUBMIT">
</form>
	</c:when>
	
	
<c:when test="${mode=='MODE_MEDICAL1'}">


<form method="post" action="/save-MedicalReview">
Add Review:
		<textarea rows="5" cols="100" id="review" name="review"></textarea>
		<input type="submit" value="SUBMIT">
</form>
	</c:when>
	
</c:choose>	
</div>
<jsp:include page="footer.jsp"/>
  
</body>
</html>