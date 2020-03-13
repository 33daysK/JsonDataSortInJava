import org.json.JSONObject;
import org.json.JSONArray;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.BufferedWriter;

public class OutputFile{
    public static void json(String filename, List<Student> studentsList) {
        JSONArray jsonArrayofStudents = new JSONArray(studentsList);
        JSONObject outputdata = new JSONObject();
        String jsonFileName = filename + ".json";
        
        outputdata.put("datas",jsonArrayofStudents);
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