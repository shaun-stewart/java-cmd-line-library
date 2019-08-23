
public class RemoveBookCLICommand extends RemoveBookCommand implements CLICommand{

	public RemoveBookCLICommand(Library a_library) {
		super(a_library);
	}
	
	public String getCommandLineArguments(){
		return "-a author -t title -e edition -py publication year -p publisher";
	}
}
