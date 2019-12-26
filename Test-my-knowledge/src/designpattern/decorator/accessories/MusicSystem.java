package designpattern.decorator.accessories;

import designpattern.decorator.Car;
import designpattern.decorator.CarWithAccessories;

public class MusicSystem extends CarWithAccessories {
	
	public MusicSystem(Car car){
		this.car= car;
	}
	@Override
	public String getDetails() {
		return car.getDetails()+" with music system ";
	}

	@Override
	public int getCost() {
		return car.getCost()+10000;
	}

}