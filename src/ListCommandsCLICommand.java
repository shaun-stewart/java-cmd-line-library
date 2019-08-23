import java.util.ArrayList;
import java.util.Map;

public class ListCommandsCLICommand implements CLICommand {

	Map<String, CLICommand> m_commands;

	public ListCommandsCLICommand(Map<String, CLICommand> a_commands) {
		m_commands = a_commands;
	}

	public void execute(ArrayList<String> a_commandArgs) {
		for (Map.Entry<String, CLICommand> entry : m_commands.entrySet() ) {
			String l_commandName = entry.getKey();
			String l_commandArgs = entry.getValue().getCommandLineArguments();
			System.out.println(l_commandName + "\t" + l_commandArgs);
		}
	}

	public String getCommandLineArguments() {
		return "";
	}
}
