public class FizzBuzz {
	public static void main(String[] args) {
        //�����̐���0��������
		if (args.length == 0) {
            //�������I������
			return;
		}
		//args[0]�̒l�𕶎��񂩂琔�l�ɕϊ�����max�Ɋi�[����
		int max = Integer.parseInt(args[0]);
		String result = null;
        
		//for���Ń��[�v����
		for (int i = 0; i < max; i++) {
			int num = i + 1;

            //result�̒��g����ɂ���
			result = "";

			//������3�Ŋ���؂ꂽ��Fizz��result�Ɋi�[����
			if (num % 3 == 0) {
				result = result + "Fizz";
			}
			//������5�Ŋ���؂ꂽ��Buzz��result�Ɋi�[����
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
