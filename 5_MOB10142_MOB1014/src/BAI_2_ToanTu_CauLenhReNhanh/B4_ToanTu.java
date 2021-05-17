/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_ToanTu_CauLenhReNhanh;

/**
 *
 * @author Dungna29
 */
public class B4_ToanTu {
    /*
         * 4 Loại toán tử trong lập trình
         *  1. Toán tử số học:
         *  (+ - * / % ++ --)
         *      +: Tính tổng của 2 số hoặc dùng để cộng chuỗi
         *      -: Phép trừ của 2 số
         *      *: Phép nhân của 2 số
         *      %: Phép chia lấy dư của 2 số
         *      ++: Tăng lên 1 đơn vị
         *      --: Giảm 1 đơn vị
         *  2. Toán tử so sánh:
         *  (> < >= <= == !=)
         *      >: Lớn hơn
         *      <: nhỏ hơn
         *      >=: lớn hơn hoặc bằng
         *      <=: nhỏ hơn hoặc bằng
         *      ==: so sánh bằng
         *      !=: so sánh khác
         *  3. Toán tử Logic: dùng để nối mệnh đề
         * (&& || !)
         *      &&: Yêu cầu các mệnh đề phải luôn đúng
         *      ||: Yêu cầu 1 trong các mệnh đề dúng là được
         *      !: Lấy giá trị phủ định của mệnh đề.
         *  4. Toán tử gán:
         * (= += -= *= /= %=) 
         *      +=: Cộng tiếp với vế bên phải các phép còn lại tương tự
         */
    
    
    
    
    public static void main(String[] args) {
        //Phần 1: Toán tử số học
        System.out.println("Toán tử %: 9%2 = " + (9%2));
        int a = 10;
        a++;//Tăng lên 1 đơn vị
        ++a;
        System.out.println("Toán tử ++: a = " + a);
        a--;//Giảm đi 1 đơn vị
        --a;
        System.out.println("Toán tử --: a = " + a);
        
        //Phần 2: Toán tử so sánh
        System.out.println("5 > 6 = " + (5>6));
        System.out.println("5 <= 6 = " + (5<=6));
        System.out.println("10 >= 10 = " + (10>=10));
        System.out.println("10 == 10 = " + (10==10));
        System.out.println("10 != 10 = " + (10!=10));
        
        //Phần 3: Toán từ logic
        double diemThiJava = 4.9;
        int nghi = 3;    
        //&& thì yêu cầu tất cả mệnh đề phải đúng
        boolean kq = diemThiJava >= 5 && nghi <=4;
        System.out.println("Bạn có phải học lại hay không: "
                + kq);
        //|| thì yêu cầu 1 trong các mệnh đúng thì sẽ đúng
        kq = diemThiJava >= 5 || nghi <=4;
          System.out.println("Bạn có phải học lại hay không: "
                + kq);
        //! Phủ định
       System.out.println("!(10 == 10) = " + !(10==10));
       
       
       //Phần 4: Toán tử gán
       int temp;
       temp = 5;//Sử dụng toán tử gán để gán giá trị cho biến
       temp = temp + temp;//temp = 10
       temp += temp;//Sử dụng toán tử += tương tự như cách trên
        System.out.println(temp);
       
    }
}
