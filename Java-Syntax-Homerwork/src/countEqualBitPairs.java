import java.util.Scanner;


public class countEqualBitPairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		int tempCount = 0;
		String str = Integer.toBinaryString(n);
		
		for (int i = 0; i < str.toCharArray().length - 1; i++) {
			
			if (str.toCharArray()[i] == str.toCharArray()[i + 1]) {
				tempCount++;
			}else {
				count += tempCount;
				tempCount = 0;
			}
		}
		if (tempCount != 0) {
			count += tempCount;
		}
		System.out.println(count);

	}

}
