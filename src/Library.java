import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {

	ArrayList<Book> m_bookArrayList = new ArrayList<Book>();

	public void addBook(Book a_book) {
		m_bookArrayList.add(a_book);
	}

	public void removeBook(Book a_book) {
		Iterator<Book> itr = m_bookArrayList.iterator();
		while (itr.hasNext()) {
			Book i = itr.next();
			if (i.equals(a_book))
				itr.remove();
		}

	}

	public Book[] getAllBooks() {
		Book[] l_bookArray = m_bookArrayList.toArray(new Book[m_bookArrayList.size()]);
		return l_bookArray;
	}

	
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
	    Set<Object> seen = ConcurrentHashMap.newKeySet();
	    return t -> seen.add(keyExtractor.apply(t));
	}
	
	public Book[] getUniqueTitlesForAuthor(String a_author) {
		
		List<Book> l_filteredList = m_bookArrayList.stream().filter((b) -> a_author.equals(b.getAuthor()))
				.filter(distinctByKey(Book::getTitle))
				.collect(Collectors.toList());

		return l_filteredList.toArray(new Book[l_filteredList.size()]);
	}

	public long getNumberOfCopiesOfTitleAndEdition(String a_title, int a_edition) {
		return m_bookArrayList.stream().filter((b) -> a_title.equals(b.getTitle()) && a_edition == b.getEdition())
				.count();
	}
}
