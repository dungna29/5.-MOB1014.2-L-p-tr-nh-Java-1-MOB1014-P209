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
public class B5_CauLenhDieuKien_IF {

    /*
        Câu lệnh điều kiện IF dùng để đưa ra 1 điều kiện nào đó và 
        thực hiện 1 hành động bên trong IF nếu IF(true) 
        
        - Cách dùng: if + tab
        if (true) {
            Thực hiện 1 hành động nào đó với điều kiện if phải true
        }
     */
    public static void main(String[] args) {       
        if (true) {
            System.out.println("Thực hiện 1 hành động số 1");
        }
        if (false) {
            System.out.println("Thực hiện 1 hành động số 2");
        }

        //Bài tập mẫu: Viết 1 chương trình nhập số buổi nghỉ tại 
        //FPOLY đễ xác định mất 700k hay không?
        
        //Bước 1: Xác định số lượng biến cần phải sử dụng
        int nghi;//Khai báo biến nghỉ để hứng giá trị do người dùng nhập
        Scanner sc = new Scanner(System.in);
        //Bước 2: Nhập giá trị
        System.out.print("Mời bạn nhập số buổi nghỉ: ");
        nghi = Integer.parseInt(sc.nextLine());
        //Bước 3: Triển khai nghiệp vụ
        if (nghi>4) {
            System.out.println("Chúc mừng bạn mất 700k học lại");
            return;
        }
        System.out.println("Bạn nên nghỉ tiếp đi chưa sao đâu");
        
    }
}
