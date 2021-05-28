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
public class BAI_TAP_LAB_45 {

    /*
         * Bài tập ôn tập tổng hợp:
         * Viết 1 chương trình có menu sử dụng switch case và vòng lặp:
         *         ------Chương trình 1-------
         *       1. Bài 1
         *       2. Bài 2   (Sử dụng mảng)
         *       3. Bài 3  (Sử dụng List hoặc ArrayList)
         *       5. Thoát.
         
         * Giải thích:
         *1. Cho một mảng có sẵn  int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 }. 
        Hãy sử dụng thuật toán sắp xếp thông qua vòng lặp for để sắp xếp tăng dần và giảm dần lại mảng trên và in ra 2 mảng đó là chưa sắp xếp và đã sắp xếp.
         
         *2. Viết 1 chương trình nhập nhiều  thông tin của sinh viên POLY. 
        Mỗi sinh viên khi nhập vào cần các thông tin sau: Tên, Năm Sinh, Msv. 
        Sau khi người dùng nhập xong hết thông tin sinh viên cần thêm thì sẽ in tất cả ra màn hình lưu in thêm tuổi của mỗi sinh viên tương ứng     
        
         *  3. Nhập thông tin nhiều người yêu cũ: Nhập các thông tin của NY Cũ thông tin sau: Tên, Năm Sinh, Giới tính, Chiều cao (Sử dụng mảng)
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
