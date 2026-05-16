import java.util.StringJoiner;

/**
 * Демонстрация использования класса StringJoiner
 */
public class StringJoinerExample {
    public static void main(String[] args) {
        // Пример 1: объединение строк с разделителем
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Яблоко");
        joiner1.add("Груша");
        joiner1.add("Апельсин");
        System.out.println("Пример 1: " + joiner1);
        
        // Пример 2: с префиксом и суффиксом
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Понедельник");
        joiner2.add("Вторник");
        joiner2.add("Среда");
        System.out.println("Пример 2: " + joiner2);
        
        // Пример 3: объединение двух StringJoiner
        StringJoiner joiner3 = new StringJoiner(" | ");
        joiner3.add("Красный");
        joiner3.add("Синий");
        
        StringJoiner joiner4 = new StringJoiner(" | ");
        joiner4.add("Зеленый");
        joiner4.add("Желтый");
        
        joiner3.merge(joiner4);
        System.out.println("Пример 3: " + joiner3);
        
        // Пример 4: альтернатива через String.join()
        String joined = String.join("-", "2026", "05", "16");
        System.out.println("Пример 4 (String.join): " + joined);
    }
}