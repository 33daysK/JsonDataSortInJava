
import java.util.Scanner;

/**  
 *  UserInput�N���X�ł��BcheckInt �� checkBoolean �̓�̃��\�b�h������܂��B
 *  
 *  @auther:33daysK
 *  @version �o�[�W����1.0 2020/03/17
 *  Scanner���o�������͒����Ȃ邽�߃��C���ɏ��������Ȃ��̂ŕ������܂����B
 *  ����ɂ��łɓ��͓��e�̊m�F�������ŏ������Ă܂�
 *  Scanner��trycatch���Ă�̂�nextInt��String���ٕ̈����������Ƃ��̑΍�ł�
 */

public class UserInput{
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
        // check�̏����l��-1�Ȃ̂ł������͂��Ȃ��Ă������ŃG���[�ɂȂ�܂��B
        if(check < 0 || maxNum < check){
            System.out.println("���͓��e���s���ł�");
            System.exit(0);
        }
        
        return check;
    }

    public static boolean checkBoolean(){
        int check = -1;
        
        try{
            Scanner scanner = new Scanner(System.in);
            check = scanner.nextInt();
        }catch(Exception e){
            System.out.println("���͓��e���s���ł�");
            System.exit(0);
        }
        
        // �قڃK�[�h�߂ł��B
        if(check != 0 && check != 1){
            System.out.println("���͓��e���s���ł�");
            System.exit(0);
        }

        // check���O���P�������Ŕ��f���Ă����̂łO�Ȃ�true
        // ����ȊO=�P�Ȃ�false��Ԃ����̕��������S�Ɏg���܂�
        return (check == 0);
    }
}


