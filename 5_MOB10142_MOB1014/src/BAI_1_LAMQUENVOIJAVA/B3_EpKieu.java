/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_LAMQUENVOIJAVA;

/**
 *
 * @author Dungna29
 */
public class B3_EpKieu {

    /*
        1. Ép kiểu từ String về Số
        2. Ép kiểu giữa các các số với nhau
     */
    public static void main(String[] args) {
       //1. Ép kiểu từ String về số
       String year = "2020",y = "1", kq;      
       //Thực hiện phép toán với kiểu dữ liệu String
       kq = year + y;//Hành động cộng chuỗi
        System.out.println("Năm hiện tại = " + kq);// 20201
       //Giải quyết vấn đề bằng cách ép kiểu chuỗi về số
        System.out.println("Năm hiện tại = " + 
                (Integer.parseInt(year) + Integer.parseInt(y)));//2021
        
        //Ngoài ra còn rất nhiều cách ép kiểu dữ liệu khác nhau từ String về số
        //Integer.parseInt(<String>)
        //Double.parseDouble(<String>)
        //Float.parseFloat(<String>)
        //Byte.parseByte(<String>)
        //..........
        
        //2. Ép kiểu giữa các số với nhau
        int a = 5;
        double b = 8.9;
        //b = a;//Ép kiểu tự động
        //a = b; Gây lỗi vì kiểu int bé hơn kiểu double
        a = (int) b;//Ép kiểu tường minh thì phần thập phân sẽ bị bỏ
        System.out.println(a);//=8
    }
}
