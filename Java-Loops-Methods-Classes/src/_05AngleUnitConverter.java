import java.util.ArrayList;
import java.util.Scanner;


public class _05AngleUnitConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		
		ArrayList<String> results = new ArrayList<String>();
		
		for (int i = 0; i < n; i++) {
			String str = angleConverter(scan.nextLine());
			results.add(str);		
		}
		
		for (int i = 0; i < results.size(); i++) {
			System.out.println(results.toArray()[i]);
		}
		
		
	}
	public static String angleConverter(String str) {
		
		String result;
		String[] split = str.split(" ");
		if (split[1].equals("deg")) {
			double res = Math.toRadians(Double.parseDouble(split[0]));
			result = String.format("%.6f rad", res);
			
		}else {
			double res = Math.toDegrees(Double.parseDouble(split[0]));
			result = String.format("%.6f deg", res);
			
		}
		return result;
	}
}
