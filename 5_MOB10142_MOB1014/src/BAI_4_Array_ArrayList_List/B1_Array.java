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
        //Phần 1: Khai báo
        int[] arrNumber1;//Khai báo 1 mảng
        int arrNumber2[];
        arrNumber2 = new int[5];//Khởi tạo ra 1 mảng có 5 phần tử
        
        String[] arrNames = new String[5];
        double[] diemJava1 = new double[]{8.6,8.7};
        double[] diemJava2 = {8.6,8.7};
        
        var arrYears = new int[5];
        var arrStrings = new String[5];
        
        //Phần 2: Gán giá trị cho mảng thì cần biết index
       //arrNumber2 = 5; không xác định đưa giá 5 vào index
       arrNumber2[0] = 5;//Gán giá trị tại index 0
       arrNumber2[1] = 7;
       arrNumber2[0] = 10;//Ghi đè
       
       //Phần 3: Lấy giá trị
        System.out.println(arrNumber2[0]);
        System.out.println(arrNumber2[1]);
        System.out.println(arrNumber2[2]);
        System.out.println(arrNumber2[3]);
        System.out.println(arrNumber2[4]);
        
        //In nhiều giá trị
        System.out.println("Kích thước của mảng" + arrNumber2.length);
        for (int i = 0; i < arrNumber2.length; i++) {
            System.out.print(arrNumber2[i] + " ");
        }
        
        System.out.println("");
        for (int x : arrNumber2) {
            System.out.print(x + " ");
        }
    }
}
