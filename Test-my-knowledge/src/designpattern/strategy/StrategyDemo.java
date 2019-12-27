package designpattern.strategy;

import designpattern.strategy.client.FacebookStrategy;
import designpattern.strategy.client.GooglePlusStrategy;
import designpattern.strategy.client.OrkutStrategy;
import designpattern.strategy.client.TwitterStrategy;

public class StrategyDemo {
	public static void main(String[] args) {
		 
        // Creating social Media Connect Object for connecting with friend by
        // any social media strategy.
        SocialMediaContext context = new SocialMediaContext();
 
        // Setting Facebook strategy.
        context.setSocialmediaStrategy(new FacebookStrategy());
        context.connect("Suraj");
 
        System.out.println("====================");
 
        // Setting Twitter strategy.
        context.setSocialmediaStrategy(new TwitterStrategy());
        context.connect("Suraj");
 
        System.out.println("====================");
 
        // Setting GooglePlus strategy.
        context.setSocialmediaStrategy(new GooglePlusStrategy());
        context.connect("Suraj");
 
        System.out.println("====================");
 
        // Setting Orkut strategy.
        context.setSocialmediaStrategy(new OrkutStrategy());
        context.connect("Suraj");
    }
}
