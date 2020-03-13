import java.io.*;
import org.json.JSONObject;

public class InputFile{
 
    public static JSONObject json(){
        
        // ファイルのパスを指定する
        File file = new File("C:\\Users\\WISS1_0081\\Desktop\\Sasada\\研修\\JAVA\\kensyu\\json\\TestJson.json");
        
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