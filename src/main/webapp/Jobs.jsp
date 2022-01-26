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
<div class="s1">
Hello

<c:choose>
<c:when test="${mode== 'MODE_ENG' }">
<c:forEach var="engJob" items="${ engJob }">
		<h3>${engJob.job }</h3>
</c:forEach>
</c:when>


<c:when test="${mode== 'MODE_ARTS' }">
<c:forEach var="artsJob" items="${ artsJob }">
		<h3>${artsJob.job }</h3>
</c:forEach>
</c:when>

<c:when test="${mode== 'MODE_AGRI' }">
<c:forEach var="agriJob" items="${ agriJob }">
		<h3>${agriJob.job }</h3>
</c:forEach>

</c:when>


<c:when test="${mode== 'MODE_MEDICAL' }">
<c:forEach var="medicalJob" items="${ medicalJob }">
		<h3>${medicalJob.job }</h3>
</c:forEach>

</c:when>




</c:choose>
</div>
<jsp:include page="footer.jsp"/>
  

</body>
</html>