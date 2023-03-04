public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.print("Результат сложения равен: ");
        calculator.sum(7,3);
        System.out.print("Результат вычитания равен: ");
        calculator.subtraction(4,3);
        System.out.print("Результат умножения равен: ");
        calculator.multiplication(2,3);
        System.out.print("Результат деления равен: ");
        calculator.division(8,2);


    }
}