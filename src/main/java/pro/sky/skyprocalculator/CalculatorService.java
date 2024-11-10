package pro.sky.skyprocalculator;

public interface CalculatorService {
    String sum (int num1, int num2);
    String subtract (int num1, int num2);
    String multiply (int num1, int num2);
    String divide(double num1, double num2);
    void check(double num2);
    void check(Object... args);
}
