/**
 * Демонстрация преобразований между String, StringBuilder, StringBuffer
 */
public class StringConversionExample {
    public static void main(String[] args) {
        
        // ===== String -> StringBuilder =====
        String str = "Hello Java";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String -> StringBuilder: " + sb);
        
        // ===== String -> StringBuffer =====
        StringBuffer sbf = new StringBuffer(str);
        System.out.println("String -> StringBuffer: " + sbf);
        
        // ===== StringBuilder -> String =====
        StringBuilder sb2 = new StringBuilder("Welcome");
        String strFromSb = sb2.toString();
        System.out.println("StringBuilder -> String: " + strFromSb);
        
        // ===== StringBuffer -> String =====
        StringBuffer sbf2 = new StringBuffer("Programming");
        String strFromSbf = sbf2.toString();
        System.out.println("StringBuffer -> String: " + strFromSbf);
        
        // ===== StringBuilder -> StringBuffer =====
        StringBuilder sb3 = new StringBuilder("Convert me");
        StringBuffer sbf3 = new StringBuffer(sb3.toString());
        System.out.println("StringBuilder -> StringBuffer: " + sbf3);
        
        // ===== StringBuffer -> StringBuilder =====
        StringBuffer sbf4 = new StringBuffer("And me");
        StringBuilder sb4 = new StringBuilder(sbf4.toString());
        System.out.println("StringBuffer -> StringBuilder: " + sb4);
    }
}