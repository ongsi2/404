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
           <font color="${bodyback_c}"><b>���� ���汸 My �ֹ�����Page</b></font>
       </td>
       </tr>
       </table>
        <table align="left" width=200  border="1">
       <tr>
        <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/mall/Mypage.mall">
             �� ���� </a>
       </td>
      </tr>
      <tr > 
        <td align="center" bgcolor="${gg}" width="110" height="100" border="1"><a href="/mall/Order.mall">
             �ֹ� ���� </a>
       </td>
       </tr>
       <tr > 
         <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/mall/Delivery.mall">
         �����ȸ </a>
       </td>
       </tr>
       <tr > 
         <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/mall/Cart.mall">
         ���� ���� ��� </a>
       </td>
       </tr>
       <tr > 
         <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/mall/PoCu.mall">
         ����Ʈ&���� </a>
       </td>
       </tr>
       <tr > 
        <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/mall/Complain.mall">
        1:1����  </a>
       </td>
       </tr>
     </table>
<hr align="left" width="80%" size="2" noshade>
         <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b> �� �� �� �� �� �� </b>
        <br />
<STYLE type="text/css">
.box1 { color:#000000; background:#FFFFFF;  line-height:12pt;
  font-family: ����; font-size: 10pt; font-weight: bold; font-style: normal;
  margin-left: 22em;
  padding-top:1; padding-bottom:1; padding-left:1; padding-right:1;
  border-color: #000000; border-style:solid;
  border-top-width:2; border-bottom-width:2;
  border-left-width:2; border-right-width:2;
}
</STYLE>

<table border=1 width=68% height=38% class=box1>
<tr><td>test of �ؽ�Ʈ</td>
</tr>
</table>

     <hr width="100%" size="3" color="${bodyback_c}" noshade> 
     <br /><br />
     <hr width="100%" size="3" noshade> 
      <center>
      <div class="bottom_menu">

            <a href="/mall/main.mall">Ȩ</a> |
            <a href=" ">��������</a> |
            <a href=" ">���ǻ���</a> |
            <a href=" ">�̿���</a> |
            <a href=" ">�������� ó����ħ</a> |
            <a href=" ">������</a>
        </div>
       
        <span>���θ�(��ȣ): �ν�Ʈ�ε� 08082</span> &nbsp;
        <span>��ǥ��(����): ������</span> &nbsp;
        <span>����� ��Ϲ�ȣ �ȳ�: [123-45-67890]</span> &nbsp;
        <span>����Ǹž� �Ű�  2017-02-21</span><br/> &nbsp;
        <span>��ȭ: 02-0000-0001</span> &nbsp;
        <span>�ѽ�: 02-0000-0002</span> &nbsp;
        <span>�ּ�: ����Ư���ð������������ 000(������)4��302ȣ</span><br/> &nbsp;
        <span class="">������������å����: <a href="mailto:vanjihashop@naver.com">�ż���(god404@naver.com)</a></span><br/> &nbsp;
        <span class="">Contact <strong><a href="mailto:lostroad@naver.com">lostroad@naver.com</a></strong> for more information.</span>
      </center>
 </body>
</html>