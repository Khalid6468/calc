package com.crio.qcalc;

public class StandardCalculator {

    protected double result = 0;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }


    public final void add(int a, int b) {
        add((double)a, (double)b);
    }

    public final void subtract(int a, int b) {
        subtract((double)a, (double)b);
    }

    public final void multiply(int a, int b) {
        multiply((double)a, (double)b);
    }

    public final void divide(int a, int b) {
        divide((double)a, (double)b);
    }

    public final void add(double a, double b) {
        double result = a + b;
        if(result == Double.MAX_VALUE || result == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    public final void subtract(double a, double b) {
        double result = a - b;
        if(result == Double.MIN_VALUE || result == Double.NEGATIVE_INFINITY) {
            throw new ArithmeticException("Double underflow");
        }
        this.result = result;
    }

    public final void multiply(double a, double b) {
        double result = a*b;
        if(result == Double.MAX_VALUE || result == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Double overflow");
        }
        if(result == Double.MIN_VALUE || result == Double.NEGATIVE_INFINITY) {
            throw new ArithmeticException("Double underflow");
        }
        this.result = result;
    }

    public final void divide(double a, double b) {
        if(b == 0.0) {
            throw new ArithmeticException("Divide By Zero");
        }
        result = a/b;
    }

    public final double getResult() {
        return result;
    }

    public final void clearResult() {
        result = 0;
    }

    public void printResult() {
        System.out.println("Standard Calculator Result:" + result);
    }

}
