/**
 * Демонстрация default и static методов в интерфейсе
 */
public class DefaultStaticInterfaceExample {
    
    // Интерфейс с default и static методами
    interface Calculator {
        // Абстрактный метод (должен быть реализован)
        int calculate(int a, int b);
        
        // Неабстрактный (default) метод
        default void showResult(int result) {
            System.out.println("Результат: " + result);
        }
        
        // Статический метод интерфейса
        static void info() {
            System.out.println("Калькулятор версии 1.0");
        }
    }
    
    // Класс, реализующий интерфейс
    class SumCalculator implements Calculator {
        @Override
        public int calculate(int a, int b) {
            return a + b;
        }
        
        // Можно переопределить default метод (но не обязательно)
        @Override
        public void showResult(int result) {
            System.out.println("Сумма равна: " + result);
        }
    }
    
    public static void main(String[] args) {
        // Вызов статического метода интерфейса
        Calculator.info();
        
        // Вызов методов через объект класса
        DefaultStaticInterfaceExample outer = new DefaultStaticInterfaceExample();
        SumCalculator calc = outer.new SumCalculator();
        
        int result = calc.calculate(5, 3);
        calc.showResult(result);
        
        // Вызов через ссылку типа интерфейса
        Calculator ref = calc;
        ref.showResult(ref.calculate(10, 20));
    }
}