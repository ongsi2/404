<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<body>

<table width="270" border="0" cellspacing="0" cellpadding="5">
<form name="checkForm" method="post" action="confirm.mall">
<c:if test="${result==true}">
  <tr> 
    <td height="39">${id}이미 사용중인 아이디입니다.</td>
  </tr>     
       
</table>
</form>
</c:if>
 


<table width="270" border="0" cellspacing="0" cellpadding="5">
<c:if test="${result==false}">
  <tr> 
    <td align="center"> 
      <p>입력하신 ${id} 는 사용하실 수 있는 ID입니다. </p>
      <input type="button" value="닫기" onclick="setid()">
    </td>
  </tr>
</table>
</c:if>
</body>
</html>
<script language="javascript">
  function setid()
    {		
	//opener 자신을 띄워준 창으로이동함 , 
    	opener.document.form.id.value="${id}";
		self.close();//해당 창을 종료 
		}
</script>


