package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        PipedOutputStream pos1 = new PipedOutputStream();
        PipedInputStream pis1 = new PipedInputStream(pos1);
        PipedOutputStream pos2 = new PipedOutputStream();
        PipedInputStream pis2 = new PipedInputStream(pos2);

        Stage stage1 = new MyStage(pis1, pos2, 0, 0);
        Stage stage2 = new MyStage(pis2, pos1, 600, 0);
        stage1.show();
        stage2.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
