//Naranjavkhlan Tumenbold COP2805C Dr.Cash
//Display Images
//This program implements basic JavaFx to display images

package com.example.country_flags;

//Useful libraries
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.IOException;

public class displayFlags extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        //Creating a grid pane to store images/nodes
        GridPane pane = new GridPane();
        //File path to the image
        Image img = new Image("C:/Users/naran/IdeaProjects/country_flags/src/main/java/com/example/country_flags/images/deeznuts.jpg");
        //Double loop to add images/nodes to the grid pane with specific row and column values
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                pane.add(new ImageView(img), i , j);
            }
        }
        //Setting the scene, adding scene to the stage and displaying everything to the user
        Scene scene = new Scene(pane, 600,300);
        primaryStage.setTitle("country_flags");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}