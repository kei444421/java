//抽象クラス
public abstract class AbstractPerson {
    //抽象メソッド(子クラスでオーバーライドして処理を明記する)
    abstract protected String getGender();

    public void speak(){
        System.out.println("I'm a " + getGender());
    }
}