<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<body>
<form name="myform" method="post" action="loginPro.mall">
<h2>로그인</h2>
<td><input type="text" name="id" placeholder="아이디"> </td>
<td><input type="password" name="pw" placeholder="비밀번호"></td>
<tr>
<td><input type="submit" value="로그인"></td>
<input type="button" value="회원가입" onclick="window.location='joinform.mall'">
<input type="button" value="FAQ게시판" onclick="window.location='faqboard.mall'">

</form>
</body>