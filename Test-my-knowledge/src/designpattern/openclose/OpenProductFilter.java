package designpattern.openclose;

import java.util.List;
import java.util.stream.Stream;

import designpattern.openclose.productattribute.Color;
import designpattern.openclose.productattribute.Size;

public class OpenProductFilter {
	public Stream<Product> filterProductByColor(List<Product> products, Color color){
		return products.stream().filter(p-> p.color== color);
	}
	
	public Stream<Product> filterProductBySize(List<Product> products, Size size){
		return products.stream().filter(p-> p.size== size);
	}
	
	public Stream<Product> filterProductByColorAndSize(List<Product> products, Color color,Size size){
		return products.stream().filter(p-> (p.color== color && p.size== size ));
	}
}
