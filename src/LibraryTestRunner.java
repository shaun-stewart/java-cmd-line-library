import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class LibraryTestRunner {
	public static void main(String[] args) {
	    Result result = JUnitCore.runClasses(LibraryTestSuite.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }
	  }
}
