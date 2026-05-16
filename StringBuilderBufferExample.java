/**
 * Демонстрация методов StringBuilder и StringBuffer
 */
public class StringBuilderBufferExample {
    public static void main(String[] args) {
        // Используем StringBuilder (аналогично для StringBuffer)
        StringBuilder sb = new StringBuilder("Hello");
        
        // 1. append() - добавляет строку в конец
        sb.append(" World");
        System.out.println("1. append(): " + sb);
        
        // 2. insert() - вставляет строку в указанную позицию
        sb.insert(5, ",");
        System.out.println("2. insert(): " + sb);
        
        // 3. delete() - удаляет символы с start по end
        sb.delete(5, 6);
        System.out.println("3. delete(): " + sb);
        
        // 4. deleteCharAt() - удаляет символ по индексу
        sb.deleteCharAt(5);
        System.out.println("4. deleteCharAt(): " + sb);
        
        // 5. replace() - заменяет часть строки
        sb.replace(6, 11, "Java");
        System.out.println("5. replace(): " + sb);
        
        // 6. reverse() - переворачивает строку
        sb.reverse();
        System.out.println("6. reverse(): " + sb);
        sb.reverse(); // возвращаем обратно
        
        // 7. length() - возвращает длину
        System.out.println("7. length(): " + sb.length());
        
        // 8. capacity() - возвращает текущую вместимость
        System.out.println("8. capacity(): " + sb.capacity());
        
        // 9. charAt() - возвращает символ по индексу
        System.out.println("9. charAt(1): " + sb.charAt(1));
        
        // 10. setCharAt() - заменяет символ по индексу
        sb.setCharAt(0, 'h');
        System.out.println("10. setCharAt(): " + sb);
        
        // Дополнительные методы
        // substring() - возвращает подстроку
        System.out.println("substring(1,4): " + sb.substring(1, 4));
        
        // indexOf() - поиск подстроки
        System.out.println("indexOf('ell'): " + sb.indexOf("ell"));
        
        // toString() - преобразование в String
        System.out.println("toString(): " + sb.toString());
    }
}