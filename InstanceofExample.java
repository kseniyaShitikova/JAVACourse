public class InstanceofExample {
    public static void main(String[] args) {
        // Примеры instanceof
        String str = "Hello";
        Integer num = 42;
        Object obj = str;
        
        System.out.println(str instanceof String);      // true
        System.out.println(str instanceof Object);      // true
        System.out.println(num instanceof Integer);     // true
        System.out.println(num instanceof Object);      // true
        System.out.println(obj instanceof String);      // true
        System.out.println(obj instanceof Integer);     // false
        
        // null с instanceof
        String nullStr = null;
        System.out.println(nullStr instanceof String);  // false (не выбрасывает исключение)
        
        // Проверка перед приведением
        Object unknown = "Text";
        if (unknown instanceof String) {
            String text = (String) unknown;
            System.out.println("Это строка: " + text);
        }
    }
}