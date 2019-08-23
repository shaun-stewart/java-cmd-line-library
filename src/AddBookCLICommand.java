
public class AddBookCLICommand extends AddBookCommand implements CLICommand{

	public AddBookCLICommand(Library a_library) {
		super(a_library);
	}
	
	public String getCommandLineArguments(){
		return "-a author -t title -e edition -py publication year -p publisher";
	}
}
