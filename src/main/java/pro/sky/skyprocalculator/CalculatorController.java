package pro.sky.skyprocalculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hallo() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @GetMapping(path = "/plus")
    public String sum(@RequestParam(value = "num1", required = false) Integer num1,
                      @RequestParam(value = "num2", required = false) Integer num2) {
        calculatorService.check(num1, num2);
        return calculatorService.sum(num1, num2);

    }

    @GetMapping(path = "/minus")
    public String subtract(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        calculatorService.check(num1, num2);
        return calculatorService.subtract(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam(value = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2) {
        calculatorService.check(num1, num2);
        return calculatorService.multiply(num1, num2);

    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam(value = "num1", required = false) Double num1,
                           @RequestParam(value = "num2", required = false) Double num2) {
        calculatorService.check(num1, num2);
        calculatorService.check(num2);
        return calculatorService.divide(num1, num2);
    }


}
