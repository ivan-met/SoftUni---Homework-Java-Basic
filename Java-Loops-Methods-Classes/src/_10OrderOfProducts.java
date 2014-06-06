import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class _10OrderOfProducts {

	public static void main(String[] args) {
		ArrayList<Products2> listOfPrducts = new ArrayList<>();
		ArrayList<Products2> listOfOrders = new ArrayList<>();
		String fileProducts = "products.txt";
		String fileOutput = "output.txt";
		String orders = "Order.txt";
		listOfPrducts = Products2.listOfObj(fileProducts);
		listOfOrders = Products2.listOfObj(orders);
		double sum = 1;
		for (Products2 products : listOfOrders) {
			for (Products2 prods : listOfPrducts) {
				sum *= products.check(prods);
			}
		}
		System.out.println(sum);
		

	}


}
class Products2 {
	String name;
	double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Products2(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public double check (Products2 otherProducts) {
		String x = this.name;
		String y = otherProducts.name;
		double sum = 1;
		if (this.name.equals(otherProducts.name)) {
			sum = this.price * otherProducts.price;
		}
		return sum;
		
	}
	public static ArrayList<Products2> listOfObj (String fileName){
		ArrayList<Products2> listOfProd = new ArrayList<>();
		try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))){
			String line = null;
			
			while (true) {
				line = fileReader.readLine();
				if (line == null) {
					break;
				}
				String[] split = line.split(" ");
				if (fileName.equals("Order.txt")) {
					listOfProd.add(new Products2(split[1], Double.parseDouble(split[0])));
				}else {
					listOfProd.add(new Products2(split[1], Double.parseDouble(split[1])));
				}				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listOfProd;
	}
}
