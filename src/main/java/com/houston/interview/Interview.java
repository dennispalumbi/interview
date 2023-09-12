/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.houston.interview;
import java.util.Scanner;

/**
 *
 * @author dens
 */
public class Interview {

    public static void main(String[] args) {
        int value1=scValues(1);
        int value2=scValues(2);
        int value3=scValues(3);
        String result="none";
        if(value1+value2==value3)
            result="+";
        if(value1-value2==value3)
            result+="-";
        if(value1*value2==value3)
            result+="*";
        if(value1/value2==value3)
            result+="/";
        
        
        System.out.println("kind operation result:"+result);  // Output user input
    }
    public static int scValues(int nparam){
        //Scanning Param
        Scanner v1 = new Scanner(System.in);  
        System.out.println("Enter param "+nparam);
        //Converting to INT Param 
        return  Integer.parseInt(v1.nextLine());
    }
    
    
}
