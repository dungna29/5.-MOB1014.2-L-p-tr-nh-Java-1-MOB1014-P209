/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_3_VongLap;

/**
 *
 * @author DungNAPC
 */
public class ThucHanh {
    public static void main(String[] args) {
        /*
            Công thức học vòng lặp nói chung trừ foearch
            1. Vòng lặp phải luôn true thì mới chạy
            2. Vòng lặp cần có điểm bắt đầu
            3. Cần tăng bước nhẩy hoặc tác độc vào biến thày đổi
            Nếu không đảm bảo được 3 điều kiện trên vòng lặp sẽ thành vòng lặp vô hạn hoặc ko chạy
        */
        //1. for + tab        
//        for (int i = 0; i < 5; i++) {            
//            System.out.println("FPT JAVA " + i);            
//        }
        
        //2. wh + tab = while(true)
//        int i = 0;
//        while (i < 5) {
//            System.out.println("While đúng thì mới chạy");
//            i++;
//        }
        //3. do + tab = do...while(true)
//        int i = 0;
//        do {
//            System.out.println("While đúng thì mới chạy");
//            i++;
//        } while (i < 5);
        
        //Continue sẽ quay trở lại chuyển tiếp sang lần lặp tiếp theo
//        for (int i = 0; i < 5; i++) {      
//            if (i == 3) {
//                continue;
//                //Khit hỏa mãn điều kiện thì gặp continue sẽ chuyển tiếp sang lần chạy tiếp theo
//            }
//            System.out.println("Bạn đang sử dụng continue " + i );            
//        }
        
        // break ngắt vòng lặp, dừng vòng lặp
        for (int i = 0; i < 5; i++) {      
            if (i == 3) {
                break;
            }
            System.out.println("Bạn đang sử dụng break " + i );            
        }
    }
}
