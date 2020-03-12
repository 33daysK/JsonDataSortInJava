/*  JSONデータを読み込んできて書き出すプログラムです。
 *  JSONOblectを利用しています。
 *  このメイン部分はできるだけ簡素なつくりにするためにメソッドなどはすべて切り分けています。
 */
import java.util.List;

public class JsonSort{
    public static void main(String[] args){
        
        if (args.length == 1){
            String option = args[0];
            Option.output(option);
        }
        
		//  項目を追加したら変更すること
		System.out.println("並べ替えたい項目は何ですか？");
		System.out.print("[0:番号 1:クラス 2:年齢 3:点数] > ");
		int selectItem = Input.checkInt(3);

		//  項目を追加したら変更すること
		System.out.println("並べ替え種別を指定してください");
		System.out.print("[0:昇順 1:降順] > ");
        boolean trueAscending = Input.checkBoolean();
        
        // JSONファイルの処理をするメソッドに入力項目を引き渡す
        DataOperation.json(selectItem, trueAscending);
        
    }
}


