import java.util.ArrayList;

public class AddBookCommand implements Command{
	
	Library m_library;

	public AddBookCommand(Library a_library) {
		m_library = a_library;
	}
	
	public void execute(ArrayList<String> a_commandArgs) {
		String l_author = "No author available";
		String l_title = "No title available";
		int l_edition = 0;
		int l_publicationYear = 0;
		String l_publisher = "No publisher available";

		int iter = 0;
		while (a_commandArgs.size() > iter) {
			String arg = a_commandArgs.get(iter);
			switch (arg) {
			case "-author":
			case "-a":
				l_author = a_commandArgs.get(++iter);
				break;
			case "-title":
			case "-t":
				l_title = a_commandArgs.get(++iter);
				break;
			case "-edition":
			case "-e":
				l_edition = Integer.parseInt(a_commandArgs.get(++iter));
				break;
			case "-publicationYear":
			case "-py":
				l_publicationYear = Integer.parseInt(a_commandArgs.get(++iter));
				break;
			case "-publisher":
			case "-p":
				l_publisher = a_commandArgs.get(++iter);
				break;
			default:
				// argument not recognised, display error

			}

			iter++;
		}

		Book l_book = new Book(l_author, l_title, l_edition, l_publicationYear, l_publisher);

		m_library.addBook(l_book);
	}
}
