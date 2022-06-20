package MPPPretest.prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> checkoutRecordEntryList;
	
	public CheckoutRecord() {
		checkoutRecordEntryList = new ArrayList<>();
	}

	public List<CheckoutRecordEntry> getCheckoutRecordEntryList() {
		return checkoutRecordEntryList;
	}
	
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		checkoutRecordEntryList.add(entry);
	}
	
}
