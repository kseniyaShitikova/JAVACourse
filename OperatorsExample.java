public class OperatorsExample {
    public static void main(String[] args) {
        // Базовые типы
        int a = 10, b = 3;
        int sum = a + b;           // +
        int diff = a - b;          // -
        int product = a * b;       // *
        int quotient = a / b;      // /
        int remainder = a % b;     // %
        
        // +=, -=, *=, /=, %=
        int x = 5;
        x += 3;   // x = 8
        x -= 2;   // x = 6
        x *= 2;   // x = 12
        x /= 4;   // x = 3
        x %= 2;   // x = 1
        
        // Логические и сравнение
        boolean eq = (a == b);      // false
        boolean ne = (a != b);      // true
        boolean gt = (a > b);       // true
        boolean lt = (a < b);       // false
        boolean ge = (a >= 10);     // true
        boolean le = (b <= 3);      // true
        
        // Логические операторы
        boolean and = (a > 5) && (b < 5);   // true && true = true
        boolean or = (a > 5) || (b > 10);   // true || false = true
        boolean xor = (a > 5) ^ (b > 10);   // true ^ false = true
        boolean not = !(a == b);            // !false = true
        
        // Побитовые
        int bitAnd = a & b;   // 1010 & 0011 = 0010 (2)
        int bitOr = a | b;    // 1010 | 0011 = 1011 (11)
        int bitXor = a ^ b;   // 1010 ^ 0011 = 1001 (9)
        int bitNot = ~a;      // ~1010 = 11110101 (-11)
        
        // Сдвиги
        int leftShift = a << 2;     // 10 << 2 = 40
        int rightShift = a >> 2;    // 10 >> 2 = 2
        int zeroFill = a >>> 2;     // 10 >>> 2 = 2
        
        // ++ и --
        int i = 5;
        int postInc = i++;    // postInc = 5, i = 6
        int preInc = ++i;     // i = 7, preInc = 7
        int postDec = i--;    // postDec = 7, i = 6
        int preDec = --i;     // i = 5, preDec = 5
        
        // Строки
        String s1 = "Hello";
        String s2 = "World";
        String concat = s1 + " " + s2;   // "Hello World"
        s1 += "!";                        // s1 = "Hello!"
        
        // Тернарный оператор
        int max = (a > b) ? a : b;   // max = 10
        
        // Приоритет
        int result = a + b * 2;      // 10 + 6 = 16 (сначала *)
        
        System.out.println("Done");
    }
}