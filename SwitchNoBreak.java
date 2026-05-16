public class SwitchNoBreak {
    public static void main(String[] args) {
        int value = 2;
        int i = 0;
        
        switch(value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                // нет break - проваливается дальше
            case 3:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        
        System.out.println(i);  // 3
    }
}