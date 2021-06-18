/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuaDeThi;

/**
 *
 * @author DungnaPC
 */
public class ClassThongTin {
  private int namSinhBanThan = 1999;
  private int gioiTinh;//1 = Nam && 2 Nữ
  private int namSinh;
  private String ten;

  public ClassThongTin() {
  }

  public ClassThongTin(int gioiTinh, int namSinh, String ten) {
    this.gioiTinh = gioiTinh;
    this.namSinh = namSinh;
    this.ten = ten;
  }

  public int getNamSinhBanThan() {
    return namSinhBanThan;
  } 

  public int getGioiTinh() {
    return gioiTinh;
  }

  public void setGioiTinh(int gioiTinh) {
    this.gioiTinh = gioiTinh;
  }

  public int getNamSinh() {
    return namSinh;
  }

  public void setNamSinh(int namSinh) {
    this.namSinh = namSinh;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }
  public void inRaManHinh(){
    //Nam lớn hơn = Anh
    //Nữ lớn hơn = Chị
    // Em và Bạn
    String temp = (gioiTinh == 1) && (namSinhBanThan > namSinh)?"Anh"
            :(gioiTinh == 2) && (namSinhBanThan > namSinh)?"Chị"
            :(namSinh == namSinhBanThan)?"Bạn":"EM";
    System.out.printf("Chào %s %s",temp,ten);
  }
}
