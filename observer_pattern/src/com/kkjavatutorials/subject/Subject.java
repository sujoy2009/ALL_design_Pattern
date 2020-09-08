package com.kkjavatutorials.subject;


import com.kkjavatutorials.message.Message;
import com.kkjavatutorials.observer.Observer;
public interface Subject {
	public void register(Observer observer);
	public void unregister(Observer observer);
	public void notifyUpdate(Message message);
}

