package designpattern.openclose;

public interface Criteria<T> {
	public boolean isSatisfied(T item);
}
