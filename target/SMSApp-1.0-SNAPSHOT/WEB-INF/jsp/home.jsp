<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}

/* Style the top navigation bar */
.topnav {
  overflow: hidden;
  background-color: #333;
}

/* Style the topnav links */
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: red;
}
</style>
</head>
<body>
<div style="background-size: 80%; background-image: linear-gradient(to right, orange , yellow);">
<div class="header topnav" >
<!--   <a href="#default" class="logo">Logo</a> -->
    <a href="/registration">Student Registration</a>
    <a href="/list">Student List</a>
    <a href="/examregistration">Exam Registration</a>
     <a href="/examlist">Exam List</a>
     <a href="/markregistration">Mark Registration</a>
     <a href="/marklist">Mark List</a>
</div>
<br/><br/><br/>
<div style="padding-left:20px">
  <h1>Welcome to Student Management</h1>
  <p> First Student Registration</p>
  <p> Second Exam Registration </p>
  <p> Third Mark Registration </p>
</div>
<br/><br/><br/><br/><br/><br/><br/><br/>
</div>
</body>
</html>