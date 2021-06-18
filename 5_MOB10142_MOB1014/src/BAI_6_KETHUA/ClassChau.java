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
public class ClassChau extends ClassCon{
  private String thuocTinhChau;

  public ClassChau() {
  }

  public ClassChau(String thuocTinhChau, String thuocTinhRieng1, String thuocTinhRieng2, String id, String ten, String ho, String tenDem, String sdt, String email) {
    super(thuocTinhRieng1, thuocTinhRieng2, id, ten, ho, tenDem, sdt, email);
    this.thuocTinhChau = thuocTinhChau;
  }

  public String getThuocTinhChau() {
    return thuocTinhChau;
  }

  public void setThuocTinhChau(String thuocTinhChau) {
    this.thuocTinhChau = thuocTinhChau;
  }

  @Override
  public void method3(String temp, int a) {
    
    
  }

  @Override
  public void method2(String temp) {
    super.method2(temp); //To change body of generated methods, choose Tools | Templates.
  }
  
  
}
