
import java.util.ArrayList;

public class ShowNumberOfCopiesOfTitleAndEditionCommand implements Command {

	Library m_library;
	
	public ShowNumberOfCopiesOfTitleAndEditionCommand(Library a_library) {
		m_library = a_library;
	}

	public void execute(ArrayList<String> a_commandArgs) {
		String l_title = "No title available";
		int l_edition = 0;

		int iter = 0;
		while (a_commandArgs.size() > iter) {
			String arg = a_commandArgs.get(iter);
			switch (arg) {
			case "-title":
			case "-t":
				l_title = a_commandArgs.get(++iter);
				break;
			case "-edition":
			case "-e":
				l_edition = Integer.parseInt(a_commandArgs.get(++iter));
				break;
			default:
				// argument not recognised, display error

			}

			iter++;
		}

		long l_numOfCopies = m_library.getNumberOfCopiesOfTitleAndEdition(l_title, l_edition);
		
		System.out.print(l_numOfCopies + " copies of " + l_title + " (Edition: " + l_edition + ") \n\n");
	}

	
}
