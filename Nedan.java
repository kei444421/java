public class Nedan{
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("�������������ߏ������I�����܂��B");
            return;
        }

        //�����𕶎��񂩂琔�l�ɕϊ�
        int syouhinkakaku = Integer.parseInt(args[0]);

        //�ō��݉��i��\������
        Zeikomi zeikomi = new Zeikomi();
        zeikomi.getKakaku(syouhinkakaku);
    }
}