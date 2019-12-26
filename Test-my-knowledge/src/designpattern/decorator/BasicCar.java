package designpattern.decorator;

public class BasicCar implements Car {

	@Override
	public String getDetails() {
		return "This is a basic car";
	}

	@Override
	public int getCost() {
		return 100000;
	}
}