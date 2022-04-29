package p8_textarea;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DemoTextArea extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		TextField textField = new TextField();
		ListView<String> listView = new ListView<>();
		listView.getItems().addAll(list);
		
		listView.
		
		BorderPane root = new BorderPane();
		root.setTop(textField);
		
		root.setCenter(listView);
		primaryStage.setScene(new Scene(root, 700, 500));
		primaryStage.show();
		
	}

	
}
