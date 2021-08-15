package Package_5;

public class OOPCalculator {

    private Double var1;
    private Double var2;
    private Double result;
    private String operation;

    private boolean status;
    private int errorCode;

    final private String[] errors =
            {       " Ошибки отсутствуют",
                    " Ошибка: Переменные не указаны",
                    " Ошибка: Деление на 0",
                    " Ошибка: Оператор не указан",
                    " Ошибка: Введен некорректный оператор"
            };

    public OOPCalculator() { }

    public OOPCalculator(double var1, double var2, String operation) {
        this.var1 = var1;
        this.var2 = var2;
        this.operation = operation;
    }

    private void statusCheck() {

        status = false;
        errorCode = 0;

        if (var1 == null || var2 == null) errorCode = 1;
        else if (var2 == 0 && operation.equals("/")) errorCode = 2;
        else if (operation == null) errorCode = 3;
        else if (!operation.equals("+") && !operation.equals("-") &&
                !operation.equals("/") && !operation.equals("*")) errorCode = 4;
        else status = true;
    }

    private void countResult() {
        switch (operation){
            case "+":
                result = var1 + var2;
                break;
            case "-":
                result = var1 - var2;
                break;
            case "/":
                result = var1 / var2;
                break;
            case "*":
                result = var1 * var2;
                break;
            default:
                break;
        }
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

    public String getResult() {
        statusCheck();
        if (!status) return errors[errorCode];
        else {
            countResult();
            return " = " + result.toString();
        }
    }

    public String getOperation() {
        return operation;
    }

    public String getErrorStatus() {
        statusCheck();
        return errors[errorCode];
    }
}
