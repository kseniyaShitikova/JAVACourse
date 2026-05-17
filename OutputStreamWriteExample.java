import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Демонстрация работы метода write(int) класса OutputStream
 */
public class OutputStreamWriteExample {
    public static void main(String[] args) {
        String fileName = "output.txt";
        
        // Запись байтов в файл с помощью FileOutputStream (подкласс OutputStream)
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            // write(int) записывает один байт (младшие 8 бит)
            fos.write(65);  // 'A'
            fos.write(66);  // 'B'
            fos.write(67);  // 'C'
            fos.write(10);  // '\n' (новая строка)
            
            // Запись строки побайтно
            String text = "Hello Java";
            for (byte b : text.getBytes()) {
                fos.write(b);
            }
            
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
    }
}