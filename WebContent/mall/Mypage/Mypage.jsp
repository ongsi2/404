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
           <font color="${bodyback_c}"><b>���� ���汸 My Page</b></font>
       </td>
       </tr>
       </table>
        <table align="left" width=200  border="1">
       <tr>
        <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/jsmall/Mypage.mall">
             �� ���� </a>
       </td>
      </tr>
      <tr >
        <td align="center" bgcolor="${gg}" width="110" height="100" border="1"><a href="/jsmall/Order.mall">
             �ֹ� ���� </a>
       </td>
       </tr>
       <tr > 
         <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/jsmall/Delivery.mall">
         �����ȸ </a>
       </td>
       </tr>
       <tr > 
         <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/jsmall/Cart.mall">
         ���� ���� ��� </a>
       </td>
       </tr>
       <tr > 
         <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/jsmall/PoCu.mall">
         ����Ʈ&���� </a>
       </td>
       </tr>
       <tr > 
        <td align="center" bgcolor="${gg}" width="110" height="100" border="1" ><a href="/jsmall/Complain.mall">
        1:1����  </a>
       </td>
       </tr>
     </table>
     <table align="left" width=1500 height="620" border="1">
     <tr>
     <td bgcolor="${bodyback_c}" width="110" height="100" border="1" >
     <h3>�� ����</h3>
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
	     <font size="+1" ><b>ȸ�� ��������</b></font></td>
    </tr>
    <tr>
      <td colspan="2" class="normal" align="center" bgcolor="${gg}"><font color="ww"><b>ȸ���� ������ �����մϴ�.</b></font></td>
    </tr>
     <tr> 
      <td width="60" bgcolor="${bb}"><font color="${ww}"><b>���̵� �Է�</b></font></td>
      <td width="400" bgcolor="${bodyback_c}">&nbsp;</td>
 </tr>
    <tr> 
      <td  width="60" bgcolor="${bb}"><font color="${ww}"> ����� ID </font> </td>
      <td  width="400" bgcolor="${bodyback_c}">${c.getId()}</td>
    </tr>
    
     <tr> 
      <td width="60" bgcolor="${bb}"><font color="${ww}"> ��й�ȣ </font></td>
      <td width="400" bgcolor="${bodyback_c}"> 
        <input type="password" name="passwd" size="10" maxlength="10" value="">
      </td>
    </tr>  
    <tr> 
      <td width="60" bgcolor="${bb}"><font color="${ww}"><b>�������� �Է�</b></font></td>
      <td width="400" bgcolor="${bodyback_c}">&nbsp;</td>
    </tr>  
    <tr> 
      <td  width="60" bgcolor="${bb}"><font color="${ww}">����� �̸�</font></td>
      <td  width="400" bgcolor="${bodyback_c}"> 
        <input type="text" name="name" size="15" maxlength="20" value="${c.getName()}">
      </td>
    </tr>
    <tr> 
      <td width="60" bgcolor="${bb}"><font color="${ww}">�ֹε�Ϲ�ȣ</font></td>
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
       <input type="submit" name="modify" value="��   ��" >
       <input type="button" value="��  ��" onclick="javascript:window.location='main.jsp'">      
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

            <a href="/jsmall/main.mall">Ȩ</a> |
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