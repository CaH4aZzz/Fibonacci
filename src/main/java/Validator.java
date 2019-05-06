import constants.Exceptions;

public class Validator {

    public boolean isValid(String param){
        if (param.length() < 1){
            throw new NumberFormatException(Exceptions.INPUT_LENGHT_LESS_THAN_ONE.getMessage());
        }
        return true;
    }



}
