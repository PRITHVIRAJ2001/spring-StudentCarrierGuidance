<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SAVE REVIEW</title>
<link rel="stylesheet" href=/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/@tailwindcss/custom-forms@0.2.1/dist/custom-forms.css" rel="stylesheet">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="s1 bg-blue-100">
<c:choose>
<c:when test="${mode=='MODE_ENG1'}">

<div class = 'container'>
	<form method="post" action="/save-EngineeringReview">
<div class="justify-center items-center">
      <span class="text-gray-700 content-center ">Add Review:</span><br>
      <textarea class="form-textarea mt-1 block w-full content-center bg-blue-100" rows="5" cols="100" id="review" name="review" placeholder="Enter some review  content."></textarea>
</div>
<br>
<input type="submit" class="justify-center items-center btn btn-blue" value="SUBMIT">
</form>
</div>
	</c:when>
	
	
<c:when test="${mode=='MODE_ARTS1'}">
<div class = 'container'>
<form method="post" action="/save-ArtsReview">
<div class="justify-center items-center">
	<label class="block text-left" style="max-width: 400px;">
      <span class="text-gray-700">Add Review:</span><br>
      <textarea class="form-textarea mt-1 block w-full bg-blue-100" rows="5" cols="100" id="review" name="review" placeholder="Enter some review  content."></textarea>
    </label>
</div>
<br>
<input type="submit"  class="justify-center items-center btn btn-blue" value="SUBMIT">
</form>
</div>
	</c:when>
	
	
<c:when test="${mode=='MODE_AGRI1'}">

<div class = 'container'>
<form method="post" action="/save-AgriReview">
<div class="justify-center items-center">
      <span class="text-gray-700">Add Review:</span><br>
      <textarea class="form-textarea mt-1 block w-full bg-blue-100" rows="5" cols="100" id="review" name="review" placeholder="Enter some review  content."></textarea>
</div>
<br>
<input type="submit" class="justify-center items-center btn btn-blue"  value="SUBMIT">
</form>
</div>
	</c:when>
	
	
<c:when test="${mode=='MODE_MEDICAL1'}">

<div class = 'container'>
<form method="post" action="/save-MedicalReview">
<div class="justify-center items-center">
	<label class="block text-left" style="max-width: 400px;">
      <span class="text-gray-700">Add Review:</span><br>
      <textarea class="form-textarea mt-1 block w-full bg-blue-100" rows="5" cols="100" id="review" name="review" placeholder="Enter some review  content."></textarea>
    </label>
</div>
<br>
<input type="submit" class="justify-center items-center btn btn-blue"  value="SUBMIT">
</form>
</div>
	</c:when>
	
</c:choose>	
</div>
<jsp:include page="footer.jsp"/>
  
</body>
</html>