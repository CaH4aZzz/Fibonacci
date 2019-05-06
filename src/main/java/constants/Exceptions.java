package constants;

public enum Exceptions {
    INPUT_LENGHT_LESS_THAN_ONE("Empty input cannot be used as a parameter!");

    private String message;

    Exceptions(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
