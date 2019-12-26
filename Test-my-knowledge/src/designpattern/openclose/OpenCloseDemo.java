package designpattern.openclose;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import designpattern.openclose.productattribute.Color;
import designpattern.openclose.productattribute.Size;
import designpattern.openclose.searchcriteria.ColorCriteria;
import designpattern.openclose.searchcriteria.ProductNameStartWithCriteria;
import designpattern.openclose.searchcriteria.SizeCriteria;

public class OpenCloseDemo {
	
	public static void main(String[] args) {
		Product doll= new Product("Doll",Color.GREEN,Size.SMALL);
		Product robot= new Product("Robot",Color.GREEN,Size.LARGE);
		Product house= new Product("House",Color.BLUE,Size.LARGE);
		List<Product> products= new ArrayList<>();
		products.add(doll);
		products.add(robot);
		products.add(house);
		
		Consumer<Product> consumer = p->System.out.println("Product : "+p.name + ", Color : "+ p.color +", Size : "+ p.size);
		products.stream().forEach(consumer);
		
		System.out.println("============= Green color product =================");
		
		OpenProductFilter pf= new OpenProductFilter();
		pf.filterProductByColor(products, Color.GREEN).forEach(consumer);
		System.out.println("============= Large size product =================");
		pf.filterProductBySize(products, Size.LARGE).forEach(consumer);
		System.out.println("============= Large size and green color product =================");
		pf.filterProductByColorAndSize(products, Color.GREEN,Size.LARGE).forEach(consumer);
		
		System.out.println("============= After implementing ProductFilterManager =================\n\n");
		CloseProductFilter pfm = new CloseProductFilter();
		System.out.println("============= Green color product=================");
		pfm.filter(products, new ColorCriteria(Color.GREEN)).forEach(consumer);
		System.out.println("============= Large size product=================");
		pfm.filter(products, new SizeCriteria(Size.LARGE)).forEach(consumer);
		
		System.out.println("============= Product name start with H =================");
		pfm.filter(products, new ProductNameStartWithCriteria("H")).forEach(consumer);
	}

}




