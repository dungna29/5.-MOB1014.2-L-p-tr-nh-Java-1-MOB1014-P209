/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_4_Array_ArrayList_List;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dungna29
 */
public class B6_List {
    /*
    Bài List
        - Định nghĩa: List Interface trong Java kế thừa Collection và nó cung cấp các phương thức 
                      để thao tác với các phần tử trong danh sách.
    
        + Phương thứ List    
                    - void add(int index, Object obj) || add(object value) Chèn obj vào trong List đang gọi tại index đã cho. 
                        Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm chèn bị bỏ qua. Vì thế, 
                        không có phần tử nào bị ghi đè.
                    - boolean addAll(int index, Collection c)	Chèn tất cả phần tử của c vào trong List
                        đang gọi tại chỉ mục đã cho. Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm
                        chèn bị bỏ qua. Vì thế, không có phần tử nào bị ghi đè. Trả về true nếu List đang gọi
                        thay đổi và nếu không trả về false.
                    - object get(int index)	Trả về đối tượng được lưu giữ tại index đã 
                        cho bên trong Collection đang gọi.
                    - int indexOf(Object obj)	Trả về index của sự xuất hiện đầu tiên của obj trong List đang gọi.
                        Nếu obj không là một phần tử trong list, -1 được trả về.
                    - int lastIndexOf(Object obj) Trả về index của sự xuất hiện đầu tiên của obj trong List 
                        đang gọi. Nếu obj không là một phần tử trong list, -1 được trả về
                    - ListIterator listIterator()	Sử dụng để trả về một Iterator mà bắt đầu từ phần 
                        tử đầu tiên của list.
                    - ListIterator listIterator(int index)	Sử dụng để trả về một Iterator mà phần tử bắt 
                        đầu từ chỉ số index chỉ định.
                    - object remove(int index)	Gỡ bỏ phần tử tại index từ List đang gọi và trả về phần tử 
                        bị xóa đó. List kết quả được compact lại. Đó là, các chỉ mục của dãy phần tử phụ bị 
                        lượng giảm đi 1.
                    - object set(int index, Object obj)	Gán obj tới vị trí được xác định bởi index bên trong 
                        List đang gọi.
                    - List subList(int start, int end)	Trả về một list mà bao gồm các phần tử từ start tới 
                        end-1 trong List đang gọi. Các phần tử trong list trả về cũng được tham chiếu bởi đối
                        tượng đang gọi.                        
    */
    public static void main(String[] args) {
        //1. Khởi tạo ArrayList không định kiểu và có định kiểu

        //      - ArrayList không định kiểu
        List lstKhongDinhKieu = new ArrayList();
        List lstKhongDinhKieu1;
        lstKhongDinhKieu1 = new ArrayList();

        //      - ArrayList định kiểu
        List<Integer> lstKieuSoNguyen = new ArrayList<Integer>();
        List<Double> lstKieuSoThuc = new ArrayList<Double>();
        List<String> lstKieuChuoi = new ArrayList<String>();

        //2. Gán giá trị
        //      - ArrayList không định kiểu
        lstKhongDinhKieu.add(1);
        lstKhongDinhKieu.add("FPT POLY");
        lstKhongDinhKieu.add(8.6);
        lstKhongDinhKieu.add(true);
        lstKhongDinhKieu.add(0, 5);//Ghi đè giá trị tại vị trí
        
        //Khi add thêm số nguyên thủy thì tự động chuyển sang đối tượng kiểu wrapper Double Interge
        //Khi truy xuất các phần tử, cần ép về kiểu gốc của phần tử để xử lý
        Double diem = (Double) lstKhongDinhKieu.get(2);
        diem = Double.valueOf(diem);
        //Lỗi không ép kiểu được
        //double diem = arrLstKhongDinhKieu.get(2); 
        //double diem = (double)arrLstKhongDinhKieu.get(2); 
                

        //      - ArrayList định kiểu
        lstKieuChuoi.add("B");
        lstKieuChuoi.add("C");
        lstKieuChuoi.add("A");

        //3. Lấy giá trị
        System.out.println(lstKhongDinhKieu.get(0));

        for (int i = 0; i < lstKhongDinhKieu.size(); i++) {
            System.out.println(lstKhongDinhKieu.get(i));
        }

        for (var x : lstKieuChuoi) {
            System.out.println(x);
        }
        //4. Một vài ví dụ về các phương thức
        
        //isEmpty() kiểm tra xem list có rỗng hay không
        System.out.println(lstKieuChuoi.isEmpty());
        //Collections.sort - chú ý chữ s và dùng để sắp xếp từ bé đến lớn
        Collections.sort(lstKieuChuoi);
        System.out.println("-------- sort");
        for (var x : lstKieuChuoi) {
            System.out.println(x);
        }
        //Collections.reverse - Đảo ngược danh sách
        Collections.reverse(lstKieuChuoi);       
        System.out.println("-------- reverse");
        for (var x : lstKieuChuoi) {
            System.out.println(x);
        }
       
    }
  
}
