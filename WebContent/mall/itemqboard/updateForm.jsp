<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>�Խ���</title>
<script language="JavaScript" src="script.js"></script>
</head>

<body>  
<center><b>�ۼ���</b>
<br>
<form method="post" name="writeform" action="/jsp/updatePro.IMG?pageNum=${pageNum}" onsubmit="return writeSave()"enctype="multipart/form-data">
<table width="400" border="1" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td  width="70" align="center">�� ��</td>
    <td align="left" width="330">
       <input type="text" size="10" maxlength="10" name="writer" value="${article.writer}">
	   <input type="hidden" name="num" value="${article.num}"></td>
  </tr>
  <tr>
    <td  width="70" align="center" >�� ��</td>
    <td align="left" width="330">
       <input type="text" size="40" maxlength="50" name="subject" value="${article.subject}"></td>
  </tr>
  <tr>
    <td  width="70" align="center">Email</td>
    <td align="left" width="330">
       <input type="text" size="40" maxlength="30" name="email" value="${article.email}"></td>
  </tr>
<tr>
	<td width="70" align="center">����÷��</td>
	<td width="330"><input type="file" name="save" /></td>
</tr>
  <tr>
    <td  width="70" align="center" >�� ��</td>
    <td align="left" width="330">
     <textarea name="content" rows="13" cols="40">${article.content}</textarea></td>
  </tr>
  <tr>
    <td  width="70" align="center" >��й�ȣ</td>
    <td align="left" width="330" >
     <input type="password" size="8" maxlength="12" name="passwd">
	 </td>
  </tr>
  <tr>      
   <td colspan=2 align="center"> 
     <input type="submit" value="�ۼ���" >  
     <input type="reset" value="�ٽ��ۼ�">
     <input type="button" value="��Ϻ���" 
       onclick="document.location.href='/jsp/list.IMG?pageNum=${pageNum}'">
   </td>
 </tr>
 </table>
</form>
</body>
</html>      