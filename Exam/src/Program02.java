import java.util.Scanner;


public class Program02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] numbers = new int[n];
		boolean pyth = false;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(scan.nextLine());
		}
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				for (int j2 = 0; j2 < numbers.length; j2++) {
					if ((numbers[i] <= numbers[j]) && (numbers[i]*numbers[i] + numbers[j] * numbers[j] == numbers[j2]*numbers[j2])) {
						System.out.printf("%d*%d + %d*%d = %d*%d",numbers[i],numbers[i],numbers[j],numbers[j],numbers[j2],numbers[j2]);
						System.out.println();
						pyth = true;
					}
				}
			}
		}
		if (!pyth) {
			System.out.println("No");
		}

	}

}
