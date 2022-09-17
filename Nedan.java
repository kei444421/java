public class Nedan{
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("引数が無いため処理を終了します。");
            return;
        }

        //引数を文字列から数値に変換
        int syouhinkakaku = Integer.parseInt(args[0]);

        //税込み価格を表示する
        Zeikomi zeikomi = new Zeikomi();
        zeikomi.getKakaku(syouhinkakaku);
    }
}