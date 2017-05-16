package sample;

import javafx.application.Platform;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;

/**
 * Created by ma on 16.05.2017.
 */
public class ChatListener extends Thread {
    private TextArea textArea;
    private BufferedReader reader;
    public ChatListener(TextArea t, BufferedReader r) {
        textArea = t;
        reader = r;
    }
    public void run() {
        while (true) {
            try {
                System.out.println("W");
                String line = reader.readLine();
                Platform.runLater(new Runnable() {
                    @Override public void run() {
                        textArea.setText(
                                textArea.getText() + "GUEST: " + line + "\n"
                        );
                    }
                });

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
