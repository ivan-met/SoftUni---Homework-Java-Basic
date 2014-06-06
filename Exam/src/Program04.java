import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Program04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sequence = scan.nextLine();
		String[] split = sequence.split(" ");
		ArrayList<String> strList = new ArrayList<>();
		for (int i = 0; i < split.length - 1; i++) {
			strList.add(split[i] + " " +split[i +1]);
		}
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		for (String couple : strList) {
			Integer count = map.get(couple);
			if (count == null) {
				count = 0;
			}
			map.put(couple, count + 1);
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String card = entry.getKey();
			Integer value = entry.getValue();
			double percent = ((double)value/strList.size()) * 100;
			System.out.printf("%s -> %.2f%%\n",card,percent);
		}

	}

}
