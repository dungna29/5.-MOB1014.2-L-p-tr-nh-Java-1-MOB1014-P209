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
/*
  1. Lớp abstract là 1 lớp cha và giống như các lớp cha đã học.
  2. 1 lớp abstract thì phải có phương thức abstract
*/
public abstract class ClassCha {
  private String thuocTinh1;
  private String thuocTinh2;
  private String thuocTinh3;

  public ClassCha() {
  }

  public ClassCha(String thuocTinh1, String thuocTinh2, String thuocTinh3) {
    this.thuocTinh1 = thuocTinh1;
    this.thuocTinh2 = thuocTinh2;
    this.thuocTinh3 = thuocTinh3;
  }

  public String getThuocTinh1() {
    return thuocTinh1;
  }

  public void setThuocTinh1(String thuocTinh1) {
    this.thuocTinh1 = thuocTinh1;
  }

  public String getThuocTinh2() {
    return thuocTinh2;
  }

  public void setThuocTinh2(String thuocTinh2) {
    this.thuocTinh2 = thuocTinh2;
  }

  public String getThuocTinh3() {
    return thuocTinh3;
  }

  public void setThuocTinh3(String thuocTinh3) {
    this.thuocTinh3 = thuocTinh3;
  }
  
  //
  void method1(){
    //Có body code
  }
  //abstract method không có body code
  abstract void method2();
  abstract void method3();
  abstract void method4();
}
