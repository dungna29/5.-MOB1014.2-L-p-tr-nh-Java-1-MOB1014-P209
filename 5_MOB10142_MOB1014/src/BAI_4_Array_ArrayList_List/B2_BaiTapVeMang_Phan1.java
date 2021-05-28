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
public class B2_BaiTapVeMang_Phan1 {

    /*
            Bài 1: Viết 1 chương trình cho người dùng nhập vào 1 mảng tên
            sau đó in ra màn hình          
            
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {        
        String[] arrNames;//Khai báo mảng tên
        String input;//Biến người dùng nhập
        System.out.println("Ông muốn bao nhiêu tên: ");
        input = sc.nextLine();
        //Sau khi lấy được số lượng người dùng muốn sẽ khởi tạo kích thước mảng
        arrNames = new String[Integer.parseInt(input)];
        
        //Sử dụng vòng lặp để nhập
        for (int i = 0; i < arrNames.length; i++) {
            System.out.println("Mời bạn nhập vào index: " + i);
            arrNames[i] =sc.nextLine();
        }
        
        for (String x : arrNames) {
            System.out.print(x + "");
        }
       
    }
     /*
        Bài 1: Viết 1 chương trình cho phép người dùng nhập
        vào bao nhiêu số tùy thích. Sau khi nhập xong in ra màn
        hình các số chẵn trên 1 dòng và số lẻ trên 1 dòng.
        
        Bài 2: Viết 1 chương trình cho phép người dùng nhập 
        vào 1 dãy điểm. In ra màn hình dãy điểm người vừa nhập 
        và bệnh cạnh mỗi 1 đầu điểm thông báo Trượt hoặc đỗ dựa
        trên điều kiện điểm đỗ >=5 và Trượt <5.
        */
    static void Bai1(){
        int[] arrNumber;
        String input;
        System.out.println("Mời bạn nhập số lượng: ");
        input = sc.nextLine();
        arrNumber = new int[Integer.parseInt(input)];
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("Mời bạn nhập index thứ %d: ",i);
            arrNumber[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Các số chẵn bạn vừa nhập: ");
        for (int x : arrNumber) {
            if (x%2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
        System.out.println("Các số lẻ bạn vừa nhập: ");
         for (int x : arrNumber) {
            if (x%2 != 0) {
                System.out.print(x + " ");
            }
        }
        
    }
}
