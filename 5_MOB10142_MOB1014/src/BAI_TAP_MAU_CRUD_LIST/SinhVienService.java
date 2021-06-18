/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

  void timKiemSV() {
    System.out.println("Mời bạn nhập msv: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _lstSinhVien.size(); i++) {
      if (_lstSinhVien.get(i).getMsv().equals(_input)) {
        _lstSinhVien.get(i).inRaManHinh();
        return;
      }
    }
    System.out.println("Sinh viên bạn cần tìm không tìm thấy");
  }

  void timKiemGanDung() {
    System.out.println("Mời bạn nhập sdt: ");
    _input = _sc.nextLine();
    boolean flag = true;
    for (int i = 0; i < _lstSinhVien.size(); i++) {
      if (_lstSinhVien.get(i).getMsv().startsWith(_input)) {
        _lstSinhVien.get(i).inRaManHinh();
        flag = false;
      }
    }
    if (flag) {
      System.out.println("Không tìm thấy số điện thoại gần đúng");
    }

  }

  void timKiemSVNangCao() {
    int temp = getIndex();
    if (temp == -1) {
      System.out.println("Sinh viên bạn cần tìm không tìm thấy");
      return;
    }
    _lstSinhVien.get(temp).inRaManHinh();
  }

  void xoaSV() {
    System.out.println("Mời bạn nhập msv: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _lstSinhVien.size(); i++) {
      if (_lstSinhVien.get(i).getMsv().equals(_input)) {
        _lstSinhVien.remove(i);
        System.out.println("Xóa thành công");
        return;
      }
    }
    System.out.println("Sinh viên bạn cần tìm không tìm thấy");
  }

  void suaSV() {
    System.out.println("Mời bạn nhập msv: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _lstSinhVien.size(); i++) {
      if (_lstSinhVien.get(i).getMsv().equals(_input)) {
        System.out.println("Menu thuộc tính cần sửa");
        System.out.println("1. Năm Sinh");
        System.out.println("2. Ngành Học");
        System.out.println("3. Email");
        System.out.println("4. Thoát");
        System.out.println("Mời bạn nhập chọn chức năng: ");
        _input = _sc.nextLine();
        switch (_input) {
          case "1":
            System.out.println("Mời bạn nhập lại năm sinh: ");
            _lstSinhVien.get(i).setNamSinh(Integer.parseInt(_sc.nextLine()));
            break;
          case "2":
            System.out.println("Mời bạn nhập lại Ngành Học: ");
            _lstSinhVien.get(i).setNganhHoc(_sc.nextLine());
            break;
          case "3":
            System.out.println("Mời bạn nhập lại Email: ");
            _lstSinhVien.get(i).setEmail(_sc.nextLine());
            break;
          default:
            System.out.println("Chức năng chọn không tồn tại");
        }
        return;
      }
    }
    System.out.println("Sinh viên bạn cần tìm không tìm thấy");
  }

  void sortSinhVien() {
//    Collections.sort(_lstSinhVien, new Comparator<SinhVien>() {
//      @Override
//      public int compare(SinhVien o1, SinhVien o2) {
//        //Sắp xếp xuôi của chuỗi
//        //return o1.getMsv().compareTo(o2.getMsv());
//        //Sắp xếp ngược của chuỗi
//        //return -o1.getMsv().compareTo(o2.getMsv());
//        if (o1.getNamSinh() > o2.getNamSinh()) {//Sắp xếp số
//          return 1;
//        }else{
//          return 1;
//        }       
//      }
//    });
    //Biểu thức lambda
    _lstSinhVien.sort((o1, o2) -> o1.getMsv().compareTo(o2.getMsv()));
    //_lstSinhVien.sort((o1,o2)->o1.getNamSinh()-o2.getNamSinh());
  }

  void inDanhSach() {//Lấy đc danh sách sinh viên in ra màn hình
    for (SinhVien x : _lstSinhVien) {
      x.inRaManHinh();
    }
  }

  //Khám phá cách áp dụng cái phương thức trả về dưới đây
  String getValueInput(String text) {
    System.out.println("Mời bạn nhập " + text + " :");
    return _sc.nextLine();
  }

  int getIndex() {
    System.out.println("Mời bạn nhập msv: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _lstSinhVien.size(); i++) {
      if (_lstSinhVien.get(i).getMsv().equals(_input)) {
        return i;
      }
    }
    return -1;
  }

  //Mảng đối tượng tham khảo
  public void BaiThamKhaoMangDoiTuong() {
    //Thêm đối tượng vào mảng
    SinhVien[] arrSV;
    System.out.print("Mời bạn nhập số lượng sv muốn thêm");
    _input = _sc.nextLine();
    arrSV = new SinhVien[Integer.parseInt(_input)];
    for (int i = 0; i < arrSV.length; i++) {
      arrSV[i] = new SinhVien();//Phải khởi tạo đối tượng ở đây
      System.out.print("Mời bạn nhập mã: ");
      arrSV[i].setMsv(_sc.nextLine());
      System.out.print("Mời bạn nhập ngành học: ");
      arrSV[i].setNganhHoc(_sc.nextLine());
      System.out.print("Mời bạn nhập email: ");
      arrSV[i].setEmail(_sc.nextLine());
      arrSV[i].setNamSinh(Integer.parseInt(getValueInput("Năm sinh")));
    }

    //In ds
    for (SinhVien x : arrSV) {
      x.inRaManHinh();
    }

    //Tìm kiếm
    System.out.println("Mời bạn nhập msv: ");
    _input = _sc.nextLine();
    for (int i = 0; i < arrSV.length; i++) {
      if (arrSV[i].getMsv().equals(_input)) {
        arrSV[i].inRaManHinh();
        return;
      }
    }
    System.out.println("Sinh viên bạn cần tìm không tìm thấy");
  }
}
