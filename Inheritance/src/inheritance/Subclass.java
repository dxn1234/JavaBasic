/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Administrator
 */
public class Subclass extends Superclass{
     int number = 20;
 
     @Override
    public void hienThi() {
        System.out.println("Đây là phương thức hienThi() của lớp con");
    }
     
    public void subclassMethod() {
        Subclass subclass = new Subclass();
         
        // gọi phương thức hienThi() của lớp cha
        // sử dụng từ khóa super()
        super.hienThi();
         
        // gọi phương thức hienThi() của lớp con
        subclass.hienThi();
         
        // hiển thị giá trị biến number của lớp cha
        System.out.println("Giá trị biến number của lớp cha = " + super.number);
         
        // hiển thị giá trị biến number của lớp con
        System.out.println("Giá trị biến number của lớp con = " + subclass.number);
    }
 
 
    public static void main(String[] args) {
        Subclass objSubclass = new Subclass();
        objSubclass.subclassMethod();
    }
}
