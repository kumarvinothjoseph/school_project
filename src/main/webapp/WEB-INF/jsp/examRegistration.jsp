<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SMS - Exam Registration</title>
<style><%@include file="/WEB-INF/css/w3sms.css"%></style>
</head>
<body >
<div style="background-size: 80%; background-image: linear-gradient(to right, orange , yellow);">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Exam <c:out value="${exam.id != null ? 'Update' : 'Registration' }" /></h2></div>
<form:form method="POST" modelAttribute="exam" action="/examhome" name="exam">
<table style="vertical-align: center; margin-left:20%;">
	
	<tr>
		<td><form:hidden path="id"/></td>
	</tr>
    <tr>
        <td>Exam Name :</td>
        <td><form:input path="examName" id="examName" /></td>
    </tr>
    <tr>
        <td>Exam Year :</td>
        <td><form:input path="examYear" id="examYear"/></td>
    </tr>
    
    <tr>
        <td colspan="2"><input type="submit" class="w3-button w3-black" value="<c:out value="${exam.id != null ? 'Update' : 'Register' }" />"
         >&nbsp;&nbsp; <a href="/examlist">Student List</a>&nbsp;
         <c:if test="${exam.id ne null}"><b>|</b>&nbsp;<a href="/examregistration">Registration</a></c:if>
         </td>
    </tr>
</table>
</form:form>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
</div>
</body>
</html>