import java.util.Scanner;


public class _04LongestEncreasingSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] split = str.split(" ");
		int[] numbers = new int[split.length];
		for (int i = 0; i < split.length; i++) {
			numbers[i] = Integer.parseInt(split[i]);
		}
		int count = 1;
		int tempCount = 1;
		int index = 0;
		int bestIndex = 0;
		System.out.print(numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[i - 1]) {
				tempCount++;
				System.out.print(" " + numbers[i]);
			}else {
				System.out.println();
				System.out.print(numbers[i]);
				index = i;
				if (tempCount > count) {
					count = tempCount;
					bestIndex = i - 1;
					
				}
				tempCount = 1;
			}
		}
		if (tempCount > count) {
			count = tempCount;
			bestIndex = numbers.length - 1;
		}
		System.out.println();
		System.out.print("Longest: ");
		for (int i = 0; i < count; i++) {
			System.out.print(numbers[bestIndex - count + 1 + i] + " ");
		}
		
		
		

	}

}
