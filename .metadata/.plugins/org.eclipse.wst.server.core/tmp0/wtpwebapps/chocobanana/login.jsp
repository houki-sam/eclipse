<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String title_name = "はるみ通信販売" ;%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/common/jsp/head.jsp" %>
</head>
<body>
<%@ include file="/common/jsp/nav.jsp" %>
<div class="container">
	<div class="row">
		<div class="col-3"></div>
		<div class="col-6">
			<div class="card">
				<div class="card-header">
					<h4>ログイン</h4>
				</div>
		  		<div class="card-body">
					<form class="form-signin" action="<%= response.encodeURL("j_security_check")%>" method="post">
						<label for="inputEmail" class="sr-only">Email address</label>
						<input type="text"  name="j_username" id="inputEmail" class="form-control mb-3" placeholder="ユーザーID" required="" autofocus="">
						<label for="inputPassword" class="sr-only">Password</label>
						<input type="password"  name="j_password" id="inputPassword" class="form-control" placeholder="パスワード" required="">
						<br>
						<button class="btn btn-lg btn-block" type="submit" style="background-color:#00336D;color: #fff;">サインイン</button>

					</form>
					<button class="btn btn-lg btn-block mt-3" type="submit" style="background-color:#4D9BE8;color: #fff;">戻る</button>
		       	</div>
		    </div>
		</div>
	</div>



</div>
</body>
</html>

