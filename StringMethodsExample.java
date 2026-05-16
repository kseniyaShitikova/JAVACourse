/**
 * Демонстрация десяти методов класса String
 */
public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "   Java Programming Language   ";
        String str2 = "java programming language";
        
        // 1. length() - возвращает длину строки
        System.out.println("1. length(): " + str.length());
        
        // 2. trim() - удаляет пробелы в начале и конце строки
        System.out.println("2. trim(): '" + str.trim() + "'");
        
        // 3. toLowerCase() - преобразует все символы в нижний регистр
        System.out.println("3. toLowerCase(): " + str.toLowerCase());
        
        // 4. toUpperCase() - преобразует все символы в верхний регистр
        System.out.println("4. toUpperCase(): " + str.toUpperCase());
        
        // 5. equalsIgnoreCase() - сравнивает строки без учета регистра
        System.out.println("5. equalsIgnoreCase(): " + str.trim().equalsIgnoreCase(str2));
        
        // 6. charAt() - возвращает символ по указанному индексу
        System.out.println("6. charAt(5): " + str.charAt(5));
        
        // 7. substring() - возвращает подстроку
        System.out.println("7. substring(5, 15): " + str.substring(5, 15));
        
        // 8. indexOf() - возвращает индекс первого вхождения подстроки
        System.out.println("8. indexOf('Programming'): " + str.indexOf("Programming"));
        
        // 9. replace() - заменяет все вхождения символа/подстроки
        System.out.println("9. replace('a', 'o'): " + str.replace('a', 'o'));
        
        // 10. split() - разбивает строку на массив по разделителю
        String[] words = str.trim().split(" ");
        System.out.println("10. split(): " + java.util.Arrays.toString(words));
        
        // 11. contains() - проверяет наличие подстроки
        System.out.println("11. contains('Java'): " + str.contains("Java"));
        
        // 12. isEmpty() - проверяет, пустая ли строка
        System.out.println("12. isEmpty(): " + str.isEmpty());
    }
}