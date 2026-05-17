import java.util.Formatter;

/**
 * Демонстрация использования спецификаторов форматирования
 */
public class FormatterExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        
        
        formatter.format("1. Десятичное число: %d%n", 42);        
        formatter.format("2. Число с плавающей точкой: %.2f%n", 3.14159);        
        formatter.format("3. Строка: %s%n", "Java Programming");        
        formatter.format("4. Логическое значение: %b%n", true);        
        formatter.format("5. Знак процента: 50%%%n");        
        System.out.print(formatter.toString());
        formatter.close();
    }
}