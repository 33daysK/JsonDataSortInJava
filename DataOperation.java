/*
 * データファイルの中身の実質的な操作を担っている。
 * データはInputFileクラスのjsonメソッドから受け取ったもの。
 */
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**  
 *  DataOperationクラスです。 メソッドはjsonのみ。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/17
 *  InputFileクラスから受け取ったJSONObjectをStudent型のリストの形まで変換します。
 *  そのリストをソートしてソート済みのリストを出力のためにOutputFileに渡します。
 *  
 */

public class DataOperation{
    public static void json(int selectItem, boolean trueAscending) {
        // InputFile.json()でjsonデータの中身をjsonオブジェクトとして取得
        JSONObject jtest = InputFile.json();

        // datas:[{no,name,...}{no,name,...}]をdatasをキーとした配列として処理
        JSONArray datasArray = jtest.getJSONArray("datas");
            
        JSONObject studentObject = new JSONObject();
        List<Student> studentList = new ArrayList<Student>();
        
        // for文で一つのデータのまとまり（＝　一人の生徒）ごとにデータを読み込みます。
        for (int i = 0; i<datasArray.length(); i++){
            studentObject = datasArray.getJSONObject(i);

            Student students = new Student();
            students.setNo(studentObject.getString("no"));
            students.setName(studentObject.getString("name"));
            students.setKurasu(studentObject.getString("kurasu"));
            students.setAge(studentObject.getInt("age"));
            students.setVal(studentObject.getInt("val"));
            studentList.add(students);
        }

        // switch文で分岐を決定してソートしています
        // ソートされたリストとfilenameの二つを最終的に一番下の行でOutputFileに渡しています。
        String fileName = "";
        switch(selectItem){
            case 0:
                Collections.sort(studentList, new ComparatorNo());
                fileName = "番号昇順";
                if(!(trueAscending)){
                    Collections.reverse(studentList);
                    fileName = "番号降順";
                }
                for (Student s : studentList) {
                    System.out.println(s);
                }
                break;
            case 1:
                Collections.sort(studentList, new ComparatorKurasu());
                fileName = "クラス昇順";
                if(!(trueAscending)){
                    Collections.reverse(studentList);
                    fileName = "クラス降順";
                }
                for (Student s : studentList) {
                    System.out.println(s);
                }
                break;
            case 2:
                Collections.sort(studentList, new ComparatorAge());
                fileName = "年齢昇順";
                if(!(trueAscending)){
                    Collections.reverse(studentList);
                    fileName = "年齢降順";
                }
                for (Student s : studentList) {
                    System.out.println(s);
                }
                break;
            default:
                Collections.sort(studentList, new ComparatorVal());
                fileName = "年齢昇順";
                if(!(trueAscending)){
                    Collections.reverse(studentList);
                    fileName = "年齢降順";
                }
                for (Student s : studentList) {
                    System.out.println(s);
                }
        }
        // ソート済みのリストとファイル名を出力するクラスに渡します。
        OutputFile.json(fileName, studentList);
    }
}