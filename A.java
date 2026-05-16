/**
 * Демонстрация всех вариантов вызова статического метода printVars()
 */
public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

class TestStaticCall {
    public static void main(String[] args) {
        // Вариант 1: через имя класса
        A.printVars();
        
        // Вариант 2: через объект класса
        A obj = new A();
        obj.printVars();
        
        // Вариант 3: без указания класса 
        // printVars();  // если вызвать внутри класса A
    }
}