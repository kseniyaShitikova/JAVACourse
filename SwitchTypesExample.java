public class SwitchTypesExample {
    public static void main(String[] args) {
        // byte
        byte b = 1;
        switch(b) { case 1: System.out.println("byte"); break; }
        
        // short
        short s = 2;
        switch(s) { case 2: System.out.println("short"); break; }
        
        // int
        int i = 3;
        switch(i) { case 3: System.out.println("int"); break; }
        
        // char
        char c = 'A';
        switch(c) { case 'A': System.out.println("char"); break; }
        
        // String
        String str = "hello";
        switch(str) { case "hello": System.out.println("String"); break; }
        
        // enum
        enum Color { RED, GREEN }
        Color color = Color.RED;
        switch(color) { case RED: System.out.println("enum"); break; }
        
        // обёртки (автораспаковка)
        Integer intWrapper = 4;
        switch(intWrapper) { case 4: System.out.println("Integer"); break; }
    }
}