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
		<h1>発注担当メニュー</h1>
		<hr>
		<div class="row">
			<div class="col-3">
				<div class="card" >
					<a href="./supplier/supplier.html">
						<div class="card-body">
						<h4 class="card-title">契約店一覧</h4>
						</div>
					</a>
				</div>
			</div>

			<div class="col-3">
				<div class="card" >
					<a href="./order/order_menu.html">
						<div class="card-body">
						<h4 class="card-title">発注一覧</h4>
						</div>
					</a>
				</div>
			</div>
			<div class="col-3">
				<div class="card" >
					<a href="./confirmation/confirmation.html">
						<div class="card-body">
						<h4 class="card-title">依頼請書一覧</h4>
						</div>
					</a>
				</div>
			</div>

		</div>
		<hr>
		<a href="../index.html">トップページ</a>へ
	</div>
</body>
</html>