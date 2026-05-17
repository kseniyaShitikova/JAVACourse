/**
 * Демонстрация интерфейса AutoCloseable
 */
public class AutoCloseableExample {
    
    // Собственный класс, реализующий AutoCloseable
    static class CustomResource implements AutoCloseable {
        private String name;
        
        public CustomResource(String name) {
            this.name = name;
            System.out.println("Ресурс " + name + " создан");
        }
        
        public void doWork() {
            System.out.println("Ресурс " + name + " выполняет работу");
        }
        
        @Override
        public void close() throws Exception {
            System.out.println("Ресурс " + name + " закрыт");
        }
    }
    
    public static void main(String[] args) {
        // try-with-resources автоматически вызывает close()
        try (CustomResource res1 = new CustomResource("Файл1");
             CustomResource res2 = new CustomResource("Файл2")) {
            
            res1.doWork();
            res2.doWork();
            
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // Ресурсы будут автоматически закрыты даже при возникновении исключения
    }
}