/*
 * Scanner���o�������͒����Ȃ邽�߃��C���ɏ��������Ȃ��̂ŕ����������\�b�h
 * ����ɂ��łɓ��͓��e�̊m�F�������ŏ������Ă܂�
 * Scanner��trycatch���Ă�̂�int��String���ٕ̈����������Ƃ��̑΍�ł�
 */
import java.util.Scanner;

public class Input{
    public static int checkInt(int maxNum){
        int check = -1;
        
        try{
            Scanner scanner = new Scanner(System.in);
            check = scanner.nextInt();
        }catch(Exception e){
            System.out.println("���͓��e���s���ł�");
            System.exit(0);
        }
        // �������O�`�ő�l�͈̔͊O�ɂ�������G���[
        if(check < 0 || maxNum < check){
            System.out.println("���͓��e���s���ł�");
            System.exit(0);
        }
        
        return check;
    }
    public static boolean checkBoolean(){
        int check = -1;
        boolean answer = false;
        
        try{
            Scanner scanner = new Scanner(System.in);
            check = scanner.nextInt();
        }catch(Exception e){
            System.out.println("���͓��e���s���ł�");
            System.exit(0);
        }
        
        if(check != 0 && check != 1){
            System.out.println("���͓��e���s���ł�");
            System.exit(0);
        }
        return (check == 0);
    }
}


