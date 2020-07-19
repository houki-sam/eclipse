package beans;

import javax.servlet.http.HttpServletRequest;

public class KyosankigyoBeans implements java.io.Serializable{

	//格納変数
	private int kyosankigyoID;//協賛企業ID
	private String kyosankigyomei_kanji;//協賛企業名（漢字)
	private String kyosankigyomei_kana;//協賛企業名（カナ)
	private String seikyuyubinbango;//請求先郵便番号
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
	private boolean kyosankigyokozasyubetsu;//協賛企業講座種別
	private String kyosankigyokozabango;//協賛企業口座番号
	private String accountString;


	public KyosankigyoBeans() {
	}

	//協賛企業名（漢字)
	public void setKyosankigyomei_kanji(String name) {kyosankigyomei_kanji=name;}
	public String getKyosankigyomei_kanji() {return kyosankigyomei_kanji;}

	//協賛企業名（漢字)
	public void setKyosankigyomei_kana(String name) {kyosankigyomei_kana=name;}
	public String getKyosankigyomei_kana() {return kyosankigyomei_kana;}


	//請求先郵便番号
	public void setSeikyuyubinbango(String name) {seikyuyubinbango = name;}
	public String getSeikyuyubinbango() {return seikyuyubinbango;}

	//請求先住所
	public void setSeikyusakizyusyo(String name) {seikyusakizyusyo = name;}
	public String getSeikyusakizyusyo() {return seikyusakizyusyo;}

	//請求先電話番号
	public void setSeikyusakidenwabango(String name) {seikyusakidenwabango = name;}
	public String getSeikyusakidenwabango() {return seikyusakidenwabango;}

	//担当部署
	public void setTantobusyo(String name) {tantobusyo = name;}
	public String getTantobusyo() {return tantobusyo;}

	//担当者名(漢字)
	public void setTantosyamei_kanji(String name) {tantosyamei_kanji = name;}
	public String getTantosyamei_kanji() {return tantosyamei_kanji;}

	//担当者名(カナ)
	public void setTantosyamei_kana(String name) {tantosyamei_kana = name;}
	public String getTantosyamei_kana() {return tantosyamei_kana;}

	//担当者電話番号
	public void setTantosyadenwabango(String name) {tantosyadenwabango = name;}
	public String getTantosyadenwabango() {return tantosyadenwabango;}

	//給与支給日
	public void setKyuryoshikyubi(int name) {kyuryoshikyubi = name;}
	public int getKyuryoshikyubi() {return kyuryoshikyubi;}

	//その他給与支給日
	public void setHoka(int name) {hoka = name;}
	public int getHoka() {return hoka;}


	//協賛企業振り込み銀行
	public void setKyosankigyohurikomiginko(String name) {kyosankigyohurikomiginko = name;}
	public String getKyosankigyohurikomiginko() {return kyosankigyohurikomiginko;}

	//協賛企業振り込み銀行支店
	public void setKyosankigyohurikomiginkoshitenmei(String name) {kyosankigyohurikomiginkoshitenmei = name;}
	public String getKyosankigyohurikomiginkoshitenmei() {return kyosankigyohurikomiginkoshitenmei;}

	//協賛企業講座種別
	public void setkyosankigyokozasyubetsu(boolean name) {kyosankigyokozasyubetsu = name;}
	public boolean getkyosankigyokozasyubetsu() {return kyosankigyokozasyubetsu;}
	public String getAccountString() {
		if(kyosankigyokozasyubetsu) {
			return "普通";
		}else {
			return "当座";
		}
	}

	//講座番号
	public void setKyosankigyokozabango(String name) {kyosankigyokozabango= name;}
	public String getKyosankigyokozabango() {return kyosankigyokozabango;}


	//requestからの一括登録メソッド
	public void setRequest(HttpServletRequest req) {
		setKyosankigyomei_kanji(extractString(req,"kyosankigyomei_kanji"));//協賛企業名（漢字)
		setKyosankigyomei_kana(extractString(req,"kyosankigyomei_kana"));//協賛企業名（カナ)
		setSeikyuyubinbango(extractString(req,"seikyuyubinbango"));//請求先郵便番号
		setSeikyusakizyusyo(extractString(req,"seikyusakizyusyo"));//請求先住所
		setSeikyusakidenwabango(extractString(req,"seikyusakidenwabango"));//請求先電話番号
		setTantobusyo(extractString(req,"tantobusyo"));//担当部署
		setTantosyamei_kanji(extractString(req,"tantosyamei_kanji"));//担当者名（漢字)
		setTantosyamei_kana(extractString(req,"tantosyamei_kana"));//担当者名（カナ）
		setTantosyadenwabango(extractString(req,"tantosyadenwabango"));//担当者電話番号
		setKyuryoshikyubi(extractInt(req, "kyuryoshikyubi"));//給与支給日
		setHoka(extractInt(req, "hoka"));//その他給与支給日
		setKyosankigyohurikomiginko(extractString(req,"kyosankigyohurikomiginko"));//協賛企業銀行名
		setKyosankigyohurikomiginkoshitenmei(extractString(req, "kyosankigyohurikomiginkoshitenmei"));//協賛企業銀行支店
		setkyosankigyokozasyubetsu(extractBoolean(req, "kyosankigyokozasyubetsu"));//協賛企業銀行種別
		setKyosankigyokozabango(extractString(req, "kyosankigyokozabango"));


	}

	//Object2
	public String extractString(HttpServletRequest req, String name) {
		return (String)req.getParameter(name);
	}

	public int extractInt(HttpServletRequest req, String name) {
		return Integer.parseInt(req.getParameter(name));
	}

	public boolean extractBoolean(HttpServletRequest req, String name) {
		return Boolean.parseBoolean(req.getParameter(name));
	}

}
