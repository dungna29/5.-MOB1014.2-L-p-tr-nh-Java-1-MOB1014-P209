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
public class B9_Switch_Case {

    /*
       Switch Case là 1 câu lệnh rẽ nhánh
        
       Công thức: sw + tab
    
        switch (<Biểu thức>) {
            case <Giá trị 1>:  
                Thực hiện 1 hành động nào đó
                break; - Sau khi thực hiện 1 hành động xong thì sẽ thoát khỏi Switch
            case <Giá trị 2>:                
                break;
            ..........
            case <Giá trị n>:                
                break;
            default:
                Khi chọn các case không thỏa mãn thì sẽ chạy vào đây                
        }
     */
    public static void main(String[] args) {
        //Ví dụ 1: Đầu vào là int
        int choice = 1;
        switch (choice) {
            case 1://Case sẽ không trùng nhau
                //Thực hiện 1 hành động nào đó
                break;//Nếu không dùng break sau khi
            //thực hiện hành động case 2 thì sẽ tìm đến break tiếp theo
            case 2:
                //Thực hiện 1 hành động nào đó
                break;
            case 3:
                //Thực hiện 1 hành động nào đó
                break;
            default:
                //Khi không thỏa mãn các case trên sẽ vào đây
                System.out.println("Chức năng bạn chọn không tồn tại");
        }
        //Ví dụ 2: đầu vào là char
        char c = '2';
        switch (c) {
            case '1':
                break;
            case '2':
                break;
            case '3':
                break;
            default:

        }
        //Ví dụ 3: đầu vào là string
        String s = "1";
        switch (s) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            default:

        }

        /*
        Bài 1: Xây dựng 1 chương trình máy tính bỏ túi cho phép toán với 2 số
        gồm các chức năng sau: (Phải sử dụng Switch Case)
            a. Phép cộng
            b. Phép trừ
            c. Phép nhân
            d. Phép chia
         */
        //Bước 1: Xác định số lượng biến
        int a, b;
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số thứ 1: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập số thứ 2: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Chương trình máy tính");
        System.out.println("a. Phép cộng");
        System.out.println("b. Phép trừ");
        System.out.println("c. Phép nhân");
        System.out.println("d. Phép chia");
        System.out.println("Mời bạn chọn chức năng: ");
        input = sc.nextLine();
        switch (input) {
            case "1":
                System.out.printf("Phép cộng: %d + %d = %d\n",
                        a,b,a+b);
                break;
            case "2":
                System.out.printf("Phép trừ: %d - %d = %d\n",
                        a,b,a-b);
                break;
            case "3":
                System.out.printf("Phép cộng: %d x %d = %d\n",
                        a,b,a*b);
                break;
            case "4":
                System.out.printf("Phép cộng: %d : %d = %d\n",
                        a,b,a/b);
                break;
            default:
                System.out.println("Chức năng bạn chọn không tồn tại");
        }

    }
}
