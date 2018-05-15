/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        PhepCongHaiSo test = new PhepCongHaiSo();
        System.out.println("Tổng = " + test.add(11, 12));
        System.out.println("Tổng = " + test.add(11, 12, 13));
    }
}
