<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Major Models</title>
<link rel="stylesheet" href=/css/style.css">
<link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="header.jsp"/>
 <div class="s1">
<form >
<c:choose>
<c:when test="${mode ==  'FOR_COLLEGES'}">
<div class="s1 bg-orange-100 animate-pulse">
            <div>
                <p  class="s ">S</p>
                <p class="c " >C</p>
                <p class="g "  >G</p>
                
            </div>
                <img src="/images/arrow.png" class="arrows">
                <h4 class="clasHead bg-orange-200">COLLEGE Classification</h4>
                <div>
                    <a  class="cs1 bg-orange-200" href="/engineering">Engineering College</a>
                    <a href="/arts" class="cs2 bg-orange-200">Arts College</a>
                    <a href="/medical" class="cs3 bg-orange-200">Medical College</a>
                    <a href="/agri" class="cs4 bg-orange-200">Agri College</a>

                </div>
</div>


</c:when>
<c:when test="${mode =='FOR_COURSES' }">
		
		<div class="s1 bg-orange-100 animate-pulse">
            <div>
                <p  class="s ">S</p>
                <p class="c " >C</p>
                <p class="g "  >G</p>
                
            </div>
                <img src="/images/arrow.png" class="arrows">
                <h4 class="clasHead bg-orange-200">COURSE Classification</h4>
                <div>
                    <a  class="cs1 bg-orange-200" href="/engineeringcollegeCourses">Engineering College</a>
                    <a href="/artscollegeCourses" class="cs2 bg-orange-200">Arts College</a>
                    <a href="/medicalcollegeCourses" class="cs3 bg-orange-200">Medical College</a>
                    <a href="/agricollegeCourses" class="cs4 bg-orange-200">Agri College</a>

                </div>
                
                


        </div>
        
		
</c:when>
<c:when test="${mode== 'FOR_JOBS' }">
				
		<div class="s1 bg-orange-100 animate-pulse">
            <div>
                <p  class="s ">S</p>
                <p class="c " >C</p>
                <p class="g "  >G</p>
                
            </div>
                <img src="/images/arrow.png" class="arrows">
                <h4 class="clasHead bg-orange-200">JOB Classification</h4>
                <div>
                    <a  class="cs1 bg-orange-200" href="/allengineeringcollegeCourses">Engineering College</a>
                    <a href="/allartscollegeCourses" class="cs2 bg-orange-200">Arts College</a>
                    <a href="/allmedicalcollegeCourses" class="cs3 bg-orange-200">Medical College</a>
                    <a href="/allagricollegeCourses" class="cs4 bg-orange-200 ">Agri College</a>

                </div>
                
                


        </div>
        	</c:when>
</c:choose>



  


</form>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>