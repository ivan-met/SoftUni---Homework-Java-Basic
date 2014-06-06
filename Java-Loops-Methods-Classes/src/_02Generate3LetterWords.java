import java.util.Scanner;


public class _02Generate3LetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String letters = input.next();
		char[] ch = letters.toCharArray();
		char[] helpArray = new char[3];
		variations(helpArray, ch, 0);
		
		

	}
	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i]);
			if (i == array.length - 1) {
				System.out.println();
			}
		}
	}
	public static void variations(char[] helpArray, char[] ch, int index) {
		if (index == helpArray.length) {
			printArray(helpArray);
			return;
		}
		for (int i = 0; i < ch.length; i++) {
			helpArray[index] = ch[i];
			variations(helpArray, ch, index + 1);
		}
	}

}
