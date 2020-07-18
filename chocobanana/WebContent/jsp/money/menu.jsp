<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! String title_name="発注"; %>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/common/jsp/head.jsp" %>
</head>
<body>
	<%@ include file="/common/jsp/nav.jsp" %>
	<div class="container">
		<h1>請求入金担当メニュー</h1>
		<hr>
		<div class="row">
			<div class="col-3">
				<div class="card" >
					<a href="./invoice/invoice.html">
						<div class="card-body">
							<h4 class="card-title">請求金額一覧</h4>
						</div>
					</a>
				</div>
			</div>

			<div class="col-3">
				<div class="card" >
					<a href="./payment/payment.html">
						<div class="card-body">
							<h4 class="card-title">支払金額一覧</h4>
						</div>
					</a>
				</div>
			</div>
		</div>
		<hr>
		<a href="../index.html">トップページへ</a><br>
	</div>
</body>
</html>