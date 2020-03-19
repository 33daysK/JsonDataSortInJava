import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

import org.json.JSONObject;

/**  
 *  InputFileクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/17
 *  ファイルを読み込んでデータを読み取り、JsonObjectの形にして返します。
 *  ファイルは相対指定しているのでjsonファイルはこのファイルと同じ階層に保存してください。
 */

public class InputFile{
 
    public static JSONObject json(){
        
        // ファイルのパスを指定する
        File file = new File("TestJson.json");
        
        // ファイルが存在しない場合に例外が発生するので確認する
        if (!file.exists()) {
            System.out.print("ファイルが存在しません");
            return null;
        }
        String jsonString = "";
        
        try (BufferedReader b_reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));){
            
            // BufferedReaderクラスのreadLineメソッドを使って1行ずつ読み込み保存する
            String data;
            while ((data = b_reader.readLine()) != null) {
                jsonString += data;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONObject jobj = new JSONObject(jsonString);
        return jobj;
    }
 
}