
import java.util.List;

/**  
 *  ここがメインクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/17
 *  ユーザがソート方法を選んで、読み込んだデータをソートします。
 *  ソートしたデータはJSON形式ファイルと画面に出力します。
 *  メイン部分はなるべく簡潔にしたかったのでほとんどの操作はほかのクラスが担当しています。
 */

public class JsonSortMain{
    public static void main(String[] args){
        
        // 起動時オプションがあればここで判定。現在オプションは一つまで。
        if (args.length == 1){
            String option = args[0];
            Option.output(option);
        }
        
		//  項目を追加したらInputを変更すること
		System.out.println("並べ替えたい項目は何ですか？");
		System.out.print("[0:番号 1:クラス 2:年齢 3:点数] > ");
		int selectItem = Input.checkInt(3);

		System.out.println("並べ替え種別を指定してください");
		System.out.print("[0:昇順 1:降順] > ");
        boolean trueAscending = Input.checkBoolean();
        
        // JSONファイルの処理をするメソッドに入力項目を引き渡す
        // 以降の操作はすべてDataOperationクラスに行わせている
        DataOperation.json(selectItem, trueAscending);
        
    }
}


