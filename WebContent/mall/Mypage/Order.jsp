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
           <font color="${bodyback_c}"><b>지하 문방구 My 주문내역Page</b></font>
       </td>
       </tr>
       </table>
        <table align="left" width=200  border="1">
       <tr>
        <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/mall/Mypage.mall">
             내 정보 </a>
       </td>
      </tr>
      <tr > 
        <td align="center" bgcolor="${gg}" width="110" height="100" border="1"><a href="/mall/Order.mall">
             주문 내역 </a>
       </td>
       </tr>
       <tr > 
         <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/mall/Delivery.mall">
         배송조회 </a>
       </td>
       </tr>
       <tr > 
         <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/mall/Cart.mall">
         내가 찜한 목록 </a>
       </td>
       </tr>
       <tr > 
         <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/mall/PoCu.mall">
         포인트&쿠폰 </a>
       </td>
       </tr>
       <tr > 
        <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/mall/Complain.mall">
        1:1문의  </a>
       </td>
       </tr>
     </table>
<hr align="left" width="80%" size="2" noshade>
         <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b> ★ 주 문 내 역 ★ </b>
        <br />
<STYLE type="text/css">
.box1 { color:#000000; background:#FFFFFF;  line-height:12pt;
  font-family: 굴림; font-size: 10pt; font-weight: bold; font-style: normal;
  margin-left: 22em;
  padding-top:1; padding-bottom:1; padding-left:1; padding-right:1;
  border-color: #000000; border-style:solid;
  border-top-width:2; border-bottom-width:2;
  border-left-width:2; border-right-width:2;
}
</STYLE>

<table border=1 width=68% height=38% class=box1>
<tr><td>test of 텍스트</td>
</tr>
</table>

     <hr width="100%" size="3" color="${bodyback_c}" noshade> 
     <br /><br />
     <hr width="100%" size="3" noshade> 
      <center>
      <div class="bottom_menu">

            <a href="/mall/main.mall">홈</a> |
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