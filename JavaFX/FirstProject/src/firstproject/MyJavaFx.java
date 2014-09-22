
package firstproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFx extends Application{
    
    @Override // Override the start method in the application class
    public void start(Stage primaryStage){
        // Create a scene and place a button in the scene
        Button btOk = new Button("OK");
        Scene scene = new Scene(btOk, 200,150);
        primaryStage.setTitle("My First Fx application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args){
        Application.launch(args);
    }
}
