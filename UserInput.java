
import java.util.Scanner;

/**  
 *  UserInputクラスです。checkInt と checkBoolean の二つのメソッドがあります。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/17
 *  Scannerを出す処理は長くなるためメインに書きたくないので分割しました。
 *  さらについでに入力内容の確認もここで処理してます
 *  ScannerをtrycatchしてるのはnextIntにString等の異物が入ったときの対策です
 */

public class UserInput{
    public static int checkInt(int maxNum){
        int check = -1;
        
        try{
            Scanner scanner = new Scanner(System.in);
            check = scanner.nextInt();
        }catch(Exception e){
            System.out.println("入力内容が不正です");
            System.exit(0);
        }
        
        // 数字が０～最大値の範囲外にあったらエラー
        // checkの初期値は-1なのでもし入力がなくてもここでエラーになります。
        if(check < 0 || maxNum < check){
            System.out.println("入力内容が不正です");
            System.exit(0);
        }
        
        return check;
    }

    public static boolean checkBoolean(){
        int check = -1;
        
        try{
            Scanner scanner = new Scanner(System.in);
            check = scanner.nextInt();
        }catch(Exception e){
            System.out.println("入力内容が不正です");
            System.exit(0);
        }
        
        // ほぼガード節です。
        if(check != 0 && check != 1){
            System.out.println("入力内容が不正です");
            System.exit(0);
        }

        // checkを０か１かだけで判断してきたので０ならtrue
        // それ以外=１ならfalseを返すこの方式も安全に使えます
        return (check == 0);
    }
}


