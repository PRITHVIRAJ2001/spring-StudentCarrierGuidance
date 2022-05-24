<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jobs</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="s1">
<br><br>

<c:choose>
<c:when test="${mode== 'MODE_ENG' }">
<c:forEach var="engJob" items="${ engJob }">
		<div class="container content-center text-xl rounded-t-lg bg-blue-100 text-center border-solid border-2 border-double border-slate-400 mx-auto w-80  h-12 min-h-max">
		<h3>${engJob.job }</h3>
		<br>
		</div>
				<br>

</c:forEach>
</c:when>


<c:when test="${mode== 'MODE_ARTS' }">
<c:forEach var="artsJob" items="${ artsJob }">
		<div class="container content-center  text-xl rounded-t-lg bg-blue-100 text-center border-solid border-2 border-double border-slate-400 mx-auto w-80 h-12 min-h-max">
		<h3>${artsJob.job }</h3>
		<br>
		</div>		<br>

</c:forEach>
</c:when>

<c:when test="${mode== 'MODE_AGRI' }">
<c:forEach var="agriJob" items="${ agriJob }">
<div class="container  content-center text-xl rounded-t-lg bg-blue-100 text-center border-solid border-2 border-double border-slate-400 mx-auto w-80 h-12 min-h-max">
		<h3>${agriJob.job }</h3>
		<br>
		</div>		<br>

</c:forEach>

</c:when>


<c:when test="${mode== 'MODE_MEDICAL' }">
<c:forEach var="medicalJob" items="${ medicalJob }">
<div class="container content-center text-xl rounded-t-lg bg-blue-100 text-center border-solid border-2 border-double border-slate-400 mx-auto w-80 h-12 min-h-max">
		<h3>${medicalJob.job }</h3>
		<br>
		</div>		<br>

</c:forEach>

</c:when>




</c:choose>
</div>
<jsp:include page="footer.jsp"/>
  

</body>
</html>