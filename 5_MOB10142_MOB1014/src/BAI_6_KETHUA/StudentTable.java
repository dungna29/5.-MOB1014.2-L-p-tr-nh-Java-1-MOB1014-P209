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
@interface Table {

  public String value();
}

@interface Field {

  public String value();
}

public class StudentTable {

  @Table(value = "SinhViens")//Định nghĩa bảng sinh viên có tên và thuộc tính phía dưới
  public class SinhVien {

    @Field(value = "MaSV")
    private String Msv;

    @Field(value = "TenSv")
    private String TenSv;
  }
}
