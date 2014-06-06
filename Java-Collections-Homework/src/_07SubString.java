import java.util.Scanner;


public class _07SubString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		String sub = scan.nextLine().toLowerCase();
		int count = findSub(str, sub);
		System.out.println(count);

	}
	private static int findSub (String text,String subText) {
		int count = 0;
		int index = 0;
		while ((index = text.indexOf(subText, index)) != -1) {
			count++;
			index++;
		}
		return count;
	}

}
