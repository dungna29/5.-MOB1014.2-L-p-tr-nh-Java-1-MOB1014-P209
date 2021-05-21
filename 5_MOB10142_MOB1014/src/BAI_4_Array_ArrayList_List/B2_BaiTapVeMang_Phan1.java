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
            Bài 1: Viết 1 chương trình cho người dùng nhập vào 1 mảng tên sau đó in ra màn hình          
            
        */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArr;
        String[] arrNames;//Khởi tạo
        
        System.out.println("Bạn muốn nhập vào bao nhiêu tên: ");
        sizeArr = Integer.parseInt(sc.nextLine());//Lấy kích thước mảng do người dùng nhập vào
        arrNames = new String[sizeArr];//Khởi tạo mảng theo kích thước do người dùng
        
        for (int i = 0; i < sizeArr; i++) {
            System.out.println("Mời bạn nhập tên thứ: " + i);
            arrNames[i] = sc.nextLine();//Gán giá trị cho mảng theo index
        }
        
        for (String x : arrNames) {
            System.out.print(x + " ");
        }
    }
}
