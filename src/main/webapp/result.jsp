<%@page import="Calculation.cont.Calculation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
     Calculation con =(Calculation)session.getAttribute("data");
     
    out.println("<h1> Number1 is \t"+con.getNum1()+"</h1>");
	out.println("<h1> Number2 is \t"+con.getNum2()+"</h1>");
	out.println("<h1> Addition is \t"+con.getSum()+"</h1>");
 %>    
       
</body>
</html>