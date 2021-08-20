<%-- 
    Document   : newjsp
    Created on : Jul 13, 2021, 10:32:53 PM
    Author     : DELL 3558
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>  
    <% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  
    

    </body>
</html>
