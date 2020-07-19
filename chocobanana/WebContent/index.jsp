<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String title_name = "はるみ通信販売" ;%>
<%  %>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/common/jsp/head.jsp" %>
</head>
<body>
    <%@ include file="/common/jsp/nav_top.jsp" %>
    <div class="bg-sample">
	</div>

    <div class="container">
        <h1 class="mt-3">トップメニュー</h1>
        <hr>
        <%@ page import ="javax.servlet.http.HttpSession" %>
		<% HttpSession session2 = request.getSession(false);
            		if((String)request.getRemoteUser() == null) {%>
        	<div class="col-12">
 				<a href="/chocobanana/login/login">
                 	<button class="btn" style="background-color:#00336D;color: #fff;">ログイン</button>
               	</a>
		  <%} %>
        <div class="row mb-5">
        <% if(request.isUserInRole("recept")){%>
        	<div class="col-3">
	            <div class="card">
					<div class="card-header">
						<a href="recept/menu"><h4>注文受付管理</h4></a>
					</div>
		  			<div class="card-body">
		  				・会員一覧<br>
		  				・協賛企業一覧<br>
		  				・商品一覧<br>
		  				・注文一覧
					</div>
				</div>
			</div>
		<%} if(request.isUserInRole("order")){%>
			<div class="col-3">
	            <div class="card">
					<div class="card-header">
						<a href="order/menu"><h4>発注</h4></a>
					</div>
		  			<div class="card-body">
		  				・契約店一覧<br>
		  				・発注一覧<br>
		  				・依頼請書一覧<br>
						<br>
					</div>
				</div>
			</div>
		<%} if(request.isUserInRole("money")){%>
			<div class="col-3">
	            <div class="card">
					<div class="card-header">
						<a href="money/menu"><h4>請求入金</h4></a>
					</div>
		  			<div class="card-body">
		  				・請求金額一覧<br>
		  				・支払金額一覧<br>
		  				<br>
		  				<br>

					</div>
				</div>
			</div>
		<%} if(request.isUserInRole("setting")){%>
			<div class="col-3">
	            <div class="card">
					<div class="card-header">
						<a href="/chocobanana/setting/menu"><h4>詳細設定</h4></a>
					</div>
		  			<div class="card-body">
		  				・税率変更<br><br>
		  				<br>
		  				<br>
					</div>
				</div>
			</div>
		<%} %>
		</div>

    </div>
</body>
</html>