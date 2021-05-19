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
public class B7_CauLenhDieuKien_ELSE_IF {

    /*
        ELSE IF sử dụng trong trường hợp bài toán có nhiều điều kiện khác nhau và sẽ 
        thực hiện những hành động cũng khác nhau.
        
        Lưu ý: ELSE IF(TRUE) phải luôn đúng thì mới thỏa mãn vào bên trong nó tương tự như IF
        . Nhưng chỉ vào 1 điều kiện thỏa mãn không vào nhiều IF hoặc ELSE IF khi sử dụng.
        if (true) {
            //Thỏa mãn điều kiện IF(True)
            Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }else{
            Khi tất cả các trường hợp trên không thỏa mãn thì sẽ vào đây.
        }
     */
    public static void main(String[] args) {
        /*
            Viết 1 chương trình cho phép nhập điểm THI JAVA
            9 - 10 = Xuất sắc
            8 - 9 = Giỏi
            7 - 8 = khá
            5 - 7 = trung bình
            0 - 5 = Học lại
         */
        double diemThiJava;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm thi: ");
        diemThiJava = Double.parseDouble(sc.nextLine());
        if (diemThiJava >= 9 && diemThiJava <= 10) {
            System.out.println("Xuất sắc");
        }else if (diemThiJava >= 8 && diemThiJava < 9) {
            System.out.println("Giỏi");
        }else if (diemThiJava >= 7 && diemThiJava < 8) {
            System.out.println("Khá");
        }else if (diemThiJava >= 5 && diemThiJava < 7) {
            System.out.println("Trung bình");
        }else{
            System.out.println("Học lại");
        }
    }
}
