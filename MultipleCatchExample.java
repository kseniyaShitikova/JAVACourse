/**
 * Демонстрация нескольких секций catch
 */
public class MultipleCatchExample {
    
    // Ситуация 1: несколько исключений обрабатываются идентично через |
    public static void identicalHandling() {
        try {
            // Может выбросить разные исключения
            String str = null;
            str.length();  // NullPointerException
            
            // int result = 10 / 0;  // ArithmeticException
            
        } catch (NullPointerException | ArithmeticException e) {
            // Оба исключения обрабатываются одинаково
            System.out.println("Исключение обработано одинаковым образом: " + e.getClass().getSimpleName());
        }
    }
    
    // Ситуация 2: иерархия Ex1 <|-- Ex2 <|-- Ex3
    // Создадим свои классы исключений для демонстрации
    static class Ex1 extends Exception { }
    static class Ex2 extends Ex1 { }
    static class Ex3 extends Ex2 { }
    
    public static void hierarchyHandling(int type) throws Ex1, Ex2, Ex3 {
        if (type == 1) throw new Ex1();
        if (type == 2) throw new Ex2();
        if (type == 3) throw new Ex3();
    }
    
    public static void main(String[] args) {
        // Ситуация 1
        System.out.println("--- Идентичная обработка ---");
        identicalHandling();
        
        // Ситуация 2: порядок catch от потомка к родителю
        System.out.println("\n--- Иерархия исключений ---");
        for (int i = 1; i <= 3; i++) {
            try {
                hierarchyHandling(i);
            } catch (Ex3 e) {
                System.out.println("Поймано Ex3 (самый конкретный)");
            } catch (Ex2 e) {
                System.out.println("Поймано Ex2 (средний)");
            } catch (Ex1 e) {
                System.out.println("Поймано Ex1 (самый общий)");
            }
        }
    }
}