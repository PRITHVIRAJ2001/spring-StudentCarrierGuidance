<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/chosen/1.8.7/chosen.jquery.js" integrity="sha512-eSeh0V+8U3qoxFnK3KgBsM69hrMOGMBy3CNxq/T4BArsSQJfKVsKb5joMqIPrNMjRQSTl4xG8oJRpgU2o9I7HQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/chosen/1.8.7/chosen.min.css" integrity="sha512-yVvxUQV0QESBt1SyZbNJMAwyKvFTLMyXSyBHDO4BG5t7k/Lw34tyqlSDlKIrIENIzCl+RVUNjmCPG+V/GMesRw==" crossorigin="anonymous" referrerpolicy="no-referrer" />


<meta charset="ISO-8859-1">
<title>Reviews</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="s1">
<c:choose>
<c:when test="${mode=='MODE_ARTS1' }">
<
			<form action="/addReviewForArtsCollege" method="post">
		
		Enter College Name:
		<select id="collegename" name="collegename" class="chosen">
			<c:forEach var="Artscol" items="${ Artscol}">
				<option value="${Artscol.collegename }">${Artscol.collegename }</option>
			</c:forEach>
		</select>
		 
		<input type="submit" value="ADD REVIEW">
		</form>
		
		<form action="/showReviewForArtsCollege" method="post">
		
		Enter College Name:
		<select id="collegename" name="collegename" class="chosen">
			<c:forEach var="Artscol" items="${ Artscol}">
				<option value="${Artscol.collegename }">${Artscol.collegename }</option>
			</c:forEach>
		</select>
		 
		<input type="submit" value="SHOW_REVIEW">
		</form>
	
		
	</c:when>	
	
<c:when test="${mode=='MODE_ENG1' }">

			<form action="/addReviewForEngineeringCollege" method="post">
		
		Enter College Name:
		<select id="collegename" name="collegename" class="chosen">
			<c:forEach var="Ecol" items="${ Ecol}">
				<option value="${Ecol.collegename }">${Ecol.collegename }</option>
			</c:forEach>
		</select>
		 
		<input type="submit" value="ADD REVIEW">
		</form>
		
		<form action="/showReviewForEngineeringCollege" method="post">
		
		Enter College Name:
		<select id="collegename" name="collegename" class="chosen">
			<c:forEach var="Ecol" items="${ Ecol}">
				<option value="${Ecol.collegename }">${Ecol.collegename }</option>
			</c:forEach>
		</select>
		 
		<input type="submit" value="SHOW_REVIEW">
		</form>
	
		</c:when>
<c:when test="${mode=='MODE_AGRI1' }">

			<form action="/addReviewForAgriCollege" method="post">

		Enter College Name: <select id="collegename" name="collegename" class="chosen">
			<c:forEach var="Agricol" items="${ Agricol}">
				<option value="${Agricol.collegename }">${Agricol.collegename }</option>
			</c:forEach>
		</select> <input type="submit" value="ADD REVIEW">
	</form>

	<form action="/showReviewForAgriCollege" method="post">

		Enter College Name: <select id="collegename" name="collegename" class="chosen">
			<c:forEach var="Agricol" items="${ Agricol}">
				<option value="${Agricol.collegename }">${Agricol.collegename }</option>
			</c:forEach>
		</select> <input type="submit" value="SHOW_REVIEW">
	</form>
	
		
		</c:when>
<c:when test="${mode=='MODE_MEDICAL1' }">

			<form action="/addReviewForMedicalCollege" method="post">
		
		Enter College Name:
		<select id="collegename" name="collegename" class="chosen">
			<c:forEach var="Medicol" items="${ Medicol}">
				<option value="${Medicol.collegename }">${Medicol.collegename }</option>
			</c:forEach>
		</select>
		 
		<input type="submit" value="ADD REVIEW">
		</form>
		
		<form action="/showReviewForMedicalCollege" method="post" class="chosen">
		
		Enter College Name:
		<select id="collegename" name="collegename">
			<c:forEach var="Medicol" items="${ Medicol}">
				<option value="${Medicol.collegename }">${Medicol.collegename }</option>
			</c:forEach>
		</select>
		 
		<input type="submit" value="SHOW_REVIEW">
		</form>
	
		
</c:when>

</c:choose>
</div>
<jsp:include page="footer.jsp"/>
  
</body>
<script type="text/javascript">
$(".chosen").chosen();
</script>
</html>