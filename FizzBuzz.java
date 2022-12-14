public class FizzBuzz {
	public static void main(String[] args) {
        //引数の数が0個だったら
		if (args.length == 0) {
            //処理を終了する
			return;
		}
		//args[0]の値を文字列から数値に変換してmaxに格納する
		int max = Integer.parseInt(args[0]);
		String result = null;
        
		//for文でループ処理
		for (int i = 0; i < max; i++) {
			int num = i + 1;

            //resultの中身を空にする
			result = "";

			//もしも3で割り切れたらFizzをresultに格納する
			if (num % 3 == 0) {
				result = result + "Fizz";
			}
			//もしも5で割り切れたらBuzzをresultに格納する
			if (num % 5 == 0) {
				result = result + "Buzz";
			}
			if (result.length() == 0) {
				result = result + num;
			}
			System.out.print(result + " ");
		}
	}
}
