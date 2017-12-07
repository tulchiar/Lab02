package it.polito.tdp.alien;
	
import it.polito.tdp.alien.model.AlienDictionary;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Alien.fxml"));
			BorderPane root = (BorderPane)loader.load();
			
			AlienController controller = loader.getController();
			AlienDictionary alienDictionary = new AlienDictionary();
			controller.setAlienDictionary(alienDictionary);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
