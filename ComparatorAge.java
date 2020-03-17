import java.util.Comparator;

/**  
 *  ComparatorAgeクラスです。 Comparator<Student>を拡張しています。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/17
 *  ソート実行のための比較部分のメソッドです。
 *  Collection.sort()を使うために必要な設定になっています。
 *  生徒の年齢の部分を比較しています。
 */

public class ComparatorAge implements Comparator<Student>{
    public int compare (Student number1, Student number2){
        int age1 = number1.getAge(); 
        int age2 = number2.getAge();

        if (age1 > age2){
            return 1;
        }else if (age1 < age2){
            return -1;
        }
        return 0;
    }
}
