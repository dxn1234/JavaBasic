/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourprincipleofoop;

/**
 *
 * @author Administrator
 */
public class Nguoi {
    private String cmnd;
    private String hoTen;

    public Nguoi() {
    }

    public Nguoi(String cmnd, String hoTen) {
        this.cmnd = cmnd;
        this.hoTen = hoTen;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
}
