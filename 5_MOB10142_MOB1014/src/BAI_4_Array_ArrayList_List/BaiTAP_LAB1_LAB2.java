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
public class BaiTAP_LAB1_LAB2 {

    /*
         * Bài tập ôn tập tổng hợp:
         * Viết 1 chương trình có menu sử dụng switch case và vòng lặp:
         *         ------Chương trình 1-------
         *       1. In bảng cửu chương đơn
         *       2. In bảng cửu theo khoảng
         *       3. Kiểm tra học lực Sinh Viên Poly
         *       4. Nhập thông tin người yêu cũ
         *       5. Thoát.
         
         * Giải thích:
         *1. In bảng cửu chương đơn: Mời người dùng nhập vào tên 1 bảng cửu chương mà họ muốn sau đó in ra màn hình.
         
         *2. In bảng cửu theo khoảng: Mời người dùng nhập vào tên bảng cửu chương theo khoảng. Ví dụ: từ bảng nhân 5 đến nhân 8.
         
         *3. Kiểm tra học lực Sinh Viên Poly: Cho sinh viên POLY nhập vào điểm tổng kết môn C# và thông báo xếp loại học lực:
         *  diem<=5 --> Yếu
         *  diem<=7 --> Khá 
         *  diem<=8 --> Tiên Tiến
         *  diem<=9 --> Giỏi
         *  diem<=10 --> Xuất sắc
         
         *  4. Nhập thông tin nhiều người yêu cũ: Nhập các thông tin của NY Cũ thông tin sau: Tên, Năm Sinh, Giới tính, Chiều cao (Sử dụng mảng)
         * - Tên người yêu:
         * - Năm sinh:
         * - Tuổi người yêu:         
         * - Giới tính:            
         * - Chiều cao:          
           
        THANG ĐIỂM LẤY ĐIỂM LAB:
        - Làm đủ và đúng các mục đề bài đưa ra là: 8 điểm
        - Clean Code + || - 1 ĐIỂM
        - Áp dụng được kiến thức của đầu bài đưa ra + || - 1 Điểm
        - Copy bài có sẵn hoặc copy code ở bài cũ vào mặc định 0 điểm.
     */
    static String input;
    static String[] arrName;
    static int[] namSinh;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Thêm thông tin");
            System.out.println("2. Xuất thông tin");
            System.out.println("Mời bạn chọn chức năng: ");
            input = sc.nextLine();
            switch (input) {
                case "1":      
                    nhapTT();
                    break;
                case "2":
                    for (int i = 0; i < arrName.length; i++) {
                        System.out.println(arrName[i] + namSinh[i]);
                    }
                    break;
                default:
                    System.out.println("");
            }
        }
    }

    static void nhapTT() {
        System.out.println("Bạn muốn nhập bao nhiêu? ");
        input = sc.nextLine();
        arrName = new String[Integer.parseInt(input)];
        namSinh = new int[Integer.parseInt(input)];
        for (int i = 0; i < arrName.length; i++) {
            System.out.println("Mời bạn nhập tên: ");
            arrName[i] = sc.nextLine();
            System.out.println("Mời bạn nhập năm sinh: ");
            namSinh[i] = Integer.parseInt(sc.nextLine());
        }
    }
}
