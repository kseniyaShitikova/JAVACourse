import java.io.FileInputStream;
import java.io.IOException;

/**
 * Демонстрация работы метода read() класса InputStream
 */
public class InputStreamReadExample {
    public static void main(String[] args) {
        // Создаём временный файл для демонстрации
        String fileName = "test.txt";
        
        // Сначала запишем что-то в файл (чтобы было что читать)
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write("Hello".getBytes());
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
        
        // Чтение файла с помощью FileInputStream (подкласс InputStream)
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int data;
            // read() возвращает следующий байт или -1 при достижении конца
            while ((data = fis.read()) != -1) {
                char ch = (char) data;
                System.out.print("Байт: " + data + " -> символ: " + ch);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}