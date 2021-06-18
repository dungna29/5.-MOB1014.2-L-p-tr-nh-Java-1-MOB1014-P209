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
public class Main {

  public static void main(String[] args) {
    //Khi sử dụng vẫn gọi các phương thức của lớp cha hoàn toàn bình thường.
    ClassCon classCon1 = new ClassCon();
    classCon1.setId("");
    classCon1.setTen("");
    classCon1.setThuocTinhRieng1("");
    classCon1.setThuocTinhRieng2("");
//    ClassCon classCon2 = new ClassCon(thuocTinhRieng1, thuocTinhRieng2, id, ten, ho, tenDem, sdt, email);

    //Ghi đè phương thức khi kế thừa
    ClassCha classCha1 = new ClassCha();
    classCha1.method3("FPT",21);
    ClassCon classCon3 = new ClassCon();
    classCon3.method3("FPT",21);
     
  }
}
