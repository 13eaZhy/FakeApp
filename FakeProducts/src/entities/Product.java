package entities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;

public class Product {
	
	String category;
	String name;
	float price;
	String manufacturer;
	Date expires;
	
	
	//Constructorul dat genereaza prin Faker
	public Product(){
		Faker f = new Faker(new Locale("ru"));
		
		this.category = f.lorem().word();
		this.name     = f.commerce().productName();
		this.price    = Float.valueOf( f.commerce().price(100, 1000) );
		this.manufacturer = f.chuckNorris().fact();
		this.expires = f.date().future(100, TimeUnit.DAYS );
		
		
		
	}
	
	
//	public Product(String file_name){
//		this <<<<<
//	}
//	
	
	
	public Product(String category,String manufacturer, String name, float price, Date expires) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
		this.expires = expires;
	}
	
	public String toString() {
		return "\nProduct \n category= " + category + "\n manufacturer= " + manufacturer + "\n name= " + name + "\n price= "
				+ price + "\n expires= " + expires ;
	}
	
	public void saveToFile(String file_name){
		
		try{
		FileWriter fw = new FileWriter(new File ( file_name ) );
		fw.write( this.toString() );
		fw.close();
	} catch (IOException e){
		System.err.println("CANNOT SAVE");
	}
		
	}
	
	
	
}
