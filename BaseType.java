
public class BaseType {
    static byte zeroByte;
    static short zeroShort;
    static int zeroInt;
    static long zeroLong;
    static float zeroFloat;
    static double zeroDouble;
    static char zeroChar;
    static boolean zeroBool;
    
    public static void main(String[] args) {
        // Нулевые значения (поля класса)
        System.out.println("Нулевые значения:");
        System.out.println("byte: " + zeroByte);
        System.out.println("short: " + zeroShort);
        System.out.println("int: " + zeroInt);
        System.out.println("long: " + zeroLong);
        System.out.println("float: " + zeroFloat);
        System.out.println("double: " + zeroDouble);
        System.out.println("char: " + zeroChar); // выведет пустой символ
        System.out.println("boolean: " + zeroBool);
        
        // Ненулевые значения
        byte b = 127;
        short s = 32000;
        int i = 1000000;
        long l = 9999999999L;
        float f = 3.14f;
        double d = 3.1415926535;
        char c = 'A';
        boolean bool = true;
        
        System.out.println("\nНенулевые значения:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}
