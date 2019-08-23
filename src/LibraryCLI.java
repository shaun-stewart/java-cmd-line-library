import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LibraryCLI {

	// create a scanner so we can read the command-line input
	static Scanner m_scanner = new Scanner(System.in);

	private ArrayList<String> _parseInputString(String a_input) {
		ArrayList<String> l_parsedInput = new ArrayList<String>();

		Matcher m = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(a_input);
		while (m.find())
			l_parsedInput.add(m.group(1).replace("\"", ""));

		return l_parsedInput;
	}

	public void startUp() {
		LibraryCLICommandRunner l_libraryCommandRunner = new LibraryCLICommandRunner();

		// prompt for the user's name
		System.out.print("Welcome to the library.\n" + "To see a list of commands, enter 'ls'. \n"
				+ "Please enter a command to proceed. \n");

		while (true) {
			// get their input as a String
			String l_input = m_scanner.nextLine();
			
			if(l_input.equals("quit")) {
				break;
			}

			ArrayList<String> l_arguments = _parseInputString(l_input);
			String l_command = l_arguments.remove(0);

			l_libraryCommandRunner.runCommand(l_command, l_arguments);
		}
	}

}
