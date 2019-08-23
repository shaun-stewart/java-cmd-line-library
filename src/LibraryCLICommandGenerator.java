import java.util.HashMap;
import java.util.Map;

public class LibraryCLICommandGenerator {

	Map<String, CLICommand> m_commands = new HashMap<String, CLICommand>();
	Library m_library = new Library();

	private void _registerCommands() {
		_registerCommand("addBook", new AddBookCLICommand(m_library));
		_registerCommand("removeBook", new RemoveBookCLICommand(m_library));
		_registerCommand("allBooks", new ShowAllBooksCLICommand(m_library));
		_registerCommand("forAuthor", new ShowUniqueTitlesForAuthorCLICommand(m_library));
		_registerCommand("numberOfCopies", new ShowNumberOfCopiesOfTitleAndEditionCLICommand(m_library));
		_registerCommand("ls", new ListCommandsCLICommand(getCommands()));
	}

	public void _registerCommand(String a_commandKey, CLICommand a_libCommand) {
		m_commands.put(a_commandKey, a_libCommand);
	}

	public LibraryCLICommandGenerator() {
		_registerCommands();
	}

	public CLICommand getCommand(String a_commandName) {
		return m_commands.get(a_commandName);
	}

	public Map<String, CLICommand> getCommands() {
		return m_commands;
	}

}
