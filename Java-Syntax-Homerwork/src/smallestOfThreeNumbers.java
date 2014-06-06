import java.util.Scanner;


public class smallestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = Math.min(a, b);
		System.out.println(Math.min(d, c));

	}

}
