package designpattern.decorator.accessories;

import designpattern.decorator.Car;
import designpattern.decorator.CarWithAccessories;

public class SeatCover extends CarWithAccessories{

	public SeatCover(Car car){
		this.car= car;
	}
	
	@Override
	public String getDetails() {
		return car.getDetails()+" with seat cover";
	}

	@Override
	public int getCost() {
		return car.getCost()+ 8000;
	}
	
}