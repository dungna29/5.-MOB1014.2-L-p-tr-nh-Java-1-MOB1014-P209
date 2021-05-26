/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_4_Array_ArrayList_List;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B1_Array {

    /*
         * Phần 1: Mảng 1 chiều
         *
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
         *
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,valuen};//Khởi tạo mảng kiểu tường minh.
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lòng.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
     */
    public static void main(String[] args) {
       //Phần 1: Khai báo 1 mảng
       int a = 10;      
       int[] arrNumber1;
       int arrNumber2[] = {10,5,9,8,7};//Khởi tạo giá trị ngay khi khai báo
       String[] arrString1;
       double[] arrDouble;
       
       arrNumber1 = new int[5];//Khởi tạo kích thước mảng
       arrString1 = new String[10];//Khởi tạo kích thước mảng string
       
       //Phần 2: Gán giá trị cho mảng thì cần biết index
       //arrNumber1 = 5; //không xác định đưa giá 5 vào index
       arrNumber1[0] = 5;
       arrNumber1[1] = 8;
       arrNumber1[2] = 7;
       arrNumber1[0] = 10;//Ghi đè
       arrNumber1[3] = 99;
       arrNumber1[4] = 20;       
       
       arrString1[0] ="FPT";
       //Phần 3: Lấy giá trị
       //arrNumber1[0] = 1 giá trị của mảng có kiểu dữ liệu
        System.out.println(arrNumber1[0]);
        System.out.println(arrNumber1[1]);
        System.out.println(arrNumber1[2]);
        System.out.println(arrNumber1[3]);
        System.out.println(arrNumber1[4]);
        System.out.println("==============");
       //In nhiều giá trị
       //arrNumber1.length = độ dài mảng có kiểu số nguyên
        for (int i = 0; i < arrNumber1.length; i++) {
             System.out.print(arrNumber1[i] + " ");
        }
        System.out.println("");
        for (int abc : arrNumber1) {
             System.out.print(abc + " ");
        }
        System.out.println("");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        //byte c = 128;
        byte[] b = new byte[2];
        //b[0] = 128;
    }
}
