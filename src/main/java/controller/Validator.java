package controller;

import constants.ExceptionMessages;

public class Validator {

    public int getValidValue(String param){
        if (param.length() < 1){
            throw new NumberFormatException(ExceptionMessages.INPUT_LENGHT_LESS_THAN_ONE.getMessage());
        }

        try {
            return Integer.parseInt(param);
        }catch (NumberFormatException e){
            throw new NumberFormatException(ExceptionMessages.NUMBER_FORMAT.getMessage(param));
        }
    }
}
