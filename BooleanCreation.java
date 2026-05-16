public class BooleanCreation {
    public static void main(String[] args) {
        // Способ 1: valueOf(boolean)
        Boolean b1 = Boolean.valueOf(true);
        
        // Способ 2: valueOf(String)
        Boolean b2 = Boolean.valueOf("true");
        Boolean b3 = Boolean.valueOf("TRUE");    // true
        Boolean b4 = Boolean.valueOf("false");   // false
        Boolean b5 = Boolean.valueOf("abc");     // false (не true)
        
        // Способ 3: parseBoolean(String)
        boolean primitive = Boolean.parseBoolean("true");
        Boolean b6 = Boolean.valueOf(primitive);
        
        // Способ 4: автоупаковка (boxing)
        Boolean b7 = true;
        
        // Способ 5: конструктор (устарел, но работает)
        @SuppressWarnings("deprecation")
        Boolean b8 = new Boolean(true);
    }
}