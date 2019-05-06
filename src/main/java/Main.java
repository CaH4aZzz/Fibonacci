import constants.Messages;
import controller.ExponentDispatcher;
import view.ConsoleWorker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            new ConsoleWorker(new BufferedReader(new InputStreamReader(System.in)))
                    .print(Messages.INSTRUCTION.getMessage());
        }
        ExponentDispatcher dispatcher = new ExponentDispatcher();
        dispatcher.start();
    }
}
