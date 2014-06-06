import java.util.Scanner;


public class coutOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;
		String str = Integer.toBinaryString(n);
		for (int i = 0; i < str.toCharArray().length; i++) {
			if (str.toCharArray()[i] == '1') {
				count++;
			}
		}
		System.out.println(count);

	}

}
