import java.util.Comparator;

/**  
 *  ComparatorValクラスです。 Comparator<Student>を拡張しています。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/17
 *  ソート実行のための比較部分のメソッドです。
 *  Collection.sort()を使うために必要な設定になっています。
 *  生徒の点数の部分を比較しています。
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
