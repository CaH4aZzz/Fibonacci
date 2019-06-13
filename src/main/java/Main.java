import constants.Messages;
import controller.ExponentDispatcher;
import controller.Validator;
import view.ConsoleWorker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){
        ConsoleWorker consoleWorker = new ConsoleWorker(new BufferedReader(new InputStreamReader(System.in)));
        if (args.length == 0) {
            consoleWorker.print(Messages.INSTRUCTION.getMessage());
        }
        ExponentDispatcher dispatcher = new ExponentDispatcher(consoleWorker, new Validator());
        dispatcher.start();
    }
}