
/**  
 *  Optionクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/17
 *  Optionの追加が簡単にできるようにswitch文を使用しました。
 */

public class Option{
    public static void output(String option){
        
        switch(option){
        case "-help":
            System.out.println("アプリケーション「JsonSort」は、CSV形式のファイル内の情報を入力キーを元に並べ替えて結果を表示します。\n");
            break;
        default:
            System.exit(0);
        }
        
    }
    
}


