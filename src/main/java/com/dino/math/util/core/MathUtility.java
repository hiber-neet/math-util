/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dino.math.util.core;

/**
 *
 * @author Administrator
 */
public class MathUtility {
    //hàm tính n! = 1.2.3.4...n
    //hàm là static vì tính xong là trả về thôi, không nhớ nhung gì cả
    //thường là các thư viện dùng static rất nhiều cho việc tính toán số liệu rồi trả về mà không lưu
    //lại gì cà
    
    //0! = 1! = 1
    // n = 0..20! vì n = 21! vượt 18 số không, 18 số không là đủ long
    public static long getFactorial(int n){
        long product = 1; // tich-ket qua pheo nhan
        
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid n . n must be in 1...20");
        }
        if(n == 0 || n == 1){
            return 1;
        }
//        for (int i = 1; i <= n; i++) {
//            product *= i;
//        }
        return n * getFactorial(n - 1);
        //recursion, gọi lại chính mình với 1 quy mô khác
    }
    
    // 4! = 4 * 3!
    //3! = 3 * 2!
    //2! = 2 * 1!
    //n! = n * (n - 1)! công thức đệ quy
}
