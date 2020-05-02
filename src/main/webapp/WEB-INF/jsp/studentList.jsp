<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SMS - Student List</title>
<style><%@include file="/WEB-INF/css/w3sms.css"%>
</style>
</head>
<body >
<div style="background-size: 80%; background-image: linear-gradient(to right, orange , yellow);">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Student List</h2></div>
	<table class="w3-table-all"  style="width: 90%; margin:auto;">
	<thead>
		<tr class="w3-light-grey w3-hover-red">
			<th>Full Name</th>
			<th>Nick Name</th>
			<th>Father Name</th>
			<th>DOB</th>
			<th>Gender</th>
			<th>Phone Number</th>
			<th>Standard</th>
			<th>Section</th>
			<th></th>
			<th></th>
		</tr>
		</thead>
		<c:forEach items="${studentList}" var="student">
			<tr class="w3-hover-blue">
				<td>${student.fullName}</td>
				<td>${student.nickName}</td>
				<td>${student.fatherName}</td>
				<td>${student.dob}</td>
				<td>${student.gender}</td>
				<td>${student.phoneNo}</td>
				<td>${student.standard}</td>
				<td>${student.section}</td>
				
				<td >
					<a href="/edit?id=${student.id}" >Edit</a>
				</td>
				<td>
					<form action="/delete?id=${student.id}" method="post">
						<input class="w3-button w3-black" type="submit" value="Delete" style="background:none;border:0px;cursor: pointer;"/>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
	</div>
</body>
</html>