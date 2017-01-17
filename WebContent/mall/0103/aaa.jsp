<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

     
                document.getElementById('postcode').value = data.zonecode; 
                document.getElementById('address').value = fullAddr;   
                document.getElementById('address2').focus();
                
            }
        }).open();
    }
</script>






    
<input type="text" id="postcode" placeholder="우편번호">
<input type="button" onclick="execDaumPostcode()" value="우편번호 찾기"><br>
<input type="text" id="address" placeholder="주소">
<input type="text" id="address2" placeholder="상세주소">
