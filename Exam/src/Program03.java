import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Program03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher(input);

		while(matcher.find()) {
		    list.add(Integer.parseInt(matcher.group()));
		}
		ArrayList<Integer> sum = new ArrayList<>();
		for (int i = 0; i < list.size(); i+=2) {
			sum.add(list.get(i)*list.get(i + 1));
		}
		
		int bestSum = 0;
		int tempSum = 0;
		for (int i = 0; i < sum.size() - 2; i++) {
			for (int j = i; j < 3 + i; j++) {
				tempSum += sum.get(j);
			}
			if (tempSum > bestSum) {
				bestSum = tempSum;
			}
			tempSum = 0;
		}
	
		System.out.println(bestSum);
		

	}

}
