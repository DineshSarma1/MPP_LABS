package lesson9.labs.prob1.business;

import java.util.*;
import java.util.stream.Collectors;

import lesson9.labs.prob1.dataaccess.DataAccess;
import lesson9.labs.prob1.dataaccess.DataAccessFacade;
import lesson9.labs.prob1.business.Book;
import lesson9.labs.prob1.business.LibraryMember;

public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingAtLeastTwoCopies());
		System.out.println(allHavingMultipleAuthors());
	}

	// Returns a list of all ids of LibraryMembers whose zipcode contains the digit
	// 3
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		// implement
		List<String> streamPipeline = mems.stream()
				.filter(person -> person.getAddress().getZip().contains("3"))
				.map(member -> member.getMemberId())
				.collect(Collectors.toList());
		return streamPipeline;
	}

	// Returns a list of all isbns of books having at least two copies
	public static List<String> allHavingAtLeastTwoCopies() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		// implement
		List<String> streamPipeline = bs.stream()
				.filter(book -> book.getNextAvailableCopy().getBook().getNumCopies() >= 2)
				.map(book -> book.getIsbn())
				.collect(Collectors.toList());
		return streamPipeline;

	}

	// Returns a list of all isbns of Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		// implement
		List<String> streamPipeline = bs.stream()
				.filter(book -> book.getAuthors().size() > 1)
				.map(book -> book.getIsbn())
				.collect(Collectors.toList());
		return streamPipeline;

	}

}
