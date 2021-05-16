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
        Scanner sc = new Scanner(System.in);
        //Bước 1: Xác định số lượng biến cần dùng
        int ns;
        String ten, msv;

        //Bước 2: Triển khai
        System.out.print("Mời bạn nhập tên:");
        ten = sc.nextLine();
        System.out.print("Mời bạn nhập năm sinh:");
        //ns = sc.nextInt();//Khi sử dụng next Số mà phía sau sau là nextLine()
        //Cách 1: Học để biết không nên dùng
        //sc.nextLine();        
        //Cách 2: Dùng thường xuyên
        ns = Integer.parseInt(sc.nextLine());
        System.out.print("Mời bạn nhập msv:");
        msv = sc.nextLine();
        
        //Bước 3: In ra màn hình
        System.out.printf("Tên: %s | Ns: %d | Msv: %s",ten,ns,msv);

    }

}
