import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;


public class BookTest {
	Book testBook;

	@Before
	public void initialise() {
		String l_author = "Clint Plywood";
		String l_title = "Chronicles of a man after a sandwich";
		int l_edition = 1;
		int l_publicationYear = 2019;
		String l_publisher = "Rambunctious Publishing";
		
		testBook = new Book(l_author, l_title, l_edition, l_publicationYear, l_publisher);
	}

	@Test
	public void getAuthorShouldReturnString() {
		assertTrue(testBook.getAuthor() instanceof String);
	}
	
	@Test
	public void getTitleShouldReturnString() {
		assertTrue(testBook.getTitle() instanceof String);
	}
	
	@Test
	public void getEditionShouldReturnInt() {
		assertTrue( Integer.class.isInstance(testBook.getEdition()) );
	}
	
	@Test
	public void getPublicationYearShouldReturnInt() {
		assertTrue(Integer.class.isInstance(testBook.getPublicationYear()));
	}
	
	@Test
	public void getPublisherShouldReturnString() {
		assertTrue(testBook.getAuthor() instanceof String);
	}
}
