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
public class B6_CauLenhDieuKien_IF_ELSE {

    /*
        Bài số 6: Câu lệnh điều kiện IF ELSE (NẾU THÌ)
        Định nghĩa: Thực hiện 1 hành động khi thỏa mãn IF(TRUE) và nếu không thỏa mãn IF
        thì sẽ luôn vào ELSE.
        if (true) {
            Thực hiện 1 hành động nếu thỏa mãn điều kiện của IF
        }else{
            Tất cả các trường hợp không thỏa mãn IF sẽ vào ELSE
            Thực hiện 1 hành động nào đó.
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
        Không sử dụng If thường, Không dùng return, Không Esle IF.
        Chỉ được dùng IF ELSE - 8h15 thầy sẽ giải
         */
        double diemThiJava;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm thi: ");
        diemThiJava = Double.parseDouble(sc.nextLine());
        if (diemThiJava >= 9 && diemThiJava <= 10) {
            System.out.println("Xuất sắc");
        } else {
            if (diemThiJava >= 8 && diemThiJava < 9) {
                System.out.println("Giỏi");
            } else {
                if (diemThiJava >= 7 && diemThiJava < 8) {
                    System.out.println("Khá");
                } else {
                    if (diemThiJava >= 5 && diemThiJava < 7) {
                        System.out.println("Trung bình");
                    } else {
                        System.out.println("Học lại nhé");
                    }
                }
            }
        }
    }
}
