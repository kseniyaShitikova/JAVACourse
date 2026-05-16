/**
 * Демонстрация невозможности наследования от final-класса
 */
public class FinalClassExample {
    
    // final-класс - от него нельзя наследоваться
    final class FinalParent {
        public void someMethod() {
            System.out.println("Метод final-класса");
        }
    }
    
    // Попытка создать подкласс от final-класса вызовет ошибку компиляции
    // class Child extends FinalParent { } // Ошибка! Нельзя наследовать от final-класса
    
    class NormalParent {
        public void someMethod() {
            System.out.println("Обычный класс");
        }
    }
    
    // От обычного класса наследоваться можно
    class NormalChild extends NormalParent {
        @Override
        public void someMethod() {
            System.out.println("Подкласс обычного класса");
        }
    }
}