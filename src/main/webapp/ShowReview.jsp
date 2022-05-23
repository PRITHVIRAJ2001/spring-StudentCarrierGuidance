<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOW REVIEW</title>
<link rel="stylesheet" href=/css/style.css">
  <link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="s1">
<c:choose>
<c:when test="${mode=='MODE_ENG1'}">
<h1>Engineering College Reviews</h1>
		<c:forEach var="Emod" items="${ Emod}">
		<div class="container mx-auto bg-blue-200 rounded-3xl">
	       <br>
	       <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3>${Emod.review }</h3></div>
	       <br>
	    </div>
	
	<br>
	<br>
		</c:forEach>
	</c:when>	
	
<c:when test="${mode=='MODE_ARTS1'}">
<h1>Arts College Reviews</h1>
		<c:forEach var="Artscol" items="${ Artscol}">
			<div class="container mx-auto bg-blue-200 rounded-3xl">
            	   <br>
	                <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3>${Artscol.review }</h3></div>
	               <br>
	        </br>
	
	<br>
	<br>
		</c:forEach>
	</c:when>	
	
<c:when test="${mode=='MODE_AGRI1'}">
<h1>Agri College Reviews</h1>
		<c:forEach var="Agricol" items="${ Agricol}">
	<div class="container mx-auto bg-blue-200 rounded-3xl">
    	       <br>
	 <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3>${Agricol.review }</h3></div>
	<br>
	</div>
	
	<br>
	<br>
		</c:forEach>
	</c:when>	
	
<c:when test="${mode=='MODE_MEDICAL1'}">
<h1>Medical College Reviews</h1>
		<c:forEach var="Medicol" items="${ Medicol}">
			<div class="container mx-auto bg-blue-200 rounded-3xl">
            	       <br>
	 <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3>${Medicol.review }</h3></div>
	
	<br>
</div>
		</c:forEach>
	</c:when>	
	</c:choose>
	</div>
  
</body>
</html>