
package com.kkjavatutorials.subject.impl;
 
import java.util.HashSet;
import java.util.Set;
 
import com.kkjavatutorials.message.Message;
import com.kkjavatutorials.observer.Observer;
import com.kkjavatutorials.subject.Subject;
public class Messagepublisher  implements Subject{
	   private Set<Observer> observers = new HashSet<>();
	   
	   /**
	    * Method to register an Observer
	    */
	    @Override
	    public void register(Observer observer) {
	        observers.add(observer);
	    }
	 
	    /**
	     * Method to unregister an Observer
	     */
	    @Override
	    public void unregister(Observer observer) {
	        observers.remove(observer);
	    }
	 
	    /**
	     * Method to notifyUpdate for Subcribed
	     * Observer
	     */
	    @Override
	    public void notifyUpdate(Message message) {
	        for(Observer observer: observers) {
	            observer.updateObserver(message);
	        }
	    }

}
