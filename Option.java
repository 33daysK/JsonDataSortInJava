
/**  
 *  Option�N���X�ł��B
 *  
 *  @auther:33daysK
 *  @version �o�[�W����1.0 2020/03/17
 *  Option�̒ǉ����ȒP�ɂł���悤��switch�����g�p���܂����B
 */

public class Option{
    public static void output(String option){
        
        switch(option){
        case "-help":
            System.out.println("�A�v���P�[�V�����uJsonSort�v�́ACSV�`���̃t�@�C�����̏�����̓L�[�����ɕ��בւ��Č��ʂ�\�����܂��B\n");
            break;
        default:
            System.exit(0);
        }
        
    }
    
}


