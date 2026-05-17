/**
 * Мой класс исключения
 */
public class InvalidAgeException extends Exception {
    
    // Конструктор 1: без параметров
    public InvalidAgeException() {
        super();
    }
    
    // Конструктор 2: с сообщением об ошибке
    public InvalidAgeException(String message) {
        super(message);
    }
    
    // Конструктор 3: с сообщением и причиной (другим исключением)
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

/**
 * Демонстрация имоего исключения
 */
class InvalidAgeDemo {
    
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Некорректный возраст: " + age);
        }
        System.out.println("Возраст корректный: " + age);
    }
    
    public static void main(String[] args) {
        try {
            validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
        
        try {
            validateAge(200);
        } catch (InvalidAgeException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
        
        try {
            validateAge(25);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}