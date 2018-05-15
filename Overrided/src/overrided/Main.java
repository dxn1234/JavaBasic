/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overrided;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        // khai báo đối tượng của lớp Superclass
        Superclass superclass = new Superclass();
         
        // khai báo đối tượng có bản chất là Superclass
        // nhưng đóng vai trò là 1 Subclass
        // vì vậy sẽ chạy những hàm của Subclass
        Superclass subclass = new Subclass();
         
        // gọi phương thức hienThi() của lớp cha
        superclass.hienThi();
         
        // gọi phương thức hienThi() của lớp con
        subclass.hienThi();
    }
}
