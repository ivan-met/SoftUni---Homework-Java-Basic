import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class _11MostFrequentWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine().toLowerCase();
		String splitWord = "([().,!?:;'\"-]|\\s)+";
		String[] splitText = text.split(splitWord);
		
		Map<String, Integer> wordsCount = new TreeMap<String, Integer>();
		int maxCount = 0;
		for (String word : splitText) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0;
			}
			if (count + 1 > maxCount) {
				maxCount = count + 1;
			}
			wordsCount.put(word, count + 1);
			
		}
		for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
			Integer value = entry.getValue();
			String key = entry.getKey();
			if (value == maxCount) {
				System.out.printf("%s -> %d%n",key,value);
			}
		}
		

	}

}
