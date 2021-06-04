/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DungnaPC
 */
//Không có main ở đây và đây là nơi code chức năng
public class SinhVienService {

  //Khai báo các biến toàn cục ở đây
  Scanner _sc = new Scanner(System.in);
  SinhVien _SinhVien;//Khai báo đối tượng sinh viên
  String _input;//Khai báo 1 biến để lưu trữ người dùng nhập vào
  List<SinhVien> _lstSinhVien;//Khai báo List đối tượng

  public SinhVienService() {
    _lstSinhVien = new ArrayList<>();
  }

  void them1SinhVien() {
    //Để thêm sinh viên cần khởi tạo đối tượng
    _SinhVien = new SinhVien();
    System.out.print("Mời bạn nhập mã: ");
    _SinhVien.setMsv(_sc.nextLine());
    System.out.print("Mời bạn nhập ngành học: ");
    _SinhVien.setNganhHoc(_sc.nextLine());
    System.out.print("Mời bạn nhập email: ");
    _SinhVien.setEmail(_sc.nextLine());
    _SinhVien.setNamSinh(Integer.parseInt(getValueInput("Năm sinh")));
    _SinhVien.inRaManHinh();
  }

  void themNhieuSinhVien() {
    System.out.print("Mời bạn nhập số lượng sv muốn thêm");
    _input = _sc.nextLine();
    for (int i = 0; i < Integer.parseInt(_input); i++) {
      _SinhVien = new SinhVien();//Phải khởi tạo đối tượng ở đây
      System.out.print("Mời bạn nhập mã: ");
      _SinhVien.setMsv(_sc.nextLine());
      System.out.print("Mời bạn nhập ngành học: ");
      _SinhVien.setNganhHoc(_sc.nextLine());
      System.out.print("Mời bạn nhập email: ");
      _SinhVien.setEmail(_sc.nextLine());
      _SinhVien.setNamSinh(Integer.parseInt(getValueInput("Năm sinh")));
      //Sau khi nhập xong đối tượng thì cần add đối tượng vào LIST
      _lstSinhVien.add(_SinhVien);
    }
  }

  //Khám phá cách áp dụng cái phương thức trả về
  String getValueInput(String text) {
    System.out.println("Mời bạn nhập " + text + " :");
    return _sc.nextLine();
  }

}
