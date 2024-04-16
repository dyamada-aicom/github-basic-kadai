package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	//コントラクタ
	public Dictionary_Chapter21() {
		
	}
	
	//ハッシュマップ宣言
	public HashMap<String, String> dict = new HashMap<String, String>();{
		
		dict.put("apple", "りんご");
		dict.put("peach", "桃");
		dict.put("banana", "バナナ");
		dict.put("lemon", "レモン");
		dict.put("pear", "梨");
		dict.put("kiwi", "キウィ");
		dict.put("strawberry", "いちご");
		dict.put("grape", "ぶどう");
		dict.put("muscat", "マスカット");
		dict.put("cherry", "さくらんぼ");
	}
	
	//意味を調べて出力するメソッド
	public void check(String eng) {
		if(dict.get(eng) != null) {
			System.out.println(eng + "の意味は" + dict.get(eng) );
		}else{
			System.out.println(eng + "は辞書に存在しません");
		}	
	}
	

}
