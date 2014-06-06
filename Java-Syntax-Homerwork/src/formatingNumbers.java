import java.util.Scanner;


public class formatingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();
		String str = Integer.toHexString(a);
		String str1 = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.printf("%-10S",str);			
		System.out.print(str1);
		System.out.printf("%10.2f",b);
		System.out.printf("%-10.3f",c);
	}

}
