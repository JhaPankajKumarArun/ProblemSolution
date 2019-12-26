package designpattern.openclose.searchcriteria;

import designpattern.openclose.Criteria;
import designpattern.openclose.Product;
import designpattern.openclose.productattribute.Color;
import designpattern.openclose.productattribute.Size;

public class ColorAndSizeCriteria implements Criteria<Product>{
	Size size;
	Color color;
	public ColorAndSizeCriteria(Color color, Size size){
		this.color= color;
		this.size= size;
	}
	@Override
	public boolean isSatisfied(Product item) {
		return size== item.size && color == item.color;
	}
}
