package prob3;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import helperclasses.Book;
import helperclasses.LibraryMember;
import helperclasses.LibrarySystemException;
import helperclasses.TestData;

public class Problem3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem3 p = new Problem3();
		List<LibraryMember> participants = TestData.INSTANCE.getMembers();
		p.specialBooks = TestData.INSTANCE.getAllBooks().iterator();
		LibraryMember mem = p.detectIfWinnerDuringCheckout(participants);
		System.out.println("Winner: " + (mem == null ? "none" : mem.getFirstName()));

	}

	Iterator<Book> specialBooks;

	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems) {
		return mems.stream().filter(mem -> {
			try {
				return mem
						.checkout(specialBooks.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1))
						.getCheckoutRecordEntries().size() == 10;

			} catch (LibrarySystemException e) {
				e.printStackTrace();
				return false;
			}
		}).findFirst().orElse(null);
	}
}
