/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_LAMQUENVOIJAVA;

/**
 *
 * @author Dungna29
 */
public class B2_BienLaGi {

    /*
        Bài 2: Khái niệm về biến và khai báo biến
    1. Khái niệm: Lưu trữ giá trị hoặc tập giá trị và biến được khởi tạo trong bộ
    nhớ ảo của máy (RAM) khi mà chương trình chạy.
    
    2. Công thứ khai báo biến: 
            <Kiểu dữ liệu> <Tên biến> = <Giá trị>;
            <Kiểu dữ liệu> <Tên biến 1> = <Giá trị>, <Tên biến 1> = <Giá trị>,<Tên biến n> = <Giá trị>;
            Có thể khai báo nhiều biến có kiểu dữ liệu giống nhau trên cùng 1 dòng
        2.1: <Kiểu dữ liệu>
            + Kiểu số nguyên:byte, short, long, int
            + Kiểu số thực:float, double
            + Kiểu chuỗi và ký tự: String, char
            + Kiểu Logic: boolean
            + Kiểu var: tự định nghĩa theo giá trị
        2.2: <Tên biến>
            + Tên biến phải có nghĩa
            + Tên biến nên là tiếng anh 
            + Tên biến có phân biết chữ hoa chữ thường: tuoi & Tuoi
            + Tên biến không bắt đầu bởi số và từ khóa: 1Tuoi + Từ khóa là tất cả  các Ctrl + space
            + Đối với tên biến có 2 từ trở lên:
                - Cách 1: normal = firstname
                - Cách 2: CamelCase = FirstName, firstName
                - Cách 3: Under_Score = first_name, first_Name
            + Biến toàn cục: Khai báo ngoài hàm, phương thức
                - Bắt buộc phải khai báo có dấu gạch dưới _ trước tên biến:
                Ví dụ: _first_Name, _firstname
            + Biến cục bộ: Khai báo bên trong hàm, phương thức
        2.2: <Giá trị>: Phải đúng với quy tắc của kiểu dữ liệu.
    
        
     */
    //Khai báo biến toàn cục nằm bên ngoài hàm
   static int _a;

    public static void main(String[] args) {
       //Kiểu char - ký tự - lưu trữ được 1 ký tự
       char c1 = '5';
       char c2 = 'a';
       char c3 = '%', c4 = 'b',c5;

       //Kiểu chuỗi - tập hợp các ký tự ghép lại
       String name = "FPOLY";//Khởi tạo 1 biến name có kiểu dữ liệu String có khởi tạo giá trị ban đầu
       String phone;//Khởi tạo 1 biến có kiểu dữ liệu String và không khởi tạo giá trị ban đầu
       String firstName,lastname, school = "Fpoly";
       String year = "2021";
       
       //Kiểu số nguyên
       int namsinh = 2000, namHienTai;
       
       //Kiểu số thực
       double diemJava1 = 4.9;
       
       //Kiểu logic
       boolean logic1 = true;
       boolean logic2 = false;
        
       //Kiểu var
       var name1 = "Hoàng";// Name  = string
       var namSinh1 = 1999;//namSinh1 = int
       var logic3 = true;//logic3 = boolean
       var diemCsharp = 5.6;// double
       //var abc;//Không sử dụng được kiểu dữ liệu var khi không khởi tạo ngay giá trị ban đầu
        
       /*
        Bài 1: Khai báo mỗi kiểu dữ liệu 1 lần và in kết quả ra màn hình
        bằng câu lệnh sout + tab.
        ctrl + shilft + Mũi tên lên xuống để copy nhanh 1 dòng code
        */
        
      
    }

}
