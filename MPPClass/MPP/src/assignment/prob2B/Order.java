package assignment.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String orderNumber;
	private List<OrderLine> orderLines;
	
	public Order(String orderNumber) {
		this.orderNumber = orderNumber;
		new OrderLine(this);
		this.orderLines = new ArrayList<OrderLine>();
		
	}
	
	public List<OrderLine> getOrderLine() {
		return this.orderLines;
	}
	
	public void setOrderLine(OrderLine ol) {
		this.orderLines.add(ol);
	}
}
