import java.util.ArrayList;

public class ShowAllBooksCLICommand extends ShowBookCLICommand implements CLICommand{
	
	Library m_library;

	public ShowAllBooksCLICommand(Library a_library) {
		m_library = a_library;
	}

	public void execute(ArrayList<String> a_commandArgs) {
		showBooks(m_library.getAllBooks());
	}
	
	public String getCommandLineArguments(){
		return "";
	}
}
