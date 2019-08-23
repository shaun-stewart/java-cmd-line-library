//import java.util.Optional;

public final class Book {
	// potential class
	private final String m_author;
	private final String m_title;
	private final int m_edition;
	private final int m_publicationYear;
	// potential class
	private final String m_publisher;

	public Book(String a_author, String a_title, int a_edition, int a_publicationYear, String a_publisher) {
//		Below not needed as Java seems to enforce correct arguements
//		if (!Optional.of(a_author).isPresent())
//			throw new IllegalArgumentException("The book needs an author");
//
//		if (!Optional.of(a_title).isPresent())
//			throw new IllegalArgumentException("The book needs a title");
//
//		if (!Optional.of(a_edition).isPresent())
//			throw new IllegalArgumentException("The book needs an edition");
//
//		if (!Optional.of(a_publicationYear).isPresent())
//			throw new IllegalArgumentException("The book needs a publication year");
//
//		if (!Optional.of(a_publisher).isPresent())
//			throw new IllegalArgumentException("The book needs a publisher");

		m_author = a_author;
		m_title = a_title;
		m_edition = a_edition;
		m_publicationYear = a_publicationYear;
		m_publisher = a_publisher;
	}
	
	public boolean equals(Object a_other) {
	    if (a_other == this) return true;
	    if (a_other == null) return false;
	    if (getClass() != a_other.getClass()) return false;
	    Book l_book = (Book)a_other;
	    return (m_author.equals(l_book.getAuthor())
	    		&& m_title.equals(l_book.getTitle())
	    		&& m_edition == l_book.getEdition()
	    		&& m_publicationYear == l_book.getPublicationYear()
	    		&& m_publisher.equals(l_book.getPublisher()));
	  }

	public String getAuthor() {
		return m_author;
	}

	public String getTitle() {
		return m_title;
	}

	public int getEdition() {
		return m_edition;
	}

	public int getPublicationYear() {
		return m_publicationYear;
	}

	public String getPublisher() {
		return m_publisher;
	}
}
