/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Der Mods
 */
public class CartView {
    private int idSP;
    private String tenSP;
    private String hinhSP;
    private int giaSP;
    private int soLuong;

    public CartView() {
    }

    public CartView(int idSP, String tenSP, String hinhSP, int giaSP, int soLuong) {
        this.idSP = idSP;
        this.tenSP = tenSP;
        this.hinhSP = hinhSP;
        this.giaSP = giaSP;
        this.soLuong = soLuong;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHinhSP() {
        return hinhSP;
    }

    public void setHinhSP(String hinhSP) {
        this.hinhSP = hinhSP;
    }

    public int getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(int giaSP) {
        this.giaSP = giaSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "CartView{" + "idSP=" + idSP + ", tenSP=" + tenSP + ", hinhSP=" + hinhSP + ", giaSP=" + giaSP + ", soLuong=" + soLuong + '}';
    }
    

    
}
