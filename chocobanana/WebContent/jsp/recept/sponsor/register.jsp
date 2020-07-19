<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! String title_name="協賛企業登録"; %>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/common/jsp/head.jsp" %>
</head>
<body>
	<%@ include file="/common/jsp/nav.jsp" %>
	<div class="container">
		<h1>協賛企業登録</h1>

		<hr>

		<form action="/chocobanana/recept/sponsor/register/confirm" method="POST">
			<div class="card mb-3">
			<div class="card-header">
				基本情報登録<font color="red">（必須）</font>
			</div>
	  			<div class="card-body">
					<div class="form-group">
						<label for="kyosankigyomei_kanji">協賛企業名（漢字）</label>
						<input type="text" maxlength="50" name="kyosankigyomei_kanji" value="" class="form-control" required>
					</div>
					<div class="form-group group">
						<label for="kigyomei_kana">協賛企業名（カナ）</label>
						<input type="text" maxlength="50" name="kyosankigyomei_kana" value="" class="form-control" required>
					</div>
					<div class="form-group">
						<label for="yubinbango">郵便番号(ハイフンなし)</label>
						<input type="tel" maxlength="7" name="seikyuyubinbango" value="" class="form-control" required>
					</div>
					<div class="form-group">
						<label for="zyusyo">住所</label>
						<input type="text" maxlength="100" name="seikyusakizyusyo" value="" class="form-control" required>
					</div>
					<div class="form-group">
						<label for="denwabango">電話番号</label>
						<input type="tel" maxlength="11" name="seikyusakidenwabango" value="" class="form-control" required>
					</div>
					<div class="form-group">
						<label for="kyuryo">給料支給日</label>
						<select name="kyuryoshikyubi" class="form-control">
							<option disabled selected>給料支給日を選んでください。</option>
							<option value="15">15</option>
							<option value="20">20</option>
							<option value="25">25</option>
							<option value="0">その他</option>
						</select>
					</div>
					<div class="form-group">
						<label for="hoka">給料支給日（その他）</label>
						<input type="tel" maxlength="2" name="hoka" value="" class="form-control">
					</div>
				 </div>
			</div>

			<div class="row">
				<div class="col-6">
					<div class="card">
						<div class="card-header">
							担当者登録<font color="red">（必須）</font>
						</div>
			  			<div class="card-body">
							<div class="form-group">
								<label for="tantobusyo">担当部署</label>
								<input type="text" maxlength="30" name="tantobusyo" value="" class="form-control" required>
							</div>
							<div class="form-group">
								<label for="tantosyamei_kanji">担当者名（漢字）</label>
								<input type="text" maxlength="50" name="tantosyamei_kanji" value="" class="form-control" required>
							</div>
							<div class="form-group">
								<label for="tantosyamei_kana">担当者名（カナ）</label>
								<input type="text" maxlength="50" name="tantosyamei_kana" value="" class="form-control" required>
							</div>
							<div class="form-group">
								<label for="tantosyadenwabango">担当者電話番号</label>
								<input type="text" maxlength="11" name="tantosyadenwabango" value="" class="form-control" required>
							</div>
						 </div>
					</div>
				</div>
				<div class="col-6">
					<div class="card">
						<div class="card-header">
							振込口座登録<font color="red">（必須）</font>
						</div>
			  			<div class="card-body">

							<div class="form-group">
								<label for="ginko">銀行名</label>
								<input type="text" maxlength="50" name="kyosankigyohurikomiginko" value="" class="form-control" required>
							</div>
							<div class="form-group">
								<label for="ginkositenmei">支店名</label>
								<input type="text" maxlength="50" name="kyosankigyohurikomiginkoshitenmei" value="" class="form-control" required>
							</div>
							<div class="form-group">
								<label for="kozasyubetsu">口座種別</label><br>
								  <select name="kyosankigyokozasyubetsu" class="form-control" required>
									<option selected disabled>口座種別を選んでください</option>
									<option value="1">当座</option>
									<option value="0">普通</option>
									</select>
							</div>
							<div class="form-group">
								<label for="kyosankigyokozabango">口座番号</label>
								<input type="tel" maxlength="50" name="kyosankigyokozabango" value="" class="form-control" required>
							</div>
						</div>
					</div>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-12"><button type="submit" class="btn btn-info float-right">登録</button></div>

			</div>

		</form>
		<hr>
		<a href="../menu.html">注文受付担当メニューへ</a><br>
		<a href="./sponsor.html">戻る</a><br>

	</div>

</body>
</html>