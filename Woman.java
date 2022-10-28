public class Woman extends AbstractPerson{
    //親クラスの抽象メソッドをオーバーライドする
    @Override
    protected String getGender(){
        return "woman";
    }

}