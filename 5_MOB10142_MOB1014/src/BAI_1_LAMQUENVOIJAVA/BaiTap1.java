/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_LAMQUENVOIJAVA;

import java.util.Scanner;



/**
 *
 * @author Dungna29
 */
public class BaiTap1 {

    static int _a;

    /*
     Bài 1: Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên 
        từ bàn phím và xuất ra định dạng sau: 
	“Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> 
        đến với chương trình java đầu tiên.”
     */
    //psvm + tab
    public static void main(String[] args) {
        //Phần 1: Khai báo biến
        String ten,msv;
        int namsinh;
        //Phần 2: Khai báo Scanner
        Scanner sc = new Scanner(System.in);
        //Phần 3: Triển khai
        System.out.println("Mời bạn nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Mời bạn nhập năm sinh: ");
        //Cách số 1: Xử lý trôi lệnh
//        namsinh = sc.nextInt();
//        sc.nextLine();
        //Cách số 2: Ép kiểu để chống trôi lệnh
        namsinh = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập mã sinh viên: ");
        msv = sc.nextLine();
        System.out.printf("Tên: %s | Năm sinh: %d | Msv: %s",
                ten,namsinh,msv);
    }

}
