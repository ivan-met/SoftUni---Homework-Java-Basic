import java.util.Scanner;


public class triangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double p1x = input.nextDouble();
		double p1y = input.nextDouble();
		double p2x = input.nextDouble();
		double p2y = input.nextDouble();
		double p3x = input.nextDouble();
		double p3y = input.nextDouble();
		if ((p1x == p2x  && p1x == p3x) || (p1y == p2y && p1y == p3y)) {
			System.out.println("0");
		}else {
			double area = Math.abs((p1x*(p2y-p3y) + p2x*(p3y-p1y)+p3x*(p1y-p2y))/2);
			System.out.println(area);
		}
		


	}

}
