/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_5_OOP_LapTrinhHuongDoiTuong;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B2_Method_PhuongThucKhongTraVe {

  /*
         *  Bài Hàm -Phương thức - Method
         *  Định nghĩa: 1 tập các câu lệnh cùng nhau thực hiện 1 tác vụ nào đó.
         *  LỢI ÍCH: - Giúp quản lý code tốt hơn
         *           - Tái sử dụng
         *
         *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
         *  }
    
         * <Phạm vi truy cập> - Access Modifier:Public,Private,Protected, Default
         *
         * <Kiểu trả về> : có 2 kiểu trả về và không trả về
         *          - Kiểu không trả về: void
         *          - Kiểu trả về: là giá trị(int,string,double....) hoặc tập giá trị(Array,List.....) hoặc đối tượng(class) và còn nhiều kiểu khác.
         *
         * <Tên phương thức>: Tên động từ viết thường hoặc hoa chữ cái đầu 
         * <Danh sách tham số>: Phương thức có thể có tham hoặc không tham số và lưu ý khi sử dụng tham số thì khi gọi phương thức thì phải truyền đúng vị trí của tham số.
   */
  public static void main(String[] args) {
    //1. Sử dụng dụng phương thức cần phải biết tên phương thức
    //2. Nếu phương thức có tham số truyền đúng vị trí và kiểu dữ liệu
    phepTinhCong1();
    phepTinhCong2(5, 6);
    phepTinhCong2(9, 10);

    //3. Khi gọi các phương thức sử dụng nạp chồng chỉ cần truyền tham số lượng tham số là sẽ gọi đúng phương thức cần.
    phepTinhNhan();
    phepTinhNhan(5, 5, 5, 5);
    
  
  }

  //Phần 1: Phương thức không trả về không tham số
  public static void phepTinhCong1() {
    int a = 6, b = 9;
    System.out.println("a + b = " + (a + b));
  }

  //Phần 2: Phương thức không trả về có tham số
  public static void phepTinhCong2(int a, int b) {
    System.out.println("a + b = " + (a + b));
  }

  //Nạp chồng phương thức (Về đọc thêm trong file lý thuyết)
  public static void phepTinhNhan() {
    int a = 6, b = 9;
    System.out.println("a x b = " + (a * b));
  }

  public static void phepTinhNhan(int a, int b) {
    System.out.println("a x b = " + (a * b));
  }

  public static void phepTinhNhan(int a, int b, int c) {
    System.out.println("a x b x c= " + (a * b * c));
  }

  public static void phepTinhNhan(int a, int b, int c, int d) {
    System.out.println("a x b x c x d= " + (a * b * c * d));
  }

  //Phần 3: Có rất nhiều kiểu dữ liệu của tham số
  public static void method1(int a, SinhVien sv, int[] arrs, List<String> lst) {

  }
}
