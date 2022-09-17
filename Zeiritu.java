//税率を取得するためのクラス
public class Zeiritu{

    //税率を定数(final)で定義
    //クラス内で参照する変数のためstatic宣言をつける
    final static double ZEIRITU = 0.1;

    //税率を返すメソッド
    public double getZei(){
        return ZEIRITU;
    }
}