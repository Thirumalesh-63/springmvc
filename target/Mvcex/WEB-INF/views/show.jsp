<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">


<html>
    <body>	
    	<div>
    		<p>
    			<h1>View persons</h1>
    		</p>
    	</div>
        	<table class="table table-dark">
	        	<tr>
					<td>id</td>
					<td>name</td>
					<td>sal</td>
					<td>company</td>
				</tr>
        		<c:forEach var="per" items="${person}">
	        		<tr>
	        			<td>${per.id}</td>
	        			<td>${per.name}</td>
	        			<td>${per.sal}</td>
	        			<td>${per.company}</td>
	        		</tr>
        		</c:forEach>
        	</table>
    </body>
</html>
