/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class BaseType5 {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 5.5f;
        double d = 6.6;
        
        double result1 = b + f;     // byte + float = float, потом в double
        float result2 = s + f;      // short + float = float
        long result3 = i + l;       // int + long = long
        double result4 = i + d;     // int + double = double
        
        System.out.println("byte(10) + float(5.5) = " + result1);
        System.out.println("short(20) + float(5.5) = " + result2);
        System.out.println("int(30) + long(40) = " + result3);
        System.out.println("int(30) + double(6.6) = " + result4);
    }
}
