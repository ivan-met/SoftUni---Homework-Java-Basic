import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class _10ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine().toLowerCase();
		String word = "([().,!?:;'\"-]|\\s)+";
		String[] split = text.split(word);
	
		Set<String> output = new TreeSet<>();
		for (int i = 0; i < split.length; i++) {
			output.add(split[i]);
		}
		for (String string : output) {
			System.out.print(string + " ");
		}
	

	}

}
