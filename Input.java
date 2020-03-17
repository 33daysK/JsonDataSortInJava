/*
 * Scannerを出す処理は長くなるためメインに書きたくないので分割したメソッド
 * さらについでに入力内容の確認もここで処理してます
 * ScannerをtrycatchしてるのはintにString等の異物が入ったときの対策です
 */
import java.util.Scanner;

public class Input{
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
        if(check < 0 || maxNum < check){
            System.out.println("入力内容が不正です");
            System.exit(0);
        }
        
        return check;
    }
    public static boolean checkBoolean(){
        int check = -1;
        boolean answer = false;
        
        try{
            Scanner scanner = new Scanner(System.in);
            check = scanner.nextInt();
        }catch(Exception e){
            System.out.println("入力内容が不正です");
            System.exit(0);
        }
        
        if(check != 0 && check != 1){
            System.out.println("入力内容が不正です");
            System.exit(0);
        }
        return (check == 0);
    }
}


