package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public abstract class CalculatorServiceImpl implements CalculatorService {

    public String sum(int num1, int num2) {
        return String.format("%d + %d = %d", num1, num2, num1 + num2);
    }

    public String subtract(int num1, int num2) {
        return String.format("%d - %d = %d", num1, num2, num1 - num2);

    }

    public String multiply(int num1, int num2) {
        return String.format("%d * %d = %d", num1, num2, num1 * num2);

    }

    public String divide(double num1, double num2) {
        return String.format("%.2f / %.2f = %.2f", num1, num2, num1 / num2);
    }

    public void check(double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("<b>ОШИБКА:Деление на 0 запрещено</b>");
        }

    }
    public void check(Object... args) {
        for (Object arg : args) {
            if (arg == null) {
                throw new IllegalArgumentException("<b>Должны быть оба аргумента</b>");
            }

        }

    }
}