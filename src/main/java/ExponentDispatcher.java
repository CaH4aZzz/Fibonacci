import constants.Messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExponentDispatcher {

    private ConsoleWorker consoleWorker = new ConsoleWorker(new BufferedReader(new InputStreamReader(System.in)));
    private Validator validator = new Validator();

    public void start() throws IOException {
        NumberManipulator manipulator = new NumberManipulator();
        String base = getParameter(Messages.BASE.getMessage());
        String exp = getParameter(Messages.EXP.getMessage());
        String result;
            result = String.valueOf(manipulator.getExponentialValue(Double.parseDouble(base), Integer.parseInt(exp)));

        if (result.endsWith(".0")){
            consoleWorker.print(Messages.RESULT.getMessage() + result.substring(0, result.length() - 2));
        }else {
            consoleWorker.print(Messages.RESULT.getMessage() + result);
        }
    }

    private String getParameter(String message) throws IOException{
        consoleWorker.print(message);
        String param = consoleWorker.getInput();
        try {
            validator.isValid(param);
        }catch (NumberFormatException e){
            consoleWorker.print(e.getMessage());
        }
        return param;
    }
}
