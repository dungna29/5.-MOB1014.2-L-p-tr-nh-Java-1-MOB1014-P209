/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_ToanTu_CauLenhReNhanh;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class BAI_TAP_LAB1 {
    /* 
    Bài 2: ĐƯa 2 bài vào switch case triển khai
        2.1 Viết 1 chương trình đánh giá tình trạng học lực của sinh viên POLY sau khi thi. Yêu cầu sinh viên nhập vào các
    thông tin sau: Số buổi nghỉ, Điểm trung bình môn, Điểm thi. Sau khi sinh viên nhập xong in ra màn hình tình
    trạng sinh viên dựa vào điều kiện sau. Nếu Số buổi nghỉ <= 4 và Điểm trung bình môn >=5 và Điểm thi >=5. Thì
    chúc mừng sinh viên đó đã qua môn. Còn nếu ngược lại cả 3 điều kiện trên thì phải học lại môn JAVA 1.
        2.2 Viết 1 chương trình tính tuổi người yêu cũ và bản thân mình. Yêu cầu người sử dụng nhập vào năm sinh của bản thân
    và năm sinh của người yêu cũ. Sau khi nhập xong 2 thông tin này hãy tính ra số tuổi của 2 người in ra màn hình và in ra
    2 người cách nhau bao nhiêu tuổi.
    */
    
    public static void main(String[] args) {
        int namSinhBanThan,namSinhNYCu,tuoiBanThan,tuoiNY;
        Scanner sc = new Scanner(System.in);        
        do {            
            System.out.println("Mời bạn nhập năm sinh chính bạn: ");
            namSinhBanThan = Integer.parseInt(sc.nextLine());
            System.out.println("Mời bạn nhập năm sinh NY cũ: ");
            namSinhNYCu = Integer.parseInt(sc.nextLine());
            System.out.println("Tuổi bạn là: " + (2021 - namSinhBanThan));
            System.out.println("Tuổi NY cũ là: " + (2021 - namSinhNYCu));
            tuoiBanThan = 2021 - namSinhBanThan;
            tuoiNY = 2021 - namSinhNYCu;
            if (tuoiBanThan < tuoiNY) {
                int temp = tuoiBanThan;
                tuoiBanThan = tuoiNY;
                tuoiNY = temp;
            }
            System.out.println("Tuổi bản thần và NY cũ cách nhau: "+
            (tuoiBanThan - tuoiNY));
        } while (true);
        
    }
}
