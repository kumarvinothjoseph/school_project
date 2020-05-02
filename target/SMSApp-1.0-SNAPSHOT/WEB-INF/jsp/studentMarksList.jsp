<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SMS - Marks List</title>
<style><%@include file="/WEB-INF/css/w3sms.css"%></style>
<style>
:root {
  --radius: 2px;
  --baseFg: dimgray;
  --baseBg: white;
  --accentFg: #006fc2;
  --accentBg: #bae1ff;
}

.theme-pink {
  --radius: 2em;
  --baseFg: #c70062;
  --baseBg: #ffe3f1;
  --accentFg: #c70062;
  --accentBg: #ffaad4;
}

.theme-construction {
  --radius: 0;
  --baseFg: white;
  --baseBg: black;
  --accentFg: black;
  --accentBg: orange;
}

select {
  font: 400 12px/1.3 sans-serif;
  -webkit-appearance: none;
  appearance: none;
  color: var(--baseFg);
  border: 1px solid var(--baseFg);
  line-height: 1;
  outline: 0;
  padding: 0.65em 2.5em 0.55em 0.75em;
  border-radius: var(--radius);
  background-color: var(--baseBg);
  background-image: linear-gradient(var(--baseFg), var(--baseFg)),
    linear-gradient(-135deg, transparent 50%, var(--accentBg) 50%),
    linear-gradient(-225deg, transparent 50%, var(--accentBg) 50%),
    linear-gradient(var(--accentBg) 42%, var(--accentFg) 42%);
  background-repeat: no-repeat, no-repeat, no-repeat, no-repeat;
  background-size: 1px 100%, 20px 22px, 20px 22px, 20px 100%;
  background-position: right 20px center, right bottom, right bottom, right bottom;   
}

select:hover {
  background-image: linear-gradient(var(--accentFg), var(--accentFg)),
    linear-gradient(-135deg, transparent 50%, var(--accentFg) 50%),
    linear-gradient(-225deg, transparent 50%, var(--accentFg) 50%),
    linear-gradient(var(--accentFg) 42%, var(--accentBg) 42%);
}

select:active {
  background-image: linear-gradient(var(--accentFg), var(--accentFg)),
    linear-gradient(-135deg, transparent 50%, var(--accentFg) 50%),
    linear-gradient(-225deg, transparent 50%, var(--accentFg) 50%),
    linear-gradient(var(--accentFg) 42%, var(--accentBg) 42%);
  color: var(--accentBg);
  border-color: var(--accentFg);
  background-color: var(--accentFg);
}
</style>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>

</head>
<body >
<div style="background-size: 80%; background-image: linear-gradient(to right, orange , yellow);">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Marks List</h2></div>
<script type="text/javascript">
function search(objVal){
	var studentId = $( "#studentsearch option:selected" ).val();
	var examId =  $( "#examsearch option:selected" ).val();
	document.getElementById("myform").action = "/marklistSearch?examid="+examId+"&studentid="+studentId;
	$('#myform').submit();
}
</script>
<form id="myform" action="/" name="myform"; method="POST">
<table>

<tr>
Select Student :
<select class="theme-construction" name="student" id="studentsearch">
    <c:forEach items="${studentList}" var="student">
        <option value="${student.id}">${student.fullName}</option>
    </c:forEach>
</select>
</tr>
&nbsp;&nbsp;&nbsp;
<tr>
Select Exam :
<select class="theme-construction" name="exam" id="examsearch">
    <c:forEach items="${examList}" var="exam">
        <option value="${exam.id}">${exam.examName}</option>
    </c:forEach>
</select>
</tr>
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" class="w3-button w3-aqua" value="Search" onclick="search()"style="background:none;border:0px;cursor: pointer;"/>

</tr>

</table>
</form>
	<table class="w3-table-all" style="width: 90%; margin:auto;">
	<thead>
		<tr class="w3-light-grey w3-hover-red">
			<th>Tamil</th>
			<th>English</th>
			<th>Maths</th>
			<th>Science</th>
			<th>Social Science</th>
			<th>Other 1</th>
			<th>Other 2</th>
			<th></th>
			<th></th>
		</tr>
		</thead>
		<c:forEach items="${studentMarksList}" var="marks">
			<tr class="w3-hover-blue">
				<td>${marks.tamil}</td>
				<td>${marks.english}</td>
				<td>${marks.maths}</td>
				<td>${marks.science}</td>
				<td>${marks.socialScience}</td>
				<td>${marks.other1}</td>
				<td>${marks.other2}</td>
				
				<td>
					<a href="/markedit?id=${marks.id}" >Edit</a>
				</td>
				<td>
					<form action="/markdelete?id=${marks.id}" method="post">
						<input class="w3-button w3-black" type="submit" value="Delete" style="background:none;border:0px;cursor: pointer;"/>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
	</div>
</body>
</html>