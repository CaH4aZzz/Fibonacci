package constants;

public enum Messages {

    BASE("Please enter value of the base :"),
    EXP("Please enter value of the exponent :"),
    RESULT("Exponential value = "),
    INSTRUCTION("The program displays exponential value of number <base> to a power <exponent>");

    private String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
