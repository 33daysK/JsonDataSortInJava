import java.util.Comparator;
/**  
 *  ComparatorNoクラスです。 Comparator<Student>を拡張しています。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/17
 *  ソート実行のための比較部分のメソッドです。
 *  Collection.sort()を使うために必要な設定になっています。
 *  生徒の番号の部分を比較しています。
 */

public class ComparatorNo implements Comparator<Student>{
    public int compare (Student number1, Student number2){
    	// 生徒の番号は0001の形を維持するためにString型にしています。
        String team1 = number1.getNo(); 
        String team2 = number2.getNo();
        
        if (team1.compareTo(team2)>0)
            return 1;
        if (team1.compareTo(team2)<0)
            return -1;
        return 0;
    }
}
