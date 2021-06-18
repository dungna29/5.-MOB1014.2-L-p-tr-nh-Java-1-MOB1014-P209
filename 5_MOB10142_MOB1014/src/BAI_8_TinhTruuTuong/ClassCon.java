/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_8_TinhTruuTuong;

/**
 *
 * @author DungnaPC
 */
// Khi kế thừa lớp abstract thì sẽ phải kế thừa tất cả các phương thức abstract
public class ClassCon extends ClassCha{
 private String thuocTinhCon;

  public ClassCon() {
  }

  public ClassCon(String thuocTinhCon, String thuocTinh1, String thuocTinh2, String thuocTinh3) {
    super(thuocTinh1, thuocTinh2, thuocTinh3);
    this.thuocTinhCon = thuocTinhCon;
  }

  public String getThuocTinhCon() {
    return thuocTinhCon;
  }

  public void setThuocTinhCon(String thuocTinhCon) {
    this.thuocTinhCon = thuocTinhCon;
  }

 
 
  @Override
  void method2() {
   
  }

  @Override
  void method3() {
   
  }

  @Override
  void method4() {
   
  }
  
}
