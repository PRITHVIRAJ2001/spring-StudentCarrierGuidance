<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Review Home</title>
  <link rel="stylesheet" href="css/styles.css">
      <link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
  
</head>
<body>
<jsp:include page="header.jsp"/>
  <div class="s1">
        <div class="scgreview animate-pulse">studentcareerguidance</div>
        <img src="/images/Frame 3.png" class="img01">

        <a href="/login" class="loginbtn  h-12 m-6  px-24 py-4  justify-center bg-red-200">Login</a>

        <a href="/register" class="registerbtn h-12  m-6 px-24 py-4 content-center bg-green-200">Register</a>

        <p class="reviewContent">Reviews always gives us a keen knowledge on the subject to which we are focusing about!!!! </p>
  </div>


<jsp:include page="footer.jsp"/>
  
</body>
</html>