<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">

</head>
<body>
<jsp:include page="header.jsp"/>

<div class="s2">
<c:choose>
<c:when test="${mode=='ENG'}">
<form method="post" action="/findAllEngineeringColleges">
	Enter District:
	<input type="text" name="district" id="district">
	<input type="submit" value="SUBMIT">
	</form>
	<c:forEach var="eng" items="${ eng}">
	<div class = "rectCurveCollegeContainer alignmentCollege btn btn-blue rounded-full py-3 px-6..." >
	<h3>${eng.collegename }</h3>
	<h3>${eng.district }</h3>
	<h3><a href=" ${eng.details }">${eng.details}</a></h3>
	</div>
	<br>
	<br>
	</c:forEach>

	<form method="post" action="/engineering">
	<input type="submit" value="Get all colleges">
	</form>
</c:when>





<c:when test="${mode== 'MED' }">
	<form method="post" action="/findMedwithDistrict">
	Enter District:
	<input type="text" name="district" id="district">
	<input type="submit" value="SUBMIT">
	</form>

	<c:forEach var="med" items="${ med}">
    <div class = "rectCurveCollegeContainer alignmentCollege btn btn-blue rounded-full py-3 px-6..." >
	<h3>${med.collegename }</h3>
	<h3>${med.district }</h3>
	<h3><a href="${med.details }">Details</a></h3>
	</div>
	<br>
	<br>
	</c:forEach>
	<form method="post" action="/medical">
	<input type="submit" value="Get all colleges">
	</form>
	
</c:when>
	
	
	
	
<c:when test="${mode=='AGRI' }">
	<form method="post" action="/findAgriwithDistrict">
	Enter District:
	<input type="text" name="district" id="district">
	<input type="submit" value="SUBMIT">
	</form>
	<c:forEach var="agri" items="${ agri}">
    <div class = "rectCurveCollegeContainer alignmentCollege btn btn-blue rounded-full py-3 px-6..." >
	<h3>${agri.collegename }</h3>
	<h3>${agri.district }</h3>
	<h3><a href="${agri.details }">details</a></h3>
	</div>
	<br>
	<br>
	</c:forEach>
	<form method="post" action="/agri">
	<input type="submit" value="Get all colleges">
	</form>
</c:when>




<c:when test="${mode=='ARTS' }">
<form method="post" action="/findArtswithDistrict">
	Enter District:
	<input type="text" name="district" id="district">
	<input type="submit" value="SUBMIT">
	</form>
	<c:forEach var="arts" items="${ arts}">
    <div class = "rectCurveCollegeContainer alignmentCollege btn btn-blue rounded-full py-3 px-6..." >
	<h3>${arts.collegename }</h3>
	<h3>${arts.district }</h3>
	<h3><a href="${arts.details }">Details</a></h3>
	</div>
	<br>
	<br>
	</c:forEach>
	<form method="post" action="/arts">
	<input type="submit" value="Get all colleges">
	</form>
</c:when>
</c:choose>
</div>
<jsp:include page="footer.jsp"/>
  
  </body>
</html>