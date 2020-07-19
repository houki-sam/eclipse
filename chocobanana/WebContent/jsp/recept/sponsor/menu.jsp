<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! String title_name="協賛企業一覧"; %>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/common/jsp/head.jsp" %>
</head>
<body>
	<%@ include file="/common/jsp/nav.jsp" %>
	<div class="container">
		<div class="row">
		  	<div class="col-10">
		  		<h1>協賛企業一覧</h1>
		  	</div>
			<div class="col-2">
				<div class="mr-auto"></div>
				<div>
				    <a href="./sponsor/register"><button class="btn btn-primary float-right">新規登録</button></a><br>
				</div>
			</div>
		</div>
		<table>
			<table class="table table-striped">
				<thead>
				<tr>
					<th scope="col">協賛企業番号</th>
					<th scope="col">協賛企業名</th>
					<th scope="col"></th>
					<th scope="col"></th>
				</tr>
				</thead>
				<tbody>
				<tr>
					<td>1</td>
					<td>ロータス自動車</td>
					<td><a href="./detail.html"><button type="button" class="btn btn-warning">詳細</button></a></td>
					<td><a href="./delete.html"><button type="button" class="btn btn-danger">削除</button></a></td>
				</tr>
				<tr>
					<td>2</td>
					<td>KDDI</td>
					<td><a href="./detail.html"><button type="button" class="btn btn-warning">詳細</button></a></td>
					<td><button type="button" class="btn btn-danger">削除</button></td>
				</tr>
				</tbody>
			</table>
		</table>
		<hr>
		<a href="./sponsor/register">新規登録へ</a><br>
		<a href="/chocobanana/recept/menu">戻る</a>
	</div>
</body>
</html>