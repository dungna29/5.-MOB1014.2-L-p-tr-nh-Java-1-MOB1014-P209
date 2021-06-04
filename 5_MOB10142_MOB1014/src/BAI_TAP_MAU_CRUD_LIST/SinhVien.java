/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_LIST;

import BAI_5_OOP_LapTrinhHuongDoiTuong.*;

/**
 *
 * @author Dungna29
 */

public class SinhVien {
    private String msv;
    private String nganhHoc;
    private int namSinh;
    private String email;
    private String truongHoc = "FPT";    
   
    public SinhVien() {
        
    }   
    public SinhVien(String msv1, String nganhHoc, int namSinh, String email) {
        msv = msv1;
        this.nganhHoc = nganhHoc;
        this.namSinh = namSinh;
        this.email = email;
       
    }
       
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
    
    public void inRaManHinh(){
        System.out.printf("Hello %s | %s | %s | %d | %s \n",msv,nganhHoc,email
        ,namSinh,truongHoc);
    }
    
}
