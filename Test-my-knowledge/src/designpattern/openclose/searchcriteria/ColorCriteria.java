package designpattern.openclose.searchcriteria;

import designpattern.openclose.Criteria;
import designpattern.openclose.Product;
import designpattern.openclose.productattribute.Color;

public class ColorCriteria implements Criteria<Product> {
	Color color;
	public ColorCriteria(Color color){
		this.color=color;
	}
	@Override
	public boolean isSatisfied(Product item) {
		return item.color==color;
	}
}
