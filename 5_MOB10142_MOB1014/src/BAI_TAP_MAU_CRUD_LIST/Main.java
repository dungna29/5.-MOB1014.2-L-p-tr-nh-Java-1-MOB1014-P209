/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_LIST;

/**
 *
 * @author DungnaPC
 */
public class Main {
  public static void main(String[] args) {
    //Là nơi các bạn tạo menu và không code chức năng bên này
    SinhVienService svs = new SinhVienService();
    svs.themNhieuSinhVien();
  }
}
