/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_8_TinhTruuTuong;

import java.util.List;

/**
 *
 * @author DungnaPC
 */
public interface IStudentService {
  //Trong interface phương thức không có body code
  //Ko được sử dụng private
  //Mặc định cá phương là public
  
  void add(ClassCon classCon);
  void edit(ClassCon classCon);
  int remove(int ID);
  ClassCon find(int ID);
  List<ClassCon> getLst();
}
