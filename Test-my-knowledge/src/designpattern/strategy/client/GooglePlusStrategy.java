package designpattern.strategy.client;

import designpattern.strategy.ISocialMediaStrategy;

public class GooglePlusStrategy implements ISocialMediaStrategy {
	 
    public void connectTo(String friendName) 
    {
        System.out.println("Connecting with " + friendName + " through GooglePlus");
    }
}