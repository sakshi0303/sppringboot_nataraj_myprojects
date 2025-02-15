<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" import="java.util.*"%>
    
<!--   Pakage import  -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<h1 style="color:pink;text-align:center">model att4ibute: name::"${name}",   age::"${age}"</h1>

<!-- Array does not have tostring method, therfore hashcode will be displayed, so USE jstl    -->
<h2 style="color:blue;text-align:center"> "${favColor}"  "${friendlist}" "${phoneno}"  "${iddetails}"  </h2>

<!-- import java.util.*  to perform logical and airthmatic operations -->
<h3 > FavColors: <b> <%= Arrays.toString( (String []) request.getAttribute("favColor") )%> </b><br> </h3>

<!-- JSTL : JSP Standard Tag Line   5 taglines lib:: core,sql,formatting, function,xml 
> To work with jstl we need to download Appache jstl jar in pom.xml  -->
<b> <c:out value="${favColor}"></c:out></b> // c:out arrays shows hashcode , so use c:foreach var items  <br>

<c:forEach var="color" items="${favColor}">
	${color},
</c:forEach>
 <br>
 
 <c:forEach var="map" items="${iddetails}">
 	${map.key} : ${map.value}
 </c:forEach>

<b> <c:out value="${friendlist}" />  </b> <br>
<b> <c:out value="${ phoneno}"/> </b> <br>
<b> <c:out value="${iddetails}"/> </b> <br>



<c:out value="${custData}"></c:out> <br>

<c:if test="${!empty custData}">
	<b>${custData.cid}, ${custData.cname},${custData.caddr},${custData.billamt} </b>
</c:if>