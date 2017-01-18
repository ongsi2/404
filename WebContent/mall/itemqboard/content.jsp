<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>게시판</title>
</head>

<body>  
<center><b>글내용 보기</b>
<br>
<form>
<table width="500" border="1" cellspacing="0" cellpadding="0" align="center">  
  <tr height="30">
    <td align="center" width="125" >글번호</td>
    <td align="center" width="125" align="center">${article.num}</td>
    <td align="center" width="125" >조회수</td>
    <td align="center" width="125" align="center">${article.readcount}</td>
  </tr>
  <tr height="30">
    <td align="center" width="125" >작성자</td>
    <td align="center" width="125" align="center">${article.writer}</td>
    <td align="center" width="125" >작성일</td>
    <td align="center" width="125" align="center">${article.reg_date}</td>
  </tr>
  <tr height="30">
    <td align="center" width="125" >글제목</td>
    <td align="center" width="375" align="center" colspan="3">${article.subject}</td>
  </tr>
  <tr height="30">
  	<td align="center" width="125">사진</td>
  	<td align="center" width="375" align="center" colspan="3"><img src="/jsp/save/${article2.sys}" /></td>
  </tr>
  <tr>
    <td align="center" width="125" >글내용</td>
    <td align="left" width="375" colspan="3"><pre>${article.content}</pre></td>
  </tr>
  <tr height="30">      
    <td colspan="4" align="right" > 
	  <input type="button" value="글수정" 
       onclick="document.location.href='/jsp/updateForm.IMG?num=${article.num}&pageNum=${pageNum}'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
	  <input type="button" value="글삭제" 
       onclick="document.location.href='/jsp/deleteForm.IMG?num=${article.num}&pageNum=${pageNum}'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="답글쓰기" 
       onclick="document.location.href='/jsp/writeForm.IMG?num=${article.num}&ref=${article.ref}&re_step=${article.re_step}&re_level=${article.re_level}'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
       <input type="button" value="글목록" 
       onclick="document.location.href='/jsp/list.IMG?pageNum=${pageNum}'">
    </td>
  </tr>
</table>    
</form>
</body>
</html>