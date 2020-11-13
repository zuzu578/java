<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--<form method="get" action="MethodServlet" id="frmSignin"> -->
 <table>
   <tr><td align=right>아이디</td><td><input type=text name=userid size=12></td>
   <tr><td align=right>비밀번호</td><td><input type=text name=passwd size=12></td>
  
   </td>
   
   </table>
 
  <input type="button" id="btnLogin" value="Login">

</body>

<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script>
//AJAX
$(document)
.on('click','#btnLogin',function(){
	 $.post("MethodServlet",
	    		{userid:$('input[name=userid]').val(),passwd:$('input[name=passwd]').val()},
	    		function(txt){
	    	 	  alert(txt)
	    		  },
	    	'text');
	
    })
    //get방식을 사용하는 또다른 방법(객체 형태로 데이터 보내기)
	//형식
	
 
    //.fail(function(){})//실패할때 실행//
    //.always(function(){})//성공 했던 실패했던 실행// 
    
    //post 방식//
	//$.post("MethodServlet",{userid:$('input[name=userid]').val(),passwd:$('input[name=psswd]').val()})
	//function(txt){
  	//alert(txt)
	//},'text');//
	//.done(function(){})//성공하면 실행
	//.fail(function(){})//실패할때 실행//
	//.always(function(){})//성공 했던 실패했던 실행// 
	// error : fail ==>always//
	// no error : function ==>done ==> always//


</script>
</html>