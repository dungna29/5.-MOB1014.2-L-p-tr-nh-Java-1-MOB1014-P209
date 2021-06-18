/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_6_KETHUA;

/**
 *
 * @author DungnaPC
 */
/*
 1. Khi mới học Class cha sẽ là nơi chứa các thuộc tính chung của các đối tượng.
 2. Class cha cũng bình thường như bao class khác
 */
public class ClassCha {

  private String id;
  private String ten;
  private String ho;
  private String tenDem;
  private String sdt;
  private String email;

  public ClassCha() {
  }

  public ClassCha(String id, String ten, String ho, String tenDem, String sdt, String email) {
    this.id = id;
    this.ten = ten;
    this.ho = ho;
    this.tenDem = tenDem;
    this.sdt = sdt;
    this.email = email;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public String getHo() {
    return ho;
  }

  public void setHo(String ho) {
    this.ho = ho;
  }

  public String getTenDem() {
    return tenDem;
  }

  public void setTenDem(String tenDem) {
    this.tenDem = tenDem;
  }

  public String getSdt() {
    return sdt;
  }

  public void setSdt(String sdt) {
    this.sdt = sdt;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  private void method1(String temp) {

  }

  public void method2(String temp) {

  }

  public void method3(String temp, int a) {
    System.out.println("Đây là text từ method3 class cha");
  }
}

