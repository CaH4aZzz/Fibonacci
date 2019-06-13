package controller;

import constants.Messages;
import view.ConsoleWorker;

import java.io.IOException;

public class ExponentDispatcher {

    private ConsoleWorker consoleWorker;
    private Validator validator;

    public ExponentDispatcher(ConsoleWorker consoleWorker, Validator validator) {
        this.consoleWorker = consoleWorker;
        this.validator = validator;
    }

    public void start() {
        NumberManipulator manipulator = new NumberManipulator();
        int base = 0;
        int exp = 0;
        try {
            base = getParameter(Messages.BASE.getMessage());
            exp = getParameter(Messages.EXP.getMessage());
            System.out.println(Math.pow(base, exp));
        } catch (Exception e) {
            consoleWorker.print(e);
        }

        String result = String.valueOf(manipulator.getExponentialValue(base, exp));
        if (result.endsWith(".0")) {
            consoleWorker.print(Messages.RESULT.getMessage() + result.substring(0, result.length() - 2));
        } else {
            consoleWorker.print(Messages.RESULT.getMessage() + result);
        }
    }

    private int getParameter(String message) throws IOException, NumberFormatException {
        consoleWorker.print(message);
        String param = consoleWorker.getInput();
        return validator.getValidValue(param);
    }
}
