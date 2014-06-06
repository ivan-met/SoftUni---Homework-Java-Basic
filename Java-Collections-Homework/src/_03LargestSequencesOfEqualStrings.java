import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class _03LargestSequencesOfEqualStrings {

	public static void main(String[] args) {
		String[] arr = {"hi","yes","yes","yes","bye"};
		Map<String, Integer> wordsCount = new TreeMap();
		int longestSequence = 0;
		for (String word : arr) {
			Integer tempCount = wordsCount.get(word);
			if (tempCount == null) {
				tempCount = 0;
			}
			wordsCount.put(word, tempCount + 1);
		}
		int count = wordsCount.get(wordsCount.keySet().toArray()[wordsCount.size()- 1]);
		for (int i = 0; i < count; i++) {
			System.out.print(wordsCount.keySet().toArray()[wordsCount.size()- 1] + " ");
		}
	}

}
