import java.util.Comparator;

/**  
 *  ComparatorKurasuクラスです。 Comparator<Student>を拡張しています。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/17
 *  ソート実行のための比較部分のメソッドです。
 *  Collection.sort()を使うために必要な設定になっています。
 *  生徒のクラスの部分を比較しています。
 */

public class ComparatorKurasu implements Comparator<Student>{
    public int compare (Student number1, Student number2){
        String team1 = number1.getKurasu(); 
        String team2 = number2.getKurasu();
        
        if (team1.compareTo(team2)>0)
            return 1;
        if (team1.compareTo(team2)<0)
            return -1;
        return 0;
    }
}
