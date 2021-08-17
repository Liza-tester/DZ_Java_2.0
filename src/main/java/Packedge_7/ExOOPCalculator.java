package Packedge_7;

import java.util.NoSuchElementException;

public class ExOOPCalculator {

    private Double var1;
    private Double var2;
    private Double result;
    private String operation;

    public ExOOPCalculator() {
    }

    public ExOOPCalculator(double var1, double var2, String operation) {
        this.var1 = var1;
        this.var2 = var2;
        this.operation = operation;
    }

    public String getResult() {

        try {
        switch (operation) {
            case "+":
                result = var1 + var2;
                break;
            case "-":
                result = var1 - var2;
                break;
            case "/":
                result = var1 / var2;
                if (var2==0) throw new ArithmeticException();
                break;
            case "*":
                result = var1 * var2;
                break;
            default:
                throw new NoSuchElementException(); }
        }catch (ArithmeticException e1) { return "\nERROR: " + e1.toString() + " Деление на 0";}
        catch (NoSuchElementException e2) {return "\nERROR: " + e2.toString() + " Недопустимый оператор";}
        catch (NullPointerException e3) {return "\nERROR: " + e3.toString() + " Отсутствуют переменные или оператор";}
        return " = " + result;
    }

    public void setVar1(double var1) {
        this.var1 = var1;
    }

    public void setVar2(double var2) {
        this.var2 = var2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double getVar1() {
        return var1;
    }

    public Double getVar2() {
        return var2;
    }

    public String getOperation() {
        return operation;
    }
}