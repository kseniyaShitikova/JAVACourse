/**
 * Демонстрация генерации и обработки исключений
 */
public class ExceptionHandlingExample {
    
    // 1. ArithmeticException - деление на ноль
    public static void arithmeticExceptionExample() {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException поймано: " + e.getMessage());
        }
    }
    
    // 2. ArrayIndexOutOfBoundsException - выход за границы массива
    public static void arrayIndexOutOfBoundsExample() {
        try {
            int[] arr = new int[3];
            int value = arr[5]; // индексы 0,1,2, а запрошен 5
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException поймано: " + e.getMessage());
        }
    }
    
    // 3. IllegalArgumentException - недопустимый аргумент
    public static void illegalArgumentExceptionExample() {
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException поймано: " + e.getMessage());
        }
    }
    
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
        System.out.println("Возраст: " + age);
    }
    
    // 4. ClassCastException - некорректное приведение типов
    public static void classCastExceptionExample() {
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // String нельзя привести к Integer
            System.out.println(num);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException поймано: " + e.getMessage());
        }
    }
    
    // 5. NullPointerException - обращение к null-ссылке
    public static void nullPointerExceptionExample() {
        try {
            String str = null;
            int length = str.length(); // вызов метода на null
            System.out.println(length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException поймано: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println(" ArithmeticException:");
        arithmeticExceptionExample();
        
        System.out.println("\nArrayIndexOutOfBoundsException:");
        arrayIndexOutOfBoundsExample();
        
        System.out.println("\n IllegalArgumentException:");
        illegalArgumentExceptionExample();
        
        System.out.println("\nClassCastException:");
        classCastExceptionExample();
        
        System.out.println("\nNullPointerException:");
        nullPointerExceptionExample();
    }
}