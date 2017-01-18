<%@ page  contentType="text/html; charset=euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/view/color.jsp"%>
<html>
<head><title>My Page</title>
<link href="style.css" rel="stylesheet" type="text/css">
<body onLoad="focusIt();" bgcolor="${bodyback_c}">
  <table width="1500" cellpadding="0" cellspacing="0" align="center" border="1" >
      <tr>
       <td align="center" width="100" bgcolor="${bb}" height="120">
           <font color="${bodyback_c}"><b>지하 문방구 My Page</b></font>
       </td>
       </tr>
       </table>
        <table align="left" width=200  border="1">
       <tr>
        <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/jsmall/Mypage.mall">
             내 정보 </a>
       </td>
      </tr>
      <tr >
        <td align="center" bgcolor="${gg}" width="110" height="100" border="1"><a href="/jsmall/Order.mall">
             주문 내역 </a>
       </td>
       </tr>
       <tr > 
         <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/jsmall/Delivery.mall">
         배송조회 </a>
       </td>
       </tr>
       <tr > 
         <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/jsmall/Cart.mall">
         내가 찜한 목록 </a>
       </td>
       </tr>
       <tr > 
         <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/jsmall/PoCu.mall">
         포인트&쿠폰 </a>
       </td>
       </tr>
       <tr > 
        <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/jsmall/Complain.mall">
        1:1문의  </a>
       </td>
       </tr>
     </table>
     <table align="left" width=1500 height="620" border="1">
     <tr>
     <td bgcolor="${bodyback_c}" width="110" height="100" border="1" >
     <h3>내 정보</h3>
  <!--   
    String id = (String)session.getAttribute("memId");
   
    LogonDBBean manager = LogonDBBean.getInstance();
    LogonDataBean c = manager.getMember(id);

	try{
%>                    -->

<body bgcolor="${bodyback_c}">
<form method="post" action="modifyPro.jsp" name="userinput" onsubmit="return checkIt()">

  <table width="1200" height="530" border="1" cellspacing="0" cellpadding="3"  align="center" bgcolor="${gg}">
    <tr> 
      <td  colspan="2" height="39" bgcolor="${bb}" align="center">
	     <font size="+1" ><b>회원 정보수정</b></font></td>
    </tr>
    <tr>
      <td colspan="2" class="normal" align="center" bgcolor="${gg}"><font color="ww"><b>회원의 정보를 수정합니다.</b></font></td>
    </tr>
     <tr> 
      <td width="60" bgcolor="${bb}"><font color="${ww}"><b>아이디 입력</b></font></td>
      <td width="400" bgcolor="${bodyback_c}">&nbsp;</td>
 </tr>
    <tr> 
      <td  width="60" bgcolor="${bb}"><font color="${ww}"> 사용자 ID </font> </td>
      <td  width="400" bgcolor="${bodyback_c}">${c.getId()}</td>
    </tr>
    
     <tr> 
      <td width="60" bgcolor="${bb}"><font color="${ww}"> 비밀번호 </font></td>
      <td width="400" bgcolor="${bodyback_c}"> 
        <input type="password" name="passwd" size="10" maxlength="10" value="">
      </td>
    </tr>  
    <tr> 
      <td width="60" bgcolor="${bb}"><font color="${ww}"><b>개인정보 입력</b></font></td>
      <td width="400" bgcolor="${bodyback_c}">&nbsp;</td>
    </tr>  
    <tr> 
      <td  width="60" bgcolor="${bb}"><font color="${ww}">사용자 이름</font></td>
      <td  width="400" bgcolor="${bodyback_c}"> 
        <input type="text" name="name" size="15" maxlength="20" value="${c.getName()}">
      </td>
    </tr>
    <tr> 
      <td width="60" bgcolor="${bb}"><font color="${ww}">주민등록번호</font></td>
      <td width="400" bgcolor="${bodyback_c}"> 
        ${c.getJumin1()}-${c.getJumin2()}
      </td>
    </tr>
   <tr> 
      <td width="60" bgcolor="${bb}"><font color="${ww}">E-Mail</font></td>
      <td width="400" bgcolor="${bodyback_c}">
	    <c:if test="${c.getEmail()==null}">
		  <input type="text" name="email" size="40" maxlength="30" > </c:if>
		<c:if test="${c.getEmail()!=null }">
          <input type="text" name="email" size="40" maxlength="30" value=""> </c:if>	
		</td>
      </td>
    </tr>
    <tr> 
      <td colspan="2" align="center" bgcolor="${bb}"> 
       <input type="submit" name="modify" value="수   정" >
       <input type="button" value="취  소" onclick="javascript:window.location='main.jsp'">      
      </td>
    </tr>
  </table>
</form>
     </td>
     </tr>
     </table>
     <hr width="100%" size="3" color="${bodyback_c}" noshade> 
     <br /><br />
     <hr width="100%" size="3" noshade> 
      <center>
      <div class="bottom_menu">

            <a href="/jsmall/main.mall">홈</a> |
            <a href=" ">공지사항</a> |
            <a href=" ">문의사항</a> |
            <a href=" ">이용약관</a> |
            <a href=" ">개인정보 처리방침</a> |
            <a href=" ">고객센터</a>
        </div>
       
        <span>법인명(상호): 로스트로드 08082</span> &nbsp;
        <span>대표자(성명): 박혜진</span> &nbsp;
        <span>사업자 등록번호 안내: [123-45-67890]</span> &nbsp;
        <span>통신판매업 신고  2017-02-21</span><br/> &nbsp;
        <span>전화: 02-0000-0001</span> &nbsp;
        <span>팩스: 02-0000-0002</span> &nbsp;
        <span>주소: 서울특별시강남구테헤란로 000(신정동)4층302호</span><br/> &nbsp;
        <span class="">개인정보관리책임자: <a href="mailto:vanjihashop@naver.com">신성무(god404@naver.com)</a></span><br/> &nbsp;
        <span class="">Contact <strong><a href="mailto:lostroad@naver.com">lostroad@naver.com</a></strong> for more information.</span>
      </center>
      
 </body>
</html>