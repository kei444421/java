public class Man extends AbstractPerson{
    //親クラスの抽象メソッドをオーバーライドする
    @Override
    protected String getGender(){
        return "man";
    }
}