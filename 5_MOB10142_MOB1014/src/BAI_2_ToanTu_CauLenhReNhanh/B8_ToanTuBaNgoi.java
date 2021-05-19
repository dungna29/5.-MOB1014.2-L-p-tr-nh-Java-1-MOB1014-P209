/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_ToanTu_CauLenhReNhanh;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B8_ToanTuBaNgoi {

    /*
       Cách sử dụng:
        <Biểu thức> ? <Giá trị true> : <Giá trị false>;
        <Biểu thức>: Có thể có 1 hoặc nhiều biểu thức
        <Giá trị true>: Luôn nằm sau dấu ? và phụ thuộc vào kiểu dữ liệu của biến.
        <Giá trị false>: Luôn nằm sau dấu :    
     */
    public static void main(String[] args) {
        int temp1 = 5 > 2 ? 1 : 0;
        String temp2 = 5 > 2 ? "đúng" : "sai";
        boolean temp3 = 5 > 2 ? true : false;
        long temp4 = (5 > 2) && (3 < 4) ? 1 : 0;
        double temp5 = (5 > 2) && (3 < 4) ? 1 : 0;

        //Bài tập mẫu: Viết 1 chương trình nhập số buổi nghỉ tại 
        //FPOLY đễ xác định mất 700k hay không?
        //Bước 1: Xác định số lượng biến cần phải sử dụng
        int nghi;//Khai báo biến nghỉ để hứng giá trị do người dùng nhập
        Scanner sc = new Scanner(System.in);
        //Bước 2: Nhập giá trị
        System.out.print("Mời bạn nhập số buổi nghỉ: ");
        nghi = Integer.parseInt(sc.nextLine());
        String kq = nghi > 4 ? "Chúc mừng học lại" : "Nghỉ tiếp đi";
        System.out.println(kq);
    }
}
