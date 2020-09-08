package com.kkjavatutorials.client;
import com.kkjavatutorials.message.Message;
import com.kkjavatutorials.observer.impl.FirstMessageSubscriber;
import com.kkjavatutorials.observer.impl.thirdsubscriver;

import com.kkjavatutorials.subject.impl.Messagepublisher;
import com.kkjavatutorials.observer.impl.SecondMessageSubscriber;
 
/**
 * @author KK JavaTutorials
 *Client program to demo Observer Design Pattern
 */
public class ObserverTest {
 
	public static void main(String[] args) {
		
		//Creating Three Subscribers
		FirstMessageSubscriber firstMessageSubscriber = new FirstMessageSubscriber();
		SecondMessageSubscriber secondMessageSubscriber = new SecondMessageSubscriber();
		thirdsubscriver thirdMessageSubscriber = new thirdsubscriver();
 
		//Creating Message Publisher
		Messagepublisher messagePublisher = new Messagepublisher();
 
		//Register two Subscribers to get notifications on any update
		messagePublisher.register(firstMessageSubscriber);
		messagePublisher.register(secondMessageSubscriber);
 
		//firstMessageSubscriber and secondMessageSubscriber will receive the update
		messagePublisher.notifyUpdate(new Message("This is First Message"));
		System.out.println("---------------------------------------------------------------");
 
		/*Now UnRegister firstMessageSubscriber so that
		it won't get notification on any update*/
		messagePublisher.unregister(firstMessageSubscriber);
		
		//Now Register one more Subscriber to get notifications on any update
		messagePublisher.register(thirdMessageSubscriber);
 
		//secondMessageSubscriber and thirdMessageSubscriber will receive the update
		messagePublisher.notifyUpdate(new Message("This is Second Message"));
	}
}