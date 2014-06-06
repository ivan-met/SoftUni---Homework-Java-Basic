import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class _09CombineListOfLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String first = scan.nextLine();
		String second = scan.nextLine();
		
		ArrayList<Character> l1 = new ArrayList<>();
		ArrayList<Character> l2 = new ArrayList<>();
		
		for (int i = 0; i < first.toCharArray().length; i++) {
			l1.add(first.charAt(i));
		}
		for (int i = 0; i < second.toCharArray().length; i++) {
			l2.add(second.charAt(i));
		}
				
		
		for (int i = 0; i < l2.size(); i++) {
			if (l1.contains(l2.get(i))) {
				continue;
			}else {
				l1.add(' ');
				l1.add(l2.get(i));
			}
		}
		
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i));
		}

	}

}
