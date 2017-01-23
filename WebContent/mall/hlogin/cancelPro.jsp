<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<body>
<h2>회원탈퇴</h2>

<form method="post" action="main.mall">
<c:if test="${check==true }">
<tr><input type="submit" value="확인">
</tr></c:if></font>

<c:if test="${check==false }">
<script>
  alert("비밀번호가 맞지 않습니다.");
  history.go(-1);
</script></c:if> 
</form> </body>
