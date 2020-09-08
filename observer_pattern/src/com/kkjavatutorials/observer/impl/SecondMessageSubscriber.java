package com.kkjavatutorials.observer.impl;

import com.kkjavatutorials.observer.Observer;
import com.kkjavatutorials.message.Message;


public class SecondMessageSubscriber implements Observer {
	 @Override
	    public void updateObserver(Message message) {
	        System.out.println("Message for Second subscriber :: " + message.getMessage());
	    }
}

