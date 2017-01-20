<%@ page contentType = "text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<title>상품</title>
</head>

<body>
<center ><b>상품목록(전체 상품:${count})</b>
<table width="700">
  <tr>
    <td align="right" >
       <a href="/mall/itemwritePro.mall">상품등록</a>
    </td>
  </tr>
</table>

<c:if test="${count == 0}">
<table width="700" border="1" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center">
      게시판에 저장된 글이 없습니다.
    </td>
  </tr>
</table>
</c:if>

<c:if test="${count > 0}">
<table border="1" width="700" cellpadding="0" cellspacing="0" align="center"> 
    <tr height="30" > 
      <td align="center"  width="50"  >번 호</td> 
      <td align="center"  width="250" >상 품</td> 
      <td align="center"  width="100" >상품명</td>
      <td align="center"  width="100" >가격</td> 
      <td align="center"  width="100" >등록일</td> 
      <td align="center"  width="100" >상품타입</td> 
      <td align="center"  width="50" >재고</td> 
    </tr>

   <c:forEach var="article" items="${articleList}">
   <tr height="30">
    <td align="center"  width="50" >
	</td>
    <td  width="250" >
       <a href="/mall/itemcontent.mall?num=${article.item_num}&pageNum=${currentPage}">
       <img src="/mall/save/${article.sys}" width=66.5px, height=40px  /></a>
       </td>
       <td>
      <a href="/mall/itemcontent.mall?num=${article.num}&pageNum=${currentPage}">
          ${article.subject}</a>
	</td>
    <td align="center"  width="100">${article.writer}
	</td>
    <td align="center"  width="100">${article.reg_date}
	</td>
    <td align="center"  width="100">${article.readcount}</td>
    <td align="center"  width="100">${article.readcount}</td>
  </tr>
  </c:forEach>
</table>
</c:if>

<c:if test="${count > 0}">
   <c:set var="pageCount" value="${count / pageSize + ( count % pageSize == 0 ? 0 : 1)}"/>
   <c:set var="pageBlock" value="${10}"/>
   <fmt:parseNumber var="result" value="${currentPage / 10}" integerOnly="true" />
   <c:set var="startPage" value="${result * 10 + 1}" />
   <c:set var="endPage" value="${startPage + pageBlock-1}"/>
   <c:if test="${endPage > pageCount}">
        <c:set var="endPage" value="${pageCount}"/>
   </c:if> 
          
   <c:if test="${startPage > 10}">
        <a href="/mall/item.mall?pageNum=${startPage - 10 }">[이전]</a>
   </c:if>

   <c:forEach var="i" begin="${startPage}" end="${endPage}">
       <a href="/mall/item.mall?pageNum=${i}">[${i}]</a>
   </c:forEach>

   <c:if test="${endPage < pageCount}">
        <a href="/mall/item?pageNum=${startPage + 10}">[다음]</a>
   </c:if>
<br/>
<br/>
</c:if>
</center>
</body>
</html>
