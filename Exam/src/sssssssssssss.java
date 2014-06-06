import java.util.ArrayList;
import java.util.Scanner;


public class sssssssssssss {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "[3 x 3] [3 x 2] [4 x 3] [1 x 4] [5 x 3] [3 x 1]";
		String[] split = input.split("[\\]\\[ x]+");
		StringBuilder build = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < split.length; i+= 2) {
			build.append(split[i]);
			int x = Integer.parseInt(build.toString());
			System.out.println(x);
			
		}

	}

}
