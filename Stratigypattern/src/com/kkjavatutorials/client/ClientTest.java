package com.kkjavatutorials.client;

import com.kkjavatutorials.payment.impl.CreditcardPaymentMethod;
import com.kkjavatutorials.payment.impl.PaypalPaymentMethod;
import com.kkjavatutorials.product.Product;
import com.kkjavatutorials.shoppingcart.Shoppingcart;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating first Instance of Shoppingcart
		Shoppingcart shoppingcart = new Shoppingcart();
		
		
		
		Product product1 = new Product("Soap", "88889895", 100);
		Product product2 = new Product("Shampoo", "89989895", 120);
		
		Product product3 = new Product("Cookies", "84449895", 100);
		
		//adding three product in shopping cart
		shoppingcart.addProduct(product1);
		shoppingcart.addProduct(product2);
		
		shoppingcart.addProduct(product3);
		
		//Proceed to payment Strategy as CreditcardPayment
		shoppingcart.payment(new CreditcardPaymentMethod("KK", "987654326372626", "898", "11/23"));
		
		System.out.println("--------------------------------------------------------");
		//Creating Second Instance of Shoppingcart
		
		
		product1 = new Product("Milk", "888009895", 200);
		product2 = new Product("Beer", "89909995", 320);
		
		//adding two products in shopping cart
		shoppingcart.addProduct(product1);
		shoppingcart.addProduct(product2);
		
		//Proceed to payment Strategy as PaypalPayment
		shoppingcart.payment(new PaypalPaymentMethod("kk@gmail.com", "pass"));
		
	
	}

	

}
