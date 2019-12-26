package designpattern.openclose;

import java.util.List;
import java.util.stream.Stream;

public interface FilterManager {
	public Stream<Product> filter(List<Product> products, Criteria<Product> creteria);
}
