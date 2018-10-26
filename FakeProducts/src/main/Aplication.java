package main;
import java.util.Date;

import entities.Product;

public class Aplication {

	public static void main(String[] args) {
//		Product p = new Product("Drinks","Coca Cola",15.50F,"Coca Cola inc",new Date() ) ;
		Product p = new Product();
	  System.out.println( p );
	  p.saveToFile("/home/student/Desktop/product.txt");
	}

	
	
}
