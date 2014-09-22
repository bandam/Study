
package firstproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application{
    public void start(Stage primaryStage){
        // Create a Scene and place a button in a the scene
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OK"));
        pane.getChildren().add(new Button("Andam"));
        
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Button in pane");
        primaryStage.show();
    }
    
    public static void main(String[] args){
        Application.launch(args);
    }
}
