import org.json.JSONObject;
import org.json.JSONArray;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.BufferedWriter;

/**  
 *  OutputFileクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/17
 *  
 */

public class OutputFile{
    public static void json(String filename, List<Student> studentsList) {
        
        // 受け取ったソート済みのリストをJsonArrayに入れる
        JSONArray jsonArrayofStudents = new JSONArray(studentsList);

        // 出力用のJSONObject
        // 与えられたJSONファイルがdatas:[１まとまりのJSONArray]の形だったので合わせています。
        JSONObject outputdata = new JSONObject();
        outputdata.put("datas",jsonArrayofStudents);
        
        String jsonFileName = filename + ".json";
        
        // BufferedWriter <- OutputStreamWriter <- FileOutputStream <- File
        // という流れでBufferedWriterを使っています。
        try {
            File f = new File(jsonFileName);
            OutputStreamWriter osw  = new OutputStreamWriter(new FileOutputStream(f), "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
       
            bw.write(outputdata.toString());
       
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}