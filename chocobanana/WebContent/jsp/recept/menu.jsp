<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! String title_name="請求確認"; %>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/common/jsp/head.jsp" %>
</head>
<body>
	<%@ include file="/common/jsp/nav.jsp" %>
	<div class="container">
		<h1>注文受付担当メニュー</h1>
		<hr>
		<div class="row">
			<div class="col-3">
				<div class="card" >
					<a href="./member/member.html">
						<div class="card-body">
						<h4 class="card-title">会員一覧</h5>
						</div>
					</a>
				</div>
			</div>

			<div class="col-3">
				<div class="card" >
					<a href="./sponsor/sponsor.html">
						<div class="card-body">
						<h4 class="card-title">協賛企業一覧</h4>
						</div>
					</a>
				</div>
			</div>

			<div class="col-3">
				<div class="card" >
					<a href="./product/product.html">
						<div class="card-body">
						<h4 class="card-title">商品一覧</h4>
						</div>
					</a>
				</div>
			</div>

			<div class="col-3">
				<div class="card">
					<a href="./reception/reception.html">
						<div class="card-body">
						<h4 class="card-title">注文一覧</h4>
						</div>
					</a>
				</div>
			</div>
		</div>
		<hr>
		<a href="/chocobanana/">トップページへ</a>
	</div>
</body>
</html>