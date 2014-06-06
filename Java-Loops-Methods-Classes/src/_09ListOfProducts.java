import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Other;
import javax.swing.Spring;


public class _09ListOfProducts {

	public static void main(String[] args) {
		//Scanner filesScan = new Scanner(new File("input.txt"));
		String fileName = "input.txt";
		String newFileName = "output.txt";
		ArrayList<Products> product = new ArrayList<>();
		try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
				FileWriter fileWriter = new FileWriter(newFileName))
		{
			while (true) {
				String line = fileReader.readLine();
				if (line == null) {
					break;
				}
				String[] splitProd = line.split(" ");
				product.add(new Products(splitProd[0], Double.parseDouble(splitProd[1])));						
			}
			Collections.sort(product);
			for (Products prod : product) {
				fileWriter.append(prod.getPrice() + " " + prod.getName() + String.format("%n"));				
			}
			
		} catch (IOException ioex ) {
			
			ioex.printStackTrace();
		}

	}
		
		
		
	

}


class Products implements Comparable<Products> {
	String name;
	double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Products(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrize(double prize) {
		this.price = prize;
	}
	@Override
	public int compareTo(Products compareProducts) {
		double comparePrice = ((Products) compareProducts).getPrice();
		
		  if(this.price>comparePrice){ return 1;
		  }else{
          if(this.price==comparePrice) {return 0;}
          return -1;}
	}
}
