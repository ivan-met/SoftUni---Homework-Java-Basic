import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class _08SumNumbersFromTextFile {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		try {
			Scanner scan = new Scanner(new File("C:\\Users\\Ivan\\Desktop\\input.txt"));
			while (scan.hasNextInt()) {
				list.add(scan.nextInt());
				
			}
			int sum = 0;
			for (int i = 0; i < list.size(); i++) {
				sum += (int)list.toArray()[i];
			}
			System.out.println(sum);
		} catch (FileNotFoundException e) {
			System.out.println("error");
		}
		/*try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Ivan\\Desktop\\input.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				type type = (type) reader.nextElement();
				
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("error");
		}*/
	}
}
