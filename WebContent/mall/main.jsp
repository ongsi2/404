<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<body>
<form name="form" action="" method="post">
<h2>메인페이지</h2>

<style type="text/css">
body { background-color: #FFFFFF;}
div { position:absolute; top:20px; right:110px;}
</style>
<div class="login_tab">
<td><input type="text" name="id" placeholder="아이디"> </td>
<td><input type="text" name="pw" placeholder="비밀번호"></td>
<tr>
<td><input type="submit" value="로그인"></input>
</td>
</tr>

<input type="button" value="회원가입" onclick="window.location='joinform.mall'">
<input type="button" value="FAQ게시판" onclick="window.location='faqboard.mall'">
<input type="button" value="공지사항" onclick="window.location='noticeboard.mall'">
<input type="button" value="상품문의게시판" onclick="window.location='itemqboard.mall'">
</div>
</form>
</body>
