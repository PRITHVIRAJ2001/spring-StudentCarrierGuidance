<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Courses</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="s1">
Look all the courses clearly.....<br><br><br>
<c:choose>
<c:when test="${mode=='MODE_ENG1'}">
Engineering Courses
<c:forEach var="EngCourses" items="${ EngCourses}">
	<a href="/engCourseJobs"><h3>${EngCourses.course }</h3></a>
		</c:forEach>
</c:when>
<c:when test="${mode=='MODE_ARTS1' }">
Arts Courses
<c:forEach var="ArtsCourses" items="${ ArtsCourses }">
		<a href="/artsCourseJobs"><h3>${ArtsCourses.course }</h3></a>
</c:forEach>
</c:when>

<c:when test="${mode=='MODE_MEDICAL1' }">
Medical Courses
<c:forEach var="MedicalCourses" items="${ MedicalCourses }">

		<a href="/medicalCourseJobs"><h3>${MedicalCourses.course }</h3></a>
</c:forEach>
</c:when>		

<c:when test="${mode=='MODE_AGRI1' }">
Agri courses
<c:forEach var="AgriCourses" items="${ AgriCourses }">
		<a href="/agriCourseJobs"><h3>${AgriCourses.course }</h3></a>
</c:forEach>
</c:when>
</c:choose>
</div>

<jsp:include page="footer.jsp"/>
  
</body>
</html>