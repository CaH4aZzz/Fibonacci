package controller;

public class NumberManipulator {

    public double getExponentialValue(int base, int exponent){

        double result;
        if (exponent < 0){
            result = 1 / calculation(base, -exponent);
        } else{
            result = calculation(base, exponent);
        }
        return result;
    }

    private double calculation(int base, int exponent){
        if (exponent == 0){
            return 1;
        }
        return base * getExponentialValue(base, exponent - 1);
    }
}
