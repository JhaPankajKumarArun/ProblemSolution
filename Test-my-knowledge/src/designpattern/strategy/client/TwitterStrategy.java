package designpattern.strategy.client;

import designpattern.strategy.ISocialMediaStrategy;

public class TwitterStrategy implements ISocialMediaStrategy {
	 
    public void connectTo(String friendName) 
    {
        System.out.println("Connecting with " + friendName + " through Twitter");
    }
}
