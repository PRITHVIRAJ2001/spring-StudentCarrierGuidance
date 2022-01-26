<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/chosen/1.8.7/chosen.jquery.js" integrity="sha512-eSeh0V+8U3qoxFnK3KgBsM69hrMOGMBy3CNxq/T4BArsSQJfKVsKb5joMqIPrNMjRQSTl4xG8oJRpgU2o9I7HQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/chosen/1.8.7/chosen.min.css" integrity="sha512-yVvxUQV0QESBt1SyZbNJMAwyKvFTLMyXSyBHDO4BG5t7k/Lw34tyqlSDlKIrIENIzCl+RVUNjmCPG+V/GMesRw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<jsp:include page="header.jsp"/>
	<div class="s1">
<c:choose>
<c:when test="${mode=='MODE_ARTS1' }">
<
			<form action="/artsCourseJobs" method="post">
		
		Enter College Name:
		<select id="course" name="course" class="chosen">
			<c:forEach var="ArtsCourses" items="${ ArtsCourses}">
				<option value="${ArtsCourses.course }">${ArtsCourses.course }</option>
			</c:forEach>
		</select>
		 
		<input type="submit" value="VIEW JOBS">
		</form>
		
	
		
	</c:when>	
	
<c:when test="${mode=='MODE_ENG1' }">

			<form action="/engCourseJobs" method="post">
		
		Enter College Name:
		<select id="course" name="course" class="chosen">
			<c:forEach var="EngCourses" items="${ EngCourses}">
				<option value="${EngCourses.course }">${EngCourses.course }</option>
			</c:forEach>
		</select>
		 
		<input type="submit" value="VIEW JOBS">
		</form>
		
	
		</c:when>
<c:when test="${mode=='MODE_AGRI1' }">

			<form action="/agriCourseJobs" method="post">

		Enter College Name: <select id="course" name="course" class="chosen">
			<c:forEach var="AgriCourses" items="${ AgriCourses}">
				<option value="${AgriCourses.course }">${AgriCourses.course }</option>
			</c:forEach>
		</select> <input type="submit" value="VIEW JOBS">
	</form>

		
		</c:when>
<c:when test="${mode=='MODE_MEDICAL1' }">

			<form action="/medicalCourseJobs" method="post">
		
		Enter College Name:
		<select id="course" name="course" class="chosen">
			<c:forEach var="MedicalCourses" items="${ MedicalCourses}">
				<option value="${MedicalCourses.course }">${MedicalCourses.course }</option>
			</c:forEach>
		</select>
		 
		<input type="submit" value="VIEW JOBS">
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
</body>
</html>