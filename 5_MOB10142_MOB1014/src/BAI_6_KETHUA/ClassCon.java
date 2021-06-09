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
  1. Sử dụng từ khóa extends để kế thừa
  2. Trong java/php/csharp chỉ cho phép đơn kế thừa
  3. Khi kế thừa thì được thừa hưởng lại các thuộc tính và phương thức của lớp cha.
  4. Lớp con sẽ triển khai các thuộc tính đặc trưng riêng của đối tượng.
*/
public class ClassCon extends ClassCha{
  private String thuocTinhRieng1;
  private String thuocTinhRieng2;

  public ClassCon() {
  }

  public ClassCon(String thuocTinhRieng1, String thuocTinhRieng2, String id, String ten, String ho, String tenDem, String sdt, String email) {
    super(id, ten, ho, tenDem, sdt, email);
    this.thuocTinhRieng1 = thuocTinhRieng1;
    this.thuocTinhRieng2 = thuocTinhRieng2;
    //this: DÙng để tham chiếu thuộc tính và phương thức lớp hiện tại
    //super: DÙng để tham chiếu thuộc tính và phương thức lớp cha
  }

  public String getThuocTinhRieng1() {
    return thuocTinhRieng1;
  }

  public void setThuocTinhRieng1(String thuocTinhRieng1) {
    this.thuocTinhRieng1 = thuocTinhRieng1;
  }

  public String getThuocTinhRieng2() {
    return thuocTinhRieng2;
  }

  public void setThuocTinhRieng2(String thuocTinhRieng2) {
    this.thuocTinhRieng2 = thuocTinhRieng2;
  }
  //Kế thừa phương thức của lớp cha alt + insert = override method
  //Đối với loại lớp cha thường thì có thể kế thừa phương thức hoặc không
  //Khi kế thừa phương thức của lớp cha gọi là ghi đè phương thức (Lớp con có toàn quyền code lại bên trong phương thức mà nó kế thừa từ lớp cha)
  
  @Override
  public void method3(String temp) {
    //super.method3(temp); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Đây lã text method3 ở class con");
    System.out.println("Class con muốn thay đổi hành động?");
  }
  
}
