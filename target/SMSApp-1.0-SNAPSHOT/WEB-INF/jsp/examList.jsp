<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SMS - Exam List</title>
<style><%@include file="/WEB-INF/css/w3sms.css"%></style>
</head>
<body >
<div style="background-size: 80%; background-image: linear-gradient(to right, orange , yellow);">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Exam List</h2></div>
	<table class="w3-table-all" style="width: 90%; margin:auto;">
	<thead>
		<tr class="w3-light-grey w3-hover-red">
			<th>Exam Name</th>
			<th>Exam Year</th>
			<th></th>
			<th></th>
		</tr>
		</thead>
		<c:forEach items="${examList}" var="exam">
			<tr class="w3-hover-blue">
				<td>${exam.examName}</td>
				<td>${exam.examYear}</td>
				
				
				<td>
					<a href="/examedit?id=${exam.id}" >Edit</a>
				</td>
				<td>
					<form action="/examdelete?id=${exam.id}" method="post">
						<input class="w3-button w3-black" type="submit" value="Delete" style="background:none;border:0px;cursor: pointer;"/>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
	</div>
</body>
</html>