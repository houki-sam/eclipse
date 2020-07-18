<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String title_name = "詳細設定" ;%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/common/jsp/head.jsp" %>
</head>
<body>
	<%@ include file="/common/jsp/nav.jsp" %>
	<div class="container">
		<h1>詳細設定管理メニュー</h1>
		<hr>
		<div class="row">
			<div class="col-3">
				<div class="card" >
					<a href="./tax/menu.html">
						<div class="card-body">
						<h4 class="card-title">税率変更</h5>
						</div>
					</a>
				</div>
			</div>
		</div>
		<hr>
		<a href="/chocobanana/"><p>トップページへ</p></a>
	</div>
</body>
</html>