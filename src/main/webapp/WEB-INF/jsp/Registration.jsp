<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SMS - Student Registration</title>
<style><%@include file="/WEB-INF/css/w3sms.css"%>

</style>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>

<script>
function ageCalculate(){
     var bday=document.getElementById('dob').value;
     var today = new Date();
     var birthDate = new Date(bday);
     var age = today.getFullYear() - birthDate.getFullYear();
     var m = today.getMonth() - birthDate.getMonth();
     if (today.getMonth() < birthDate.getMonth() || (today.getMonth() == birthDate.getMonth() && today.getDate() < birthDate.getDate())) {
         age--;
     }
     document.getElementById('age').value=age; 
 }
</script>
</head>
<body >
<div style="background-size: 80%; background-image: linear-gradient(to right, orange , yellow);">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Student <c:out value="${employee.id != null ? 'Update' : 'Registration' }" /></h2></div>
<form:form method="POST" modelAttribute="student" action="/home" name="student">
<table style="vertical-align: center; margin-left:20%;">
	
	<tr>
		<td><form:hidden path="id"/></td>
	</tr>
    <tr>
        <td>Full Name :</td>
        <td><form:input path="fullName" id="fullName" /></td>
    </tr>
    <tr>
        <td>Nick Name :</td>
        <td><form:input path="nickName" id="nickName"/></td>
    </tr>
    <tr>
        <td>Father Name :</td>
        <td><form:input path="fatherName" id="fatherName"/></td>
    </tr>
    <tr>
        <td>Father Occupation :</td>
        <td><form:input path="fatherOccupation" id="fatherOccupation"/></td>
    </tr>
    <tr>
        <td>Mother Name :</td>
        <td><form:input path="motherName" id="motherName"/></td>
    </tr>
    <tr>
        <td>Mother Occupation :</td>
        <td><form:input path="motherOccupation" id="motherOccupation" /></td>
    </tr>
    <tr>
        <td>DOB :</td>
        <td><form:input type="date" path="dob" id="dob"  /></td>
    </tr>
    <tr>
        <td>Age :</td>
        <td><form:input path="age" id="age"/> &nbsp;
        	<input type="button" value="Calculate" onclick="ageCalculate()" /></td>
    </tr>
    <tr>
        <td>Email ID :</td>
        <td><form:input path="emailId"  id="emailId"/></td>
    </tr>
     <tr>
        <td>Phone No :</td>
        <td><form:input path="phoneNo"  id="phoneNo"/></td>
    </tr>
     <tr>
        <td>Gender :</td>
        <td><form:select path="gender" items="${genders}"  id="gender"/></td>
    </tr>
     <tr>
        <td>Address :</td>
        <td><form:input type="textarea" path="address"  id="address"/></td>
    </tr>
     <tr>
        <td>Standard :</td>
        <td><form:input path="standard"  id="standard"/></td>
    </tr>
     <tr>
        <td>Section :</td>
        <td><form:input path="section"  id="section"/></td>
    </tr>
    <tr>
        <td>About :</td>
        <td><form:input type="textarea" path="about"  id="about"/></td>
    </tr>
    <tr>
        <td colspan="2"><input class="w3-button w3-black" type="submit" value="<c:out value="${student.id != null ? 'Update' : 'Register' }" />"
         >&nbsp;&nbsp; <a href="/list">Student List</a>&nbsp;
         <c:if test="${student.id ne null}"><b>|</b>&nbsp;<a href="/registration">Registration</a></c:if>
         </td>
    </tr>
</table>
</form:form>
</div>
</body>
</html>