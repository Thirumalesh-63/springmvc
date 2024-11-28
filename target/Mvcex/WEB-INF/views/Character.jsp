<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <body>	
    	<div>
    		<p>
    			<h1>character persons</h1>
    		</p>
    	</div>
        	<table>
	        	<tr>
					
				</tr>
        		<c:forEach var="person" items="${map}">
	        		<tr>
	        			<td>${person.key}</td>
	        			<td>${person.value}</td>
	        			
	        		</tr>
        		</c:forEach>
        	</table>
    </body>
</html>
