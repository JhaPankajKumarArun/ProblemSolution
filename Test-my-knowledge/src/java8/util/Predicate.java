package java8.util;

@FunctionalInterface
public interface Predicate<T> {
	public boolean test(T t);
	
	public default Predicate<T> and(Predicate<T> pred){
		return p-> test(p) && pred.test(p);
	}
	public default Predicate<T> or(Predicate<T> pred){
		return p-> test(p) || pred.test(p);
	}
}
