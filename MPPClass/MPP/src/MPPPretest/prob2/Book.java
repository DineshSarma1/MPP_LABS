package MPPPretest.prob2;

import java.util.Objects;

public class Book extends LendingItem{
	
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;
	
	
	public Book(String isbn, String title, String fname, String lname) {
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = fname;
		this.authorLastName = lname;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authorFirstName, other.authorFirstName)
				&& Objects.equals(authorLastName, other.authorLastName) && Objects.equals(isbn, other.isbn)
				&& Objects.equals(title, other.title);
	}
	
}
