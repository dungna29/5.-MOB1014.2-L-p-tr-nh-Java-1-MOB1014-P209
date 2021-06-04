/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author Dungna29
 */
// 1. Lớp đối tượng phải là một danh từ
// 2. Tên lớp phải viết hoa chữ cái đầu của từ
public class SinhVien {
    //Phần 1: Khai báo tất cả các thuộc tính (Thông tin) mà đối tượng cần
    private String msv;
    private String nganhHoc;
    private int namSinh;
    private String email;
    private String truongHoc = "FPT";
    
    //Phần 2: Contructor khi mới học luôn có 2 Contructor
    /*
        - Tên Contructor phải giống với tên class và có từ khóa public
        - Khi khởi tạo đối tượng thì Contructor luôn là thành phần chạy đầu tiên
            trong class đối tượng đó.
        - Contructor không tham số dùng để khởi tạo đối tượng ko có giá trị ban đầu
        - Contructor có tham số dùng để khởi tạo đối tượng có giá trị ban đầu
    */
    // 2.1 Contructor không tham số: alt + insert hoặc chuột phải chọn Insert code
    public SinhVien() {
        
    }
    
    // 2.2 Contructor có tham số: Tương tự cách trên nhưng Select All Thuộc tính

    public SinhVien(String msv1, String nganhHoc, int namSinh, String email) {
        msv = msv1;
        this.nganhHoc = nganhHoc;
        this.namSinh = namSinh;
        this.email = email;
        //this dùng để tham chiếu đến thuộc tính hoặc phương thức của lớp hiện tại
    }
    
    //Phần 3: Getter và Setter: Chuột Phải chọn Insert Code
    /*
    Bởi các thuộc tính bị private nên phải sử dụng Getter và Setter để lấy giá trị
    và gán giá trị cho thuộc tính của đối tượng.
    */
    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTruongHoc() {
        return truongHoc;
    }

//    public void setTruongHoc(String truongHoc) {
//        this.truongHoc = truongHoc;
//    }
    
    //Phần 4: Các phương thức của đối tượng
    public void inRaManHinh(){
        System.out.printf("Hello %s | %s | %s | %d | %s \n",msv,nganhHoc,email
        ,namSinh,truongHoc);
    }
    
}
