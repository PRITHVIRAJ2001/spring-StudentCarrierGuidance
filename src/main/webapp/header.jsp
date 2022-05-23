<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Header</title>
    <link rel="stylesheet" href="css/style.css"/>
    <link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
<body>
    
      
       <nav class="green1">
        <div
          class="container px-6 py-3 mx-auto md:flex md:justify-between md:items-center"
        >
          <div class="flex items-center justify-between">
            <div>
            <a
                class="text-xl p-4  font font-bold text-gray-800 dark:text-white md:text-2xl hover:text-gray-700 dark:hover:text-gray-300" 
                href="/">SCG
            </a>
            </div>
          </div>
          <div class="items-center md:flex">
            <div class="flex flex-col md:flex-row md:mx-6">
            <a
                class="my-1 px-1 btn btn-blue  font text-gray-700 dark:text-gray-200 hover:text-blue-300 dark:hover:text-gray-400 md:mx-4 md:my-0"
                href="/review"
                >Review</a
              >  
          
              <a
                class="my-1 font px-1 btn btn-blue text-gray-700 dark:text-gray-200 hover:text-blue-300 dark:hover:text-gray-400 md:mx-4 md:my-0"
                href="/view"
                >Courses</a
              >
              <a
                class="font my-1 px-1 text-gray-700 btn btn-blue dark:text-gray-200 hover:text-blue-300 dark:hover:text-gray-400 md:mx-4 md:my-0"
                href="/allCourses"
                >Jobs</a
              >
              <a
                class="font my-1 px-1text-gray-700 btn btn-blue dark:text-gray-200 hover:text-blue-300 dark:hover:text-gray-400 md:mx-4 md:my-0"
                href="/4cols"
                >Colleges</a
              >
            </div>
    
            
          </div>
        </div>
      </nav>
   

</body>

</html>