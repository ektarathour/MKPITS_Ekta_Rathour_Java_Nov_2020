<%-- 
    Document   : index
    Created on : Jul 14, 2021, 7:07:33 PM
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
        <h1>Hello World!</h1>       
       <%@page import="java.sql.*" %>
       <%
Connection con=null;
try{
Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","");

out.println("connected");
}
catch(Exception e)
{
out.print(e);}

%>
    </body>
</html>
