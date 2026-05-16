/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class BaseType6 {
    public static void main(String[] args) {
        long longVal = 150L;
        int intVal = (int) longVal;
        
        double doubleVal = 99.99;
        int intFromDouble = (int) doubleVal;
        
        int bigInt = 300;
        byte byteVal = (byte) bigInt;
        
        System.out.println("long 150 -> int: " + intVal);
        System.out.println("double 99.99 -> int: " + intFromDouble);
        System.out.println("int 300 -> byte: " + byteVal);
    }
}
