import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class _12CardFrequencies {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cardsSequence = scan.nextLine();
		String splitWord = "[ ♥♣♦♠]+";
		String[] cards = cardsSequence.split(splitWord);
		
		Map<String, Integer> cardCount = new LinkedHashMap<String, Integer>();
		for (String card : cards) {
			Integer count = cardCount.get(card);
			if (count == null) {
				count = 0;
			}
			cardCount.put(card, count + 1);
		}
		for (Map.Entry<String, Integer> entry : cardCount.entrySet()) {
			String card = entry.getKey();
			Integer value = entry.getValue();
			double percent = ((double)value/cards.length) * 100;
			System.out.printf("%s -> %.2f%%\n",card,percent);
		}
		

	}

}
