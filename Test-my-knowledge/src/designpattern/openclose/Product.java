package designpattern.openclose;

import designpattern.openclose.productattribute.Color;
import designpattern.openclose.productattribute.Size;

public class Product{
	public String name;
	public Color color;
	public Size size;	
	public Product(String name, Color color, Size size){
		this.name= name;
		this.color= color;
		this.size= size;
	}
}
