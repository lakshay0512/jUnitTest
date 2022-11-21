package jUnitTestPackage;
import java.io.*;
import java.util.*;
public class jUnitFunctions {
	public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int x = sn.nextInt();
        
        System.out.println("Enter the second number:");
        int y = sn.nextInt();
        
        int sum = sumFunction(x,y);
        System.out.println("Sum is: " + sum);
    }
    
    public static int sumFunction(int x, int y){
        return x + y;
    }
}
