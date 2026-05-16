/**
 * Демонстрация невозможности переопределения final-метода
 */
public class FinalMethodExample {
    
    class Parent {
        // final-метод нельзя переопределить
        public final void cannotOverride() {
            System.out.println("Родительский final-метод");
        }
        
        public void canOverride() {
            System.out.println("Обычный метод");
        }
    }
    
    class Child extends Parent {
        // Попытка переопределить final-метод вызовет ошибку компиляции
        // public void cannotOverride() { } // Ошибка!
        
        // Обычный метод переопределить можно
        @Override
        public void canOverride() {
            System.out.println("Переопределённый метод");
        }
    }
}