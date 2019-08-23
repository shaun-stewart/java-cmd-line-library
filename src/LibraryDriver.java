

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LibraryDriver extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	    Label label = new Label("Hello World");
        label.setAlignment(Pos.CENTER);
        Scene scene = new Scene(label, 500, 350);

        primaryStage.setTitle("Hello World Application");
        primaryStage.setScene(scene);
        primaryStage.show();
	}

//	public static void main(String[] args) {
//
//		LibraryCLI l_libraryCLI = new LibraryCLI();
//
//		l_libraryCLI.startUp();
//
//	}

}
