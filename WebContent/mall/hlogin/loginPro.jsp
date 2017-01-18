<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:if test="${result==true }">
<c:redirect url="/main.mall"/>
</c:if>

<c:if test="${result==false }">
<script>
 alert("비밀번호가 맞지 않습니다.");
      history.go(-1);
</script>
</c:if>
