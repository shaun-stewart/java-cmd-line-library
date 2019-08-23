
public class ShowNumberOfCopiesOfTitleAndEditionCLICommand extends ShowNumberOfCopiesOfTitleAndEditionCommand implements CLICommand{
	
	public ShowNumberOfCopiesOfTitleAndEditionCLICommand(Library a_library) {
		super(a_library);
	}
	
	public String getCommandLineArguments(){
		return "-t title -e edition";
	}
}
