//���ۃN���X
public abstract class AbstractPerson {
    //���ۃ��\�b�h(�q�N���X�ŃI�[�o�[���C�h���ď����𖾋L����)
    abstract protected String getGender();

    public void speak(){
        System.out.println("I'm a " + getGender());
    }
}