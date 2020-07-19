package beans;

import javax.servlet.http.HttpServletRequest;

public class KyosankigyoBeans implements java.io.Serializable{

	//格納変数
	private int kyosankigyoID;//協賛企業ID
	private String kyosankigyomei_kanji;//協賛企業名（漢字)
	private String kyosankigyomei_kana;//協賛企業名（カナ)
	public String seikyuyubinbango;//請求先郵便番号
	private String seikyusakizyusyo;//請求先住所
	private String seikyusakidenwabango;//請求先電話番号
	private String tantobusyo;//担当部署
	private String tantosyamei_kanji;//担当者名（漢字）
	private String tantosyamei_kana;//担当者名（カナ）
	private String tantosyadenwabango;//担当者電話番号
	private int kyuryoshikyubi;//給料支給日
	private int hoka;//給料支給日他
	private String kyosankigyohurikomiginko;//協賛企業銀行名
	private String kyosankigyohurikomiginkoshitenmei;//協賛企業銀行支店名
	private String kyosankigyokouzasyubetsu;//協賛企業講座種別
	private String kyosankigyokozabango;//協賛企業口座番号


	public KyosankigyoBeans() {
	}


	public void setSeikyuyubinbango(String name) {
		seikyuyubinbango = name;
	}

	public String getSeikyuyubinbango() {
		return seikyuyubinbango;
	}


	public String extract(HttpServletRequest req, String name) {
		return (String)req.getAttribute(name);
	}

}
