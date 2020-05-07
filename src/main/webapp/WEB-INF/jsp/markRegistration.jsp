<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SMS - Marks Registration</title>
<style><%@include file="/WEB-INF/css/w3sms.css"%></style>
</head>
<body >
<script>
var specialKeys = new Array();
specialKeys.push(8); //Backspace
function IsNumeric(e) {
    var keyCode = e.which ? e.which : e.keyCode
    var ret = ((keyCode >= 48 && keyCode <= 57) || specialKeys.indexOf(keyCode) != -1);
    document.getElementById("error").style.display = ret ? "none" : "inline";
    return ret;
}

function IsNumeric1(e) {
    var keyCode = e.which ? e.which : e.keyCode
    var ret = ((keyCode >= 48 && keyCode <= 57) || specialKeys.indexOf(keyCode) != -1);
    document.getElementById("error1").style.display = ret ? "none" : "inline";
    return ret;
}
function IsNumeric2(e) {
    var keyCode = e.which ? e.which : e.keyCode
    var ret = ((keyCode >= 48 && keyCode <= 57) || specialKeys.indexOf(keyCode) != -1);
    document.getElementById("error2").style.display = ret ? "none" : "inline";
    return ret;
}
function IsNumeric3(e) {
    var keyCode = e.which ? e.which : e.keyCode
    var ret = ((keyCode >= 48 && keyCode <= 57) || specialKeys.indexOf(keyCode) != -1);
    document.getElementById("error3").style.display = ret ? "none" : "inline";
    return ret;
}
function IsNumeric4(e) {
    var keyCode = e.which ? e.which : e.keyCode
    var ret = ((keyCode >= 48 && keyCode <= 57) || specialKeys.indexOf(keyCode) != -1);
    document.getElementById("error4").style.display = ret ? "none" : "inline";
    return ret;
}
function IsNumeric5(e) {
    var keyCode = e.which ? e.which : e.keyCode
    var ret = ((keyCode >= 48 && keyCode <= 57) || specialKeys.indexOf(keyCode) != -1);
    document.getElementById("error5").style.display = ret ? "none" : "inline";
    return ret;
}
function IsNumeric6(e) {
    var keyCode = e.which ? e.which : e.keyCode
    var ret = ((keyCode >= 48 && keyCode <= 57) || specialKeys.indexOf(keyCode) != -1);
    document.getElementById("error6").style.display = ret ? "none" : "inline";
    return ret;
}
function IsNumeric7(e) {
    var keyCode = e.which ? e.which : e.keyCode
    var ret = ((keyCode >= 48 && keyCode <= 57) || specialKeys.indexOf(keyCode) != -1);
    document.getElementById("error7").style.display = ret ? "none" : "inline";
    return ret;
}

function calculate(){
	var tamil = document.getElementById('tamil').value;
	if(tamil == ""){
		tamil = 0;
	}
	var english = document.getElementById('english').value;
	if(english == ""){
		english = 0;
	}
	var maths = document.getElementById('maths').value;
	if(maths == ""){
		maths = 0;
	}
	var science = document.getElementById('science').value;
	if(science == ""){
		science = 0;
	}
	var socialscience = document.getElementById('socialScience').value;
	if(socialscience == ""){
		socialscience = 0;
	}
	var other1 = document.getElementById('other1').value;
	if(other1 == ""){
		other1 = 0;
	}
	var other2 = document.getElementById('other2').value;
	if(other2 == ""){
		other2 = 0;
	}
	var total = parseFloat(tamil) + parseInt(english) + parseInt(maths) + parseInt(science) + parseInt(socialscience) + parseInt(other1) + parseInt(other2);
	document.getElementById('total').value = total;
	
}
</script>
<div style="background-size: 80%; background-image: linear-gradient(to right, orange , yellow);">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Marks <c:out value="${studentMarks.id != null ? 'Update' : 'Registration' }" /></h2></div>
<form:form method="POST" modelAttribute="studentMarks" action="/markhome" name="studentMarks">
<table style="vertical-align: center; margin-left:20%;">
	
	<tr>
		<td><form:hidden path="id"/></td>
	</tr>
	<tr>
        <td>Student :</td>
        <td><form:select path="student.id"  id="student.id" items="${studentObjs}" /></td>
    </tr>
    <tr>
        <td>Exam :</td>
        <td><form:select path="exam.id" id="exam.id" items="${examObjs}"/></td>
    </tr>
    <tr>
        <td>Tamil :</td>
        <td><form:input onkeypress="return IsNumeric(event);" ondrop="return false;" onpaste="return false;" path="tamil" id="tamil" /><span id="error" style="color: Red; display: none">* Input digits (0 - 9)</span></td>
    </tr>
    <tr>
        <td>English :</td>
        <td><form:input onkeypress="return IsNumeric1(event);" ondrop="return false;" onpaste="return false;" path="english" id="english"/><span id="error1" style="color: Red; display: none">* Input digits (0 - 9)</span></td>
    </tr>
     <tr>
        <td>Maths :</td>
        <td><form:input onkeypress="return IsNumeric2(event);" ondrop="return false;" onpaste="return false;" path="maths" id="maths"/><span id="error2" style="color: Red; display: none">* Input digits (0 - 9)</span></td>
    </tr>
      <tr>
        <td>Science :</td>
        <td><form:input onkeypress="return IsNumeric3(event);" ondrop="return false;" onpaste="return false;" path="science" id="science"/><span id="error3" style="color: Red; display: none">* Input digits (0 - 9)</span></td>
    </tr>
      <tr>
        <td>Social Science :</td>
        <td><form:input onkeypress="return IsNumeric4(event);" ondrop="return false;" onpaste="return false;" path="socialScience" id="socialScience"/><span id="error4" style="color: Red; display: none">* Input digits (0 - 9)</span></td>
    </tr>
      <tr>
        <td>Other1 :</td>
        <td><form:input onkeypress="return IsNumeric5(event);" ondrop="return false;" onpaste="return false;" path="other1" id="other1"/><span id="error5" style="color: Red; display: none">* Input digits (0 - 9)</span></td>
    </tr>
      <tr>
        <td>Other2 :</td>
        <td><form:input onkeypress="return IsNumeric6(event);" ondrop="return false;" onpaste="return false;" path="other2" id="other2"/><span id="error6" style="color: Red; display: none">* Input digits (0 - 9)</span></td>
    </tr>
     </tr>
    <tr>
        <td>Total :</td>
        <td><form:input onkeypress="return IsNumeric(event);" ondrop="return false;" onpaste="return false;" path="total" id="total"/> &nbsp; 
        <input type="button" onclick="calculate();" value="Calculate" /> </td>
    </tr>
     <tr>
        <td>Grade :</td>
        <td><form:input path="grade" id="grade"/></td>
    </tr>
     <tr>
        <td>Rank :</td>
        <td><form:input onkeypress="return IsNumeric7(event);" ondrop="return false;" onpaste="return false;" path="rank" id="rank"/><span id="error7" style="color: Red; display: none">* Input digits (0 - 9)</span></td>
    </tr>
    
    
    <tr>
        <td colspan="2"><input type="submit" class="w3-button w3-black" value="<c:out value="${studentMarks.id != null ? 'Update' : 'Register' }" />"
         >&nbsp;&nbsp; <a href="/marklist">Mark List</a>&nbsp;
         <c:if test="${studentMarks.id ne null}"><b>|</b>&nbsp;<a href="/markregistration">Registration</a></c:if>
         </td>
    </tr>
</table>
</form:form>
<br/><br/><br/><br/><br/><br/>
</div>
</body>
</html>