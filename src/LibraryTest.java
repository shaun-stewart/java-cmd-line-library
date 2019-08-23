import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

	Library m_library;
	Book m_testBook1;
	Book m_testBook2;
	Book m_testBook3;
	
	String m_author1;
	String m_title1;
	int m_edition1;


	@Before
	public void initialise() {
		m_library = new Library();

		String l_author1 = "Clint Plywood";
		String l_title1 = "Chronicles of a man after a sandwich";
		int l_edition1 = 1;
		int l_publicationYear1 = 2016;
		String l_publisher1 = "Rambunctious Publishing";

		m_testBook1 = new Book(l_author1, l_title1, l_edition1, l_publicationYear1, l_publisher1);


		String l_title2 = "Chronicles of a man after a sandwich: Vol 2";
		int l_edition2 = 1;
		int l_publicationYear2 = 2019;
		String l_publisher2 = "Rambunctious Publishing";

		m_testBook2 = new Book(l_author1, l_title2, l_edition2, l_publicationYear2, l_publisher2);
		
		String l_author2 = "Chester Rimzin";
		String l_title3 = "The 15th duck billed platypus";
		int l_edition3 = 1;
		int l_publicationYear3 = 2016;
		String l_publisher3 = "My Second Left Hand Publishing";

		m_testBook3 = new Book(l_author2, l_title3, l_edition3, l_publicationYear3, l_publisher3);
		
		
		m_author1 = l_author1;
		m_title1 = l_title1;
		m_edition1 = l_edition1;
	}

	@Test
	public void shouldAddBook() {
		int l_bookCount = m_library.getAllBooks().length;
		assertTrue(l_bookCount == 0);

		m_library.addBook(m_testBook1);

		Book[] l_books = m_library.getAllBooks();
		assertTrue(l_books.length == 1);
		assertTrue(l_books[0].equals(m_testBook1));
	}

	@Test
	public void shouldRemoveBook() {
		int l_bookCount = m_library.getAllBooks().length;
		assertTrue(l_bookCount == 0);

		m_library.addBook(m_testBook1);
		m_library.addBook(m_testBook2);

		Book[] l_books = m_library.getAllBooks();
		assertTrue(l_books.length == 2);

		m_library.removeBook(m_testBook1);

		l_books = m_library.getAllBooks();
		assertTrue(l_books.length == 1);

		assertTrue(l_books[0].equals(m_testBook2));
	}

	@Test
	public void shouldReturnAllBooks() {
		int l_bookCount = m_library.getAllBooks().length;
		assertTrue(l_bookCount == 0);

		m_library.addBook(m_testBook1);
		m_library.addBook(m_testBook2);

		Book[] l_books = m_library.getAllBooks();
		assertTrue(l_books.length == 2);
	}

	@Test
	public void shouldReturnUniqueTitlesForAuthor() {
		int l_bookCount = m_library.getAllBooks().length;
		assertTrue(l_bookCount == 0);

		m_library.addBook(m_testBook1);
		m_library.addBook(m_testBook2);
		m_library.addBook(m_testBook3);

		Book[] l_books = m_library.getUniqueTitlesForAuthor(m_author1);
		assertTrue(l_books.length == 2);
		assertTrue(l_books[0].equals(m_testBook1));
		assertTrue(l_books[1].equals(m_testBook2));
	}

	@Test
	public void shouldReturnNumberOfCopiesOfTitleAndEdition() {
	
		m_library.addBook(m_testBook1);
		m_library.addBook(m_testBook1);
		m_library.addBook(m_testBook2);
		m_library.addBook(m_testBook3);

		long l_bookCount = m_library.getNumberOfCopiesOfTitleAndEdition(m_title1, m_edition1);
		assertTrue(l_bookCount == 2);
	}
}
