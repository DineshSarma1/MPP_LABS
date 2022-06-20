package assignment5.problem3;


public class CustomerOrderImpl implements CustomerOrder{
	private Customer customer;
	private Order order;
	CustomerOrderImpl(Customer c, Order o) {
		customer = c;
		order = o;
	}
	public Customer getCustomer() {
		return customer;
	}
	public Order getOrder() {
		return order;
	}
}
