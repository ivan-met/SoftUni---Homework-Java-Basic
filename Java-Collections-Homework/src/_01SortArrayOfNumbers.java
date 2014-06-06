import java.util.Arrays;
import java.util.Scanner;


public class _01SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		int[] arrayOfNumbers = new int[number];
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			arrayOfNumbers[i] = Integer.parseInt(scan.nextLine());
		}
		Arrays.sort(arrayOfNumbers);
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			System.out.println(arrayOfNumbers[i]);
		}

	}

}
