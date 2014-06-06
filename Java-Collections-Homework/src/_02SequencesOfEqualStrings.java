import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class _02SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] splitStr = str.split(" ");
		Map<String, Integer> wordsCount = new HashMap<>();
		for (String string : splitStr) {
			Integer count = wordsCount.get(string);
			if (count == null) {
				count = 0;
			}
			wordsCount.put(string, count + 1);
			
		}
		for (String word : wordsCount.keySet()) {
			int count = wordsCount.get(word);
			for (int i = 0; i < count; i++) {
				System.out.print(word + " ");			
			}
			System.out.println();
		}

	}

}
