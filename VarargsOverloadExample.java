/**
 * Демонстрация перегрузки методов с переменным числом параметров
 */
public class VarargsOverloadExample {
    
    // Вариант 1: параметры типа int
    public void print(String prefix, int... numbers) {
        System.out.print(prefix + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Вариант 2: параметры типа String
    public void print(String prefix, String... strings) {
        System.out.print(prefix + ": ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    
    // Вариант 3: параметры типа double
    public void print(String prefix, double... doubles) {
        System.out.print(prefix + ": ");
        for (double d : doubles) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
    
    // Вариант 4: параметры типа Object (обобщённый)
    public void print(String prefix, Object... objects) {
        System.out.print(prefix + ": ");
        for (Object obj : objects) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        VarargsOverloadExample obj = new VarargsOverloadExample();
        
        // Вызов перегруженных методов - ошибка компиляции
        obj.print("Числа", 1, 2, 3, 4);  // int...
        obj.print("Строки", "A", "B", "C");  // String...
        obj.print("Дроби", 1.1, 2.2, 3.3);  // double...
        obj.print("Объекты", 1, "текст", 3.14);// Object...
    }
}