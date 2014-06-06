import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _05CountAllWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input =  in.nextLine();
		int count = 0;

		String noLetter = "[a-zA-Z]+";
		Pattern readText = Pattern.compile(noLetter);
		Matcher matcher = readText.matcher(input);
		while (matcher.find()) {
			matcher.group();
			count++;
		}
		System.out.println(count);

	}

}
