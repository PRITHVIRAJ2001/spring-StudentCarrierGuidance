<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Courses</title>
<link rel="stylesheet" href="/css/style.css">
<link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="s1"><br><br><br>
<c:choose>
<c:when test="${mode=='MODE_ENG1'}">
<div class="container text-6xl items-center">
<h1>Engineering Courses</h1>
</div>
<c:forEach var="EngCourses" items="${ EngCourses}">
<div class="box-border border-4 border-teal-400 bg-teal-200">
<div class="container place-items-center outline-[5px]">
	<a href="/engCourseJobs"><h3>${EngCourses.course }</h3></a>
	</div></div>
</c:forEach>
</c:when>
<c:when test="${mode=='MODE_ARTS1' }">
<div class="container text-6xl items-center"><h1>Arts Courses</h1></div>
<c:forEach var="ArtsCourses" items="${ ArtsCourses }">
<div class="box-border border-4 border-teal-400 bg-teal-200">
<div class="container place-items-center outline-[5px]">
		<a href="/artsCourseJobs"><h3>${ArtsCourses.course }</h3></a>
		</div></div>
</c:forEach>
</c:when>
<c:when test="${mode=='MODE_MEDICAL1' }">
<div class="container text-6xl items-center"><h1>Medical Courses</h1></div>
<c:forEach var="MedicalCourses" items="${ MedicalCourses }">
<div class="box-border border-4 border-teal-400 bg-teal-200">
<div class="container place-items-center outline-[5px]">
		<a href="/medicalCourseJobs"><h3>${MedicalCourses.course }</h3></a>
		</div></div>
</c:forEach>
</c:when>
<c:when test="${mode=='MODE_AGRI1' }">
<div class="container text-6xl items-center"><h1>Agri courses</h1></div>
<c:forEach var="AgriCourses" items="${ AgriCourses }">
<div class="box-border border-4 border-teal-400 bg-teal-200">
<div class="container place-items-center outline-[5px]">
		<a href="/agriCourseJobs"><h3>${AgriCourses.course }</h3></a>
		</div></div>
</c:forEach>
</c:when>
</c:choose>
</div>
</body>
</html>