package assignment.prob2B;

public class OrderLine {
	
	private Order order;
	public OrderLine(Order order) {
		this.order = order;
		order.setOrderLine(this);
	}

}
