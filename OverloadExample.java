/**
 * Пример перегруженных методов
 */
public class OverloadExample {
    
    // Методы с одинаковым именем, но разными параметрами
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        System.out.println(obj.multiply(2, 3));        // 6 (int, int)
        System.out.println(obj.multiply(2, 3, 4));     // 24 (int, int, int)
        System.out.println(obj.multiply(2.5, 3.5));    // 8.75 (double, double)
    }
}