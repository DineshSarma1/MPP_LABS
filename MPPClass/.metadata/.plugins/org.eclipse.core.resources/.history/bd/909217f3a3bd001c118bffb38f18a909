package MPPPretest.prob2;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		//implement
		for(LibraryMember lm : members) {
			List<CheckoutRecordEntry> checkoutRecordEntryList = lm.getCheckoutRecord().getCheckoutRecordEntryList();
			for(CheckoutRecordEntry checkoutRecordEntry: checkoutRecordEntryList) {
				if(checkoutRecordEntry.getLendingItem().equals(item)) {
					phoneNums.add(lm.getPhone());
					
				}
			}
		}
		
		Collections.sort(phoneNums);
		return phoneNums;
	}
}
