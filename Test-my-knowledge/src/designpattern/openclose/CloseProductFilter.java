package designpattern.openclose;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CloseProductFilter implements FilterManager{
	@Override
	public Stream<Product> filter(List<Product> products, Criteria<Product> creteria) {
		Predicate<Product> predicate= p->creteria.isSatisfied(p);
		return products.stream().filter(predicate);
	}
}