//Hanbaikakakuを継承する
public class Zeikomi extends Hanbaikakaku{

    //getKakakuをオーバーライドする
    public void getKakaku(int kingaku){

        //Zeirituから税率を取得
        Zeiritu zeiritu = new Zeiritu();
        double zei = zeiritu.getZei();

        //税込み価格を計算する
        double zeikomi = kingaku + (kingaku * zei);
        //小数点以下を切り捨てる
        zeikomi = Math.floor(zeikomi);
        //整数（int型）に変換する
        int zeikomiSeisuu = (int) zeikomi;

        //税込み価格を文字列に変換する
        String hanbaikakaku = String.valueOf(zeikomiSeisuu);

        //表示
        System.out.println("商品の販売価格は" + hanbaikakaku + this.TUUKA + "です。");
    }
}