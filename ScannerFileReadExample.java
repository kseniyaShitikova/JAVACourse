import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Демонстрация чтения данных из текстового файла с помощью Scanner
 * 
 */
public class ScannerFileReadExample {
    public static void main(String[] args) {
        // Вариант 1: чтение всего файла целиком с разделителем
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("data.txt"));
            
            // Установка разделителя для чтения всего файла
            scanner.useDelimiter("\\Z");
            
            if (scanner.hasNext()) {
                String content = scanner.next();
                System.out.println("Содержимое файла:\n" + content);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        
        // Вариант 2: чтение слов из файла!!!
        try (Scanner scanner2 = new Scanner(new File("words.txt"))) {
            System.out.println("\nСлова из файла:");
            while (scanner2.hasNext()) {
                String word = scanner2.next();
                System.out.println(" - " + word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден");
        }
        
        // Вариант 3: чтение чисел с плавающей точкой
        try (Scanner scanner3 = new Scanner(new File("floats.txt"))) {
            double sum = 0;
            int count = 0;
            
            while (scanner3.hasNextDouble()) {
                sum += scanner3.nextDouble();
                count++;
            }
            
            System.out.println("\nСумма чисел: " + sum);
            System.out.println("Количество чисел: " + count);
            System.out.println("Среднее: " + (count > 0 ? sum / count : 0));
            
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден");
        }
    }
}