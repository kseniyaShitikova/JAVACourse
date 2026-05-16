public class DecodeExample {
    public static void main(String[] args) {
        Integer dec1 = Integer.decode("123");       // десятичное
        Integer dec2 = Integer.decode("0x7B");      // шестнадцатеричное (123)
        Integer dec3 = Integer.decode("0173");      // восьмеричное (123)
        Integer dec4 = Integer.decode("#7B");       // шестнадцатеричное (123)
        
        System.out.println(dec1);  // 123
        System.out.println(dec2);  // 123
        System.out.println(dec3);  // 123
        System.out.println(dec4);  // 123
    }
}