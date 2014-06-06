import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _06CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		String lookingWord = scan.nextLine().toLowerCase();
		int count = 0;
		String word = "([().,!?:;'\"-]|\\s)+";
		String[] split = str.split(word);
		for (String string : split) {
			if (string.equals(lookingWord)) {
				count++;
			}
		}
	
		System.out.println(count);
		
	}

}
