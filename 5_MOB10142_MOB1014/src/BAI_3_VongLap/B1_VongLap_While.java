/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_3_VongLap;

/**
 *
 * @author Dungna29
 */
public class B1_VongLap_While {

    /*
         * BàiVòng lặp:
         *
         * Định nghĩa chung cho tất cả vòng lặp:
         * Vòng lặp cho phép lặp lại một hoặc nhiều câu lệnh cho đến khi thỏa mãn 
            điều kiện được chỉ định định.
         *
         * Các loại vòng lặp: while, do..while, for, foreach
         *
         * Từ khóa sử dụng trong vòng lặp:
         *
         * break - ngắt vòng lặp
         * continue: Sẽ bỏ qua các đoạn code phía sau nó và nó quay trở lại lần 
           lặp tiếp theo.
         *
         * Vòng lặp while: Chỉ chạy khi điều kiện luôn đúng và nếu điều kiện luôn đúng 
           ko điểm dừng thì được gọi là vòng lặp vô hạn.
         * + Cách dùng: wh + tab
         *
         * + Công thức:
         *  while (true)
            {
                //Thực thi 1 câu lệnh hoặc nhiều câu lệnh
            }
     */
    public static void main(String[] args) {
        int a = 0;
        while (a <= 5) {
            System.out.println(a);
            if (a == 4) {
                break;
            }            
            System.out.println("Đây là vòng lặp while chạy 5 lần " + a);
            a++;//tăng lên một để sớm đạt đến điều kiện ngắt vòng lặp            
        }
        
        
        //Dưới đây là vòng lặp vô hạn vì While luôn đúng.
//        while (true) {
//            System.out.println("Đây là vòng lặp vô hạn");
//        }
    }
}
