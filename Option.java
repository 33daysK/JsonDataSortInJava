/*
 * �I�v�V�����ǉ����ȒP�ɂł���悤�ɂ��Ă��܂�
 */
public class Option{
    public static void output(String args){
        String option = "";
        option = args;
        
        switch(option){
        case "-help":
            System.out.println("�A�v���P�[�V�����uJsonSort�v�́ACSV�`���̃t�@�C�����̏�����̓L�[�����ɕ��בւ��Č��ʂ�\�����܂��B\n");
            break;
        default:
            System.exit(0);
        }
        
    }
    
}


