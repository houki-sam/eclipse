<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String a = (String)request.getAttribute("a"); %>
<%! String title_name="協賛企業登録確認"; %>
<jsp:useBean id="data" type="beans.KyosankigyoBeans" class="beans.KyosankigyoBeans" scope="request"/>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/common/jsp/head.jsp" %>
</head>
<body>
	<%@ include file="/common/jsp/nav.jsp" %>
	<div class="container">
		<h1>協賛企業登録確認</h1>
		<hr>
		<div class="card mb-3">
			<div class="card-header">
				基本情報
			</div>
			<div class="card-body">
			<table id="productSizes" class="table table-bordered">
				<tbody>
					<tr class="d-flex">
							<td class="col-3">協賛企業名（漢字）</td>
							<td class="col-9"><jsp:getProperty property="seikyuyubinbango" name="data"/><%= a %></td>

						</tr>
						<tr class="d-flex">
							<td class="col-3">協賛企業名（カナ）</td>
							<td class="col-9">ロータスジドウシャ</td>
						</tr>
						<tr class="d-flex">
							<td class="col-3">郵便番号</td>
							<td class="col-9">1234567</td>
						</tr>
						<tr class="d-flex">
							<td class="col-3">住所</td>
							<td class="col-9">東京都府中市日鋼町1-19</td>
						</tr>
						<tr class="d-flex">
							<td class="col-3">電話番号</td>
							<td class="col-9">042-351-1111</td>
						</tr>
						<tr class="d-flex">
							<td class="col-3">給料支給日</td>
							<td class="col-9">25</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-6">
				<div class="card">
					<div class="card-header">
						担当者
					</div>
					<div class="card-body">
						<table id="productSizes" class="table table-bordered">
							<tbody>
								<tr class="d-flex">
									<td class="col-5">担当部署</td>
									<td class="col-7">経理</td>
								</tr>
								<tr class="d-flex">
									<td class="col-5">担当者名（漢字）</td>
									<td class="col-7">安田一太郎</td>
								</tr>
								<tr class="d-flex">
									<td class="col-5">担当者名（カナ）</td>
									<td class="col-7">ヤスダイチタロウ</td>
								</tr>
								<tr class="d-flex">
									<td class="col-5">担当者電話番号</td>
									<td class="col-7">042-351-1111</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>

			<div class="col-6">
				<div class="card">
					<div class="card-header">
						振込口座
					</div>
					<div class="card-body">
						<table id="productSizes" class="table table-bordered">
							<tbody>

								<tr class="d-flex">
									<td class="col-5">振込銀行</td>
									<td class="col-7">みずほ銀行</td>
								</tr>
								<tr class="d-flex">
									<td class="col-5">振込銀行支店名</td>
									<td class="col-7">府中</td>
								</tr>
								<tr class="d-flex">
									<td class="col-5">振込銀行口座種別</td>
									<td class="col-7">当座</td>
								</tr>
								<tr class="d-flex">
									<td class="col-5">振込銀行口座番号</td>
									<td class="col-7">1587986</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
		<hr>
		<div class="row">
		  	<div class="col-10">
		  	</div>
			<div class="col-2">
		    <a href="./register_result.html"><button type="button" class="btn btn-info">確定</button></a>
			<a href="./register.html"><button type="button" class="btn btn-danger">戻る</button></a>
			</div>
		</div>
	</div>
</body>
</html>