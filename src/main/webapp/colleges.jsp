<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Colleges</title>
<link rel="stylesheet" href="/css/style.css">
  <link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-200">
<jsp:include page="header.jsp"/>

<div class="s1 ">
<c:choose>
<c:when test="${mode=='ENG'}">
    <form method="post" action="/findAllEngineeringColleges">
        <br>
        <div class="container mx-auto bg-green-200 w-screen">
        Enter District:
        <input  class ="border-orange-900" type="text" name="district" id="district">
        <input type="submit" value="SUBMIT">
        </div>
        <br>
	</form>
	<c:forEach var="eng" items="${ eng}">
        <div class="container mx-auto bg-blue-200 rounded-3xl">
            <br><br>
                <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3>${eng.collegename }</h3></div><br>
                <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3>${eng.district }</h3></div><br>
                <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3><a href=" ${eng.details }">Details</a></h3></div>
            <br><br>
        </div>
        <br><br>
	</c:forEach>

<br><br>
	<form method="post" action="/engineering">
	<div class = "container mx-auto bg-pink-300 w-screen">
	<input type="submit" value="Get all colleges">
	</div>
	</form>
</c:when>





<c:when test="${mode== 'MED' }">
	<form method="post" action="/findMedwithDistrict">
        <div class="container bg-green-200 w-full">
        Enter District:
        <input type="text" class ="border-orange-900" name="district" id="district">
        <input type="submit" value="SUBMIT">
        </div>
        <br>
	</form>
	<c:forEach var="med" items="${ med}">
        <div class="container mx-auto bg-blue-200 rounded-3xl">
            <br><br>
                <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3>${med.collegename }</h3></div><br>
                <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3>${med.district }</h3></div><br>
                <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3><a href=" ${med.details }">Details</a></h3></div>
            <br><br>
        </div>
        <br><br>
	</c:forEach>
	<br><br>
	<form method="post" action="/medical">
		<div class = "container mx-auto bg-pink-300 w-screen">
    	<input type="submit" value="Get all colleges">
    	</div>
	</form>
	
</c:when>
	
	
	
	
<c:when test="${mode=='AGRI' }">
	<form method="post" action="/findAgriwithDistrict">
        <div class="container bg-green-200 w-full">
        Enter District:
        <input type="text"  class ="border-orange-900" name="district" id="district">
        <input type="submit" value="SUBMIT">
        </div>
        <br>
	</form>

	<c:forEach var="agri" items="${ agri}">
        <div class="container mx-auto bg-blue-200 rounded-3xl">
            <br><br>
                <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3>${agri.collegename }</h3></div><br>
                <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3>${agri.district }</h3></div><br>
                <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3><a href=" ${agri.details }">Details</a></h3></div>
            <br><br>
        </div>
        <br><br>
	</c:forEach>
	<form method="post" action="/agri">
		<div class = "container mx-auto bg-pink-300 w-screen">
    	<input type="submit" value="Get all colleges">
    	</div>
	</form>
</c:when>




<c:when test="${mode=='ARTS' }">
<form method="post" action="/findArtswithDistrict">
        <div class="container bg-green-200 w-full">
        Enter District:
        <input type="text" class ="border-orange-900"  name="district" id="district">
        <input type="submit" value="SUBMIT">
        </div>
        <br>
	</form>

	<c:forEach var="arts" items="${ arts}">
        <div class="container mx-auto bg-blue-200 rounded-3xl">
            <br><br>
                <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3>${arts.collegename }</h3></div><br>
                <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3>${arts.district }</h3></div><br>
                <div class="container bg-yellow-200  mx-auto text-center  rounded-3xl w-80"><h3><a href=" ${arts.details }">Details</a></h3></div>
            <br><br>
        </div>
        <br><br>
	</c:forEach>
	<br><br>
	<form method="post" action="/arts">
		<div class = "container mx-auto bg-pink-300 w-screen">
    	<input type="submit" value="Get all colleges">
    	</div>
	</form>
</c:when>
</c:choose>
</div>
  
  </body>
</html>