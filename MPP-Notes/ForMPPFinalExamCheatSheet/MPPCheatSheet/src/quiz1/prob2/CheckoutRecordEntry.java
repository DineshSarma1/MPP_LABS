package MPPPretest.prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	
	private LendingItem lendingItem;
	private ItemType itemType;
	
	public CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type) {
		this.lendingItem = item;
		this.checkoutDate = chDate;
		this.dueDate = dueDate;
		this.itemType = type;
	}
	
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public LendingItem getLendingItem() {
		return lendingItem;
	}
	public ItemType getLendingItemType() {
		return itemType;
	}
}
