package assignment5.problem3.extpackage;

import java.time.LocalDate;

import assignment5.problem3.Order;
import assignment5.problem3.CustOrderFactory;
import assignment5.problem3.Customer;
import assignment5.problem3.CustomerOrder;


public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		Order order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());
		
		CustomerOrder custOrd = CustOrderFactory.createCustomerAndOrder("Jack", LocalDate.now());
		
		custOrd.getOrder().addItem("Pants");
		custOrd.getOrder().addItem("Knife set");
		
		System.out.println(custOrd.getCustomer().getName());
		System.out.println(custOrd.getOrder().toString());
	}
}

		
