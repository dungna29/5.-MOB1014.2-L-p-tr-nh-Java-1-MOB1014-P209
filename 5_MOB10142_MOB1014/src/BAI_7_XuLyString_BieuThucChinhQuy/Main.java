package BAI_7_XuLyString_BieuThucChinhQuy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DungNAPC
 */
public class Main {

    public static void main(String[] args) {
        String name = "Hoa FPT";
        System.out.println(name.length());//Độ dài chuỗi
        System.out.println(name.equals("hoa"));//So sánh tuyệt đối
        System.out.println(name.equalsIgnoreCase("hoa"));//So sánh không phân biệt hoa thường
        System.out.println(name.charAt(0));
        System.out.println(name.substring(1));
        System.out.println(name.substring(2, 4));
        System.out.println(checkSo("a"));
    }
    public static boolean checkSo(String text){
      Pattern pattern = Pattern.compile("\\d");
      Matcher matcher = pattern.matcher(text);
      return matcher.matches();//Nếu đúng là true mà nếu sai là false    
    }
    
}
