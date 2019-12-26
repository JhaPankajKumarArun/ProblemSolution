package designpattern.decorator.accessories;

import designpattern.decorator.Car;
import designpattern.decorator.CarWithAccessories;

public class GaskitSystem extends CarWithAccessories {

	public GaskitSystem(Car car){
		this.car= car;
	}
	
	@Override
	public String getDetails() {
		return car.getDetails()+" with gas kit system";
	}

	@Override
	public int getCost() {
		return car.getCost()+ 15000;
	}
}
