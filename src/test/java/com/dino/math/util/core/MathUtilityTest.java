/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dino.math.util.core;

//quy tắc đặt tên package trong java
//tên miền công ty đảo ngược đi kèm thông tin dự án/project và các module nhỏ của 1 project
//com.tên_công_ty.tên_dự_án.module.Tên_Class
//com.microsoft.sqlserver.jdbc
//.Net: Chiều xuôi, chữ hoa từng đầu từ
//Microsoft.Sdk
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrator
 */
//class này chứa các test case dùng để test code của class chính bên MathUtility
public class MathUtilityTest {

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //Test Case là bộ data đầu vào + thao tác nhập xuất trên app, màn hình, trên hàm để verify 1 hàm, 1 màn hình, 1 chức năng chạy
    //đúng hay sai!! PE
    //Test Case #1: Check/test getF() with n = 0
    //*Input/Given n = 0;
    //*Step/Procedure(các bước để test)
    //call method getFactorial(n)
    //*Expected Result: 1 (hi vọng 0! = 1)
    //*Actual Result: ? chờ chạy hàm mới biết
    //*Status: Passed | Failed
    //chạy sẽ tự có hàm main
     //Framework nó ép ta phải viết code theo quy tắc của nó, khác với thư viện
    //thư viện cho viết tự do, gọi hàm theo thứ tự tự do
    //framework là thư viện nhưng thư viện không hẳn là framework
    @Test
    public void testFactorialGivenRightArg0ReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(0));
    }
    //Test Case #2: Check/test getF() with n = 1
    //*Input/Given n = 0;
    //*Step/Procedure(các bước để test)
    //call method getFactorial(n)
    //*Expected Result: 1 (hi vọng 1! = 1)
    //*Actual Result: ? chờ chạy hàm mới biết
    //*Status: Passed | Failed
    @Test
    public void testFactorialGivenRightArg1ReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    //Test Case #3: Check/test getF() with n = 5
    //*Input/Given n = 0;
    //*Step/Procedure(các bước để test)
    //call method getFactorial(n)
    //*Expected Result: 120 (hi vọng 5! = 120)
    //*Actual Result: ? chờ chạy hàm mới biết
    //*Status: Passed | Failed
    @Test
    public void testFactorialGivenRightArg5ReturnsWell() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    //một @Test là 1 test case
    //Test Case 4
    @Test
    public void testFactorialGivenRightArg12345ReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    //thấy ngoại lệ là mừng
    //Test Case 5: Check getF() with n = -1, the method throw Exception
    @Test
    public void testFactorialGivenWrongArgMinusOneThrowException(){
        //MathUtility.getFactorial(-1);
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
        //ngoại lệ không thể so sánh
    }
}
