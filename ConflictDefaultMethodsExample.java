/**
 * Демонстрация конфликта default методов в интерфейсах
 */
public class ConflictDefaultMethodsExample {
    
    interface InterfaceA {
        default void show() {
            System.out.println("InterfaceA show");
        }
    }
    
    interface InterfaceB {
        default void show() {
            System.out.println("InterfaceB show");
        }
    }
    
    // Решение 1: переопределить конфликтующий метод в классе
    class MyClass implements InterfaceA, InterfaceB {
        @Override
        public void show() {
            // Явно указываем, какой метод вызывать
            InterfaceA.super.show();  // вызываем метод из InterfaceA
            // Или InterfaceB.super.show();
            System.out.println("MyClass own show");
        }
    }
    
    // Решение 2: использовать абстрактные классы (но это не для этого примера)
    
    public static void main(String[] args) {
        ConflictDefaultMethodsExample outer = new ConflictDefaultMethodsExample();
        MyClass obj = outer.new MyClass();
        obj.show();
    }
}