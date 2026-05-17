/**
 * Демонстрация: одно исключение перехвачено, другое приводит к аварийной остановке
 */
public class TryCatchThrowsExample {
    
    // Метод, который генерирует исключение (не перехватывает, а пробрасывает)
    public static void causeCrash() {
        int[] arr = new int[2];
        int value = arr[5];  // ArrayIndexOutOfBoundsException - НЕ перехвачено
        System.out.println(value);
    }
    
    // Метод, который перехватывает исключение
    public static void handleException() {
        try {
            int result = 10 / 0;  // ArithmeticException - будет перехвачено
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено ArithmeticException: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // Это исключение будет перехвачено и обработано
        System.out.println("--- Обрабатываемое исключение ---");
        handleException();
        
        // Это исключение НЕ будет перехвачено - программа аварийно завершится
        System.out.println("\n--- Необрабатываемое исключение ---");
        causeCrash();
        
        // Этот код не выполнится из-за аварийной остановки
        System.out.println("Это сообщение не будет выведено");
    }
}