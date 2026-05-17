import java.util.Formatter;
import java.util.Calendar;

/**
 * Демонстрация спецификаторов для форматирования времени и даты
 */
public class DateTimeFormatterExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar cal = Calendar.getInstance();
        
        // %tY - год в четырехзначном формате
        formatter.format("1. Год: %tY%n", cal);
        
        // %tB - полное название месяца
        formatter.format("2. Месяц: %tB%n", cal);
        
        // %tA - полное название дня недели
        formatter.format("3. День недели: %tA%n", cal);
        
        // %tH - час (00-23)
        formatter.format("4. Час (24-часовой): %tH%n", cal);
        
        // %tM - минуты (00-59)
        formatter.format("5. Минуты: %tM%n", cal);
        
        System.out.print(formatter.toString());
        formatter.close();
    }
}