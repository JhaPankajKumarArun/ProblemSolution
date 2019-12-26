package designpattern.openclose.searchcriteria;

import designpattern.openclose.Criteria;
import designpattern.openclose.Product;
import designpattern.openclose.productattribute.Size;

public class SizeCriteria implements Criteria<Product> {
	Size size;
	public SizeCriteria(Size size){
		this.size= size;
	}
	@Override
	public boolean isSatisfied(Product item) {
		return item.size==size;
	}
	
}
