<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>�Խ���</title>
</head>

<body>  
<center><b>�۳��� ����</b>
<br>
<form>
<table width="500" border="1" cellspacing="0" cellpadding="0" align="center">  
  <tr height="30">
    <td align="center" width="125" >�۹�ȣ</td>
    <td align="center" width="125" align="center">${article.num}</td>
    <td align="center" width="125" >��ȸ��</td>
    <td align="center" width="125" align="center">${article.readcount}</td>
  </tr>
  <tr height="30">
    <td align="center" width="125" >�ۼ���</td>
    <td align="center" width="125" align="center">${article.writer}</td>
    <td align="center" width="125" >�ۼ���</td>
    <td align="center" width="125" align="center">${article.reg_date}</td>
  </tr>
  <tr height="30">
    <td align="center" width="125" >������</td>
    <td align="center" width="375" align="center" colspan="3">${article.subject}</td>
  </tr>
  <tr height="30">
  	<td align="center" width="125">����</td>
  	<td align="center" width="375" align="center" colspan="3"><img src="/jsp/save/${article2.sys}" /></td>
  </tr>
  <tr>
    <td align="center" width="125" >�۳���</td>
    <td align="left" width="375" colspan="3"><pre>${article.content}</pre></td>
  </tr>
  <tr height="30">      
    <td colspan="4" align="right" > 
	  <input type="button" value="�ۼ���" 
       onclick="document.location.href='/jsp/updateForm.IMG?num=${article.num}&pageNum=${pageNum}'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
	  <input type="button" value="�ۻ���" 
       onclick="document.location.href='/jsp/deleteForm.IMG?num=${article.num}&pageNum=${pageNum}'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="��۾���" 
       onclick="document.location.href='/jsp/writeForm.IMG?num=${article.num}&ref=${article.ref}&re_step=${article.re_step}&re_level=${article.re_level}'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
       <input type="button" value="�۸��" 
       onclick="document.location.href='/jsp/list.IMG?pageNum=${pageNum}'">
    </td>
  </tr>
</table>    
</form>
</body>
</html>