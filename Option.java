/*
 * オプション追加が簡単にできるようにしています
 */
public class Option{
    public static void output(String args){
        String option = "";
        option = args;
        
        switch(option){
        case "-help":
            System.out.println("アプリケーション「JsonSort」は、CSV形式のファイル内の情報を入力キーを元に並べ替えて結果を表示します。\n");
            break;
        default:
            System.exit(0);
        }
        
    }
    
}


