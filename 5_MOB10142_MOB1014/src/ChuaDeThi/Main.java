/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuaDeThi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DungnaPC
 */
public class Main {

  //Khai báo các biến toàn cục ở đây
  Scanner _sc = new Scanner(System.in);
  SinhVien _SinhVien;//Khai báo đối tượng sinh viên
  String _input;//Khai báo 1 biến để lưu trữ người dùng nhập vào
  List<SinhVien> _lstSinhVien = new ArrayList<>();//Khai báo List đối tượng

  public static void main(String[] args) {
    Main main = new Main();
    do {
      main.TestAnhChiEm();
    } while (true);

  }

  void addNhieu() {
    do {
      System.out.print("Mời bạn nhập số lượng sv muốn thêm: ");
      _input = _sc.nextLine();
      for (int i = 0; i < Integer.parseInt(_input); i++) {
        _SinhVien = new SinhVien();
        System.out.print("Mời bạn nhập mã: ");
        _SinhVien.setMsv(_sc.nextLine());
        System.out.print("Mời bạn nhập ngành học: ");
        _SinhVien.setNganhHoc(_sc.nextLine());
        System.out.print("Mời bạn nhập email: ");
        _SinhVien.setEmail(_sc.nextLine());
        System.out.print("Mời bạn nhập năm sinh: ");
        _SinhVien.setNamSinh(Integer.parseInt(_sc.nextLine()));        
      }
      System.out.println("Bạn có muốn n_SinhVienhập tiếp hay không? 1: Có | 2: Không");
      _input = _sc.nextLine();
    } while (_input.equals("1"));
  }

  void xuatds() {
    System.out.println(_lstSinhVien.size());
    for (SinhVien x : _lstSinhVien) {
      x.inRaManHinh();
    }
  }

  void TestAnhChiEm() {
    ClassThongTin c = new ClassThongTin();
    System.out.println("");
    System.out.print("Mời bạn nhập tên: ");
    c.setTen(_sc.nextLine());
    System.out.print("Mời bạn nhập năm sinh: ");
    c.setNamSinh(Integer.parseInt(_sc.nextLine()));
    System.out.print("Mời bạn nhập giới tính:  1 - nam | 2 Nữ: ");
    c.setGioiTinh(Integer.parseInt(_sc.nextLine()));
    c.inRaManHinh();
  }
}
