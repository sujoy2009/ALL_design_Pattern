package com.kkjavatutorials.observer.impl;

import com.kkjavatutorials.message.Message;
import com.kkjavatutorials.observer.Observer;

public class thirdsubscriver implements Observer{
	@Override
    public void updateObserver(Message message) {
        System.out.println("Message for third subscriber :: " + message.getMessage());
    }

}
