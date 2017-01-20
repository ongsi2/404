<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<body>
<title>중복확인</title>
<c:if test="${check==true}">
<table width="300">
<td>
${id} 이미사용중인 아이디입니다.</td>
</table>

<form name="checkform" method="post" action="comfirm.mall">
<table width="300">
<td>
다른아이디를 선택하세요</td>
<input type="text" name="id">
<input type="submit" value="id 중복확인">
</form></c:if>

<c:if test="${check==false}">
</table  width="300">

<p>입력하신 ${id }는 사용하실수 <br/>있는 아이디 입니다.</p>

<input type="button" value="닫기" onclick="setid()">
<script language="javascript">
function setid()
{
	
	self.close();
	
	}

</script>
</form>
</c:if>


</body>
</html>


