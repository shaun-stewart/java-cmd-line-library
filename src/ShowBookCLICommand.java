import java.util.ArrayList;

public class ShowBookCLICommand implements Command {

	public void execute(ArrayList<String> a_commandArgs) {

	}

	// method exposed so sub classes can display books via different means
	public void showBooks(Book[] a_books) {
		for (Book l_book : a_books) {
			System.out.print("Author: " + l_book.getAuthor() + "\n" 
					+ "Title: " + l_book.getTitle() + "\n" 
					+ "Edition: " + l_book.getEdition() + "\n" 
					+ "Publication Year: " + l_book.getPublicationYear() + "\n"
					+ "Publisher: " + l_book.getPublisher() + "\n\n");
		}
	}

}
