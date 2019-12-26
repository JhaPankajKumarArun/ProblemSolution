package designpattern.openclose.searchcriteria;

import designpattern.openclose.Criteria;
import designpattern.openclose.Product;

public class ProductNameStartWithCriteria  implements Criteria<Product>{
	String name;
	public ProductNameStartWithCriteria(String name){
		this.name= name;
	}
	@Override
	public boolean isSatisfied(Product item) {
		return item.name.startsWith(name);
	}
	
}