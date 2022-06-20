package assignment5.problem3;

import java.time.LocalDate;

final public class CustOrderFactory {
	
	private CustOrderFactory() {}
	
	public static CustomerOrder createCustomerAndOrder(String customerName, LocalDate orderDate) {
		Customer customer = new Customer(customerName);
		Order order = Order.newOrder(customer, orderDate);
		
		return new CustomerOrderImpl(customer, order);
	}

}
