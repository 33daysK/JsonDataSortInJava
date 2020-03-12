import java.util.Comparator;

/* ソート実行のための比較部分のメソッド
 * クラス編
 * 
 */
public class ComparatorVal implements Comparator<Student>{
    public int compare (Student number1, Student number2){
        int val1 = number1.getVal(); 
        int val2 = number2.getVal();
        
        if (val1 > val2){
            return 1;
        }else if (val1 < val2){
            return -1;
        }
        return 0;
    }
}
