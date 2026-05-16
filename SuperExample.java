/**
 * Демонстрация трёх вариантов использования super
 */
public class SuperExample {
    
    class Parent {
        int value = 10;
        
        Parent() {
            System.out.println("Конструктор Parent");
        }
        
        Parent(int x) {
            System.out.println("Конструктор Parent с параметром: " + x);
        }
        
        void show() {
            System.out.println("Метод show() из Parent");
        }
    }
    
    class Child extends Parent {
        int value = 20;
        
        Child() {
            super();  // 1. вызов конструктора суперкласса
            System.out.println("Конструктор Child");
        }
        
        Child(int x) {
            super(x); // 1. вызов конструктора суперкласса с параметром
        }
        
        void display() {
            System.out.println(super.value); // 2. доступ к полю суперкласса (10)
            System.out.println(this.value);  // поле текущего класса (20)
        }
        
        @Override
        void show() {
            super.show(); // 3. доступ к методу суперкласса
            System.out.println("Метод show() из Child");
        }
    }
    
    public static void main(String[] args) {
        SuperExample outer = new SuperExample();
        Child child = outer.new Child();
        child.display();
        child.show();
    }
}