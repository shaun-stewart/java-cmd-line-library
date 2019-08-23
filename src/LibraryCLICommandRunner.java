import java.util.ArrayList;

public class LibraryCLICommandRunner {

	static LibraryCLICommandGenerator m_libComGenny = new LibraryCLICommandGenerator();

	public void runCommand(String a_commandKey, ArrayList<String> a_args) {
		CLICommand l_command = m_libComGenny.getCommand(a_commandKey);
		if (l_command != (null)) {
			l_command.execute(a_args);
		} else {
			// throw error
		}
	}
}
