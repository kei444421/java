//Hanbaikakaku���p������
public class Zeikomi extends Hanbaikakaku{

    //getKakaku���I�[�o�[���C�h����
    public void getKakaku(int kingaku){

        //Zeiritu����ŗ����擾
        Zeiritu zeiritu = new Zeiritu();
        double zei = zeiritu.getZei();

        //�ō��݉��i���v�Z����
        double zeikomi = kingaku + (kingaku * zei);
        //�����_�ȉ���؂�̂Ă�
        zeikomi = Math.floor(zeikomi);
        //�����iint�^�j�ɕϊ�����
        int zeikomiSeisuu = (int) zeikomi;

        //�ō��݉��i�𕶎���ɕϊ�����
        String hanbaikakaku = String.valueOf(zeikomiSeisuu);

        //�\��
        System.out.println("���i�̔̔����i��" + hanbaikakaku + this.TUUKA + "�ł��B");
    }
}