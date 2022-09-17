public class FizzBuzz {
	public static void main(String[] args) {
        //ˆø”‚Ì”‚ª0ŒÂ‚¾‚Á‚½‚ç
		if (args.length == 0) {
            //ˆ—‚ğI—¹‚·‚é
			return;
		}
		//args[0]‚Ì’l‚ğ•¶š—ñ‚©‚ç”’l‚É•ÏŠ·‚µ‚Ämax‚ÉŠi”[‚·‚é
		int max = Integer.parseInt(args[0]);
		String result = null;
        
		//for•¶‚Åƒ‹[ƒvˆ—
		for (int i = 0; i < max; i++) {
			int num = i + 1;

            //result‚Ì’†g‚ğ‹ó‚É‚·‚é
			result = "";

			//‚à‚µ‚à3‚ÅŠ„‚èØ‚ê‚½‚çFizz‚ğresult‚ÉŠi”[‚·‚é
			if (num % 3 == 0) {
				result = result + "Fizz";
			}
			//‚à‚µ‚à5‚ÅŠ„‚èØ‚ê‚½‚çBuzz‚ğresult‚ÉŠi”[‚·‚é
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
