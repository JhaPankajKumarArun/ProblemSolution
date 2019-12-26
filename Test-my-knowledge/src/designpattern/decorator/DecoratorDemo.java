package designpattern.decorator;

import designpattern.decorator.accessories.GaskitSystem;
import designpattern.decorator.accessories.MusicSystem;
import designpattern.decorator.accessories.SeatCover;

public class DecoratorDemo {

	public static void main(String[] args) {
		Car car = new BasicCar();
		Car gasKit= new GaskitSystem(car);
		Car seatCover = new SeatCover(gasKit);
		Car musicSystem = new MusicSystem(seatCover); 
		
		Car basicWithMusicSystem = new MusicSystem(car);
		
		System.out.println(car.getDetails() +" which cost - > "+ car.getCost());
		System.out.println(gasKit.getDetails() +" which cost - > "+ gasKit.getCost());
		System.out.println(seatCover.getDetails() +" which cost - > "+ seatCover.getCost());
		System.out.println(musicSystem.getDetails() +" which cost - > "+ musicSystem.getCost());
		System.out.println(basicWithMusicSystem.getDetails() +" which cost - > "+ basicWithMusicSystem.getCost());
		
	}
}

