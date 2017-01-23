<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script language="JavaScript">

function openconfirm(userinput){
 if(userinput.id.value==""){
 alert("아이디를 입력하세요");
 return;
 }
 
 url="confirm.mall?id=" + userinput.id.value;
 open(url, "confirm" , "toolbar=no, location=no, status=no, menubar=no, scrollbars=no, resizable=no, height=100, width=300");
}
</script>


<body >
<h2>회원가입</h2>
<form action="joinformPro.mall" name="form" method="post">
<table border="1">

<tr>
<td><font size="4">이름</font></td>
<td>  <input type="text" name="name"></td>
</tr>

<tr>
<td><font size="4">아이디</font></td>
<td> <input type="text" name="id">
<input type="button" value="중복확인" onclick="openconfirm(this.form)"></td> 
</tr>


<tr>
<td><font size="4">비밀번호</font></td>
<td> <input type="password" name="pw"></td>


<tr>
<form name="form" method="post">
<td><font size="4">이메일</font></td>

<script language="Javascript">
function checkmailaddy(){
	  if(form.mail3.value=='1'){
		  form.mailaddress.readonly=false;
		  form.mailaddress.value='';
		  form.mailaddress.focus();  
	  }else{
		  form.mailaddress.readonly=true;
		  form.mailaddress.value=form.mail3.value;
	  }
}
</script>

<form name="form" method="post">
<td > <input type="text" name="mail">@<input name="mailaddress" type="text">

<select name="mail3" onChange="checkmailaddy();"  readonly>
  			  <option value=""  >선택하세요</option>
              <option value="naver.com">naver.com</option>
              <option value="daum.net">daum.net</option>
              <option value="gmail.com">gmail.com</option>
              <option value="1" >직접입력</option>

      </select></form>
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



<input type="text" id="zipcode"  name="zipcode" placeholder="우편번호">
<input type="button" onclick="execDaumPostcode()" value="우편번호 찾기"><br>
<input type="text" size="50" id="address" name="address" placeholder="주소" ><br>
<input type="text" width="110" id="address2" name="address2" placeholder="상세주소">
</td>


<tr>
<td><font size="4">핸드폰번호</font></td>
<td>
 <select name="mobile"><option>skt</option>
              <option>kt</option>
              <option>u+</option>
      </select>

<select name="phone"><option>010</option>
              <option>011</option>
              <option>016</option>
              <option>017</option>
      </select>
<input type="text" name="phone2">-<input type="text" name="phone3" >   
 </td>
 </tr>     

<tr ><td colspan="3" align="center" >
<input type="submit" value="확인">
<input type="button" value="취소" onclick="window.location='main.mall'">
</tr></td>



</table>
</form>
</body>
