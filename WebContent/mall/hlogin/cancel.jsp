<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<body>
<h2>회원탈퇴</h2>
<form action="cancelPro.mall" method="post">
<table border="1">
<tr>
<td><font size="4">회원탈퇴</font>
</td>
</tr>
<tr>
<Td><font size="4">비밀번호</font>
<td><input type="password" name="pw"></td></td>
<tr>
<td><input type="submit" value="확인">
<input type="button" value="취소" onclick="window.location='main.mall'"></td>
</table>

</form>


</body>