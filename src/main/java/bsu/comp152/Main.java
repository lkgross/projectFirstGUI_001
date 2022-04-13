package bsu.comp152;

import javafx.application.Application;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {

    public static void main(String[] args) {
        {
            // Launch an application.
            launch(args);
        }
    }

    @Override
    public void start(Stage primaryStage){
        // Set the window's title.
        primaryStage.setTitle("My First GUI Application");

        // Show the window.
        primaryStage.show();
    }
}
