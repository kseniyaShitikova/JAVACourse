/**
 * Рефакторинг кода с использованием this()
 */
public class ThisConstructorExample {
    
    class A {
        int a;
        int b;
        int c;
        int z;
        
        // Базовый конструктор с минимальным количеством параметров
        public A() {
            this(0, 0, 0);  // вызов конструктора с тремя параметрами
        }
        
        public A(int a) {
            this(a, 0, 0);  // вызов конструктора с тремя параметрами
        }
        
        public A(int a, int b) {
            this(a, b, 0);  // вызов конструктора с тремя параметрами
        }
        
        // Главный конструктор, инициализирующий все поля
        public A(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.z = 1;  // общая инициализация для всех конструкторов
        }
    }
}