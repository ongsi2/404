<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<body >
<title>회원정보수정</title>
<form method="post" action="modifyPro.mall" name="userinput">
<table width="600" border="1" cellspacing="0" cellpadding="3"  align="center">
<tr>
<td><font size="4">이름</font></td>
<td>  ${m.name}</td>
</tr>

<tr>
<td><font size="4">아이디</font></td>
<td> ${m.id}
</tr>


<tr>
<td><font size="4">비밀번호</font></td>
<td> <input type="password" name="pw" value="${m.pw}"></td>

<tr>
<td><font size="4">이메일</font></td>
<td> <input type="text" name="mail" value="${m.mail}">@
<select name="mailaddress" value="${m.mailaddress}" >
              <option>naver.com</option>
              <option>daum.net</option>
              <option>gmail.com</option>
              
              
      </select>
</td>
<tr >

<td><font size="4">주소</font></td>
<td>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
    function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                var fullAddr = ''; 
                var extraAddr = '';

     
                if (data.userSelectedType === 'R') {
                    fullAddr = data.roadAddress;

                } else { 
                    fullAddr = data.jibunAddress;
                }

                
                if(data.userSelectedType === 'R'){
 
                    if(data.bname !== ''){
                        extraAddr += data.bname;
                    }
     
                    if(data.buildingName !== ''){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
         
                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
                }

     
                document.getElementById('zipcode').value = data.zonecode; 
                document.getElementById('address').value = fullAddr;   
                document.getElementById('address2').focus();
                
            }
        }).open();
    }
</script>



<input type="text" id="zipcode"  name="zipcode" value="${m.zipcode}" placeholder="우편번호">
<input type="button" onclick="execDaumPostcode()" value="우편번호 찾기"><br>
<input type="text" size="50" id="address" name="address" value="${m.address}" placeholder="주소" ><br>
<input type="text" width="110" id="address2" name="address2"  value="${m.address2}"placeholder="상세주소">
</td>


<tr>
<td><font size="4">핸드폰번호</font></td>
<td>
 <select name="mobile" value="${m.mobile}"><option>skt</option>
              <option>kt</option>
              <option>u+</option>
      </select>

<select name="phone" value="${m.phone }"><option>010</option>
              <option>011</option>
              <option>016</option>
              <option>017</option>
      </select>
<input type="text" name="phone2" value="${m.phone2 }">-<input type="text" name="phone3" value="${m.phone3 }" >   
 </td>
 </tr>   
 <td></td>  
<td align="center">
<input type="submit"  >
<input type="button" value="취소" onclick="window.location='main.mall'">
</td>
</table>
</form></body>

