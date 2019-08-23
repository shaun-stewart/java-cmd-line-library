import java.util.ArrayList;

public class ShowUniqueTitlesForAuthorCLICommand extends ShowBookCLICommand implements CLICommand {

	Library m_library;

	public ShowUniqueTitlesForAuthorCLICommand(Library a_library) {
		m_library = a_library;
	}
	

	public void execute(ArrayList<String> a_commandArgs) {
		
		String l_author = "No author available";

		int iter = 0;
		while (a_commandArgs.size() > iter) {
			String arg = a_commandArgs.get(iter);
			switch (arg) {
			case "-author":
			case "-a":
				l_author = a_commandArgs.get(++iter);
				break;
			default:
				// argument not recognised, display error

			}

			iter++;
		}
		
		showBooks(m_library.getUniqueTitlesForAuthor(l_author));
	}

	public String getCommandLineArguments() {
		return "-a author";
	}
}
