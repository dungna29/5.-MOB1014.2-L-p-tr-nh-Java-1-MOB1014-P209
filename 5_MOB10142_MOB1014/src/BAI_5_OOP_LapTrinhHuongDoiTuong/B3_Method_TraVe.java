package BAI_5_OOP_LapTrinhHuongDoiTuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dungna29
 */
public class B3_Method_TraVe {

  /*
         * Method trả về công thức và định nghĩa ở bên B2
         *
         * Định nghĩa: phương thức trả về bắt buộc phải trả về 1 giá trị hoặc 1 tập giá trị, đối tượng.... tương ứng với kiểu dữ liệu của phương thức.
   */
  public static void main(String[] args) {
    //1. Phải biết tên phương thức
    //2. Phương thức trả là 1 giá trị hoặc 1 tập giá trị
    int a = tinhTong();
    
    //Muốn in 1 giá trị thì phải sử dụng sout + tab
    System.out.println(tinhTong() + 10);
   
    for (int i = 0; i < getNames().length; i++) {
      System.out.println(getNames()[i]);
    }
  }
  //Phần 1: Phương thức trả về không tham số
  public static int tinhTong() {//int ở đây là kiểu dữ liệu của phương thức
    int a = 5, b = 6;
    return a + b;//Phải trả về đúng kiểu dữ liệu
  }
  public static String[] getNames(){
    String[] arrNames = {"A","B","C"};
    return arrNames;//Trả về 1 mảng
  }

  //Phương thức trả về có tham số tương tự như bên không trả về void
}
