/**
 * Демонстрация перечисления с дополнительным методом
 */
public class CustomEnumExample {
    
    enum Level {
        LOW(1, "Низкий"),
        MEDIUM(2, "Средний"),
        HIGH(3, "Высокий");
        
        private final int code;
        private final String description;
        
        Level(int code, String description) {
            this.code = code;
            this.description = description;
        }
        
        public int getCode() { return code; }
        public String getDescription() { return description; }
        
        // Дополнительный метод
        public boolean isGreaterThan(Level other) {
            return this.code > other.code;
        }
        
        public static Level fromCode(int code) {
            for (Level level : Level.values()) {
                if (level.code == code) {
                    return level;
                }
            }
            return null;
        }
    }
    
    public static void main(String[] args) {
        Level current = Level.MEDIUM;
        
        System.out.println("Текущий уровень: " + current);
        System.out.println("Код: " + current.getCode());
        System.out.println("Описание: " + current.getDescription());
        System.out.println("Выше чем LOW? " + current.isGreaterThan(Level.LOW));
        System.out.println("Уровень с кодом 3: " + Level.fromCode(3));
    }
}