package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;

public class MyStage extends Stage {
    private BufferedReader reader;
    private PrintWriter writer;

    public MyStage(PipedInputStream pis,
                   PipedOutputStream pos, int x, int y) {
        super();
        this.reader = new BufferedReader(new InputStreamReader(pis));
        this.writer = new PrintWriter(pos, true);
        this.setX(x);
        this.setY(y);
        initialize();
    }

    private void send(TextArea ta, TextField tf) {
        String message = tf.getText();
        if (message.equals(""))
            return;
        // display
        ta.setText(
                ta.getText() + "YOU: " + message + "\n"
        );
        tf.clear();
        // send
        writer.println(message);
    }

    public void initialize() {
        this.setTitle("Hello World");
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 300, 275);
        this.setScene(scene);
        TextArea ta = new TextArea();
        ta.setEditable(false);
        root.getChildren().add(ta);

        ChatListener cl = new ChatListener(ta, reader);
        cl.setDaemon(true);
        cl.start();

        TextField tf = new TextField();
        tf.setLayoutY(200);
        tf.requestFocus();
        root.getChildren().add(tf);
        tf.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    send(ta, tf);
                }
            }
        });
        Button b = new Button("Send");
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                send(ta, tf);
            }
        });

        b.setLayoutY(230);
        root.getChildren().add(b);
    }
}
