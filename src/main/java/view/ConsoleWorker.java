package view;

import java.io.BufferedReader;
import java.io.IOException;

public class ConsoleWorker {

    private BufferedReader reader;

    public ConsoleWorker(BufferedReader reader) {
        this.reader = reader;
    }

    public void print(String message){
        System.out.println(message);
    }

    public void print(Exception e){
        System.out.println(e.getMessage());
    }

    public String getInput() throws IOException {
        return reader.readLine();
    }
}
