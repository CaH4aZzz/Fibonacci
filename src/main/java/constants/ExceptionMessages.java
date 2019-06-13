package constants;

public enum ExceptionMessages {
    INPUT_LENGHT_LESS_THAN_ONE("Empty input cannot be used as a parameter!"),
    NUMBER_FORMAT("is not appropriate parameter. Please re-run application entering only natural Numbers");

    private String message;

    ExceptionMessages(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public String getMessage(String param) {
        return "< " + param + " > " + message;
    }
}
