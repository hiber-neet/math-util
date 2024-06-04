/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.dino.math.util.main;

import com.dino.math.util.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class MathUtil1808 {

//    public static void main(String[] args) {
//        //Test Case 01
//        //N = 0, Ex Value: 1, Actual Value: ? Status: Passed/Failed
//        int n = 0;
//        long expectedValue = 1; // hi vọng 0! = 1
//        long actualValue; //= chờ hàm trả về
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("0! | Expected: " + expectedValue + " | Actual: " + actualValue);
//        
//        //Test Case 02
//        //N = 1, Ex Value: 1, Actual Value: ? Status: Passed/Failed
//        n = 1;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("1! | Expected: " + expectedValue + " | Actual: " + actualValue);
//        
//        //Test Case 03
//        //N = 5, Ex Value: 120, Actual Value: ? Status: Passed/Failed
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5! | Expected: " + expectedValue + " | Actual: " + actualValue);
//        
//        //Test Case 04
//        //N = -1, Ex Value: ngoại lệ được ném ra, Actual Value: ? Status: Passed/Failed
//        System.out.println("Check if the Illegal Argument Exception is thrown");
//        n = -1;
//        
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5! | Expected: " + expectedValue + " | Actual: " + actualValue);
//    }
    //psvm tạo nhanh hàm main
    public static void main(String[] args) {
        //Cách 2: Test hàm = cách popup

        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        String result = n + "! | Expected: " + expectedValue + " | Actual: " + actualValue;
        JOptionPane.showMessageDialog(null, result);
    }

}
