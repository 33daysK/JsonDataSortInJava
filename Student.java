/*  
 *  
 *  
 */
public class Student{
    private String no;
    private String name;
    private String kurasu;
    private int age;
    private int val;
    final String FORMAT_NO = "%-8s";
    final String FORMAT_OTHER = "%-5s %3d歳 %4d点";
    
    public Student(){}
    
    public Student(String n,String na,String ku,int a, int v){
        this.no = n;
        this.name = na;
        this.kurasu = ku;
        this.age = a;
        this.val = v;
    }
    
    public String getNo(){
        return this.no;
    }
    public String getName(){
        return this.name;
    }
    public String getKurasu(){
        return this.kurasu;
    }
    public int getAge(){
        return this.age;
    }
    public int getVal(){
        return this.val;
    }
    
    public void setNo(String s){
        this.no = s;
    }
    public void setName(String s){
        this.name = s;
    }
    public void setKurasu(String s){
        this.kurasu = s;
    }
    public void setAge(int i){
        this.age = i;
    }
    public void setVal(int i){
        this.val = i;
    }
    // 日本語が混じるとフォーマットできないため対策のメソッド
    // 空白を文字数分上下させて吸収しています
    private static String formatName(String nihongo, int length){
        int nameLength = nihongo.length();
        return String.format("%-"+(length-nameLength)+"s", nihongo);
    }
    
    public String toString(){
        String formatstr = String.format(FORMAT_NO, this.no);
        
        // 名前対策
        formatstr += formatName(this.name, 22);
        
        formatstr += String.format(FORMAT_OTHER, this.kurasu, this.age, this.val);
        return formatstr;
    }


}

