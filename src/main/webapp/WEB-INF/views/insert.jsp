<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <body>
    <div>
    		<p>
    			<h1>${headerName}</h1>
    		</p>
    	</div>
        <form:form method="POST" action="/Mvcex/person" modelAttribute="inse">
        	<table>
        		<tr>
        			<td>id</td>
        			<td><form:input type="text" path="id" ></form:input> </td>
        		</tr>
        		<tr>
        			<td>name</td>
        			<td><form:input type="text" path="name" ></form:input> </td>
        		</tr>
        		<tr>
        			<td>company</td>
        			<td><form:input type="text" path="company" ></form:input> </td>
        		</tr>
        		<tr>
        			<td>sal</td>
        			<td><form:input type="text" path="sal" ></form:input> </td>
        		</tr>
        		<tr>
        			<td colspan=2><input type="submit" value="Add"> </td>
        		</tr>
        	</table>
        </form:form>
    </body>
</html>
