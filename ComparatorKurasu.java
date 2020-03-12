import java.util.Comparator;

/* ソート実行のための比較部分のメソッド
 * クラス編
 * 
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
