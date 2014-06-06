import java.lang.reflect.Array;
import java.util.Scanner;


public class _01SymetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int startNumber = input.nextInt();
		int endNumber = input.nextInt();
		for (int i = startNumber; i <= endNumber; i++) {
			if (isSymetric(i)) {
				System.out.printf("%d ",i);
			}
		}
		

	}
	public static boolean isSymetric(int number) {
		StringBuilder build = new StringBuilder(Integer.toString(number));
		if (Integer.toString(number).equals(build.reverse().toString())) {
			return true;
		}else {
			return false;
		}
	}

}
