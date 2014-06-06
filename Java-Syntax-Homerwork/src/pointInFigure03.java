
import java.util.ArrayList;
import java.util.Scanner;


public class pointInFigure03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		StringBuilder builder = new StringBuilder();
		ArrayList<Double> list = new ArrayList<Double>();
		for (int i = 0; i < str.toCharArray().length; i++) {
			if (str.toCharArray()[i] != ' ') {
				builder.append(str.toCharArray()[i]);
			}else {
				list.add(Double.parseDouble(builder.toString()));
				builder.setLength(0);
			}
		}
		if (builder.length() > 0) {
			list.add(Double.parseDouble(builder.toString()));
			builder.setLength(0);
		}
	
		double x = list.get(0);
		double y = list.get(1);
		boolean bigFigure = firstFigure(x, y);
		boolean smallFigure = secondtFigure(x, y);
		if (smallFigure) {
			System.out.println("Outside");
		}else if (smallFigure && bigFigure) {
			System.out.println("Outside");
		}else if(bigFigure){
			System.out.println("Inside");
		}else {
			System.out.println("Outside");
		}
		

	}
	public static boolean firstFigure(double x, double y) {
		//x -> 12.5; 22.5
		//y -> 6; 13.5
		if ((x >= 12.5 && x <= 22.5) && (y >= 6.0 && y <= 13.5) ) {
			return true;
		}else {
			return false;
		}				
	}
	public static boolean secondtFigure(double x, double y) {
		//x -> 17.5; 20
		//y -> 8.5; 13.5
		if ((x >= 17.5 && x <= 20.0) && (y >= 8.5 && y <= 13.5) ) {
			return true;
		}else {
			return false;
		}				
	}
	

}

