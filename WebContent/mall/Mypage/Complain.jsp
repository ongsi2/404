<%@ page  contentType="text/html; charset=euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/view/color.jsp"%>
<html>
<head><title>Complain Page</title>
<link href="style.css" rel="stylesheet" type="text/css">

<body onLoad="focusIt();" bgcolor="${bodyback_c}">
  <table width="1500" cellpadding="0" cellspacing="0" align="center" border="1" >
      <tr>
       <td align="center" width="100" bgcolor="${bb}" height="120">
           <font color="${bodyback_c}"><b>지하 문방구 문의 Page</b></font>
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
     <table align="left" width=1500 height="200" border="1">
     <hr align="left" width="80%" size="2" noshade>
         <br />
    &nbsp;&nbsp;&nbsp;&nbsp;<b> ★ 문의사항 ★ </b>
        <br />
     <tr>
     
     <td bgcolor="${bodyback_c}" width="110" height="100" border="1" >
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -문의내용
         <br />
     <center>
     <textarea rows="10" cols="200"></textarea>
     </center>
     </td>
     </tr>
     </table>
     <table align="left" width=1500 height="200" border="1">
     <hr align="left" width="80%" size="2" noshade>
         <br />
    &nbsp;&nbsp;&nbsp;&nbsp;<b> ★ 답변받으실분 ★ </b>
        <br />
     <tr>
     
     <td bgcolor="${bodyback_c}" width="110" height="100" border="1" >
         &nbsp;&nbsp; - &nbsp;&nbsp;이름  &nbsp;&nbsp;&nbsp;
     <input type="text" value="" size="10"> <br />
     &nbsp;&nbsp; - 이메일  &nbsp;&nbsp;
     <input type="text" value="">@<input type="text" value=""> <br />
     &nbsp;&nbsp; - 전화번호
     <SELECT size="1"><option>010</option>
                      <option>016</option>
                      <option>017</option>
     </SELECT>-<input type="text" value="" size="4">-<input type="text" value="" size="4"> <br />
     
     </td>
     </tr>
     </table>
     <form name="complain" method="post" action="/mall/loginPro.mall">
     <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     
     <input type="submit" name="submit" value="문의하기" >
      </form>
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